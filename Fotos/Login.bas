B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

	Private xui As XUI

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	'Private ParsedData As Map

	Private BtnIngresar As Button
	
	
'	Dim usuario As String
'	Dim contraseña As String 
'	Dim recordar As Int
	
	Private EtUsuario As EditText
	Private EtClave As EditText
	Dim intentos As Int = 0
	
	Private BtnConfig As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	
	DatosGlobales.Configurando = True
	DatosGlobales.LogOk = False
	
	Log("Llega a leer XML?")
	
	FxGlobales.LeerXML()

	Log("Termina de leer XML?")
	
	
	Activity.LoadLayout("login")
	
	
	'SI ACTIVO LA OPCION DE RECORDAR, NO PEDIRA LOGEO
	If DatosGlobales.XML_Recordar = 1 Then
		'OJO QUE ESTE HACE QUE NO SE VEA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
		Activity.Color = Colors.Transparent
		
		Log("EN LOGING - USUARIO: " & DatosGlobales.XML_Usuario)
		
		EtUsuario.Text = DatosGlobales.XML_Usuario
		EtClave.Text = DatosGlobales.XML_Contraseña
		
		BtnIngresar_Click
			
	End If



	'############################################################################################################
	' BORRAR
'	EtUsuario.Text = "rmolina"
'	EtClave.Text = "1234"
'	BtnIngresar_Click
	'############################################################################################################
	

End Sub









Sub Activity_Resume

	DatosGlobales.Configurando = True
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	Log("LOGIN: saliendo")
	DatosGlobales.Configurando = False
End Sub


Private Sub BtnIngresar_Click
	
	' probando el encriptado
'	Dim Ingresado As String = "Ricardo"
'	Dim Encriptado As String = FxGlobales.Encriptar(Ingresado)
'	Dim DesEncriptado As String = FxGlobales.DesEncriptar(Encriptado)
	'Msgbox("Encriptado: " & Encriptado & CRLF & "Desencriptado: " & DesEncriptado, "")
	
	
	'EtUsuario.Text = ""
	'EtClave.Text = ""
	

	
	Log("Usuario: " & DatosGlobales.XML_Usuario & " - CLAVE: " & DatosGlobales.XML_Contraseña)
	
	
	If EtUsuario.Text = DatosGlobales.XML_Usuario Then
		If EtClave.Text = DatosGlobales.XML_Contraseña Then
			DatosGlobales.LogOk = True
			Activity.Finish
		Else
			intentos = intentos +1
			
			If intentos <= 3 Then
				Msgbox("#ERROR: clave incorrecta.","Mensaje del sistema")
				Else
				Msgbox("#ERROR: Demasiados intentos incorrectos. El programa se cerrará.","Mensaje del sistema")
				
				'ExitApplication --> CON ESTE VUELVE A MAIN
				Dim jo As JavaObject
				jo.InitializeContext
				jo.RunMethod("finishAffinity",Null)
				
			End If
		End If
		
		Else
			Msgbox("#ERROR: usuario incorrecto.","Mensaje del sistema")
	End If
	
	
	
	'StartActivity(Main)
	
	
	
End Sub

   

 
   
   
   










Private Sub BtnConfig_Click
	StartActivity(Configuracion)
End Sub