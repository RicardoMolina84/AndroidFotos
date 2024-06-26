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

' ################################################################################################################################################################
' SERVICIO

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	Dim noti As Notification
	
	Dim IdNotificacion As Int = 1 ' Identificador único para la notificación en primer plano.
	Dim Contador As Int = 0
	
'	Dim MyWiFi As MLwifi
'	Dim R As Reflector
'	Dim Gps As Location
	
	Dim FtpTest As FTP
	FtpTest.PassiveMode = True

End Sub

Sub Service_Create

	Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_NEVER
	
	Log("Cantidad: " & Contador)
	CrearNotificacion(IdNotificacion, "Mensaje del sistema", "Cantidad: " & Contador)
	
	Service.StartForeground(IdNotificacion,noti)
	
	'agrego para cargar los datos
		'Inicializar el ftp de prueba
	
'	If DatosGlobales.LogOk = True Then
'			If FtpTest.IsInitialized = False Then
'				FtpTest.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
'				FtpTest.PassiveMode = True
'					
'			End If
'	End If

	
	
Log("Llego hasta aca?")
	
End Sub

Sub Service_Start (StartingIntent As Intent)
	
	
	If DatosGlobales.LogOk = True Then
		'Intenta conectar al servidor FTP 
		FtpTest.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
		FtpTest.PassiveMode = True
					
		Dim rs As ResumableSub = ValidarCnxServidor(DatosGlobales.XML_ServidorRuta) 'Valida conexion al servidor FTP
		Wait For(rs) Complete (Result As Boolean)
		If Result = True Then 'Se pudo conectar al servidor FTP
			Log("Pudo conectar al server ok")
			'ToastMessageShow("Pudo conectar al server ok", False)
		
			Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
	
			Contador = Contador + 1
	
			'	Log("WIFI: " & GetWIFIName)
			'	Log("Esta conectado al wifi: " & MyWiFi.isWifiConnected & " - WIFI conectado: " & MyWiFi.SSID & " - IPADDRESS:" & MyWiFi.IpAddress)
			'	If (MyWiFi.isWifiConnected = True) And ((MyWiFi.SSID = "kuaiyu-LczZPB") Or (MyWiFi.SSID = "SNM_Fondo")) Then 'kuaiyu-LczZPB --> WIFI del emulador
			'		Log("Conectado al wifi y a uno de los wifi habilitados")
			'	End If
				
			Log("Cantidad: " & Contador)
	
			If Contador <= 5 Then
				ModificarNotificacion(IdNotificacion, "Mensaje del sistema", "Cantidad: " & Contador)
			Else 'if Contador = 6 Then
				'Log("Paso por = 6")
				EliminarNotificacion(IdNotificacion)
			End If

			If Contador = 10 Then
				Log("LLego a diez!!!")
				Contador = 0
				EliminarNotificacion(IdNotificacion)
				StopService(Me)
			End If
		
		
		Else 'No se pudo conectar al servidor FTP!!!
			Log("No se pudo conectar al server!!!")
			'ToastMessageShow("No se pudo conectar al server!!!", False)
			
			EliminarNotificacion(IdNotificacion)
			StopService(Me)
			
		End If

	
	
	Else
		StartActivity(Login)
		
	End If
	
	StartServiceAt(Me, DateTime.Now + DatosGlobales.Segundos * DateTime.TicksPerSecond, True) ' para segundos
	
End Sub

Sub Service_Destroy


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

'
'
'Sub GetWifiInfo
'	Dim p As Phone, str As String
'	Dim WifiManager As JavaObject
'	Dim WifiInfo As JavaObject, WiFiDHCP As JavaObject, WiFiState As JavaObject
'	WifiManager = WifiManager.InitializeContext.RunMethod("getSystemService", Array("wifi"))
'	If p.SdkVersion >= 27 Then
''		Dim rp As RuntimePermissions
''		rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
'		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
'		If Result = False Then Return
'	End If
'
'	WifiInfo = WifiManager.RunMethod("getConnectionInfo", Null)
'	Dim rawipaddress As Int = WifiInfo.RunMethod("getIpAddress",Null)
'   
'	Log("WiFi status " & WifiInfo)
'	WiFiState = WifiManager.RunMethod("getWifiState", Null)
'	Log("WiFi status " & WiFiState)
'	WiFiDHCP = WifiManager.RunMethod("getDhcpInfo", Null)
'	Log("WiFi DHCP status " & WiFiDHCP)
'	Dim gateway As Int = WiFiDHCP.GetField("gateway")
'	Log("Gateway: " & i2ip(gateway))
'End Sub
'
'
'
'Sub i2ip(address As Int) As String
'	Dim jo As JavaObject
'	jo.InitializeContext
'	Return(jo.RunMethod("i2ip2", Array(address)))
'End Sub
'
'
'
'Sub GetWIFIName As String
'	Dim R As Reflector
'	Dim SSID As String
'   
'	' Add this permission to the manifest: AddPermission (android.permission.ACCESS_NETWORK_STATE)
'   
'	R.Target = R.GetContext
'	Try
'		R.Target = R.RunMethod2("getSystemService", "connectivity", "java.lang.String")
'		R.Target = R.RunMethod("getActiveNetworkInfo")
'		R.Target = R.RunMethod("getExtraInfo")
'       
'		SSID = R.Target
'		SSID = SSID.SubString2(1, SSID.Length - 1)
'       
'		Return SSID
'	Catch
'		Return "none"
'	End Try
'End Sub




Private Sub ValidarCnxServidor(unaRuta As String) As ResumableSub
	Dim Resu As Boolean = False
	
	FtpTest.List(unaRuta)
	Wait For FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	Dim TotalCarpetas As Int = Folders.Length
	
	Log("Cantidad de carpetas leidas: " & TotalCarpetas & " ---> " & Success)
	
	If Success = True  Then
		Resu = True
	End If
	
	Return Resu
End Sub


