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
'	'These global variables will be declared once when the application starts.
'	'These variables can be accessed from all modules.
'
'	'Dim ContadorMinutos As Int
'	Dim Hora As String = ""
'	Dim Intentos As Int = 0 'cantidad de intentos hasta q prolongue la frecuencia de ejecucion
'	
'	
'	Dim EsPrimeraVez As Boolean = True
'	Dim EsPrimeraVezVueltas As Boolean = True
'	
'	
'	
'	Dim noti As Notification
'	
'	
''	Dim MyWiFi As MLwifi
'	
'
'	Dim R As Reflector
'	
'	
'	
'	Dim id As Int = 1 ' Identificador único para la notificación en primer plano.
'	
End Sub

Sub Service_Create
	DatosGlobales.EnPrincipal = False
	Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_NEVER
	'lock.PartialLock



'	Log("WIFI: " & MyWiFi.SSID)
'	Log("WIFI IPADRESS: " & MyWiFi.IpAddress)
'	Log("WIFI MACADRESS: " & MyWiFi.MACAddress)
	
	
'	Wait For (GetWifiInfo) Complete (WifiInfo As JavaObject)
'	If WifiInfo.IsInitialized Then
'		Log(WifiInfo.RunMethod("getSSID", Null))
'	End If


	

End Sub



