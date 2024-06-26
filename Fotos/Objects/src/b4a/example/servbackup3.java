package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class servbackup3 extends android.app.Service{
	public static class servbackup3_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (servbackup3) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, servbackup3.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, BA.class);
		}

	}
    static servbackup3 mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return servbackup3.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "b4a.example", "b4a.example.servbackup3");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.servbackup3", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (servbackup3) Create ***");
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
                    BA.LogInfo("** Service (servbackup3) Create **");
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
    	BA.LogInfo("** Service (servbackup3) Start **");
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
            BA.LogInfo("** Service (servbackup3) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (servbackup3) Destroy **");
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
public static boolean _esprimeravez = false;
public static boolean _esprimeravezvueltas = false;
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
public b4a.example.servbackup2 _servbackup2 = null;
public b4a.example.starter _starter = null;
public static String  _crearnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Private Sub CrearNotificacion(UnIdNotificacion As";
 //BA.debugLineNum = 200;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
 //BA.debugLineNum = 202;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
 //BA.debugLineNum = 203;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 204;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 205;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 206;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
 //BA.debugLineNum = 207;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public static String  _ejecutarprograma() throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Public Sub EjecutarPrograma";
 //BA.debugLineNum = 182;BA.debugLine="Log(\"Se ejecuto el programa!!!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67274498","Se ejecuto el programa!!!",0);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public static String  _eliminarnotificacion(int _unidnotificacion) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Private Sub EliminarNotificacion(UnIdNotificacion";
 //BA.debugLineNum = 222;BA.debugLine="noti.Cancel(UnIdNotificacion)";
_noti.Cancel(_unidnotificacion);
 //BA.debugLineNum = 223;BA.debugLine="StopService(Me)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,servbackup3.getObject());
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return "";
}
public static String  _modificarnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Private Sub ModificarNotificacion(UnIdNotificacion";
 //BA.debugLineNum = 211;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
 //BA.debugLineNum = 213;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
 //BA.debugLineNum = 214;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 215;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 216;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 217;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
 //BA.debugLineNum = 218;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim noti As Notification";
_noti = new anywheresoftware.b4a.objects.NotificationWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim EsPrimeraVez As Boolean = True";
_esprimeravez = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 20;BA.debugLine="Dim EsPrimeraVezVueltas As Boolean = True";
_esprimeravezvueltas = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 23;BA.debugLine="Dim IdNotificacion As Int = 1 ' Identificador úni";
_idnotificacion = (int) (1);
 //BA.debugLineNum = 24;BA.debugLine="Dim Contador As Int = 0";
_contador = (int) (0);
 //BA.debugLineNum = 31;BA.debugLine="Dim FtpTest As FTP";
_ftptest = new anywheresoftware.b4a.net.FTPWrapper();
 //BA.debugLineNum = 32;BA.debugLine="FtpTest.PassiveMode = True";
_ftptest.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 38;BA.debugLine="Log(\"ServBackUp3: PASO POR Service_Create\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67077890","ServBackUp3: PASO POR Service_Create",0);
 //BA.debugLineNum = 40;BA.debugLine="DatosGlobales.EnPrincipal = False";
mostCurrent._datosglobales._enprincipal /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 41;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_NEVER;
 //BA.debugLineNum = 43;BA.debugLine="CrearNotificacion(IdNotificacion, \"Mensaje del si";
_crearnotificacion(_idnotificacion,"Mensaje del sistema","En espera...");
 //BA.debugLineNum = 44;BA.debugLine="Service.StartForeground(IdNotificacion,noti)";
