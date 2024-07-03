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
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
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
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.example", "b4a.example.servbackup4");
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
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
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
	}
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
public anywheresoftware.b4a.keywords.Common __c = null;
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
public b4a.example.servbackup3 _servbackup3 = null;
public b4a.example.servbackup2 _servbackup2 = null;
public b4a.example.backup _backup = null;
public b4a.example.servbackup _servbackup = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public static String  _cargarelxml() throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "cargarelxml", false))
	 {return ((String) Debug.delegate(processBA, "cargarelxml", null));}
String _archivoxml = "";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub CargarElXML As String";
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"0\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "0";
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Dim ArchivoXml As String = \"<?xml version=\"\"\"\"1.0";
_archivoxml = "<?xml version=\"\"1.0\"\" encoding=\"\"UTF-8\"\"?>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="ArchivoXml = ArchivoXml & \"<fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"<fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="ArchivoXml = ArchivoXml & \" <login>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="ArchivoXml = ArchivoXml & \"   <usuario>\" & DatosG";
_archivoxml = _archivoxml+"   <usuario>"+mostCurrent._datosglobales._xml_usuario /*String*/ +"</usuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="ArchivoXml = ArchivoXml & \"   <contraseña>\" & Dat";
_archivoxml = _archivoxml+"   <contraseña>"+mostCurrent._datosglobales._xml_contraseña /*String*/ +"</contraseña>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="ArchivoXml = ArchivoXml & \"   <recordar>\" & Datos";
_archivoxml = _archivoxml+"   <recordar>"+mostCurrent._datosglobales._xml_recordar /*String*/ +"</recordar>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="ArchivoXml = ArchivoXml & \" </login>\"  & CRLF & \"";
_archivoxml = _archivoxml+" </login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_origen>\" & CRLF";
_archivoxml = _archivoxml+" <ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245206;
 //BA.debugLineNum = 1245206;BA.debugLine="ArchivoXml = ArchivoXml & \"   <fotoscamara>\" & Da";
_archivoxml = _archivoxml+"   <fotoscamara>"+mostCurrent._datosglobales._xml_fotoscamara /*String*/ +"</fotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245207;
 //BA.debugLineNum = 1245207;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoscamara>\" & D";
_archivoxml = _archivoxml+"   <videoscamara>"+mostCurrent._datosglobales._xml_videoscamara /*String*/ +"</videoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245208;
 //BA.debugLineNum = 1245208;BA.debugLine="ArchivoXml = ArchivoXml & \"   <imageneswhatsapp>\"";
_archivoxml = _archivoxml+"   <imageneswhatsapp>"+mostCurrent._datosglobales._xml_imageneswhatsapp /*String*/ +"</imageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245209;
 //BA.debugLineNum = 1245209;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoswhatsapp>\" &";
_archivoxml = _archivoxml+"   <videoswhatsapp>"+mostCurrent._datosglobales._xml_videoswhatsapp /*String*/ +"</videoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245211;
 //BA.debugLineNum = 1245211;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chfotoscamara>\" &";
_archivoxml = _archivoxml+"   <chfotoscamara>"+mostCurrent._datosglobales._xml_chfotoscamara /*String*/ +"</chfotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245212;
 //BA.debugLineNum = 1245212;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoscamara>\" &";
_archivoxml = _archivoxml+"   <chvideoscamara>"+mostCurrent._datosglobales._xml_chvideoscamara /*String*/ +"</chvideoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245213;
 //BA.debugLineNum = 1245213;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chimageneswhatsapp";
_archivoxml = _archivoxml+"   <chimageneswhatsapp>"+mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/ +"</chimageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245214;
 //BA.debugLineNum = 1245214;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoswhatsapp>\"";
_archivoxml = _archivoxml+"   <chvideoswhatsapp>"+mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/ +"</chvideoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245215;
 //BA.debugLineNum = 1245215;BA.debugLine="ArchivoXml = ArchivoXml & \"   <primeravez>\" & Dat";
_archivoxml = _archivoxml+"   <primeravez>"+mostCurrent._datosglobales._xml_primeravez /*String*/ +"</primeravez>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245217;
 //BA.debugLineNum = 1245217;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_origen>\" & CRL";
_archivoxml = _archivoxml+" </ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245219;
 //BA.debugLineNum = 1245219;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245220;
 //BA.debugLineNum = 1245220;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_destino>\" & CRL";
_archivoxml = _archivoxml+" <ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245221;
 //BA.debugLineNum = 1245221;BA.debugLine="ArchivoXml = ArchivoXml & \"   <UsuarioRutaFotos>\"";
_archivoxml = _archivoxml+"   <UsuarioRutaFotos>"+mostCurrent._datosglobales._xml_usuariorutafotos /*String*/ +"</UsuarioRutaFotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245222;
 //BA.debugLineNum = 1245222;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_destino>\" & CR";
_archivoxml = _archivoxml+" </ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245223;
 //BA.debugLineNum = 1245223;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245225;
 //BA.debugLineNum = 1245225;BA.debugLine="ArchivoXml = ArchivoXml & \" <ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245226;
 //BA.debugLineNum = 1245226;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorruta>\" & D";
_archivoxml = _archivoxml+"   <servidorruta>"+mostCurrent._datosglobales._xml_servidorruta /*String*/ +"</servidorruta>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245227;
 //BA.debugLineNum = 1245227;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorip>\" & Dat";
_archivoxml = _archivoxml+"   <servidorip>"+mostCurrent._datosglobales._xml_servidorip /*String*/ +"</servidorip>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245228;
 //BA.debugLineNum = 1245228;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorpuerto>\" &";
_archivoxml = _archivoxml+"   <servidorpuerto>"+mostCurrent._datosglobales._xml_servidorpuerto /*String*/ +"</servidorpuerto>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245229;
 //BA.debugLineNum = 1245229;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorusuario>\"";
_archivoxml = _archivoxml+"   <servidorusuario>"+mostCurrent._datosglobales._xml_servidorusuario /*String*/ +"</servidorusuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245230;
 //BA.debugLineNum = 1245230;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorclave>\" &";
_archivoxml = _archivoxml+"   <servidorclave>"+mostCurrent._datosglobales._xml_servidorclave /*String*/ +"</servidorclave>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245231;
 //BA.debugLineNum = 1245231;BA.debugLine="ArchivoXml = ArchivoXml & \" </ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" </ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245233;
 //BA.debugLineNum = 1245233;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245234;
 //BA.debugLineNum = 1245234;BA.debugLine="ArchivoXml = ArchivoXml & \"</fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"</fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=1245236;
 //BA.debugLineNum = 1245236;BA.debugLine="Return ArchivoXml";
if (true) return _archivoxml;
RDebugUtils.currentLine=1245238;
 //BA.debugLineNum = 1245238;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _consultarcantidadtotaldearchivos(anywheresoftware.b4a.objects.collections.List _uncolmobilrutaorigen) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "consultarcantidadtotaldearchivos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "consultarcantidadtotaldearchivos", new Object[] {_uncolmobilrutaorigen}));}
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
RDebugUtils.currentModule="servbackup4";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim Resultado As Boolean = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="CantidadTotal = 0";
parent._cantidadtotal = (int) (0);
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="For i = 0 To unColMobilRutaOrigen.Size-1";
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
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Try";
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
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Dim ContenidoColeccion_ As String= unColMobilRu";
_contenidocoleccion_ = BA.ObjectToString(_uncolmobilrutaorigen.Get(_i));
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="Dim Ruta_ As String = (FxGlobales.Right(Conteni";
_ruta_ = (parent.mostCurrent._fxglobales._right /*String*/ (processBA,_contenidocoleccion_,(int) ((_contenidocoleccion_.length()-_contenidocoleccion_.indexOf(";")-1))));
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="Dim TipoOperacion As String = (FxGlobales.Left(";
_tipooperacion = (parent.mostCurrent._fxglobales._left /*String*/ (processBA,_contenidocoleccion_,_contenidocoleccion_.indexOf(";")));
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="Log(\"CONTENIDO DE LA LISTA --> \" & unColMobilRu";
anywheresoftware.b4a.keywords.Common.LogImpl("51441806","CONTENIDO DE LA LISTA --> "+BA.ObjectToString(_uncolmobilrutaorigen.Get(_i))+" TIPO --> "+_tipooperacion,0);
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="Dim PrimeraVez As Boolean";
_primeravez = false;
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then";
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
RDebugUtils.currentLine=1441810;
 //BA.debugLineNum = 1441810;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="PrimeraVez= False";
_primeravez = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=1441815;
 //BA.debugLineNum = 1441815;BA.debugLine="Dim ListaGenerica_ As List = DevolverLista(Ruta";
_listagenerica_ = new anywheresoftware.b4a.objects.collections.List();
_listagenerica_ = _devolverlista(_ruta_,_primeravez);
RDebugUtils.currentLine=1441830;
 //BA.debugLineNum = 1441830;BA.debugLine="If TipoOperacion = \"MobilRutaFotos\" Then";
if (true) break;

case 13:
//if
this.state = 70;
if ((_tipooperacion).equals("MobilRutaFotos")) { 
this.state = 15;
}else 
{RDebugUtils.currentLine=1441842;
 //BA.debugLineNum = 1441842;BA.debugLine="Else If TipoOperacion = \"MobilRutaVideos\" Then";
if ((_tipooperacion).equals("MobilRutaVideos")) { 
this.state = 29;
}else 
{RDebugUtils.currentLine=1441854;
 //BA.debugLineNum = 1441854;BA.debugLine="Else If TipoOperacion = \"MobilRutaFotosWhapp\" T";
if ((_tipooperacion).equals("MobilRutaFotosWhapp")) { 
this.state = 43;
}else 
{RDebugUtils.currentLine=1441866;
 //BA.debugLineNum = 1441866;BA.debugLine="Else If TipoOperacion = \"MobilRutaVideosWhapp\"";
if ((_tipooperacion).equals("MobilRutaVideosWhapp")) { 
this.state = 57;
}}}}
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=1441831;
 //BA.debugLineNum = 1441831;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
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
RDebugUtils.currentLine=1441832;
 //BA.debugLineNum = 1441832;BA.debugLine="Dim Extension As String = \"\"";
_extension = "";
RDebugUtils.currentLine=1441833;
 //BA.debugLineNum = 1441833;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
_archivox = BA.ObjectToString(_listagenerica_.Get(_h));
RDebugUtils.currentLine=1441834;
 //BA.debugLineNum = 1441834;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
_extension = parent.mostCurrent._fxglobales._right /*String*/ (processBA,_archivox,(int) (3));
RDebugUtils.currentLine=1441835;
 //BA.debugLineNum = 1441835;BA.debugLine="If Extension.ToUpperCase = \"JPG\" Then";
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
RDebugUtils.currentLine=1441836;
 //BA.debugLineNum = 1441836;BA.debugLine="If DatosGlobales.XML_ChFotosCamara = \"1\" The";
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
RDebugUtils.currentLine=1441837;
 //BA.debugLineNum = 1441837;BA.debugLine="CantidadTotal = CantidadTotal + 1";
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
RDebugUtils.currentLine=1441843;
 //BA.debugLineNum = 1441843;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
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
RDebugUtils.currentLine=1441844;
 //BA.debugLineNum = 1441844;BA.debugLine="Dim Extension As String = \"\"";
_extension = "";
RDebugUtils.currentLine=1441845;
 //BA.debugLineNum = 1441845;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
_archivox = BA.ObjectToString(_listagenerica_.Get(_h));
RDebugUtils.currentLine=1441846;
 //BA.debugLineNum = 1441846;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
_extension = parent.mostCurrent._fxglobales._right /*String*/ (processBA,_archivox,(int) (3));
RDebugUtils.currentLine=1441847;
 //BA.debugLineNum = 1441847;BA.debugLine="If Extension.ToUpperCase = \"MP4\" Then";
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
RDebugUtils.currentLine=1441848;
 //BA.debugLineNum = 1441848;BA.debugLine="If DatosGlobales.XML_ChVideosCamara = \"1\" Th";
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
RDebugUtils.currentLine=1441849;
 //BA.debugLineNum = 1441849;BA.debugLine="CantidadTotal = CantidadTotal + 1";
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
RDebugUtils.currentLine=1441855;
 //BA.debugLineNum = 1441855;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
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
RDebugUtils.currentLine=1441856;
 //BA.debugLineNum = 1441856;BA.debugLine="Dim Extension As String = \"\"";
_extension = "";
RDebugUtils.currentLine=1441857;
 //BA.debugLineNum = 1441857;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
_archivox = BA.ObjectToString(_listagenerica_.Get(_h));
RDebugUtils.currentLine=1441858;
 //BA.debugLineNum = 1441858;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
