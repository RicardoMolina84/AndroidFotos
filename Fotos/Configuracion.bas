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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private EtFotosCamara As EditText
	Private EtVideosCamara As EditText
	Private EtImagenesWhapp As EditText
	Private EtVideosWhapp As EditText
	Private SvConfiguracion As ScrollView
	Private EtCarpetaServerBkp As EditText
	Private EtServidorRuta As EditText
	Private EtServidorIp As EditText
	Private EtServidorPuerto As EditText
	Private EtServidorUsuario As EditText
	Private EtServidorClave As EditText
	
	Private BtnGuardar As Button
	
	

	
	Private EtUsuario As EditText
	Private EtClave As EditText
	Private EtClaveConf As EditText
	Private CbRecordar As CheckBox

	Private ChFotosCamara As CheckBox
	Private ChVideosCamara As CheckBox
	Private ChImagenesWhapp As CheckBox
	Private ChVideosWhapp As CheckBox
	
	Private XML_ChFotosCamara_Hist As String = DatosGlobales.XML_ChFotosCamara
	Private XML_ChVideosCamara_Hist As String = DatosGlobales.XML_ChVideosCamara
	Private XML_ChImagenesWhatsApp_Hist As String = DatosGlobales.XML_ChImagenesWhatsApp
	Private XML_ChVideosWhatsApp_Hist As String = DatosGlobales.XML_ChVideosWhatsApp

	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	

	
	DatosGlobales.Configurando = True
	
	FxGlobales.LeerXML()
	
	
	
	Activity.LoadLayout("configuracion")
	SvConfiguracion.Panel.LoadLayout("configuracionContenido")
	SvConfiguracion.Panel.Width = 320dip
	SvConfiguracion.Panel.Height = 1100dip
	
	'Usuario
	EtUsuario.Text = DatosGlobales.XML_Usuario
	EtClave.Text = DatosGlobales.XML_Contraseña
	EtClaveConf.Text = DatosGlobales.XML_Contraseña
	
	If DatosGlobales.XML_Recordar = "1" Then
		CbRecordar.Checked = True
	Else
		CbRecordar.Checked = False
	End If

	
	
	'Ruta Origen
	EtFotosCamara.Text = DatosGlobales.XML_FotosCamara
	EtVideosCamara.Text = DatosGlobales.XML_VideosCamara
	EtImagenesWhapp.Text = DatosGlobales.XML_ImagenesWhatsApp
	EtVideosWhapp.Text = DatosGlobales.XML_VideosWhatsApp
	
	
	If DatosGlobales.XML_ChFotosCamara = "1" Then
		ChFotosCamara.Checked = True
	Else
		ChFotosCamara.Checked = False
	End If
	
	If DatosGlobales.XML_ChVideosCamara = "1" Then
		ChVideosCamara.Checked = True
	Else
		ChVideosCamara.Checked = False
	End If
	
	If DatosGlobales.XML_ChImagenesWhatsApp = "1" Then
		ChImagenesWhapp.Checked = True
	Else
		ChImagenesWhapp.Checked = False
	End If
	
	If DatosGlobales.XML_ChVideosWhatsApp = "1" Then
		ChVideosWhapp.Checked = True
	Else
		ChVideosWhapp.Checked = False
	End If
	
	
	
	
	'Ruta Destino (carpeta)
	EtCarpetaServerBkp.Text = DatosGlobales.XML_UsuarioRutaFotos
	
	'Server FTP
	EtServidorRuta.Text = DatosGlobales.XML_ServidorRuta
	EtServidorIp.Text = DatosGlobales.XML_ServidorIp
	EtServidorPuerto.Text = DatosGlobales.XML_ServidorPuerto
	EtServidorUsuario.Text = DatosGlobales.XML_ServidorUsuario
	EtServidorClave.Text = DatosGlobales.XML_ServidorClave
	

End Sub

Sub Activity_Resume
	
	DatosGlobales.Configurando = True

End Sub

Sub Activity_Pause (UserClosed As Boolean)

	DatosGlobales.Configurando = False

