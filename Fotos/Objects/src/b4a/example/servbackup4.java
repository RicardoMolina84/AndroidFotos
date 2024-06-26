package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class servbackup4 extends android.app.Service{
	public static class servbackup4_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (servbackup4) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, servbackup4.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, BA.class);
		}

	}
    static servbackup4 mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return servbackup4.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "b4a.example", "b4a.example.servbackup4");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.servbackup4", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (servbackup4) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (servbackup4) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (servbackup4) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (servbackup4) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (servbackup4) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.net.FTPWrapper _ftptest = null;
public static anywheresoftware.b4a.objects.NotificationWrapper _noti = null;
public static int _idnotificacion = 0;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.objects.collections.List _listacompleta = null;
public static anywheresoftware.b4a.objects.collections.List _listafotos = null;
public static anywheresoftware.b4a.objects.collections.List _listavideos = null;
public static int _cantencurso = 0;
public static int _cantidadtotal = 0;
public static int _cantidadok = 0;
public static int _cantidadfallidas = 0;
public static anywheresoftware.b4a.phone.Phone.PhoneWakeState _awake = null;
public static b4a.example.servbackup4._tipooperacion _operacion = null;
public static String _pathfotoscamara = "";
public static String _pathvideoscamara = "";
public static String _pathimageneswhatsapp = "";
public static String _pathvideoswhatsapp = "";
public static anywheresoftware.b4a.net.FTPWrapper _ftp3 = null;
public static anywheresoftware.b4a.net.FTPWrapper _ftp4 = null;
public static anywheresoftware.b4a.net.FTPWrapper _ftp_consulta = null;
public static int _currentfilesize = 0;
public static boolean _esprimeravez = false;
public static String _fechawhapp = "";
public b4a.example.main _main = null;
public b4a.example.principal _principal = null;
public b4a.example.datosglobales _datosglobales = null;
public b4a.example.fxglobales _fxglobales = null;
public b4a.example.login _login = null;
public b4a.example.configuracion _configuracion = null;
public b4a.example.backup _backup = null;
public b4a.example.servbackup _servbackup = null;
public b4a.example.servbackup2 _servbackup2 = null;
public b4a.example.servbackup3 _servbackup3 = null;
public b4a.example.starter _starter = null;
public static class _tipooperacion{
public boolean IsInitialized;
public int FotosCamara;
public int VideosCamara;
public int ImagenesWhatsApp;
public int VideosWhatsApp;
public void Initialize() {
IsInitialized = true;
FotosCamara = 0;
VideosCamara = 0;
ImagenesWhatsApp = 0;
VideosWhatsApp = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _cargarelxml() throws Exception{
String _archivoxml = "";
 //BA.debugLineNum = 1252;BA.debugLine="Private Sub CargarElXML As String";
 //BA.debugLineNum = 1257;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"0\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "0";
 //BA.debugLineNum = 1262;BA.debugLine="Dim ArchivoXml As String = \"<?xml version=\"\"\"\"1.0";
_archivoxml = "<?xml version=\"\"1.0\"\" encoding=\"\"UTF-8\"\"?>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1263;BA.debugLine="ArchivoXml = ArchivoXml & \"<fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"<fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1264;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1266;BA.debugLine="ArchivoXml = ArchivoXml & \" <login>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1267;BA.debugLine="ArchivoXml = ArchivoXml & \"   <usuario>\" & DatosG";
_archivoxml = _archivoxml+"   <usuario>"+mostCurrent._datosglobales._xml_usuario /*String*/ +"</usuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1268;BA.debugLine="ArchivoXml = ArchivoXml & \"   <contraseña>\" & Dat";
_archivoxml = _archivoxml+"   <contraseña>"+mostCurrent._datosglobales._xml_contraseña /*String*/ +"</contraseña>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1269;BA.debugLine="ArchivoXml = ArchivoXml & \"   <recordar>\" & Datos";
_archivoxml = _archivoxml+"   <recordar>"+mostCurrent._datosglobales._xml_recordar /*String*/ +"</recordar>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1270;BA.debugLine="ArchivoXml = ArchivoXml & \" </login>\"  & CRLF & \"";
_archivoxml = _archivoxml+" </login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1272;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1273;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_origen>\" & CRLF";
_archivoxml = _archivoxml+" <ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1274;BA.debugLine="ArchivoXml = ArchivoXml & \"   <fotoscamara>\" & Da";
_archivoxml = _archivoxml+"   <fotoscamara>"+mostCurrent._datosglobales._xml_fotoscamara /*String*/ +"</fotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1275;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoscamara>\" & D";
_archivoxml = _archivoxml+"   <videoscamara>"+mostCurrent._datosglobales._xml_videoscamara /*String*/ +"</videoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1276;BA.debugLine="ArchivoXml = ArchivoXml & \"   <imageneswhatsapp>\"";
_archivoxml = _archivoxml+"   <imageneswhatsapp>"+mostCurrent._datosglobales._xml_imageneswhatsapp /*String*/ +"</imageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1277;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoswhatsapp>\" &";
_archivoxml = _archivoxml+"   <videoswhatsapp>"+mostCurrent._datosglobales._xml_videoswhatsapp /*String*/ +"</videoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1279;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chfotoscamara>\" &";
_archivoxml = _archivoxml+"   <chfotoscamara>"+mostCurrent._datosglobales._xml_chfotoscamara /*String*/ +"</chfotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1280;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoscamara>\" &";
_archivoxml = _archivoxml+"   <chvideoscamara>"+mostCurrent._datosglobales._xml_chvideoscamara /*String*/ +"</chvideoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1281;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chimageneswhatsapp";
_archivoxml = _archivoxml+"   <chimageneswhatsapp>"+mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/ +"</chimageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1282;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoswhatsapp>\"";
_archivoxml = _archivoxml+"   <chvideoswhatsapp>"+mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/ +"</chvideoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1283;BA.debugLine="ArchivoXml = ArchivoXml & \"   <primeravez>\" & Dat";
_archivoxml = _archivoxml+"   <primeravez>"+mostCurrent._datosglobales._xml_primeravez /*String*/ +"</primeravez>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1285;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_origen>\" & CRL";
_archivoxml = _archivoxml+" </ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1287;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1288;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_destino>\" & CRL";
_archivoxml = _archivoxml+" <ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1289;BA.debugLine="ArchivoXml = ArchivoXml & \"   <UsuarioRutaFotos>\"";
_archivoxml = _archivoxml+"   <UsuarioRutaFotos>"+mostCurrent._datosglobales._xml_usuariorutafotos /*String*/ +"</UsuarioRutaFotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1290;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_destino>\" & CR";
_archivoxml = _archivoxml+" </ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1291;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1293;BA.debugLine="ArchivoXml = ArchivoXml & \" <ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1294;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorruta>\" & D";
_archivoxml = _archivoxml+"   <servidorruta>"+mostCurrent._datosglobales._xml_servidorruta /*String*/ +"</servidorruta>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1295;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorip>\" & Dat";
_archivoxml = _archivoxml+"   <servidorip>"+mostCurrent._datosglobales._xml_servidorip /*String*/ +"</servidorip>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1296;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorpuerto>\" &";
_archivoxml = _archivoxml+"   <servidorpuerto>"+mostCurrent._datosglobales._xml_servidorpuerto /*String*/ +"</servidorpuerto>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1297;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorusuario>\"";
_archivoxml = _archivoxml+"   <servidorusuario>"+mostCurrent._datosglobales._xml_servidorusuario /*String*/ +"</servidorusuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1298;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorclave>\" &";
_archivoxml = _archivoxml+"   <servidorclave>"+mostCurrent._datosglobales._xml_servidorclave /*String*/ +"</servidorclave>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1299;BA.debugLine="ArchivoXml = ArchivoXml & \" </ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" </ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1301;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1302;BA.debugLine="ArchivoXml = ArchivoXml & \"</fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"</fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 1304;BA.debugLine="Return ArchivoXml";
if (true) return _archivoxml;
 //BA.debugLineNum = 1306;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _consultarcantidadtotaldearchivos(anywheresoftware.b4a.objects.collections.List _uncolmobilrutaorigen) throws Exception{
ResumableSub_ConsultarCantidadTotalDeArchivos rsub = new ResumableSub_ConsultarCantidadTotalDeArchivos(null,_uncolmobilrutaorigen);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ConsultarCantidadTotalDeArchivos extends BA.ResumableSub {
public ResumableSub_ConsultarCantidadTotalDeArchivos(b4a.example.servbackup4 parent,anywheresoftware.b4a.objects.collections.List _uncolmobilrutaorigen) {
this.parent = parent;
this._uncolmobilrutaorigen = _uncolmobilrutaorigen;
}
b4a.example.servbackup4 parent;
anywheresoftware.b4a.objects.collections.List _uncolmobilrutaorigen;
boolean _resultado = false;
int _i = 0;
String _contenidocoleccion_ = "";
String _ruta_ = "";
String _tipooperacion = "";
boolean _primeravez = false;
anywheresoftware.b4a.objects.collections.List _listagenerica_ = null;
int _h = 0;
String _extension = "";
String _archivox = "";
int step3;
int limit3;
int step17;
int limit17;
int step28;
int limit28;
int step39;
int limit39;
int step50;
int limit50;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1475;BA.debugLine="Dim Resultado As Boolean = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1476;BA.debugLine="CantidadTotal = 0";
parent._cantidadtotal = (int) (0);
 //BA.debugLineNum = 1480;BA.debugLine="For i = 0 To unColMobilRutaOrigen.Size-1";
if (true) break;

case 1:
//for
this.state = 74;
step3 = 1;
limit3 = (int) (_uncolmobilrutaorigen.getSize()-1);
_i = (int) (0) ;
this.state = 75;
if (true) break;

case 75:
//C
this.state = 74;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 3;
if (true) break;

case 76:
//C
this.state = 75;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1481;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 73;
this.catchState = 72;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 72;
 //BA.debugLineNum = 1482;BA.debugLine="Dim ContenidoColeccion_ As String= unColMobilRu";
_contenidocoleccion_ = BA.ObjectToString(_uncolmobilrutaorigen.Get(_i));
 //BA.debugLineNum = 1483;BA.debugLine="Dim Ruta_ As String = (FxGlobales.Right(Conteni";
_ruta_ = (parent.mostCurrent._fxglobales._right /*String*/ (processBA,_contenidocoleccion_,(int) ((_contenidocoleccion_.length()-_contenidocoleccion_.indexOf(";")-1))));
 //BA.debugLineNum = 1485;BA.debugLine="Dim TipoOperacion As String = (FxGlobales.Left(";
_tipooperacion = (parent.mostCurrent._fxglobales._left /*String*/ (processBA,_contenidocoleccion_,_contenidocoleccion_.indexOf(";")));
 //BA.debugLineNum = 1487;BA.debugLine="Log(\"CONTENIDO DE LA LISTA --> \" & unColMobilRu";
anywheresoftware.b4a.keywords.Common.LogImpl("61310734","CONTENIDO DE LA LISTA --> "+BA.ObjectToString(_uncolmobilrutaorigen.Get(_i))+" TIPO --> "+_tipooperacion,0);
 //BA.debugLineNum = 1489;BA.debugLine="Dim PrimeraVez As Boolean";
_primeravez = false;
 //BA.debugLineNum = 1490;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent.mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 1491;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 1493;BA.debugLine="PrimeraVez= False";
_primeravez = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 1496;BA.debugLine="Dim ListaGenerica_ As List = DevolverLista(Ruta";
_listagenerica_ = new anywheresoftware.b4a.objects.collections.List();
_listagenerica_ = _devolverlista(_ruta_,_primeravez);
 //BA.debugLineNum = 1511;BA.debugLine="If TipoOperacion = \"MobilRutaFotos\" Then";
if (true) break;

case 13:
//if
this.state = 70;
if ((_tipooperacion).equals("MobilRutaFotos")) { 
this.state = 15;
}else if((_tipooperacion).equals("MobilRutaVideos")) { 
this.state = 29;
}else if((_tipooperacion).equals("MobilRutaFotosWhapp")) { 
this.state = 43;
}else if((_tipooperacion).equals("MobilRutaVideosWhapp")) { 
this.state = 57;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 1512;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
if (true) break;

case 16:
//for
this.state = 27;
step17 = 1;
limit17 = (int) (_listagenerica_.getSize()-1);
_h = (int) (0) ;
this.state = 77;
if (true) break;

case 77:
//C
this.state = 27;
if ((step17 > 0 && _h <= limit17) || (step17 < 0 && _h >= limit17)) this.state = 18;
if (true) break;

case 78:
//C
this.state = 77;
_h = ((int)(0 + _h + step17)) ;
if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 1513;BA.debugLine="Dim Extension As String = \"\"";
_extension = "";
 //BA.debugLineNum = 1514;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
_archivox = BA.ObjectToString(_listagenerica_.Get(_h));
 //BA.debugLineNum = 1515;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
_extension = parent.mostCurrent._fxglobales._right /*String*/ (processBA,_archivox,(int) (3));
 //BA.debugLineNum = 1516;BA.debugLine="If Extension.ToUpperCase = \"JPG\" Then";
if (true) break;

case 19:
//if
this.state = 26;
if ((_extension.toUpperCase()).equals("JPG")) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 1517;BA.debugLine="If DatosGlobales.XML_ChFotosCamara = \"1\" The";
if (true) break;

case 22:
//if
this.state = 25;
if ((parent.mostCurrent._datosglobales._xml_chfotoscamara /*String*/ ).equals("1")) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 1518;BA.debugLine="CantidadTotal = CantidadTotal + 1";
parent._cantidadtotal = (int) (parent._cantidadtotal+1);
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 78;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 70;
;
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 1524;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
if (true) break;

case 30:
//for
this.state = 41;
step28 = 1;
limit28 = (int) (_listagenerica_.getSize()-1);
_h = (int) (0) ;
this.state = 79;
if (true) break;

case 79:
//C
this.state = 41;
if ((step28 > 0 && _h <= limit28) || (step28 < 0 && _h >= limit28)) this.state = 32;
if (true) break;

case 80:
//C
this.state = 79;
_h = ((int)(0 + _h + step28)) ;
if (true) break;

case 32:
//C
this.state = 33;
 //BA.debugLineNum = 1525;BA.debugLine="Dim Extension As String = \"\"";
_extension = "";
 //BA.debugLineNum = 1526;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
_archivox = BA.ObjectToString(_listagenerica_.Get(_h));
 //BA.debugLineNum = 1527;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
_extension = parent.mostCurrent._fxglobales._right /*String*/ (processBA,_archivox,(int) (3));
 //BA.debugLineNum = 1528;BA.debugLine="If Extension.ToUpperCase = \"MP4\" Then";
if (true) break;

case 33:
//if
this.state = 40;
if ((_extension.toUpperCase()).equals("MP4")) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 //BA.debugLineNum = 1529;BA.debugLine="If DatosGlobales.XML_ChVideosCamara = \"1\" Th";
if (true) break;

case 36:
//if
this.state = 39;
if ((parent.mostCurrent._datosglobales._xml_chvideoscamara /*String*/ ).equals("1")) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 //BA.debugLineNum = 1530;BA.debugLine="CantidadTotal = CantidadTotal + 1";
parent._cantidadtotal = (int) (parent._cantidadtotal+1);
 if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 80;
;
 if (true) break;
if (true) break;

case 41:
//C
this.state = 70;
;
 if (true) break;

case 43:
//C
this.state = 44;
 //BA.debugLineNum = 1536;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
if (true) break;

case 44:
//for
this.state = 55;
step39 = 1;
limit39 = (int) (_listagenerica_.getSize()-1);
_h = (int) (0) ;
this.state = 81;
if (true) break;

case 81:
//C
this.state = 55;
if ((step39 > 0 && _h <= limit39) || (step39 < 0 && _h >= limit39)) this.state = 46;
if (true) break;

case 82:
//C
this.state = 81;
_h = ((int)(0 + _h + step39)) ;
if (true) break;

case 46:
//C
this.state = 47;
 //BA.debugLineNum = 1537;BA.debugLine="Dim Extension As String = \"\"";
_extension = "";
 //BA.debugLineNum = 1538;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
_archivox = BA.ObjectToString(_listagenerica_.Get(_h));
 //BA.debugLineNum = 1539;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
_extension = parent.mostCurrent._fxglobales._right /*String*/ (processBA,_archivox,(int) (3));
 //BA.debugLineNum = 1540;BA.debugLine="If Extension.ToUpperCase = \"JPG\" Then";
if (true) break;

case 47:
//if
this.state = 54;
if ((_extension.toUpperCase()).equals("JPG")) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 //BA.debugLineNum = 1541;BA.debugLine="If DatosGlobales.XML_ChImagenesWhatsApp = \"1";
if (true) break;

case 50:
//if
this.state = 53;
if ((parent.mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/ ).equals("1")) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 //BA.debugLineNum = 1542;BA.debugLine="CantidadTotal = CantidadTotal + 1";
parent._cantidadtotal = (int) (parent._cantidadtotal+1);
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 82;
;
 if (true) break;
if (true) break;

case 55:
//C
this.state = 70;
;
 if (true) break;

case 57:
//C
this.state = 58;
 //BA.debugLineNum = 1548;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
if (true) break;

case 58:
//for
this.state = 69;
step50 = 1;
limit50 = (int) (_listagenerica_.getSize()-1);
_h = (int) (0) ;
this.state = 83;
if (true) break;

case 83:
//C
this.state = 69;
if ((step50 > 0 && _h <= limit50) || (step50 < 0 && _h >= limit50)) this.state = 60;
if (true) break;

case 84:
//C
this.state = 83;
_h = ((int)(0 + _h + step50)) ;
if (true) break;

case 60:
//C
this.state = 61;
 //BA.debugLineNum = 1549;BA.debugLine="Dim Extension As String = \"\"";
_extension = "";
 //BA.debugLineNum = 1550;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
_archivox = BA.ObjectToString(_listagenerica_.Get(_h));
 //BA.debugLineNum = 1551;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
_extension = parent.mostCurrent._fxglobales._right /*String*/ (processBA,_archivox,(int) (3));
 //BA.debugLineNum = 1552;BA.debugLine="If Extension.ToUpperCase = \"MP4\" Then";
if (true) break;

case 61:
//if
this.state = 68;
if ((_extension.toUpperCase()).equals("MP4")) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 //BA.debugLineNum = 1553;BA.debugLine="If DatosGlobales.XML_ChVideosWhatsApp = \"1\"";
if (true) break;

case 64:
//if
this.state = 67;
if ((parent.mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/ ).equals("1")) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
 //BA.debugLineNum = 1554;BA.debugLine="CantidadTotal = CantidadTotal + 1";
parent._cantidadtotal = (int) (parent._cantidadtotal+1);
 if (true) break;

case 67:
//C
this.state = 68;
;
 if (true) break;

case 68:
//C
this.state = 84;
;
 if (true) break;
if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;

case 70:
//C
this.state = 73;
;
 if (true) break;

case 72:
//C
this.state = 73;
this.catchState = 0;
 //BA.debugLineNum = 1579;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("61310826",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 //BA.debugLineNum = 1580;BA.debugLine="ToastMessageShow(\"#ERROR: \" & LastException, Tr";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("#ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA))),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
if (true) break;

case 73:
//C
this.state = 76;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 74:
//C
this.state = -1;
;
 //BA.debugLineNum = 1585;BA.debugLine="Resultado = True";
_resultado = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1587;BA.debugLine="Return Resultado";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resultado));return;};
 //BA.debugLineNum = 1590;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _crearnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Private Sub CrearNotificacion(UnIdNotificacion As";
 //BA.debugLineNum = 407;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
 //BA.debugLineNum = 409;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
 //BA.debugLineNum = 410;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 411;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 412;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 413;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
 //BA.debugLineNum = 414;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _devolverlista(String _unaruta,boolean _oesprimeravez) throws Exception{
anywheresoftware.b4a.objects.collections.List _unalistafinal = null;
anywheresoftware.b4a.objects.collections.List _unalistaprovisoria = null;
anywheresoftware.b4a.objects.collections.List _unalistaprovisoria2 = null;
String _fechaactual = "";
int _i = 0;
Object _archivo = null;
String _archivox = "";
String _extension = "";
long _d = 0L;
String _unafechaarchivo = "";
String _fechaayer = "";
String _fecha2diasantes = "";
String _fecha3diasantes = "";
anywheresoftware.b4a.objects.collections.List _unalistafinalsindupli = null;
 //BA.debugLineNum = 1314;BA.debugLine="Private Sub DevolverLista(unaRuta As String, oEsPr";
 //BA.debugLineNum = 1318;BA.debugLine="Dim unaListaFinal As List";
_unalistafinal = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1319;BA.debugLine="Dim unaListaProvisoria As List";
_unalistaprovisoria = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1320;BA.debugLine="Dim unaListaProvisoria2 As List";
_unalistaprovisoria2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1322;BA.debugLine="unaListaFinal.Initialize";
_unalistafinal.Initialize();
 //BA.debugLineNum = 1323;BA.debugLine="unaListaProvisoria.Initialize";
_unalistaprovisoria.Initialize();
 //BA.debugLineNum = 1324;BA.debugLine="unaListaProvisoria2.Initialize";
_unalistaprovisoria2.Initialize();
 //BA.debugLineNum = 1326;BA.debugLine="unaListaFinal.Clear";
_unalistafinal.Clear();
 //BA.debugLineNum = 1327;BA.debugLine="unaListaProvisoria.Clear";
_unalistaprovisoria.Clear();
 //BA.debugLineNum = 1328;BA.debugLine="unaListaProvisoria2.Clear";
_unalistaprovisoria2.Clear();
 //BA.debugLineNum = 1330;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
 //BA.debugLineNum = 1331;BA.debugLine="Dim FechaActual As String";
_fechaactual = "";
 //BA.debugLineNum = 1332;BA.debugLine="FechaActual = DateTime.Date(DateTime.Now)";
_fechaactual = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 1335;BA.debugLine="If oEsPrimeraVez = False Then";
if (_oesprimeravez==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 1337;BA.debugLine="unaListaProvisoria = File.ListFiles(unaRuta)";
_unalistaprovisoria = anywheresoftware.b4a.keywords.Common.File.ListFiles(_unaruta);
 //BA.debugLineNum = 1339;BA.debugLine="For i = 0 To unaListaProvisoria.Size -1";
{
final int step15 = 1;
final int limit15 = (int) (_unalistaprovisoria.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 1341;BA.debugLine="Dim	Archivo As Object = unaListaProvisoria.Get(";
_archivo = _unalistaprovisoria.Get(_i);
 //BA.debugLineNum = 1342;BA.debugLine="Dim Archivox As String = unaListaProvisoria.Get";
_archivox = BA.ObjectToString(_unalistaprovisoria.Get(_i));
 //BA.debugLineNum = 1343;BA.debugLine="Dim Extension As String = FxGlobales.Right(Arch";
_extension = mostCurrent._fxglobales._right /*String*/ (processBA,_archivox,(int) (3));
 //BA.debugLineNum = 1346;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
 //BA.debugLineNum = 1347;BA.debugLine="Dim d As Long";
_d = 0L;
 //BA.debugLineNum = 1348;BA.debugLine="d = File.LastModified(unaRuta, Archivo)";
_d = anywheresoftware.b4a.keywords.Common.File.LastModified(_unaruta,BA.ObjectToString(_archivo));
 //BA.debugLineNum = 1349;BA.debugLine="Dim unaFechaArchivo As String = DateTime.Date(d";
_unafechaarchivo = anywheresoftware.b4a.keywords.Common.DateTime.Date(_d);
 //BA.debugLineNum = 1351;BA.debugLine="If(FechaActual = unaFechaArchivo) Then 'hoy";
if (((_fechaactual).equals(_unafechaarchivo))) { 
 //BA.debugLineNum = 1352;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
_unalistaprovisoria2.Add(_unalistaprovisoria.Get(_i));
 };
 //BA.debugLineNum = 1356;BA.debugLine="Dim FechaAyer As String";
_fechaayer = "";
 //BA.debugLineNum = 1357;BA.debugLine="FechaAyer = DateTime.Date(DateTime.Add(DateTime";
_fechaayer = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)));
 //BA.debugLineNum = 1358;BA.debugLine="If(FechaAyer = unaFechaArchivo) Then 'los de ay";
if (((_fechaayer).equals(_unafechaarchivo))) { 
 //BA.debugLineNum = 1359;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
_unalistaprovisoria2.Add(_unalistaprovisoria.Get(_i));
 };
 //BA.debugLineNum = 1362;BA.debugLine="Dim Fecha2DiasAntes As String";
_fecha2diasantes = "";
 //BA.debugLineNum = 1363;BA.debugLine="Fecha2DiasAntes = DateTime.Date(DateTime.Add(Da";
_fecha2diasantes = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-2)));
 //BA.debugLineNum = 1364;BA.debugLine="If(Fecha2DiasAntes = unaFechaArchivo) Then 'los";
