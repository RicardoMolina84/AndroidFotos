B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=12.5
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: True
    #StartCommandReturnValue: android.app.Service.START_STICKY
	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

	Dim FtpTest As FTP
	FtpTest.PassiveMode = True
	Dim noti As Notification
	Dim IdNotificacion As Int = 1 ' Identificador único para la notificación en primer plano.
	
	'######## APLICACION
	Private xui As XUI
	
	Dim ListaCompleta As List
	Dim ListaFotos As List
	Dim ListaVideos As List
	
'	Dim CantFotos As Int
'	Dim CantVideos As Int
'	Dim CantTotal As Int
	Dim CantEnCurso As Int
	
	Dim CantidadTotal As Int = 0 'CONTADOR
	Dim CantidadOk As Int = 0 'CONTADOR
	Dim CantidadFallidas As Int = 0 'CONTADOR
	
	Dim Awake As PhoneWakeState
	
	
	
	Type TipoOperacion (FotosCamara As Int, VideosCamara As Int, ImagenesWhatsApp As Int, VideosWhatsApp As Int)
	
	Dim Operacion As TipoOperacion
	Operacion.FotosCamara = 0
	Operacion.VideosCamara = 1
	Operacion.ImagenesWhatsApp = 2
	Operacion.VideosWhatsApp = 3

	Dim const PathFotosCamara As String = "Fotos"
	Dim const PathVideosCamara As String = "Videos"
	Dim const PathImagenesWhatsApp As String = "Imagenes WhatsApp"
	Dim const PathVideosWhatsApp As String = "Videos WhatsApp"
	
	
	Dim FTP3 As FTP
	Dim FTP4 As FTP
	Dim FTP_Consulta As FTP
	
	'Dim pb As ProgressBar
	Dim currentFileSize As Int
	
	Dim EsPrimeraVez As Boolean = True
	
	Dim FechaWhapp As String

End Sub

Sub Service_Create
	
	DatosGlobales.EnPrincipal = False
	Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_ALWAYS 'Service.AUTOMATIC_FOREGROUND_NEVER 'asi estaba 02/12/2023
	
	CrearNotificacion(IdNotificacion, "FOTOS", "Iniciando...")
	Service.StartForeground(IdNotificacion,noti)

	

	'DatosGlobales.Ejecutandose = False

	'lo comento de aca y lo paso al start 26/12/2023
	'Awake.KeepAlive(True)


End Sub

Sub Service_Start (StartingIntent As Intent)
	

	Awake.KeepAlive(True)

	
	Log("ServBackUp4: Service_Start --> Ejecutandose... cada: " & DatosGlobales.Segundos & " segundos. Ejecutandose: " & DatosGlobales.Ejecutandose)
	
	
	If DatosGlobales.Ejecutandose = True Then
		Log("$$$ EJECUTANDOSE -> entonces sigue el --> StartServiceAt... $$$")
		StartServiceAt(Me, DateTime.Now + DatosGlobales.Segundos * DateTime.TicksPerSecond, True) ' para segundos
		Return
	Else
		Log("$$$ NO SE ESTA EJECUTANDO $$$")
	End If
	
	Log("$$$ POST EJECUTANDOSE $$$")
	
	
	'Log("LOG? -> " & DatosGlobales.LogOk)
	
	If DatosGlobales.LogOk Then
		'Log("Entro a LOG")
	
		If DatosGlobales.Ejecutandose = False Then
		
			If FTP3.IsInitialized = False Then
				FTP3.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
				FTP3.PassiveMode = True
			End If
		
			If FTP4.IsInitialized = False Then
				FTP4.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
				FTP4.PassiveMode = True
			End If
	
			If FTP_Consulta.IsInitialized = False Then
				FTP_Consulta.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
				FTP_Consulta.PassiveMode = True
			End If
		
			Log("Servicios ftp incializados: FTP3 -> " & FTP3.IsInitialized & " - FTP4 -> " & FTP4.IsInitialized &  " - FTP_Consulta ->  " & FTP_Consulta.IsInitialized)
				
		End If
	
	Else
		Log("NO LOG")
		StartActivity(Login)
	End If
	
	
	
	
	
'	Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
'	
'	' ESTOS DOS ESTAN EN EL CREATE	
'	' DatosGlobales.Ejecutandose = True
'	' DatosGlobales.ForzarEjecucion = False
'	
'	If DatosGlobales.Ejecutandose = False Then
'
'		DatosGlobales.Ejecutandose = True
'		Dim rs As ResumableSub = IniciarProceso(DatosGlobales.ColMobilRutaOrigen)
'		Wait For(rs) complete
'		
'	Else
'		Log("ServBackUp4: Service_Start --> DatosGlobales.Ejecutandose = True")
'		
'	End If
	
	
	
	Try
		Log("ServBackUp4: PASO POR Service_Start y el primer TRY")
	
		If DatosGlobales.EnPrincipal = False Then
	
			If DatosGlobales.Configurando = False Then

				Log("Ejecutandose: " & DatosGlobales.Ejecutandose)

			
				'##################################################################################################################################################################
				' FULL BACKUP
				If EsPrimeraVez = True Then 'comentado 31/12/2023
				'If DatosGlobales.XML_PrimeraVez = "1" Then
			
					StartActivity(Login)
			
					If DatosGlobales.LogOk Then
						EsPrimeraVez= False
					
						If DatosGlobales.Ejecutandose = False Then
							Try
							
								DatosGlobales.Ejecutandose = True '16/12/2023
								
								Dim rs As ResumableSub = ValidarCnxServidor(DatosGlobales.XML_ServidorRuta) 'Valida conexion al servidor FTP
								Wait For(rs) Complete (Result As Boolean)
								If Result = True Then 'Se pudo conectar al servidor FTP
									
									'08/12/2023
									'Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
							
									'If (MyWiFi.isWifiConnected = True) And ((MyWiFi.SSID = "kuaiyu-LczZPB") Or (MyWiFi.SSID = "SNM_Fondo")) Then 'kuaiyu-LczZPB --> WIFI del emulador
									
									'StartActivity(Backup)
									
										'ModificarNotificacion(IdNotificacion, "Fotos", "Copia en curso... " & DatosGlobales.CopiaPorcentEnCurso)
										ModificarNotificacion(IdNotificacion, "Fotos", "Copia en curso... ")
											'DatosGlobales.Ejecutandose = True '16/12/2023
											Dim rs As ResumableSub = IniciarProceso(DatosGlobales.ColMobilRutaOrigen)
											'Wait For(rs) complete   'esto estaba asi hasta 19/11/2023
											Wait For(rs) complete (Result As Boolean)
									
											'hacer algo aca!!!
											If Result = True Then
	
												Log("### FINALIZO BIEN!!! (FULL BACKUP) --> ENTONCES EJECUTO LA FX --> FinalizarProceso")
												
												'comentado 02/01/2024
												If CantEnCurso >= CantidadTotal Then
													FinalizarProceso
												Else
													CantEnCurso = 0
													CantidadTotal = 0
													CantidadOk = 0
													CantidadFallidas = 0
													DatosGlobales.CopiaPorcentEnCurso = "0%"
													DatosGlobales.CopiaProgress = 0
													DatosGlobales.CopiaCantEnCurso = 0
													DatosGlobales.CopiaProgreso =  "0"
												End If
											
													
											Else
												Log("### NOOO FINALIZO BIEN!!! (FULL BACKUP)")
												DatosGlobales.Segundos = 60  '3600s = 1hs / 360s = 3mins
												
												Log("Poner en Notificacion: próxima ejecucion: " & FxGlobales.ObtenerHoraProximaEjecucion)
												
											End If
											
											Log("Paso por aca 'Activity_Resume' -> Post 'IniciarProceso'")
											'CrearNotificacion("Fotos","Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
											'ModificarNotificacion(IdNotificacion, "Fotos", "" & DatosGlobales.CopiaPorcentEnCurso)
							
									
									Log("Poner en Notificacion: próxima ejecucion: " & FxGlobales.ObtenerHoraProximaEjecucion)
											
								Else
									Log("No se encuentra en el Wifi preseteado")
									ModificarNotificacion(IdNotificacion,"Fotos","No se encuentra en el Wifi preseteado")
									DatosGlobales.Ejecutandose = False
								End If
							
							Catch
								DatosGlobales.Segundos = 360  '3600s = 1hs / 360s = 3mins
								Log("Paso por Catch 1 de Service_Start -> " & LastException)
								DatosGlobales.Ejecutandose = False
							End Try
						Else
							Log("No se puede ejecutar BKP porque una copia esta en curso...")
				
						End If
					End If
				
				
				'##################################################################################################################################################################
				' BACKUP DIARIO
				Else 'EsPrimeraVez = False
				
					If DatosGlobales.Ejecutandose = False Then
						'DatosGlobales.Ejecutandose = True
						Try
							DatosGlobales.Ejecutandose = True '16/12/2023
							
							Log("Ejecutandose NO por primera vez...")
						
							Dim rs As ResumableSub = ValidarCnxServidor(DatosGlobales.XML_ServidorRuta) 'Valida conexion al servidor FTP
							Wait For(rs) Complete (Result As Boolean)
							If Result = True Then 'Se pudo conectar al servidor FTP
								
								'08/12/2023
								'Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
							
							
								'If (MyWiFi.isWifiConnected = True) And ((MyWiFi.SSID = "kuaiyu-LczZPB") Or (MyWiFi.SSID = "SNM_Fondo")) Then 'kuaiyu-LczZPB --> WIFI del emulador
								
								'StartActivity(Backup)
								'DatosGlobales.Ejecutandose = True '16/12/2023
								Dim rs As ResumableSub = IniciarProceso(DatosGlobales.ColMobilRutaOrigen)
								Wait For(rs) complete (Result As Boolean)
								
								'hacer algo aca!!!
								If Result = True Then
									Log("### FINALIZO BIEN!!! (BACKUP DIARIO) --> ENTONCES EJECUTO LA FX --> FinalizarProceso")
									
									'comentado 02/01/2024
									'FinalizarProceso 
									
									If CantEnCurso >= CantidadTotal Then
										FinalizarProceso
									Else
										CantEnCurso = 0
										CantidadTotal = 0
										CantidadOk = 0
										CantidadFallidas = 0
										DatosGlobales.CopiaPorcentEnCurso = "0%"
										DatosGlobales.CopiaProgress = 0
										DatosGlobales.CopiaCantEnCurso = 0
										DatosGlobales.CopiaProgreso =  "0"
									End If
									
								Else
									Log("### NOOO FINALIZO BIEN!!! (BACKUP DIARIO)")
									DatosGlobales.Segundos = 60  '3600s = 1hs / 360s = 5mins
									Log("Poner en Notificacion: próxima ejecucion: " & FxGlobales.ObtenerHoraProximaEjecucion)
									
								End If
								
								'CrearNotificacion("Fotos","Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
								'ModificarNotificacion(IdNotificacion, "Fotos", "Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