End Sub






Private Sub BtnGuardar_Click
'	If ValidarDatos = False Then
'		Msgbox("#ERROR: no se han completado todos los datos.", "Mensaje del sistema")
'		Return
'	End If
	
	If EtClave.Text <> "" And (EtClave.Text <> EtClaveConf.Text) Then
		Msgbox("#ERROR: la clave ingresada no es correcta.","Mensaje del sistema")
		Return
	End If
	
	Dim unXml As String = CargarElXML
	File.WriteString(File.DirInternal,"config.xml",unXml) 'lo grabo
	
	
	'lo cargo para tener las nuevas variables modificadas en caso de haber cambios
	FxGlobales.LeerXML()
	
	
	If DatosGlobales.XML_PrimeraVez = "1" Then
		File.WriteString(File.DirInternal,"indicefullbkp.txt", "-1") 'lo reseteo para primera vez
		DatosGlobales.IndiceFullBkp = File.ReadString(File.DirInternal,"indicefullbkp.txt")
		
		If DatosGlobales.IndiceFullBkp > 0 Then
			DatosGlobales.IndiceFullBkp = DatosGlobales.IndiceFullBkp - 1
		End If
		
	End If
	
		
	Activity.Finish
	
End Sub



Private Sub ValidarDatos() As Boolean
	Dim Resultado As Boolean = True


	If EtUsuario.Text = "" Then
		Resultado = False
	End If

	If EtClave.Text = "" Then
		Resultado = False
	End If

	If EtClaveConf.Text = "" Then
		Resultado = False
	End If
	
	If EtFotosCamara.Text = "" Then
		Resultado = False
	End If
	
	If EtVideosCamara.Text = "" Then
		Resultado = False
	End If
	
	If EtImagenesWhapp.Text = "" Then
		Resultado = False
	End If

	If EtVideosWhapp.Text = "" Then
		Resultado = False
	End If
	
	If EtCarpetaServerBkp.Text = "" Then
		Resultado = False
	End If

	If EtServidorRuta.Text = "" Then
		Resultado = False
	End If
	
	If EtServidorIp.Text = "" Then
		Resultado = False
	End If
	
	If EtServidorPuerto.Text = "" Then
		Resultado = False
	End If
	
	If EtServidorUsuario.Text = "" Then
		Resultado = False
	End If
	
	If EtServidorClave.Text = "" Then
		Resultado = False
	End If
	
	Return Resultado
End Sub



