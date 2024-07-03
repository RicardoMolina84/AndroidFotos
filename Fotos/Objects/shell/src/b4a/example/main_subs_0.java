package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 47;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._principal.getObject())));
 BA.debugLineNum = 48;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 52;BA.debugLine="Log(\"MAIN: PASO POR Activity_Create\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5131081",RemoteObject.createImmutable("MAIN: PASO POR Activity_Create"),0);
 BA.debugLineNum = 54;BA.debugLine="Activity.Color = Colors.Transparent";
Debug.ShouldStop(2097152);
main.mostCurrent._activity.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 55;BA.debugLine="DatosGlobales.Configurando = False";
Debug.ShouldStop(4194304);
main.mostCurrent._datosglobales._configurando /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 56;BA.debugLine="DatosGlobales.ForzarEjecucion = False";
Debug.ShouldStop(8388608);
main.mostCurrent._datosglobales._forzarejecucion /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 61;BA.debugLine="StartActivity(Login)";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._login.getObject())));
 BA.debugLineNum = 63;BA.debugLine="If DatosGlobales.LogOk = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",main.mostCurrent._datosglobales._logok /*RemoteObject*/ ,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 64;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 67;BA.debugLine="StartService(ServBackUp4)";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("StartService",main.processBA,(Object)((main.mostCurrent._servbackup4.getObject())));
 BA.debugLineNum = 69;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
main.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 73;BA.debugLine="StartActivity(Login)";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._login.getObject())));
 };
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,102);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="Log(\"MAIN: PASO POR Activity_Pause\")";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5262146",RemoteObject.createImmutable("MAIN: PASO POR Activity_Pause"),0);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,79);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 79;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="Log(\"MAIN: PASO POR Activity_Resume donde volvi a";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5196610",RemoteObject.createImmutable("MAIN: PASO POR Activity_Resume donde volvi a poner un nuevo ejecutar"),0);
 BA.debugLineNum = 83;BA.debugLine="If DatosGlobales.LogOk = True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main.mostCurrent._datosglobales._logok /*RemoteObject*/ ,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 85;BA.debugLine="If DatosGlobales.Ejecutandose = False Then 'le c";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 87;BA.debugLine="StartService(ServBackUp4)";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("StartService",main.processBA,(Object)((main.mostCurrent._servbackup4.getObject())));
 BA.debugLineNum = 89;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runVoidMethod ("Finish");
 };
 }else {
 BA.debugLineNum = 96;BA.debugLine="StartActivity(Login)";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._login.getObject())));
 };
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconfiguracion_click() throws Exception{
try {
		Debug.PushSubsStack("BtnConfiguracion_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,122);
if (RapidSub.canDelegate("btnconfiguracion_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnconfiguracion_click");}
 BA.debugLineNum = 122;BA.debugLine="Private Sub BtnConfiguracion_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="StartActivity(Configuracion)";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._configuracion.getObject())));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 37;BA.debugLine="Private Prueba_Button1 As Button";
main.mostCurrent._prueba_button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private BtnConfiguracion As Button";
main.mostCurrent._btnconfiguracion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
servbackup4_subs_0._process_globals();
principal_subs_0._process_globals();
datosglobales_subs_0._process_globals();
fxglobales_subs_0._process_globals();
login_subs_0._process_globals();
configuracion_subs_0._process_globals();
servbackup3_subs_0._process_globals();
servbackup2_subs_0._process_globals();
backup_subs_0._process_globals();
servbackup_subs_0._process_globals();
starter_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
servbackup4.myClass = BA.getDeviceClass ("b4a.example.servbackup4");
principal.myClass = BA.getDeviceClass ("b4a.example.principal");
datosglobales.myClass = BA.getDeviceClass ("b4a.example.datosglobales");
fxglobales.myClass = BA.getDeviceClass ("b4a.example.fxglobales");
login.myClass = BA.getDeviceClass ("b4a.example.login");
configuracion.myClass = BA.getDeviceClass ("b4a.example.configuracion");
servbackup3.myClass = BA.getDeviceClass ("b4a.example.servbackup3");
servbackup2.myClass = BA.getDeviceClass ("b4a.example.servbackup2");
backup.myClass = BA.getDeviceClass ("b4a.example.backup");
servbackup.myClass = BA.getDeviceClass ("b4a.example.servbackup");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.httpjob");
map2xml.myClass = BA.getDeviceClass ("b4a.example.map2xml");
xml2map.myClass = BA.getDeviceClass ("b4a.example.xml2map");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _prueba_button1_click() throws Exception{
try {
		Debug.PushSubsStack("Prueba_Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,116);
if (RapidSub.canDelegate("prueba_button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","prueba_button1_click");}
 BA.debugLineNum = 116;BA.debugLine="Private Sub Prueba_Button1_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 118;BA.debugLine="StartActivity(Backup)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._backup.getObject())));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}