'						Else
'							Log("No se encuentra en el Wifi preseteado")
'							CrearNotificacion("Fotos","No se encuentra en el Wifi preseteado" & DatosGlobales.CopiaPorcentEnCurso)
'						End If

							End If
					
						Catch
							DatosGlobales.Segundos = 360  '3600s = 1hs / 360s = 5mins
							Log("Paso por Catch 2 de Service_Start -> " & LastException)
							DatosGlobales.Ejecutandose = False
						End Try
					Else
						Log("No se puede ejecutar BKP porque una copia esta en curso...")
				
					End If
				
				End If
		
		
				Log("Estado al finalizar de 'Ejecutandose': " & DatosGlobales.Ejecutandose)
		
			End If
		
			
			'comento esto 19/11/2023
			If DatosGlobales.Ejecutandose = True Then
				'CrearNotificacion("Fotos","Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
				
				'ModificarNotificacion(IdNotificacion, "Fotos", "Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
			Else
				If DatosGlobales.CopiaPorcentEnCurso = "100%" Then
					'Log("Esperando para hacer copia de seguridad...")
					'CrearNotificacion("Fotos","Copia en progreso... " & "100%")
'					ModificarNotificacion(IdNotificacion, "Fotos", "Copia en progreso... " & "100%")
'					ModificarNotificacion(IdNotificacion, "Fotos","Esperando para hacer copia de seguridad...")
'					DatosGlobales.CopiaPorcentEnCurso = "0%"
				Else
					'agregado 31/12/2023 --> SOLO VA A LLEGAR ACA SI FINALIZO EJECUCION PERO MAL
					
					If CantEnCurso >= CantidadTotal Then
						DatosGlobales.Segundos = 3600
					Else
						DatosGlobales.Segundos = 360
					End If
					
				
					
					ModificarNotificacion(IdNotificacion, "Fotos","Esperando para hacer copia de seguridad a las: " & FxGlobales.ObtenerHoraProximaEjecucion)
					Log("Esperando para hacer copia de seguridad a las: " & FxGlobales.ObtenerHoraProximaEjecucion)
				End If
			End If
			
	
		End If 'fin de DatosGlobales.Principal
	
	
		StartServiceAt(Me, DateTime.Now + DatosGlobales.Segundos * DateTime.TicksPerSecond, True) ' para segundos


	Catch
		Log("#ERROR: en Service_Start --> " & LastException)
	End Try
	
	
End Sub

Sub Service_Destroy
	
	'agregado 10/01/2024
	CantEnCurso = 0
	CantidadTotal = 0
	CantidadOk = 0
	CantidadFallidas = 0
	DatosGlobales.CopiaPorcentEnCurso = "0%"
	DatosGlobales.CopiaProgress = 0
	DatosGlobales.CopiaCantEnCurso = 0
	DatosGlobales.CopiaProgreso =  "0"
	
	
	DatosGlobales.Ejecutandose = False
		
	Log("Salio por --> Service_Destroy")

	'EliminarNotificacion(IdNotificacion)
	'ModificarNotificacion(IdNotificacion, "Fotos","Esperando para hacer copia de seguridad...")

End Sub









' ################################################################################################################################################################
' NOTIFICACIONES

Private Sub CrearNotificacion(UnIdNotificacion As Int, Titulo As String, Mensaje As String) 'As Notification
	noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no haga sonido cada vez q se ejecuta
	'noti.Initialize2(noti.IMPORTANCE_HIGH)
	noti.Icon = "icon"
	noti.Vibrate = False
	noti.Sound = False
	noti.Light = False
	noti.SetInfo(Titulo, Mensaje, Principal)
	noti.Notify(UnIdNotificacion)
End Sub

Private Sub ModificarNotificacion(UnIdNotificacion As Int, Titulo As String, Mensaje As String) 'As Notification
	noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no haga sonido cada vez q se ejecuta
	'noti.Initialize2(noti.IMPORTANCE_HIGH)
	noti.Icon = "icon"
	noti.Vibrate = False
	noti.Sound = False
	noti.Light = False
	noti.SetInfo(Titulo, Mensaje, Principal)
	noti.Notify(UnIdNotificacion)
End Sub

Private Sub EliminarNotificacion(UnIdNotificacion As Int)
	noti.Cancel(UnIdNotificacion)
	'StopService(Me)
End Sub



' ################################################################################################################################################################
' ################################################################################################################################################################
' ################################################################################################################################################################


Private Sub ValidarCnxServidor(unaRuta As String) As ResumableSub
	
	Log("### Inicia validacion de conexion al servidor ### - " & unaRuta)
	
	FtpTest.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
	FtpTest.PassiveMode = True
	
	Dim Resu As Boolean = False
	
	FtpTest.List(unaRuta)
	Wait For FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	Dim TotalCarpetas As Int = Folders.Length
	
	Log("Cantidad de carpetas leidas: " & TotalCarpetas & " ---> " & Success & " - " & ServerPath)
	
	If Success = True  Then
		Resu = True
	Else
		If FTP3.IsInitialized = False Then
			FTP3.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
			FTP3.PassiveMode = True
		End If
		
		If FTP4.IsInitialized = False Then
			FTP4.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
			FTP4.PassiveMode = True
		End If
	
		If FTP_Consulta.IsInitialized = False Then
			FTP_Consulta.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
			FTP_Consulta.PassiveMode = True
		End If
	End If
	
	'agregado 16/12/2023
	If	FtpTest.IsInitialized Then
		FtpTest.CloseNow
	End If
	
	Log("### Fin de validacion de conexion al servidor ###")
	
	Return Resu
