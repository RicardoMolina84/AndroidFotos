package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class servbackup2_subs_0 {


public static RemoteObject  _crearnotificacion(RemoteObject _unidnotificacion,RemoteObject _titulo,RemoteObject _mensaje) throws Exception{
try {
		Debug.PushSubsStack("CrearNotificacion (servbackup2) ","servbackup2",8,servbackup2.processBA,servbackup2.mostCurrent,126);
if (RapidSub.canDelegate("crearnotificacion")) { return b4a.example.servbackup2.remoteMe.runUserSub(false, "servbackup2","crearnotificacion", _unidnotificacion, _titulo, _mensaje);}
Debug.locals.put("UnIdNotificacion", _unidnotificacion);
Debug.locals.put("Titulo", _titulo);
Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 126;BA.debugLine="Private Sub CrearNotificacion(UnIdNotificacion As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
Debug.ShouldStop(1073741824);
servbackup2._noti.runVoidMethod ("Initialize2",(Object)(servbackup2._noti.getField(true,"IMPORTANCE_LOW")));
 BA.debugLineNum = 129;BA.debugLine="noti.Icon = \"icon\"";
Debug.ShouldStop(1);
servbackup2._noti.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 130;BA.debugLine="noti.Vibrate = False";
Debug.ShouldStop(2);
servbackup2._noti.runVoidMethod ("setVibrate",servbackup2.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 131;BA.debugLine="noti.Sound = False";
Debug.ShouldStop(4);
servbackup2._noti.runVoidMethod ("setSound",servbackup2.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 132;BA.debugLine="noti.Light = False";
Debug.ShouldStop(8);
servbackup2._noti.runVoidMethod ("setLight",servbackup2.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 133;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
Debug.ShouldStop(16);
servbackup2._noti.runVoidMethod ("SetInfoNew",servbackup2.processBA,(Object)(BA.ObjectToCharSequence(_titulo)),(Object)(BA.ObjectToCharSequence(_mensaje)),(Object)((servbackup2.mostCurrent._principal.getObject())));
 BA.debugLineNum = 134;BA.debugLine="noti.Notify(UnIdNotificacion)";
Debug.ShouldStop(32);
servbackup2._noti.runVoidMethod ("Notify",(Object)(_unidnotificacion));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eliminarnotificacion(RemoteObject _unidnotificacion) throws Exception{
try {
		Debug.PushSubsStack("EliminarNotificacion (servbackup2) ","servbackup2",8,servbackup2.processBA,servbackup2.mostCurrent,148);
if (RapidSub.canDelegate("eliminarnotificacion")) { return b4a.example.servbackup2.remoteMe.runUserSub(false, "servbackup2","eliminarnotificacion", _unidnotificacion);}
Debug.locals.put("UnIdNotificacion", _unidnotificacion);
 BA.debugLineNum = 148;BA.debugLine="Private Sub EliminarNotificacion(UnIdNotificacion";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="noti.Cancel(UnIdNotificacion)";
Debug.ShouldStop(1048576);
servbackup2._noti.runVoidMethod ("Cancel",(Object)(_unidnotificacion));
 BA.debugLineNum = 150;BA.debugLine="StopService(Me)";
Debug.ShouldStop(2097152);
servbackup2.mostCurrent.__c.runVoidMethod ("StopService",servbackup2.processBA,(Object)(servbackup2.getObject()));
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _modificarnotificacion(RemoteObject _unidnotificacion,RemoteObject _titulo,RemoteObject _mensaje) throws Exception{
try {
		Debug.PushSubsStack("ModificarNotificacion (servbackup2) ","servbackup2",8,servbackup2.processBA,servbackup2.mostCurrent,137);
if (RapidSub.canDelegate("modificarnotificacion")) { return b4a.example.servbackup2.remoteMe.runUserSub(false, "servbackup2","modificarnotificacion", _unidnotificacion, _titulo, _mensaje);}
Debug.locals.put("UnIdNotificacion", _unidnotificacion);
Debug.locals.put("Titulo", _titulo);
Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 137;BA.debugLine="Private Sub ModificarNotificacion(UnIdNotificacion";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
Debug.ShouldStop(512);
servbackup2._noti.runVoidMethod ("Initialize2",(Object)(servbackup2._noti.getField(true,"IMPORTANCE_LOW")));
 BA.debugLineNum = 140;BA.debugLine="noti.Icon = \"icon\"";
Debug.ShouldStop(2048);
servbackup2._noti.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 141;BA.debugLine="noti.Vibrate = False";
Debug.ShouldStop(4096);
servbackup2._noti.runVoidMethod ("setVibrate",servbackup2.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 142;BA.debugLine="noti.Sound = False";
Debug.ShouldStop(8192);
servbackup2._noti.runVoidMethod ("setSound",servbackup2.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 143;BA.debugLine="noti.Light = False";
Debug.ShouldStop(16384);
servbackup2._noti.runVoidMethod ("setLight",servbackup2.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 144;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
Debug.ShouldStop(32768);
servbackup2._noti.runVoidMethod ("SetInfoNew",servbackup2.processBA,(Object)(BA.ObjectToCharSequence(_titulo)),(Object)(BA.ObjectToCharSequence(_mensaje)),(Object)((servbackup2.mostCurrent._principal.getObject())));
 BA.debugLineNum = 145;BA.debugLine="noti.Notify(UnIdNotificacion)";
Debug.ShouldStop(65536);
servbackup2._noti.runVoidMethod ("Notify",(Object)(_unidnotificacion));
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Dim noti As Notification";
servbackup2._noti = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Dim IdNotificacion As Int = 1 ' Identificador úni";
servbackup2._idnotificacion = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 17;BA.debugLine="Dim Contador As Int = 0";
servbackup2._contador = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 23;BA.debugLine="Dim FtpTest As FTP";
servbackup2._ftptest = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");
 //BA.debugLineNum = 24;BA.debugLine="FtpTest.PassiveMode = True";
servbackup2._ftptest.runMethod(true,"setPassiveMode",servbackup2.mostCurrent.__c.getField(true,"True"));
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (servbackup2) ","servbackup2",8,servbackup2.processBA,servbackup2.mostCurrent,28);
if (RapidSub.canDelegate("service_create")) { return b4a.example.servbackup2.remoteMe.runUserSub(false, "servbackup2","service_create");}
 BA.debugLineNum = 28;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
Debug.ShouldStop(536870912);
servbackup2.mostCurrent._service.setField ("AutomaticForegroundMode",servbackup2.mostCurrent._service.getField(true,"AUTOMATIC_FOREGROUND_NEVER"));
 BA.debugLineNum = 32;BA.debugLine="Log(\"Cantidad: \" & Contador)";
Debug.ShouldStop(-2147483648);
servbackup2.mostCurrent.__c.runVoidMethod ("LogImpl","56094852",RemoteObject.concat(RemoteObject.createImmutable("Cantidad: "),servbackup2._contador),0);
 BA.debugLineNum = 33;BA.debugLine="CrearNotificacion(IdNotificacion, \"Mensaje del si";
Debug.ShouldStop(1);
_crearnotificacion(servbackup2._idnotificacion,BA.ObjectToString("Mensaje del sistema"),RemoteObject.concat(RemoteObject.createImmutable("Cantidad: "),servbackup2._contador));
 BA.debugLineNum = 35;BA.debugLine="Service.StartForeground(IdNotificacion,noti)";
Debug.ShouldStop(4);
servbackup2.mostCurrent._service.runVoidMethod ("StartForeground",(Object)(servbackup2._idnotificacion),(Object)((servbackup2._noti.getObject())));
 BA.debugLineNum = 50;BA.debugLine="Log(\"Llego hasta aca?\")";
Debug.ShouldStop(131072);
servbackup2.mostCurrent.__c.runVoidMethod ("LogImpl","56094870",RemoteObject.createImmutable("Llego hasta aca?"),0);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (servbackup2) ","servbackup2",8,servbackup2.processBA,servbackup2.mostCurrent,115);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example.servbackup2.remoteMe.runUserSub(false, "servbackup2","service_destroy");}
 BA.debugLineNum = 115;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(262144);
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (servbackup2) ","servbackup2",8,servbackup2.processBA,servbackup2.mostCurrent,54);
if (RapidSub.canDelegate("service_start")) { b4a.example.servbackup2.remoteMe.runUserSub(false, "servbackup2","service_start", _startingintent); return;}
ResumableSub_Service_Start rsub = new ResumableSub_Service_Start(null,_startingintent);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Service_Start extends BA.ResumableSub {
public ResumableSub_Service_Start(b4a.example.servbackup2 parent,RemoteObject _startingintent) {
this.parent = parent;
this._startingintent = _startingintent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.servbackup2 parent;
RemoteObject _startingintent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (servbackup2) ","servbackup2",8,servbackup2.processBA,servbackup2.mostCurrent,54);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 57;BA.debugLine="If DatosGlobales.LogOk = True Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._logok /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 20;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 59;BA.debugLine="FtpTest.Initialize(\"FTP\",DatosGlobales.ServidorI";
Debug.ShouldStop(67108864);
parent._ftptest.runVoidMethod ("Initialize",servbackup2.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 60;BA.debugLine="FtpTest.PassiveMode = True";
Debug.ShouldStop(134217728);
parent._ftptest.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServidor(Dato";
Debug.ShouldStop(536870912);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*RemoteObject*/ );Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 63;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup2", "service_start"), _rs);
this.state = 22;
return;
case 22:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 64;BA.debugLine="If Result = True Then 'Se pudo conectar al servi";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 6;
}else {
this.state = 17;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 65;BA.debugLine="Log(\"Pudo conectar al server ok\")";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","56160395",RemoteObject.createImmutable("Pudo conectar al server ok"),0);
 BA.debugLineNum = 68;BA.debugLine="Service.StopAutomaticForeground 'Call this when";
Debug.ShouldStop(8);
parent.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 70;BA.debugLine="Contador = Contador + 1";
Debug.ShouldStop(32);
parent._contador = RemoteObject.solve(new RemoteObject[] {parent._contador,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 78;BA.debugLine="Log(\"Cantidad: \" & Contador)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","56160408",RemoteObject.concat(RemoteObject.createImmutable("Cantidad: "),parent._contador),0);
 BA.debugLineNum = 80;BA.debugLine="If Contador <= 5 Then";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("k",parent._contador,BA.numberCast(double.class, 5))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 81;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Mensaje";
Debug.ShouldStop(65536);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("Mensaje del sistema"),RemoteObject.concat(RemoteObject.createImmutable("Cantidad: "),parent._contador));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 84;BA.debugLine="EliminarNotificacion(IdNotificacion)";
Debug.ShouldStop(524288);
_eliminarnotificacion(parent._idnotificacion);
 if (true) break;
;
 BA.debugLineNum = 87;BA.debugLine="If Contador = 10 Then";
Debug.ShouldStop(4194304);

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",parent._contador,BA.numberCast(double.class, 10))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 88;BA.debugLine="Log(\"LLego a diez!!!\")";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","56160418",RemoteObject.createImmutable("LLego a diez!!!"),0);
 BA.debugLineNum = 89;BA.debugLine="Contador = 0";
Debug.ShouldStop(16777216);
parent._contador = BA.numberCast(int.class, 0);
 BA.debugLineNum = 90;BA.debugLine="EliminarNotificacion(IdNotificacion)";
Debug.ShouldStop(33554432);
_eliminarnotificacion(parent._idnotificacion);
 BA.debugLineNum = 91;BA.debugLine="StopService(Me)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("StopService",servbackup2.processBA,(Object)(servbackup2.getObject()));
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 96;BA.debugLine="Log(\"No se pudo conectar al server!!!\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","56160426",RemoteObject.createImmutable("No se pudo conectar al server!!!"),0);
 BA.debugLineNum = 99;BA.debugLine="EliminarNotificacion(IdNotificacion)";
Debug.ShouldStop(4);
_eliminarnotificacion(parent._idnotificacion);
 BA.debugLineNum = 100;BA.debugLine="StopService(Me)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("StopService",servbackup2.processBA,(Object)(servbackup2.getObject()));
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 107;BA.debugLine="StartActivity(Login)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",servbackup2.processBA,(Object)((parent.mostCurrent._login.getObject())));
 if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 111;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.S";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("StartServiceAt",servbackup2.processBA,(Object)(servbackup2.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),parent.mostCurrent._datosglobales._segundos /*RemoteObject*/ ,parent.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "+*",1, 2)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _validarcnxservidor(RemoteObject _unaruta) throws Exception{
try {
		Debug.PushSubsStack("ValidarCnxServidor (servbackup2) ","servbackup2",8,servbackup2.processBA,servbackup2.mostCurrent,219);
if (RapidSub.canDelegate("validarcnxservidor")) { return b4a.example.servbackup2.remoteMe.runUserSub(false, "servbackup2","validarcnxservidor", _unaruta);}
ResumableSub_ValidarCnxServidor rsub = new ResumableSub_ValidarCnxServidor(null,_unaruta);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ValidarCnxServidor extends BA.ResumableSub {
public ResumableSub_ValidarCnxServidor(b4a.example.servbackup2 parent,RemoteObject _unaruta) {
this.parent = parent;
this._unaruta = _unaruta;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.servbackup2 parent;
RemoteObject _unaruta;
RemoteObject _resu = RemoteObject.createImmutable(false);
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
RemoteObject _totalcarpetas = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ValidarCnxServidor (servbackup2) ","servbackup2",8,servbackup2.processBA,servbackup2.mostCurrent,219);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("unaRuta", _unaruta);
 BA.debugLineNum = 220;BA.debugLine="Dim Resu As Boolean = False";
Debug.ShouldStop(134217728);
_resu = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resu", _resu);Debug.locals.put("Resu", _resu);
 BA.debugLineNum = 222;BA.debugLine="FtpTest.List(unaRuta)";
Debug.ShouldStop(536870912);
parent._ftptest.runVoidMethod ("List",servbackup2.processBA,(Object)(_unaruta));
 BA.debugLineNum = 223;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", servbackup2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup2", "validarcnxservidor"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 224;BA.debugLine="Dim TotalCarpetas As Int = Folders.Length";
Debug.ShouldStop(-2147483648);
_totalcarpetas = _folders.getField(true,"length");Debug.locals.put("TotalCarpetas", _totalcarpetas);Debug.locals.put("TotalCarpetas", _totalcarpetas);
 BA.debugLineNum = 226;BA.debugLine="Log(\"Cantidad de carpetas leidas: \" & TotalCarpet";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","56488071",RemoteObject.concat(RemoteObject.createImmutable("Cantidad de carpetas leidas: "),_totalcarpetas,RemoteObject.createImmutable(" ---> "),_success),0);
 BA.debugLineNum = 228;BA.debugLine="If Success = True  Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_success,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 229;BA.debugLine="Resu = True";
Debug.ShouldStop(16);
_resu = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resu", _resu);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 232;BA.debugLine="Return Resu";
Debug.ShouldStop(128);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resu));return;};
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _ftp_listcompleted(RemoteObject _serverpath,RemoteObject _success,RemoteObject _folders,RemoteObject _files) throws Exception{
}
}