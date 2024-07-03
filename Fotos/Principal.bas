B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private SvConfiguracion As ScrollView
	Private BtnLogin As Button
	Private BtnConfiguracion As Button
	Private BtnVerFotos As Button
	Private BtnSalir As Button
	Private BtnCerrarApp As Button
	Private BtnEjecutar As Button
	Private BtnDetener As Button
	Private BtnCargarImg As Button
	Private ImageView1 As ImageView
	
	
	Dim FTP_Consulta As FTP
	Dim FTP_Consulta_Carp_Int As FTP
	
	
	Dim fd As FileDialog
	Dim PathSeleccionado As String
	
	
	
	Private BtnSelCarpeta As Button
	Private RbInterna As RadioButton
	Private RbExterna As RadioButton
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")

	DatosGlobales.EnPrincipal = True


	Activity.LoadLayout("configuracion") 're utilizo el ScrollView de configuracion
	SvConfiguracion.Panel.LoadLayout("principal")
	SvConfiguracion.Panel.Width = 320dip
	SvConfiguracion.Panel.Height = 1100dip


	'Activity.LoadLayout("principal")

	
	RbInterna.Checked = True
	RbInterna_CheckedChange(True)

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub




Private Sub BtnLogin_Click
	If DatosGlobales.Ejecutandose = False Then
		StartActivity(Login)		
	Else
		ToastMessageShow("#ERROR: no es posible realizar esta operación mientras hay una copia en curso.", True)		
	End If
End Sub

Private Sub BtnConfiguracion_Click
	If DatosGlobales.Ejecutandose = False Then
		StartActivity(Configuracion)
	Else
		ToastMessageShow("#ERROR: no es posible realizar esta operación mientras hay una copia en curso.", True)
	End If
End Sub


Private Sub BtnVerFotos_Click
	
End Sub

Private Sub BtnSalir_Click
	DatosGlobales.EnPrincipal = False
	Activity.Finish
End Sub

Private Sub BtnCerrarApp_Click
	StopService(ServBackUp)
	StopService(ServBackUp2)
	StopService(ServBackUp4)
	
	Dim jo As JavaObject
	jo.InitializeContext
	jo.RunMethod("finishAffinity", Null)
End Sub

Private Sub BtnEjecutar_Click
	
	
	Log("BtnEjecutar_Click --> Log? " & DatosGlobales.LogOk & " - Ejecutandose? " & DatosGlobales.Ejecutandose)
	
	DatosGlobales.Ejecutandose = False
	
	If DatosGlobales.Ejecutandose = False Then
		'DatosGlobales.ForzarEjecucion = True
		'StartService(ServBackUp) 'esto ejecuta el servicio
		'StartActivity(Main)
		
		If DatosGlobales.LogOk = True Then
			'DatosGlobales.Ejecutandose = False
			
			StopService(ServBackUp4)
			
			StartService(ServBackUp4)
		Else
			StartActivity(Login)
		End If
		
		Activity.Finish
	Else
		ToastMessageShow("#ERROR: no es posible realizar esta operación mientras hay una copia en curso.", True)
	End If
	
	

'	
'	StartService(ServBackUp)
'	Activity.Finish
	
End Sub

Private Sub BtnDetener_Click
	
	StopService(ServBackUp4)
	
End Sub

Private Sub BtnCargarImg_Click
	
	
	'DatosGlobales.UsuarioRutaFotos --> ./H/DiscoCompartido/RiBackup-TEST
	
	EncontroArchivoEnServidor(DatosGlobales.UsuarioRutaFotos)
	
	'Log("ServidorRuta: " & DatosGlobales.ServidorRuta & "; UsuarioRutaFotos: " & DatosGlobales.UsuarioRutaFotos)
	
	
	
	'Log("Se viene la colecion")
	'Log(DatosGlobales.ColMobilRutaOrigen)
	
	
	'ImageView1.Bitmap = LoadBitmap("/sdcard/Pictures/Fotos", "IMG_20221223_215056.jpg") ' anda pero se ve q es local
	
	'ImageView1.Bitmap = LoadBitmap("./H/DiscoCompartido/RiBackup-TEST/Imagenes WhatsApp/20211015", "IMG-20211015-WA0044.jpg")
	
	
	'H:\RiBackup-TEST\Fotos\20050215
	'000_0968.JPG
	
	
	
	'/sdcard/Pictures/Fotos
	'IMG_20221223_215056.jpg
	