if (((_fecha2diasantes).equals(_unafechaarchivo))) { 
 //BA.debugLineNum = 1365;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
_unalistaprovisoria2.Add(_unalistaprovisoria.Get(_i));
 };
 //BA.debugLineNum = 1368;BA.debugLine="Dim Fecha3DiasAntes As String";
_fecha3diasantes = "";
 //BA.debugLineNum = 1369;BA.debugLine="Fecha3DiasAntes = DateTime.Date(DateTime.Add(Da";
_fecha3diasantes = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-3)));
 //BA.debugLineNum = 1370;BA.debugLine="If(Fecha3DiasAntes = unaFechaArchivo) Then 'los";
if (((_fecha3diasantes).equals(_unafechaarchivo))) { 
 //BA.debugLineNum = 1371;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
_unalistaprovisoria2.Add(_unalistaprovisoria.Get(_i));
 };
 }
};
 //BA.debugLineNum = 1376;BA.debugLine="unaListaFinal = unaListaProvisoria2";
_unalistafinal = _unalistaprovisoria2;
 }else {
 //BA.debugLineNum = 1380;BA.debugLine="unaListaFinal = File.ListFiles(unaRuta) ' [000_0";
_unalistafinal = anywheresoftware.b4a.keywords.Common.File.ListFiles(_unaruta);
 };
 //BA.debugLineNum = 1385;BA.debugLine="Dim unaListaFinalSinDupli As List = EliminarDupli";
_unalistafinalsindupli = new anywheresoftware.b4a.objects.collections.List();
_unalistafinalsindupli = _eliminarduplicados(_unalistafinal);
 //BA.debugLineNum = 1388;BA.debugLine="Return unaListaFinalSinDupli 'el return era el de";
if (true) return _unalistafinalsindupli;
 //BA.debugLineNum = 1390;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _eliminarduplicados(anywheresoftware.b4a.objects.collections.List _lista) throws Exception{
anywheresoftware.b4a.objects.collections.List _resultado = null;
anywheresoftware.b4a.objects.collections.Map _mapduplicados = null;
int _i = 0;
Object _elemento = null;
Object _key = null;
 //BA.debugLineNum = 1593;BA.debugLine="Sub EliminarDuplicados(lista As List) As List";
 //BA.debugLineNum = 1595;BA.debugLine="Log(\"FX: EliminarDuplicados --> Entro --> Cantida";
anywheresoftware.b4a.keywords.Common.LogImpl("61376258","FX: EliminarDuplicados --> Entro --> Cantidad incio: "+BA.NumberToString((_lista.getSize()-1)),0);
 //BA.debugLineNum = 1597;BA.debugLine="Dim Resultado As List";
_resultado = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1598;BA.debugLine="Dim mapDuplicados As Map";
_mapduplicados = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1599;BA.debugLine="mapDuplicados.Initialize";
_mapduplicados.Initialize();
 //BA.debugLineNum = 1601;BA.debugLine="Resultado.Initialize";
_resultado.Initialize();
 //BA.debugLineNum = 1603;BA.debugLine="For i = 0 To lista.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_lista.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 1604;BA.debugLine="Dim elemento As Object";
_elemento = new Object();
 //BA.debugLineNum = 1605;BA.debugLine="elemento = lista.Get(i)";
_elemento = _lista.Get(_i);
 //BA.debugLineNum = 1608;BA.debugLine="If Not(mapDuplicados.ContainsKey(elemento)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_mapduplicados.ContainsKey(_elemento))) { 
 //BA.debugLineNum = 1609;BA.debugLine="mapDuplicados.Put(elemento, \"\")";
_mapduplicados.Put(_elemento,(Object)(""));
 };
 }
};
 //BA.debugLineNum = 1617;BA.debugLine="For Each key As Object In mapDuplicados.Keys";
{
final anywheresoftware.b4a.BA.IterableList group13 = _mapduplicados.Keys();
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_key = group13.Get(index13);
 //BA.debugLineNum = 1618;BA.debugLine="Resultado.Add(key)";
_resultado.Add(_key);
 }
};
 //BA.debugLineNum = 1621;BA.debugLine="Log(\"FX: EliminarDuplicados --> Llega hasta aca?";