End Sub




' ################################################################################################################################################################
' ################################################################################################################################################################
' ################################################################################################################################################################




#Region "FTP"



Sub GuardarArchivoEnElServidor (PathDelServidor As String, Ip As String, Puerto As Int, Usuario As String, Contra As String, RutaMobile As String, ArchivoMobileFull As String, TipoDeOperacion As Int) As ResumableSub
	Try
		Dim Path As String = ""
		Dim Resu As Boolean = False
	 	
		'17/12/2023 agregado
		DatosGlobales.CopiaProgress = 0
	
		
		If TipoDeOperacion = 0 Then 'FOTOS CAMARA
			Path = PathFotosCamara
		Else If TipoDeOperacion = 1 Then 'VIDEOS CAMARA
			Path = PathVideosCamara
		Else If TipoDeOperacion = 2 Then 'IMAGENES WHATSAPP
			Path = PathImagenesWhatsApp
		Else If TipoDeOperacion = 3 Then 'VIDEOS WHATSAPP
			Path = PathVideosWhatsApp
		End If
	
	 
		Dim ArchivoMobile As String = FxGlobales.Left(ArchivoMobileFull, ArchivoMobileFull.IndexOf(";"))
		
		Dim FechaArchivo As String '= FxGlobales.Right(ArchivoMobileFull, (ArchivoMobileFull.Length - ArchivoMobileFull.IndexOf(";")-1))  'comentado 10/01/2024

		DatosGlobales.NombreArchivo = ArchivoMobile
		
		
		
		'Dim Sarasa As String = ""
		FechaWhapp = ""
		If TipoDeOperacion = 2 Or TipoDeOperacion = 3 Then 'comentado 10/01/2024
		'If TipoDeOperacion = 0 Or TipoDeOperacion = 1 Or TipoDeOperacion = 2 Or TipoDeOperacion = 3 Then '10/01/2024 agregado para probar tmb camara formato de fecha con nombre de archivo
			'Ejecutando FX -> GuardarArchivoEnElServidor - [1] - Para el archivo: IMG-20201008-WA0037.jpg FechaArchivo =====================> 20201009
			'FechaArchivo = ""
			Dim PrimerUbicacion As Int = ArchivoMobile.IndexOf("-")
			Dim SegundaUbicacion As Int  = ArchivoMobile.LastIndexOf("-")
			FechaWhapp = FxGlobales.Mid(ArchivoMobile, PrimerUbicacion+2, 8)
			FechaArchivo = FechaWhapp
		End If
		
				
		If TipoDeOperacion = 0 Or TipoDeOperacion = 1 Then 'agregado 11/01/2024
			Dim PrimerUbicacion As Int = ArchivoMobile.IndexOf("_")
			Dim SegundaUbicacion As Int  = ArchivoMobile.LastIndexOf("_")
			FechaWhapp = FxGlobales.Mid(ArchivoMobile, PrimerUbicacion+2, 8)
			FechaArchivo = FechaWhapp
		End If
		
		
		Log("Ejecutando FX -> GuardarArchivoEnElServidor - [1] - Para el archivo: " & ArchivoMobile & " FechaArchivo =====================> " & FechaWhapp & " VS " & FechaArchivo)
		'Log("Ejecutando FX -> GuardarArchivoEnElServidor - Para el archivo: " & ArchivoMobile)

		
		
		
		' ################################################################################################################################################################################################
		' agregado 28/12/2023
		
		If DatosGlobales.XML_PrimeraVez = "1" Then 'esto es para el FULL BACKUP
			
			If DatosGlobales.IndiceFullBkp > CantEnCurso Then
				
				Log("Ejecutando FX -> GuardarArchivoEnElServidor - [1-Z] - EXISTE PORQUE FUE GUADADO PREVIAMENTE PERO NO SE EVALUA  # ENTONCES NO HAGO NADA!!!")
	
				DatosGlobales.CopiaProgress = 100
				CantidadOk = CantidadOk + 1 'si bien no hago operaciones, se considera como buena porq no tenia q hacer nada y lo hizo ok
				ModificarNotificacion(IdNotificacion, "FOTOS - PROCESO GLOBAL [" & CantEnCurso & "/" & CantidadTotal & "]  " & DatosGlobales.CopiaPorcentEnCurso , DatosGlobales.NombreArchivo & CRLF & DatosGlobales.CopiaProgreso & " - " & DatosGlobales.CopiaProgress & "%")
				Resu = True
				
				CantEnCurso = CantEnCurso + 1
				DatosGlobales.CopiaCantEnCurso = CantEnCurso & "/" & CantidadTotal
				DatosGlobales.CopiaPorcentEnCurso = Round2((CantEnCurso * 100) / CantidadTotal,0) & "%"
		
				Log("Ejecutando FX -> GuardarArchivoEnElServidor - [5-Z] -> Cantidad en curso: " & CantEnCurso & " - Cantidad Total: " & CantidadTotal & " - OK: " & CantidadOk & " - Fallidas: " & CantidadFallidas  & " - Progreso del proceso: " & DatosGlobales.CopiaPorcentEnCurso)
				
				Return Resu
			End If
		End If
				

		' ################################################################################################################################################################################################
		
		
		
		If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo,"") = False Then
			
			'--- agregado 26/12/2023
			If FTP3.IsInitialized = True Then
				FTP3.CloseNow
			End If
			
			FTP3.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
			FTP3.PassiveMode = True
			
			'--- FIN DE: agregado 26/12/2023

			
			
			Dim sf As Object = FTP3.SendCommand("MKD", PathDelServidor & "/" & Path)
			Wait For (sf) FTP_CommandCompleted(Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
			If Success = True Then
				'--- agregado 26/12/2023
				FTP3.CloseNow
			End If
		Else
			Log("No pudo crear carpeta: " & PathDelServidor & "/" & Path & "!!!")
		End If
	
		If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo,"") = False Then
			
			'--- agregado 26/12/2023
			If FTP3.IsInitialized = True Then
				FTP3.CloseNow
			End If
			
			FTP3.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
			FTP3.PassiveMode = True
			
			'--- FIN DE: agregado 26/12/2023
			
			Dim sf2 As Object = FTP3.SendCommand("MKD", PathDelServidor & "/" & Path & "/" & FechaArchivo)
			Wait For (sf2) FTP_CommandCompleted(Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
			If Success = True Then
				'--- agregado 26/12/2023
				FTP3.CloseNow
			End If
		Else
			Log("No pudo crear carpeta: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & "!!!")
		End If
	
		
		Log("Ejecutando FX -> GuardarArchivoEnElServidor - [2] - Para el archivo: " & ArchivoMobile & " - Termino de validar y crear carpetas en el server")
				
	
		'VERIFICO SI EL ARCHIVO YA EXISTE EN EL SERVIDOR
		Dim rsb As ResumableSub = EncontroArchivoEnServidor(PathDelServidor & "/" & Path & "/" & FechaArchivo & "/", RutaMobile,ArchivoMobile) 'ej: EncontroArchivoEnServidor("./H/DiscoCompartido/RiBackup/Fotos/20230924/", "Foto_Bath_Puerta.jpg")
		Wait For(rsb) complete (Result As Boolean)
		If Result = True Then
			'Msgbox("Encontrado", "")
		
			'Log("EXISTE --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile & " # ENTONCES NO HAGO NADA!!!")
			Log("Ejecutando FX -> GuardarArchivoEnElServidor - [3-1] - EXISTE --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile & " # ENTONCES NO HAGO NADA!!!")
	
			'pb.Progress = 100
			DatosGlobales.CopiaProgress = 100
			
			CantidadOk = CantidadOk + 1 'si bien no hago operaciones, se considera como buena porq no tenia q hacer nada y lo hizo ok
			
			
			
			ModificarNotificacion(IdNotificacion, "FOTOS - PROCESO GLOBAL [" & CantEnCurso & "/" & CantidadTotal & "]  " & DatosGlobales.CopiaPorcentEnCurso , DatosGlobales.NombreArchivo & CRLF & DatosGlobales.CopiaProgreso & " - " & DatosGlobales.CopiaProgress & "%")

			
			Resu = True
			
		Else
			Try '09/12/2023 --> nuevo try para ver si se puede capturar el error de subida
				'Msgbox("No encontrado", "")
				'Log("NO EXISTE!!! --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile & " # ENTONCES SUBO EL ARCHIVO AL SERVER")
				Log("Ejecutando FX -> GuardarArchivoEnElServidor - [3-2] - NO EXISTE!!! --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile & " # ENTONCES SUBO EL ARCHIVO AL SERVER")
		
		
				'SUBO AL SERVER EL ARCHIVO
				currentFileSize = File.Size(RutaMobile, ArchivoMobile)
			
				'08/12/2023
				If FTP4.IsInitialized = False Then
					FTP4.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
					FTP4.PassiveMode = True
				End If
			
				Dim complete As Object = FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE
			
				Wait For (complete) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
				If Success Then
					Resu = True
					CantidadOk = CantidadOk + 1
					DatosGlobales.CopiaProgress = 100 'pb.Progress = 100
					'Log("El archivo se subio al servidor ok!!! -> " & ArchivoMobile)
					
					'22/12/2023
					FTP4.CloseNow
					
					Log("Ejecutando FX -> GuardarArchivoEnElServidor - [4-1] - El archivo se subio al servidor ok!!! -> " & ArchivoMobile)
				Else
					'Resu = False ya viene x default
					CantidadFallidas = CantidadFallidas + 1
					'Log("Fallo subida de archivo al servidor " & ArchivoMobile)
					Log("Ejecutando FX -> GuardarArchivoEnElServidor - [4-2] - Fallo subida de archivo al servidor " & ArchivoMobile)
				End If
				
				'08/12/2023
				'FTP4.Close

			Catch
				Log("°°°°°°°°°°°°°°°°°°°°°° #ERROR: en subida de archivo FTP4.UploadFile  °°°°°°°°°°°°°°°°°°°°°°°°°°°" & LastException)
			End Try
							
		End If



	
		' ####################################################################################################################################################################


		'### esto asi andaba hasta el 25/09/2023
'	currentFileSize = File.Size(RutaMobile, ArchivoMobile)
'	Dim complete As Object = FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE
		'
'	Wait For (complete) FTP_UploadCompleted (ServerPath As String, Success As Boolean)
'	If Success Then pb.Progress = 100
		
		
		If DatosGlobales.XML_PrimeraVez = "1" Then 'esto es para el FULL BACKUP, si es el diario no guardo nada
			'DatosGlobales.IndiceFullBkp = CantEnCurso
			
			If Resu = True Then
				File.WriteString(File.DirInternal,"indicefullbkp.txt", CantEnCurso)	'el indice solo lo guardo cuando la operacion fue exitosa, de lo contrario no
				Log(" ---> GUARDO EN ARCHIVO INDICE: " & CantEnCurso & " <---")
			Else
				Log(" ---> #FALLO: ENTONCES NO GUARDO EN ARCHIVO INDICE: " & CantEnCurso & "!!! <---")
			End If
			
		End If
		
		
		CantEnCurso = CantEnCurso + 1
		'LblTexto.Text = CantEnCurso & "/" & CantidadTotal
		DatosGlobales.CopiaCantEnCurso = CantEnCurso & "/" & CantidadTotal
		DatosGlobales.CopiaPorcentEnCurso = Round2((CantEnCurso * 100) / CantidadTotal,0) & "%"
			
		
		
		'Log("Cantidad en curso: " & CantEnCurso & CRLF & "Cantidad Total: " & CantidadTotal & CRLF & "Porcentaje: " & DatosGlobales.PorcentEnCurso)
	
		'Log("Fx -> GuardarArchivoEnElServidor -> Cantidad en curso: " & CantEnCurso & " - Cantidad Total: " & CantidadTotal & " - Progreso del proceso: " & DatosGlobales.CopiaPorcentEnCurso)
		
		'Log("Fx -> GuardarArchivoEnElServidor -> Cantidad en curso: " & CantEnCurso & " - Cantidad Total: " & CantidadTotal & " - OK: " & CantidadOk & " - Fallidas: " & CantidadFallidas  & " - Progreso del proceso: " & DatosGlobales.CopiaPorcentEnCurso)
		Log("Ejecutando FX -> GuardarArchivoEnElServidor - [5] -> Cantidad en curso: " & CantEnCurso & " - Cantidad Total: " & CantidadTotal & " - OK: " & CantidadOk & " - Fallidas: " & CantidadFallidas  & " - Progreso del proceso: " & DatosGlobales.CopiaPorcentEnCurso)
		
				
	
' INICIO COMENTADO 16/12/2023		
'		If CantEnCurso >= CantidadTotal Then
'			'si pudo completar todo el backup, tiene que cambiar la varible primeravez a cero para que no vuelva a hacerlo
'			
'			If CantidadFallidas = 0 Then
'				Dim unXml As String = CargarElXML  'la tengo q generar modificada solo para esta funcion
'				File.WriteString(File.DirInternal,"config.xml",unXml) 'lo grabo
'			End If
'
'			'Msgbox("Se ha terminado la copia de seguridad", "Mensaje del sistema")
'			'ToastMessageShow("Se ha terminado la copia de seguridad", True)
'			'Awake.ReleaseKeepAlive 'liberar
'
'			If	FTP3.IsInitialized Then
'				FTP3.CloseNow
'			End If
'					
'			If	FTP4.IsInitialized Then
'				FTP4.CloseNow
'			End If
'				
'			If	FTP_Consulta.IsInitialized Then
'				FTP_Consulta.CloseNow
'			End If
'				
'				
'			If CantidadTotal = CantidadOk Then
'				ModificarNotificacion(IdNotificacion, "FOTOS", "Esperando para hacer copia...")
'			End If
'				
'			CantEnCurso = 0
'			CantidadTotal = 0
'	
'			CantidadOk = 0
'			CantidadFallidas = 0
'	
'			DatosGlobales.Ejecutandose = False
'			'Activity.Finish
'			'StopService(Me)
				
'		End If
		'#############################################################################################################################################################

' FIN DE COMENTADO 16/12/2023

		Return Resu = True 'True
		
	Catch
		Log("#ERROR: en Fx GuardarArchivoEnElServidor --> " & LastException)
		Return Resu 
	End Try
	
End Sub



Sub FTP_UploadProgress (ServerPath As String, TotalUploaded As Long, Total As Long)
	
	Try
		'LblProgre.Text = "COPIANDO [" & TotalUploaded & "]"
		DatosGlobales.CopiaProgreso =  "[" & TotalUploaded & "]"
	
		'pb.Progress = 100 * TotalUploaded / currentFileSize
		DatosGlobales.CopiaProgress = FxGlobales.CInt(100 * TotalUploaded / currentFileSize)
	



		'ModificarNotificacion(IdNotificacion, "FOTOS", DatosGlobales.CopiaProgreso & " - " & DatosGlobales.CopiaProgress & "%")
	 
		DatosGlobales.CopiaPorcentEnCurso = Round2((CantEnCurso * 100) / CantidadTotal,0) & "%"
		ModificarNotificacion(IdNotificacion, "FOTOS - PROCESO GLOBAL [" & CantEnCurso & "/" & CantidadTotal & "]  " & DatosGlobales.CopiaPorcentEnCurso , DatosGlobales.NombreArchivo & CRLF & DatosGlobales.CopiaProgreso & " - " & DatosGlobales.CopiaProgress & "%")
	
	
		
		If CantEnCurso >= CantidadTotal Then
			FinalizarProceso
		End If
		
		
	
	
		'Log(DatosGlobales.NombreArchivo & CRLF & DatosGlobales.CopiaProgreso & " - " & DatosGlobales.CopiaPorcentEnCurso)
	
	
'	If DatosGlobales.CopiaPorcentEnCurso < 100 Then
'		Log("Por debajo de 100")
'	Else
'		Log("¡¡¡¡Llegue a 100%!!!!!")
'	End If
	
	
'	Dim PorcentajeTot As Int = FxGlobales.CInt(DatosGlobales.CopiaPorcentEnCurso)
'	
'	If PorcentajeTot < 100 Then
'		Log("Por debajo de 100")
'	Else
'		Log("¡¡¡¡Llegue a 100%!!!!!")
'	End If
		
		
		'Log("°°°° Cantidad en curso: " & CantEnCurso & " - Cantidad Total: " & CantidadTotal &  "°°°°°")
	
	
		'Log("°°°[Total subido: " & TotalUploaded & " - Total: " & Total & "]°°°°")
		
'		If TotalUploaded > 0 Then
'			If TotalUploaded = Total Then
'				
'				Log("totaluloaded = total")			
'				
'			End If
'		End If
		
		

		
	Catch
		Log("ERROR: en FTP_UploadProgress - " & LastException)
	End Try
	
End Sub


Sub ftp_UploadCompleted (ServerPath As String, Success As Boolean)
	'Log("--> FTP_UploadCompleted --> Success: " & Success)
	
	If Success Then
		Log("--> FTP_UploadCompleted --> Subio Ok.")
	Else
		Log("--> FTP_UploadCompleted --> Fallo Subida")
	End If
	
	
End Sub



#End Region




#Region "MOBILE"


Sub IniciarProceso (ColMobilRutaOrigen As List) As ResumableSub
	
	
	Log("Inicio proceso")
	
	'08/12/2023
	'Awake.KeepAlive(True)
		
	ListaCompleta.Initialize
	ListaFotos.Initialize
	ListaVideos.Initialize
		
	ListaCompleta.Clear
	ListaFotos.Clear
	ListaVideos.Clear
		
	Dim Resultado As Boolean = False
		
'	'#####################################################################################################################################
'	'para saber total real de lo que son las imagenes y videos
'	
'	'PRIMER FOR
'		
'	'Con el "i" recorro la lista con los path que se backupearan por ej: [MobilRutaFotos;/sdcard/Pictures/Fotos, MobilRutaVideos;/sdcard/Pictures/Videos]
'	For i = 0 To ColMobilRutaOrigen.Size-1
'		Try
'			Dim ContenidoColeccion_ As String= ColMobilRutaOrigen.Get(i)
'			Dim Ruta_ As String = (FxGlobales.Right(ContenidoColeccion_, (ContenidoColeccion_.Length - ContenidoColeccion_.IndexOf(";")-1)))
'			
'			'asi funcionaba 23/09/2023
'			'Dim ListaGenerica_ As List = File.ListFiles(Ruta_) '### ARMAR FUNCION PARA LISTAR TODOS / LOS DEL DIA
'			
'			Dim PrimeraVez As Boolean
'			If DatosGlobales.XML_PrimeraVez = "1" Then
'				PrimeraVez= True
'			Else
'				PrimeraVez= False
'			End If
'	
'			Dim ListaGenerica_ As List = DevolverLista(Ruta_, PrimeraVez)
'			
'				
'			For	h = 0 To ListaGenerica_.Size-1
'				Dim Extension As String = ""
'				Dim Archivox As String = ListaGenerica_.Get(h)
'				Extension = FxGlobales.Right(Archivox, 3)
'				If Extension.ToUpperCase = "JPG" Then
'					If DatosGlobales.XML_ChFotosCamara = "1" Or DatosGlobales.XML_ChImagenesWhatsApp = "1" Then
'						CantidadTotal = CantidadTotal + 1
'					End If
'				Else If Extension.ToUpperCase = "MP4" Then
'					If DatosGlobales.XML_ChVideosCamara = "1" Or DatosGlobales.XML_ChVideosWhatsApp = "1" Then
'						CantidadTotal = CantidadTotal + 1
'					End If
'				End If
'			Next
'			'CantidadTotal = CantidadTotal + ListaGenerica_.Size
'		Catch
'			Log(LastException)
'			'Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
'			ToastMessageShow("#ERROR: " & LastException, True)
'		End Try
'		
'	Next
'	'#####################################################################################################################################
'	



	'16/12/2023 -> MODIFICADO Y COMENTADO LO DE ARRIBA
	
	'#####################################################################################################################################
	'para saber total real de lo que son las imagenes y videos
	
	ColMobilRutaOrigen = EliminarDuplicados(ColMobilRutaOrigen)
	
	Dim rsCantArch As ResumableSub = ConsultarCantidadTotalDeArchivos(ColMobilRutaOrigen) 'modifica esta variable -> CantidadTotal
	Wait For(rsCantArch) complete (result As Boolean)
	If result = True Then
		Log("Resultado Fx --> ConsultarCantidadTotalDeArchivos -> OK!")
	Else
		Log("Resultado Fx --> ConsultarCantidadTotalDeArchivos -> Fallo!!!")
	End If

			
	'#####################################################################################################################################
	
	
	Log("Cantidad total: " & CantidadTotal)
	
	'StopService(Me)
	
	
	
	If CantidadTotal > 0 Then
		
		'SEGUNDO FOR
			
		For i = 0 To ColMobilRutaOrigen.Size -1
			
			Dim ContenidoColeccion As String= ColMobilRutaOrigen.Get(i)
			Dim Tipo As String = (FxGlobales.Left(ContenidoColeccion, ContenidoColeccion.IndexOf(";")))
			Dim Ruta As String = (FxGlobales.Right(ContenidoColeccion, (ContenidoColeccion.Length - ContenidoColeccion.IndexOf(";")-1)))
			
			Dim OperacionActual As Int
		
			'.Text = "" '"Tipo: " & Tipo   ' --> comentado 26/09/2023 ya q borra al transferir dsd fotos a videos por ej.
				
			If Tipo = "MobilRutaFotos" Then
				OperacionActual = 0
			Else If Tipo = "MobilRutaVideos" Then
				OperacionActual = 1
			Else If Tipo = "MobilRutaFotosWhapp" Then
				OperacionActual = 2
			Else If Tipo = "MobilRutaVideosWhapp" Then
				OperacionActual = 3
			End If
			
				
			
			Try
				'asi funcionaba 23/09/2023
				'Dim ListaGenerica As List = File.ListFiles(Ruta) '### ARMAR FUNCION PARA LISTAR TODOS / LOS DEL DIA
				
				Dim PrimeraVez As Boolean
				If DatosGlobales.XML_PrimeraVez = "1" Then
					PrimeraVez= True
				Else
					PrimeraVez= False
				End If
		
				Dim ListaGenerica As List = DevolverLista(Ruta, PrimeraVez)
				

				
				
				
				
				'TERCER FOR
				For j = 0 To ListaGenerica.Size -1
					
					Try
						Dim	Archivo As Object = ListaGenerica.Get(j)
						
						Dim Extension As String = ""
						Extension = FxGlobales.Right(Archivo, 3)
						If Extension.ToUpperCase = "JPG" Then
							Dim d As Long
							d = File.LastModified(Ruta, Archivo)
							'DateTime.DateFormat = "dd-MM-yyyy"
							DateTime.DateFormat = "yyyyMMdd"
							Dim ConcatFileDate As String = Archivo & ";" & DateTime.Date(d)
							
							Try
								If OperacionActual = 0 Then 'MobilRutaFotos [FOTOS DE LA CAMARA]
									Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.FotosCamara)
									Wait For(rs) complete (result As Boolean)
									If result = True Then
										Log("Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE LA CAMARA] - Archivo: " & Archivo & " -> Lo copio OK!")
									Else
										Log("Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE LA CAMARA] - Archivo: " & Archivo & " -> Fallo!!!")
										
										'agregado 31/12/2023
										ModificarNotificacion(IdNotificacion, "FOTOS", "Falló la copia del archivo: " & Archivo & " - Próxima ejecución: " & FxGlobales.ObtenerHoraProximaEjecucion)
										DatosGlobales.Ejecutandose = False
										DatosGlobales.Segundos = 60
'										DatosGlobales.CopiaPorcentEnCurso = "0%"
'										DatosGlobales.CopiaProgress = 0
'										DatosGlobales.CopiaCantEnCurso = 0
'										DatosGlobales.CopiaProgreso =  "0"
										'StopService(Me)
										If DatosGlobales.XML_PrimeraVez = "1" Then
											PrimeraVez= True
										End If
										Log("Primera vez: " & PrimeraVez)
										Return False
										
									End If
									
								Else If OperacionActual = 2 Then 'MobilRutaImagenesWhatsApp [FOTOS DE WHATSAPP]
									Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.ImagenesWhatsApp)
									Wait For(rs) complete (result As Boolean)
									If result =True Then
										Log("Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE WHATSAPP] - Archivo: " & Archivo & " -> Lo copio OK!")
									Else
										Log("Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE WHATSAPP] - Archivo: " & Archivo & " -> Fallo!!!")
										
										'agregado 31/12/2023
										ModificarNotificacion(IdNotificacion, "FOTOS", "Falló la copia del archivo: " & Archivo & " - Próxima ejecución: " & FxGlobales.ObtenerHoraProximaEjecucion)
										DatosGlobales.Ejecutandose = False
										DatosGlobales.Segundos = 60
'										DatosGlobales.CopiaPorcentEnCurso = "0%"
'										DatosGlobales.CopiaProgress = 0
'										DatosGlobales.CopiaCantEnCurso = 0
'										DatosGlobales.CopiaProgreso =  "0"
										'StopService(Me)
										If DatosGlobales.XML_PrimeraVez = "1" Then
											PrimeraVez= True
										End If
										Log("Primera vez: " & PrimeraVez)
										Return False
										
									End If
								End If
							Catch
								'Msgbox("#ERROR: " & LastException & CRLF & ConcatFileDate  , "Mensaje del sistema")
								Log("#ERROR: salio por CATCH de [FOTOS DE LA CAMARA] o [FOTOS DE WHATSAPP]" & LastException)
							End Try
						
						Else If Extension.ToUpperCase = "MP4" Then
							Dim d As Long
							d = File.LastModified(Ruta, Archivo)
							'DateTime.DateFormat = "dd-MM-yyyy"
							DateTime.DateFormat = "yyyyMMdd"
							Dim ConcatFileDate As String = Archivo & ";" & DateTime.Date(d)
							
							Try
								If OperacionActual = 1 Then 'MobilRutaFotos [VIDEOS DE LA CAMARA]
									Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.VideosCamara)
									Wait For(rs) complete (result As Boolean)
									If result =True Then
										Log("Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE LA CAMARA] - Archivo: " & Archivo & " -> Lo copio OK!")
									Else
										Log("Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE LA CAMARA] - Archivo: " & Archivo & " -> Fallo!!!")
										
										'agregado 31/12/2023
										ModificarNotificacion(IdNotificacion, "FOTOS", "Falló la copia del archivo: " & Archivo & " - Próxima ejecución: " & FxGlobales.ObtenerHoraProximaEjecucion)
										DatosGlobales.Ejecutandose = False
										DatosGlobales.Segundos = 60
										DatosGlobales.CopiaPorcentEnCurso = "0%"
										DatosGlobales.CopiaProgress = 0
										DatosGlobales.CopiaCantEnCurso = 0
										DatosGlobales.CopiaProgreso =  "0"
										'StopService(Me)
										If DatosGlobales.XML_PrimeraVez = "1" Then
											PrimeraVez= True
										End If
										Log("Primera vez: " & PrimeraVez)
										Return False
										
									End If
								Else If OperacionActual = 3 Then 'MobilRutaImagenesWhatsApp [VIDEOS DE WHATSAPP]
									
									Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.VideosWhatsApp)
									Wait For(rs) complete (result As Boolean)
									If result =True Then
										Log("Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE WHATSAPP] - Archivo: " & Archivo & " -> Lo copio OK!")
									Else
										Log("Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE WHATSAPP] - Archivo: " & Archivo & " -> Fallo!!!")
										
										
										'agregado 31/12/2023
										ModificarNotificacion(IdNotificacion, "FOTOS", "Falló la copia del archivo: " & Archivo & " - Próxima ejecución: " & FxGlobales.ObtenerHoraProximaEjecucion)
										DatosGlobales.Ejecutandose = False
										DatosGlobales.Segundos = 60
										DatosGlobales.CopiaPorcentEnCurso = "0%"
										DatosGlobales.CopiaProgress = 0
										DatosGlobales.CopiaCantEnCurso = 0
										DatosGlobales.CopiaProgreso =  "0"
										'StopService(Me)
										If DatosGlobales.XML_PrimeraVez = "1" Then
											PrimeraVez= True
										End If
										Log("Primera vez: " & PrimeraVez)
										Return False
										
									End If
								End If
							Catch
								'							Msgbox("#ERROR: " & LastException & CRLF & ConcatFileDate, "Mensaje del sistema")
								'							DatosGlobales.Ejecutandose = False
								Log("#ERROR: salio por CATCH de [VIDEOS DE LA CAMARA] o [FOTOS DE WHATSAPP] o [VIDEOS DE WHATSAPP]" & LastException)
							End Try
						
						End If
						
					Catch
						'Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
						'Log(LastException)
						'DatosGlobales.Ejecutandose = False
						
						Log("#ERROR: salio por CATCH FX --> IniciarProceso [DETRO DEL TERCER FOR] " & LastException)
						
					End Try
					
					
					
					
				Next
				
			Catch
				'Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
				ToastMessageShow("#ERROR: " & LastException & LastException, True)
				Log(LastException & CRLF & "No paso la lista: " & Tipo & " -> Por no tener datos") 'no es error
				DatosGlobales.Ejecutandose = False
			End Try
			
			
				
		Next
			
		
		Log("Finalizo proceso - CantidadFallidas: " & CantidadFallidas)
		
		'02/12/2023 estas dos lineas las agrego ahora
		If CantidadFallidas > 0 Then
			DatosGlobales.Ejecutandose = False
			
			'08/12/2023 comento la linea de abajo
			'StopService(Me)
		Else	
			Resultado = True
		End If
		
		
		
		'Awake.ReleaseKeepAlive 'libero
	
	
	Else
		
		'Awake.ReleaseKeepAlive 'liberar
			
		If	FTP3.IsInitialized Then
			FTP3.CloseNow
		End If
					
		If	FTP4.IsInitialized Then
			FTP4.CloseNow
		End If
		
		If	FTP_Consulta.IsInitialized Then
			FTP_Consulta.CloseNow
		End If
	
				
		CantEnCurso = 0
		CantidadTotal = 0
		
		
		Resultado = True
		
		'DatosGlobales.Ejecutandose = False
		Log("Finalizo proceso")
		'Activity.Finish
		'StopService(Me)
	
	
	End If 'fin de -> CantidadTotal > 0
	
	
	'llego al --> DatosGlobales.Ejecutandose = False
	Log("Llego al --> DatosGlobales.Ejecutandose = False")
	DatosGlobales.Ejecutandose = False
	
	Return Resultado
	