_extension = parent.mostCurrent._fxglobales._right /*String*/ (processBA,_archivox,(int) (3));
RDebugUtils.currentLine=1441859;
 //BA.debugLineNum = 1441859;BA.debugLine="If Extension.ToUpperCase = \"JPG\" Then";
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
RDebugUtils.currentLine=1441860;
 //BA.debugLineNum = 1441860;BA.debugLine="If DatosGlobales.XML_ChImagenesWhatsApp = \"1";
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
RDebugUtils.currentLine=1441861;
 //BA.debugLineNum = 1441861;BA.debugLine="CantidadTotal = CantidadTotal + 1";
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
RDebugUtils.currentLine=1441867;
 //BA.debugLineNum = 1441867;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
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
RDebugUtils.currentLine=1441868;
 //BA.debugLineNum = 1441868;BA.debugLine="Dim Extension As String = \"\"";
_extension = "";
RDebugUtils.currentLine=1441869;
 //BA.debugLineNum = 1441869;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
_archivox = BA.ObjectToString(_listagenerica_.Get(_h));
RDebugUtils.currentLine=1441870;
 //BA.debugLineNum = 1441870;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
_extension = parent.mostCurrent._fxglobales._right /*String*/ (processBA,_archivox,(int) (3));
RDebugUtils.currentLine=1441871;
 //BA.debugLineNum = 1441871;BA.debugLine="If Extension.ToUpperCase = \"MP4\" Then";
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
RDebugUtils.currentLine=1441872;
 //BA.debugLineNum = 1441872;BA.debugLine="If DatosGlobales.XML_ChVideosWhatsApp = \"1\"";
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
RDebugUtils.currentLine=1441873;
 //BA.debugLineNum = 1441873;BA.debugLine="CantidadTotal = CantidadTotal + 1";
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
RDebugUtils.currentLine=1441898;
 //BA.debugLineNum = 1441898;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("51441898",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=1441899;
 //BA.debugLineNum = 1441899;BA.debugLine="ToastMessageShow(\"#ERROR: \" & LastException, Tr";
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
RDebugUtils.currentLine=1441904;
 //BA.debugLineNum = 1441904;BA.debugLine="Resultado = True";
_resultado = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1441906;
 //BA.debugLineNum = 1441906;BA.debugLine="Return Resultado";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=1441909;
 //BA.debugLineNum = 1441909;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.objects.collections.List  _devolverlista(String _unaruta,boolean _oesprimeravez) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "devolverlista", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(processBA, "devolverlista", new Object[] {_unaruta,_oesprimeravez}));}
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
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub DevolverLista(unaRuta As String, oEsPr";
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Dim unaListaFinal As List";
_unalistafinal = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Dim unaListaProvisoria As List";
_unalistaprovisoria = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Dim unaListaProvisoria2 As List";
_unalistaprovisoria2 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="unaListaFinal.Initialize";
_unalistafinal.Initialize();
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="unaListaProvisoria.Initialize";
_unalistaprovisoria.Initialize();
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="unaListaProvisoria2.Initialize";
_unalistaprovisoria2.Initialize();
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="unaListaFinal.Clear";
_unalistafinal.Clear();
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="unaListaProvisoria.Clear";
_unalistaprovisoria.Clear();
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="unaListaProvisoria2.Clear";
_unalistaprovisoria2.Clear();
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="Dim FechaActual As String";
_fechaactual = "";
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="FechaActual = DateTime.Date(DateTime.Now)";
_fechaactual = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="If oEsPrimeraVez = False Then";
if (_oesprimeravez==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="unaListaProvisoria = File.ListFiles(unaRuta)";
_unalistaprovisoria = anywheresoftware.b4a.keywords.Common.File.ListFiles(_unaruta);
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="For i = 0 To unaListaProvisoria.Size -1";
{
final int step15 = 1;
final int limit15 = (int) (_unalistaprovisoria.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="Dim	Archivo As Object = unaListaProvisoria.Get(";
_archivo = _unalistaprovisoria.Get(_i);
RDebugUtils.currentLine=1310748;
 //BA.debugLineNum = 1310748;BA.debugLine="Dim Archivox As String = unaListaProvisoria.Get";
_archivox = BA.ObjectToString(_unalistaprovisoria.Get(_i));
RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="Dim Extension As String = FxGlobales.Right(Arch";
_extension = mostCurrent._fxglobales._right /*String*/ (processBA,_archivox,(int) (3));
RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=1310753;
 //BA.debugLineNum = 1310753;BA.debugLine="Dim d As Long";
_d = 0L;
RDebugUtils.currentLine=1310754;
 //BA.debugLineNum = 1310754;BA.debugLine="d = File.LastModified(unaRuta, Archivo)";
_d = anywheresoftware.b4a.keywords.Common.File.LastModified(_unaruta,BA.ObjectToString(_archivo));
RDebugUtils.currentLine=1310755;
 //BA.debugLineNum = 1310755;BA.debugLine="Dim unaFechaArchivo As String = DateTime.Date(d";
_unafechaarchivo = anywheresoftware.b4a.keywords.Common.DateTime.Date(_d);
RDebugUtils.currentLine=1310757;
 //BA.debugLineNum = 1310757;BA.debugLine="If(FechaActual = unaFechaArchivo) Then 'hoy";
if (((_fechaactual).equals(_unafechaarchivo))) { 
RDebugUtils.currentLine=1310758;
 //BA.debugLineNum = 1310758;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
_unalistaprovisoria2.Add(_unalistaprovisoria.Get(_i));
 };
RDebugUtils.currentLine=1310762;
 //BA.debugLineNum = 1310762;BA.debugLine="Dim FechaAyer As String";
_fechaayer = "";
RDebugUtils.currentLine=1310763;
 //BA.debugLineNum = 1310763;BA.debugLine="FechaAyer = DateTime.Date(DateTime.Add(DateTime";
_fechaayer = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)));
RDebugUtils.currentLine=1310764;
 //BA.debugLineNum = 1310764;BA.debugLine="If(FechaAyer = unaFechaArchivo) Then 'los de ay";
if (((_fechaayer).equals(_unafechaarchivo))) { 
RDebugUtils.currentLine=1310765;
 //BA.debugLineNum = 1310765;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
_unalistaprovisoria2.Add(_unalistaprovisoria.Get(_i));
 };
RDebugUtils.currentLine=1310768;
 //BA.debugLineNum = 1310768;BA.debugLine="Dim Fecha2DiasAntes As String";
_fecha2diasantes = "";
RDebugUtils.currentLine=1310769;
 //BA.debugLineNum = 1310769;BA.debugLine="Fecha2DiasAntes = DateTime.Date(DateTime.Add(Da";
_fecha2diasantes = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-2)));
RDebugUtils.currentLine=1310770;
 //BA.debugLineNum = 1310770;BA.debugLine="If(Fecha2DiasAntes = unaFechaArchivo) Then 'los";
if (((_fecha2diasantes).equals(_unafechaarchivo))) { 
RDebugUtils.currentLine=1310771;
 //BA.debugLineNum = 1310771;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
_unalistaprovisoria2.Add(_unalistaprovisoria.Get(_i));
 };
RDebugUtils.currentLine=1310774;
 //BA.debugLineNum = 1310774;BA.debugLine="Dim Fecha3DiasAntes As String";
_fecha3diasantes = "";
RDebugUtils.currentLine=1310775;
 //BA.debugLineNum = 1310775;BA.debugLine="Fecha3DiasAntes = DateTime.Date(DateTime.Add(Da";
_fecha3diasantes = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-3)));
RDebugUtils.currentLine=1310776;
 //BA.debugLineNum = 1310776;BA.debugLine="If(Fecha3DiasAntes = unaFechaArchivo) Then 'los";
if (((_fecha3diasantes).equals(_unafechaarchivo))) { 
RDebugUtils.currentLine=1310777;
 //BA.debugLineNum = 1310777;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
_unalistaprovisoria2.Add(_unalistaprovisoria.Get(_i));
 };
 }
};
RDebugUtils.currentLine=1310782;
 //BA.debugLineNum = 1310782;BA.debugLine="unaListaFinal = unaListaProvisoria2";
_unalistafinal = _unalistaprovisoria2;
 }else {
RDebugUtils.currentLine=1310786;
 //BA.debugLineNum = 1310786;BA.debugLine="unaListaFinal = File.ListFiles(unaRuta) ' [000_0";
_unalistafinal = anywheresoftware.b4a.keywords.Common.File.ListFiles(_unaruta);
 };
RDebugUtils.currentLine=1310791;
 //BA.debugLineNum = 1310791;BA.debugLine="Dim unaListaFinalSinDupli As List = EliminarDupli";
_unalistafinalsindupli = new anywheresoftware.b4a.objects.collections.List();
_unalistafinalsindupli = _eliminarduplicados(_unalistafinal);
RDebugUtils.currentLine=1310794;
 //BA.debugLineNum = 1310794;BA.debugLine="Return unaListaFinalSinDupli 'el return era el de";
if (true) return _unalistafinalsindupli;
RDebugUtils.currentLine=1310796;
 //BA.debugLineNum = 1310796;BA.debugLine="End Sub";
return null;
}
public static String  _crearnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "crearnotificacion", false))
	 {return ((String) Debug.delegate(processBA, "crearnotificacion", new Object[] {_unidnotificacion,_titulo,_mensaje}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub CrearNotificacion(UnIdNotificacion As";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _eliminarduplicados(anywheresoftware.b4a.objects.collections.List _lista) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "eliminarduplicados", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(processBA, "eliminarduplicados", new Object[] {_lista}));}
anywheresoftware.b4a.objects.collections.List _resultado = null;
anywheresoftware.b4a.objects.collections.Map _mapduplicados = null;
int _i = 0;
Object _elemento = null;
Object _key = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub EliminarDuplicados(lista As List) As List";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Log(\"FX: EliminarDuplicados --> Entro --> Cantida";
anywheresoftware.b4a.keywords.Common.LogImpl("51507330","FX: EliminarDuplicados --> Entro --> Cantidad incio: "+BA.NumberToString((_lista.getSize()-1)),0);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Dim Resultado As List";
_resultado = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Dim mapDuplicados As Map";
_mapduplicados = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="mapDuplicados.Initialize";
_mapduplicados.Initialize();
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Resultado.Initialize";
_resultado.Initialize();
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="For i = 0 To lista.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_lista.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="Dim elemento As Object";
_elemento = new Object();
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="elemento = lista.Get(i)";
_elemento = _lista.Get(_i);
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="If Not(mapDuplicados.ContainsKey(elemento)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_mapduplicados.ContainsKey(_elemento))) { 
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="mapDuplicados.Put(elemento, \"\")";
_mapduplicados.Put(_elemento,(Object)(""));
 };
 }
};
RDebugUtils.currentLine=1507352;
 //BA.debugLineNum = 1507352;BA.debugLine="For Each key As Object In mapDuplicados.Keys";
{
final anywheresoftware.b4a.BA.IterableList group13 = _mapduplicados.Keys();
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_key = group13.Get(index13);
RDebugUtils.currentLine=1507353;
 //BA.debugLineNum = 1507353;BA.debugLine="Resultado.Add(key)";
_resultado.Add(_key);
 }
};
RDebugUtils.currentLine=1507356;
 //BA.debugLineNum = 1507356;BA.debugLine="Log(\"FX: EliminarDuplicados --> Llega hasta aca?";
anywheresoftware.b4a.keywords.Common.LogImpl("51507356","FX: EliminarDuplicados --> Llega hasta aca? --> CANTIDAD FIN: "+BA.NumberToString((_resultado.getSize()-1)),0);
RDebugUtils.currentLine=1507358;
 //BA.debugLineNum = 1507358;BA.debugLine="Return Resultado";
if (true) return _resultado;
RDebugUtils.currentLine=1507360;
 //BA.debugLineNum = 1507360;BA.debugLine="End Sub";
