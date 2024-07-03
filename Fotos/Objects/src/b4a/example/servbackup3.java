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
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
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
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.example", "b4a.example.servbackup3");
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
	}
public anywheresoftware.b4a.keywords.Common __c = null;
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
public b4a.example.servbackup2 _servbackup2 = null;
public b4a.example.backup _backup = null;
public b4a.example.servbackup _servbackup = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public static String  _crearnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
RDebugUtils.currentModule="servbackup3";
if (Debug.shouldDelegate(processBA, "crearnotificacion", false))
	 {return ((String) Debug.delegate(processBA, "crearnotificacion", new Object[] {_unidnotificacion,_titulo,_mensaje}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub CrearNotificacion(UnIdNotificacion As";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
RDebugUtils.currentLine=5767177;
 //BA.debugLineNum = 5767177;BA.debugLine="End Sub";
return "";
}
public static String  _ejecutarprograma() throws Exception{
RDebugUtils.currentModule="servbackup3";
if (Debug.shouldDelegate(processBA, "ejecutarprograma", false))
	 {return ((String) Debug.delegate(processBA, "ejecutarprograma", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub EjecutarPrograma";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Log(\"Se ejecuto el programa!!!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("55701634","Se ejecuto el programa!!!",0);
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="End Sub";
return "";
}
public static String  _eliminarnotificacion(int _unidnotificacion) throws Exception{
RDebugUtils.currentModule="servbackup3";
if (Debug.shouldDelegate(processBA, "eliminarnotificacion", false))
	 {return ((String) Debug.delegate(processBA, "eliminarnotificacion", new Object[] {_unidnotificacion}));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub EliminarNotificacion(UnIdNotificacion";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="noti.Cancel(UnIdNotificacion)";
_noti.Cancel(_unidnotificacion);
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="StopService(Me)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,servbackup3.getObject());
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="End Sub";
return "";
}
public static String  _modificarnotificacion(int _unidnotificacion,String _titulo,String _mensaje) throws Exception{
RDebugUtils.currentModule="servbackup3";
if (Debug.shouldDelegate(processBA, "modificarnotificacion", false))
	 {return ((String) Debug.delegate(processBA, "modificarnotificacion", new Object[] {_unidnotificacion,_titulo,_mensaje}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub ModificarNotificacion(UnIdNotificacion";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
_noti.Initialize2(_noti.IMPORTANCE_LOW);
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="noti.Icon = \"icon\"";
_noti.setIcon("icon");
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="noti.Vibrate = False";
_noti.setVibrate(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="noti.Sound = False";
_noti.setSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="noti.Light = False";
_noti.setLight(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
_noti.SetInfoNew(processBA,BA.ObjectToCharSequence(_titulo),BA.ObjectToCharSequence(_mensaje),(Object)(mostCurrent._principal.getObject()));
RDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="noti.Notify(UnIdNotificacion)";
_noti.Notify(_unidnotificacion);
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="servbackup3";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Log(\"ServBackUp3: PASO POR Service_Create\")";
anywheresoftware.b4a.keywords.Common.LogImpl("55505026","ServBackUp3: PASO POR Service_Create",0);
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="DatosGlobales.EnPrincipal = False";
mostCurrent._datosglobales._enprincipal /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
mostCurrent._service.AutomaticForegroundMode = mostCurrent._service.AUTOMATIC_FOREGROUND_NEVER;
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="CrearNotificacion(IdNotificacion, \"Mensaje del si";
_crearnotificacion(_idnotificacion,"Mensaje del sistema","En espera...");
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Service.StartForeground(IdNotificacion,noti)";
mostCurrent._service.StartForeground(_idnotificacion,(android.app.Notification)(_noti.getObject()));
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="servbackup3";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Log(\"ServBackUp3: PASO POR Service_Destroy\")";
anywheresoftware.b4a.keywords.Common.LogImpl("55636098","ServBackUp3: PASO POR Service_Destroy",0);
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="End Sub";
return "";
}
public static void  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="servbackup3";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {Debug.delegate(processBA, "service_start", new Object[] {_startingintent}); return;}
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
RDebugUtils.currentModule="servbackup3";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Try";
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
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Log(\"ServBackUp3: PASO POR Service_Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("55570563","ServBackUp3: PASO POR Service_Start",0);
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="If DatosGlobales.EnPrincipal = False Then";
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
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="If DatosGlobales.Configurando = False Then";
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
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="Log(\"Ejecutandose: \" & DatosGlobales.Ejecutand";
anywheresoftware.b4a.keywords.Common.LogImpl("55570569","Ejecutandose: "+BA.ObjectToString(parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="If EsPrimeraVez = True Then";
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
RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._login.getObject()));
RDebugUtils.currentLine=5570576;
 //BA.debugLineNum = 5570576;BA.debugLine="If DatosGlobales.LogOk Then";
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
RDebugUtils.currentLine=5570577;
 //BA.debugLineNum = 5570577;BA.debugLine="EsPrimeraVez= False";
parent._esprimeravez = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=5570578;
 //BA.debugLineNum = 5570578;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
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
RDebugUtils.currentLine=5570579;
 //BA.debugLineNum = 5570579;BA.debugLine="Try";
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
RDebugUtils.currentLine=5570581;
 //BA.debugLineNum = 5570581;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServido";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*String*/ );
RDebugUtils.currentLine=5570582;
 //BA.debugLineNum = 5570582;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup3", "service_start"), _rs);
this.state = 68;
return;
case 68:
//C
this.state = 22;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=5570583;
 //BA.debugLineNum = 5570583;BA.debugLine="If Result = True Then 'Se pudo conectar al";
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
RDebugUtils.currentLine=5570584;
 //BA.debugLineNum = 5570584;BA.debugLine="Service.StopAutomaticForeground 'Call thi";
parent.mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=5570587;
 //BA.debugLineNum = 5570587;BA.debugLine="StartActivity(Backup)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._backup.getObject()));
RDebugUtils.currentLine=5570588;
 //BA.debugLineNum = 5570588;BA.debugLine="Log(\"Paso por aca 'Activity_Resume'\")";
anywheresoftware.b4a.keywords.Common.LogImpl("55570588","Paso por aca 'Activity_Resume'",0);
RDebugUtils.currentLine=5570590;
 //BA.debugLineNum = 5570590;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fo";
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
RDebugUtils.currentLine=5570599;
 //BA.debugLineNum = 5570599;BA.debugLine="Log(\"Paso por Catch 1 de Service_Start ->";
anywheresoftware.b4a.keywords.Common.LogImpl("55570599","Paso por Catch 1 de Service_Start -> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=5570600;
 //BA.debugLineNum = 5570600;BA.debugLine="DatosGlobales.Ejecutandose = False";
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
RDebugUtils.currentLine=5570603;
 //BA.debugLineNum = 5570603;BA.debugLine="Log(\"No se puede ejecutar BKP porque una co";
anywheresoftware.b4a.keywords.Common.LogImpl("55570603","No se puede ejecutar BKP porque una copia esta en curso...",0);
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
RDebugUtils.currentLine=5570610;
 //BA.debugLineNum = 5570610;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
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
RDebugUtils.currentLine=5570612;
 //BA.debugLineNum = 5570612;BA.debugLine="Try";
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
RDebugUtils.currentLine=5570613;
 //BA.debugLineNum = 5570613;BA.debugLine="Log(\"Ejecutandose NO por primera vez...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("55570613","Ejecutandose NO por primera vez...",0);
RDebugUtils.currentLine=5570615;
 //BA.debugLineNum = 5570615;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServidor";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*String*/ );
RDebugUtils.currentLine=5570616;
 //BA.debugLineNum = 5570616;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup3", "service_start"), _rs);
this.state = 69;
return;
case 69:
//C
this.state = 41;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=5570617;
 //BA.debugLineNum = 5570617;BA.debugLine="If Result = True Then 'Se pudo conectar al";
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
RDebugUtils.currentLine=5570618;
 //BA.debugLineNum = 5570618;BA.debugLine="Service.StopAutomaticForeground 'Call this";
parent.mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=5570621;
 //BA.debugLineNum = 5570621;BA.debugLine="StartActivity(Backup)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._backup.getObject()));
RDebugUtils.currentLine=5570623;
 //BA.debugLineNum = 5570623;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fot";
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
RDebugUtils.currentLine=5570632;
 //BA.debugLineNum = 5570632;BA.debugLine="Log(\"Paso por Catch 2 de Service_Start -> \"";
anywheresoftware.b4a.keywords.Common.LogImpl("55570632","Paso por Catch 2 de Service_Start -> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=5570633;
 //BA.debugLineNum = 5570633;BA.debugLine="DatosGlobales.Ejecutandose = False";
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
RDebugUtils.currentLine=5570636;
 //BA.debugLineNum = 5570636;BA.debugLine="Log(\"No se puede ejecutar BKP porque una cop";
anywheresoftware.b4a.keywords.Common.LogImpl("55570636","No se puede ejecutar BKP porque una copia esta en curso...",0);
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
RDebugUtils.currentLine=5570643;
 //BA.debugLineNum = 5570643;BA.debugLine="Log(\"Estado al finalizar de 'Ejecutandose': \"";
anywheresoftware.b4a.keywords.Common.LogImpl("55570643","Estado al finalizar de 'Ejecutandose': "+BA.ObjectToString(parent.mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
 if (true) break;
;
RDebugUtils.currentLine=5570648;
 //BA.debugLineNum = 5570648;BA.debugLine="If DatosGlobales.Ejecutandose = True Then";

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
RDebugUtils.currentLine=5570650;
 //BA.debugLineNum = 5570650;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fotos\",";
_modificarnotificacion(parent._idnotificacion,"Fotos","Copia en progreso... "+parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/ );
 if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=5570652;
 //BA.debugLineNum = 5570652;BA.debugLine="If DatosGlobales.CopiaPorcentEnCurso = \"100%\"";
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
RDebugUtils.currentLine=5570653;
 //BA.debugLineNum = 5570653;BA.debugLine="Log(\"Esperando para hacer copia de seguridad.";
anywheresoftware.b4a.keywords.Common.LogImpl("55570653","Esperando para hacer copia de seguridad...",0);
RDebugUtils.currentLine=5570655;
 //BA.debugLineNum = 5570655;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
parent.mostCurrent._datosglobales._copiaporcentencurso /*String*/  = "0%";
 if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=5570657;
 //BA.debugLineNum = 5570657;BA.debugLine="Log(\"Esperando para hacer copia de seguridad.";
anywheresoftware.b4a.keywords.Common.LogImpl("55570657","Esperando para hacer copia de seguridad...",0);
RDebugUtils.currentLine=5570658;
 //BA.debugLineNum = 5570658;BA.debugLine="CrearNotificacion(IdNotificacion, \"Fotos\",\"Es";
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
RDebugUtils.currentLine=5570665;
 //BA.debugLineNum = 5570665;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,servbackup3.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+parent.mostCurrent._datosglobales._segundos /*int*/ *anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 66:
//C
this.state = 67;
this.catchState = 0;
RDebugUtils.currentLine=5570672;
 //BA.debugLineNum = 5570672;BA.debugLine="Log(\"#ERROR: en Service_Start --> \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("55570672","#ERROR: en Service_Start --> "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 if (true) break;
if (true) break;

case 67:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=5570678;
 //BA.debugLineNum = 5570678;BA.debugLine="End Sub";
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
RDebugUtils.currentModule="servbackup3";
if (Debug.shouldDelegate(processBA, "validarcnxservidor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(processBA, "validarcnxservidor", new Object[] {_unaruta}));}
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
RDebugUtils.currentModule="servbackup3";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Log(\"### Inicia validacion de conexion al servido";
anywheresoftware.b4a.keywords.Common.LogImpl("55963778","### Inicia validacion de conexion al servidor ### - "+_unaruta,0);
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="FtpTest.Initialize(\"FTP\",DatosGlobales.ServidorIp";
parent._ftptest.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="FtpTest.PassiveMode = True";
parent._ftptest.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="Dim Resu As Boolean = False";
_resu = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=5963785;
 //BA.debugLineNum = 5963785;BA.debugLine="FtpTest.List(unaRuta)";
parent._ftptest.List(processBA,_unaruta);
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "servbackup3", "validarcnxservidor"), null);
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
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="Dim TotalCarpetas As Int = Folders.Length";
_totalcarpetas = _folders.length;
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="Log(\"Cantidad de carpetas leidas: \" & TotalCarpet";
anywheresoftware.b4a.keywords.Common.LogImpl("55963789","Cantidad de carpetas leidas: "+BA.NumberToString(_totalcarpetas)+" ---> "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=5963791;
 //BA.debugLineNum = 5963791;BA.debugLine="If Success = True  Then";
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
RDebugUtils.currentLine=5963792;
 //BA.debugLineNum = 5963792;BA.debugLine="Resu = True";
_resu = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=5963796;
 //BA.debugLineNum = 5963796;BA.debugLine="Log(\"### Fin de validacion de conexion al servido";
anywheresoftware.b4a.keywords.Common.LogImpl("55963796","### Fin de validacion de conexion al servidor ###",0);
RDebugUtils.currentLine=5963798;
 //BA.debugLineNum = 5963798;BA.debugLine="Return Resu";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resu));return;};
RDebugUtils.currentLine=5963799;
 //BA.debugLineNum = 5963799;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}