End Sub

#End Region



#Region "Guardar el archivo XML modificando la variable esprimeravez"

Private Sub CargarElXML As String
	
	' #############################################################################################################################################################################################
	'TODO ESTO ES PARA GUARDAR ESTE VALOR: es decir, si completo la carga completa, cambia el valor de primeravez a falso y luego actualizara solo lo del dia
	
	DatosGlobales.XML_PrimeraVez = "0"

	' #############################################################################################################################################################################################
	
	
	Dim ArchivoXml As String = "<?xml version=""""1.0"""" encoding=""""UTF-8""""?>" & CRLF & ""
	ArchivoXml = ArchivoXml & "<fotos>" & CRLF & ""
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	
	ArchivoXml = ArchivoXml & " <login>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <usuario>" & DatosGlobales.XML_Usuario & "</usuario>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <contraseña>" & DatosGlobales.XML_Contraseña & "</contraseña>"  & CRLF & ""
	ArchivoXml = ArchivoXml & "   <recordar>" & DatosGlobales.XML_Recordar & "</recordar>"  & CRLF & ""
	ArchivoXml = ArchivoXml & " </login>"  & CRLF & ""
	
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	ArchivoXml = ArchivoXml & " <ruta_origen>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <fotoscamara>" & DatosGlobales.XML_FotosCamara & "</fotoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <videoscamara>" & DatosGlobales.XML_VideosCamara & "</videoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <imageneswhatsapp>" & DatosGlobales.XML_ImagenesWhatsApp & "</imageneswhatsapp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <videoswhatsapp>" & DatosGlobales.XML_VideosWhatsApp & "</videoswhatsapp>" & CRLF & ""

	ArchivoXml = ArchivoXml & "   <chfotoscamara>" & DatosGlobales.XML_ChFotosCamara & "</chfotoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <chvideoscamara>" & DatosGlobales.XML_ChVideosCamara & "</chvideoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <chimageneswhatsapp>" & DatosGlobales.XML_ChImagenesWhatsApp & "</chimageneswhatsapp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <chvideoswhatsapp>" & DatosGlobales.XML_ChVideosWhatsApp & "</chvideoswhatsapp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <primeravez>" & DatosGlobales.XML_PrimeraVez & "</primeravez>" & CRLF & ""
	
	ArchivoXml = ArchivoXml & " </ruta_origen>" & CRLF & ""
	
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	ArchivoXml = ArchivoXml & " <ruta_destino>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <UsuarioRutaFotos>" & DatosGlobales.XML_UsuarioRutaFotos & "</UsuarioRutaFotos>" & CRLF & ""
	ArchivoXml = ArchivoXml & " </ruta_destino>" & CRLF & ""
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	
	ArchivoXml = ArchivoXml & " <ftp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorruta>" & DatosGlobales.XML_ServidorRuta & "</servidorruta>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorip>" & DatosGlobales.XML_ServidorIp & "</servidorip>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorpuerto>" & DatosGlobales.XML_ServidorPuerto & "</servidorpuerto>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorusuario>" & DatosGlobales.XML_ServidorUsuario & "</servidorusuario>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorclave>" & DatosGlobales.XML_ServidorClave & "</servidorclave>" & CRLF & ""
	ArchivoXml = ArchivoXml & " </ftp>" & CRLF & ""
	
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	ArchivoXml = ArchivoXml & "</fotos>" & CRLF & ""
	
	Return ArchivoXml
	
