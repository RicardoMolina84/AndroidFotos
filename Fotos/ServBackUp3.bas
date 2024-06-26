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

	'Dim ContadorMinutos As Int
	
	Dim noti As Notification
		
	'Dim Hora As String = ""
	'Dim Intentos As Int = 0 'cantidad de intentos hasta q prolongue la frecuencia de ejecucion
	
	
	Dim EsPrimeraVez As Boolean = True
	Dim EsPrimeraVezVueltas As Boolean = True
	
	
	Dim IdNotificacion As Int = 1 ' Identificador único para la notificación en primer plano.
	Dim Contador As Int = 0

	
	
	'Dim id As Int = 1 ' Identificador único para la notificación en primer plano.
	
	
	Dim FtpTest As FTP
	FtpTest.PassiveMode = True
	
End Sub

Sub Service_Create
	
	Log("ServBackUp3: PASO POR Service_Create")
	
	DatosGlobales.EnPrincipal = False
	Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_NEVER
	
	CrearNotificacion(IdNotificacion, "Mensaje del sistema", "En espera...")
	Service.StartForeground(IdNotificacion,noti)
	

End Sub





Sub Service_Start (StartingIntent As Intent)
	
	Try
		Log("ServBackUp3: PASO POR Service_Start")
	
		If DatosGlobales.EnPrincipal = False Then
	
			If DatosGlobales.Configurando = False Then

				Log("Ejecutandose: " & DatosGlobales.Ejecutandose)

			
				If EsPrimeraVez = True Then
			
					StartActivity(Login)
			
					If DatosGlobales.LogOk Then
						EsPrimeraVez= False
						If DatosGlobales.Ejecutandose = False Then
							Try
							
								Dim rs As ResumableSub = ValidarCnxServidor(DatosGlobales.XML_ServidorRuta) 'Valida conexion al servidor FTP
								Wait For(rs) Complete (Result As Boolean)
								If Result = True Then 'Se pudo conectar al servidor FTP
									Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
							
									'If (MyWiFi.isWifiConnected = True) And ((MyWiFi.SSID = "kuaiyu-LczZPB") Or (MyWiFi.SSID = "SNM_Fondo")) Then 'kuaiyu-LczZPB --> WIFI del emulador
									StartActivity(Backup)
									Log("Paso por aca 'Activity_Resume'")
									'CrearNotificacion("Fotos","Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
									ModificarNotificacion(IdNotificacion, "Fotos", "Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
								
'							Else
'								Log("No se encuentra en el Wifi preseteado")
'								CrearNotificacion("Fotos","No se encuentra en el Wifi preseteado" & DatosGlobales.CopiaPorcentEnCurso)
'							End If
								End If
							
							Catch
								Log("Paso por Catch 1 de Service_Start -> " & LastException)
								DatosGlobales.Ejecutandose = False
							End Try
						Else
							Log("No se puede ejecutar BKP porque una copia esta en curso...")
				
						End If
					End If
			
				Else 'EsPrimeraVez = False
				
					If DatosGlobales.Ejecutandose = False Then
						'DatosGlobales.Ejecutandose = True
						Try
							Log("Ejecutandose NO por primera vez...")
						
							Dim rs As ResumableSub = ValidarCnxServidor(DatosGlobales.XML_ServidorRuta) 'Valida conexion al servidor FTP
							Wait For(rs) Complete (Result As Boolean)
							If Result = True Then 'Se pudo conectar al servidor FTP
								Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
							
								'If (MyWiFi.isWifiConnected = True) And ((MyWiFi.SSID = "kuaiyu-LczZPB") Or (MyWiFi.SSID = "SNM_Fondo")) Then 'kuaiyu-LczZPB --> WIFI del emulador
								StartActivity(Backup)
								'CrearNotificacion("Fotos","Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
								ModificarNotificacion(IdNotificacion, "Fotos", "Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
'						Else
'							Log("No se encuentra en el Wifi preseteado")
'							CrearNotificacion("Fotos","No se encuentra en el Wifi preseteado" & DatosGlobales.CopiaPorcentEnCurso)
'						End If

							End If
					
						Catch
							Log("Paso por Catch 2 de Service_Start -> " & LastException)
							DatosGlobales.Ejecutandose = False
						End Try
					Else
						Log("No se puede ejecutar BKP porque una copia esta en curso...")
				
					End If
				
				End If
		
		
				Log("Estado al finalizar de 'Ejecutandose': " & DatosGlobales.Ejecutandose)
		
			End If
		
		
			If DatosGlobales.Ejecutandose = True Then
				'CrearNotificacion("Fotos","Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
				ModificarNotificacion(IdNotificacion, "Fotos", "Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
			Else
				If DatosGlobales.CopiaPorcentEnCurso = "100%" Then
					Log("Esperando para hacer copia de seguridad...")
					'CrearNotificacion("Fotos","Copia en progreso... " & "100%")
					DatosGlobales.CopiaPorcentEnCurso = "0%"
				Else
					Log("Esperando para hacer copia de seguridad...")
					CrearNotificacion(IdNotificacion, "Fotos","Esperando para hacer copia de seguridad...")
				End If
			End If
	
		End If 'fin de DatosGlobales.Principal
	
	
		StartServiceAt(Me, DateTime.Now + DatosGlobales.Segundos * DateTime.TicksPerSecond, True) ' para segundos

	
		'StartServiceAt(Me, DateTime.Now + 10 * DateTime.TicksPerSecond, True) ' para segundos
		'StartServiceAt(Me, DateTime.Now + 1 * DateTime.TicksPerMinute , True) ' para minutos
		'StartServiceAt(Me, DateTime.Now + 5 * DateTime.TicksPerHour , True) ' para horas
	Catch
		Log("#ERROR: en Service_Start --> " & LastException)
	End Try
	

	
	
End Sub

Sub Service_Destroy

	Log("ServBackUp3: PASO POR Service_Destroy")

End Sub


Public Sub EjecutarPrograma
	
	Log("Se ejecuto el programa!!!")
	
	'MostrarNotificacion("Fotos","Se ha completado la copia de seguridad!!!")
	
	
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
	StopService(Me)
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
	
	Log("Cantidad de carpetas leidas: " & TotalCarpetas & " ---> " & Success)
	
	If Success = True  Then
		Resu = True
	End If
	
	
	Log("### Fin de validacion de conexion al servidor ###")
	
	Return Resu
End Sub
