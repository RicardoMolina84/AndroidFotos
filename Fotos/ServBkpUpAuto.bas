B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=12.5
@EndOfDesignText@
#Region  Service Attributes 
	
	'Para que el Servicio se ejecute cuando reinicies el dispositivo emplea este código
	#StartAtBoot: True 
	
	
	'Puedes emplear el siguiente código para que Android no mate el Servicio. Android en un momento dado puede que pare el servicio y lo vuelva a iniciar al cabo de unos 
	'segundos, ese código se pone para eso, para que en caso de que Android o el usuario al borrar los procesos de fondo o la memoria si el servicio se para, vuelva a 
	'ponerse en marcha.
    #StartCommandReturnValue: android.app.Service.START_STICKY
	
	
#End Region

Sub Process_Globals
	'Aquí se declaran las variables globales del servicio. No hay otro Sub Globals como en el Activity, ya que un servicio no admite objetos Activity. 
	'No emplees aquí SUB procesos, solo declara variables, si empleas otro código puede fallar
	
	Dim n As Notification

	Dim contador As Int = 0

	' ######################################################################################################################################
	
	Private xui As XUI
	
	Dim ListaCompleta As List
	Dim ListaFotos As List
	Dim ListaVideos As List
	
	Dim CantFotos As Int
	Dim CantVideos As Int
	Dim CantTotal As Int
	Dim CantEnCurso As Int
	
	Dim CantidadTotal As Int = 0
	
	Dim Awake As PhoneWakeState
	
	
	
	Type TipoOperacion_ (FotosCamara As Int, VideosCamara As Int, ImagenesWhatsApp As Int, VideosWhatsApp As Int)
	
	Dim Operacion As TipoOperacion_
	Operacion.FotosCamara = 0
	Operacion.VideosCamara = 1
	Operacion.ImagenesWhatsApp = 2
	Operacion.VideosWhatsApp = 3

	Dim const PathFotosCamara As String = "Fotos"
	Dim const PathVideosCamara As String = "Videos"
	Dim const PathImagenesWhatsApp As String = "Imagenes WhatsApp"
	Dim const PathVideosWhatsApp As String = "Videos WhatsApp"
	

	' ####################################################################################################################################################################################
	' FTP

	'Private Prueba_ImageView1 As ImageView
	Dim FTP3 As FTP
	Dim FTP4 As FTP
	Dim FTP_Consulta As FTP
	Dim currentFileSize As Int
	
	' ####################################################################################################################################################################################
	
	
	Dim EsPrimeraVez As Boolean = True
	Dim EsPrimeraVezVueltas As Boolean = True


End Sub

Sub Service_Create
	'Entra la primera vez que se inicia el servicio. Aquí puedes inicializar los procesos y las variables globales. Al iniciar un Servicio, este se mantiene en marcha 
	'hasta que se llame a StopService o hasta que se destruya

End Sub

Sub Service_Start (StartingIntent As Intent)
	'Entra cada vez que llames a StartService o StartServiceAt. Cuando estos Sub ejecuta el proceso pasa a primer plano. Lo que significa que el Sistema Operativo no va a 
	'matar el proceso hasta que este Sub termine de ejecutarse. Si quieres ejecutar algún código cada cierto tiempo, es en este Sub donde debes poner el código
	
	Log("Ejecutando...")
	
	
	
'	'nuevo!!!
'	DatosGlobales.Ejecutandose = True


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




	Dim rs As ResumableSub = IniciarProceso(DatosGlobales.ColMobilRutaOrigen)
	Wait For(rs) complete

	
	
	
	' ##########################################################################################################
	' SERVICIO
	
	If DatosGlobales.Configurando = False Then

		Log("Ejecutandose: " & DatosGlobales.Ejecutandose)

	
		DateTime.TimeFormat="HH:mm:ss"
		'Hora = DateTime.Time(DateTime.Now)
	
		'MostrarNotificacion("Fotos", "Ejecutando... son las: " & Hora)
	
	
		If EsPrimeraVez = True Then
		
			StartActivity(Login)
			'Wait For Activity_Resume
		
			If DatosGlobales.LogOk Then
				EsPrimeraVez= False
				If DatosGlobales.Ejecutandose = False Then
					Try
						StartActivity(Backup)
						'Wait For Activity_Resume 'probando
						Log("Paso por aca 'Activity_Resume'")
					Catch
						Log(LastException)
						DatosGlobales.Ejecutandose = False
					End Try
				Else
					Log("No se puede ejecutar BKP porque una copia esta en curso...")
			
				End If
			End If
		
		Else
			
			If DatosGlobales.Ejecutandose = False Then
				'DatosGlobales.Ejecutandose = True
				Try
					StartActivity(Backup)
				Catch
					Log(LastException)
					DatosGlobales.Ejecutandose = False
				End Try
			Else
				Log("No se puede ejecutar BKP porque una copia esta en curso...")
			
			End If
			
		End If
	
	
		Log("Estado al finalizar de 'Ejecutandose': " & DatosGlobales.Ejecutandose)
	
	End If
	
	
	
	
	
	' ###########################################################################################################
	
	
	StartServiceAt(Me, DateTime.Now + 10 * DateTime.TicksPerSecond, True) ' para segundos
	
	
	Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
	
	
	