End Sub


#End Region




Private Sub DevolverLista(unaRuta As String, oEsPrimeraVez As Boolean) As List
	'si es primera vez, devuelve toda la lista completa
	'de lo contrario si no es primera vez solo listara los archivos del dia

	Dim unaListaFinal As List
	Dim unaListaProvisoria As List
	Dim unaListaProvisoria2 As List
	
	unaListaFinal.Initialize
	unaListaProvisoria.Initialize
	unaListaProvisoria2.Initialize
	
	unaListaFinal.Clear
	unaListaProvisoria.Clear
	unaListaProvisoria2.Clear
	
	DateTime.DateFormat = "yyyyMMdd"
	Dim FechaActual As String
	FechaActual = DateTime.Date(DateTime.Now)
	
	
	If oEsPrimeraVez = False Then
		
		unaListaProvisoria = File.ListFiles(unaRuta)
		
		For i = 0 To unaListaProvisoria.Size -1
			
			Dim	Archivo As Object = unaListaProvisoria.Get(i)
			Dim Archivox As String = unaListaProvisoria.Get(i)
			Dim Extension As String = FxGlobales.Right(Archivox, 3)
			'Dim unaRuta As String = (FxGlobales.Right(Archivox, (Archivox.Length - Archivox.IndexOf(";")-1)))
			
			DateTime.DateFormat = "yyyyMMdd"
			Dim d As Long
			d = File.LastModified(unaRuta, Archivo)
			Dim unaFechaArchivo As String = DateTime.Date(d)
			
			If(FechaActual = unaFechaArchivo) Then 'hoy
				unaListaProvisoria2.Add(unaListaProvisoria.Get(i))
			End If
			
			
			Dim FechaAyer As String
			FechaAyer = DateTime.Date(DateTime.Add(DateTime.Now, 0, 0, -1))
			If(FechaAyer = unaFechaArchivo) Then 'los de ayer
				unaListaProvisoria2.Add(unaListaProvisoria.Get(i))
			End If
			
			Dim Fecha2DiasAntes As String
			Fecha2DiasAntes = DateTime.Date(DateTime.Add(DateTime.Now, 0, 0, -2))
			If(Fecha2DiasAntes = unaFechaArchivo) Then 'los de ayer
				unaListaProvisoria2.Add(unaListaProvisoria.Get(i))
			End If
			
			Dim Fecha3DiasAntes As String
			Fecha3DiasAntes = DateTime.Date(DateTime.Add(DateTime.Now, 0, 0, -3))
			If(Fecha3DiasAntes = unaFechaArchivo) Then 'los de ayer
				unaListaProvisoria2.Add(unaListaProvisoria.Get(i))
			End If
						
		Next
		
		unaListaFinal = unaListaProvisoria2
			
	Else 'si es la primera vez le pasa todos los archivos
		
		unaListaFinal = File.ListFiles(unaRuta) ' [000_0964.JPG, 000_0965.JPG, 000_0966.JPG, 000_0967.JPG, 000_0967_.jpg, 000_0968.JPG, 000_0969.JPG, 000_0970.JPG, 000_0971.JPG, 000_0973.JPG, 000_0974.JPG, 000_0975.JPG, 000_0992_.jpg, Foto_Baño.jpg, SARASA]
		
	End If
	
	'16/12/2023
	Dim unaListaFinalSinDupli As List = EliminarDuplicados(unaListaFinal) 'esto no estaba es nuevo
	'Return unaListaFinal
	
	Return unaListaFinalSinDupli 'el return era el de arriba 16/12/2023
	
