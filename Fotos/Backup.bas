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


'
Sub Process_Globals
'	'These global variables will be declared once when the application starts.
'	'These variables can be accessed from all modules.
'
'	Private xui As XUI
'	
'	Dim ListaCompleta As List
'	Dim ListaFotos As List
'	Dim ListaVideos As List
'	
'	Dim CantFotos As Int
'	Dim CantVideos As Int
'	Dim CantTotal As Int
'	Dim CantEnCurso As Int
'	
	Dim CantidadTotal As Int = 0
'	
'	Dim Awake As PhoneWakeState
'	
'	
'	
'	' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
'	' SE COMENTAN ESTAS LINEAS GLOBALES PARA PODER SER USADAS EN EL SERVICIO -> SERVBACKUP4
'	
''	Type TipoOperacion (FotosCamara As Int, VideosCamara As Int, ImagenesWhatsApp As Int, VideosWhatsApp As Int)
''	
''	Dim Operacion As TipoOperacion
''	Operacion.FotosCamara = 0
''	Operacion.VideosCamara = 1
''	Operacion.ImagenesWhatsApp = 2
''	Operacion.VideosWhatsApp = 3
'
'	' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
'
'
'	Dim const PathFotosCamara As String = "Fotos"
'	Dim const PathVideosCamara As String = "Videos"
'	Dim const PathImagenesWhatsApp As String = "Imagenes WhatsApp"
'	Dim const PathVideosWhatsApp As String = "Videos WhatsApp"
'
End Sub
'
'
'
'
Sub Globals
'	'These global variables will be redeclared each time the activity is created.
'	'These variables can only be accessed from this module.
'
'
'	' ####################################################################################################################################################################################
'	' FTP
'
'	'Private Prueba_ImageView1 As ImageView
'	Private Prueba_Button1 As Button
'	Private WebView1 As WebView
'	
'	Dim FTP3 As FTP
'	Dim FTP4 As FTP
'	Dim FTP_Consulta As FTP
'	
'	'Dim pb As ProgressBar
'	Dim currentFileSize As Int
'	
'	' ####################################################################################################################################################################################
'	
'
'	'Private  As Label
'	'Private BtnPrueba As Button
'	'Private LblProgre As Label
'
End Sub
'
'
'
'
'Sub Activity_Create(FirstTime As Boolean)
'	
'	
'	Activity.Color = Colors.Transparent
'	
'	
'	'Do not forget to load the layout file created with the visual designer. For example:
'	'Activity.LoadLayout("Layout1")
'
'	
'	'Activity.LoadLayout("backup")
'
'
'	'nuevo!!!
'	DatosGlobales.Ejecutandose = True
'	DatosGlobales.ForzarEjecucion = False
'
'
'	If FTP3.IsInitialized = False Then
'		FTP3.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
'		FTP3.PassiveMode = True
'	End If
'		
'	If FTP4.IsInitialized = False Then
'		FTP4.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
'		FTP4.PassiveMode = True
'	End If
'	
'	If FTP_Consulta.IsInitialized = False Then
'		FTP_Consulta.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
'		FTP_Consulta.PassiveMode = True
'	End If
'
'
'
'	' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
'	' SE COMENTAN ESTAS LINEAS GLOBALES PARA PODER SER USADAS EN EL SERVICIO -> SERVBACKUP4
''	Dim rs As ResumableSub = IniciarProceso(DatosGlobales.ColMobilRutaOrigen)
''	Wait For(rs) complete
'	' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
'
'
'	'DatosGlobales.Ejecutandose = False
'	
'
'End Sub
'
'
'
'Sub Activity_Resume
'	
'	If DatosGlobales.Ejecutandose = False Then
'		'nuevo!!!
'		DatosGlobales.Ejecutandose = True
'		
'		' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
'		' SE COMENTAN ESTAS LINEAS GLOBALES PARA PODER SER USADAS EN EL SERVICIO -> SERVBACKUP4
''		Dim rs As ResumableSub = IniciarProceso(DatosGlobales.ColMobilRutaOrigen)
''		Wait For(rs) complete
'		' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
'		
'	End If
'	
'
'End Sub
'
'Sub Activity_Pause (UserClosed As Boolean)
'
'	'Msgbox("Paso por pausa", "")
'
'	
'
'End Sub
'
'
'
'
'
'
'
'
'
'
'
'#Region "FTP"
'
'
'
'Sub GuardarArchivoEnElServidor (PathDelServidor As String, Ip As String, Puerto As Int, Usuario As String, Contra As String, RutaMobile As String, ArchivoMobileFull As String, TipoDeOperacion As Int) As ResumableSub
'	Try
'		Dim Path As String = ""
'	 
'		If TipoDeOperacion = 0 Then 'FOTOS CAMARA
'			Path = PathFotosCamara
'		Else If TipoDeOperacion = 1 Then 'VIDEOS CAMARA
'			Path = PathVideosCamara
'		Else If TipoDeOperacion = 2 Then 'IMAGENES WHATSAPP
'			Path = PathImagenesWhatsApp
'		Else If TipoDeOperacion = 3 Then 'VIDEOS WHATSAPP
'			Path = PathVideosWhatsApp
'		End If
'	
'	 
'		Dim ArchivoMobile As String = FxGlobales.Left(ArchivoMobileFull, ArchivoMobileFull.IndexOf(";"))
'		Dim FechaArchivo As String = FxGlobales.Right(ArchivoMobileFull, (ArchivoMobileFull.Length - ArchivoMobileFull.IndexOf(";")-1))
'
'		If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo,"") = False Then
'			Dim sf As Object = FTP3.SendCommand("MKD", PathDelServidor & "/" & Path)
'			Wait For (sf) FTP_CommandCompleted(Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
'		Else
'			Log("No pudo crear carpeta: " & PathDelServidor & "/" & Path & "!!!")
'		End If
'	
'		If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo,"") = False Then
'			Dim sf2 As Object = FTP3.SendCommand("MKD", PathDelServidor & "/" & Path & "/" & FechaArchivo)
'			Wait For (sf2) FTP_CommandCompleted(Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
'		Else
'			Log("No pudo crear carpeta: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & "!!!")
'		End If
'	
'				
''	currentFileSize = File.Size(RutaMobile, ArchivoMobile) ' --> asi es como funcionaba 26/08/2023
''	FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE  --> asi es como funcionaba 26/08/2023
'	
'		'#############################################################################################################################################################
'		'AGREGADO 09/09/2023
'
'
'		' ####################################################################################################################################################################
'		' PROBANDO POR QUE NO FUNCIONA VERIFICAR ARCHIVO
''	
''	If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile,"") = True Then
''		Log("EXISTE --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile)
''		Else
''		Log("NO EXISTE!!! --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile)
''	End If
''	
''	
'	
'		'VERIFICO SI EL ARCHIVO YA EXISTE EN EL SERVIDOR
'		Dim rs As ResumableSub = EncontroArchivoEnServidor(PathDelServidor & "/" & Path & "/" & FechaArchivo & "/", ArchivoMobile) 'ej: EncontroArchivoEnServidor("./H/DiscoCompartido/RiBackup/Fotos/20230924/", "Foto_Bath_Puerta.jpg")
'		Wait For(rs) complete (Result As Boolean)
'		If Result = True Then
'			'Msgbox("Encontrado", "")
'		
'			Log("EXISTE --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile & " # ENTONCES NO HAGO NADA!!!")
'	
'			'pb.Progress = 100
'			DatosGlobales.CopiaProgress = 100
'	
'		Else
'			'Msgbox("No encontrado", "")
'			Log("NO EXISTE!!! --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile & " # ENTONCES SUBO EL ARCHIVO AL SERVER")
'		
'		
'			'SUBO AL SERVER EL ARCHIVO
'			currentFileSize = File.Size(RutaMobile, ArchivoMobile)
'			Dim complete As Object = FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE
'
'			Wait For (complete) FTP_UploadCompleted (ServerPath As String, Success As Boolean)
'			If Success Then DatosGlobales.CopiaProgress = 100 'pb.Progress = 100
'				
'		End If
'
'
'	
'		' ####################################################################################################################################################################
'
'
'		'### esto asi andaba hasta el 25/09/2023
''	currentFileSize = File.Size(RutaMobile, ArchivoMobile)
''	Dim complete As Object = FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE
'		'
''	Wait For (complete) FTP_UploadCompleted (ServerPath As String, Success As Boolean)
''	If Success Then pb.Progress = 100
'	
'		CantEnCurso = CantEnCurso + 1
'		'LblTexto.Text = CantEnCurso & "/" & CantidadTotal
'		DatosGlobales.CopiaCantEnCurso = CantEnCurso & "/" & CantidadTotal
'		DatosGlobales.CopiaPorcentEnCurso = Round2((CantEnCurso * 100) / CantidadTotal,0) & "%"
'			
'		'Log("Cantidad en curso: " & CantEnCurso & CRLF & "Cantidad Total: " & CantidadTotal & CRLF & "Porcentaje: " & DatosGlobales.PorcentEnCurso)
'	
'	
'			
'		If CantEnCurso >= CantidadTotal Then
'			'si pudo completar todo el backup, tiene que cambiar la varible primeravez a cero para que no vuelva a hacerlo
'			Dim unXml As String = CargarElXML  'la tengo q generar modificada solo para esta funcion
'			File.WriteString(File.DirInternal,"config.xml",unXml) 'lo grabo
'
'			'Msgbox("Se ha terminado la copia de seguridad", "Mensaje del sistema")
'		
'			'ToastMessageShow("Se ha terminado la copia de seguridad", True)
'					
'			Awake.ReleaseKeepAlive 'liberar
'					
'			If	FTP3.IsInitialized Then
'				FTP3.CloseNow
'			End If
'					
'			If	FTP4.IsInitialized Then
'				FTP4.CloseNow
'			End If
'				
'			CantEnCurso = 0
'			CantidadTotal = 0
'	
'	
'			DatosGlobales.Ejecutandose = False
'			Activity.Finish
'				
'		End If
'		'#############################################################################################################################################################
'
'		Return True
'		
'	Catch
'		Log("#ERROR: en Fx GuardarArchivoEnElServidor --> " & LastException)
'		Return False
'	End Try
'	
'End Sub
'
'
'
'Sub FTP_UploadProgress (ServerPath As String, TotalUploaded As Long, Total As Long)
'	
'	
'	
'	'LblProgre.Text = "COPIANDO [" & TotalUploaded & "]"
'	DatosGlobales.CopiaProgreso =  "COPIANDO [" & TotalUploaded & "]"
'	
'	'pb.Progress = 100 * TotalUploaded / currentFileSize
'	DatosGlobales.CopiaProgress = 100 * TotalUploaded / currentFileSize
'	
'End Sub
'
'
'
'#End Region
'
'
'
'
'#Region "MOBILE"
'
'
'' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
'' SE COMENTAN ESTAS LINEAS GLOBALES PARA PODER SER USADAS EN EL SERVICIO -> SERVBACKUP4
''Sub IniciarProceso (ColMobilRutaOrigen As List) As ResumableSub
''	
''	
''	Log("Inicio proceso")
''	
''	Awake.KeepAlive(True)
''		
''	ListaCompleta.Initialize
''	ListaFotos.Initialize
''	ListaVideos.Initialize
''		
''	ListaCompleta.Clear
''	ListaFotos.Clear
''	ListaVideos.Clear
''		
''		
''	'#####################################################################################################################################
''	'para saber total real de lo que son las imagenes y videos
''		
''	'Con el "i" recorro la lista con los path que se backupearan por ej: [MobilRutaFotos;/sdcard/Pictures/Fotos, MobilRutaVideos;/sdcard/Pictures/Videos]
''	For i = 0 To ColMobilRutaOrigen.Size-1
''		Try
''			Dim ContenidoColeccion_ As String= ColMobilRutaOrigen.Get(i)
''			Dim Ruta_ As String = (FxGlobales.Right(ContenidoColeccion_, (ContenidoColeccion_.Length - ContenidoColeccion_.IndexOf(";")-1)))
''			
''			'asi funcionaba 23/09/2023
''			'Dim ListaGenerica_ As List = File.ListFiles(Ruta_) '### ARMAR FUNCION PARA LISTAR TODOS / LOS DEL DIA
''			
''			Dim PrimeraVez As Boolean
''			If DatosGlobales.XML_PrimeraVez = "1" Then
''				PrimeraVez= True
''			Else
''				PrimeraVez= False
''			End If
''	
''			Dim ListaGenerica_ As List = DevolverLista(Ruta_, PrimeraVez)
''			
''				
''				
''			For	h = 0 To ListaGenerica_.Size-1
''				Dim Extension As String = ""
''				Dim Archivox As String = ListaGenerica_.Get(h)
''				Extension = FxGlobales.Right(Archivox, 3)
''				If Extension.ToUpperCase = "JPG" Then
''					If DatosGlobales.XML_ChFotosCamara = "1" Or DatosGlobales.XML_ChImagenesWhatsApp = "1" Then
''						CantidadTotal = CantidadTotal + 1
''					End If
''				Else If Extension.ToUpperCase = "MP4" Then
''					If DatosGlobales.XML_ChVideosCamara = "1" Or DatosGlobales.XML_ChVideosWhatsApp = "1" Then
''						CantidadTotal = CantidadTotal + 1
''					End If
''				End If
''			Next
''			'CantidadTotal = CantidadTotal + ListaGenerica_.Size
''		Catch
''			Log(LastException)
''			Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
''		End Try
''		
''	Next
''	'#####################################################################################################################################
''	
''	
''	
''	If CantidadTotal > 0 Then
''		
''			
''		For i = 0 To ColMobilRutaOrigen.Size -1
''			
''			Dim ContenidoColeccion As String= ColMobilRutaOrigen.Get(i)
''			Dim Tipo As String = (FxGlobales.Left(ContenidoColeccion, ContenidoColeccion.IndexOf(";")))
''			Dim Ruta As String = (FxGlobales.Right(ContenidoColeccion, (ContenidoColeccion.Length - ContenidoColeccion.IndexOf(";")-1)))
''			
''			Dim OperacionActual As Int
''		
''			'.Text = "" '"Tipo: " & Tipo   ' --> comentado 26/09/2023 ya q borra al transferir dsd fotos a videos por ej.
''				
''			If Tipo = "MobilRutaFotos" Then
''				OperacionActual = 0
''			Else If Tipo = "MobilRutaVideos" Then
''				OperacionActual = 1
''			Else If Tipo = "MobilRutaFotosWhapp" Then
''				OperacionActual = 2
''			Else If Tipo = "MobilRutaVideosWhapp" Then
''				OperacionActual = 3
''			End If
''			
''				
''			
''			Try
''				'asi funcionaba 23/09/2023
''				'Dim ListaGenerica As List = File.ListFiles(Ruta) '### ARMAR FUNCION PARA LISTAR TODOS / LOS DEL DIA
''				
''				Dim PrimeraVez As Boolean
''				If DatosGlobales.XML_PrimeraVez = "1" Then
''					PrimeraVez= True
''				Else
''					PrimeraVez= False
''				End If
''		
''				Dim ListaGenerica As List = DevolverLista(Ruta, PrimeraVez)
''				
''			
''				For j = 0 To ListaGenerica.Size -1
''					
''					Try
''						Dim	Archivo As Object = ListaGenerica.Get(j)
''						
''						Dim Extension As String = ""
''						Extension = FxGlobales.Right(Archivo, 3)
''						If Extension.ToUpperCase = "JPG" Then
''							Dim d As Long
''							d = File.LastModified(Ruta, Archivo)
''							'DateTime.DateFormat = "dd-MM-yyyy"
''							DateTime.DateFormat = "yyyyMMdd"
''							Dim ConcatFileDate As String = Archivo & ";" & DateTime.Date(d)
''							
''							Try
''								If OperacionActual = 0 Then 'MobilRutaFotos [FOTOS DE LA CAMARA]
''									' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
''									' SE COMENTAN ESTAS LINEAS GLOBALES PARA PODER SER USADAS EN EL SERVICIO -> SERVBACKUP4
''									'Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.FotosCamara)
''									' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
''									Wait For(rs) complete (result As Boolean)
''									
''								Else If OperacionActual = 2 Then 'MobilRutaImagenesWhatsApp [FOTOS DE WHATSAPP]
''									' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
''									' SE COMENTAN ESTAS LINEAS GLOBALES PARA PODER SER USADAS EN EL SERVICIO -> SERVBACKUP4
''									'Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.ImagenesWhatsApp)
''									' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
''									Wait For(rs) complete (result As Boolean)
''								End If
''							Catch
''								'Msgbox("#ERROR: " & LastException & CRLF & ConcatFileDate  , "Mensaje del sistema")
''							End Try
''						
''						Else If Extension.ToUpperCase = "MP4" Then
''							Dim d As Long
''							d = File.LastModified(Ruta, Archivo)
''							'DateTime.DateFormat = "dd-MM-yyyy"
''							DateTime.DateFormat = "yyyyMMdd"
''							Dim ConcatFileDate As String = Archivo & ";" & DateTime.Date(d)
''							
''							Try
''								If OperacionActual = 1 Then 'MobilRutaFotos [VIDEOS DE LA CAMARA]
''									' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
''									' SE COMENTAN ESTAS LINEAS GLOBALES PARA PODER SER USADAS EN EL SERVICIO -> SERVBACKUP4
''									'Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.VideosCamara)
''									' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
''							
''									Wait For(rs) complete (result As Boolean)
''								Else If OperacionActual = 3 Then 'MobilRutaImagenesWhatsApp [VIDEOS DE WHATSAPP]
''									
''									' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
''									' SE COMENTAN ESTAS LINEAS GLOBALES PARA PODER SER USADAS EN EL SERVICIO -> SERVBACKUP4
''									'Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.VideosWhatsApp)
''									' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
''									Wait For(rs) complete (result As Boolean)
''								End If
''							Catch
''								'							Msgbox("#ERROR: " & LastException & CRLF & ConcatFileDate, "Mensaje del sistema")
''								'							DatosGlobales.Ejecutandose = False
''							End Try
''						
''						End If
''						
''					Catch
''						'Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
''						'Log(LastException)
''						'DatosGlobales.Ejecutandose = False
''					End Try
''					
''					
''					
''					
''				Next
''				
''			Catch
''				Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
''				Log(LastException & CRLF & "No paso la lista: " & Tipo & " -> Por no tener datos") 'no es error
''				DatosGlobales.Ejecutandose = False
''			End Try
''			
''			
''				
''		Next
''			
''		
''		Log("Finalizo proceso")
''		
''		DatosGlobales.Ejecutandose = False
''		
''		Awake.ReleaseKeepAlive 'libero
''	
''	
''	Else
''		
''		Awake.ReleaseKeepAlive 'liberar
''			
''		If	FTP3.IsInitialized Then
''			FTP3.CloseNow
''		End If
''					
''		If	FTP4.IsInitialized Then
''			FTP4.CloseNow
''		End If
''				
''		CantEnCurso = 0
''		CantidadTotal = 0
''	
''		DatosGlobales.Ejecutandose = False
''		Log("Finalizo proceso")
''		Activity.Finish
''	
''	
''	End If 'fin de -> CantidadTotal > 0
''	
''	
''	
''End Sub
'' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
'
'
'#End Region
'
'
'
'#Region "Guardar el archivo XML modificando la variable esprimeravez"
'
'Private Sub CargarElXML As String
'	
'	' #############################################################################################################################################################################################
'	'TODO ESTO ES PARA GUARDAR ESTE VALOR: es decir, si completo la carga completa, cambia el valor de primeravez a falso y luego actualizara solo lo del dia
'	
'	DatosGlobales.XML_PrimeraVez = "0"
'
'	' #############################################################################################################################################################################################
'	
'	
'	Dim ArchivoXml As String = "<?xml version=""""1.0"""" encoding=""""UTF-8""""?>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "<fotos>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "" & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & " <login>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <usuario>" & DatosGlobales.XML_Usuario & "</usuario>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <contraseña>" & DatosGlobales.XML_Contraseña & "</contraseña>"  & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <recordar>" & DatosGlobales.XML_Recordar & "</recordar>"  & CRLF & ""
'	ArchivoXml = ArchivoXml & " </login>"  & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & "" & CRLF & ""
'	ArchivoXml = ArchivoXml & " <ruta_origen>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <fotoscamara>" & DatosGlobales.XML_FotosCamara & "</fotoscamara>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <videoscamara>" & DatosGlobales.XML_VideosCamara & "</videoscamara>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <imageneswhatsapp>" & DatosGlobales.XML_ImagenesWhatsApp & "</imageneswhatsapp>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <videoswhatsapp>" & DatosGlobales.XML_VideosWhatsApp & "</videoswhatsapp>" & CRLF & ""
'
'	ArchivoXml = ArchivoXml & "   <chfotoscamara>" & DatosGlobales.XML_ChFotosCamara & "</chfotoscamara>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <chvideoscamara>" & DatosGlobales.XML_ChVideosCamara & "</chvideoscamara>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <chimageneswhatsapp>" & DatosGlobales.XML_ChImagenesWhatsApp & "</chimageneswhatsapp>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <chvideoswhatsapp>" & DatosGlobales.XML_ChVideosWhatsApp & "</chvideoswhatsapp>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <primeravez>" & DatosGlobales.XML_PrimeraVez & "</primeravez>" & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & " </ruta_origen>" & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & "" & CRLF & ""
'	ArchivoXml = ArchivoXml & " <ruta_destino>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <UsuarioRutaFotos>" & DatosGlobales.XML_UsuarioRutaFotos & "</UsuarioRutaFotos>" & CRLF & ""
'	ArchivoXml = ArchivoXml & " </ruta_destino>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "" & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & " <ftp>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <servidorruta>" & DatosGlobales.XML_ServidorRuta & "</servidorruta>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <servidorip>" & DatosGlobales.XML_ServidorIp & "</servidorip>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <servidorpuerto>" & DatosGlobales.XML_ServidorPuerto & "</servidorpuerto>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <servidorusuario>" & DatosGlobales.XML_ServidorUsuario & "</servidorusuario>" & CRLF & ""
'	ArchivoXml = ArchivoXml & "   <servidorclave>" & DatosGlobales.XML_ServidorClave & "</servidorclave>" & CRLF & ""
'	ArchivoXml = ArchivoXml & " </ftp>" & CRLF & ""
'	
'	ArchivoXml = ArchivoXml & "" & CRLF & ""
'	ArchivoXml = ArchivoXml & "</fotos>" & CRLF & ""
'	
'	Return ArchivoXml
'	
'End Sub
'
'
'#End Region
'
'
'
'' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
'' SE COMENTAN ESTAS LINEAS GLOBALES PARA PODER SER USADAS EN EL SERVICIO -> SERVBACKUP4
''Private Sub DevolverLista(unaRuta As String, esPrimeraVez As Boolean) As List
''	'si es primera vez, devuelve toda la lista completa
''	'de lo contrario si no es primera vez solo listara los archivos del dia
''
''	Dim unaListaFinal As List
''	Dim unaListaProvisoria As List
''	Dim unaListaProvisoria2 As List
''	
''	unaListaFinal.Initialize
''	unaListaProvisoria.Initialize
''	unaListaProvisoria2.Initialize
''	
''	unaListaFinal.Clear
''	unaListaProvisoria.Clear
''	unaListaProvisoria2.Clear
''	
''	DateTime.DateFormat = "yyyyMMdd"
''	Dim FechaActual As String
''	FechaActual = DateTime.Date(DateTime.Now)
''	
''	
''	If esPrimeraVez = False Then
''		
''		unaListaProvisoria = File.ListFiles(unaRuta)
''		
''		For i = 0 To unaListaProvisoria.Size -1
''			
''			Dim	Archivo As Object = unaListaProvisoria.Get(i)
''			Dim Archivox As String = unaListaProvisoria.Get(i)
''			Dim Extension As String = FxGlobales.Right(Archivox, 3)
''			'Dim unaRuta As String = (FxGlobales.Right(Archivox, (Archivox.Length - Archivox.IndexOf(";")-1)))
''			
''			DateTime.DateFormat = "yyyyMMdd"
''			Dim d As Long
''			d = File.LastModified(unaRuta, Archivo)
''			Dim unaFechaArchivo As String = DateTime.Date(d)
''			
''			If(FechaActual = unaFechaArchivo) Then
''				unaListaProvisoria2.Add(unaListaProvisoria.Get(i))
''			End If
''		Next
''		
''		unaListaFinal = unaListaProvisoria2
''			
''	Else 'si es la primera vez le pasa todos los archivos
''		
''		unaListaFinal = File.ListFiles(unaRuta) ' [000_0964.JPG, 000_0965.JPG, 000_0966.JPG, 000_0967.JPG, 000_0967_.jpg, 000_0968.JPG, 000_0969.JPG, 000_0970.JPG, 000_0971.JPG, 000_0973.JPG, 000_0974.JPG, 000_0975.JPG, 000_0992_.jpg, Foto_Baño.jpg, SARASA]
''		
''	End If
''	
''	Return unaListaFinal
''	
''End Sub
'' $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
'
'
'
'
'
'
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
'
'
'
'
'
'
'
'
'' #################################################################################################################################################################
'
'
''Sub Process_Globals
''	'These global variables will be declared once when the application starts.
''	'These variables can be accessed from all modules.
''
''	Private xui As XUI
''	
''	Dim ListaCompleta As List
''	Dim ListaFotos As List
''	Dim ListaVideos As List
''	
''	Dim CantFotos As Int
''	Dim CantVideos As Int
''	Dim CantTotal As Int
''	Dim CantEnCurso As Int
''	
''	Dim CantidadTotal As Int = 0
''	
''	Dim Awake As PhoneWakeState
''	
''	
''	
''	Type TipoOperacion (FotosCamara As Int, VideosCamara As Int, ImagenesWhatsApp As Int, VideosWhatsApp As Int)
''	
''	Dim Operacion As TipoOperacion
''	Operacion.FotosCamara = 0
''	Operacion.VideosCamara = 1
''	Operacion.ImagenesWhatsApp = 2
''	Operacion.VideosWhatsApp = 3
''
''	Dim const PathFotosCamara As String = "Fotos"
''	Dim const PathVideosCamara As String = "Videos"
''	Dim const PathImagenesWhatsApp As String = "Imagenes WhatsApp"
''	Dim const PathVideosWhatsApp As String = "Videos WhatsApp"
''
''End Sub
''
''
''
''
''Sub Globals
''	'These global variables will be redeclared each time the activity is created.
''	'These variables can only be accessed from this module.
''
''
''	' ####################################################################################################################################################################################
''	' FTP
''
''	'Private Prueba_ImageView1 As ImageView
''	Private Prueba_Button1 As Button
''	Private WebView1 As WebView
''	
''	Dim FTP3 As FTP
''	Dim FTP4 As FTP
''	Dim FTP_Consulta As FTP
''	
''	Dim pb As ProgressBar
''	Dim currentFileSize As Int
''	
''	' ####################################################################################################################################################################################
''	
''
''	Private  As Label
''	Private BtnPrueba As Button
''	Private LblProgre As Label
''
''End Sub
''
''
''
''
''Sub Activity_Create(FirstTime As Boolean)
''	'Do not forget to load the layout file created with the visual designer. For example:
''	'Activity.LoadLayout("Layout1")
''
''	
''	Activity.LoadLayout("backup")
''
''
''	'nuevo!!!
''	DatosGlobales.Ejecutandose = True
''
''
''	If FTP3.IsInitialized = False Then
''		FTP3.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
''		FTP3.PassiveMode = True
''	End If
''		
''	If FTP4.IsInitialized = False Then
''		FTP4.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
''		FTP4.PassiveMode = True
''	End If
''	
''	If FTP_Consulta.IsInitialized = False Then
''		FTP_Consulta.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
''		FTP_Consulta.PassiveMode = True
''	End If
''
''
''
''
''	Dim rs As ResumableSub = IniciarProceso(DatosGlobales.ColMobilRutaOrigen)
''	Wait For(rs) complete
''
''
''	'DatosGlobales.Ejecutandose = False
''	
''
''End Sub
''
''
''
''Sub Activity_Resume
''	
''	If DatosGlobales.Ejecutandose = False Then
''		'nuevo!!!
''		DatosGlobales.Ejecutandose = True
''		Dim rs As ResumableSub = IniciarProceso(DatosGlobales.ColMobilRutaOrigen)
''		Wait For(rs) complete
''		
''	End If
''	
''
''End Sub
''
''Sub Activity_Pause (UserClosed As Boolean)
''
''	'Msgbox("Paso por pausa", "")
''
''	
''
''End Sub
''
''
''
''
''
''
''
''
''
''
''
''#Region "FTP"
''
''
''
''Sub GuardarArchivoEnElServidor (PathDelServidor As String, Ip As String, Puerto As Int, Usuario As String, Contra As String, RutaMobile As String, ArchivoMobileFull As String, TipoDeOperacion As Int) As ResumableSub
''	Dim Path As String = ""
''	 
''	If TipoDeOperacion = 0 Then 'FOTOS CAMARA
''		Path = PathFotosCamara
''	Else If TipoDeOperacion = 1 Then 'VIDEOS CAMARA
''		Path = PathVideosCamara
''	Else If TipoDeOperacion = 2 Then 'IMAGENES WHATSAPP
''		Path = PathImagenesWhatsApp
''	Else If TipoDeOperacion = 3 Then 'VIDEOS WHATSAPP
''		Path = PathVideosWhatsApp
''	End If
''	
''	 
''	Dim ArchivoMobile As String = FxGlobales.Left(ArchivoMobileFull, ArchivoMobileFull.IndexOf(";"))
''	Dim FechaArchivo As String = FxGlobales.Right(ArchivoMobileFull, (ArchivoMobileFull.Length - ArchivoMobileFull.IndexOf(";")-1))
''
''	If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo,"") = False Then
''		Dim sf As Object = FTP3.SendCommand("MKD", PathDelServidor & "/" & Path)
''		Wait For (sf) FTP_CommandCompleted(Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
''	Else
''		Log("No pudo crear carpeta: " & PathDelServidor & "/" & Path & "!!!")
''	End If
''	
''	If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo,"") = False Then
''		Dim sf2 As Object = FTP3.SendCommand("MKD", PathDelServidor & "/" & Path & "/" & FechaArchivo)
''		Wait For (sf2) FTP_CommandCompleted(Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
''	Else
''		Log("No pudo crear carpeta: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & "!!!")
''	End If
''	
''				
'''	currentFileSize = File.Size(RutaMobile, ArchivoMobile) ' --> asi es como funcionaba 26/08/2023
'''	FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE  --> asi es como funcionaba 26/08/2023
''	
''	'#############################################################################################################################################################
''	'AGREGADO 09/09/2023
''
''
''	' ####################################################################################################################################################################
''	' PROBANDO POR QUE NO FUNCIONA VERIFICAR ARCHIVO
'''	
'''	If File.Exists(PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile,"") = True Then
'''		Log("EXISTE --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile)
'''		Else
'''		Log("NO EXISTE!!! --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile)
'''	End If
'''	
'''	
''	
''	'VERIFICO SI EL ARCHIVO YA EXISTE EN EL SERVIDOR
''	Dim rs As ResumableSub = EncontroArchivoEnServidor(PathDelServidor & "/" & Path & "/" & FechaArchivo & "/", ArchivoMobile) 'ej: EncontroArchivoEnServidor("./H/DiscoCompartido/RiBackup/Fotos/20230924/", "Foto_Bath_Puerta.jpg")
''	Wait For(rs) complete (Result As Boolean)
''	If Result = True Then
''		'Msgbox("Encontrado", "")
''		
''		Log("EXISTE --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile & " # ENTONCES NO HAGO NADA!!!")
''	
''		pb.Progress = 100
''	
''	Else
''		'Msgbox("No encontrado", "")
''		Log("NO EXISTE!!! --> RUTA: " & PathDelServidor & "/" & Path & "/" & FechaArchivo & " -  ARCHIVO --> " & ArchivoMobile & " # ENTONCES SUBO EL ARCHIVO AL SERVER")
''		
''		
''		'SUBO AL SERVER EL ARCHIVO
''		currentFileSize = File.Size(RutaMobile, ArchivoMobile)
''		Dim complete As Object = FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE
''
''		Wait For (complete) FTP_UploadCompleted (ServerPath As String, Success As Boolean)
''		If Success Then pb.Progress = 100
''				
''	End If
''
''
''	
''	' ####################################################################################################################################################################
''
''
''	'### esto asi andaba hasta el 25/09/2023
'''	currentFileSize = File.Size(RutaMobile, ArchivoMobile)
'''	Dim complete As Object = FTP4.UploadFile(RutaMobile, ArchivoMobile, False, PathDelServidor & "/" & Path & "/" & FechaArchivo & "/" & ArchivoMobile) 'HAY Q HACER QUE CREE LA CARPETA Y PREGUNTE SI EXISTE
''	'
'''	Wait For (complete) FTP_UploadCompleted (ServerPath As String, Success As Boolean)
'''	If Success Then pb.Progress = 100
''	
''	CantEnCurso = CantEnCurso + 1
''	.Text = CantEnCurso & "/" & CantidadTotal
''			
''	Log("Cantidad en curso: " & CantEnCurso & CRLF & "Cantidad Total: " & CantidadTotal)
''	
''			
''	If CantEnCurso >= CantidadTotal Then
''		'si pudo completar todo el backup, tiene que cambiar la varible primeravez a cero para que no vuelva a hacerlo
''		Dim unXml As String = CargarElXML  'la tengo q generar modificada solo para esta funcion
''		File.WriteString(File.DirInternal,"config.xml",unXml) 'lo grabo
''
''		'Msgbox("Se ha terminado la copia de seguridad", "Mensaje del sistema")
''		ToastMessageShow("Se ha terminado la copia de seguridad", True)
''					
''		Awake.ReleaseKeepAlive 'liberar
''					
''		If	FTP3.IsInitialized Then
''			FTP3.CloseNow
''		End If
''					
''		If	FTP4.IsInitialized Then
''			FTP4.CloseNow
''		End If
''				
''		CantEnCurso = 0
''		CantidadTotal = 0
''	
''	
''		DatosGlobales.Ejecutandose = False
''		Activity.Finish
''				
''	End If
''	'#############################################################################################################################################################
''
''	Return True
''	
''End Sub
''
''
''
''Sub FTP_UploadProgress (ServerPath As String, TotalUploaded As Long, Total As Long)
''	
''	LblProgre.Text = "COPIANDO [" & TotalUploaded & "]"
''	
''	pb.Progress = 100 * TotalUploaded / currentFileSize
''	
''End Sub
''
''
''
''#End Region
''
''
''
''
''#Region "MOBILE"
''
''
''Sub IniciarProceso (ColMobilRutaOrigen As List) As ResumableSub
''	
''	
''	Log("Inicio proceso")
''	
''	Awake.KeepAlive(True)
''		
''	ListaCompleta.Initialize
''	ListaFotos.Initialize
''	ListaVideos.Initialize
''		
''	ListaCompleta.Clear
''	ListaFotos.Clear
''	ListaVideos.Clear
''		
''		
''	'#####################################################################################################################################
''	'para saber total real de lo que son las imagenes y videos
''		
''	'Con el "i" recorro la lista con los path que se backupearan por ej: [MobilRutaFotos;/sdcard/Pictures/Fotos, MobilRutaVideos;/sdcard/Pictures/Videos]
''	For i = 0 To ColMobilRutaOrigen.Size-1
''		Try
''			Dim ContenidoColeccion_ As String= ColMobilRutaOrigen.Get(i)
''			Dim Ruta_ As String = (FxGlobales.Right(ContenidoColeccion_, (ContenidoColeccion_.Length - ContenidoColeccion_.IndexOf(";")-1)))
''			
''			'asi funcionaba 23/09/2023
''			'Dim ListaGenerica_ As List = File.ListFiles(Ruta_) '### ARMAR FUNCION PARA LISTAR TODOS / LOS DEL DIA
''			
''			Dim PrimeraVez As Boolean
''			If DatosGlobales.XML_PrimeraVez = "1" Then
''				PrimeraVez= True
''			Else
''				PrimeraVez= False
''			End If
''	
''			Dim ListaGenerica_ As List = DevolverLista(Ruta_, PrimeraVez)
''			
''				
''				
''			For	h = 0 To ListaGenerica_.Size-1
''				Dim Extension As String = ""
''				Dim Archivox As String = ListaGenerica_.Get(h)
''				Extension = FxGlobales.Right(Archivox, 3)
''				If Extension.ToUpperCase = "JPG" Then
''					If DatosGlobales.XML_ChFotosCamara = "1" Or DatosGlobales.XML_ChImagenesWhatsApp = "1" Then
''						CantidadTotal = CantidadTotal + 1
''					End If
''				Else If Extension.ToUpperCase = "MP4" Then
''					If DatosGlobales.XML_ChVideosCamara = "1" Or DatosGlobales.XML_ChVideosWhatsApp = "1" Then
''						CantidadTotal = CantidadTotal + 1
''					End If
''				End If
''			Next
''			'CantidadTotal = CantidadTotal + ListaGenerica_.Size
''		Catch
''			Log(LastException)
''			Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
''		End Try
''		
''	Next
''	'#####################################################################################################################################
''	
''	
''	
''	If CantidadTotal > 0 Then
''		
''
''	
''		.Text = ""
''			
''		For i = 0 To ColMobilRutaOrigen.Size -1
''			
''			Dim ContenidoColeccion As String= ColMobilRutaOrigen.Get(i)
''			Dim Tipo As String = (FxGlobales.Left(ContenidoColeccion, ContenidoColeccion.IndexOf(";")))
''			Dim Ruta As String = (FxGlobales.Right(ContenidoColeccion, (ContenidoColeccion.Length - ContenidoColeccion.IndexOf(";")-1)))
''			
''			Dim OperacionActual As Int
''		
''			'.Text = "" '"Tipo: " & Tipo   ' --> comentado 26/09/2023 ya q borra al transferir dsd fotos a videos por ej.
''				
''			If Tipo = "MobilRutaFotos" Then
''				OperacionActual = 0
''			Else If Tipo = "MobilRutaVideos" Then
''				OperacionActual = 1
''			Else If Tipo = "MobilRutaFotosWhapp" Then
''				OperacionActual = 2
''			Else If Tipo = "MobilRutaVideosWhapp" Then
''				OperacionActual = 3
''			End If
''			
''				
''			
''			Try
''				'asi funcionaba 23/09/2023
''				'Dim ListaGenerica As List = File.ListFiles(Ruta) '### ARMAR FUNCION PARA LISTAR TODOS / LOS DEL DIA
''				
''				Dim PrimeraVez As Boolean
''				If DatosGlobales.XML_PrimeraVez = "1" Then
''					PrimeraVez= True
''				Else
''					PrimeraVez= False
''				End If
''		
''				Dim ListaGenerica As List = DevolverLista(Ruta, PrimeraVez)
''				
''			
''				For j = 0 To ListaGenerica.Size -1
''					
''					Try
''						Dim	Archivo As Object = ListaGenerica.Get(j)
''						
''						Dim Extension As String = ""
''						Extension = FxGlobales.Right(Archivo, 3)
''						If Extension.ToUpperCase = "JPG" Then
''							Dim d As Long
''							d = File.LastModified(Ruta, Archivo)
''							'DateTime.DateFormat = "dd-MM-yyyy"
''							DateTime.DateFormat = "yyyyMMdd"
''							Dim ConcatFileDate As String = Archivo & ";" & DateTime.Date(d)
''							
''							Try
''								If OperacionActual = 0 Then 'MobilRutaFotos [FOTOS DE LA CAMARA]
''									Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.FotosCamara)
''									Wait For(rs) complete (result As Boolean)
''									
''								Else If OperacionActual = 2 Then 'MobilRutaImagenesWhatsApp [FOTOS DE WHATSAPP]
''									Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.ImagenesWhatsApp)
''									Wait For(rs) complete (result As Boolean)
''								End If
''							Catch
''								'Msgbox("#ERROR: " & LastException & CRLF & ConcatFileDate  , "Mensaje del sistema")
''							End Try
''						
''						Else If Extension.ToUpperCase = "MP4" Then
''							Dim d As Long
''							d = File.LastModified(Ruta, Archivo)
''							'DateTime.DateFormat = "dd-MM-yyyy"
''							DateTime.DateFormat = "yyyyMMdd"
''							Dim ConcatFileDate As String = Archivo & ";" & DateTime.Date(d)
''							
''							Try
''								If OperacionActual = 1 Then 'MobilRutaFotos [VIDEOS DE LA CAMARA]
''									Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.VideosCamara)
''									Wait For(rs) complete (result As Boolean)
''								Else If OperacionActual = 3 Then 'MobilRutaImagenesWhatsApp [VIDEOS DE WHATSAPP]
''									
''									Dim rs As ResumableSub = GuardarArchivoEnElServidor(DatosGlobales.UsuarioRutaFotos,DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave, Ruta, ConcatFileDate,Operacion.VideosWhatsApp)
''									Wait For(rs) complete (result As Boolean)
''								End If
''							Catch
''								'							Msgbox("#ERROR: " & LastException & CRLF & ConcatFileDate, "Mensaje del sistema")
''								'							DatosGlobales.Ejecutandose = False
''							End Try
''						
''						End If
''						
''					Catch
''						'Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
''						'Log(LastException)
''						'DatosGlobales.Ejecutandose = False
''					End Try
''					
''					
''					
''					
''				Next
''				
''			Catch
''				Msgbox("#ERROR: " & LastException, "Mensaje del sistema")
''				Log(LastException & CRLF & "No paso la lista: " & Tipo & " -> Por no tener datos") 'no es error
''				DatosGlobales.Ejecutandose = False
''			End Try
''			
''			
''				
''		Next
''			
''		
''		Log("Finalizo proceso")
''		
''		DatosGlobales.Ejecutandose = False
''		
''		Awake.ReleaseKeepAlive 'libero
''	
''	
''	Else
''		
''		Awake.ReleaseKeepAlive 'liberar
''			
''		If	FTP3.IsInitialized Then
''			FTP3.CloseNow
''		End If
''					
''		If	FTP4.IsInitialized Then
''			FTP4.CloseNow
''		End If
''				
''		CantEnCurso = 0
''		CantidadTotal = 0
''	
''		DatosGlobales.Ejecutandose = False
''		Log("Finalizo proceso")
''		Activity.Finish
''	
''	
''	End If 'fin de -> CantidadTotal > 0
''	
''	
''	
''End Sub
''
''#End Region
''
''
''
''#Region "Guardar el archivo XML modificando la variable esprimeravez"
''
''Private Sub CargarElXML As String
''	
''	' #############################################################################################################################################################################################
''	'TODO ESTO ES PARA GUARDAR ESTE VALOR: es decir, si completo la carga completa, cambia el valor de primeravez a falso y luego actualizara solo lo del dia
''	
''	DatosGlobales.XML_PrimeraVez = "0"
''
''	' #############################################################################################################################################################################################
''	
''	
''	Dim ArchivoXml As String = "<?xml version=""""1.0"""" encoding=""""UTF-8""""?>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "<fotos>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "" & CRLF & ""
''	
''	ArchivoXml = ArchivoXml & " <login>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <usuario>" & DatosGlobales.XML_Usuario & "</usuario>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <contraseña>" & DatosGlobales.XML_Contraseña & "</contraseña>"  & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <recordar>" & DatosGlobales.XML_Recordar & "</recordar>"  & CRLF & ""
''	ArchivoXml = ArchivoXml & " </login>"  & CRLF & ""
''	
''	ArchivoXml = ArchivoXml & "" & CRLF & ""
''	ArchivoXml = ArchivoXml & " <ruta_origen>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <fotoscamara>" & DatosGlobales.XML_FotosCamara & "</fotoscamara>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <videoscamara>" & DatosGlobales.XML_VideosCamara & "</videoscamara>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <imageneswhatsapp>" & DatosGlobales.XML_ImagenesWhatsApp & "</imageneswhatsapp>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <videoswhatsapp>" & DatosGlobales.XML_VideosWhatsApp & "</videoswhatsapp>" & CRLF & ""
''
''	ArchivoXml = ArchivoXml & "   <chfotoscamara>" & DatosGlobales.XML_ChFotosCamara & "</chfotoscamara>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <chvideoscamara>" & DatosGlobales.XML_ChVideosCamara & "</chvideoscamara>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <chimageneswhatsapp>" & DatosGlobales.XML_ChImagenesWhatsApp & "</chimageneswhatsapp>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <chvideoswhatsapp>" & DatosGlobales.XML_ChVideosWhatsApp & "</chvideoswhatsapp>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <primeravez>" & DatosGlobales.XML_PrimeraVez & "</primeravez>" & CRLF & ""
''	
''	ArchivoXml = ArchivoXml & " </ruta_origen>" & CRLF & ""
''	
''	ArchivoXml = ArchivoXml & "" & CRLF & ""
''	ArchivoXml = ArchivoXml & " <ruta_destino>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <UsuarioRutaFotos>" & DatosGlobales.XML_UsuarioRutaFotos & "</UsuarioRutaFotos>" & CRLF & ""
''	ArchivoXml = ArchivoXml & " </ruta_destino>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "" & CRLF & ""
''	
''	ArchivoXml = ArchivoXml & " <ftp>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <servidorruta>" & DatosGlobales.XML_ServidorRuta & "</servidorruta>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <servidorip>" & DatosGlobales.XML_ServidorIp & "</servidorip>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <servidorpuerto>" & DatosGlobales.XML_ServidorPuerto & "</servidorpuerto>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <servidorusuario>" & DatosGlobales.XML_ServidorUsuario & "</servidorusuario>" & CRLF & ""
''	ArchivoXml = ArchivoXml & "   <servidorclave>" & DatosGlobales.XML_ServidorClave & "</servidorclave>" & CRLF & ""
''	ArchivoXml = ArchivoXml & " </ftp>" & CRLF & ""
''	
''	ArchivoXml = ArchivoXml & "" & CRLF & ""
''	ArchivoXml = ArchivoXml & "</fotos>" & CRLF & ""
''	
''	Return ArchivoXml
''	
''End Sub
''
''
''#End Region
''
''
''
''
''Private Sub DevolverLista(unaRuta As String, esPrimeraVez As Boolean) As List
''	'si es primera vez, devuelve toda la lista completa
''	'de lo contrario si no es primera vez solo listara los archivos del dia
''
''	Dim unaListaFinal As List
''	Dim unaListaProvisoria As List
''	Dim unaListaProvisoria2 As List
''	
''	unaListaFinal.Initialize
''	unaListaProvisoria.Initialize
''	unaListaProvisoria2.Initialize
''	
''	unaListaFinal.Clear
''	unaListaProvisoria.Clear
''	unaListaProvisoria2.Clear
''	
''	DateTime.DateFormat = "yyyyMMdd"
''	Dim FechaActual As String
''	FechaActual = DateTime.Date(DateTime.Now)
''	
''	
''	If esPrimeraVez = False Then
''		
''		unaListaProvisoria = File.ListFiles(unaRuta)
''		
''		For i = 0 To unaListaProvisoria.Size -1
''			
''			Dim	Archivo As Object = unaListaProvisoria.Get(i)
''			Dim Archivox As String = unaListaProvisoria.Get(i)
''			Dim Extension As String = FxGlobales.Right(Archivox, 3)
''			'Dim unaRuta As String = (FxGlobales.Right(Archivox, (Archivox.Length - Archivox.IndexOf(";")-1)))
''			
''			DateTime.DateFormat = "yyyyMMdd"
''			Dim d As Long
''			d = File.LastModified(unaRuta, Archivo)
''			Dim unaFechaArchivo As String = DateTime.Date(d)
''			
''			If(FechaActual = unaFechaArchivo) Then
''				unaListaProvisoria2.Add(unaListaProvisoria.Get(i))
''			End If
''		Next
''		
''		unaListaFinal = unaListaProvisoria2
''			
''	Else 'si es la primera vez le pasa todos los archivos
''		
''		unaListaFinal = File.ListFiles(unaRuta) ' [000_0964.JPG, 000_0965.JPG, 000_0966.JPG, 000_0967.JPG, 000_0967_.jpg, 000_0968.JPG, 000_0969.JPG, 000_0970.JPG, 000_0971.JPG, 000_0973.JPG, 000_0974.JPG, 000_0975.JPG, 000_0992_.jpg, Foto_Baño.jpg, SARASA]
''		
''	End If
''	
''	Return unaListaFinal
''	
''End Sub
''
''
''
''
''
''
''
''Private Sub EncontroArchivoEnServidor(unaRutaServer As String, unArchivo As String) As ResumableSub
''	Dim Resu As Boolean = False
''	FTP_Consulta.List(unaRutaServer) 'ejemplo --> "./H/DiscoCompartido/RiBackup/Fotos/20230924/"
''	Wait For FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
''	Dim TotalArchivos As Int = Files.Length
''	If Success  Then
''		For i = 0 To TotalArchivos-1
''			If unArchivo = Files(i).Name Then
''				'Files(i).Size
''				'currentFileSize = File.Size(RutaMobile, ArchivoMobile)
''				Resu = True
''				Return Resu
''			End If
''		Next
''	End If
''	Return Resu
''End Sub
'
'
'
'
'
'
'
'
'
'
'
'
'
'
'
'
