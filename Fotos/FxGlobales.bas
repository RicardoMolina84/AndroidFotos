B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=12.5
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub



Sub Left(Text As String, Length As Int)As String
	If Length>Text.Length Then Length=Text.Length
	Return Text.SubString2(0, Length)
End Sub

Sub Right(Text As String, Length As Int) As String
	If Length>Text.Length Then Length=Text.Length
	Return Text.SubString(Text.Length-Length)
End Sub

Sub Mid(Text As String, Start As Int, Length As Int) As String
	Return Text.SubString2(Start-1,Start+Length-1)
End Sub

Sub Split(Text As String, Delimiter As String) As String()
	Return Regex.Split(Delimiter,Text)
End Sub






Sub CStr(o As Object) As String
	Return "" & o
End Sub

Sub CInt(o As Object) As Int
	Return Floor(o)
End Sub

Sub CLng(o As Object) As Long
	Return Floor(o)
End Sub



Sub LTrim(s As String) As String
	Dim m As Matcher = Regex.Matcher("^(\s+)", s)
	If m.Find Then
		Return s.SubString(m.GetEnd(1))
	Else
		Return s
	End If
End Sub

Sub RTrim(s As String) As String
	Dim m As Matcher = Regex.Matcher("(\s+)$", s)
	If m.Find Then
		Return s.SubString(m.GetEnd(1))
	Else
		Return s
	End If
End Sub




'
'Public Sub DesactivarModoEstricto
'	Dim jo As JavaObject
'	jo.InitializeStatic("android.os.Build.VERSION")
'	If jo.GetField("SDK_INT") > 9 Then
'		Dim policy As JavaObject
'		policy = policy.InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder", Null)
'		policy = policy.RunMethodJO("permitAll", Null).RunMethodJO("build", Null)
'		Dim sm As JavaObject
'		sm.InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy", Array(policy))
'	End If
'End Sub


#Region "Encriptar"

	Public Sub Encriptar(Ingresado As String) As String
		Dim Encriptado As String = ""
		Dim Resultado As String = ""
		Dim c As B4XCipher
		Dim su As StringUtils
		Dim e() As Byte
		
		e = c.Encrypt(Ingresado.GetBytes("utf8"), DatosGlobales.PalabraClave)
		Encriptado = su.EncodeBase64(e)
		Resultado = Encriptado
		
		Return Resultado
	End Sub
	   
	Public Sub DesEncriptar(Ingresado As String) As String
		Dim DesEncriptado As String = ""
		Dim Resultado As String = ""
		Dim c As B4XCipher
		Dim su As StringUtils
		Dim e() As Byte

		e = su.DecodeBase64(Ingresado)
		e = c.Decrypt(e,DatosGlobales.PalabraClave)
		DesEncriptado = BytesToString(e, 0, e.Length, "utf8")
		Resultado = DesEncriptado
		Return Resultado
	End Sub

#Region




#Region "XML"

Public Sub LeerXML()
	'Dim unXml As String = CrearElXML
	'File.WriteString(File.DirInternal,"config.xml",unXml)
	
	
	If File.Exists(File.DirInternal,"config.xml") = True Then
		'leo archivo xml
		Dim texto As String = File.ReadString(File.DirInternal,"config.xml")
		
		'Msgbox(texto, "")
		
		'grabo las variables globales con los datos del archivo xml
		
		'login
		DatosGlobales.XML_Usuario = GetParamFromXML(texto, "usuario")
		DatosGlobales.XML_Contraseña = GetParamFromXML(texto, "contraseña")
		DatosGlobales.XML_Recordar = GetParamFromXML(texto, "recordar")
	
		'ruta_origen