End Sub






' ORIGINAL: 19/11/2023,  se le va a agregar ruta local (mobile) para comparar tamaños en caso de q no haya podido terminar una copia
'Private Sub EncontroArchivoEnServidor(unaRutaServer As String, unArchivo As String) As ResumableSub
'	Dim Resu As Boolean = False
'	FTP_Consulta.List(unaRutaServer) 'ejemplo --> "./H/DiscoCompartido/RiBackup/Fotos/20230924/"
'	Wait For FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
'	Dim TotalArchivos As Int = Files.Length
'	If Success  Then
'		For i = 0 To TotalArchivos-1
'			If unArchivo = Files(i).Name Then
'				'Files(i).Size
'				'currentFileSize = File.Size(RutaMobile, ArchivoMobile)
'				Resu = True
'				Return Resu
'			End If
'		Next
'	End If
'	Return Resu
'End Sub




Private Sub EncontroArchivoEnServidor(unaRutaServer As String, unaRutaMobile As String, unArchivo As String) As ResumableSub
	currentFileSize = File.Size(unaRutaMobile, unArchivo)
	Dim Resu As Boolean = False
	
	
	'asi estaba 17/12/2023
	'Log("Archivo: " & unArchivo & " - Tamaño en server: " & File.Size(unaRutaServer, unArchivo) & " - Tamaño en Dispositivo: " & File.Size(unaRutaMobile, unArchivo))
	
	
	'agregado todo el if -> 19/12/2023
	If FTP_Consulta.IsInitialized = True Then
		FTP_Consulta.CloseNow
	End If
	FTP_Consulta.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
	FTP_Consulta.PassiveMode = True
	
		
	FTP_Consulta.List(unaRutaServer) 'ejemplo --> "./H/DiscoCompartido/RiBackup/Fotos/20230924/"
	Wait For FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	Dim TotalArchivos As Int = Files.Length

	If Success  Then
		For i = 0 To TotalArchivos-1
			If unArchivo = Files(i).Name Then
				'Files(i).Size
				
				
				'Log("$$$ ARCHIVO EN SERVER: " & Files(i).Name & " - TAMAÑO ARCHIVO SERVER: " & Files(i).Size)
								
				'Se agrega validacion por tamaño en caso de q haya comenzado a copiar un archivo y no haya podido completarlo
				'If (File.Size(unaRutaMobile, unArchivo)) = (Files(i).Size) Then
				
				Log("Archivo: " & unArchivo & " - Tamaño en server: " & (Files(i).Size) & " - Tamaño en Dispositivo: " & (currentFileSize))
				
				If (currentFileSize) = (Files(i).Size) Then
					Resu = True
				Else
					Log("Archivo existe en sel server, pero no coinciden los tamaños - " & "ARCHIVO EN SERVER: " & Files(i).Name & " - TAMAÑO ARCHIVO SERVER: " & Files(i).Size & " - TAMAÑO MOBILE: " & (File.Size(unaRutaMobile, unArchivo)) )
				End If
				Return Resu
			End If
			
		Next
		
	End If
	Return Resu