'
'
'Sub Service_Start (StartingIntent As Intent)
'	
'	
'	
'	If DatosGlobales.EnPrincipal = False Then
'	
'		If DatosGlobales.Configurando = False Then
'
'			Log("Ejecutandose: " & DatosGlobales.Ejecutandose)
'
'		
''			DateTime.TimeFormat="HH:mm:ss"
''			Hora = DateTime.Time(DateTime.Now)
'		
'			'MostrarNotificacion("Fotos", "Ejecutando... son las: " & Hora)
'			'CrearNotificacion("Fotos","Esperando para hacer copia de seguridad")
'		
'			If EsPrimeraVez = True Then
'			
'				StartActivity(Login)
'			
'				If DatosGlobales.LogOk Then
'					EsPrimeraVez= False
'					If DatosGlobales.Ejecutandose = False Then
'						Try
'							
'							'If (MyWiFi.isWifiConnected = True) And ((MyWiFi.SSID = "kuaiyu-LczZPB") Or (MyWiFi.SSID = "SNM_Fondo")) Then 'kuaiyu-LczZPB --> WIFI del emulador
'								StartActivity(Backup)
'								Log("Paso por aca 'Activity_Resume'")
'								CrearNotificacion("Fotos","Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
''							Else
''								Log("No se encuentra en el Wifi preseteado")
''								CrearNotificacion("Fotos","No se encuentra en el Wifi preseteado" & DatosGlobales.CopiaPorcentEnCurso)
''							End If
'							
'						Catch
'							Log(LastException)
'							DatosGlobales.Ejecutandose = False
'						End Try
'					Else
'						Log("No se puede ejecutar BKP porque una copia esta en curso...")
'				
'					End If
'				End If
'			
'			Else 'EsPrimeraVez = False
'				
'				If DatosGlobales.Ejecutandose = False Then
'					'DatosGlobales.Ejecutandose = True
'					Try
'						Log("Ejecutandose NO por primera vez...")
'						
'						'If (MyWiFi.isWifiConnected = True) And ((MyWiFi.SSID = "kuaiyu-LczZPB") Or (MyWiFi.SSID = "SNM_Fondo")) Then 'kuaiyu-LczZPB --> WIFI del emulador
'							StartActivity(Backup)
'							CrearNotificacion("Fotos","Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
''						Else
''							Log("No se encuentra en el Wifi preseteado")
''							CrearNotificacion("Fotos","No se encuentra en el Wifi preseteado" & DatosGlobales.CopiaPorcentEnCurso)
''						End If
'					Catch
'						Log(LastException)
'						DatosGlobales.Ejecutandose = False
'					End Try
'				Else
'					Log("No se puede ejecutar BKP porque una copia esta en curso...")
'				
'				End If
'				
'			End If
'		
'		
'			Log("Estado al finalizar de 'Ejecutandose': " & DatosGlobales.Ejecutandose)
'		
'		End If
'		
'		
'		If DatosGlobales.Ejecutandose = True Then
'			CrearNotificacion("Fotos","Copia en progreso... " & DatosGlobales.CopiaPorcentEnCurso)
'		Else
'			If DatosGlobales.CopiaPorcentEnCurso = "100%" Then
'				Log("Esperando para hacer copia de seguridad...")
'				CrearNotificacion("Fotos","Copia en progreso... " & "100%")
'				DatosGlobales.CopiaPorcentEnCurso = "0%"
'			Else
'				Log("Esperando para hacer copia de seguridad...")
'				CrearNotificacion("Fotos","Esperando para hacer copia de seguridad...")
'			End If
'		End If
'	
'	End If 'fin de DatosGlobales.Principal
'	
'	
'	StartServiceAt(Me, DateTime.Now + DatosGlobales.Segundos * DateTime.TicksPerSecond, True) ' para segundos
'
'	
'	'StartServiceAt(Me, DateTime.Now + 10 * DateTime.TicksPerSecond, True) ' para segundos
'	'StartServiceAt(Me, DateTime.Now + 1 * DateTime.TicksPerMinute , True) ' para minutos
'	'StartServiceAt(Me, DateTime.Now + 5 * DateTime.TicksPerHour , True) ' para horas
'	
''	
''	If DatosGlobales.Ejecutandose = False Then
'	'
''		If DatosGlobales.EnPrincipal = False Then
''			Intentos = Intentos + 1
''			If Intentos = 20 Then
''				DatosGlobales.Segundos = 1800 '30 minutos
''				'DatosGlobales.Segundos = 60 '1 mins
''			End If
''		Else
''			Intentos = 0
''			DatosGlobales.Segundos = 10
''		End If
'	'
''		
''	Else 'ejecutandose
''		Intentos = 0
''		DatosGlobales.Segundos = 10
''				
''	End If
'	
'	'
''	Log("--> EJECUTANDOSE: " & DatosGlobales.Ejecutandose & " - INTENTOS: " & Intentos & " - SEGUNDOS: " & DatosGlobales.Segundos & " <--")
'
'
'
'	'Log("##### INTENTOS: " & Intentos)
'
'	
'End Sub
'
'Sub Service_Destroy
'
'End Sub
'
'
'Public Sub EjecutarPrograma
'	
'	Log("Se ejecuto el programa!!!")
'	
'	'MostrarNotificacion("Fotos","Se ha completado la copia de seguridad!!!")
'	
'	
'End Sub
'
'
'
'' #########################################################################################################################################################################
'' ACA VIENE EL PROGRAMA
'' #########################################################################################################################################################################
'
''
''Private Sub MostrarNotificacion(Titulo As String, Mensaje As String)
''	Dim n As Notification
''	
''	'n.AutoCancel = True
''	
''	n.Initialize
''	n.Icon = "icon"
''	n.Vibrate = False
''	n.Sound = False
''	n.Light = False
''	n.SetInfo(Titulo, Mensaje, Me)
''	
''	
''	
''	Service.StartForeground(1,n)
''	
''	
''	
''End Sub
'
'
'
'
'
'Private Sub CrearNotificacion(Titulo As String, Mensaje As String) 'As Notification
'	'Dim noti As Notification
'	
'	'noti.AutoCancel = True
'	'noti.Initialize
'	
'	noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no haga sonido cada vez q se ejecuta
'	noti.Icon = "icon"
'	noti.Vibrate = False
'	noti.Sound = False
'	noti.Light = False
'	'noti.SetInfo(Titulo, Mensaje, Me)
'	
'	noti.SetInfo(Titulo, Mensaje, Principal)
'
'	
'	Service.StartForeground(1,noti)
'	
'	'Return noti
'	
'End Sub
'
'
'
'
'
'Sub GetWIFIName As String
' 
'	'Requires Permission to be added with the Manifest Editor:
'	'                         AddPermission (android.permission.ACCESS_NETWORK_STATE)
' 
'	R.Target=R.GetContext
'	Try
'		R.Target=r.RunMethod2("getSystemService","wifi","java.lang.String")
'		R.Target=R.RunMethod("getConnectionInfo")
'		R.Target=R.RunMethod("getSSID")
'		Return R.Target
'	Catch
'		Return "none"
'	End Try
'End Sub
'
'
'
''Sub GetWifiInfo As ResumableSub
''	Dim p As Phone
''	Dim WifiManager As JavaObject
''	Dim WifiInfo As JavaObject
''	WifiManager = WifiManager.InitializeContext.RunMethod("getSystemService", Array("wifi"))
''	If p.SdkVersion >= 27 Then
''		Dim rp As RuntimePermissions
''		rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
''		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
''		If Result = False Then Return WifiInfo
''	End If
''	WifiInfo = WifiManager.RunMethod("getConnectionInfo", Null)
''	Return WifiInfo
''End Sub