'		DatosGlobales.XML_FotosCamara = File.DirRootExternal & GetParamFromXML(texto, "fotoscamara") ' --> "File.DirRootExternal &" --> esto no sirve para el emulador
'		DatosGlobales.XML_VideosCamara = File.DirRootExternal & GetParamFromXML(texto, "videoscamara") ' --> "File.DirRootExternal &" --> esto no sirve para el emulador
'		DatosGlobales.XML_ImagenesWhatsApp = File.DirRootExternal & GetParamFromXML(texto, "imageneswhatsapp") ' --> "File.DirRootExternal &" --> esto no sirve para el emulador
'		DatosGlobales.XML_VideosWhatsApp = File.DirRootExternal & GetParamFromXML(texto, "videoswhatsapp") ' --> "File.DirRootExternal &" --> esto no sirve para el emulador
		DatosGlobales.XML_FotosCamara =  GetParamFromXML(texto, "fotoscamara") ' --> "File.DirRootExternal &" --> esto no sirve para el emulador
		DatosGlobales.XML_VideosCamara =  GetParamFromXML(texto, "videoscamara") ' --> "File.DirRootExternal &" --> esto no sirve para el emulador
		DatosGlobales.XML_ImagenesWhatsApp =  GetParamFromXML(texto, "imageneswhatsapp") ' --> "File.DirRootExternal &" --> esto no sirve para el emulador
		DatosGlobales.XML_VideosWhatsApp =  GetParamFromXML(texto, "videoswhatsapp") ' --> "File.DirRootExternal &" --> esto no sirve para el emulador
	
	
		DatosGlobales.XML_ChFotosCamara = GetParamFromXML(texto, "chfotoscamara")
		DatosGlobales.XML_ChVideosCamara = GetParamFromXML(texto, "chvideoscamara")
		DatosGlobales.XML_ChImagenesWhatsApp = GetParamFromXML(texto, "chimageneswhatsapp")
		DatosGlobales.XML_ChVideosWhatsApp = GetParamFromXML(texto, "chvideoswhatsapp")
		
		DatosGlobales.XML_PrimeraVez = GetParamFromXML(texto, "primeravez") ' --> ESTA HAY Q PROGRAMARLA PARA QUE 
	
	
		Log("Cargando primera vez: " & DatosGlobales.XML_PrimeraVez)
		
	
		'ruta_destino
		DatosGlobales.XML_UsuarioRutaFotos = GetParamFromXML(texto, "UsuarioRutaFotos")
	
		'ftp
		DatosGlobales.XML_ServidorRuta = GetParamFromXML(texto, "servidorruta")
		DatosGlobales.XML_ServidorIp = GetParamFromXML(texto, "servidorip")
		DatosGlobales.XML_ServidorPuerto = GetParamFromXML(texto, "servidorpuerto")
		DatosGlobales.XML_ServidorUsuario = GetParamFromXML(texto, "servidorusuario")
		DatosGlobales.XML_ServidorClave = GetParamFromXML(texto, "servidorclave")
		
		
		
		'Cargo las variables del programa
		DatosGlobales.ServidorRuta = DatosGlobales.XML_ServidorRuta
		DatosGlobales.ServidorIp = DatosGlobales.XML_ServidorIp
		DatosGlobales.ServidorPuerto = DatosGlobales.XML_ServidorPuerto
		DatosGlobales.ServidorUsuario = DatosGlobales.XML_ServidorUsuario
		DatosGlobales.ServidorClave = DatosGlobales.XML_ServidorClave