Private Sub CargarElXML As String
	
	' #############################################################################################################################################################################################	
	'Evaluo antes de grabar si se cambiaron los check para modificar el bool de primeravez para que haga el bkp completo
	
	'ChFotosCamara
	If ChFotosCamara.Checked And XML_ChFotosCamara_Hist = "0"  Then
		DatosGlobales.XML_PrimeraVez = "1"
	End If

	'ChVideosCamara
	If ChVideosCamara.Checked And XML_ChVideosCamara_Hist = "0" Then
		DatosGlobales.XML_PrimeraVez = "1"
	End If
	
	'ChImagenesWhatsApp
	If ChImagenesWhapp.Checked And XML_ChImagenesWhatsApp_Hist = "0" Then
		DatosGlobales.XML_PrimeraVez = "1"
	End If

	'ChVideosWhatsApp
	If ChVideosWhapp.Checked And XML_ChVideosWhatsApp_Hist = "0" Then
		DatosGlobales.XML_PrimeraVez = "1"
	End If

	If (ChFotosCamara.Checked = False) And (ChVideosCamara.Checked = False) And (ChImagenesWhapp.Checked = False) And (ChVideosWhapp.Checked = False) Then
		DatosGlobales.XML_PrimeraVez = "0"
	End If


	' #############################################################################################################################################################################################
	
	
	Dim ArchivoXml As String = "<?xml version=""""1.0"""" encoding=""""UTF-8""""?>" & CRLF & ""
	ArchivoXml = ArchivoXml & "<fotos>" & CRLF & ""
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	
	ArchivoXml = ArchivoXml & " <login>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <usuario>" & EtUsuario.Text & "</usuario>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <contraseña>" & EtClave.Text & "</contraseña>"  & CRLF & ""
	ArchivoXml = ArchivoXml & "   <recordar>" & DatosGlobales.XML_Recordar & "</recordar>"  & CRLF & ""
	ArchivoXml = ArchivoXml & " </login>"  & CRLF & ""
	
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	ArchivoXml = ArchivoXml & " <ruta_origen>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <fotoscamara>" & EtFotosCamara.Text & "</fotoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <videoscamara>" & EtVideosCamara.Text & "</videoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <imageneswhatsapp>" & EtImagenesWhapp.Text & "</imageneswhatsapp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <videoswhatsapp>" & EtVideosWhapp.Text & "</videoswhatsapp>" & CRLF & ""

	ArchivoXml = ArchivoXml & "   <chfotoscamara>" & DatosGlobales.XML_ChFotosCamara & "</chfotoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <chvideoscamara>" & DatosGlobales.XML_ChVideosCamara & "</chvideoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <chimageneswhatsapp>" & DatosGlobales.XML_ChImagenesWhatsApp & "</chimageneswhatsapp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <chvideoswhatsapp>" & DatosGlobales.XML_ChVideosWhatsApp & "</chvideoswhatsapp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <primeravez>" & DatosGlobales.XML_PrimeraVez & "</primeravez>" & CRLF & "" 
	
	ArchivoXml = ArchivoXml & " </ruta_origen>" & CRLF & ""
	
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	ArchivoXml = ArchivoXml & " <ruta_destino>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <UsuarioRutaFotos>" & EtCarpetaServerBkp.Text & "</UsuarioRutaFotos>" & CRLF & ""
	ArchivoXml = ArchivoXml & " </ruta_destino>" & CRLF & ""
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	
	ArchivoXml = ArchivoXml & " <ftp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorruta>" & EtServidorRuta.Text & "</servidorruta>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorip>" & EtServidorIp.Text & "</servidorip>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorpuerto>" & EtServidorPuerto.Text & "</servidorpuerto>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorusuario>" & EtServidorUsuario.Text & "</servidorusuario>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorclave>" & EtServidorClave.Text & "</servidorclave>" & CRLF & ""
	ArchivoXml = ArchivoXml & " </ftp>" & CRLF & ""
	
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	ArchivoXml = ArchivoXml & "</fotos>" & CRLF & ""
	
	
	'Log(ArchivoXml)
	
	Return ArchivoXml
	

	
End Sub


Private Sub CbRecordar_CheckedChange(Checked As Boolean)
	If CbRecordar.Checked = True Then
		DatosGlobales.XML_Recordar = "1"
	Else
		DatosGlobales.XML_Recordar = "0"
	End If
End Sub


Private Sub ChFotosCamara_CheckedChange(Checked As Boolean)
	If ChFotosCamara.Checked = True Then
		DatosGlobales.XML_ChFotosCamara = "1"
	Else
		DatosGlobales.XML_ChFotosCamara = "0"
	End If
End Sub

Private Sub ChVideosCamara_CheckedChange(Checked As Boolean)
	If ChVideosCamara.Checked = True Then
		DatosGlobales.XML_ChVideosCamara = "1"
	Else
		DatosGlobales.XML_ChVideosCamara = "0"
	End If
End Sub

Private Sub ChImagenesWhapp_CheckedChange(Checked As Boolean)
	If ChImagenesWhapp.Checked = True Then
		DatosGlobales.XML_ChImagenesWhatsApp = "1"
	Else
		DatosGlobales.XML_ChImagenesWhatsApp = "0"
	End If
End Sub

Private Sub ChVideosWhapp_CheckedChange(Checked As Boolean)
	If ChVideosWhapp.Checked = True Then
		DatosGlobales.XML_ChVideosWhatsApp = "1"
	Else
		DatosGlobales.XML_ChVideosWhatsApp = "0"
	End If
End Sub