End Sub




#Region "Para cargar y listas las imagenes"


Private Sub EncontroArchivoEnServidor(unaRutaServer As String) As ResumableSub 'ServidorRuta: UsuarioRutaFotos --> ./H/DiscoCompartido/RiBackup-TEST

	Dim ListaCarpetasBase As List
	ListaCarpetasBase.Initialize
	
	Dim ListaCarpetasInternas As List
	ListaCarpetasInternas.Initialize
	
	Dim rs As ResumableSub = ObtenerListaCarpetasBase(unaRutaServer)
	Wait For(rs) Complete (Result As List)
	If Result.Size > 0 Then 
		ListaCarpetasBase = Result
	End If
		
	Log("CANTIDAD DE CARPETAS --> Tamaño de 'ListaCarpetasBase.Size':" & ListaCarpetasBase.Size)
	
	
	For i = 0 To ListaCarpetasBase.Size-1
		Log(" ### " & ListaCarpetasBase.Get(i) & " ### ")
		
		Dim rs As ResumableSub = ObtenerListaCarpetasBase(ListaCarpetasBase.Get(i))
		Wait For(rs) Complete (Result As List)
		If Result.Size > 0 Then
				
			For j = 0 To Result.Size -1
				'ListaCarpetasInternas.Add(Result.Get(j))
				Log(" ## " & Result.Get(j) & " ## ")
					Dim rs As ResumableSub = ObtenerListaDeArchivos(Result.Get(j))
					Wait For(rs) Complete (ResultArch As List)
					If ResultArch.Size > 0 Then
						For k = 0 To ResultArch.Size -1
							Log("- " & ResultArch.Get(k) & " -")
						Next
					End If
			Next
				
		End If
		
	Next
	
	
	'Log(ListaCarpetasInternas)
	
	
'	Dim rs As ResumableSub = ObtenerListaDeCarpetasInternas(ListaCarpetasBase)
'	Wait For(rs) Complete (Result As List)
'	If Result.Size > 0 Then
'		ListaCarpetasBase = Result
'	End If

End Sub


Private Sub ObtenerListaCarpetasBase(unaRutaServer As String) As ResumableSub
	Dim TotalArchivos As Int 
	Dim TotalCarpetas As Int
	Dim ListaCarpetasBase As List
	ListaCarpetasBase.Initialize
	If FTP_Consulta.IsInitialized = True Then
		FTP_Consulta.CloseNow
	End If
	FTP_Consulta.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
	FTP_Consulta.PassiveMode = True
	FTP_Consulta.List(unaRutaServer) 'ejemplo --> "./H/DiscoCompartido/RiBackup/Fotos/20230924/"
	Wait For FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	If Success  Then
		TotalArchivos = Files.Length
		TotalCarpetas = Folders.Length
		For j = 0 To TotalCarpetas-1
			ListaCarpetasBase.Add(unaRutaServer & "/" & Folders(j).Name)
		Next
		FTP_Consulta.CloseNow
	End If
	Return ListaCarpetasBase
End Sub