'		
		
		
		DatosGlobales.UsuarioRutaFotos = DatosGlobales.ServidorRuta & DatosGlobales.XML_UsuarioRutaFotos 'aca elijo la ruta destino para las fotos	
		DatosGlobales.UsuarioRutaVideos = DatosGlobales.ServidorRuta & DatosGlobales.XML_UsuarioRutaFotos 'aca elijo la ruta destino para los videos

		
		'Cargo las variables destino desde el XML que se usaran en la colección a procesar
		DatosGlobales.MobilRutaFotosCamara = DatosGlobales.XML_FotosCamara
		DatosGlobales.MobilRutaVideosCamara = DatosGlobales.XML_VideosCamara
		DatosGlobales.MobilRutaImagenesWhapp = DatosGlobales.XML_ImagenesWhatsApp
		DatosGlobales.MobilRutaVideosWhapp = DatosGlobales.XML_VideosWhatsApp
		

		'Preguntar si habilitado al momento de agregarlos a la lista/coleccion
		DatosGlobales.ColMobilRutaOrigen.Initialize
		
		
		DatosGlobales.ColMobilRutaOrigen.Clear
		
		' --> DatosGlobales.ColMobilRutaOrigen  --> ESTA COLECCION TIENE TODOS LOS ARCHIVOS QUE SE BACKUPEARAN
		If DatosGlobales.XML_ChFotosCamara = "1" Then
			DatosGlobales.ColMobilRutaOrigen.Add("MobilRutaFotos;"& DatosGlobales.MobilRutaFotosCamara)  ' --> ESTA ES LA QUE HACE EL BACK UP DE TODAS LAS FOTOS DE LA CAMARA
		End If

		If DatosGlobales.XML_ChVideosCamara = "1" Then
			DatosGlobales.ColMobilRutaOrigen.Add("MobilRutaVideos;"& DatosGlobales.MobilRutaVideosCamara)  ' --> ESTA ES LA QUE HACE EL BACK UP DE TODA LOS VIDEOS DE LA CAMARA
		End If
		
		If DatosGlobales.XML_ChImagenesWhatsApp = "1" Then
			DatosGlobales.ColMobilRutaOrigen.Add("MobilRutaFotosWhapp;"& DatosGlobales.MobilRutaImagenesWhapp)  ' --> ESTA ES LA QUE HACE EL BACK UP DE TODAS LAS FOTOS DE WHAPP
		End If
				
		If DatosGlobales.XML_ChVideosWhatsApp = "1" Then
			DatosGlobales.ColMobilRutaOrigen.Add("MobilRutaVideosWhapp;"& DatosGlobales.MobilRutaVideosWhapp)  ' --> ESTA ES LA QUE HACE EL BACK UP DE TODAS LAS FOTOS DE WHAPP
		End If
		
	Else
		'si no existe el archivo deberia escribirlo vacio para completar todos los datos
		Dim unXml As String = CrearElXML
		File.WriteString(File.DirInternal,"config.xml",unXml)
		
	End If


	If File.Exists(File.DirInternal,"indicefullbkp.txt") = True Then
		'lo leo
		DatosGlobales.IndiceFullBkp = File.ReadString(File.DirInternal,"indicefullbkp.txt")
		If DatosGlobales.IndiceFullBkp > 2 Then
			DatosGlobales.IndiceFullBkp = DatosGlobales.IndiceFullBkp - 3
		Else If DatosGlobales.IndiceFullBkp > 1 Then
			DatosGlobales.IndiceFullBkp = DatosGlobales.IndiceFullBkp - 2
		Else If DatosGlobales.IndiceFullBkp > 0 Then
			DatosGlobales.IndiceFullBkp = DatosGlobales.IndiceFullBkp - 1
		End If
		
	Else
		'lo creo
		File.WriteString(File.DirInternal,"indicefullbkp.txt", "-1")
		DatosGlobales.IndiceFullBkp = File.ReadString(File.DirInternal,"indicefullbkp.txt")
	End If
	
	'ToastMessageShow("INDICE FULL BACKUP: " & DatosGlobales.IndiceFullBkp, True)
	Log("INDICE FULL BACKUP: " & DatosGlobales.IndiceFullBkp)
	
End Sub

Sub GetParamFromXML(sXML As String, ParameterName As String) As String
	Dim i1, i2 As Int
	Dim t1, t2 As String

	'LOCATE START AND END
	t1 = "<" & ParameterName & ">"
	t2 = "</" & ParameterName & ">"
	i1 = sXML.IndexOf(t1)
	i2 = sXML.IndexOf(t2)

	'MSG IF NOT FOUND
	If i1<0 Then
		LogColor("Not found in XML: " & ParameterName, Colors.Magenta)
		ToastMessageShow("Not found in XML: " & ParameterName, False)
		Return("0")
	End If

	LogColor("From XML: " & ParameterName & " = " & sXML.SubString2(i1+t1.Length, i2), Colors.Blue)
	'Msgbox(sXML.SubString2(i1+t1.Length, i2),"Resultado XML")
   
	'RESULT
	Return(sXML.SubString2(i1+t1.Length, i2))
   
End Sub





Public  Sub CrearElXML As String
	
	
	
	'XML por default hardcodeado de RI