End Sub







Private Sub ConsultarCantidadTotalDeArchivos(unColMobilRutaOrigen As List) As ResumableSub
	
	Dim Resultado As Boolean = False
	CantidadTotal = 0
	
	'PRIMER FOR
	'Con el "i" recorro la lista con los path que se backupearan por ej: [MobilRutaFotos;/sdcard/Pictures/Fotos, MobilRutaVideos;/sdcard/Pictures/Videos]
	For i = 0 To unColMobilRutaOrigen.Size-1
		Try
			Dim ContenidoColeccion_ As String= unColMobilRutaOrigen.Get(i)
			Dim Ruta_ As String = (FxGlobales.Right(ContenidoColeccion_, (ContenidoColeccion_.Length - ContenidoColeccion_.IndexOf(";")-1)))
			
			Dim TipoOperacion As String = (FxGlobales.Left(ContenidoColeccion_, ContenidoColeccion_.IndexOf(";")))
			
			Log("CONTENIDO DE LA LISTA --> " & unColMobilRutaOrigen.get(i) & " TIPO --> " & TipoOperacion)
			
			Dim PrimeraVez As Boolean
			If DatosGlobales.XML_PrimeraVez = "1" Then
				PrimeraVez= True
			Else
				PrimeraVez= False
			End If
	
			Dim ListaGenerica_ As List = DevolverLista(Ruta_, PrimeraVez)
			