Private Sub ObtenerListaDeArchivos(unaRutaServer As String) As ResumableSub
	Dim TotalArchivos As Int 
	'Dim TotalCarpetas As Int
	Dim ListaCarpetasBase As List
	ListaCarpetasBase.Initialize
	If FTP_Consulta.IsInitialized = True Then
		FTP_Consulta.CloseNow
	End If
	FTP_Consulta.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
	FTP_Consulta.PassiveMode = True
	FTP_Consulta.List(unaRutaServer) 'ejemplo --> "./H/DiscoCompartido/RiBackup/Fotos/20230924/"
	Wait For FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	If Success  Then
		TotalArchivos = Files.Length
		'TotalCarpetas = Folders.Length
		For j = 0 To TotalArchivos-1
			ListaCarpetasBase.Add(unaRutaServer & "/" & Files(j).Name)
		Next
		FTP_Consulta.CloseNow
	End If
	Return ListaCarpetasBase
End Sub




'
'Private Sub ObtenerListaDeCarpetasInternas(unaRutaServer As String) As ResumableSub
'	For m = 0 To ListaCarpetasBase.Size-1
'		Log(ListaCarpetasBase.Get(m))
'		Dim unaRutaServer As String = ListaCarpetasBase.Get(m)
'			
'		FTP_Consulta_Carp_Int.Initialize("FTP",DatosGlobales.ServidorIp, DatosGlobales.ServidorPuerto, DatosGlobales.ServidorUsuario, DatosGlobales.ServidorClave) 'este es el web
'		FTP_Consulta_Carp_Int.PassiveMode = True
'			
'		FTP_Consulta_Carp_Int.List(unaRutaServer) 'ejemplo --> "./H/DiscoCompartido/RiBackup-TEST/Fotos" - "./H/DiscoCompartido/RiBackup-TEST/Imagenes WhatsApp"
'		FTP_Consulta_Carp_Int.PassiveMode = True
'		Wait For FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
'		Dim TotalArchivosInt As Int = Files.Length
'		Dim TotalCarpetasInt As Int = Folders.Length
'			
'		Log("llego aca? 4 - TOTAL DE ARCHIVOS: " & TotalArchivosInt & " - TOTAL CARPETAS: " & TotalCarpetasInt)
'			
'		If Success  Then
'				
'			For k = 0 To TotalCarpetasInt-1
'				Log(Folders(k).Name)
'			Next
'				
'			For l = 0 To TotalArchivosInt-1
'				Log(Files(l).Name)
'			Next
'				
'		End If
'			
'			
'		FTP_Consulta_Carp_Int.CloseNow
'			
'	Next
'
'	Return ListaCarpetasBase
'End Sub


#End Region




Private Sub BtnSelCarpeta_Click
	
	fd.ShowOnlyFolders = True
	'fd.Initialize(Activity, "Select Folder")
	fd.FilePath = PathSeleccionado 'File.DirInternal 'File.DirRootExternal ' Empieza en el directorio raíz del almacenamiento externo
	fd.FileFilter = Null ' No filtrar ningún archivo específico
	
	Dim sf As Object = fd.ShowAsync("Seleccioná una ruta", "Si", "Cancelar", "No", Null, False)  '("Select Folder", "OK", "Cancel", "", Null)
	
	Wait For (sf) Dialog_Result(Result As Int)
	
	Log("Resultado: " & Result)
	
	If Result = DialogResponse.POSITIVE Then
		Log("Selected Folder: " & fd.FilePath)
	Else
		Log("No se seleccionó ninguna carpeta.")
	End If
	
	
	
End Sub

'Sub fd_Result (Success As Boolean)
'	PathSeleccionado = fd.FilePath
'	Log("Selected Folder: " & PathSeleccionado)
'	If Success Then
'		PathSeleccionado = fd.ChosenName
'		Log("Selected Folder: " & PathSeleccionado)
'		' Aquí puedes manejar la carpeta seleccionada, por ejemplo, mostrarla en un Label
'	Else
'		ToastMessageShow("No folder selected", False)
'	End If
'End Sub


Sub EventName_Result (Result As Boolean)
	
End Sub


Private Sub RbInterna_CheckedChange(Checked As Boolean)
	PathSeleccionado = File.DirInternal
End Sub

Private Sub RbExterna_CheckedChange(Checked As Boolean)
	PathSeleccionado = File.DirRootExternal
End Sub