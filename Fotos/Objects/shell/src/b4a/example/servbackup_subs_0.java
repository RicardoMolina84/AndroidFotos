package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class servbackup_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (servbackup) ","servbackup",10,servbackup.processBA,servbackup.mostCurrent,35);
if (RapidSub.canDelegate("service_create")) { return b4a.example.servbackup.remoteMe.runUserSub(false, "servbackup","service_create");}
 BA.debugLineNum = 35;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="DatosGlobales.EnPrincipal = False";
Debug.ShouldStop(8);
servbackup.mostCurrent._datosglobales._enprincipal /*RemoteObject*/  = servbackup.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 37;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
Debug.ShouldStop(16);
servbackup.mostCurrent._service.setField ("AutomaticForegroundMode",servbackup.mostCurrent._service.getField(true,"AUTOMATIC_FOREGROUND_NEVER"));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}