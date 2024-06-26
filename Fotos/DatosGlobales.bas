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


#Region "Ususario y dispositivo"

	Dim IdUsuario As Int
	Dim CodUsuario As String
	Dim DescUsuario As String
	Dim NombreDispositivo As String
	Dim PalabraClave As String = "aMaPoLa_2970"

	Dim Ejecutandose As Boolean
	Dim Segundos As Int = 3600  '3600 '20 estaba cada 20 seg, ahora lo paso a 3600s que es 1hs   --> 360s = 3mins

	Dim LogOk As Boolean
	Dim Configurando As Boolean 'si en backup o login
	Dim EnPrincipal As Boolean
	Dim ForzarEjecucion As Boolean
	
	
	Dim CopiaPorcentEnCurso As String
	Dim CopiaCantEnCurso As String
	Dim CopiaProgreso As String
	Dim CopiaProgress As String
	
	Dim NombreArchivo As String
	

#End region

#Region "XML"
	
	'login
	Dim XML_Usuario As String
	Dim XML_Contraseña As String
	Dim XML_Recordar As String '0/1
	
	'ruta_origen
	Dim XML_FotosCamara As String
	Dim XML_VideosCamara As String
	Dim XML_ImagenesWhatsApp As String
	Dim XML_VideosWhatsApp As String
	Dim XML_ChFotosCamara As String
	Dim XML_ChVideosCamara As String
	Dim XML_ChImagenesWhatsApp As String
	Dim XML_ChVideosWhatsApp As String
	Dim XML_PrimeraVez As String
	
	'ruta_destino
	Dim XML_UsuarioRutaFotos As String
	
	'ftp
	Dim XML_ServidorRuta As String
	Dim XML_ServidorIp As String
	Dim XML_ServidorPuerto As String
	Dim XML_ServidorUsuario As String
	Dim XML_ServidorClave As String

#End region



	#Region "FTP"
		 
		 
	 	Dim ServidorRuta As String '= "./H/DiscoCompartido/"  '--> Ya se carga en el xml
		Dim ServidorIp As String '= "192.168.1.112"  '--> Ya se carga en el xml
		Dim ServidorPuerto As String '= "21"  '--> Ya se carga en el xml
		Dim ServidorUsuario As String '= "admin"  '--> Ya se carga en el xml
		Dim ServidorClave As String '= "31119914"  '--> Ya se carga en el xml
	
	
		'Cada usuario tendrá una carpeta para Documentos, Fotos y Videos  /* CARPETA SERVER BACKUP */
		
		Dim UsuarioRutaFotos As String '= ServidorRuta & "RiBackup" '"RiFotos"   --> Ya se carga en el xml

		
		Dim UsuarioRutaVideos As String  '= ServidorRuta & "RiBackup" '"RiVideos"
		'Dim UsuarioRutaDocumentos As String = ServidorRuta & "RiDocumentos" 'esta no se si se hará
		
		
		
		
		'Dim UsuarioRutaFotos As String = ServidorRuta & "/" & "GeorBackup"
'		Dim UsuarioRutaVideos As String = ServidorRuta & "/" & "GeorBackup"
'		Dim UsuarioRutaDocumentos As String = ServidorRuta & "/" & "GeorDocumentos" 'esta no se si se hará
	
	
	'Ruta del servidor donde se copiarán los archivos
	Dim const PathFotosCamara As String = "Fotos"
	Dim const PathVideosCamara As String = "Videos"
		
		
	
	#End region


	#Region "MOBIL"
	
		'Dim MobilRutaFotosEmulador As String = "/sdcard/Pictures" 'RUTA DEL EMULADOR!!!
		
	' #####################################################################################################################################################################################
	' # MACHETE:
	' #
	' # EMULADOR:
	' # Dim MobilRutaFotos As String =  "/sdcard/Pictures/Fotos"  'RUTA DEL EMULADOR!!!
	' # Dim MobilRutaFotosSD As String =  "/sdcard/Pictures/Videos"  'RUTA DEL EMULADOR!!!
	' #
	' # CELU RI:
	' # Dim MobilRutaFotos As String = File.DirRootExternal & "/DCIM/Camera"  'ESTA ES LA RUTA DE LAS FOTOS DE LA CAMARA DEL CELU DE RI
	' # Dim MobilRutaFotosSD As String = File.DirRootExternal & "/sdcard/DCIM/Camera"  'ESTA ES LA RUTA DE LAS FOTOS DE LA CAMARA DEL CELU DE RI
	' # Dim MobilRutaImagenesWhatsApp As String = File.DirRootExternal & "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Images"
	' #
	' #
	' #####################################################################################################################################################################################
		
		
	Dim MobilRutaFotosCamara As String '=  "/sdcard/Pictures/Fotos"  'RUTA DEL EMULADOR!!!    --> LO ESTA CARGANDO DESDE EL XML
	Dim MobilRutaVideosCamara As String ' =  "/sdcard/Pictures/Videos"  'RUTA DEL EMULADOR!!! --> LO ESTA CARGANDO DESDE EL XML
	
	Dim MobilRutaImagenesWhapp As String
	Dim MobilRutaVideosWhapp As String
	
	'Dim MobilRutaFotos As String = File.DirRootExternal & "/DCIM/Camera"  'ESTA ES LA RUTA DE LAS FOTOS DE LA CAMARA DEL CELU DE RI
	'Dim MobilRutaFotosSD As String = File.DirRootExternal & "/sdcard/DCIM/Camera"  'ESTA ES LA RUTA DE LAS FOTOS DE LA CAMARA DEL CELU DE RI
	'Dim MobilRutaImagenesWhatsApp As String = File.DirRootExternal & "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Images"


	' ########################################################################################################
	'COMENTADO
	Dim ColMobilRutaOrigen As List	
	'ColMobilRutaOrigen.Initialize
	'ColMobilRutaOrigen.Add("MobilRutaFotos;"& MobilRutaFotosCamara)  ' --> ESTA ES LA QUE HACE EL BACK UP DE TODAS LAS FOTOS DE LA CAMARA
	'ColMobilRutaOrigen.Add("MobilRutaFotos;"& MobilRutaVideosCamara)  ' --> ESTA ES LA QUE HACE EL BACK UP DE TODA LOS VIDEOS DE LA CAMARA
	' ########################################################################################################
	
	
	
	
	
	'ColMobilRutaOrigen.Add("MobilRutaFotosSD;"& MobilRutaFotosSD)  ' --> ESTA NO FUNCIONA!

	'ColMobilRutaOrigen.Add("MobilRutaImagenesWhatsApp;"& MobilRutaImagenesWhatsApp)
	
	
	' "/Storage/emulated/0/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Images"
	
	' "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Images"
	' "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Images/Sent"

	' "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Video"
	' "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Video/Sent"

	
	
	
	'Dim MobilRutaFotos As String = File.DirRootExternal & "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Images"
	
	
	#End region

	
	Dim IndiceFullBkp As Int 


End Sub