'	Dim ArchivoXml As String = "<?xml version=""""1.0"""" encoding=""""UTF-8""""?>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "<fotos>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "" & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & " <login>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <usuario>rmolina</usuario>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <contraseña>1234</contraseña>"  & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <recordar>1</recordar>"  & CRLF & ""
'	ArchivoXml = ArchivoXml & " </login>"  & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & "" & CRLF & ""
'	ArchivoXml = ArchivoXml & " <ruta_origen>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <fotoscamara>/DCIM/Camera</fotoscamara>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <videoscamara>/DCIM/Camera</videoscamara>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <imageneswhatsapp>/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Images</imageneswhatsapp>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <videoswhatsapp>Tomate</videoswhatsapp>" & CRLF & ""
'	ArchivoXml = ArchivoXml & " </ruta_origen>" & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & "" & CRLF & ""
'	ArchivoXml = ArchivoXml & " <ruta_destino>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <UsuarioRutaFotos>RiBackup</UsuarioRutaFotos>" & CRLF & ""
'	ArchivoXml = ArchivoXml & " </ruta_destino>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "" & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & " <ftp>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <servidorruta>./H/DiscoCompartido/</servidorruta>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <servidorip>192.168.1.112</servidorip>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <servidorpuerto>21</servidorpuerto>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <servidorusuario>admin</servidorusuario>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <servidorclave>31119914</servidorclave>" & CRLF & ""
'	ArchivoXml = ArchivoXml & " </ftp>" & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & "" & CRLF & ""
'	ArchivoXml = ArchivoXml & "</fotos>" & CRLF & ""
'	Return ArchivoXml
	
	
	
	Dim ArchivoXml As String = "<?xml version=""""1.0"""" encoding=""""UTF-8""""?>" & CRLF & ""
	ArchivoXml = ArchivoXml & "<fotos>" & CRLF & ""
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	
	ArchivoXml = ArchivoXml & " <login>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <usuario></usuario>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <contraseña></contraseña>"  & CRLF & ""
	ArchivoXml = ArchivoXml & "   <recordar></recordar>"  & CRLF & ""
	ArchivoXml = ArchivoXml & " </login>"  & CRLF & ""
	
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	ArchivoXml = ArchivoXml & " <ruta_origen>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <fotoscamara></fotoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <videoscamara></videoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <imageneswhatsapp></imageneswhatsapp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <videoswhatsapp></videoswhatsapp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <chfotoscamara>0</chfotoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <chvideoscamara>0</chvideoscamara>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <chimageneswhatsapp>0</chimageneswhatsapp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <chvideoswhatsapp>0</chvideoswhatsapp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <primeravez>1</primeravez>"  & CRLF & ""
	ArchivoXml = ArchivoXml & " </ruta_origen>" & CRLF & ""
	
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	ArchivoXml = ArchivoXml & " <ruta_destino>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <UsuarioRutaFotos></UsuarioRutaFotos>" & CRLF & ""
	ArchivoXml = ArchivoXml & " </ruta_destino>" & CRLF & ""
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	
	ArchivoXml = ArchivoXml & " <ftp>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorruta></servidorruta>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorip></servidorip>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorpuerto></servidorpuerto>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorusuario></servidorusuario>" & CRLF & ""
	ArchivoXml = ArchivoXml & "   <servidorclave></servidorclave>" & CRLF & ""
	ArchivoXml = ArchivoXml & " </ftp>" & CRLF & ""
	
	ArchivoXml = ArchivoXml & "" & CRLF & ""
	ArchivoXml = ArchivoXml & "</fotos>" & CRLF & ""
	Return ArchivoXml
	
	
	
End Sub




#End Region




Public Sub ObtenerHoraProximaEjecucion() As String

	'ModificarNotificacion(IdNotificacion, "Fotos", "Copia en curso... ")
	' Obtener la hora actual
	Dim ahora As Long
	ahora = DateTime.Now
    
	' Número de segundos que deseas sumar
	Dim segundosASumar As Int
	segundosASumar = DatosGlobales.Segundos '60  ' Por ejemplo, sumar 60 segundos
    
	' Sumar segundos a la hora actual
	Dim nuevaHora As Long
	nuevaHora = ahora + segundosASumar * 1000  ' Convertir segundos a milisegundos
    
	' Convertir el resultado a un formato legible de hora
	Dim horaFormateada As String
	horaFormateada = DateTime.Time(nuevaHora)
	
	Return horaFormateada
	
End Sub