mostCurrent._service.StartForeground(_idnotificacion,(android.app.Notification)(_noti.getObject()));
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 175;BA.debugLine="Log(\"ServBackUp3: PASO POR Service_Destroy\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67208962","ServBackUp3: PASO POR Service_Destroy",0);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public static void  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
ResumableSub_Service_Start rsub = new ResumableSub_Service_Start(null,_startingintent);
rsub.resume(processBA, null);
}
public static class ResumableSub_Service_Start extends BA.ResumableSub {
public ResumableSub_Service_Start(b4a.example.servbackup3 parent,anywheresoftware.b4a.objects.IntentWrapper _startingintent) {
this.parent = parent;
this._startingintent = _startingintent;
}
b4a.example.servbackup3 parent;
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
 //BA.debugLineNum = 55;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 67;
this.catchState = 66;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 66;
 //BA.debugLineNum = 56;BA.debugLine="Log(\"ServBackUp3: PASO POR Service_Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67143427","ServBackUp3: PASO POR Service_Start",0);
 //BA.debugLineNum = 58;BA.debugLine="If DatosGlobales.EnPrincipal = False Then";
if (true) break;

case 4:
//if
this.state = 64;
if (parent.mostCurrent._datosglobales._enprincipal /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 60;BA.debugLine="If DatosGlobales.Configurando = False Then";
if (true) break;

case 7:
//if
this.state = 52;
if (parent.mostCurrent._datosglobales._configurando /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 62;BA.debugLine="Log(\"Ejecutandose: \" & DatosGlobales.Ejecutand";
anywheresoftware.b4a.keywords.Common.LogImpl("67143433","Ejecutandose: "+BA.ObjectToString(parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
 //BA.debugLineNum = 65;BA.debugLine="If EsPrimeraVez = True Then";
if (true) break;

case 10:
//if
this.state = 51;
if (parent._esprimeravez==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 12;
}else {
this.state = 34;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 67;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._login.getObject()));
 //BA.debugLineNum = 69;BA.debugLine="If DatosGlobales.LogOk Then";
if (true) break;

case 13:
//if
this.state = 32;
if (parent.mostCurrent._datosglobales._logok /*boolean*/ ) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 70;BA.debugLine="EsPrimeraVez= False";
parent._esprimeravez = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 71;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (true) break;

case 16:
//if
this.state = 31;
if (parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 18;
}else {
this.state = 30;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 72;BA.debugLine="Try";
if (true) break;

case 19:
//try
this.state = 28;
this.catchState = 27;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 27;
 //BA.debugLineNum = 74;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServido";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*String*/ );
 //BA.debugLineNum = 75;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 68;
return;
case 68:
//C
this.state = 22;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 76;BA.debugLine="If Result = True Then 'Se pudo conectar al";
if (true) break;

case 22:
//if
this.state = 25;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 77;BA.debugLine="Service.StopAutomaticForeground 'Call thi";
parent.mostCurrent._service.StopAutomaticForeground();
 //BA.debugLineNum = 80;BA.debugLine="StartActivity(Backup)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._backup.getObject()));
 //BA.debugLineNum = 81;BA.debugLine="Log(\"Paso por aca 'Activity_Resume'\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67143452","Paso por aca 'Activity_Resume'",0);
 //BA.debugLineNum = 83;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fo";
_modificarnotificacion(parent._idnotificacion,"Fotos","Copia en progreso... "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ );
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 66;
 //BA.debugLineNum = 92;BA.debugLine="Log(\"Paso por Catch 1 de Service_Start ->";
anywheresoftware.b4a.keywords.Common.LogImpl("67143463","Paso por Catch 1 de Service_Start -> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 //BA.debugLineNum = 93;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;

case 28:
//C
this.state = 31;
this.catchState = 66;
;
 if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 96;BA.debugLine="Log(\"No se puede ejecutar BKP porque una co";
anywheresoftware.b4a.keywords.Common.LogImpl("67143467","No se puede ejecutar BKP porque una copia esta en curso...",0);
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 51;
;
 if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 103;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (true) break;

case 35:
//if
this.state = 50;
if (parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 37;
}else {
this.state = 49;
}if (true) break;

case 37:
//C
this.state = 38;
 //BA.debugLineNum = 105;BA.debugLine="Try";
if (true) break;

case 38:
//try
this.state = 47;
this.catchState = 46;
this.state = 40;
if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 46;
 //BA.debugLineNum = 106;BA.debugLine="Log(\"Ejecutandose NO por primera vez...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("67143477","Ejecutandose NO por primera vez...",0);
 //BA.debugLineNum = 108;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServidor";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*String*/ );
 //BA.debugLineNum = 109;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 69;
return;
case 69:
//C
this.state = 41;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 110;BA.debugLine="If Result = True Then 'Se pudo conectar al";
if (true) break;

case 41:
//if
this.state = 44;
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 //BA.debugLineNum = 111;BA.debugLine="Service.StopAutomaticForeground 'Call this";
parent.mostCurrent._service.StopAutomaticForeground();
 //BA.debugLineNum = 114;BA.debugLine="StartActivity(Backup)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._backup.getObject()));
 //BA.debugLineNum = 116;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fot";
_modificarnotificacion(parent._idnotificacion,"Fotos","Copia en progreso... "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ );
 if (true) break;

case 44:
//C
this.state = 47;
;
 if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 66;
 //BA.debugLineNum = 125;BA.debugLine="Log(\"Paso por Catch 2 de Service_Start -> \"";
anywheresoftware.b4a.keywords.Common.LogImpl("67143496","Paso por Catch 2 de Service_Start -> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 //BA.debugLineNum = 126;BA.debugLine="DatosGlobales.Ejecutandose = False";
parent.mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;

case 47:
//C
this.state = 50;
this.catchState = 66;
;
 if (true) break;

case 49:
//C
this.state = 50;
 //BA.debugLineNum = 129;BA.debugLine="Log(\"No se puede ejecutar BKP porque una cop";
anywheresoftware.b4a.keywords.Common.LogImpl("67143500","No se puede ejecutar BKP porque una copia esta en curso...",0);
 if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;

case 51:
//C
this.state = 52;
;
 //BA.debugLineNum = 136;BA.debugLine="Log(\"Estado al finalizar de 'Ejecutandose': \"";
anywheresoftware.b4a.keywords.Common.LogImpl("67143507","Estado al finalizar de 'Ejecutandose': "+BA.ObjectToString(parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
 if (true) break;
;
 //BA.debugLineNum = 141;BA.debugLine="If DatosGlobales.Ejecutandose = True Then";

case 52:
//if
this.state = 63;
if (parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 54;
}else {
this.state = 56;
}if (true) break;

case 54:
//C
this.state = 63;
 //BA.debugLineNum = 143;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fotos\",";
_modificarnotificacion(parent._idnotificacion,"Fotos","Copia en progreso... "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ );
 if (true) break;

case 56:
//C
this.state = 57;
 //BA.debugLineNum = 145;BA.debugLine="If DatosGlobales.CopiaPorcentEnCurso = \"100%\"";
if (true) break;

case 57:
//if
this.state = 62;
if ((parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ ).equals("100%")) { 
this.state = 59;
}else {
this.state = 61;
}if (true) break;

case 59:
//C
this.state = 62;
 //BA.debugLineNum = 146;BA.debugLine="Log(\"Esperando para hacer copia de seguridad.";
anywheresoftware.b4a.keywords.Common.LogImpl("67143517","Esperando para hacer copia de seguridad...",0);
 //BA.debugLineNum = 148;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
 if (true) break;

case 61:
//C
this.state = 62;
 //BA.debugLineNum = 150;BA.debugLine="Log(\"Esperando para hacer copia de seguridad.";
anywheresoftware.b4a.keywords.Common.LogImpl("67143521","Esperando para hacer copia de seguridad...",0);
 //BA.debugLineNum = 151;BA.debugLine="CrearNotificacion(IdNotificacion, \"Fotos\",\"Es";
_crearnotificacion(parent._idnotificacion,"Fotos","Esperando para hacer copia de seguridad...");
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;

case 63:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 67;
;
 //BA.debugLineNum = 158;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,servbackup3.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+parent.mostCurrent._datosglobales._segundos /*int*/ *anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 66:
//C
this.state = 67;
this.catchState = 0;
 //BA.debugLineNum = 165;BA.debugLine="Log(\"#ERROR: en Service_Start --> \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("67143536","#ERROR: en Service_Start --> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 67:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
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
public static void  _complete(boolean _result) throws Exception{
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _validarcnxservidor(String _unaruta) throws Exception{
ResumableSub_ValidarCnxServidor rsub = new ResumableSub_ValidarCnxServidor(null,_unaruta);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ValidarCnxServidor extends BA.ResumableSub {
public ResumableSub_ValidarCnxServidor(b4a.example.servbackup3 parent,String _unaruta) {
this.parent = parent;
this._unaruta = _unaruta;
}
b4a.example.servbackup3 parent;
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
 //BA.debugLineNum = 235;BA.debugLine="Log(\"### Inicia validacion de conexion al servido";
anywheresoftware.b4a.keywords.Common.LogImpl("67536642","### Inicia validacion de conexion al servidor ### - "+_unaruta,0);
 //BA.debugLineNum = 237;BA.debugLine="FtpTest.Initialize(\"FTP\",DatosGlobales.ServidorIp";
parent._ftptest.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 238;BA.debugLine="FtpTest.PassiveMode = True";
parent._ftptest.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 240;BA.debugLine="Dim Resu As Boolean = False";
_resu = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 242;BA.debugLine="FtpTest.List(unaRuta)";
parent._ftptest.List(processBA,_unaruta);
 //BA.debugLineNum = 243;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
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
 //BA.debugLineNum = 244;BA.debugLine="Dim TotalCarpetas As Int = Folders.Length";
_totalcarpetas = _folders.length;
 //BA.debugLineNum = 246;BA.debugLine="Log(\"Cantidad de carpetas leidas: \" & TotalCarpet";
anywheresoftware.b4a.keywords.Common.LogImpl("67536653","Cantidad de carpetas leidas: "+BA.NumberToString(_totalcarpetas)+" ---> "+BA.ObjectToString(_success),0);
 //BA.debugLineNum = 248;BA.debugLine="If Success = True  Then";
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
 //BA.debugLineNum = 249;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 253;BA.debugLine="Log(\"### Fin de validacion de conexion al servido";
anywheresoftware.b4a.keywords.Common.LogImpl("67536660","### Fin de validacion de conexion al servidor ###",0);
 //BA.debugLineNum = 255;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _ftp_listcompleted(String _serverpath,boolean _success,anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders,anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files) throws Exception{
}
}
