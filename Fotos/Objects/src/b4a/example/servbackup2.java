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
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, BA.class);
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
		    processBA = new BA(this, null, null, "b4a.example", "b4a.example.servbackup2");
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
	}public anywheresoftware.b4a.keywords.Common __c = null;
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
public b4a.example.backup _backup = null;
public b4a.example.servbackup _servbackup = null;
public b4a.example.servbackup3 _servbackup3 = null;
public b4a.example.starter _starter = null;
public static String  _crearnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Private Sub CrearNotificacion(UnIdNotificacion As";
 //BA.debugLineNum = 127;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
 //BA.debugLineNum = 129;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
 //BA.debugLineNum = 130;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 131;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 132;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 133;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
 //BA.debugLineNum = 134;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _eliminarnotificacion(int _unidnotificacion) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Private Sub EliminarNotificacion(UnIdNotificacion";
 //BA.debugLineNum = 149;BA.debugLine="noti.Cancel(UnIdNotificacion)";
_noti.Cancel(_unidnotificacion);
 //BA.debugLineNum = 150;BA.debugLine="StopService(Me)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,servbackup2.getObject());
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public static String  _modificarnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Private Sub ModificarNotificacion(UnIdNotificacion";
 //BA.debugLineNum = 138;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
 //BA.debugLineNum = 140;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
 //BA.debugLineNum = 141;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 142;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 143;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 144;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
 //BA.debugLineNum = 145;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Dim noti As Notification";
_noti = new anywheresoftware.b4a.objects.NotificationWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim IdNotificacion As Int = 1 ' Identificador úni";
_idnotificacion = (int) (1);
 //BA.debugLineNum = 17;BA.debugLine="Dim Contador As Int = 0";
_contador = (int) (0);
 //BA.debugLineNum = 23;BA.debugLine="Dim FtpTest As FTP";
_ftptest = new anywheresoftware.b4a.net.FTPWrapper();
 //BA.debugLineNum = 24;BA.debugLine="FtpTest.PassiveMode = True";
_ftptest.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 30;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_NEVER;
 //BA.debugLineNum = 32;BA.debugLine="Log(\"Cantidad: \" & Contador)";
anywheresoftware.b4a.keywords.Common.LogImpl("66553604","Cantidad: "+BA.NumberToString(_contador),0);
 //BA.debugLineNum = 33;BA.debugLine="CrearNotificacion(IdNotificacion, \"Mensaje del si";
_crearnotificacion(_idnotificacion,"Mensaje del sistema","Cantidad: "+BA.NumberToString(_contador));
 //BA.debugLineNum = 35;BA.debugLine="Service.StartForeground(IdNotificacion,noti)";
mostCurrent._service.StartForeground(_idnotificacion,(android.app.Notification)(_noti.getObject()));
 //BA.debugLineNum = 50;BA.debugLine="Log(\"Llego hasta aca?\")";
anywheresoftware.b4a.keywords.Common.LogImpl("66553622","Llego hasta aca?",0);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static void  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 57;BA.debugLine="If DatosGlobales.LogOk = True Then";
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
 //BA.debugLineNum = 59;BA.debugLine="FtpTest.Initialize(\"FTP\",DatosGlobales.ServidorI";
parent._ftptest.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 60;BA.debugLine="FtpTest.PassiveMode = True";
parent._ftptest.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 62;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServidor(Dato";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*String*/ );
 //BA.debugLineNum = 63;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 22;
return;
case 22:
//C
this.state = 4;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 64;BA.debugLine="If Result = True Then 'Se pudo conectar al servi";
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
 //BA.debugLineNum = 65;BA.debugLine="Log(\"Pudo conectar al server ok\")";
anywheresoftware.b4a.keywords.Common.LogImpl("66619147","Pudo conectar al server ok",0);
 //BA.debugLineNum = 68;BA.debugLine="Service.StopAutomaticForeground 'Call this when";
parent.mostCurrent._service.StopAutomaticForeground();
 //BA.debugLineNum = 70;BA.debugLine="Contador = Contador + 1";
parent._contador = (int) (parent._contador+1);
 //BA.debugLineNum = 78;BA.debugLine="Log(\"Cantidad: \" & Contador)";
anywheresoftware.b4a.keywords.Common.LogImpl("66619160","Cantidad: "+BA.NumberToString(parent._contador),0);
 //BA.debugLineNum = 80;BA.debugLine="If Contador <= 5 Then";
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
 //BA.debugLineNum = 81;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Mensaje";
_modificarnotificacion(parent._idnotificacion,"Mensaje del sistema","Cantidad: "+BA.NumberToString(parent._contador));
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 84;BA.debugLine="EliminarNotificacion(IdNotificacion)";
_eliminarnotificacion(parent._idnotificacion);
 if (true) break;
;
 //BA.debugLineNum = 87;BA.debugLine="If Contador = 10 Then";

case 12:
//if
this.state = 15;
if (parent._contador==10) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 88;BA.debugLine="Log(\"LLego a diez!!!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("66619170","LLego a diez!!!",0);
 //BA.debugLineNum = 89;BA.debugLine="Contador = 0";
parent._contador = (int) (0);
 //BA.debugLineNum = 90;BA.debugLine="EliminarNotificacion(IdNotificacion)";
_eliminarnotificacion(parent._idnotificacion);
 //BA.debugLineNum = 91;BA.debugLine="StopService(Me)";
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
 //BA.debugLineNum = 96;BA.debugLine="Log(\"No se pudo conectar al server!!!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("66619178","No se pudo conectar al server!!!",0);
 //BA.debugLineNum = 99;BA.debugLine="EliminarNotificacion(IdNotificacion)";
_eliminarnotificacion(parent._idnotificacion);
 //BA.debugLineNum = 100;BA.debugLine="StopService(Me)";
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
 //BA.debugLineNum = 107;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._login.getObject()));
 if (true) break;

case 21:
//C
this.state = -1;
;
 //BA.debugLineNum = 111;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.S";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,servbackup2.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+parent.mostCurrent._datosglobales._segundos /*int*/ *anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(boolean _result) throws Exception{
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _validarcnxservidor(String _unaruta) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 220;BA.debugLine="Dim Resu As Boolean = False";
_resu = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 222;BA.debugLine="FtpTest.List(unaRuta)";
parent._ftptest.List(processBA,_unaruta);
 //BA.debugLineNum = 223;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, this, null);
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
 //BA.debugLineNum = 224;BA.debugLine="Dim TotalCarpetas As Int = Folders.Length";
_totalcarpetas = _folders.length;
 //BA.debugLineNum = 226;BA.debugLine="Log(\"Cantidad de carpetas leidas: \" & TotalCarpet";
anywheresoftware.b4a.keywords.Common.LogImpl("66946823","Cantidad de carpetas leidas: "+BA.NumberToString(_totalcarpetas)+" ---> "+BA.ObjectToString(_success),0);
 //BA.debugLineNum = 228;BA.debugLine="If Success = True  Then";
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
 //BA.debugLineNum = 229;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 232;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _ftp_listcompleted(String _serverpath,boolean _success,anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders,anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files) throws Exception{
}
}
