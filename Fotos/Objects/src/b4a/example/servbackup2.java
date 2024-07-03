package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class servbackup2 extends android.app.Service{
	public static class servbackup2_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (servbackup2) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, servbackup2.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static servbackup2 mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return servbackup2.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.example", "b4a.example.servbackup2");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.servbackup2", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (servbackup2) Create ***");
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
                    BA.LogInfo("** Service (servbackup2) Create **");
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
    	BA.LogInfo("** Service (servbackup2) Start **");
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
            BA.LogInfo("** Service (servbackup2) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (servbackup2) Destroy **");
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
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.NotificationWrapper _noti = null;
public static int _idnotificacion = 0;
public static int _contador = 0;
public static anywheresoftware.b4a.net.FTPWrapper _ftptest = null;
public b4a.example.main _main = null;
public b4a.example.servbackup4 _servbackup4 = null;
public b4a.example.principal _principal = null;
public b4a.example.datosglobales _datosglobales = null;
public b4a.example.fxglobales _fxglobales = null;
public b4a.example.login _login = null;
public b4a.example.configuracion _configuracion = null;
public b4a.example.servbackup3 _servbackup3 = null;
public b4a.example.backup _backup = null;
public b4a.example.servbackup _servbackup = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public static String  _crearnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
RDebugUtils.currentModule="servbackup2";
if (Debug.shouldDelegate(processBA, "crearnotificacion", false))
	 {return ((String) Debug.delegate(processBA, "crearnotificacion", new Object[] {_unidnotificacion,_titulo,_mensaje}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub CrearNotificacion(UnIdNotificacion As";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="End Sub";
return "";
}
public static String  _eliminarnotificacion(int _unidnotificacion) throws Exception{
RDebugUtils.currentModule="servbackup2";
if (Debug.shouldDelegate(processBA, "eliminarnotificacion", false))
	 {return ((String) Debug.delegate(processBA, "eliminarnotificacion", new Object[] {_unidnotificacion}));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub EliminarNotificacion(UnIdNotificacion";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="noti.Cancel(UnIdNotificacion)";
_noti.Cancel(_unidnotificacion);
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="StopService(Me)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,servbackup2.getObject());
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="End Sub";
return "";
}
public static String  _modificarnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
RDebugUtils.currentModule="servbackup2";
if (Debug.shouldDelegate(processBA, "modificarnotificacion", false))
	 {return ((String) Debug.delegate(processBA, "modificarnotificacion", new Object[] {_unidnotificacion,_titulo,_mensaje}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub ModificarNotificacion(UnIdNotificacion";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="servbackup2";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_NEVER;
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Log(\"Cantidad: \" & Contador)";
anywheresoftware.b4a.keywords.Common.LogImpl("56094852","Cantidad: "+BA.NumberToString(_contador),0);
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="CrearNotificacion(IdNotificacion, \"Mensaje del si";
_crearnotificacion(_idnotificacion,"Mensaje del sistema","Cantidad: "+BA.NumberToString(_contador));
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="Service.StartForeground(IdNotificacion,noti)";
mostCurrent._service.StartForeground(_idnotificacion,(android.app.Notification)(_noti.getObject()));
RDebugUtils.currentLine=6094870;
 //BA.debugLineNum = 6094870;BA.debugLine="Log(\"Llego hasta aca?\")";
anywheresoftware.b4a.keywords.Common.LogImpl("56094870","Llego hasta aca?",0);
RDebugUtils.currentLine=6094872;
 //BA.debugLineNum = 6094872;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="servbackup2";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="End Sub";
return "";
}
public static void  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="servbackup2";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {Debug.delegate(processBA, "service_start", new Object[] {_startingintent}); return;}
ResumableSub_Service_Start rsub = new ResumableSub_Service_Start(null,_startingintent);
rsub.resume(processBA, null);
}
public static class ResumableSub_Service_Start extends BA.ResumableSub {
public ResumableSub_Service_Start(b4a.example.servbackup2 parent,anywheresoftware.b4a.objects.IntentWrapper _startingintent) {
this.parent = parent;
this._startingintent = _startingintent;
}
b4a.example.servbackup2 parent;
anywheresoftware.b4a.objects.IntentWrapper _startingintent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="servbackup2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="If DatosGlobales.LogOk = True Then";
if (true) break;

case 1:
//if
this.state = 21;
if (parent.mostCurrent._datosglobales._logok /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}else {
this.state = 20;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="FtpTest.Initialize(\"FTP\",DatosGlobales.ServidorI";
parent._ftptest.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="FtpTest.PassiveMode = True";
parent._ftptest.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServidor(Dato";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*String*/ );
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup2", "service_start"), _rs);
this.state = 22;
return;
case 22:
//C
this.state = 4;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="If Result = True Then 'Se pudo conectar al servi";
if (true) break;

case 4:
//if
this.state = 18;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 6;
}else {
this.state = 17;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="Log(\"Pudo conectar al server ok\")";
anywheresoftware.b4a.keywords.Common.LogImpl("56160395","Pudo conectar al server ok",0);
RDebugUtils.currentLine=6160398;
 //BA.debugLineNum = 6160398;BA.debugLine="Service.StopAutomaticForeground 'Call this when";
parent.mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=6160400;
 //BA.debugLineNum = 6160400;BA.debugLine="Contador = Contador + 1";
parent._contador = (int) (parent._contador+1);
RDebugUtils.currentLine=6160408;
 //BA.debugLineNum = 6160408;BA.debugLine="Log(\"Cantidad: \" & Contador)";
anywheresoftware.b4a.keywords.Common.LogImpl("56160408","Cantidad: "+BA.NumberToString(parent._contador),0);
RDebugUtils.currentLine=6160410;
 //BA.debugLineNum = 6160410;BA.debugLine="If Contador <= 5 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._contador<=5) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=6160411;
 //BA.debugLineNum = 6160411;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Mensaje";
_modificarnotificacion(parent._idnotificacion,"Mensaje del sistema","Cantidad: "+BA.NumberToString(parent._contador));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=6160414;
 //BA.debugLineNum = 6160414;BA.debugLine="EliminarNotificacion(IdNotificacion)";
_eliminarnotificacion(parent._idnotificacion);
 if (true) break;
;
RDebugUtils.currentLine=6160417;
 //BA.debugLineNum = 6160417;BA.debugLine="If Contador = 10 Then";

case 12:
//if
this.state = 15;
if (parent._contador==10) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=6160418;
 //BA.debugLineNum = 6160418;BA.debugLine="Log(\"LLego a diez!!!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("56160418","LLego a diez!!!",0);
RDebugUtils.currentLine=6160419;
 //BA.debugLineNum = 6160419;BA.debugLine="Contador = 0";
parent._contador = (int) (0);
RDebugUtils.currentLine=6160420;
 //BA.debugLineNum = 6160420;BA.debugLine="EliminarNotificacion(IdNotificacion)";
_eliminarnotificacion(parent._idnotificacion);
RDebugUtils.currentLine=6160421;
 //BA.debugLineNum = 6160421;BA.debugLine="StopService(Me)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,servbackup2.getObject());
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=6160426;
 //BA.debugLineNum = 6160426;BA.debugLine="Log(\"No se pudo conectar al server!!!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("56160426","No se pudo conectar al server!!!",0);
RDebugUtils.currentLine=6160429;
 //BA.debugLineNum = 6160429;BA.debugLine="EliminarNotificacion(IdNotificacion)";
_eliminarnotificacion(parent._idnotificacion);
RDebugUtils.currentLine=6160430;
 //BA.debugLineNum = 6160430;BA.debugLine="StopService(Me)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,servbackup2.getObject());
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=6160437;
 //BA.debugLineNum = 6160437;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._login.getObject()));
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=6160441;
 //BA.debugLineNum = 6160441;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.S";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,servbackup2.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+parent.mostCurrent._datosglobales._segundos /*int*/ *anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6160443;
 //BA.debugLineNum = 6160443;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _validarcnxservidor(String _unaruta) throws Exception{
RDebugUtils.currentModule="servbackup2";
if (Debug.shouldDelegate(processBA, "validarcnxservidor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "validarcnxservidor", new Object[] {_unaruta}));}
ResumableSub_ValidarCnxServidor rsub = new ResumableSub_ValidarCnxServidor(null,_unaruta);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ValidarCnxServidor extends BA.ResumableSub {
public ResumableSub_ValidarCnxServidor(b4a.example.servbackup2 parent,String _unaruta) {
this.parent = parent;
this._unaruta = _unaruta;
}
b4a.example.servbackup2 parent;
String _unaruta;
boolean _resu = false;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _totalcarpetas = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="servbackup2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim Resu As Boolean = False";
_resu = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="FtpTest.List(unaRuta)";
parent._ftptest.List(processBA,_unaruta);
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup2", "validarcnxservidor"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="Dim TotalCarpetas As Int = Folders.Length";
_totalcarpetas = _folders.length;
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="Log(\"Cantidad de carpetas leidas: \" & TotalCarpet";
anywheresoftware.b4a.keywords.Common.LogImpl("56488071","Cantidad de carpetas leidas: "+BA.NumberToString(_totalcarpetas)+" ---> "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="If Success = True  Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=6488077;
 //BA.debugLineNum = 6488077;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}