return null;
}
public static String  _eliminarnotificacion(int _unidnotificacion) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "eliminarnotificacion", false))
	 {return ((String) Debug.delegate(processBA, "eliminarnotificacion", new Object[] {_unidnotificacion}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub EliminarNotificacion(UnIdNotificacion";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="noti.Cancel(UnIdNotificacion)";
_noti.Cancel(_unidnotificacion);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _encontroarchivoenservidor(String _unarutaserver,String _unarutamobile,String _unarchivo) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "encontroarchivoenservidor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "encontroarchivoenservidor", new Object[] {_unarutaserver,_unarutamobile,_unarchivo}));}
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
RDebugUtils.currentModule="servbackup4";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="currentFileSize = File.Size(unaRutaMobile, unArch";
parent._currentfilesize = (int) (anywheresoftware.b4a.keywords.Common.File.Size(_unarutamobile,_unarchivo));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim Resu As Boolean = False";
_resu = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="If FTP_Consulta.IsInitialized = True Then";
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
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="FTP_Consulta.CloseNow";
parent._ftp_consulta.CloseNow();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Servi";
parent._ftp_consulta.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="FTP_Consulta.PassiveMode = True";
parent._ftp_consulta.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="FTP_Consulta.List(unaRutaServer) 'ejemplo --> \"./";
parent._ftp_consulta.List(processBA,_unarutaserver);
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "encontroarchivoenservidor"), null);
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
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="Dim TotalArchivos As Int = Files.Length";
_totalarchivos = _files.length;
RDebugUtils.currentLine=1376277;
 //BA.debugLineNum = 1376277;BA.debugLine="If Success  Then";
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
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="For i = 0 To TotalArchivos-1";
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
RDebugUtils.currentLine=1376279;
 //BA.debugLineNum = 1376279;BA.debugLine="If unArchivo = Files(i).Name Then";
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
RDebugUtils.currentLine=1376288;
 //BA.debugLineNum = 1376288;BA.debugLine="Log(\"Archivo: \" & unArchivo & \" - Tamaño en se";
anywheresoftware.b4a.keywords.Common.LogImpl("51376288","Archivo: "+_unarchivo+" - Tamaño en server: "+BA.NumberToString((_files[_i].getSize()))+" - Tamaño en Dispositivo: "+BA.NumberToString((parent._currentfilesize)),0);
RDebugUtils.currentLine=1376290;
 //BA.debugLineNum = 1376290;BA.debugLine="If (currentFileSize) = (Files(i).Size) Then";
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
RDebugUtils.currentLine=1376291;
 //BA.debugLineNum = 1376291;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=1376293;
 //BA.debugLineNum = 1376293;BA.debugLine="Log(\"Archivo existe en sel server, pero no co";
anywheresoftware.b4a.keywords.Common.LogImpl("51376293","Archivo existe en sel server, pero no coinciden los tamaños - "+"ARCHIVO EN SERVER: "+_files[_i].getName()+" - TAMAÑO ARCHIVO SERVER: "+BA.NumberToString(_files[_i].getSize())+" - TAMAÑO MOBILE: "+BA.NumberToString((anywheresoftware.b4a.keywords.Common.File.Size(_unarutamobile,_unarchivo))),0);
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=1376295;
 //BA.debugLineNum = 1376295;BA.debugLine="Return Resu";
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
RDebugUtils.currentLine=1376301;
 //BA.debugLineNum = 1376301;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
RDebugUtils.currentLine=1376302;
 //BA.debugLineNum = 1376302;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _finalizarproceso() throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "finalizarproceso", false))
	 {return ((String) Debug.delegate(processBA, "finalizarproceso", null));}
String _unxml = "";
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub FinalizarProceso()";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Log(\"EJECUTA LA FX --> FinalizarProceso() --> Can";
anywheresoftware.b4a.keywords.Common.LogImpl("51572865","EJECUTA LA FX --> FinalizarProceso() --> Cant. en curso: "+BA.NumberToString(_cantencurso)+", Cant. Total: "+BA.NumberToString(_cantidadtotal)+", fallidas: "+BA.NumberToString(_cantidadfallidas)+", Ok: "+BA.NumberToString(_cantidadok),0);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
if (_cantencurso>=_cantidadtotal) { 
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="If CantidadFallidas = 0 Then";
if (_cantidadfallidas==0) { 
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="DatosGlobales.Segundos = 3600 'lo paso de 360s";
mostCurrent._datosglobales._segundos /*int*/  = (int) (3600);
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="Dim unXml As String = CargarElXML  'la tengo q";
_unxml = _cargarelxml();
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="File.WriteString(File.DirInternal,\"config.xml\",";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"config.xml",_unxml);
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="CantEnCurso = 0";
_cantencurso = (int) (0);
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="CantidadTotal = 0";
_cantidadtotal = (int) (0);
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="CantidadOk = 0";
_cantidadok = (int) (0);
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="CantidadFallidas = 0";
_cantidadfallidas = (int) (0);
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="DatosGlobales.Ejecutandose = False";
mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS\",";
_modificarnotificacion(_idnotificacion,"FOTOS","Esperando para hacer copia... Próxima ejecucion: "+mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="Log(\"Esperando para hacer copia... Próxima ejec";
anywheresoftware.b4a.keywords.Common.LogImpl("51572878","Esperando para hacer copia... Próxima ejecucion: "+mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA),0);
 };
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="DatosGlobales.CopiaProgress = 0";
mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=1572883;
 //BA.debugLineNum = 1572883;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
mostCurrent._datosglobales._copiaprogreso /*String*/  = "0";
RDebugUtils.currentLine=1572884;
 //BA.debugLineNum = 1572884;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullbkp";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt","-1");
RDebugUtils.currentLine=1572885;
 //BA.debugLineNum = 1572885;BA.debugLine="StopService(Me)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,servbackup4.getObject());
 };
RDebugUtils.currentLine=1572887;
 //BA.debugLineNum = 1572887;BA.debugLine="End Sub";
return "";
}
public static String  _modificarnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "modificarnotificacion", false))
	 {return ((String) Debug.delegate(processBA, "modificarnotificacion", new Object[] {_unidnotificacion,_titulo,_mensaje}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub ModificarNotificacion(UnIdNotificacion";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="End Sub";
return "";
}
public static String  _ftp_uploadcompleted(String _serverpath,boolean _success) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "ftp_uploadcompleted", false))
	 {return ((String) Debug.delegate(processBA, "ftp_uploadcompleted", new Object[] {_serverpath,_success}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub ftp_UploadCompleted (ServerPath As String, Suc";
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Log(\"--> FTP_UploadCompleted --> Subio Ok.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("51114116","--> FTP_UploadCompleted --> Subio Ok.",0);
 }else {
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Log(\"--> FTP_UploadCompleted --> Fallo Subida\")";
anywheresoftware.b4a.keywords.Common.LogImpl("51114118","--> FTP_UploadCompleted --> Fallo Subida",0);
 };
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="End Sub";
return "";
}
public static String  _ftp_uploadprogress(String _serverpath,long _totaluploaded,long _total) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "ftp_uploadprogress", false))
	 {return ((String) Debug.delegate(processBA, "ftp_uploadprogress", new Object[] {_serverpath,_totaluploaded,_total}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub FTP_UploadProgress (ServerPath As String, Tota";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Try";
try {RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="DatosGlobales.CopiaProgreso =  \"[\" & TotalUpload";
mostCurrent._datosglobales._copiaprogreso /*String*/  = "["+BA.NumberToString(_totaluploaded)+"]";
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="DatosGlobales.CopiaProgress = FxGlobales.CInt(10";
mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(mostCurrent._fxglobales._cint /*int*/ (processBA,(Object)(100*_totaluploaded/(double)_currentfilesize)));
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = Round2((Cant";
mostCurrent._datosglobales._copiaporcentencurso /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2((_cantencurso*100)/(double)_cantidadtotal,(int) (0)))+"%";
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS - P";
_modificarnotificacion(_idnotificacion,"FOTOS - PROCESO GLOBAL ["+BA.NumberToString(_cantencurso)+"/"+BA.NumberToString(_cantidadtotal)+"]  "+mostCurrent._datosglobales._copiaporcentencurso /*String*/ ,mostCurrent._datosglobales._nombrearchivo /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+mostCurrent._datosglobales._copiaprogreso /*String*/ +" - "+mostCurrent._datosglobales._copiaprogress /*String*/ +"%");
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
if (_cantencurso>=_cantidadtotal) { 
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="FinalizarProceso";
_finalizarproceso();
 };
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=1048638;
 //BA.debugLineNum = 1048638;BA.debugLine="Log(\"ERROR: en FTP_UploadProgress - \" & LastExce";
anywheresoftware.b4a.keywords.Common.LogImpl("51048638","ERROR: en FTP_UploadProgress - "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=1048641;
 //BA.debugLineNum = 1048641;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _guardararchivoenelservidor(String _pathdelservidor,String _ip,int _puerto,String _usuario,String _contra,String _rutamobile,String _archivomobilefull,int _tipodeoperacion) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "guardararchivoenelservidor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "guardararchivoenelservidor", new Object[] {_pathdelservidor,_ip,_puerto,_usuario,_contra,_rutamobile,_archivomobilefull,_tipodeoperacion}));}
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
RDebugUtils.currentModule="servbackup4";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Try";
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
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Dim Path As String = \"\"";
_path = "";
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Dim Resu As Boolean = False";
_resu = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="DatosGlobales.CopiaProgress = 0";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="If TipoDeOperacion = 0 Then 'FOTOS CAMARA";
if (true) break;

case 4:
//if
this.state = 13;
if (_tipodeoperacion==0) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Else If TipoDeOperacion = 1 Then 'VIDEOS CAMARA";
if (_tipodeoperacion==1) { 
this.state = 8;
}else 
{RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Else If TipoDeOperacion = 2 Then 'IMAGENES WHATS";
if (_tipodeoperacion==2) { 
this.state = 10;
}else 
{RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="Else If TipoDeOperacion = 3 Then 'VIDEOS WHATSAP";
if (_tipodeoperacion==3) { 
this.state = 12;
}}}}
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Path = PathFotosCamara";
_path = parent._pathfotoscamara;
 if (true) break;

case 8:
//C
this.state = 13;
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Path = PathVideosCamara";
_path = parent._pathvideoscamara;
 if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Path = PathImagenesWhatsApp";
_path = parent._pathimageneswhatsapp;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Path = PathVideosWhatsApp";
_path = parent._pathvideoswhatsapp;
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="Dim ArchivoMobile As String = FxGlobales.Left(Ar";
_archivomobile = parent.mostCurrent._fxglobales._left /*String*/ (processBA,_archivomobilefull,_archivomobilefull.indexOf(";"));
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="Dim FechaArchivo As String '= FxGlobales.Right(A";
_fechaarchivo = "";
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="DatosGlobales.NombreArchivo = ArchivoMobile";
parent.mostCurrent._datosglobales._nombrearchivo /*String*/  = _archivomobile;
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="FechaWhapp = \"\"";
parent._fechawhapp = "";
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="If TipoDeOperacion = 2 Or TipoDeOperacion = 3 Th";
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
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="Dim PrimerUbicacion As Int = ArchivoMobile.Inde";
_primerubicacion = _archivomobile.indexOf("-");
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="Dim SegundaUbicacion As Int  = ArchivoMobile.La";
_segundaubicacion = _archivomobile.lastIndexOf("-");
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="FechaWhapp = FxGlobales.Mid(ArchivoMobile, Prim";
parent._fechawhapp = parent.mostCurrent._fxglobales._mid /*String*/ (processBA,_archivomobile,(int) (_primerubicacion+2),(int) (8));
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="FechaArchivo = FechaWhapp";
_fechaarchivo = parent._fechawhapp;
 if (true) break;
;
RDebugUtils.currentLine=983081;
 //BA.debugLineNum = 983081;BA.debugLine="If TipoDeOperacion = 0 Or TipoDeOperacion = 1 Th";

case 17:
//if
this.state = 20;
if (_tipodeoperacion==0 || _tipodeoperacion==1) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=983082;
 //BA.debugLineNum = 983082;BA.debugLine="Dim PrimerUbicacion As Int = ArchivoMobile.Inde";
_primerubicacion = _archivomobile.indexOf("_");
RDebugUtils.currentLine=983083;
 //BA.debugLineNum = 983083;BA.debugLine="Dim SegundaUbicacion As Int  = ArchivoMobile.La";
_segundaubicacion = _archivomobile.lastIndexOf("_");
RDebugUtils.currentLine=983084;
 //BA.debugLineNum = 983084;BA.debugLine="FechaWhapp = FxGlobales.Mid(ArchivoMobile, Prim";
parent._fechawhapp = parent.mostCurrent._fxglobales._mid /*String*/ (processBA,_archivomobile,(int) (_primerubicacion+2),(int) (8));
RDebugUtils.currentLine=983085;
 //BA.debugLineNum = 983085;BA.debugLine="FechaArchivo = FechaWhapp";
_fechaarchivo = parent._fechawhapp;
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=983089;
 //BA.debugLineNum = 983089;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServidor";
anywheresoftware.b4a.keywords.Common.LogImpl("5983089","Ejecutando FX -> GuardarArchivoEnElServidor - [1] - Para el archivo: "+_archivomobile+" FechaArchivo =====================> "+parent._fechawhapp+" VS "+_fechaarchivo,0);
RDebugUtils.currentLine=983098;
 //BA.debugLineNum = 983098;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then 'esto";
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
RDebugUtils.currentLine=983100;
 //BA.debugLineNum = 983100;BA.debugLine="If DatosGlobales.IndiceFullBkp > CantEnCurso Th";
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
RDebugUtils.currentLine=983102;
 //BA.debugLineNum = 983102;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServid";
anywheresoftware.b4a.keywords.Common.LogImpl("5983102","Ejecutando FX -> GuardarArchivoEnElServidor - [1-Z] - EXISTE PORQUE FUE GUADADO PREVIAMENTE PERO NO SE EVALUA  # ENTONCES NO HAGO NADA!!!",0);
RDebugUtils.currentLine=983104;
 //BA.debugLineNum = 983104;BA.debugLine="DatosGlobales.CopiaProgress = 100";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(100);
RDebugUtils.currentLine=983105;
 //BA.debugLineNum = 983105;BA.debugLine="CantidadOk = CantidadOk + 1 'si bien no hago o";
parent._cantidadok = (int) (parent._cantidadok+1);
RDebugUtils.currentLine=983106;
 //BA.debugLineNum = 983106;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS -";
_modificarnotificacion(parent._idnotificacion,"FOTOS - PROCESO GLOBAL ["+BA.NumberToString(parent._cantencurso)+"/"+BA.NumberToString(parent._cantidadtotal)+"]  "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ ,parent.mostCurrent._datosglobales._nombrearchivo /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._datosglobales._copiaprogreso /*String*/ +" - "+parent.mostCurrent._datosglobales._copiaprogress /*String*/ +"%");
RDebugUtils.currentLine=983107;
 //BA.debugLineNum = 983107;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=983109;
 //BA.debugLineNum = 983109;BA.debugLine="CantEnCurso = CantEnCurso + 1";
parent._cantencurso = (int) (parent._cantencurso+1);
RDebugUtils.currentLine=983110;
 //BA.debugLineNum = 983110;BA.debugLine="DatosGlobales.CopiaCantEnCurso = CantEnCurso &";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(parent._cantencurso)+"/"+BA.NumberToString(parent._cantidadtotal);
RDebugUtils.currentLine=983111;
 //BA.debugLineNum = 983111;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = Round2((Ca";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2((parent._cantencurso*100)/(double)parent._cantidadtotal,(int) (0)))+"%";
RDebugUtils.currentLine=983113;
 //BA.debugLineNum = 983113;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServid";
anywheresoftware.b4a.keywords.Common.LogImpl("5983113","Ejecutando FX -> GuardarArchivoEnElServidor - [5-Z] -> Cantidad en curso: "+BA.NumberToString(parent._cantencurso)+" - Cantidad Total: "+BA.NumberToString(parent._cantidadtotal)+" - OK: "+BA.NumberToString(parent._cantidadok)+" - Fallidas: "+BA.NumberToString(parent._cantidadfallidas)+" - Progreso del proceso: "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ ,0);
RDebugUtils.currentLine=983115;
 //BA.debugLineNum = 983115;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
RDebugUtils.currentLine=983124;
 //BA.debugLineNum = 983124;BA.debugLine="If File.Exists(PathDelServidor & \"/\" & Path & \"/";

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
RDebugUtils.currentLine=983127;
 //BA.debugLineNum = 983127;BA.debugLine="If FTP3.IsInitialized = True Then";
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
RDebugUtils.currentLine=983128;
 //BA.debugLineNum = 983128;BA.debugLine="FTP3.CloseNow";
parent._ftp3.CloseNow();
 if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=983131;
 //BA.debugLineNum = 983131;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
parent._ftp3.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=983132;
 //BA.debugLineNum = 983132;BA.debugLine="FTP3.PassiveMode = True";
parent._ftp3.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983138;
 //BA.debugLineNum = 983138;BA.debugLine="Dim sf As Object = FTP3.SendCommand(\"MKD\", Path";
_sf = parent._ftp3.SendCommand(processBA,"MKD",_pathdelservidor+"/"+_path);
RDebugUtils.currentLine=983139;
 //BA.debugLineNum = 983139;BA.debugLine="Wait For (sf) FTP_CommandCompleted(Command As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_commandcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "guardararchivoenelservidor"), _sf);
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
RDebugUtils.currentLine=983140;
 //BA.debugLineNum = 983140;BA.debugLine="If Success = True Then";
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
RDebugUtils.currentLine=983142;
 //BA.debugLineNum = 983142;BA.debugLine="FTP3.CloseNow";
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
RDebugUtils.currentLine=983145;
 //BA.debugLineNum = 983145;BA.debugLine="Log(\"No pudo crear carpeta: \" & PathDelServidor";
anywheresoftware.b4a.keywords.Common.LogImpl("5983145","No pudo crear carpeta: "+_pathdelservidor+"/"+_path+"!!!",0);
 if (true) break;
;
RDebugUtils.currentLine=983148;
 //BA.debugLineNum = 983148;BA.debugLine="If File.Exists(PathDelServidor & \"/\" & Path & \"/";

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
RDebugUtils.currentLine=983151;
 //BA.debugLineNum = 983151;BA.debugLine="If FTP3.IsInitialized = True Then";
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
RDebugUtils.currentLine=983152;
 //BA.debugLineNum = 983152;BA.debugLine="FTP3.CloseNow";
parent._ftp3.CloseNow();
 if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=983155;
 //BA.debugLineNum = 983155;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
parent._ftp3.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=983156;
 //BA.debugLineNum = 983156;BA.debugLine="FTP3.PassiveMode = True";
parent._ftp3.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983160;
 //BA.debugLineNum = 983160;BA.debugLine="Dim sf2 As Object = FTP3.SendCommand(\"MKD\", Pat";
_sf2 = parent._ftp3.SendCommand(processBA,"MKD",_pathdelservidor+"/"+_path+"/"+_fechaarchivo);
RDebugUtils.currentLine=983161;
 //BA.debugLineNum = 983161;BA.debugLine="Wait For (sf2) FTP_CommandCompleted(Command As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_commandcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "guardararchivoenelservidor"), _sf2);
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
RDebugUtils.currentLine=983162;
 //BA.debugLineNum = 983162;BA.debugLine="If Success = True Then";
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
RDebugUtils.currentLine=983164;
 //BA.debugLineNum = 983164;BA.debugLine="FTP3.CloseNow";
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
RDebugUtils.currentLine=983167;
 //BA.debugLineNum = 983167;BA.debugLine="Log(\"No pudo crear carpeta: \" & PathDelServidor";
anywheresoftware.b4a.keywords.Common.LogImpl("5983167","No pudo crear carpeta: "+_pathdelservidor+"/"+_path+"/"+_fechaarchivo+"!!!",0);
 if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=983171;
 //BA.debugLineNum = 983171;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServidor";
anywheresoftware.b4a.keywords.Common.LogImpl("5983171","Ejecutando FX -> GuardarArchivoEnElServidor - [2] - Para el archivo: "+_archivomobile+" - Termino de validar y crear carpetas en el server",0);
RDebugUtils.currentLine=983175;
 //BA.debugLineNum = 983175;BA.debugLine="Dim rsb As ResumableSub = EncontroArchivoEnServi";
_rsb = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsb = _encontroarchivoenservidor(_pathdelservidor+"/"+_path+"/"+_fechaarchivo+"/",_rutamobile,_archivomobile);
RDebugUtils.currentLine=983176;
 //BA.debugLineNum = 983176;BA.debugLine="Wait For(rsb) complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "guardararchivoenelservidor"), _rsb);
this.state = 91;
return;
case 91:
//C
this.state = 55;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=983177;
 //BA.debugLineNum = 983177;BA.debugLine="If Result = True Then";
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
RDebugUtils.currentLine=983181;
 //BA.debugLineNum = 983181;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServido";
anywheresoftware.b4a.keywords.Common.LogImpl("5983181","Ejecutando FX -> GuardarArchivoEnElServidor - [3-1] - EXISTE --> RUTA: "+_pathdelservidor+"/"+_path+"/"+_fechaarchivo+" -  ARCHIVO --> "+_archivomobile+" # ENTONCES NO HAGO NADA!!!",0);
RDebugUtils.currentLine=983184;
 //BA.debugLineNum = 983184;BA.debugLine="DatosGlobales.CopiaProgress = 100";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(100);
RDebugUtils.currentLine=983186;
 //BA.debugLineNum = 983186;BA.debugLine="CantidadOk = CantidadOk + 1 'si bien no hago op";
parent._cantidadok = (int) (parent._cantidadok+1);
RDebugUtils.currentLine=983190;
 //BA.debugLineNum = 983190;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS -";
_modificarnotificacion(parent._idnotificacion,"FOTOS - PROCESO GLOBAL ["+BA.NumberToString(parent._cantencurso)+"/"+BA.NumberToString(parent._cantidadtotal)+"]  "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ ,parent.mostCurrent._datosglobales._nombrearchivo /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._datosglobales._copiaprogreso /*String*/ +" - "+parent.mostCurrent._datosglobales._copiaprogress /*String*/ +"%");
RDebugUtils.currentLine=983193;
 //BA.debugLineNum = 983193;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=983196;
 //BA.debugLineNum = 983196;BA.debugLine="Try '09/12/2023 --> nuevo try para ver si se pu";
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
RDebugUtils.currentLine=983199;
 //BA.debugLineNum = 983199;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServid";
anywheresoftware.b4a.keywords.Common.LogImpl("5983199","Ejecutando FX -> GuardarArchivoEnElServidor - [3-2] - NO EXISTE!!! --> RUTA: "+_pathdelservidor+"/"+_path+"/"+_fechaarchivo+" -  ARCHIVO --> "+_archivomobile+" # ENTONCES SUBO EL ARCHIVO AL SERVER",0);
RDebugUtils.currentLine=983203;
 //BA.debugLineNum = 983203;BA.debugLine="currentFileSize = File.Size(RutaMobile, Archiv";
parent._currentfilesize = (int) (anywheresoftware.b4a.keywords.Common.File.Size(_rutamobile,_archivomobile));
RDebugUtils.currentLine=983206;
 //BA.debugLineNum = 983206;BA.debugLine="If FTP4.IsInitialized = False Then";
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
RDebugUtils.currentLine=983207;
 //BA.debugLineNum = 983207;BA.debugLine="FTP4.Initialize(\"FTP\",DatosGlobales.ServidorI";
parent._ftp4.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=983208;
 //BA.debugLineNum = 983208;BA.debugLine="FTP4.PassiveMode = True";
parent._ftp4.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=983211;
 //BA.debugLineNum = 983211;BA.debugLine="Dim complete As Object = FTP4.UploadFile(RutaM";
_complete = parent._ftp4.UploadFile(processBA,_rutamobile,_archivomobile,anywheresoftware.b4a.keywords.Common.False,_pathdelservidor+"/"+_path+"/"+_fechaarchivo+"/"+_archivomobile);
RDebugUtils.currentLine=983213;
 //BA.debugLineNum = 983213;BA.debugLine="Wait For (complete) ftp_UploadCompleted (Serve";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "guardararchivoenelservidor"), _complete);
this.state = 92;
return;
case 92:
//C
this.state = 67;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=983214;
 //BA.debugLineNum = 983214;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=983215;
 //BA.debugLineNum = 983215;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=983216;
 //BA.debugLineNum = 983216;BA.debugLine="CantidadOk = CantidadOk + 1";
parent._cantidadok = (int) (parent._cantidadok+1);
RDebugUtils.currentLine=983217;
 //BA.debugLineNum = 983217;BA.debugLine="DatosGlobales.CopiaProgress = 100 'pb.Progres";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(100);
RDebugUtils.currentLine=983221;
 //BA.debugLineNum = 983221;BA.debugLine="FTP4.CloseNow";
parent._ftp4.CloseNow();
RDebugUtils.currentLine=983223;
 //BA.debugLineNum = 983223;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServi";
anywheresoftware.b4a.keywords.Common.LogImpl("5983223","Ejecutando FX -> GuardarArchivoEnElServidor - [4-1] - El archivo se subio al servidor ok!!! -> "+_archivomobile,0);
 if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=983226;
 //BA.debugLineNum = 983226;BA.debugLine="CantidadFallidas = CantidadFallidas + 1";
parent._cantidadfallidas = (int) (parent._cantidadfallidas+1);
RDebugUtils.currentLine=983228;
 //BA.debugLineNum = 983228;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServi";
anywheresoftware.b4a.keywords.Common.LogImpl("5983228","Ejecutando FX -> GuardarArchivoEnElServidor - [4-2] - Fallo subida de archivo al servidor "+_archivomobile,0);
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
RDebugUtils.currentLine=983235;
 //BA.debugLineNum = 983235;BA.debugLine="Log(\"°°°°°°°°°°°°°°°°°°°°°° #ERROR: en subida";
anywheresoftware.b4a.keywords.Common.LogImpl("5983235","°°°°°°°°°°°°°°°°°°°°°° #ERROR: en subida de archivo FTP4.UploadFile  °°°°°°°°°°°°°°°°°°°°°°°°°°°"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 75:
//C
this.state = 76;
this.catchState = 87;
;
 if (true) break;
;
RDebugUtils.currentLine=983254;
 //BA.debugLineNum = 983254;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then 'esto";

case 76:
//if
this.state = 85;
if ((parent.mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
this.state = 78;
}if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=983257;
 //BA.debugLineNum = 983257;BA.debugLine="If Resu = True Then";
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
RDebugUtils.currentLine=983258;
 //BA.debugLineNum = 983258;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullb";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt",BA.NumberToString(parent._cantencurso));
RDebugUtils.currentLine=983259;
 //BA.debugLineNum = 983259;BA.debugLine="Log(\" ---> GUARDO EN ARCHIVO INDICE: \" & CantE";
anywheresoftware.b4a.keywords.Common.LogImpl("5983259"," ---> GUARDO EN ARCHIVO INDICE: "+BA.NumberToString(parent._cantencurso)+" <---",0);
 if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=983261;
 //BA.debugLineNum = 983261;BA.debugLine="Log(\" ---> #FALLO: ENTONCES NO GUARDO EN ARCHI";
anywheresoftware.b4a.keywords.Common.LogImpl("5983261"," ---> #FALLO: ENTONCES NO GUARDO EN ARCHIVO INDICE: "+BA.NumberToString(parent._cantencurso)+"!!! <---",0);
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
RDebugUtils.currentLine=983267;
 //BA.debugLineNum = 983267;BA.debugLine="CantEnCurso = CantEnCurso + 1";
parent._cantencurso = (int) (parent._cantencurso+1);
RDebugUtils.currentLine=983269;
 //BA.debugLineNum = 983269;BA.debugLine="DatosGlobales.CopiaCantEnCurso = CantEnCurso & \"";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(parent._cantencurso)+"/"+BA.NumberToString(parent._cantidadtotal);
RDebugUtils.currentLine=983270;
 //BA.debugLineNum = 983270;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = Round2((Cant";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2((parent._cantencurso*100)/(double)parent._cantidadtotal,(int) (0)))+"%";
RDebugUtils.currentLine=983279;
 //BA.debugLineNum = 983279;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServidor";
anywheresoftware.b4a.keywords.Common.LogImpl("5983279","Ejecutando FX -> GuardarArchivoEnElServidor - [5] -> Cantidad en curso: "+BA.NumberToString(parent._cantencurso)+" - Cantidad Total: "+BA.NumberToString(parent._cantidadtotal)+" - OK: "+BA.NumberToString(parent._cantidadok)+" - Fallidas: "+BA.NumberToString(parent._cantidadfallidas)+" - Progreso del proceso: "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ ,0);
RDebugUtils.currentLine=983328;
 //BA.debugLineNum = 983328;BA.debugLine="Return Resu = True 'True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu==anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 87:
//C
this.state = 88;
this.catchState = 0;
RDebugUtils.currentLine=983331;
 //BA.debugLineNum = 983331;BA.debugLine="Log(\"#ERROR: en Fx GuardarArchivoEnElServidor --";
anywheresoftware.b4a.keywords.Common.LogImpl("5983331","#ERROR: en Fx GuardarArchivoEnElServidor --> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=983332;
 //BA.debugLineNum = 983332;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
 if (true) break;
if (true) break;

case 88:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=983335;
 //BA.debugLineNum = 983335;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _iniciarproceso(anywheresoftware.b4a.objects.collections.List _colmobilrutaorigen) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "iniciarproceso", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "iniciarproceso", new Object[] {_colmobilrutaorigen}));}
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
RDebugUtils.currentModule="servbackup4";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Log(\"Inicio proceso\")";
anywheresoftware.b4a.keywords.Common.LogImpl("51179651","Inicio proceso",0);
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="ListaCompleta.Initialize";
parent._listacompleta.Initialize();
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="ListaFotos.Initialize";
parent._listafotos.Initialize();
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="ListaVideos.Initialize";
parent._listavideos.Initialize();
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="ListaCompleta.Clear";
parent._listacompleta.Clear();
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="ListaFotos.Clear";
parent._listafotos.Clear();
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="ListaVideos.Clear";
parent._listavideos.Clear();
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="Dim Resultado As Boolean = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1179722;
 //BA.debugLineNum = 1179722;BA.debugLine="ColMobilRutaOrigen = EliminarDuplicados(ColMobilR";
_colmobilrutaorigen = _eliminarduplicados(_colmobilrutaorigen);
RDebugUtils.currentLine=1179724;
 //BA.debugLineNum = 1179724;BA.debugLine="Dim rsCantArch As ResumableSub = ConsultarCantida";
_rscantarch = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rscantarch = _consultarcantidadtotaldearchivos(_colmobilrutaorigen);
RDebugUtils.currentLine=1179725;
 //BA.debugLineNum = 1179725;BA.debugLine="Wait For(rsCantArch) complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "iniciarproceso"), _rscantarch);
this.state = 134;
return;
case 134:
//C
this.state = 1;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=1179726;
 //BA.debugLineNum = 1179726;BA.debugLine="If result = True Then";
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
RDebugUtils.currentLine=1179727;
 //BA.debugLineNum = 1179727;BA.debugLine="Log(\"Resultado Fx --> ConsultarCantidadTotalDeAr";
anywheresoftware.b4a.keywords.Common.LogImpl("51179727","Resultado Fx --> ConsultarCantidadTotalDeArchivos -> OK!",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1179729;
 //BA.debugLineNum = 1179729;BA.debugLine="Log(\"Resultado Fx --> ConsultarCantidadTotalDeAr";
anywheresoftware.b4a.keywords.Common.LogImpl("51179729","Resultado Fx --> ConsultarCantidadTotalDeArchivos -> Fallo!!!",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=1179736;
 //BA.debugLineNum = 1179736;BA.debugLine="Log(\"Cantidad total: \" & CantidadTotal)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179736","Cantidad total: "+BA.NumberToString(parent._cantidadtotal),0);
RDebugUtils.currentLine=1179742;
 //BA.debugLineNum = 1179742;BA.debugLine="If CantidadTotal > 0 Then";
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
RDebugUtils.currentLine=1179746;
 //BA.debugLineNum = 1179746;BA.debugLine="For i = 0 To ColMobilRutaOrigen.Size -1";
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
RDebugUtils.currentLine=1179748;
 //BA.debugLineNum = 1179748;BA.debugLine="Dim ContenidoColeccion As String= ColMobilRutaO";
_contenidocoleccion = BA.ObjectToString(_colmobilrutaorigen.Get(_i));
RDebugUtils.currentLine=1179749;
 //BA.debugLineNum = 1179749;BA.debugLine="Dim Tipo As String = (FxGlobales.Left(Contenido";
_tipo = (parent.mostCurrent._fxglobales._left /*String*/ (processBA,_contenidocoleccion,_contenidocoleccion.indexOf(";")));
RDebugUtils.currentLine=1179750;
 //BA.debugLineNum = 1179750;BA.debugLine="Dim Ruta As String = (FxGlobales.Right(Contenid";
_ruta = (parent.mostCurrent._fxglobales._right /*String*/ (processBA,_contenidocoleccion,(int) ((_contenidocoleccion.length()-_contenidocoleccion.indexOf(";")-1))));
RDebugUtils.currentLine=1179752;
 //BA.debugLineNum = 1179752;BA.debugLine="Dim OperacionActual As Int";
_operacionactual = 0;
RDebugUtils.currentLine=1179756;
 //BA.debugLineNum = 1179756;BA.debugLine="If Tipo = \"MobilRutaFotos\" Then";
if (true) break;

case 13:
//if
this.state = 22;
if ((_tipo).equals("MobilRutaFotos")) { 
this.state = 15;
}else 
{RDebugUtils.currentLine=1179758;
 //BA.debugLineNum = 1179758;BA.debugLine="Else If Tipo = \"MobilRutaVideos\" Then";
if ((_tipo).equals("MobilRutaVideos")) { 
this.state = 17;
}else 
{RDebugUtils.currentLine=1179760;
 //BA.debugLineNum = 1179760;BA.debugLine="Else If Tipo = \"MobilRutaFotosWhapp\" Then";
if ((_tipo).equals("MobilRutaFotosWhapp")) { 
this.state = 19;
}else 
{RDebugUtils.currentLine=1179762;
 //BA.debugLineNum = 1179762;BA.debugLine="Else If Tipo = \"MobilRutaVideosWhapp\" Then";
if ((_tipo).equals("MobilRutaVideosWhapp")) { 
this.state = 21;
}}}}
if (true) break;

case 15:
//C
this.state = 22;
RDebugUtils.currentLine=1179757;
 //BA.debugLineNum = 1179757;BA.debugLine="OperacionActual = 0";
_operacionactual = (int) (0);
 if (true) break;

case 17:
//C
this.state = 22;
RDebugUtils.currentLine=1179759;
 //BA.debugLineNum = 1179759;BA.debugLine="OperacionActual = 1";
_operacionactual = (int) (1);
 if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=1179761;
 //BA.debugLineNum = 1179761;BA.debugLine="OperacionActual = 2";
_operacionactual = (int) (2);
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=1179763;
 //BA.debugLineNum = 1179763;BA.debugLine="OperacionActual = 3";
_operacionactual = (int) (3);
 if (true) break;
;
RDebugUtils.currentLine=1179768;
 //BA.debugLineNum = 1179768;BA.debugLine="Try";

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
RDebugUtils.currentLine=1179772;
 //BA.debugLineNum = 1179772;BA.debugLine="Dim PrimeraVez As Boolean";
_primeravez = false;
RDebugUtils.currentLine=1179773;
 //BA.debugLineNum = 1179773;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then";
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
RDebugUtils.currentLine=1179774;
 //BA.debugLineNum = 1179774;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=1179776;
 //BA.debugLineNum = 1179776;BA.debugLine="PrimeraVez= False";
_primeravez = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=1179779;
 //BA.debugLineNum = 1179779;BA.debugLine="Dim ListaGenerica As List = DevolverLista(Ruta";
_listagenerica = new anywheresoftware.b4a.objects.collections.List();
_listagenerica = _devolverlista(_ruta,_primeravez);
RDebugUtils.currentLine=1179787;
 //BA.debugLineNum = 1179787;BA.debugLine="For j = 0 To ListaGenerica.Size -1";
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
RDebugUtils.currentLine=1179789;
 //BA.debugLineNum = 1179789;BA.debugLine="Try";
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
RDebugUtils.currentLine=1179790;
 //BA.debugLineNum = 1179790;BA.debugLine="Dim	Archivo As Object = ListaGenerica.Get(j)";
_archivo = _listagenerica.Get(_j);
RDebugUtils.currentLine=1179792;
 //BA.debugLineNum = 1179792;BA.debugLine="Dim Extension As String = \"\"";
_extension = "";
RDebugUtils.currentLine=1179793;
 //BA.debugLineNum = 1179793;BA.debugLine="Extension = FxGlobales.Right(Archivo, 3)";
_extension = parent.mostCurrent._fxglobales._right /*String*/ (processBA,BA.ObjectToString(_archivo),(int) (3));
RDebugUtils.currentLine=1179794;
 //BA.debugLineNum = 1179794;BA.debugLine="If Extension.ToUpperCase = \"JPG\" Then";
if (true) break;

case 37:
//if
this.state = 106;
if ((_extension.toUpperCase()).equals("JPG")) { 
this.state = 39;
}else 
{RDebugUtils.currentLine=1179857;
 //BA.debugLineNum = 1179857;BA.debugLine="Else If Extension.ToUpperCase = \"MP4\" Then";
if ((_extension.toUpperCase()).equals("MP4")) { 
this.state = 73;
}}
if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=1179795;
 //BA.debugLineNum = 1179795;BA.debugLine="Dim d As Long";
_d = 0L;
RDebugUtils.currentLine=1179796;
 //BA.debugLineNum = 1179796;BA.debugLine="d = File.LastModified(Ruta, Archivo)";
_d = anywheresoftware.b4a.keywords.Common.File.LastModified(_ruta,BA.ObjectToString(_archivo));
RDebugUtils.currentLine=1179798;
 //BA.debugLineNum = 1179798;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=1179799;
 //BA.debugLineNum = 1179799;BA.debugLine="Dim ConcatFileDate As String = Archivo & \";";
_concatfiledate = BA.ObjectToString(_archivo)+";"+anywheresoftware.b4a.keywords.Common.DateTime.Date(_d);
RDebugUtils.currentLine=1179801;
 //BA.debugLineNum = 1179801;BA.debugLine="Try";
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
RDebugUtils.currentLine=1179802;
 //BA.debugLineNum = 1179802;BA.debugLine="If OperacionActual = 0 Then 'MobilRutaFoto";
if (true) break;

case 43:
//if
this.state = 68;
if (_operacionactual==0) { 
this.state = 45;
}else 
{RDebugUtils.currentLine=1179827;
 //BA.debugLineNum = 1179827;BA.debugLine="Else If OperacionActual = 2 Then 'MobilRut";
if (_operacionactual==2) { 
this.state = 57;
}}
if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=1179803;
 //BA.debugLineNum = 1179803;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*String*/ ,parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ ,_ruta,_concatfiledate,parent._operacion.FotosCamara /*int*/ );
RDebugUtils.currentLine=1179804;
 //BA.debugLineNum = 1179804;BA.debugLine="Wait For(rs) complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "iniciarproceso"), _rs);
this.state = 139;
return;
case 139:
//C
this.state = 46;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=1179805;
 //BA.debugLineNum = 1179805;BA.debugLine="If result = True Then";
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
RDebugUtils.currentLine=1179806;
 //BA.debugLineNum = 1179806;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("51179806","Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE LA CAMARA] - Archivo: "+BA.ObjectToString(_archivo)+" -> Lo copio OK!",0);
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=1179808;
 //BA.debugLineNum = 1179808;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("51179808","Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE LA CAMARA] - Archivo: "+BA.ObjectToString(_archivo)+" -> Fallo!!!",0);
RDebugUtils.currentLine=1179811;
 //BA.debugLineNum = 1179811;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
_modificarnotificacion(parent._idnotificacion,"FOTOS","Falló la copia del archivo: "+BA.ObjectToString(_archivo)+" - Próxima ejecución: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
RDebugUtils.currentLine=1179812;
 //BA.debugLineNum = 1179812;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1179813;
 //BA.debugLineNum = 1179813;BA.debugLine="DatosGlobales.Segundos = 60";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
RDebugUtils.currentLine=1179819;
 //BA.debugLineNum = 1179819;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
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
RDebugUtils.currentLine=1179820;
 //BA.debugLineNum = 1179820;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=1179822;
 //BA.debugLineNum = 1179822;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179822","Primera vez: "+BA.ObjectToString(_primeravez),0);
RDebugUtils.currentLine=1179823;
 //BA.debugLineNum = 1179823;BA.debugLine="Return False";
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
RDebugUtils.currentLine=1179828;
 //BA.debugLineNum = 1179828;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*String*/ ,parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ ,_ruta,_concatfiledate,parent._operacion.ImagenesWhatsApp /*int*/ );
RDebugUtils.currentLine=1179829;
 //BA.debugLineNum = 1179829;BA.debugLine="Wait For(rs) complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "iniciarproceso"), _rs);
this.state = 140;
return;
case 140:
//C
this.state = 58;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=1179830;
 //BA.debugLineNum = 1179830;BA.debugLine="If result =True Then";
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
RDebugUtils.currentLine=1179831;
 //BA.debugLineNum = 1179831;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("51179831","Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE WHATSAPP] - Archivo: "+BA.ObjectToString(_archivo)+" -> Lo copio OK!",0);
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=1179833;
 //BA.debugLineNum = 1179833;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("51179833","Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE WHATSAPP] - Archivo: "+BA.ObjectToString(_archivo)+" -> Fallo!!!",0);
RDebugUtils.currentLine=1179836;
 //BA.debugLineNum = 1179836;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
_modificarnotificacion(parent._idnotificacion,"FOTOS","Falló la copia del archivo: "+BA.ObjectToString(_archivo)+" - Próxima ejecución: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
RDebugUtils.currentLine=1179837;
 //BA.debugLineNum = 1179837;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1179838;
 //BA.debugLineNum = 1179838;BA.debugLine="DatosGlobales.Segundos = 60";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
RDebugUtils.currentLine=1179844;
 //BA.debugLineNum = 1179844;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
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
RDebugUtils.currentLine=1179845;
 //BA.debugLineNum = 1179845;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=1179847;
 //BA.debugLineNum = 1179847;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179847","Primera vez: "+BA.ObjectToString(_primeravez),0);
RDebugUtils.currentLine=1179848;
 //BA.debugLineNum = 1179848;BA.debugLine="Return False";
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
RDebugUtils.currentLine=1179854;
 //BA.debugLineNum = 1179854;BA.debugLine="Log(\"#ERROR: salio por CATCH de [FOTOS DE";
anywheresoftware.b4a.keywords.Common.LogImpl("51179854","#ERROR: salio por CATCH de [FOTOS DE LA CAMARA] o [FOTOS DE WHATSAPP]"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
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
RDebugUtils.currentLine=1179858;
 //BA.debugLineNum = 1179858;BA.debugLine="Dim d As Long";
_d = 0L;
RDebugUtils.currentLine=1179859;
 //BA.debugLineNum = 1179859;BA.debugLine="d = File.LastModified(Ruta, Archivo)";
_d = anywheresoftware.b4a.keywords.Common.File.LastModified(_ruta,BA.ObjectToString(_archivo));
RDebugUtils.currentLine=1179861;
 //BA.debugLineNum = 1179861;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=1179862;
 //BA.debugLineNum = 1179862;BA.debugLine="Dim ConcatFileDate As String = Archivo & \";";
_concatfiledate = BA.ObjectToString(_archivo)+";"+anywheresoftware.b4a.keywords.Common.DateTime.Date(_d);
RDebugUtils.currentLine=1179864;
 //BA.debugLineNum = 1179864;BA.debugLine="Try";
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
RDebugUtils.currentLine=1179865;
 //BA.debugLineNum = 1179865;BA.debugLine="If OperacionActual = 1 Then 'MobilRutaFoto";
if (true) break;

case 77:
//if
this.state = 102;
if (_operacionactual==1) { 
this.state = 79;
}else 
{RDebugUtils.currentLine=1179889;
 //BA.debugLineNum = 1179889;BA.debugLine="Else If OperacionActual = 3 Then 'MobilRut";
if (_operacionactual==3) { 
this.state = 91;
}}
if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=1179866;
 //BA.debugLineNum = 1179866;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*String*/ ,parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ ,_ruta,_concatfiledate,parent._operacion.VideosCamara /*int*/ );
RDebugUtils.currentLine=1179867;
 //BA.debugLineNum = 1179867;BA.debugLine="Wait For(rs) complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "iniciarproceso"), _rs);
this.state = 141;
return;
case 141:
//C
this.state = 80;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=1179868;
 //BA.debugLineNum = 1179868;BA.debugLine="If result =True Then";
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
RDebugUtils.currentLine=1179869;
 //BA.debugLineNum = 1179869;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("51179869","Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE LA CAMARA] - Archivo: "+BA.ObjectToString(_archivo)+" -> Lo copio OK!",0);
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=1179871;
 //BA.debugLineNum = 1179871;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("51179871","Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE LA CAMARA] - Archivo: "+BA.ObjectToString(_archivo)+" -> Fallo!!!",0);
RDebugUtils.currentLine=1179874;
 //BA.debugLineNum = 1179874;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
_modificarnotificacion(parent._idnotificacion,"FOTOS","Falló la copia del archivo: "+BA.ObjectToString(_archivo)+" - Próxima ejecución: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
RDebugUtils.currentLine=1179875;
 //BA.debugLineNum = 1179875;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1179876;
 //BA.debugLineNum = 1179876;BA.debugLine="DatosGlobales.Segundos = 60";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
RDebugUtils.currentLine=1179877;
 //BA.debugLineNum = 1179877;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
RDebugUtils.currentLine=1179878;
 //BA.debugLineNum = 1179878;BA.debugLine="DatosGlobales.CopiaProgress = 0";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=1179879;
 //BA.debugLineNum = 1179879;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=1179880;
 //BA.debugLineNum = 1179880;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
parent.mostCurrent._datosglobales._copiaprogreso /*String*/  = "0";
RDebugUtils.currentLine=1179882;
 //BA.debugLineNum = 1179882;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
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
RDebugUtils.currentLine=1179883;
 //BA.debugLineNum = 1179883;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 88:
//C
this.state = 89;
;
RDebugUtils.currentLine=1179885;
 //BA.debugLineNum = 1179885;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179885","Primera vez: "+BA.ObjectToString(_primeravez),0);
RDebugUtils.currentLine=1179886;
 //BA.debugLineNum = 1179886;BA.debugLine="Return False";
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
RDebugUtils.currentLine=1179891;
 //BA.debugLineNum = 1179891;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*String*/ ,parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ ,_ruta,_concatfiledate,parent._operacion.VideosWhatsApp /*int*/ );
RDebugUtils.currentLine=1179892;
 //BA.debugLineNum = 1179892;BA.debugLine="Wait For(rs) complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "iniciarproceso"), _rs);
this.state = 142;
return;
case 142:
//C
this.state = 92;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=1179893;
 //BA.debugLineNum = 1179893;BA.debugLine="If result =True Then";
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
RDebugUtils.currentLine=1179894;
 //BA.debugLineNum = 1179894;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("51179894","Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE WHATSAPP] - Archivo: "+BA.ObjectToString(_archivo)+" -> Lo copio OK!",0);
 if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=1179896;
 //BA.debugLineNum = 1179896;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
anywheresoftware.b4a.keywords.Common.LogImpl("51179896","Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE WHATSAPP] - Archivo: "+BA.ObjectToString(_archivo)+" -> Fallo!!!",0);
RDebugUtils.currentLine=1179900;
 //BA.debugLineNum = 1179900;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
_modificarnotificacion(parent._idnotificacion,"FOTOS","Falló la copia del archivo: "+BA.ObjectToString(_archivo)+" - Próxima ejecución: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
RDebugUtils.currentLine=1179901;
 //BA.debugLineNum = 1179901;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1179902;
 //BA.debugLineNum = 1179902;BA.debugLine="DatosGlobales.Segundos = 60";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
RDebugUtils.currentLine=1179903;
 //BA.debugLineNum = 1179903;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
RDebugUtils.currentLine=1179904;
 //BA.debugLineNum = 1179904;BA.debugLine="DatosGlobales.CopiaProgress = 0";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=1179905;
 //BA.debugLineNum = 1179905;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=1179906;
 //BA.debugLineNum = 1179906;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
parent.mostCurrent._datosglobales._copiaprogreso /*String*/  = "0";
RDebugUtils.currentLine=1179908;
 //BA.debugLineNum = 1179908;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
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
RDebugUtils.currentLine=1179909;
 //BA.debugLineNum = 1179909;BA.debugLine="PrimeraVez= True";
_primeravez = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 100:
//C
this.state = 101;
;
RDebugUtils.currentLine=1179911;
 //BA.debugLineNum = 1179911;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
anywheresoftware.b4a.keywords.Common.LogImpl("51179911","Primera vez: "+BA.ObjectToString(_primeravez),0);
RDebugUtils.currentLine=1179912;
 //BA.debugLineNum = 1179912;BA.debugLine="Return False";
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
RDebugUtils.currentLine=1179919;
 //BA.debugLineNum = 1179919;BA.debugLine="Log(\"#ERROR: salio por CATCH de [VIDEOS DE";
anywheresoftware.b4a.keywords.Common.LogImpl("51179919","#ERROR: salio por CATCH de [VIDEOS DE LA CAMARA] o [FOTOS DE WHATSAPP] o [VIDEOS DE WHATSAPP]"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
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
RDebugUtils.currentLine=1179929;
 //BA.debugLineNum = 1179929;BA.debugLine="Log(\"#ERROR: salio por CATCH FX --> IniciarP";
anywheresoftware.b4a.keywords.Common.LogImpl("51179929","#ERROR: salio por CATCH FX --> IniciarProceso [DETRO DEL TERCER FOR] "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
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
RDebugUtils.currentLine=1179940;
 //BA.debugLineNum = 1179940;BA.debugLine="ToastMessageShow(\"#ERROR: \" & LastException &";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("#ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA))+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA))),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1179941;
 //BA.debugLineNum = 1179941;BA.debugLine="Log(LastException & CRLF & \"No paso la lista:";
anywheresoftware.b4a.keywords.Common.LogImpl("51179941",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA))+anywheresoftware.b4a.keywords.Common.CRLF+"No paso la lista: "+_tipo+" -> Por no tener datos",0);
RDebugUtils.currentLine=1179942;
 //BA.debugLineNum = 1179942;BA.debugLine="DatosGlobales.Ejecutandose = False";
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
RDebugUtils.currentLine=1179950;
 //BA.debugLineNum = 1179950;BA.debugLine="Log(\"Finalizo proceso - CantidadFallidas: \" & Ca";
anywheresoftware.b4a.keywords.Common.LogImpl("51179950","Finalizo proceso - CantidadFallidas: "+BA.NumberToString(parent._cantidadfallidas),0);
RDebugUtils.currentLine=1179953;
 //BA.debugLineNum = 1179953;BA.debugLine="If CantidadFallidas > 0 Then";
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
RDebugUtils.currentLine=1179954;
 //BA.debugLineNum = 1179954;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 119:
//C
this.state = 120;
RDebugUtils.currentLine=1179959;
 //BA.debugLineNum = 1179959;BA.debugLine="Resultado = True";
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
RDebugUtils.currentLine=1179971;
 //BA.debugLineNum = 1179971;BA.debugLine="If	FTP3.IsInitialized Then";
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
RDebugUtils.currentLine=1179972;
 //BA.debugLineNum = 1179972;BA.debugLine="FTP3.CloseNow";
parent._ftp3.CloseNow();
 if (true) break;
;
RDebugUtils.currentLine=1179975;
 //BA.debugLineNum = 1179975;BA.debugLine="If	FTP4.IsInitialized Then";

case 126:
//if
this.state = 129;
if (parent._ftp4.IsInitialized()) { 
this.state = 128;
}if (true) break;

case 128:
//C
this.state = 129;
RDebugUtils.currentLine=1179976;
 //BA.debugLineNum = 1179976;BA.debugLine="FTP4.CloseNow";
parent._ftp4.CloseNow();
 if (true) break;
;
RDebugUtils.currentLine=1179979;
 //BA.debugLineNum = 1179979;BA.debugLine="If	FTP_Consulta.IsInitialized Then";

case 129:
//if
this.state = 132;
if (parent._ftp_consulta.IsInitialized()) { 
this.state = 131;
}if (true) break;

case 131:
//C
this.state = 132;
RDebugUtils.currentLine=1179980;
 //BA.debugLineNum = 1179980;BA.debugLine="FTP_Consulta.CloseNow";
parent._ftp_consulta.CloseNow();
 if (true) break;

case 132:
//C
this.state = 133;
;
RDebugUtils.currentLine=1179984;
 //BA.debugLineNum = 1179984;BA.debugLine="CantEnCurso = 0";
parent._cantencurso = (int) (0);
RDebugUtils.currentLine=1179985;
 //BA.debugLineNum = 1179985;BA.debugLine="CantidadTotal = 0";
parent._cantidadtotal = (int) (0);
RDebugUtils.currentLine=1179988;
 //BA.debugLineNum = 1179988;BA.debugLine="Resultado = True";
_resultado = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1179991;
 //BA.debugLineNum = 1179991;BA.debugLine="Log(\"Finalizo proceso\")";
anywheresoftware.b4a.keywords.Common.LogImpl("51179991","Finalizo proceso",0);
 if (true) break;

case 133:
//C
this.state = -1;
;
RDebugUtils.currentLine=1180000;
 //BA.debugLineNum = 1180000;BA.debugLine="Log(\"Llego al --> DatosGlobales.Ejecutandose = Fa";
anywheresoftware.b4a.keywords.Common.LogImpl("51180000","Llego al --> DatosGlobales.Ejecutandose = False",0);
RDebugUtils.currentLine=1180001;
 //BA.debugLineNum = 1180001;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1180003;
 //BA.debugLineNum = 1180003;BA.debugLine="Return Resultado";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=1180005;
 //BA.debugLineNum = 1180005;BA.debugLine="End Sub";
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
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="DatosGlobales.EnPrincipal = False";
mostCurrent._datosglobales._enprincipal /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_ALWAYS;
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="CrearNotificacion(IdNotificacion, \"FOTOS\", \"Inici";
_crearnotificacion(_idnotificacion,"FOTOS","Iniciando...");
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="Service.StartForeground(IdNotificacion,noti)";
mostCurrent._service.StartForeground(_idnotificacion,(android.app.Notification)(_noti.getObject()));
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="CantEnCurso = 0";
_cantencurso = (int) (0);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="CantidadTotal = 0";
_cantidadtotal = (int) (0);
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="CantidadOk = 0";
_cantidadok = (int) (0);
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="CantidadFallidas = 0";
_cantidadfallidas = (int) (0);
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="DatosGlobales.CopiaProgress = 0";
mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
mostCurrent._datosglobales._copiaprogreso /*String*/  = "0";
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="DatosGlobales.Ejecutandose = False";
mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="Log(\"Salio por --> Service_Destroy\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5655375","Salio por --> Service_Destroy",0);
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="End Sub";
return "";
}
public static String  _service_error(String _error,int _code) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "service_error", false))
	 {return ((String) Debug.delegate(processBA, "service_error", new Object[] {_error,_code}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Service_Error (Error As String, Code As Int)";
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Log(\"=== SALIO POR --> Service_Error  ===\")";
anywheresoftware.b4a.keywords.Common.LogImpl("51703939","=== SALIO POR --> Service_Error  ===",0);
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Log(\"Error en el servicio: \" & Error)";
anywheresoftware.b4a.keywords.Common.LogImpl("51703941","Error en el servicio: "+_error,0);
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Log(\"Código de error: \" & Code)";
anywheresoftware.b4a.keywords.Common.LogImpl("51703942","Código de error: "+BA.NumberToString(_code),0);
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="End Sub";
return "";
}
public static void  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {Debug.delegate(processBA, "service_start", new Object[] {_startingintent}); return;}
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
RDebugUtils.currentModule="servbackup4";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Awake.KeepAlive(True)";
parent._awake.KeepAlive(processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Log(\"ServBackUp4: Service_Start --> Ejecutandose.";
anywheresoftware.b4a.keywords.Common.LogImpl("5589830","ServBackUp4: Service_Start --> Ejecutandose... cada: "+BA.NumberToString(parent.mostCurrent._datosglobales._segundos /*int*/ )+" segundos. Ejecutandose: "+BA.ObjectToString(parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="If DatosGlobales.Ejecutandose = True Then";
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
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Log(\"$$$ EJECUTANDOSE -> entonces sigue el --> S";
anywheresoftware.b4a.keywords.Common.LogImpl("5589834","$$$ EJECUTANDOSE -> entonces sigue el --> StartServiceAt... $$$",0);
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,servbackup4.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+parent.mostCurrent._datosglobales._segundos /*int*/ *anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Log(\"$$$ NO SE ESTA EJECUTANDO $$$\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5589838","$$$ NO SE ESTA EJECUTANDO $$$",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="Log(\"$$$ POST EJECUTANDOSE $$$\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5589841","$$$ POST EJECUTANDOSE $$$",0);
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="If DatosGlobales.LogOk Then";
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
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
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
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="If FTP3.IsInitialized = False Then";
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
RDebugUtils.currentLine=589852;
 //BA.debugLineNum = 589852;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp";
parent._ftp3.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="FTP3.PassiveMode = True";
parent._ftp3.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=589856;
 //BA.debugLineNum = 589856;BA.debugLine="If FTP4.IsInitialized = False Then";

case 16:
//if
this.state = 19;
if (parent._ftp4.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="FTP4.Initialize(\"FTP\",DatosGlobales.ServidorIp";
parent._ftp4.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="FTP4.PassiveMode = True";
parent._ftp4.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=589861;
 //BA.debugLineNum = 589861;BA.debugLine="If FTP_Consulta.IsInitialized = False Then";

case 19:
//if
this.state = 22;
if (parent._ftp_consulta.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=589862;
 //BA.debugLineNum = 589862;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Se";
parent._ftp_consulta.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="FTP_Consulta.PassiveMode = True";
parent._ftp_consulta.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=589866;
 //BA.debugLineNum = 589866;BA.debugLine="Log(\"Servicios ftp incializados: FTP3 -> \" & FT";
anywheresoftware.b4a.keywords.Common.LogImpl("5589866","Servicios ftp incializados: FTP3 -> "+BA.ObjectToString(parent._ftp3.IsInitialized())+" - FTP4 -> "+BA.ObjectToString(parent._ftp4.IsInitialized())+" - FTP_Consulta ->  "+BA.ObjectToString(parent._ftp_consulta.IsInitialized()),0);
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=589871;
 //BA.debugLineNum = 589871;BA.debugLine="Log(\"NO LOG\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5589871","NO LOG",0);
RDebugUtils.currentLine=589872;
 //BA.debugLineNum = 589872;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._login.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=589898;
 //BA.debugLineNum = 589898;BA.debugLine="Try";

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
RDebugUtils.currentLine=589899;
 //BA.debugLineNum = 589899;BA.debugLine="Log(\"ServBackUp4: PASO POR Service_Start y el pr";
anywheresoftware.b4a.keywords.Common.LogImpl("5589899","ServBackUp4: PASO POR Service_Start y el primer TRY",0);
RDebugUtils.currentLine=589901;
 //BA.debugLineNum = 589901;BA.debugLine="If DatosGlobales.EnPrincipal = False Then";
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
RDebugUtils.currentLine=589903;
 //BA.debugLineNum = 589903;BA.debugLine="If DatosGlobales.Configurando = False Then";
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
RDebugUtils.currentLine=589905;
 //BA.debugLineNum = 589905;BA.debugLine="Log(\"Ejecutandose: \" & DatosGlobales.Ejecutand";
anywheresoftware.b4a.keywords.Common.LogImpl("5589905","Ejecutandose: "+BA.ObjectToString(parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
RDebugUtils.currentLine=589910;
 //BA.debugLineNum = 589910;BA.debugLine="If EsPrimeraVez = True Then 'comentado 31/12/2";
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
RDebugUtils.currentLine=589913;
 //BA.debugLineNum = 589913;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._login.getObject()));
RDebugUtils.currentLine=589915;
 //BA.debugLineNum = 589915;BA.debugLine="If DatosGlobales.LogOk Then";
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
RDebugUtils.currentLine=589916;
 //BA.debugLineNum = 589916;BA.debugLine="EsPrimeraVez= False";
parent._esprimeravez = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=589918;
 //BA.debugLineNum = 589918;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
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
RDebugUtils.currentLine=589919;
 //BA.debugLineNum = 589919;BA.debugLine="Try";
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
RDebugUtils.currentLine=589921;
 //BA.debugLineNum = 589921;BA.debugLine="DatosGlobales.Ejecutandose = True '16/12/2";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=589923;
 //BA.debugLineNum = 589923;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServido";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*String*/ );
RDebugUtils.currentLine=589924;
 //BA.debugLineNum = 589924;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "service_start"), _rs);
this.state = 125;
return;
case 125:
//C
this.state = 47;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=589925;
 //BA.debugLineNum = 589925;BA.debugLine="If Result = True Then 'Se pudo conectar al";
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
RDebugUtils.currentLine=589935;
 //BA.debugLineNum = 589935;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
_modificarnotificacion(parent._idnotificacion,"Fotos","Copia en curso... ");
RDebugUtils.currentLine=589937;
 //BA.debugLineNum = 589937;BA.debugLine="Dim rs As ResumableSub = IniciarProceso";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _iniciarproceso(parent.mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=589939;
 //BA.debugLineNum = 589939;BA.debugLine="Wait For(rs) complete (Result As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "service_start"), _rs);
this.state = 126;
return;
case 126:
//C
this.state = 50;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=589942;
 //BA.debugLineNum = 589942;BA.debugLine="If Result = True Then";
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
RDebugUtils.currentLine=589944;
 //BA.debugLineNum = 589944;BA.debugLine="Log(\"### FINALIZO BIEN!!! (FULL BACKUP";
anywheresoftware.b4a.keywords.Common.LogImpl("5589944","### FINALIZO BIEN!!! (FULL BACKUP) --> ENTONCES EJECUTO LA FX --> FinalizarProceso",0);
RDebugUtils.currentLine=589947;
 //BA.debugLineNum = 589947;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
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
RDebugUtils.currentLine=589948;
 //BA.debugLineNum = 589948;BA.debugLine="FinalizarProceso";
_finalizarproceso();
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=589950;
 //BA.debugLineNum = 589950;BA.debugLine="CantEnCurso = 0";
parent._cantencurso = (int) (0);
RDebugUtils.currentLine=589951;
 //BA.debugLineNum = 589951;BA.debugLine="CantidadTotal = 0";
parent._cantidadtotal = (int) (0);
RDebugUtils.currentLine=589952;
 //BA.debugLineNum = 589952;BA.debugLine="CantidadOk = 0";
parent._cantidadok = (int) (0);
RDebugUtils.currentLine=589953;
 //BA.debugLineNum = 589953;BA.debugLine="CantidadFallidas = 0";
parent._cantidadfallidas = (int) (0);
RDebugUtils.currentLine=589954;
 //BA.debugLineNum = 589954;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
RDebugUtils.currentLine=589955;
 //BA.debugLineNum = 589955;BA.debugLine="DatosGlobales.CopiaProgress = 0";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=589956;
 //BA.debugLineNum = 589956;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=589957;
 //BA.debugLineNum = 589957;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
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
RDebugUtils.currentLine=589962;
 //BA.debugLineNum = 589962;BA.debugLine="Log(\"### NOOO FINALIZO BIEN!!! (FULL B";
anywheresoftware.b4a.keywords.Common.LogImpl("5589962","### NOOO FINALIZO BIEN!!! (FULL BACKUP)",0);
RDebugUtils.currentLine=589963;
 //BA.debugLineNum = 589963;BA.debugLine="DatosGlobales.Segundos = 60  '3600s =";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
RDebugUtils.currentLine=589965;
 //BA.debugLineNum = 589965;BA.debugLine="Log(\"Poner en Notificacion: próxima ej";
anywheresoftware.b4a.keywords.Common.LogImpl("5589965","Poner en Notificacion: próxima ejecucion: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA),0);
 if (true) break;

case 61:
//C
this.state = 64;
;
RDebugUtils.currentLine=589969;
 //BA.debugLineNum = 589969;BA.debugLine="Log(\"Paso por aca 'Activity_Resume' ->";
anywheresoftware.b4a.keywords.Common.LogImpl("5589969","Paso por aca 'Activity_Resume' -> Post 'IniciarProceso'",0);
RDebugUtils.currentLine=589974;
 //BA.debugLineNum = 589974;BA.debugLine="Log(\"Poner en Notificacion: próxima ejecu";
anywheresoftware.b4a.keywords.Common.LogImpl("5589974","Poner en Notificacion: próxima ejecucion: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA),0);
 if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=589977;
 //BA.debugLineNum = 589977;BA.debugLine="Log(\"No se encuentra en el Wifi presetead";
anywheresoftware.b4a.keywords.Common.LogImpl("5589977","No se encuentra en el Wifi preseteado",0);
RDebugUtils.currentLine=589978;
 //BA.debugLineNum = 589978;BA.debugLine="ModificarNotificacion(IdNotificacion,\"Fot";
_modificarnotificacion(parent._idnotificacion,"Fotos","No se encuentra en el Wifi preseteado");
RDebugUtils.currentLine=589979;
 //BA.debugLineNum = 589979;BA.debugLine="DatosGlobales.Ejecutandose = False";
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
RDebugUtils.currentLine=589983;
 //BA.debugLineNum = 589983;BA.debugLine="DatosGlobales.Segundos = 360  '3600s = 1hs";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (360);
RDebugUtils.currentLine=589984;
 //BA.debugLineNum = 589984;BA.debugLine="Log(\"Paso por Catch 1 de Service_Start ->";
anywheresoftware.b4a.keywords.Common.LogImpl("5589984","Paso por Catch 1 de Service_Start -> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=589985;
 //BA.debugLineNum = 589985;BA.debugLine="DatosGlobales.Ejecutandose = False";
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
RDebugUtils.currentLine=589988;
 //BA.debugLineNum = 589988;BA.debugLine="Log(\"No se puede ejecutar BKP porque una co";
anywheresoftware.b4a.keywords.Common.LogImpl("5589988","No se puede ejecutar BKP porque una copia esta en curso...",0);
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
RDebugUtils.currentLine=589998;
 //BA.debugLineNum = 589998;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
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
RDebugUtils.currentLine=590000;
 //BA.debugLineNum = 590000;BA.debugLine="Try";
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
RDebugUtils.currentLine=590001;
 //BA.debugLineNum = 590001;BA.debugLine="DatosGlobales.Ejecutandose = True '16/12/20";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=590003;
 //BA.debugLineNum = 590003;BA.debugLine="Log(\"Ejecutandose NO por primera vez...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5590003","Ejecutandose NO por primera vez...",0);
RDebugUtils.currentLine=590005;
 //BA.debugLineNum = 590005;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServidor";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*String*/ );
RDebugUtils.currentLine=590006;
 //BA.debugLineNum = 590006;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "service_start"), _rs);
this.state = 127;
return;
case 127:
//C
this.state = 80;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=590007;
 //BA.debugLineNum = 590007;BA.debugLine="If Result = True Then 'Se pudo conectar al";
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
RDebugUtils.currentLine=590017;
 //BA.debugLineNum = 590017;BA.debugLine="Dim rs As ResumableSub = IniciarProceso(Da";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _iniciarproceso(parent.mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=590018;
 //BA.debugLineNum = 590018;BA.debugLine="Wait For(rs) complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "service_start"), _rs);
this.state = 128;
return;
case 128:
//C
this.state = 83;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=590021;
 //BA.debugLineNum = 590021;BA.debugLine="If Result = True Then";
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
RDebugUtils.currentLine=590022;
 //BA.debugLineNum = 590022;BA.debugLine="Log(\"### FINALIZO BIEN!!! (BACKUP DIARIO)";
anywheresoftware.b4a.keywords.Common.LogImpl("5590022","### FINALIZO BIEN!!! (BACKUP DIARIO) --> ENTONCES EJECUTO LA FX --> FinalizarProceso",0);
RDebugUtils.currentLine=590027;
 //BA.debugLineNum = 590027;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
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
RDebugUtils.currentLine=590028;
 //BA.debugLineNum = 590028;BA.debugLine="FinalizarProceso";
_finalizarproceso();
 if (true) break;

case 90:
//C
this.state = 91;
RDebugUtils.currentLine=590030;
 //BA.debugLineNum = 590030;BA.debugLine="CantEnCurso = 0";
parent._cantencurso = (int) (0);
RDebugUtils.currentLine=590031;
 //BA.debugLineNum = 590031;BA.debugLine="CantidadTotal = 0";
parent._cantidadtotal = (int) (0);
RDebugUtils.currentLine=590032;
 //BA.debugLineNum = 590032;BA.debugLine="CantidadOk = 0";
parent._cantidadok = (int) (0);
RDebugUtils.currentLine=590033;
 //BA.debugLineNum = 590033;BA.debugLine="CantidadFallidas = 0";
parent._cantidadfallidas = (int) (0);
RDebugUtils.currentLine=590034;
 //BA.debugLineNum = 590034;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
RDebugUtils.currentLine=590035;
 //BA.debugLineNum = 590035;BA.debugLine="DatosGlobales.CopiaProgress = 0";
parent.mostCurrent._datosglobales._copiaprogress /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=590036;
 //BA.debugLineNum = 590036;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
parent.mostCurrent._datosglobales._copiacantencurso /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=590037;
 //BA.debugLineNum = 590037;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
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
RDebugUtils.currentLine=590041;
 //BA.debugLineNum = 590041;BA.debugLine="Log(\"### NOOO FINALIZO BIEN!!! (BACKUP DI";
anywheresoftware.b4a.keywords.Common.LogImpl("5590041","### NOOO FINALIZO BIEN!!! (BACKUP DIARIO)",0);
RDebugUtils.currentLine=590042;
 //BA.debugLineNum = 590042;BA.debugLine="DatosGlobales.Segundos = 60  '3600s = 1hs";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (60);
RDebugUtils.currentLine=590043;
 //BA.debugLineNum = 590043;BA.debugLine="Log(\"Poner en Notificacion: próxima ejecu";
anywheresoftware.b4a.keywords.Common.LogImpl("5590043","Poner en Notificacion: próxima ejecucion: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA),0);
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
RDebugUtils.currentLine=590057;
 //BA.debugLineNum = 590057;BA.debugLine="DatosGlobales.Segundos = 360  '3600s = 1hs";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (360);
RDebugUtils.currentLine=590058;
 //BA.debugLineNum = 590058;BA.debugLine="Log(\"Paso por Catch 2 de Service_Start -> \"";
anywheresoftware.b4a.keywords.Common.LogImpl("5590058","Paso por Catch 2 de Service_Start -> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=590059;
 //BA.debugLineNum = 590059;BA.debugLine="DatosGlobales.Ejecutandose = False";
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
RDebugUtils.currentLine=590062;
 //BA.debugLineNum = 590062;BA.debugLine="Log(\"No se puede ejecutar BKP porque una cop";
anywheresoftware.b4a.keywords.Common.LogImpl("5590062","No se puede ejecutar BKP porque una copia esta en curso...",0);
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
RDebugUtils.currentLine=590069;
 //BA.debugLineNum = 590069;BA.debugLine="Log(\"Estado al finalizar de 'Ejecutandose': \"";
anywheresoftware.b4a.keywords.Common.LogImpl("5590069","Estado al finalizar de 'Ejecutandose': "+BA.ObjectToString(parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
 if (true) break;
;
RDebugUtils.currentLine=590075;
 //BA.debugLineNum = 590075;BA.debugLine="If DatosGlobales.Ejecutandose = True Then";

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
RDebugUtils.currentLine=590080;
 //BA.debugLineNum = 590080;BA.debugLine="If DatosGlobales.CopiaPorcentEnCurso = \"100%\"";
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
RDebugUtils.currentLine=590089;
 //BA.debugLineNum = 590089;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
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
RDebugUtils.currentLine=590090;
 //BA.debugLineNum = 590090;BA.debugLine="DatosGlobales.Segundos = 3600";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (3600);
 if (true) break;

case 117:
//C
this.state = 118;
RDebugUtils.currentLine=590092;
 //BA.debugLineNum = 590092;BA.debugLine="DatosGlobales.Segundos = 360";
parent.mostCurrent._datosglobales._segundos /*int*/  = (int) (360);
 if (true) break;

case 118:
//C
this.state = 119;
;
RDebugUtils.currentLine=590097;
 //BA.debugLineNum = 590097;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fotos\"";
_modificarnotificacion(parent._idnotificacion,"Fotos","Esperando para hacer copia de seguridad a las: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA));
RDebugUtils.currentLine=590098;
 //BA.debugLineNum = 590098;BA.debugLine="Log(\"Esperando para hacer copia de seguridad";
anywheresoftware.b4a.keywords.Common.LogImpl("5590098","Esperando para hacer copia de seguridad a las: "+parent.mostCurrent._fxglobales._obtenerhoraproximaejecucion /*String*/ (processBA),0);
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
RDebugUtils.currentLine=590106;
 //BA.debugLineNum = 590106;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,servbackup4.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+parent.mostCurrent._datosglobales._segundos /*int*/ *anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 123:
//C
this.state = 124;
this.catchState = 0;
RDebugUtils.currentLine=590110;
 //BA.debugLineNum = 590110;BA.debugLine="Log(\"#ERROR: en Service_Start --> \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("5590110","#ERROR: en Service_Start --> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 124:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=590114;
 //BA.debugLineNum = 590114;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _validarcnxservidor(String _unaruta) throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "validarcnxservidor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "validarcnxservidor", new Object[] {_unaruta}));}
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
RDebugUtils.currentModule="servbackup4";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Log(\"### Inicia validacion de conexion al servido";
anywheresoftware.b4a.keywords.Common.LogImpl("5917506","### Inicia validacion de conexion al servidor ### - "+_unaruta,0);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="FtpTest.Initialize(\"FTP\",DatosGlobales.ServidorIp";
parent._ftptest.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="FtpTest.PassiveMode = True";
parent._ftptest.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Dim Resu As Boolean = False";
_resu = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="FtpTest.List(unaRuta)";
parent._ftptest.List(processBA,_unaruta);
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup4", "validarcnxservidor"), null);
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
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Dim TotalCarpetas As Int = Folders.Length";
_totalcarpetas = _folders.length;
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Log(\"Cantidad de carpetas leidas: \" & TotalCarpet";
anywheresoftware.b4a.keywords.Common.LogImpl("5917517","Cantidad de carpetas leidas: "+BA.NumberToString(_totalcarpetas)+" ---> "+BA.ObjectToString(_success)+" - "+_serverpath,0);
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="If Success = True  Then";
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
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="If FTP3.IsInitialized = False Then";
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
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
parent._ftp3.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="FTP3.PassiveMode = True";
parent._ftp3.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="If FTP4.IsInitialized = False Then";

case 9:
//if
this.state = 12;
if (parent._ftp4.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="FTP4.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
parent._ftp4.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="FTP4.PassiveMode = True";
parent._ftp4.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="If FTP_Consulta.IsInitialized = False Then";

case 12:
//if
this.state = 15;
if (parent._ftp_consulta.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Ser";
parent._ftp_consulta.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=917534;
 //BA.debugLineNum = 917534;BA.debugLine="FTP_Consulta.PassiveMode = True";
parent._ftp_consulta.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
RDebugUtils.currentLine=917539;
 //BA.debugLineNum = 917539;BA.debugLine="If	FtpTest.IsInitialized Then";

case 16:
//if
this.state = 19;
if (parent._ftptest.IsInitialized()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="FtpTest.CloseNow";
parent._ftptest.CloseNow();
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="Log(\"### Fin de validacion de conexion al servido";
anywheresoftware.b4a.keywords.Common.LogImpl("5917543","### Fin de validacion de conexion al servidor ###",0);
RDebugUtils.currentLine=917545;
 //BA.debugLineNum = 917545;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
RDebugUtils.currentLine=917546;
 //BA.debugLineNum = 917546;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="servbackup4";
if (Debug.shouldDelegate(processBA, "service_taskremoved", false))
	 {return ((String) Debug.delegate(processBA, "service_taskremoved", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Log(\"=== SALIO POR --> Service_TaskRemoved  ===\")";
anywheresoftware.b4a.keywords.Common.LogImpl("51638404","=== SALIO POR --> Service_TaskRemoved  ===",0);
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="End Sub";
return "";
}
}