'			'**** quitar 16/12/2023 ****
'			Dim concatenado As String = ""
'			For	m = 0 To ListaGenerica_.Size-1
'				concatenado = concatenado & ListaGenerica_.Get(m) & CRLF & ""
'			Next
'			
'			Log(concatenado)
'			
'			StopService(Me)
			'
'			'**** quitar 16/12/2023 ****


			If TipoOperacion = "MobilRutaFotos" Then
				For	h = 0 To ListaGenerica_.Size-1
					Dim Extension As String = ""
					Dim Archivox As String = ListaGenerica_.Get(h)
					Extension = FxGlobales.Right(Archivox, 3)
					If Extension.ToUpperCase = "JPG" Then
						If DatosGlobales.XML_ChFotosCamara = "1" Then
							CantidadTotal = CantidadTotal + 1
						End If
					End If
				Next
				
			Else If TipoOperacion = "MobilRutaVideos" Then
				For	h = 0 To ListaGenerica_.Size-1
					Dim Extension As String = ""
					Dim Archivox As String = ListaGenerica_.Get(h)
					Extension = FxGlobales.Right(Archivox, 3)
					If Extension.ToUpperCase = "MP4" Then
						If DatosGlobales.XML_ChVideosCamara = "1" Then
							CantidadTotal = CantidadTotal + 1
						End If
					End If
				Next
				
			Else If TipoOperacion = "MobilRutaFotosWhapp" Then
				For	h = 0 To ListaGenerica_.Size-1
					Dim Extension As String = ""
					Dim Archivox As String = ListaGenerica_.Get(h)
					Extension = FxGlobales.Right(Archivox, 3)
					If Extension.ToUpperCase = "JPG" Then
						If DatosGlobales.XML_ChImagenesWhatsApp = "1" Then
							CantidadTotal = CantidadTotal + 1
						End If
					End If
				Next
				
			Else If TipoOperacion = "MobilRutaVideosWhapp" Then
				For	h = 0 To ListaGenerica_.Size-1
					Dim Extension As String = ""
					Dim Archivox As String = ListaGenerica_.Get(h)
					Extension = FxGlobales.Right(Archivox, 3)
					If Extension.ToUpperCase = "MP4" Then
						If DatosGlobales.XML_ChVideosWhatsApp = "1" Then
							CantidadTotal = CantidadTotal + 1
						End If
					End If
				Next
				
			End If



			'original 16/12/2023 todo el for	
'			For	h = 0 To ListaGenerica_.Size-1
'				Dim Extension As String = ""
'				Dim Archivox As String = ListaGenerica_.Get(h)
'				Extension = FxGlobales.Right(Archivox, 3)
'				If Extension.ToUpperCase = "JPG" Then
'					If DatosGlobales.XML_ChFotosCamara = "1" Or DatosGlobales.XML_ChImagenesWhatsApp = "1" Then
'						CantidadTotal = CantidadTotal + 1
'					End If
'				Else If Extension.ToUpperCase = "MP4" Then
'					If DatosGlobales.XML_ChVideosCamara = "1" Or DatosGlobales.XML_ChVideosWhatsApp = "1" Then
'						CantidadTotal = CantidadTotal + 1
'					End If
'				End If
'			Next
		Catch
			Log(LastException)
			ToastMessageShow("#ERROR: " & LastException, True)
		End Try
		
	Next
	
	Resultado = True
	
	Return Resultado
	

End Sub


Sub EliminarDuplicados(lista As List) As List

	Log("FX: EliminarDuplicados --> Entro --> Cantidad incio: " &  (lista.Size - 1))

	Dim Resultado As List
	Dim mapDuplicados As Map
	mapDuplicados.Initialize
    
	Resultado.Initialize
	
	For i = 0 To lista.Size - 1
		Dim elemento As Object
		elemento = lista.Get(i)
        
		' Agrega el elemento al Map si no existe ya
		If Not(mapDuplicados.ContainsKey(elemento)) Then
			mapDuplicados.Put(elemento, "")
		End If
	Next
    
	' Borra la lista original
	'lista.Clear
    
	' Convierte el Map de nuevo a una lista
	For Each key As Object In mapDuplicados.Keys
		Resultado.Add(key)
	Next
	
	Log("FX: EliminarDuplicados --> Llega hasta aca? --> CANTIDAD FIN: " & (Resultado.Size-1))
	
	Return Resultado
	
End Sub




Sub FinalizarProceso()
	Log("EJECUTA LA FX --> FinalizarProceso() --> Cant. en curso: " & CantEnCurso & ", Cant. Total: " & CantidadTotal & ", fallidas: " & CantidadFallidas & ", Ok: " & CantidadOk)
	
	If CantEnCurso >= CantidadTotal Then
		If CantidadFallidas = 0 Then
			DatosGlobales.Segundos = 3600 'lo paso de 360s [3 mins] a 3600s [60 mins]
			Dim unXml As String = CargarElXML  'la tengo q generar modificada solo para esta funcion
			File.WriteString(File.DirInternal,"config.xml",unXml) 'lo grabo
			CantEnCurso = 0
			CantidadTotal = 0
			CantidadOk = 0
			CantidadFallidas = 0
			DatosGlobales.Ejecutandose = False
			ModificarNotificacion(IdNotificacion, "FOTOS", "Esperando para hacer copia... Próxima ejecucion: " & FxGlobales.ObtenerHoraProximaEjecucion)
			Log("Esperando para hacer copia... Próxima ejecucion: " & FxGlobales.ObtenerHoraProximaEjecucion)
		End If
		DatosGlobales.CopiaPorcentEnCurso = "0%"
		DatosGlobales.CopiaProgress = 0
		DatosGlobales.CopiaCantEnCurso = 0
		DatosGlobales.CopiaProgreso =  "0"
		File.WriteString(File.DirInternal,"indicefullbkp.txt", "-1")
		StopService(Me)
	End If
End Sub





'agregado 26/12/2023
Sub Service_TaskRemoved
	' Este evento se activa cuando el usuario elimina la tarea de la aplicación desde el administrador de tareas.
	' Puedes manejar este evento si es necesario.
	
	Log("=== SALIO POR --> Service_TaskRemoved  ===")
	
End Sub


Sub Service_Error (Error As String, Code As Int)
	' Este evento se activa cuando ocurre un error en el servicio.
	
	Log("=== SALIO POR --> Service_Error  ===")
	
	Log("Error en el servicio: " & Error)
	Log("Código de error: " & Code)
	' Aquí puedes tomar medidas adicionales si es necesario, como notificar al usuario o reiniciar el servicio.
End Sub