End Sub

Sub Service_Destroy
	'Entra cuando se llama a StopService. El servicio no se ejecuta después de este Sub hasta que lo vuelva a llamar StartService, que volverá a llamar a 
	'Sub Service_Create y después Sub Service_Start


	

End Sub





' ###################################################################################################################################################################


Private Sub CrearNotificacion(Titulo As String, Mensaje As String) 'As Notification
	'Dim n As Notification
	
	'n.AutoCancel = True
	'n.Initialize
	
	
	
	n.Initialize2(n.IMPORTANCE_LOW) 'para q no haga sonido cada vez q se ejecuta
	n.Icon = "icon"
	n.Vibrate = False
	n.Sound = False
	n.Light = False
	n.SetInfo(Titulo, Mensaje, Me)
	
	
	
	Service.StartForeground(1,n)
	
	'Return n
	
End Sub

























#Region "FTP"



Sub GuardarArchivoEnElServidor (PathDelServidor As String, Ip As String, Puerto As Int, Usuario As String, Contra As String, RutaMobile As String, ArchivoMobileFull As String, TipoDeOperacion As Int) As ResumableSub
	Dim Path As String = ""
	 
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
	Dim FechaArchivo As String = FxGlobales.Right(ArchivoMobileFull, (ArchivoMobileFull.Length - ArchivoMobileFull.IndexOf(";")-1))

	If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo,"") = False Then
		Dim sf As Object = FTP3.SendCommand("MKD", PathDelServidor & "/" & Path)
		Wait For (sf) FTP_CommandCompleted(Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
	Else
		Log("No pudo crear carpeta: " & PathDelServidor & "/" & Path & "!!!")
	End If
	
	If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo,"") = False Then
		Dim sf2 As Object = FTP3.SendCommand("MKD", PathDelServidor & "/" & Path & "/" & FechaArchivo)
		Wait For (sf2) FTP_CommandCompleted(Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
	Else
		Log("No pudo crear carpeta: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & "!!!")
	End If
	
				
'	currentFileSize = File.Size(RutaMobile, ArchivoMobile) ' --> asi es como funcionaba 26/08/2023
'	FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE  --> asi es como funcionaba 26/08/2023
	
	'#############################################################################################################################################################
	'AGREGADO 09/09/2023


	' ####################################################################################################################################################################
	' PROBANDO POR QUE NO FUNCIONA VERIFICAR ARCHIVO
'	
'	If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile,"") = True Then
'		Log("EXISTE --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile)
'		Else
'		Log("NO EXISTE!!! --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile)
'	End If
'	
'	
	
	'VERIFICO SI EL ARCHIVO YA EXISTE EN EL SERVIDOR
	Dim rs As ResumableSub = EncontroArchivoEnServidor(PathDelServidor & "/" & Path & "/" & FechaArchivo & "/", ArchivoMobile) 'ej: EncontroArchivoEnServidor("./H/DiscoCompartido/RiBackup/Fotos/20230924/", "Foto_Bath_Puerta.jpg")
	Wait For(rs) complete (Result As Boolean)
	If Result = True Then
		'Msgbox("Encontrado", "")
		
		Log("EXISTE --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile & " # ENTONCES NO HAGO NADA!!!")
	
		'pb.Progress = 100
	
	Else
		'Msgbox("No encontrado", "")
		Log("NO EXISTE!!! --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile & " # ENTONCES SUBO EL ARCHIVO AL SERVER")
		
		
		'SUBO AL SERVER EL ARCHIVO
		currentFileSize = File.Size(RutaMobile, ArchivoMobile)
		Dim complete As Object = FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE

		Wait For (complete) FTP_UploadCompleted (ServerPath As String, Success As Boolean)
		'If Success Then pb.Progress = 100
				
	End If


	
	' ####################################################################################################################################################################


	'### esto asi andaba hasta el 25/09/2023
'	currentFileSize = File.Size(RutaMobile, ArchivoMobile)
'	Dim complete As Object = FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE
	'
'	Wait For (complete) FTP_UploadCompleted (ServerPath As String, Success As Boolean)
'	If Success Then pb.Progress = 100
	
	CantEnCurso = CantEnCurso + 1
	'LblTexto.Text = CantEnCurso & "/" & CantidadTotal
	
	CrearNotificacion("Mensaje del sistema", "Copiando: " & CantEnCurso & "/" & CantidadTotal)
			
	Log("Cantidad en curso: " & CantEnCurso & CRLF & "Cantidad Total: " & CantidadTotal)
	
			
	If CantEnCurso >= CantidadTotal Then
		'si pudo completar todo el backup, tiene que cambiar la varible primeravez a cero para que no vuelva a hacerlo
		Dim unXml As String = CargarElXML  'la tengo q generar modificada solo para esta funcion
		File.WriteString(File.DirInternal,"config.xml",unXml) 'lo grabo

		'Msgbox("Se ha terminado la copia de seguridad", "Mensaje del sistema")
		ToastMessageShow("Se ha terminado la copia de seguridad", True)
					
		Awake.ReleaseKeepAlive 'liberar
					
		If	FTP3.IsInitialized Then
			FTP3.CloseNow
		End If
					
		If	FTP4.IsInitialized Then
			FTP4.CloseNow
		End If
				
		CantEnCurso = 0
		CantidadTotal = 0
	
	
		DatosGlobales.Ejecutandose = False
		'Activity.Finish
				
	End If
	'#############################################################################################################################################################

	Return True
	
End Sub



Sub FTP_UploadProgress (ServerPath As String, TotalUploaded As Long, Total As Long)
'	
'	LblProgre.Text = "COPIANDO [" & TotalUploaded & "]"
'	
'	pb.Progress = 100 * TotalUploaded / currentFileSize
'	
	
	CrearNotificacion("Mensaje del sistema", "Copiando: " & CantEnCurso & "/" & CantidadTotal & CRLF & "COPIANDO [" & TotalUploaded & "]")
	
End Sub



#End Region




#Region "MOBILE"


Sub IniciarProceso (ColMobilRutaOrigen As List) As ResumableSub
	
	
	Log("Inicio proceso")
	
	Awake.KeepAlive(True)
		
	ListaCompleta.Initialize
	ListaFotos.Initialize
	ListaVideos.Initialize
		
	ListaCompleta.Clear
	ListaFotos.Clear
	ListaVideos.Clear
		
		
	'#####################################################################################################################################
	'para saber total real de lo que son las imagenes y videos
		
	'Con el "i" recorro la lista con los path que se backupearan por ej: [MobilRutaFotos;/sdcard/Pictures/Fotos, MobilRutaVideos;/sdcard/Pictures/Videos]
	For i = 0 To ColMobilRutaOrigen.Size-1
		Try
			Dim ContenidoColeccion_ As String= ColMobilRutaOrigen.Get(i)
			Dim Ruta_ As String = (FxGlobales.Right(ContenidoColeccion_, (ContenidoColeccion_.Length - ContenidoColeccion_.IndexOf(";")-1)))
			
			'asi funcionaba 23/09/2023
			'Dim ListaGenerica_ As List = File.ListFiles(Ruta_) '### ARMAR FUNCION PARA LISTAR TODOS / LOS DEL DIA
			
			Dim PrimeraVez As Boolean
			If DatosGlobales.XML_PrimeraVez = "1" Then
				PrimeraVez= True
			Else
				PrimeraVez= False
			End If
	
			Dim ListaGenerica_ As List = DevolverLista(Ruta_, PrimeraVez)
			
				
				
			For	h = 0 To ListaGenerica_.Size-1
				Dim Extension As String = ""
				Dim Archivox As String = ListaGenerica_.Get(h)
				Extension = FxGlobales.Right(Archivox, 3)
				If Extension.ToUpperCase = "JPG" Then
					If DatosGlobales.XML_ChFotosCamara = "1" Or DatosGlobales.XML_ChImagenesWhatsApp = "1" Then
						CantidadTotal = CantidadTotal + 1
					End If
				Else If Extension.ToUpperCase = "MP4" Then
					If DatosGlobales.XML_ChVideosCamara = "1" Or DatosGlobales.XML_ChVideosWhatsApp = "1" Then
						CantidadTotal = CantidadTotal + 1
					End If
				End If
			Next
			'CantidadTotal = CantidadTotal + ListaGenerica_.Size
		Catch
			Log(LastException)
			Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
		End Try
		
	Next
	'#####################################################################################################################################
	
	
	
	If CantidadTotal > 0 Then
		

	
		'LblTexto.Text = ""
			
		For i = 0 To ColMobilRutaOrigen.Size -1
			
			Dim ContenidoColeccion As String= ColMobilRutaOrigen.Get(i)
			Dim Tipo As String = (FxGlobales.Left(ContenidoColeccion, ContenidoColeccion.IndexOf(";")))
			Dim Ruta As String = (FxGlobales.Right(ContenidoColeccion, (ContenidoColeccion.Length - ContenidoColeccion.IndexOf(";")-1)))
			
			Dim OperacionActual As Int
		
			'LblTexto.Text = "" '"Tipo: " & Tipo   ' --> comentado 26/09/2023 ya q borra al transferir dsd fotos a videos por ej.
				
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
									
								Else If OperacionActual = 2 Then 'MobilRutaImagenesWhatsApp [FOTOS DE WHATSAPP]
									Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.ImagenesWhatsApp)
									Wait For(rs) complete (result As Boolean)
								End If
							Catch
								'Msgbox("#ERROR: " & LastException & CRLF & ConcatFileDate  , "Mensaje del sistema")
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
								Else If OperacionActual = 3 Then 'MobilRutaImagenesWhatsApp [VIDEOS DE WHATSAPP]
									
									Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.VideosWhatsApp)
									Wait For(rs) complete (result As Boolean)
								End If
							Catch
								'							Msgbox("#ERROR: " & LastException & CRLF & ConcatFileDate, "Mensaje del sistema")
								'							DatosGlobales.Ejecutandose = False
							End Try
						
						End If
						
					Catch
						'Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
						'Log(LastException)
						'DatosGlobales.Ejecutandose = False
					End Try
					
					
					
					
				Next
				
			Catch
				Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
				Log(LastException & CRLF & "No paso la lista: " & Tipo & " -> Por no tener datos") 'no es error
				DatosGlobales.Ejecutandose = False
			End Try
			
			
				
		Next
			
		
		Log("Finalizo proceso")
		
		DatosGlobales.Ejecutandose = False
		
		Awake.ReleaseKeepAlive 'libero
	
	
	Else
		
		Awake.ReleaseKeepAlive 'liberar
			
		If	FTP3.IsInitialized Then
			FTP3.CloseNow
		End If
					
		If	FTP4.IsInitialized Then
			FTP4.CloseNow
		End If
				
		CantEnCurso = 0
		CantidadTotal = 0
	
		DatosGlobales.Ejecutandose = False
		Log("Finalizo proceso")
		'Activity.Finish
	
	
	End If 'fin de -> CantidadTotal > 0
	
	
	
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




Private Sub DevolverLista(unaRuta As String, esPrimeraVez As Boolean) As List
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
	
	
	If EsPrimeraVez = False Then
		
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
			
			If(FechaActual = unaFechaArchivo) Then
				unaListaProvisoria2.Add(unaListaProvisoria.Get(i))
			End If
		Next
		
		unaListaFinal = unaListaProvisoria2
			
	Else 'si es la primera vez le pasa todos los archivos
		
		unaListaFinal = File.ListFiles(unaRuta) ' [000_0964.JPG, 000_0965.JPG, 000_0966.JPG, 000_0967.JPG, 000_0967_.jpg, 000_0968.JPG, 000_0969.JPG, 000_0970.JPG, 000_0971.JPG, 000_0973.JPG, 000_0974.JPG, 000_0975.JPG, 000_0992_.jpg, Foto_Baño.jpg, SARASA]
		
	End If
	
	Return unaListaFinal
	
End Sub







Private Sub EncontroArchivoEnServidor(unaRutaServer As String, unArchivo As String) As ResumableSub
	Dim Resu As Boolean = False
	FTP_Consulta.List(unaRutaServer) 'ejemplo --> "./H/DiscoCompartido/RiBackup/Fotos/20230924/"
	Wait For FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	Dim TotalArchivos As Int = Files.Length
	If Success  Then
		For i = 0 To TotalArchivos-1
			If unArchivo = Files(i).Name Then
				'Files(i).Size
				'currentFileSize = File.Size(RutaMobile, ArchivoMobile)
				Resu = True
				Return Resu
			End If
		Next
	End If
	Return Resu
End Sub