anywheresoftware.b4a.keywords.Common.LogImpl("61376284","FX: EliminarDuplicados --> Llega hasta aca? --> CANTIDAD FIN: "+BA.NumberToString((_resultado.getSize()-1)),0);
 //BA.debugLineNum = 1623;BA.debugLine="Return Resultado";
if (true) return _resultado;
 //BA.debugLineNum = 1625;BA.debugLine="End Sub";
return null;
}
public static String  _eliminarnotificacion(int _unidnotificacion) throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Private Sub EliminarNotificacion(UnIdNotificacion";
 //BA.debugLineNum = 429;BA.debugLine="noti.Cancel(UnIdNotificacion)";
_noti.Cancel(_unidnotificacion);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _encontroarchivoenservidor(String _unarutaserver,String _unarutamobile,String _unarchivo) throws Exception{
ResumableSub_EncontroArchivoEnServidor rsub = new ResumableSub_EncontroArchivoEnServidor(null,_unarutaserver,_unarutamobile,_unarchivo);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EncontroArchivoEnServidor extends BA.ResumableSub {
public ResumableSub_EncontroArchivoEnServidor(b4a.example.servbackup4 parent,String _unarutaserver,String _unarutamobile,String _unarchivo) {
this.parent = parent;
this._unarutaserver = _unarutaserver;
this._unarutamobile = _unarutamobile;
this._unarchivo = _unarchivo;
}
b4a.example.servbackup4 parent;
String _unarutaserver;
String _unarutamobile;
String _unarchivo;
boolean _resu = false;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _totalarchivos = 0;
int _i = 0;
int step12;
int limit12;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1420;BA.debugLine="currentFileSize = File.Size(unaRutaMobile, unArch";
parent._currentfilesize = (int) (anywheresoftware.b4a.keywords.Common.File.Size(_unarutamobile,_unarchivo));
 //BA.debugLineNum = 1421;BA.debugLine="Dim Resu As Boolean = False";
_resu = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1429;BA.debugLine="If FTP_Consulta.IsInitialized = True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._ftp_consulta.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1430;BA.debugLine="FTP_Consulta.CloseNow";
parent._ftp_consulta.CloseNow();
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 1432;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Servi";
parent._ftp_consulta.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 1433;BA.debugLine="FTP_Consulta.PassiveMode = True";
parent._ftp_consulta.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1436;BA.debugLine="FTP_Consulta.List(unaRutaServer) 'ejemplo --> \"./";
parent._ftp_consulta.List(processBA,_unarutaserver);
 //BA.debugLineNum = 1437;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, this, null);
this.state = 23;
return;
case 23:
//C
this.state = 5;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
 //BA.debugLineNum = 1438;BA.debugLine="Dim TotalArchivos As Int = Files.Length";
_totalarchivos = _files.length;
 //BA.debugLineNum = 1440;BA.debugLine="If Success  Then";
if (true) break;

case 5:
//if
this.state = 22;
if (_success) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 1441;BA.debugLine="For i = 0 To TotalArchivos-1";
if (true) break;

case 8:
//for
this.state = 21;
step12 = 1;
limit12 = (int) (_totalarchivos-1);
_i = (int) (0) ;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 21;
if ((step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12)) this.state = 10;
if (true) break;

case 25:
//C
this.state = 24;
_i = ((int)(0 + _i + step12)) ;
if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 1442;BA.debugLine="If unArchivo = Files(i).Name Then";
if (true) break;

case 11:
//if
this.state = 20;
if ((_unarchivo).equals(_files[_i].getName())) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 1451;BA.debugLine="Log(\"Archivo: \" & unArchivo & \" - Tamaño en se";
anywheresoftware.b4a.keywords.Common.LogImpl("61245216","Archivo: "+_unarchivo+" - Tamaño en server: "+BA.NumberToString((_files[_i].getSize()))+" - Tamaño en Dispositivo: "+BA.NumberToString((parent._currentfilesize)),0);
 //BA.debugLineNum = 1453;BA.debugLine="If (currentFileSize) = (Files(i).Size) Then";
if (true) break;

case 14:
//if
this.state = 19;
if ((parent._currentfilesize)==(_files[_i].getSize())) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 //BA.debugLineNum = 1454;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 1456;BA.debugLine="Log(\"Archivo existe en sel server, pero no co";
anywheresoftware.b4a.keywords.Common.LogImpl("61245221","Archivo existe en sel server, pero no coinciden los tamaños - "+"ARCHIVO EN SERVER: "+_files[_i].getName()+" - TAMAÑO ARCHIVO SERVER: "+BA.NumberToString(_files[_i].getSize())+" - TAMAÑO MOBILE: "+BA.NumberToString((anywheresoftware.b4a.keywords.Common.File.Size(_unarutamobile,_unarchivo))),0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 1458;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
 if (true) break;

case 20:
//C
this.state = 25;
;
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
 //BA.debugLineNum = 1464;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
 //BA.debugLineNum = 1465;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _ftp_listcompleted(String _serverpath,boolean _success,anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders,anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files) throws Exception{
}
public static String  _finalizarproceso() throws Exception{
String _unxml = "";
 //BA.debugLineNum = 1630;BA.debugLine="Sub FinalizarProceso()";
 //BA.debugLineNum = 1631;BA.debugLine="Log(\"EJECUTA LA FX --> FinalizarProceso() --> Can";
anywheresoftware.b4a.keywords.Common.LogImpl("61441793","EJECUTA LA FX --> FinalizarProceso() --> Cant. en curso: "+BA.NumberToString(_cantencurso)+", Cant. Total: "+BA.NumberToString(_cantidadtotal)+", fallidas: "+BA.NumberToString(_cantidadfallidas)+", Ok: "+BA.NumberToString(_cantidadok),0);
 //BA.debugLineNum = 1633;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
if (_cantencurso>=_cantidadtotal) { 
 //BA.debugLineNum = 1634;BA.debugLine="If CantidadFallidas = 0 Then";
if (_cantidadfallidas==0) { 
 //BA.debugLineNum = 1635;BA.debugLine="DatosGlobales.Segundos = 3600 'lo paso de 360s";
mostCurrent._datosglobales._segundos /*int*/  = (int) (3600);
 //BA.debugLineNum = 1636;BA.debugLine="Dim unXml As String = CargarElXML  'la tengo q";
_unxml = _cargarelxml();
 //BA.debugLineNum = 1637;BA.debugLine="File.WriteString(File.DirInternal,\"config.xml\",";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"config.xml",_unxml);
 //BA.debugLineNum = 1638;BA.debugLine="CantEnCurso = 0";
_cantencurso = (int) (0);
 //BA.debugLineNum = 1639;BA.debugLine="CantidadTotal = 0";
_cantidadtotal = (int) (0);
 //BA.debugLineNum = 1640;BA.debugLine="CantidadOk = 0";
_cantidadok = (int) (0);
 //BA.debugLineNum = 1641;BA.debugLine="CantidadFallidas = 0";
_cantidadfallidas = (int) (0);
 //BA.debugLineNum = 1642;BA.debugLine="DatosGlobales.Ejecutandose = False";
mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1643;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS\",";
_modificarnotificacion(_idnotificacion,"FOTOS","Esperando para hacer copia... Próxima ejecucion: "+mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
 //BA.debugLineNum = 1644;BA.debugLine="Log(\"Esperando para hacer copia... Próxima ejec";
anywheresoftware.b4a.keywords.Common.LogImpl("61441806","Esperando para hacer copia... Próxima ejecucion: "+mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA),0);
 };
 //BA.debugLineNum = 1646;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
 //BA.debugLineNum = 1647;BA.debugLine="DatosGlobales.CopiaProgress = 0";
mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 1648;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 1649;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
mostCurrent._datosglobales._copiaprogreso /*String*/  = "0";
 //BA.debugLineNum = 1650;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullbkp";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt","-1");
 //BA.debugLineNum = 1651;BA.debugLine="StopService(Me)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,servbackup4.getObject());
 };
 //BA.debugLineNum = 1653;BA.debugLine="End Sub";
return "";
}
public static String  _ftp_uploadcompleted(String _serverpath,boolean _success) throws Exception{
 //BA.debugLineNum = 865;BA.debugLine="Sub ftp_UploadCompleted (ServerPath As String, Suc";
 //BA.debugLineNum = 868;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 869;BA.debugLine="Log(\"--> FTP_UploadCompleted --> Subio Ok.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6983044","--> FTP_UploadCompleted --> Subio Ok.",0);
 }else {
 //BA.debugLineNum = 871;BA.debugLine="Log(\"--> FTP_UploadCompleted --> Fallo Subida\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6983046","--> FTP_UploadCompleted --> Fallo Subida",0);
 };
 //BA.debugLineNum = 875;BA.debugLine="End Sub";
return "";
}
public static String  _ftp_uploadprogress(String _serverpath,long _totaluploaded,long _total) throws Exception{
 //BA.debugLineNum = 797;BA.debugLine="Sub FTP_UploadProgress (ServerPath As String, Tota";
 //BA.debugLineNum = 799;BA.debugLine="Try";
try { //BA.debugLineNum = 801;BA.debugLine="DatosGlobales.CopiaProgreso =  \"[\" & TotalUpload";
mostCurrent._datosglobales._copiaprogreso /*String*/  = "["+BA.NumberToString(_totaluploaded)+"]";
 //BA.debugLineNum = 804;BA.debugLine="DatosGlobales.CopiaProgress = FxGlobales.CInt(10";
mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(mostCurrent._fxglobales._cint /*int*/ (processBA,(Object)(100*_totaluploaded/(double)_currentfilesize)));
 //BA.debugLineNum = 811;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = Round2((Cant";
mostCurrent._datosglobales._copiaporcentencurso /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2((_cantencurso*100)/(double)_cantidadtotal,(int) (0)))+"%";
 //BA.debugLineNum = 812;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS - P";
_modificarnotificacion(_idnotificacion,"FOTOS - PROCESO GLOBAL ["+BA.NumberToString(_cantencurso)+"/"+BA.NumberToString(_cantidadtotal)+"]  "+mostCurrent._datosglobales._copiaporcentencurso /*String*/ ,mostCurrent._datosglobales._nombrearchivo /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+mostCurrent._datosglobales._copiaprogreso /*String*/ +" - "+mostCurrent._datosglobales._copiaprogress /*String*/ +"%");
 //BA.debugLineNum = 816;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
if (_cantencurso>=_cantidadtotal) { 
 //BA.debugLineNum = 817;BA.debugLine="FinalizarProceso";
_finalizarproceso();
 };
 } 
       catch (Exception e10) {
			processBA.setLastException(e10); //BA.debugLineNum = 859;BA.debugLine="Log(\"ERROR: en FTP_UploadProgress - \" & LastExce";
anywheresoftware.b4a.keywords.Common.LogImpl("6917566","ERROR: en FTP_UploadProgress - "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
 //BA.debugLineNum = 862;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _guardararchivoenelservidor(String _pathdelservidor,String _ip,int _puerto,String _usuario,String _contra,String _rutamobile,String _archivomobilefull,int _tipodeoperacion) throws Exception{
ResumableSub_GuardarArchivoEnElServidor rsub = new ResumableSub_GuardarArchivoEnElServidor(null,_pathdelservidor,_ip,_puerto,_usuario,_contra,_rutamobile,_archivomobilefull,_tipodeoperacion);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GuardarArchivoEnElServidor extends BA.ResumableSub {
public ResumableSub_GuardarArchivoEnElServidor(b4a.example.servbackup4 parent,String _pathdelservidor,String _ip,int _puerto,String _usuario,String _contra,String _rutamobile,String _archivomobilefull,int _tipodeoperacion) {
this.parent = parent;
this._pathdelservidor = _pathdelservidor;
this._ip = _ip;
this._puerto = _puerto;
this._usuario = _usuario;
this._contra = _contra;
this._rutamobile = _rutamobile;
this._archivomobilefull = _archivomobilefull;
this._tipodeoperacion = _tipodeoperacion;
}
b4a.example.servbackup4 parent;
String _pathdelservidor;
String _ip;
int _puerto;
String _usuario;
String _contra;
String _rutamobile;
String _archivomobilefull;
int _tipodeoperacion;
String _path = "";
boolean _resu = false;
String _archivomobile = "";
String _fechaarchivo = "";
int _primerubicacion = 0;
int _segundaubicacion = 0;
Object _sf = null;
String _command = "";
boolean _success = false;
int _replycode = 0;
String _replystring = "";
Object _sf2 = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsb = null;
boolean _result = false;
Object _complete = null;
String _serverpath = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 499;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 88;
this.catchState = 87;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 87;
 //BA.debugLineNum = 500;BA.debugLine="Dim Path As String = \"\"";
_path = "";
 //BA.debugLineNum = 501;BA.debugLine="Dim Resu As Boolean = False";
_resu = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 504;BA.debugLine="DatosGlobales.CopiaProgress = 0";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 507;BA.debugLine="If TipoDeOperacion = 0 Then 'FOTOS CAMARA";
if (true) break;

case 4:
//if
this.state = 13;
if (_tipodeoperacion==0) { 
this.state = 6;
}else if(_tipodeoperacion==1) { 
this.state = 8;
}else if(_tipodeoperacion==2) { 
this.state = 10;
}else if(_tipodeoperacion==3) { 
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 13;
 //BA.debugLineNum = 508;BA.debugLine="Path = PathFotosCamara";
_path = parent._pathfotoscamara;
 if (true) break;

case 8:
//C
this.state = 13;
 //BA.debugLineNum = 510;BA.debugLine="Path = PathVideosCamara";
_path = parent._pathvideoscamara;
 if (true) break;

case 10:
//C
this.state = 13;
 //BA.debugLineNum = 512;BA.debugLine="Path = PathImagenesWhatsApp";
_path = parent._pathimageneswhatsapp;
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 514;BA.debugLine="Path = PathVideosWhatsApp";
_path = parent._pathvideoswhatsapp;
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 518;BA.debugLine="Dim ArchivoMobile As String = FxGlobales.Left(Ar";
_archivomobile = parent.mostCurrent._fxglobales._left /*String*/ (processBA,_archivomobilefull,_archivomobilefull.indexOf(";"));
 //BA.debugLineNum = 520;BA.debugLine="Dim FechaArchivo As String '= FxGlobales.Right(A";
_fechaarchivo = "";
 //BA.debugLineNum = 522;BA.debugLine="DatosGlobales.NombreArchivo = ArchivoMobile";
parent.mostCurrent._datosglobales._nombrearchivo /*String*/  = _archivomobile;
 //BA.debugLineNum = 527;BA.debugLine="FechaWhapp = \"\"";
parent._fechawhapp = "";
 //BA.debugLineNum = 528;BA.debugLine="If TipoDeOperacion = 2 Or TipoDeOperacion = 3 Th";
if (true) break;

case 14:
//if
this.state = 17;
if (_tipodeoperacion==2 || _tipodeoperacion==3) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 532;BA.debugLine="Dim PrimerUbicacion As Int = ArchivoMobile.Inde";
_primerubicacion = _archivomobile.indexOf("-");
 //BA.debugLineNum = 533;BA.debugLine="Dim SegundaUbicacion As Int  = ArchivoMobile.La";
_segundaubicacion = _archivomobile.lastIndexOf("-");
 //BA.debugLineNum = 534;BA.debugLine="FechaWhapp = FxGlobales.Mid(ArchivoMobile, Prim";
parent._fechawhapp = parent.mostCurrent._fxglobales._mid /*String*/ (processBA,_archivomobile,(int) (_primerubicacion+2),(int) (8));
 //BA.debugLineNum = 535;BA.debugLine="FechaArchivo = FechaWhapp";
_fechaarchivo = parent._fechawhapp;
 if (true) break;
;
 //BA.debugLineNum = 539;BA.debugLine="If TipoDeOperacion = 0 Or TipoDeOperacion = 1 Th";

case 17:
//if
this.state = 20;
if (_tipodeoperacion==0 || _tipodeoperacion==1) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 540;BA.debugLine="Dim PrimerUbicacion As Int = ArchivoMobile.Inde";
_primerubicacion = _archivomobile.indexOf("_");
 //BA.debugLineNum = 541;BA.debugLine="Dim SegundaUbicacion As Int  = ArchivoMobile.La";
_segundaubicacion = _archivomobile.lastIndexOf("_");
 //BA.debugLineNum = 542;BA.debugLine="FechaWhapp = FxGlobales.Mid(ArchivoMobile, Prim";
parent._fechawhapp = parent.mostCurrent._fxglobales._mid /*String*/ (processBA,_archivomobile,(int) (_primerubicacion+2),(int) (8));
 //BA.debugLineNum = 543;BA.debugLine="FechaArchivo = FechaWhapp";
_fechaarchivo = parent._fechawhapp;
 if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 547;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServidor";
anywheresoftware.b4a.keywords.Common.LogImpl("6852017","Ejecutando FX -> GuardarArchivoEnElServidor - [1] - Para el archivo: "+_archivomobile+" FechaArchivo =====================> "+parent._fechawhapp+" VS "+_fechaarchivo,0);
 //BA.debugLineNum = 556;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then 'esto";
if (true) break;

case 21:
//if
this.state = 28;
if ((parent.mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 558;BA.debugLine="If DatosGlobales.IndiceFullBkp > CantEnCurso Th";
if (true) break;

case 24:
//if
this.state = 27;
if (parent.mostCurrent._datosglobales._indicefullbkp /*int*/ >parent._cantencurso) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 560;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServid";
anywheresoftware.b4a.keywords.Common.LogImpl("6852030","Ejecutando FX -> GuardarArchivoEnElServidor - [1-Z] - EXISTE PORQUE FUE GUADADO PREVIAMENTE PERO NO SE EVALUA  # ENTONCES NO HAGO NADA!!!",0);
 //BA.debugLineNum = 562;BA.debugLine="DatosGlobales.CopiaProgress = 100";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(100);
 //BA.debugLineNum = 563;BA.debugLine="CantidadOk = CantidadOk + 1 'si bien no hago o";
parent._cantidadok = (int) (parent._cantidadok+1);
 //BA.debugLineNum = 564;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS -";
_modificarnotificacion(parent._idnotificacion,"FOTOS - PROCESO GLOBAL ["+BA.NumberToString(parent._cantencurso)+"/"+BA.NumberToString(parent._cantidadtotal)+"]  "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ ,parent.mostCurrent._datosglobales._nombrearchivo /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._datosglobales._copiaprogreso /*String*/ +" - "+parent.mostCurrent._datosglobales._copiaprogress /*String*/ +"%");
 //BA.debugLineNum = 565;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 567;BA.debugLine="CantEnCurso = CantEnCurso + 1";
parent._cantencurso = (int) (parent._cantencurso+1);
 //BA.debugLineNum = 568;BA.debugLine="DatosGlobales.CopiaCantEnCurso = CantEnCurso &";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(parent._cantencurso)+"/"+BA.NumberToString(parent._cantidadtotal);
 //BA.debugLineNum = 569;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = Round2((Ca";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2((parent._cantencurso*100)/(double)parent._cantidadtotal,(int) (0)))+"%";
 //BA.debugLineNum = 571;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServid";
anywheresoftware.b4a.keywords.Common.LogImpl("6852041","Ejecutando FX -> GuardarArchivoEnElServidor - [5-Z] -> Cantidad en curso: "+BA.NumberToString(parent._cantencurso)+" - Cantidad Total: "+BA.NumberToString(parent._cantidadtotal)+" - OK: "+BA.NumberToString(parent._cantidadok)+" - Fallidas: "+BA.NumberToString(parent._cantidadfallidas)+" - Progreso del proceso: "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ ,0);
 //BA.debugLineNum = 573;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
 //BA.debugLineNum = 582;BA.debugLine="If File.Exists(PathDelServidor & \"/\" & Path & \"/";

case 28:
//if
this.state = 41;
if (anywheresoftware.b4a.keywords.Common.File.Exists(_pathdelservidor+"/"+_path+"/"+_fechaarchivo,"")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 30;
}else {
this.state = 40;
}if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 585;BA.debugLine="If FTP3.IsInitialized = True Then";
if (true) break;

case 31:
//if
this.state = 34;
if (parent._ftp3.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 586;BA.debugLine="FTP3.CloseNow";
parent._ftp3.CloseNow();
 if (true) break;

case 34:
//C
this.state = 35;
;
 //BA.debugLineNum = 589;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
parent._ftp3.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 590;BA.debugLine="FTP3.PassiveMode = True";
parent._ftp3.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 596;BA.debugLine="Dim sf As Object = FTP3.SendCommand(\"MKD\", Path";
_sf = parent._ftp3.SendCommand(processBA,"MKD",_pathdelservidor+"/"+_path);
 //BA.debugLineNum = 597;BA.debugLine="Wait For (sf) FTP_CommandCompleted(Command As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_commandcompleted", processBA, this, _sf);
this.state = 89;
return;
case 89:
//C
this.state = 35;
_command = (String) result[0];
_success = (Boolean) result[1];
_replycode = (Integer) result[2];
_replystring = (String) result[3];
;
 //BA.debugLineNum = 598;BA.debugLine="If Success = True Then";
if (true) break;

case 35:
//if
this.state = 38;
if (_success==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 //BA.debugLineNum = 600;BA.debugLine="FTP3.CloseNow";
parent._ftp3.CloseNow();
 if (true) break;

case 38:
//C
this.state = 41;
;
 if (true) break;

case 40:
//C
this.state = 41;
 //BA.debugLineNum = 603;BA.debugLine="Log(\"No pudo crear carpeta: \" & PathDelServidor";
anywheresoftware.b4a.keywords.Common.LogImpl("6852073","No pudo crear carpeta: "+_pathdelservidor+"/"+_path+"!!!",0);
 if (true) break;
;
 //BA.debugLineNum = 606;BA.debugLine="If File.Exists(PathDelServidor & \"/\" & Path & \"/";

case 41:
//if
this.state = 54;
if (anywheresoftware.b4a.keywords.Common.File.Exists(_pathdelservidor+"/"+_path+"/"+_fechaarchivo,"")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 43;
}else {
this.state = 53;
}if (true) break;

case 43:
//C
this.state = 44;
 //BA.debugLineNum = 609;BA.debugLine="If FTP3.IsInitialized = True Then";
if (true) break;

case 44:
//if
this.state = 47;
if (parent._ftp3.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 //BA.debugLineNum = 610;BA.debugLine="FTP3.CloseNow";
parent._ftp3.CloseNow();
 if (true) break;

case 47:
//C
this.state = 48;
;
 //BA.debugLineNum = 613;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
parent._ftp3.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 614;BA.debugLine="FTP3.PassiveMode = True";
parent._ftp3.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 618;BA.debugLine="Dim sf2 As Object = FTP3.SendCommand(\"MKD\", Pat";
_sf2 = parent._ftp3.SendCommand(processBA,"MKD",_pathdelservidor+"/"+_path+"/"+_fechaarchivo);
 //BA.debugLineNum = 619;BA.debugLine="Wait For (sf2) FTP_CommandCompleted(Command As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_commandcompleted", processBA, this, _sf2);
this.state = 90;
return;
case 90:
//C
this.state = 48;
_command = (String) result[0];
_success = (Boolean) result[1];
_replycode = (Integer) result[2];
_replystring = (String) result[3];
;
 //BA.debugLineNum = 620;BA.debugLine="If Success = True Then";
if (true) break;

case 48:
//if
this.state = 51;
if (_success==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 //BA.debugLineNum = 622;BA.debugLine="FTP3.CloseNow";
parent._ftp3.CloseNow();
 if (true) break;

case 51:
//C
this.state = 54;
;
 if (true) break;

case 53:
//C
this.state = 54;
 //BA.debugLineNum = 625;BA.debugLine="Log(\"No pudo crear carpeta: \" & PathDelServidor";
anywheresoftware.b4a.keywords.Common.LogImpl("6852095","No pudo crear carpeta: "+_pathdelservidor+"/"+_path+"/"+_fechaarchivo+"!!!",0);
 if (true) break;

case 54:
//C
this.state = 55;
;
 //BA.debugLineNum = 629;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServidor";
anywheresoftware.b4a.keywords.Common.LogImpl("6852099","Ejecutando FX -> GuardarArchivoEnElServidor - [2] - Para el archivo: "+_archivomobile+" - Termino de validar y crear carpetas en el server",0);
 //BA.debugLineNum = 633;BA.debugLine="Dim rsb As ResumableSub = EncontroArchivoEnServi";
_rsb = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsb = _encontroarchivoenservidor(_pathdelservidor+"/"+_path+"/"+_fechaarchivo+"/",_rutamobile,_archivomobile);
 //BA.debugLineNum = 634;BA.debugLine="Wait For(rsb) complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rsb);
this.state = 91;
return;
case 91:
//C
this.state = 55;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 635;BA.debugLine="If Result = True Then";
if (true) break;

case 55:
//if
this.state = 76;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 76;
 //BA.debugLineNum = 639;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServido";
anywheresoftware.b4a.keywords.Common.LogImpl("6852109","Ejecutando FX -> GuardarArchivoEnElServidor - [3-1] - EXISTE --> RUTA: "+_pathdelservidor+"/"+_path+"/"+_fechaarchivo+" -  ARCHIVO --> "+_archivomobile+" # ENTONCES NO HAGO NADA!!!",0);
 //BA.debugLineNum = 642;BA.debugLine="DatosGlobales.CopiaProgress = 100";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(100);
 //BA.debugLineNum = 644;BA.debugLine="CantidadOk = CantidadOk + 1 'si bien no hago op";
parent._cantidadok = (int) (parent._cantidadok+1);
 //BA.debugLineNum = 648;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS -";
_modificarnotificacion(parent._idnotificacion,"FOTOS - PROCESO GLOBAL ["+BA.NumberToString(parent._cantencurso)+"/"+BA.NumberToString(parent._cantidadtotal)+"]  "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ ,parent.mostCurrent._datosglobales._nombrearchivo /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._datosglobales._copiaprogreso /*String*/ +" - "+parent.mostCurrent._datosglobales._copiaprogress /*String*/ +"%");
 //BA.debugLineNum = 651;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 59:
//C
this.state = 60;
 //BA.debugLineNum = 654;BA.debugLine="Try '09/12/2023 --> nuevo try para ver si se pu";
if (true) break;

case 60:
//try
this.state = 75;
this.catchState = 74;
this.state = 62;
if (true) break;

case 62:
//C
this.state = 63;
this.catchState = 74;
 //BA.debugLineNum = 657;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServid";
anywheresoftware.b4a.keywords.Common.LogImpl("6852127","Ejecutando FX -> GuardarArchivoEnElServidor - [3-2] - NO EXISTE!!! --> RUTA: "+_pathdelservidor+"/"+_path+"/"+_fechaarchivo+" -  ARCHIVO --> "+_archivomobile+" # ENTONCES SUBO EL ARCHIVO AL SERVER",0);
 //BA.debugLineNum = 661;BA.debugLine="currentFileSize = File.Size(RutaMobile, Archiv";
parent._currentfilesize = (int) (anywheresoftware.b4a.keywords.Common.File.Size(_rutamobile,_archivomobile));
 //BA.debugLineNum = 664;BA.debugLine="If FTP4.IsInitialized = False Then";
if (true) break;

case 63:
//if
this.state = 66;
if (parent._ftp4.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 //BA.debugLineNum = 665;BA.debugLine="FTP4.Initialize(\"FTP\",DatosGlobales.ServidorI";
parent._ftp4.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 666;BA.debugLine="FTP4.PassiveMode = True";
parent._ftp4.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 66:
//C
this.state = 67;
;
 //BA.debugLineNum = 669;BA.debugLine="Dim complete As Object = FTP4.UploadFile(RutaM";
_complete = parent._ftp4.UploadFile(processBA,_rutamobile,_archivomobile,anywheresoftware.b4a.keywords.Common.False,_pathdelservidor+"/"+_path+"/"+_fechaarchivo+"/"+_archivomobile);
 //BA.debugLineNum = 671;BA.debugLine="Wait For (complete) ftp_UploadCompleted (Serve";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, this, _complete);
this.state = 92;
return;
case 92:
//C
this.state = 67;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
 //BA.debugLineNum = 672;BA.debugLine="If Success Then";
if (true) break;

case 67:
//if
this.state = 72;
if (_success) { 
this.state = 69;
}else {
this.state = 71;
}if (true) break;

case 69:
//C
this.state = 72;
 //BA.debugLineNum = 673;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 674;BA.debugLine="CantidadOk = CantidadOk + 1";
parent._cantidadok = (int) (parent._cantidadok+1);
 //BA.debugLineNum = 675;BA.debugLine="DatosGlobales.CopiaProgress = 100 'pb.Progres";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(100);
 //BA.debugLineNum = 679;BA.debugLine="FTP4.CloseNow";
parent._ftp4.CloseNow();
 //BA.debugLineNum = 681;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServi";
anywheresoftware.b4a.keywords.Common.LogImpl("6852151","Ejecutando FX -> GuardarArchivoEnElServidor - [4-1] - El archivo se subio al servidor ok!!! -> "+_archivomobile,0);
 if (true) break;

case 71:
//C
this.state = 72;
 //BA.debugLineNum = 684;BA.debugLine="CantidadFallidas = CantidadFallidas + 1";
parent._cantidadfallidas = (int) (parent._cantidadfallidas+1);
 //BA.debugLineNum = 686;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServi";
anywheresoftware.b4a.keywords.Common.LogImpl("6852156","Ejecutando FX -> GuardarArchivoEnElServidor - [4-2] - Fallo subida de archivo al servidor "+_archivomobile,0);
 if (true) break;

case 72:
//C
this.state = 75;
;
 if (true) break;

case 74:
//C
this.state = 75;
this.catchState = 87;
 //BA.debugLineNum = 693;BA.debugLine="Log(\"°°°°°°°°°°°°°°°°°°°°°° #ERROR: en subida";
anywheresoftware.b4a.keywords.Common.LogImpl("6852163","°°°°°°°°°°°°°°°°°°°°°° #ERROR: en subida de archivo FTP4.UploadFile  °°°°°°°°°°°°°°°°°°°°°°°°°°°"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 75:
//C
this.state = 76;
this.catchState = 87;
;
 if (true) break;
;
 //BA.debugLineNum = 712;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then 'esto";

case 76:
//if
this.state = 85;
if ((parent.mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
this.state = 78;
}if (true) break;

case 78:
//C
this.state = 79;
 //BA.debugLineNum = 715;BA.debugLine="If Resu = True Then";
if (true) break;

case 79:
//if
this.state = 84;
if (_resu==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 81;
}else {
this.state = 83;
}if (true) break;

case 81:
//C
this.state = 84;
 //BA.debugLineNum = 716;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullb";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt",BA.NumberToString(parent._cantencurso));
 //BA.debugLineNum = 717;BA.debugLine="Log(\" ---> GUARDO EN ARCHIVO INDICE: \" & CantE";
anywheresoftware.b4a.keywords.Common.LogImpl("6852187"," ---> GUARDO EN ARCHIVO INDICE: "+BA.NumberToString(parent._cantencurso)+" <---",0);
 if (true) break;

case 83:
//C
this.state = 84;
 //BA.debugLineNum = 719;BA.debugLine="Log(\" ---> #FALLO: ENTONCES NO GUARDO EN ARCHI";
anywheresoftware.b4a.keywords.Common.LogImpl("6852189"," ---> #FALLO: ENTONCES NO GUARDO EN ARCHIVO INDICE: "+BA.NumberToString(parent._cantencurso)+"!!! <---",0);
 if (true) break;

case 84:
//C
this.state = 85;
;
 if (true) break;

case 85:
//C
this.state = 88;
;
 //BA.debugLineNum = 725;BA.debugLine="CantEnCurso = CantEnCurso + 1";
parent._cantencurso = (int) (parent._cantencurso+1);
 //BA.debugLineNum = 727;BA.debugLine="DatosGlobales.CopiaCantEnCurso = CantEnCurso & \"";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(parent._cantencurso)+"/"+BA.NumberToString(parent._cantidadtotal);
 //BA.debugLineNum = 728;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = Round2((Cant";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2((parent._cantencurso*100)/(double)parent._cantidadtotal,(int) (0)))+"%";
 //BA.debugLineNum = 737;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServidor";
anywheresoftware.b4a.keywords.Common.LogImpl("6852207","Ejecutando FX -> GuardarArchivoEnElServidor - [5] -> Cantidad en curso: "+BA.NumberToString(parent._cantencurso)+" - Cantidad Total: "+BA.NumberToString(parent._cantidadtotal)+" - OK: "+BA.NumberToString(parent._cantidadok)+" - Fallidas: "+BA.NumberToString(parent._cantidadfallidas)+" - Progreso del proceso: "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ ,0);
 //BA.debugLineNum = 786;BA.debugLine="Return Resu = True 'True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu==anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 87:
//C
this.state = 88;
this.catchState = 0;
 //BA.debugLineNum = 789;BA.debugLine="Log(\"#ERROR: en Fx GuardarArchivoEnElServidor --";
anywheresoftware.b4a.keywords.Common.LogImpl("6852259","#ERROR: en Fx GuardarArchivoEnElServidor --> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 //BA.debugLineNum = 790;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
 if (true) break;
if (true) break;

case 88:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static void  _ftp_commandcompleted(String _command,boolean _success,int _replycode,String _replystring) throws Exception{
}
public static void  _complete(boolean _result) throws Exception{
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _iniciarproceso(anywheresoftware.b4a.objects.collections.List _colmobilrutaorigen) throws Exception{
ResumableSub_IniciarProceso rsub = new ResumableSub_IniciarProceso(null,_colmobilrutaorigen);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_IniciarProceso extends BA.ResumableSub {
public ResumableSub_IniciarProceso(b4a.example.servbackup4 parent,anywheresoftware.b4a.objects.collections.List _colmobilrutaorigen) {
this.parent = parent;
this._colmobilrutaorigen = _colmobilrutaorigen;
}
b4a.example.servbackup4 parent;
anywheresoftware.b4a.objects.collections.List _colmobilrutaorigen;
boolean _resultado = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rscantarch = null;
boolean _result = false;
int _i = 0;
String _contenidocoleccion = "";
String _tipo = "";
String _ruta = "";
int _operacionactual = 0;
boolean _primeravez = false;
anywheresoftware.b4a.objects.collections.List _listagenerica = null;
int _j = 0;
Object _archivo = null;
String _extension = "";
long _d = 0L;
String _concatfiledate = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int step19;
int limit19;
int step41;
int limit41;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 890;BA.debugLine="Log(\"Inicio proceso\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61048579","Inicio proceso",0);
 //BA.debugLineNum = 895;BA.debugLine="ListaCompleta.Initialize";
parent._listacompleta.Initialize();
 //BA.debugLineNum = 896;BA.debugLine="ListaFotos.Initialize";
parent._listafotos.Initialize();
 //BA.debugLineNum = 897;BA.debugLine="ListaVideos.Initialize";
parent._listavideos.Initialize();
 //BA.debugLineNum = 899;BA.debugLine="ListaCompleta.Clear";
parent._listacompleta.Clear();
 //BA.debugLineNum = 900;BA.debugLine="ListaFotos.Clear";
parent._listafotos.Clear();
 //BA.debugLineNum = 901;BA.debugLine="ListaVideos.Clear";
parent._listavideos.Clear();
 //BA.debugLineNum = 903;BA.debugLine="Dim Resultado As Boolean = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 961;BA.debugLine="ColMobilRutaOrigen = EliminarDuplicados(ColMobilR";
_colmobilrutaorigen = _eliminarduplicados(_colmobilrutaorigen);
 //BA.debugLineNum = 963;BA.debugLine="Dim rsCantArch As ResumableSub = ConsultarCantida";
_rscantarch = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rscantarch = _consultarcantidadtotaldearchivos(_colmobilrutaorigen);
 //BA.debugLineNum = 964;BA.debugLine="Wait For(rsCantArch) complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rscantarch);
this.state = 134;
return;
case 134:
//C
this.state = 1;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 965;BA.debugLine="If result = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 966;BA.debugLine="Log(\"Resultado Fx --> ConsultarCantidadTotalDeAr";
anywheresoftware.b4a.keywords.Common.LogImpl("61048655","Resultado Fx --> ConsultarCantidadTotalDeArchivos -> OK!",0);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 968;BA.debugLine="Log(\"Resultado Fx --> ConsultarCantidadTotalDeAr";
anywheresoftware.b4a.keywords.Common.LogImpl("61048657","Resultado Fx --> ConsultarCantidadTotalDeArchivos -> Fallo!!!",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 975;BA.debugLine="Log(\"Cantidad total: \" & CantidadTotal)";
anywheresoftware.b4a.keywords.Common.LogImpl("61048664","Cantidad total: "+BA.NumberToString(parent._cantidadtotal),0);
 //BA.debugLineNum = 981;BA.debugLine="If CantidadTotal > 0 Then";
if (true) break;

case 7:
//if
this.state = 133;
if (parent._cantidadtotal>0) { 
this.state = 9;
}else {
this.state = 122;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 985;BA.debugLine="For i = 0 To ColMobilRutaOrigen.Size -1";
if (true) break;

case 10:
//for
this.state = 114;
step19 = 1;
limit19 = (int) (_colmobilrutaorigen.getSize()-1);
_i = (int) (0) ;
this.state = 135;
if (true) break;

case 135:
//C
this.state = 114;
if ((step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19)) this.state = 12;
if (true) break;

case 136:
//C
this.state = 135;
_i = ((int)(0 + _i + step19)) ;
if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 987;BA.debugLine="Dim ContenidoColeccion As String= ColMobilRutaO";
_contenidocoleccion = BA.ObjectToString(_colmobilrutaorigen.Get(_i));
 //BA.debugLineNum = 988;BA.debugLine="Dim Tipo As String = (FxGlobales.Left(Contenido";
_tipo = (parent.mostCurrent._fxglobales._left /*String*/ (processBA,_contenidocoleccion,_contenidocoleccion.indexOf(";")));
 //BA.debugLineNum = 989;BA.debugLine="Dim Ruta As String = (FxGlobales.Right(Contenid";
_ruta = (parent.mostCurrent._fxglobales._right /*String*/ (processBA,_contenidocoleccion,(int) ((_contenidocoleccion.length()-_contenidocoleccion.indexOf(";")-1))));
 //BA.debugLineNum = 991;BA.debugLine="Dim OperacionActual As Int";
_operacionactual = 0;
 //BA.debugLineNum = 995;BA.debugLine="If Tipo = \"MobilRutaFotos\" Then";
if (true) break;

case 13:
//if
this.state = 22;
if ((_tipo).equals("MobilRutaFotos")) { 
this.state = 15;
}else if((_tipo).equals("MobilRutaVideos")) { 
this.state = 17;
}else if((_tipo).equals("MobilRutaFotosWhapp")) { 
this.state = 19;
}else if((_tipo).equals("MobilRutaVideosWhapp")) { 
this.state = 21;
}if (true) break;

case 15:
//C
this.state = 22;
 //BA.debugLineNum = 996;BA.debugLine="OperacionActual = 0";
_operacionactual = (int) (0);
 if (true) break;

case 17:
//C
this.state = 22;
 //BA.debugLineNum = 998;BA.debugLine="OperacionActual = 1";
_operacionactual = (int) (1);
 if (true) break;

case 19:
//C
this.state = 22;
 //BA.debugLineNum = 1000;BA.debugLine="OperacionActual = 2";
_operacionactual = (int) (2);
 if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 1002;BA.debugLine="OperacionActual = 3";
_operacionactual = (int) (3);
 if (true) break;
;
 //BA.debugLineNum = 1007;BA.debugLine="Try";

case 22:
//try
this.state = 113;
this.catchState = 112;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 112;
 //BA.debugLineNum = 1011;BA.debugLine="Dim PrimeraVez As Boolean";
_primeravez = false;
 //BA.debugLineNum = 1012;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then";
if (true) break;

case 25:
//if
this.state = 30;
if ((parent.mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
 //BA.debugLineNum = 1013;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 1015;BA.debugLine="PrimeraVez= False";
_primeravez = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 1018;BA.debugLine="Dim ListaGenerica As List = DevolverLista(Ruta";
_listagenerica = new anywheresoftware.b4a.objects.collections.List();
_listagenerica = _devolverlista(_ruta,_primeravez);
 //BA.debugLineNum = 1026;BA.debugLine="For j = 0 To ListaGenerica.Size -1";
if (true) break;

case 31:
//for
this.state = 110;
step41 = 1;
limit41 = (int) (_listagenerica.getSize()-1);
_j = (int) (0) ;
this.state = 137;
if (true) break;

case 137:
//C
this.state = 110;
if ((step41 > 0 && _j <= limit41) || (step41 < 0 && _j >= limit41)) this.state = 33;
if (true) break;

case 138:
//C
this.state = 137;
_j = ((int)(0 + _j + step41)) ;
if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 1028;BA.debugLine="Try";
if (true) break;

case 34:
//try
this.state = 109;
this.catchState = 108;
this.state = 36;
if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 108;
 //BA.debugLineNum = 1029;BA.debugLine="Dim	Archivo As Object = ListaGenerica.Get(j)";
_archivo = _listagenerica.Get(_j);
 //BA.debugLineNum = 1031;BA.debugLine="Dim Extension As String = \"\"";
_extension = "";
 //BA.debugLineNum = 1032;BA.debugLine="Extension = FxGlobales.Right(Archivo, 3)";
_extension = parent.mostCurrent._fxglobales._right /*String*/ (processBA,BA.ObjectToString(_archivo),(int) (3));
 //BA.debugLineNum = 1033;BA.debugLine="If Extension.ToUpperCase = \"JPG\" Then";
if (true) break;

case 37:
//if
this.state = 106;
if ((_extension.toUpperCase()).equals("JPG")) { 
this.state = 39;
}else if((_extension.toUpperCase()).equals("MP4")) { 
this.state = 73;
}if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 1034;BA.debugLine="Dim d As Long";
_d = 0L;
 //BA.debugLineNum = 1035;BA.debugLine="d = File.LastModified(Ruta, Archivo)";
_d = anywheresoftware.b4a.keywords.Common.File.LastModified(_ruta,BA.ObjectToString(_archivo));
 //BA.debugLineNum = 1037;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
 //BA.debugLineNum = 1038;BA.debugLine="Dim ConcatFileDate As String = Archivo & \";";
_concatfiledate = BA.ObjectToString(_archivo)+";"+anywheresoftware.b4a.keywords.Common.DateTime.Date(_d);
 //BA.debugLineNum = 1040;BA.debugLine="Try";
if (true) break;

case 40:
//try
this.state = 71;
this.catchState = 70;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 43;
this.catchState = 70;
 //BA.debugLineNum = 1041;BA.debugLine="If OperacionActual = 0 Then 'MobilRutaFoto";
if (true) break;

case 43:
//if
this.state = 68;
if (_operacionactual==0) { 
this.state = 45;
}else if(_operacionactual==2) { 
this.state = 57;
}if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 1042;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*String*/ ,parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ ,_ruta,_concatfiledate,parent._operacion.FotosCamara /*int*/ );
 //BA.debugLineNum = 1043;BA.debugLine="Wait For(rs) complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 139;
return;
case 139:
//C
this.state = 46;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 1044;BA.debugLine="If result = True Then";
if (true) break;

case 46:
//if
this.state = 55;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 55;
 //BA.debugLineNum = 1045;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("61048734","Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE LA CAMARA] - Archivo: "+BA.ObjectToString(_archivo)+" -> Lo copio OK!",0);
 if (true) break;

case 50:
//C
this.state = 51;
 //BA.debugLineNum = 1047;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("61048736","Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE LA CAMARA] - Archivo: "+BA.ObjectToString(_archivo)+" -> Fallo!!!",0);
 //BA.debugLineNum = 1050;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
_modificarnotificacion(parent._idnotificacion,"FOTOS","Falló la copia del archivo: "+BA.ObjectToString(_archivo)+" - Próxima ejecución: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
 //BA.debugLineNum = 1051;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1052;BA.debugLine="DatosGlobales.Segundos = 60";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
 //BA.debugLineNum = 1058;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
if (true) break;

case 51:
//if
this.state = 54;
if ((parent.mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 //BA.debugLineNum = 1059;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 54:
//C
this.state = 55;
;
 //BA.debugLineNum = 1061;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
anywheresoftware.b4a.keywords.Common.LogImpl("61048750","Primera vez: "+BA.ObjectToString(_primeravez),0);
 //BA.debugLineNum = 1062;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 55:
//C
this.state = 68;
;
 if (true) break;

case 57:
//C
this.state = 58;
 //BA.debugLineNum = 1067;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*String*/ ,parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ ,_ruta,_concatfiledate,parent._operacion.ImagenesWhatsApp /*int*/ );
 //BA.debugLineNum = 1068;BA.debugLine="Wait For(rs) complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 140;
return;
case 140:
//C
this.state = 58;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 1069;BA.debugLine="If result =True Then";
if (true) break;

case 58:
//if
this.state = 67;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 67;
 //BA.debugLineNum = 1070;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("61048759","Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE WHATSAPP] - Archivo: "+BA.ObjectToString(_archivo)+" -> Lo copio OK!",0);
 if (true) break;

case 62:
//C
this.state = 63;
 //BA.debugLineNum = 1072;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("61048761","Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE WHATSAPP] - Archivo: "+BA.ObjectToString(_archivo)+" -> Fallo!!!",0);
 //BA.debugLineNum = 1075;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
_modificarnotificacion(parent._idnotificacion,"FOTOS","Falló la copia del archivo: "+BA.ObjectToString(_archivo)+" - Próxima ejecución: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
 //BA.debugLineNum = 1076;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1077;BA.debugLine="DatosGlobales.Segundos = 60";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
 //BA.debugLineNum = 1083;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
if (true) break;

case 63:
//if
this.state = 66;
if ((parent.mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 //BA.debugLineNum = 1084;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 66:
//C
this.state = 67;
;
 //BA.debugLineNum = 1086;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
anywheresoftware.b4a.keywords.Common.LogImpl("61048775","Primera vez: "+BA.ObjectToString(_primeravez),0);
 //BA.debugLineNum = 1087;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 67:
//C
this.state = 68;
;
 if (true) break;

case 68:
//C
this.state = 71;
;
 if (true) break;

case 70:
//C
this.state = 71;
this.catchState = 108;
 //BA.debugLineNum = 1093;BA.debugLine="Log(\"#ERROR: salio por CATCH de [FOTOS DE";
anywheresoftware.b4a.keywords.Common.LogImpl("61048782","#ERROR: salio por CATCH de [FOTOS DE LA CAMARA] o [FOTOS DE WHATSAPP]"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 71:
//C
this.state = 106;
this.catchState = 108;
;
 if (true) break;

case 73:
//C
this.state = 74;
 //BA.debugLineNum = 1097;BA.debugLine="Dim d As Long";
_d = 0L;
 //BA.debugLineNum = 1098;BA.debugLine="d = File.LastModified(Ruta, Archivo)";
_d = anywheresoftware.b4a.keywords.Common.File.LastModified(_ruta,BA.ObjectToString(_archivo));
 //BA.debugLineNum = 1100;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
 //BA.debugLineNum = 1101;BA.debugLine="Dim ConcatFileDate As String = Archivo & \";";
_concatfiledate = BA.ObjectToString(_archivo)+";"+anywheresoftware.b4a.keywords.Common.DateTime.Date(_d);
 //BA.debugLineNum = 1103;BA.debugLine="Try";
if (true) break;

case 74:
//try
this.state = 105;
this.catchState = 104;
this.state = 76;
if (true) break;

case 76:
//C
this.state = 77;
this.catchState = 104;
 //BA.debugLineNum = 1104;BA.debugLine="If OperacionActual = 1 Then 'MobilRutaFoto";
if (true) break;

case 77:
//if
this.state = 102;
if (_operacionactual==1) { 
this.state = 79;
}else if(_operacionactual==3) { 
this.state = 91;
}if (true) break;

case 79:
//C
this.state = 80;
 //BA.debugLineNum = 1105;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*String*/ ,parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ ,_ruta,_concatfiledate,parent._operacion.VideosCamara /*int*/ );
 //BA.debugLineNum = 1106;BA.debugLine="Wait For(rs) complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 141;
return;
case 141:
//C
this.state = 80;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 1107;BA.debugLine="If result =True Then";
if (true) break;

case 80:
//if
this.state = 89;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 89;
 //BA.debugLineNum = 1108;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("61048797","Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE LA CAMARA] - Archivo: "+BA.ObjectToString(_archivo)+" -> Lo copio OK!",0);
 if (true) break;

case 84:
//C
this.state = 85;
 //BA.debugLineNum = 1110;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("61048799","Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE LA CAMARA] - Archivo: "+BA.ObjectToString(_archivo)+" -> Fallo!!!",0);
 //BA.debugLineNum = 1113;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
_modificarnotificacion(parent._idnotificacion,"FOTOS","Falló la copia del archivo: "+BA.ObjectToString(_archivo)+" - Próxima ejecución: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
 //BA.debugLineNum = 1114;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1115;BA.debugLine="DatosGlobales.Segundos = 60";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
 //BA.debugLineNum = 1116;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
 //BA.debugLineNum = 1117;BA.debugLine="DatosGlobales.CopiaProgress = 0";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 1118;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 1119;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
parent.mostCurrent._datosglobales._copiaprogreso /*String*/  = "0";
 //BA.debugLineNum = 1121;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
if (true) break;

case 85:
//if
this.state = 88;
if ((parent.mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
this.state = 87;
}if (true) break;

case 87:
//C
this.state = 88;
 //BA.debugLineNum = 1122;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 88:
//C
this.state = 89;
;
 //BA.debugLineNum = 1124;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
anywheresoftware.b4a.keywords.Common.LogImpl("61048813","Primera vez: "+BA.ObjectToString(_primeravez),0);
 //BA.debugLineNum = 1125;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 89:
//C
this.state = 102;
;
 if (true) break;

case 91:
//C
this.state = 92;
 //BA.debugLineNum = 1130;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*String*/ ,parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ ,_ruta,_concatfiledate,parent._operacion.VideosWhatsApp /*int*/ );
 //BA.debugLineNum = 1131;BA.debugLine="Wait For(rs) complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 142;
return;
case 142:
//C
this.state = 92;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 1132;BA.debugLine="If result =True Then";
if (true) break;

case 92:
//if
this.state = 101;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 94;
}else {
this.state = 96;
}if (true) break;

case 94:
//C
this.state = 101;
 //BA.debugLineNum = 1133;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("61048822","Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE WHATSAPP] - Archivo: "+BA.ObjectToString(_archivo)+" -> Lo copio OK!",0);
 if (true) break;

case 96:
//C
this.state = 97;
 //BA.debugLineNum = 1135;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("61048824","Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE WHATSAPP] - Archivo: "+BA.ObjectToString(_archivo)+" -> Fallo!!!",0);
 //BA.debugLineNum = 1139;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
_modificarnotificacion(parent._idnotificacion,"FOTOS","Falló la copia del archivo: "+BA.ObjectToString(_archivo)+" - Próxima ejecución: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
 //BA.debugLineNum = 1140;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1141;BA.debugLine="DatosGlobales.Segundos = 60";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
 //BA.debugLineNum = 1142;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
 //BA.debugLineNum = 1143;BA.debugLine="DatosGlobales.CopiaProgress = 0";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 1144;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 1145;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
parent.mostCurrent._datosglobales._copiaprogreso /*String*/  = "0";
 //BA.debugLineNum = 1147;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
if (true) break;

case 97:
//if
this.state = 100;
if ((parent.mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
this.state = 99;
}if (true) break;

case 99:
//C
this.state = 100;
 //BA.debugLineNum = 1148;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 100:
//C
this.state = 101;
;
 //BA.debugLineNum = 1150;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
anywheresoftware.b4a.keywords.Common.LogImpl("61048839","Primera vez: "+BA.ObjectToString(_primeravez),0);
 //BA.debugLineNum = 1151;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 101:
//C
this.state = 102;
;
 if (true) break;

case 102:
//C
this.state = 105;
;
 if (true) break;

case 104:
//C
this.state = 105;
this.catchState = 108;
 //BA.debugLineNum = 1158;BA.debugLine="Log(\"#ERROR: salio por CATCH de [VIDEOS DE";
anywheresoftware.b4a.keywords.Common.LogImpl("61048847","#ERROR: salio por CATCH de [VIDEOS DE LA CAMARA] o [FOTOS DE WHATSAPP] o [VIDEOS DE WHATSAPP]"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 105:
//C
this.state = 106;
this.catchState = 108;
;
 if (true) break;

case 106:
//C
this.state = 109;
;
 if (true) break;

case 108:
//C
this.state = 109;
this.catchState = 112;
 //BA.debugLineNum = 1168;BA.debugLine="Log(\"#ERROR: salio por CATCH FX --> IniciarP";
anywheresoftware.b4a.keywords.Common.LogImpl("61048857","#ERROR: salio por CATCH FX --> IniciarProceso [DETRO DEL TERCER FOR] "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 109:
//C
this.state = 138;
this.catchState = 112;
;
 if (true) break;
if (true) break;

case 110:
//C
this.state = 113;
;
 if (true) break;

case 112:
//C
this.state = 113;
this.catchState = 0;
 //BA.debugLineNum = 1179;BA.debugLine="ToastMessageShow(\"#ERROR: \" & LastException &";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("#ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA))+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA))),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1180;BA.debugLine="Log(LastException & CRLF & \"No paso la lista:";
anywheresoftware.b4a.keywords.Common.LogImpl("61048869",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA))+anywheresoftware.b4a.keywords.Common.CRLF+"No paso la lista: "+_tipo+" -> Por no tener datos",0);
 //BA.debugLineNum = 1181;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;

case 113:
//C
this.state = 136;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 114:
//C
this.state = 115;
;
 //BA.debugLineNum = 1189;BA.debugLine="Log(\"Finalizo proceso - CantidadFallidas: \" & Ca";
anywheresoftware.b4a.keywords.Common.LogImpl("61048878","Finalizo proceso - CantidadFallidas: "+BA.NumberToString(parent._cantidadfallidas),0);
 //BA.debugLineNum = 1192;BA.debugLine="If CantidadFallidas > 0 Then";
if (true) break;

case 115:
//if
this.state = 120;
if (parent._cantidadfallidas>0) { 
this.state = 117;
}else {
this.state = 119;
}if (true) break;

case 117:
//C
this.state = 120;
 //BA.debugLineNum = 1193;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 119:
//C
this.state = 120;
 //BA.debugLineNum = 1198;BA.debugLine="Resultado = True";
_resultado = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 120:
//C
this.state = 133;
;
 if (true) break;

case 122:
//C
this.state = 123;
 //BA.debugLineNum = 1210;BA.debugLine="If	FTP3.IsInitialized Then";
if (true) break;

case 123:
//if
this.state = 126;
if (parent._ftp3.IsInitialized()) { 
this.state = 125;
}if (true) break;

case 125:
//C
this.state = 126;
 //BA.debugLineNum = 1211;BA.debugLine="FTP3.CloseNow";
parent._ftp3.CloseNow();
 if (true) break;
;
 //BA.debugLineNum = 1214;BA.debugLine="If	FTP4.IsInitialized Then";

case 126:
//if
this.state = 129;
if (parent._ftp4.IsInitialized()) { 
this.state = 128;
}if (true) break;

case 128:
//C
this.state = 129;
 //BA.debugLineNum = 1215;BA.debugLine="FTP4.CloseNow";
parent._ftp4.CloseNow();
 if (true) break;
;
 //BA.debugLineNum = 1218;BA.debugLine="If	FTP_Consulta.IsInitialized Then";

case 129:
//if
this.state = 132;
if (parent._ftp_consulta.IsInitialized()) { 
this.state = 131;
}if (true) break;

case 131:
//C
this.state = 132;
 //BA.debugLineNum = 1219;BA.debugLine="FTP_Consulta.CloseNow";
parent._ftp_consulta.CloseNow();
 if (true) break;

case 132:
//C
this.state = 133;
;
 //BA.debugLineNum = 1223;BA.debugLine="CantEnCurso = 0";
parent._cantencurso = (int) (0);
 //BA.debugLineNum = 1224;BA.debugLine="CantidadTotal = 0";
parent._cantidadtotal = (int) (0);
 //BA.debugLineNum = 1227;BA.debugLine="Resultado = True";
_resultado = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1230;BA.debugLine="Log(\"Finalizo proceso\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61048919","Finalizo proceso",0);
 if (true) break;

case 133:
//C
this.state = -1;
;
 //BA.debugLineNum = 1239;BA.debugLine="Log(\"Llego al --> DatosGlobales.Ejecutandose = Fa";
anywheresoftware.b4a.keywords.Common.LogImpl("61048928","Llego al --> DatosGlobales.Ejecutandose = False",0);
 //BA.debugLineNum = 1240;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1242;BA.debugLine="Return Resultado";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resultado));return;};
 //BA.debugLineNum = 1244;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _modificarnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Private Sub ModificarNotificacion(UnIdNotificacion";
 //BA.debugLineNum = 418;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
 //BA.debugLineNum = 420;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
 //BA.debugLineNum = 421;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 422;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 423;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 424;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
 //BA.debugLineNum = 425;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Dim FtpTest As FTP";
_ftptest = new anywheresoftware.b4a.net.FTPWrapper();
 //BA.debugLineNum = 12;BA.debugLine="FtpTest.PassiveMode = True";
_ftptest.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 13;BA.debugLine="Dim noti As Notification";
_noti = new anywheresoftware.b4a.objects.NotificationWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim IdNotificacion As Int = 1 ' Identificador úni";
_idnotificacion = (int) (1);
 //BA.debugLineNum = 17;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 19;BA.debugLine="Dim ListaCompleta As List";
_listacompleta = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="Dim ListaFotos As List";
_listafotos = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 21;BA.debugLine="Dim ListaVideos As List";
_listavideos = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 26;BA.debugLine="Dim CantEnCurso As Int";
_cantencurso = 0;
 //BA.debugLineNum = 28;BA.debugLine="Dim CantidadTotal As Int = 0 'CONTADOR";
_cantidadtotal = (int) (0);
 //BA.debugLineNum = 29;BA.debugLine="Dim CantidadOk As Int = 0 'CONTADOR";
_cantidadok = (int) (0);
 //BA.debugLineNum = 30;BA.debugLine="Dim CantidadFallidas As Int = 0 'CONTADOR";
_cantidadfallidas = (int) (0);
 //BA.debugLineNum = 32;BA.debugLine="Dim Awake As PhoneWakeState";
_awake = new anywheresoftware.b4a.phone.Phone.PhoneWakeState();
 //BA.debugLineNum = 36;BA.debugLine="Type TipoOperacion (FotosCamara As Int, VideosCam";
;
 //BA.debugLineNum = 38;BA.debugLine="Dim Operacion As TipoOperacion";
_operacion = new b4a.example.servbackup4._tipooperacion();
 //BA.debugLineNum = 39;BA.debugLine="Operacion.FotosCamara = 0";
_operacion.FotosCamara /*int*/  = (int) (0);
 //BA.debugLineNum = 40;BA.debugLine="Operacion.VideosCamara = 1";
_operacion.VideosCamara /*int*/  = (int) (1);
 //BA.debugLineNum = 41;BA.debugLine="Operacion.ImagenesWhatsApp = 2";
_operacion.ImagenesWhatsApp /*int*/  = (int) (2);
 //BA.debugLineNum = 42;BA.debugLine="Operacion.VideosWhatsApp = 3";
_operacion.VideosWhatsApp /*int*/  = (int) (3);
 //BA.debugLineNum = 44;BA.debugLine="Dim const PathFotosCamara As String = \"Fotos\"";
_pathfotoscamara = "Fotos";
 //BA.debugLineNum = 45;BA.debugLine="Dim const PathVideosCamara As String = \"Videos\"";
_pathvideoscamara = "Videos";
 //BA.debugLineNum = 46;BA.debugLine="Dim const PathImagenesWhatsApp As String = \"Image";
_pathimageneswhatsapp = "Imagenes WhatsApp";
 //BA.debugLineNum = 47;BA.debugLine="Dim const PathVideosWhatsApp As String = \"Videos";
_pathvideoswhatsapp = "Videos WhatsApp";
 //BA.debugLineNum = 50;BA.debugLine="Dim FTP3 As FTP";
_ftp3 = new anywheresoftware.b4a.net.FTPWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Dim FTP4 As FTP";
_ftp4 = new anywheresoftware.b4a.net.FTPWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Dim FTP_Consulta As FTP";
_ftp_consulta = new anywheresoftware.b4a.net.FTPWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Dim currentFileSize As Int";
_currentfilesize = 0;
 //BA.debugLineNum = 57;BA.debugLine="Dim EsPrimeraVez As Boolean = True";
_esprimeravez = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 59;BA.debugLine="Dim FechaWhapp As String";
_fechawhapp = "";
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 65;BA.debugLine="DatosGlobales.EnPrincipal = False";
mostCurrent._datosglobales._enprincipal /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 66;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_ALWAYS;
 //BA.debugLineNum = 68;BA.debugLine="CrearNotificacion(IdNotificacion, \"FOTOS\", \"Inici";
_crearnotificacion(_idnotificacion,"FOTOS","Iniciando...");
 //BA.debugLineNum = 69;BA.debugLine="Service.StartForeground(IdNotificacion,noti)";
mostCurrent._service.StartForeground(_idnotificacion,(android.app.Notification)(_noti.getObject()));
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 376;BA.debugLine="CantEnCurso = 0";
_cantencurso = (int) (0);
 //BA.debugLineNum = 377;BA.debugLine="CantidadTotal = 0";
_cantidadtotal = (int) (0);
 //BA.debugLineNum = 378;BA.debugLine="CantidadOk = 0";
_cantidadok = (int) (0);
 //BA.debugLineNum = 379;BA.debugLine="CantidadFallidas = 0";
_cantidadfallidas = (int) (0);
 //BA.debugLineNum = 380;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
 //BA.debugLineNum = 381;BA.debugLine="DatosGlobales.CopiaProgress = 0";
mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 382;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 383;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
mostCurrent._datosglobales._copiaprogreso /*String*/  = "0";
 //BA.debugLineNum = 386;BA.debugLine="DatosGlobales.Ejecutandose = False";
mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 388;BA.debugLine="Log(\"Salio por --> Service_Destroy\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6524303","Salio por --> Service_Destroy",0);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return "";
}
public static String  _service_error(String _error,int _code) throws Exception{
 //BA.debugLineNum = 1669;BA.debugLine="Sub Service_Error (Error As String, Code As Int)";
 //BA.debugLineNum = 1672;BA.debugLine="Log(\"=== SALIO POR --> Service_Error  ===\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61572867","=== SALIO POR --> Service_Error  ===",0);
 //BA.debugLineNum = 1674;BA.debugLine="Log(\"Error en el servicio: \" & Error)";
anywheresoftware.b4a.keywords.Common.LogImpl("61572869","Error en el servicio: "+_error,0);
 //BA.debugLineNum = 1675;BA.debugLine="Log(\"Código de error: \" & Code)";
anywheresoftware.b4a.keywords.Common.LogImpl("61572870","Código de error: "+BA.NumberToString(_code),0);
 //BA.debugLineNum = 1677;BA.debugLine="End Sub";
return "";
}
public static void  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
ResumableSub_Service_Start rsub = new ResumableSub_Service_Start(null,_startingintent);
rsub.resume(processBA, null);
}
public static class ResumableSub_Service_Start extends BA.ResumableSub {
public ResumableSub_Service_Start(b4a.example.servbackup4 parent,anywheresoftware.b4a.objects.IntentWrapper _startingintent) {
this.parent = parent;
this._startingintent = _startingintent;
}
b4a.example.servbackup4 parent;
anywheresoftware.b4a.objects.IntentWrapper _startingintent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 84;BA.debugLine="Awake.KeepAlive(True)";
parent._awake.KeepAlive(processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 87;BA.debugLine="Log(\"ServBackUp4: Service_Start --> Ejecutandose.";
anywheresoftware.b4a.keywords.Common.LogImpl("6458758","ServBackUp4: Service_Start --> Ejecutandose... cada: "+BA.NumberToString(parent.mostCurrent._datosglobales._segundos /*int*/ )+" segundos. Ejecutandose: "+BA.ObjectToString(parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
 //BA.debugLineNum = 90;BA.debugLine="If DatosGlobales.Ejecutandose = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 91;BA.debugLine="Log(\"$$$ EJECUTANDOSE -> entonces sigue el --> S";
anywheresoftware.b4a.keywords.Common.LogImpl("6458762","$$$ EJECUTANDOSE -> entonces sigue el --> StartServiceAt... $$$",0);
 //BA.debugLineNum = 92;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,servbackup4.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+parent.mostCurrent._datosglobales._segundos /*int*/ *anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 93;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 95;BA.debugLine="Log(\"$$$ NO SE ESTA EJECUTANDO $$$\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6458766","$$$ NO SE ESTA EJECUTANDO $$$",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 98;BA.debugLine="Log(\"$$$ POST EJECUTANDOSE $$$\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6458769","$$$ POST EJECUTANDOSE $$$",0);
 //BA.debugLineNum = 103;BA.debugLine="If DatosGlobales.LogOk Then";
if (true) break;

case 7:
//if
this.state = 26;
if (parent.mostCurrent._datosglobales._logok /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 25;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 106;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (true) break;

case 10:
//if
this.state = 23;
if (parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 108;BA.debugLine="If FTP3.IsInitialized = False Then";
if (true) break;

case 13:
//if
this.state = 16;
if (parent._ftp3.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 109;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp";
parent._ftp3.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 110;BA.debugLine="FTP3.PassiveMode = True";
parent._ftp3.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
 //BA.debugLineNum = 113;BA.debugLine="If FTP4.IsInitialized = False Then";

case 16:
//if
this.state = 19;
if (parent._ftp4.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 114;BA.debugLine="FTP4.Initialize(\"FTP\",DatosGlobales.ServidorIp";
parent._ftp4.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 115;BA.debugLine="FTP4.PassiveMode = True";
parent._ftp4.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
 //BA.debugLineNum = 118;BA.debugLine="If FTP_Consulta.IsInitialized = False Then";

case 19:
//if
this.state = 22;
if (parent._ftp_consulta.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 119;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Se";
parent._ftp_consulta.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 120;BA.debugLine="FTP_Consulta.PassiveMode = True";
parent._ftp_consulta.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 123;BA.debugLine="Log(\"Servicios ftp incializados: FTP3 -> \" & FT";
anywheresoftware.b4a.keywords.Common.LogImpl("6458794","Servicios ftp incializados: FTP3 -> "+BA.ObjectToString(parent._ftp3.IsInitialized())+" - FTP4 -> "+BA.ObjectToString(parent._ftp4.IsInitialized())+" - FTP_Consulta ->  "+BA.ObjectToString(parent._ftp_consulta.IsInitialized()),0);
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 128;BA.debugLine="Log(\"NO LOG\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6458799","NO LOG",0);
 //BA.debugLineNum = 129;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._login.getObject()));
 if (true) break;
;
 //BA.debugLineNum = 155;BA.debugLine="Try";

case 26:
//try
this.state = 124;
this.catchState = 123;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 123;
 //BA.debugLineNum = 156;BA.debugLine="Log(\"ServBackUp4: PASO POR Service_Start y el pr";
anywheresoftware.b4a.keywords.Common.LogImpl("6458827","ServBackUp4: PASO POR Service_Start y el primer TRY",0);
 //BA.debugLineNum = 158;BA.debugLine="If DatosGlobales.EnPrincipal = False Then";
if (true) break;

case 29:
//if
this.state = 121;
if (parent.mostCurrent._datosglobales._enprincipal /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 160;BA.debugLine="If DatosGlobales.Configurando = False Then";
if (true) break;

case 32:
//if
this.state = 103;
if (parent.mostCurrent._datosglobales._configurando /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 162;BA.debugLine="Log(\"Ejecutandose: \" & DatosGlobales.Ejecutand";
anywheresoftware.b4a.keywords.Common.LogImpl("6458833","Ejecutandose: "+BA.ObjectToString(parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
 //BA.debugLineNum = 167;BA.debugLine="If EsPrimeraVez = True Then 'comentado 31/12/2";
if (true) break;

case 35:
//if
this.state = 102;
if (parent._esprimeravez==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 37;
}else {
this.state = 73;
}if (true) break;

case 37:
//C
this.state = 38;
 //BA.debugLineNum = 170;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._login.getObject()));
 //BA.debugLineNum = 172;BA.debugLine="If DatosGlobales.LogOk Then";
if (true) break;

case 38:
//if
this.state = 71;
if (parent.mostCurrent._datosglobales._logok /*boolean*/ ) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 //BA.debugLineNum = 173;BA.debugLine="EsPrimeraVez= False";
parent._esprimeravez = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 175;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (true) break;

case 41:
//if
this.state = 70;
if (parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 43;
}else {
this.state = 69;
}if (true) break;

case 43:
//C
this.state = 44;
 //BA.debugLineNum = 176;BA.debugLine="Try";
if (true) break;

case 44:
//try
this.state = 67;
this.catchState = 66;
this.state = 46;
if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 66;
 //BA.debugLineNum = 178;BA.debugLine="DatosGlobales.Ejecutandose = True '16/12/2";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 180;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServido";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*String*/ );
 //BA.debugLineNum = 181;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 125;
return;
case 125:
//C
this.state = 47;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 182;BA.debugLine="If Result = True Then 'Se pudo conectar al";
if (true) break;

case 47:
//if
this.state = 64;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 49;
}else {
this.state = 63;
}if (true) break;

case 49:
//C
this.state = 50;
 //BA.debugLineNum = 192;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
_modificarnotificacion(parent._idnotificacion,"Fotos","Copia en curso... ");
 //BA.debugLineNum = 194;BA.debugLine="Dim rs As ResumableSub = IniciarProceso";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _iniciarproceso(parent.mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 196;BA.debugLine="Wait For(rs) complete (Result As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 126;
return;
case 126:
//C
this.state = 50;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 199;BA.debugLine="If Result = True Then";
if (true) break;

case 50:
//if
this.state = 61;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 52;
}else {
this.state = 60;
}if (true) break;

case 52:
//C
this.state = 53;
 //BA.debugLineNum = 201;BA.debugLine="Log(\"### FINALIZO BIEN!!! (FULL BACKUP";
anywheresoftware.b4a.keywords.Common.LogImpl("6458872","### FINALIZO BIEN!!! (FULL BACKUP) --> ENTONCES EJECUTO LA FX --> FinalizarProceso",0);
 //BA.debugLineNum = 204;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
if (true) break;

case 53:
//if
this.state = 58;
if (parent._cantencurso>=parent._cantidadtotal) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
 //BA.debugLineNum = 205;BA.debugLine="FinalizarProceso";
_finalizarproceso();
 if (true) break;

case 57:
//C
this.state = 58;
 //BA.debugLineNum = 207;BA.debugLine="CantEnCurso = 0";
parent._cantencurso = (int) (0);
 //BA.debugLineNum = 208;BA.debugLine="CantidadTotal = 0";
parent._cantidadtotal = (int) (0);
 //BA.debugLineNum = 209;BA.debugLine="CantidadOk = 0";
parent._cantidadok = (int) (0);
 //BA.debugLineNum = 210;BA.debugLine="CantidadFallidas = 0";
parent._cantidadfallidas = (int) (0);
 //BA.debugLineNum = 211;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
 //BA.debugLineNum = 212;BA.debugLine="DatosGlobales.CopiaProgress = 0";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 213;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 214;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
parent.mostCurrent._datosglobales._copiaprogreso /*String*/  = "0";
 if (true) break;

case 58:
//C
this.state = 61;
;
 if (true) break;

case 60:
//C
this.state = 61;
 //BA.debugLineNum = 219;BA.debugLine="Log(\"### NOOO FINALIZO BIEN!!! (FULL B";
anywheresoftware.b4a.keywords.Common.LogImpl("6458890","### NOOO FINALIZO BIEN!!! (FULL BACKUP)",0);
 //BA.debugLineNum = 220;BA.debugLine="DatosGlobales.Segundos = 60  '3600s =";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
 //BA.debugLineNum = 222;BA.debugLine="Log(\"Poner en Notificacion: próxima ej";
anywheresoftware.b4a.keywords.Common.LogImpl("6458893","Poner en Notificacion: próxima ejecucion: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA),0);
 if (true) break;

case 61:
//C
this.state = 64;
;
 //BA.debugLineNum = 226;BA.debugLine="Log(\"Paso por aca 'Activity_Resume' ->";
anywheresoftware.b4a.keywords.Common.LogImpl("6458897","Paso por aca 'Activity_Resume' -> Post 'IniciarProceso'",0);
 //BA.debugLineNum = 231;BA.debugLine="Log(\"Poner en Notificacion: próxima ejecu";
anywheresoftware.b4a.keywords.Common.LogImpl("6458902","Poner en Notificacion: próxima ejecucion: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA),0);
 if (true) break;

case 63:
//C
this.state = 64;
 //BA.debugLineNum = 234;BA.debugLine="Log(\"No se encuentra en el Wifi presetead";
anywheresoftware.b4a.keywords.Common.LogImpl("6458905","No se encuentra en el Wifi preseteado",0);
 //BA.debugLineNum = 235;BA.debugLine="ModificarNotificacion(IdNotificacion,\"Fot";
_modificarnotificacion(parent._idnotificacion,"Fotos","No se encuentra en el Wifi preseteado");
 //BA.debugLineNum = 236;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 64:
//C
this.state = 67;
;
 if (true) break;

case 66:
//C
this.state = 67;
this.catchState = 123;
 //BA.debugLineNum = 240;BA.debugLine="DatosGlobales.Segundos = 360  '3600s = 1hs";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (360);
 //BA.debugLineNum = 241;BA.debugLine="Log(\"Paso por Catch 1 de Service_Start ->";
anywheresoftware.b4a.keywords.Common.LogImpl("6458912","Paso por Catch 1 de Service_Start -> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 //BA.debugLineNum = 242;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;

case 67:
//C
this.state = 70;
this.catchState = 123;
;
 if (true) break;

case 69:
//C
this.state = 70;
 //BA.debugLineNum = 245;BA.debugLine="Log(\"No se puede ejecutar BKP porque una co";
anywheresoftware.b4a.keywords.Common.LogImpl("6458916","No se puede ejecutar BKP porque una copia esta en curso...",0);
 if (true) break;

case 70:
//C
this.state = 71;
;
 if (true) break;

case 71:
//C
this.state = 102;
;
 if (true) break;

case 73:
//C
this.state = 74;
 //BA.debugLineNum = 255;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (true) break;

case 74:
//if
this.state = 101;
if (parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 76;
}else {
this.state = 100;
}if (true) break;

case 76:
//C
this.state = 77;
 //BA.debugLineNum = 257;BA.debugLine="Try";
if (true) break;

case 77:
//try
this.state = 98;
this.catchState = 97;
this.state = 79;
if (true) break;

case 79:
//C
this.state = 80;
this.catchState = 97;
 //BA.debugLineNum = 258;BA.debugLine="DatosGlobales.Ejecutandose = True '16/12/20";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 260;BA.debugLine="Log(\"Ejecutandose NO por primera vez...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6458931","Ejecutandose NO por primera vez...",0);
 //BA.debugLineNum = 262;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServidor";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*String*/ );
 //BA.debugLineNum = 263;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 127;
return;
case 127:
//C
this.state = 80;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 264;BA.debugLine="If Result = True Then 'Se pudo conectar al";
if (true) break;

case 80:
//if
this.state = 95;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 82;
}if (true) break;

case 82:
//C
this.state = 83;
 //BA.debugLineNum = 274;BA.debugLine="Dim rs As ResumableSub = IniciarProceso(Da";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _iniciarproceso(parent.mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 275;BA.debugLine="Wait For(rs) complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 128;
return;
case 128:
//C
this.state = 83;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 278;BA.debugLine="If Result = True Then";
if (true) break;

case 83:
//if
this.state = 94;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 85;
}else {
this.state = 93;
}if (true) break;

case 85:
//C
this.state = 86;
 //BA.debugLineNum = 279;BA.debugLine="Log(\"### FINALIZO BIEN!!! (BACKUP DIARIO)";
anywheresoftware.b4a.keywords.Common.LogImpl("6458950","### FINALIZO BIEN!!! (BACKUP DIARIO) --> ENTONCES EJECUTO LA FX --> FinalizarProceso",0);
 //BA.debugLineNum = 284;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
if (true) break;

case 86:
//if
this.state = 91;
if (parent._cantencurso>=parent._cantidadtotal) { 
this.state = 88;
}else {
this.state = 90;
}if (true) break;

case 88:
//C
this.state = 91;
 //BA.debugLineNum = 285;BA.debugLine="FinalizarProceso";
_finalizarproceso();
 if (true) break;

case 90:
//C
this.state = 91;
 //BA.debugLineNum = 287;BA.debugLine="CantEnCurso = 0";
parent._cantencurso = (int) (0);
 //BA.debugLineNum = 288;BA.debugLine="CantidadTotal = 0";
parent._cantidadtotal = (int) (0);
 //BA.debugLineNum = 289;BA.debugLine="CantidadOk = 0";
parent._cantidadok = (int) (0);
 //BA.debugLineNum = 290;BA.debugLine="CantidadFallidas = 0";
parent._cantidadfallidas = (int) (0);
 //BA.debugLineNum = 291;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
 //BA.debugLineNum = 292;BA.debugLine="DatosGlobales.CopiaProgress = 0";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 293;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 294;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
parent.mostCurrent._datosglobales._copiaprogreso /*String*/  = "0";
 if (true) break;

case 91:
//C
this.state = 94;
;
 if (true) break;

case 93:
//C
this.state = 94;
 //BA.debugLineNum = 298;BA.debugLine="Log(\"### NOOO FINALIZO BIEN!!! (BACKUP DI";
anywheresoftware.b4a.keywords.Common.LogImpl("6458969","### NOOO FINALIZO BIEN!!! (BACKUP DIARIO)",0);
 //BA.debugLineNum = 299;BA.debugLine="DatosGlobales.Segundos = 60  '3600s = 1hs";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
 //BA.debugLineNum = 300;BA.debugLine="Log(\"Poner en Notificacion: próxima ejecu";
anywheresoftware.b4a.keywords.Common.LogImpl("6458971","Poner en Notificacion: próxima ejecucion: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA),0);
 if (true) break;

case 94:
//C
this.state = 95;
;
 if (true) break;

case 95:
//C
this.state = 98;
;
 if (true) break;

case 97:
//C
this.state = 98;
this.catchState = 123;
 //BA.debugLineNum = 314;BA.debugLine="DatosGlobales.Segundos = 360  '3600s = 1hs";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (360);
 //BA.debugLineNum = 315;BA.debugLine="Log(\"Paso por Catch 2 de Service_Start -> \"";
anywheresoftware.b4a.keywords.Common.LogImpl("6458986","Paso por Catch 2 de Service_Start -> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 //BA.debugLineNum = 316;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;

case 98:
//C
this.state = 101;
this.catchState = 123;
;
 if (true) break;

case 100:
//C
this.state = 101;
 //BA.debugLineNum = 319;BA.debugLine="Log(\"No se puede ejecutar BKP porque una cop";
anywheresoftware.b4a.keywords.Common.LogImpl("6458990","No se puede ejecutar BKP porque una copia esta en curso...",0);
 if (true) break;

case 101:
//C
this.state = 102;
;
 if (true) break;

case 102:
//C
this.state = 103;
;
 //BA.debugLineNum = 326;BA.debugLine="Log(\"Estado al finalizar de 'Ejecutandose': \"";
anywheresoftware.b4a.keywords.Common.LogImpl("6458997","Estado al finalizar de 'Ejecutandose': "+BA.ObjectToString(parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
 if (true) break;
;
 //BA.debugLineNum = 332;BA.debugLine="If DatosGlobales.Ejecutandose = True Then";

case 103:
//if
this.state = 120;
if (parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 105;
}else {
this.state = 107;
}if (true) break;

case 105:
//C
this.state = 120;
 if (true) break;

case 107:
//C
this.state = 108;
 //BA.debugLineNum = 337;BA.debugLine="If DatosGlobales.CopiaPorcentEnCurso = \"100%\"";
if (true) break;

case 108:
//if
this.state = 119;
if ((parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ ).equals("100%")) { 
this.state = 110;
}else {
this.state = 112;
}if (true) break;

case 110:
//C
this.state = 119;
 if (true) break;

case 112:
//C
this.state = 113;
 //BA.debugLineNum = 346;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
if (true) break;

case 113:
//if
this.state = 118;
if (parent._cantencurso>=parent._cantidadtotal) { 
this.state = 115;
}else {
this.state = 117;
}if (true) break;

case 115:
//C
this.state = 118;
 //BA.debugLineNum = 347;BA.debugLine="DatosGlobales.Segundos = 3600";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (3600);
 if (true) break;

case 117:
//C
this.state = 118;
 //BA.debugLineNum = 349;BA.debugLine="DatosGlobales.Segundos = 360";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (360);
 if (true) break;

case 118:
//C
this.state = 119;
;
 //BA.debugLineNum = 354;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fotos\"";
_modificarnotificacion(parent._idnotificacion,"Fotos","Esperando para hacer copia de seguridad a las: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
 //BA.debugLineNum = 355;BA.debugLine="Log(\"Esperando para hacer copia de seguridad";
anywheresoftware.b4a.keywords.Common.LogImpl("6459026","Esperando para hacer copia de seguridad a las: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA),0);
 if (true) break;

case 119:
//C
this.state = 120;
;
 if (true) break;

case 120:
//C
this.state = 121;
;
 if (true) break;

case 121:
//C
this.state = 124;
;
 //BA.debugLineNum = 363;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,servbackup4.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+parent.mostCurrent._datosglobales._segundos /*int*/ *anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 123:
//C
this.state = 124;
this.catchState = 0;
 //BA.debugLineNum = 367;BA.debugLine="Log(\"#ERROR: en Service_Start --> \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("6459038","#ERROR: en Service_Start --> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 124:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 1660;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 1664;BA.debugLine="Log(\"=== SALIO POR --> Service_TaskRemoved  ===\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61507332","=== SALIO POR --> Service_TaskRemoved  ===",0);
 //BA.debugLineNum = 1666;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _validarcnxservidor(String _unaruta) throws Exception{
ResumableSub_ValidarCnxServidor rsub = new ResumableSub_ValidarCnxServidor(null,_unaruta);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ValidarCnxServidor extends BA.ResumableSub {
public ResumableSub_ValidarCnxServidor(b4a.example.servbackup4 parent,String _unaruta) {
this.parent = parent;
this._unaruta = _unaruta;
}
b4a.example.servbackup4 parent;
String _unaruta;
boolean _resu = false;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _totalcarpetas = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 442;BA.debugLine="Log(\"### Inicia validacion de conexion al servido";
anywheresoftware.b4a.keywords.Common.LogImpl("6786434","### Inicia validacion de conexion al servidor ### - "+_unaruta,0);
 //BA.debugLineNum = 444;BA.debugLine="FtpTest.Initialize(\"FTP\",DatosGlobales.ServidorIp";
parent._ftptest.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 445;BA.debugLine="FtpTest.PassiveMode = True";
parent._ftptest.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 447;BA.debugLine="Dim Resu As Boolean = False";
_resu = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 449;BA.debugLine="FtpTest.List(unaRuta)";
parent._ftptest.List(processBA,_unaruta);
 //BA.debugLineNum = 450;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, this, null);
this.state = 20;
return;
case 20:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
 //BA.debugLineNum = 451;BA.debugLine="Dim TotalCarpetas As Int = Folders.Length";
_totalcarpetas = _folders.length;
 //BA.debugLineNum = 453;BA.debugLine="Log(\"Cantidad de carpetas leidas: \" & TotalCarpet";
anywheresoftware.b4a.keywords.Common.LogImpl("6786445","Cantidad de carpetas leidas: "+BA.NumberToString(_totalcarpetas)+" ---> "+BA.ObjectToString(_success)+" - "+_serverpath,0);
 //BA.debugLineNum = 455;BA.debugLine="If Success = True  Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_success==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 16;
 //BA.debugLineNum = 456;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 458;BA.debugLine="If FTP3.IsInitialized = False Then";
if (true) break;

case 6:
//if
this.state = 9;
if (parent._ftp3.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 459;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
parent._ftp3.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 460;BA.debugLine="FTP3.PassiveMode = True";
parent._ftp3.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
 //BA.debugLineNum = 463;BA.debugLine="If FTP4.IsInitialized = False Then";

case 9:
//if
this.state = 12;
if (parent._ftp4.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 464;BA.debugLine="FTP4.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
parent._ftp4.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 465;BA.debugLine="FTP4.PassiveMode = True";
parent._ftp4.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
 //BA.debugLineNum = 468;BA.debugLine="If FTP_Consulta.IsInitialized = False Then";

case 12:
//if
this.state = 15;
if (parent._ftp_consulta.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 469;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Ser";
parent._ftp_consulta.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 470;BA.debugLine="FTP_Consulta.PassiveMode = True";
parent._ftp_consulta.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
 //BA.debugLineNum = 475;BA.debugLine="If	FtpTest.IsInitialized Then";

case 16:
//if
this.state = 19;
if (parent._ftptest.IsInitialized()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 476;BA.debugLine="FtpTest.CloseNow";
parent._ftptest.CloseNow();
 if (true) break;

case 19:
//C
this.state = -1;
;
 //BA.debugLineNum = 479;BA.debugLine="Log(\"### Fin de validacion de conexion al servido";
anywheresoftware.b4a.keywords.Common.LogImpl("6786471","### Fin de validacion de conexion al servidor ###",0);
 //BA.debugLineNum = 481;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}
