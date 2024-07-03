package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class servbackup3_subs_0 {


public static RemoteObject  _crearnotificacion(RemoteObject _unidnotificacion,RemoteObject _titulo,RemoteObject _mensaje) throws Exception{
try {
		Debug.PushSubsStack("CrearNotificacion (servbackup3) ","servbackup3",7,servbackup3.processBA,servbackup3.mostCurrent,199);
if (RapidSub.canDelegate("crearnotificacion")) { return b4a.example.servbackup3.remoteMe.runUserSub(false, "servbackup3","crearnotificacion", _unidnotificacion, _titulo, _mensaje);}
Debug.locals.put("UnIdNotificacion", _unidnotificacion);
Debug.locals.put("Titulo", _titulo);
Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 199;BA.debugLine="Private Sub CrearNotificacion(UnIdNotificacion As";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
Debug.ShouldStop(128);
servbackup3._noti.runVoidMethod ("Initialize2",(Object)(servbackup3._noti.getField(true,"IMPORTANCE_LOW")));
 BA.debugLineNum = 202;BA.debugLine="noti.Icon = \"icon\"";
Debug.ShouldStop(512);
servbackup3._noti.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 203;BA.debugLine="noti.Vibrate = False";
Debug.ShouldStop(1024);
servbackup3._noti.runVoidMethod ("setVibrate",servbackup3.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 204;BA.debugLine="noti.Sound = False";
Debug.ShouldStop(2048);
servbackup3._noti.runVoidMethod ("setSound",servbackup3.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 205;BA.debugLine="noti.Light = False";
Debug.ShouldStop(4096);
servbackup3._noti.runVoidMethod ("setLight",servbackup3.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 206;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
Debug.ShouldStop(8192);
servbackup3._noti.runVoidMethod ("SetInfoNew",servbackup3.processBA,(Object)(BA.ObjectToCharSequence(_titulo)),(Object)(BA.ObjectToCharSequence(_mensaje)),(Object)((servbackup3.mostCurrent._principal.getObject())));
 BA.debugLineNum = 207;BA.debugLine="noti.Notify(UnIdNotificacion)";
Debug.ShouldStop(16384);
servbackup3._noti.runVoidMethod ("Notify",(Object)(_unidnotificacion));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ejecutarprograma() throws Exception{
try {
		Debug.PushSubsStack("EjecutarPrograma (servbackup3) ","servbackup3",7,servbackup3.processBA,servbackup3.mostCurrent,180);
if (RapidSub.canDelegate("ejecutarprograma")) { return b4a.example.servbackup3.remoteMe.runUserSub(false, "servbackup3","ejecutarprograma");}
 BA.debugLineNum = 180;BA.debugLine="Public Sub EjecutarPrograma";
Debug.ShouldStop(524288);
 BA.debugLineNum = 182;BA.debugLine="Log(\"Se ejecuto el programa!!!\")";
Debug.ShouldStop(2097152);
servbackup3.mostCurrent.__c.runVoidMethod ("LogImpl","55701634",RemoteObject.createImmutable("Se ejecuto el programa!!!"),0);
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("EliminarNotificacion (servbackup3) ","servbackup3",7,servbackup3.processBA,servbackup3.mostCurrent,221);
if (RapidSub.canDelegate("eliminarnotificacion")) { return b4a.example.servbackup3.remoteMe.runUserSub(false, "servbackup3","eliminarnotificacion", _unidnotificacion);}
Debug.locals.put("UnIdNotificacion", _unidnotificacion);
 BA.debugLineNum = 221;BA.debugLine="Private Sub EliminarNotificacion(UnIdNotificacion";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="noti.Cancel(UnIdNotificacion)";
Debug.ShouldStop(536870912);
servbackup3._noti.runVoidMethod ("Cancel",(Object)(_unidnotificacion));
 BA.debugLineNum = 223;BA.debugLine="StopService(Me)";
Debug.ShouldStop(1073741824);
servbackup3.mostCurrent.__c.runVoidMethod ("StopService",servbackup3.processBA,(Object)(servbackup3.getObject()));
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("ModificarNotificacion (servbackup3) ","servbackup3",7,servbackup3.processBA,servbackup3.mostCurrent,210);
if (RapidSub.canDelegate("modificarnotificacion")) { return b4a.example.servbackup3.remoteMe.runUserSub(false, "servbackup3","modificarnotificacion", _unidnotificacion, _titulo, _mensaje);}
Debug.locals.put("UnIdNotificacion", _unidnotificacion);
Debug.locals.put("Titulo", _titulo);
Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 210;BA.debugLine="Private Sub ModificarNotificacion(UnIdNotificacion";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
Debug.ShouldStop(262144);
servbackup3._noti.runVoidMethod ("Initialize2",(Object)(servbackup3._noti.getField(true,"IMPORTANCE_LOW")));
 BA.debugLineNum = 213;BA.debugLine="noti.Icon = \"icon\"";
Debug.ShouldStop(1048576);
servbackup3._noti.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 214;BA.debugLine="noti.Vibrate = False";
Debug.ShouldStop(2097152);
servbackup3._noti.runVoidMethod ("setVibrate",servbackup3.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 215;BA.debugLine="noti.Sound = False";
Debug.ShouldStop(4194304);
servbackup3._noti.runVoidMethod ("setSound",servbackup3.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 216;BA.debugLine="noti.Light = False";
Debug.ShouldStop(8388608);
servbackup3._noti.runVoidMethod ("setLight",servbackup3.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 217;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
Debug.ShouldStop(16777216);
servbackup3._noti.runVoidMethod ("SetInfoNew",servbackup3.processBA,(Object)(BA.ObjectToCharSequence(_titulo)),(Object)(BA.ObjectToCharSequence(_mensaje)),(Object)((servbackup3.mostCurrent._principal.getObject())));
 BA.debugLineNum = 218;BA.debugLine="noti.Notify(UnIdNotificacion)";
Debug.ShouldStop(33554432);
servbackup3._noti.runVoidMethod ("Notify",(Object)(_unidnotificacion));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim noti As Notification";
servbackup3._noti = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim EsPrimeraVez As Boolean = True";
servbackup3._esprimeravez = servbackup3.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 20;BA.debugLine="Dim EsPrimeraVezVueltas As Boolean = True";
servbackup3._esprimeravezvueltas = servbackup3.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 23;BA.debugLine="Dim IdNotificacion As Int = 1 ' Identificador úni";
servbackup3._idnotificacion = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 24;BA.debugLine="Dim Contador As Int = 0";
servbackup3._contador = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 31;BA.debugLine="Dim FtpTest As FTP";
servbackup3._ftptest = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");
 //BA.debugLineNum = 32;BA.debugLine="FtpTest.PassiveMode = True";
servbackup3._ftptest.runMethod(true,"setPassiveMode",servbackup3.mostCurrent.__c.getField(true,"True"));
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (servbackup3) ","servbackup3",7,servbackup3.processBA,servbackup3.mostCurrent,36);
if (RapidSub.canDelegate("service_create")) { return b4a.example.servbackup3.remoteMe.runUserSub(false, "servbackup3","service_create");}
 BA.debugLineNum = 36;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="Log(\"ServBackUp3: PASO POR Service_Create\")";
Debug.ShouldStop(32);
servbackup3.mostCurrent.__c.runVoidMethod ("LogImpl","55505026",RemoteObject.createImmutable("ServBackUp3: PASO POR Service_Create"),0);
 BA.debugLineNum = 40;BA.debugLine="DatosGlobales.EnPrincipal = False";
Debug.ShouldStop(128);
servbackup3.mostCurrent._datosglobales._enprincipal /*RemoteObject*/  = servbackup3.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 41;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
Debug.ShouldStop(256);
servbackup3.mostCurrent._service.setField ("AutomaticForegroundMode",servbackup3.mostCurrent._service.getField(true,"AUTOMATIC_FOREGROUND_NEVER"));
 BA.debugLineNum = 43;BA.debugLine="CrearNotificacion(IdNotificacion, \"Mensaje del si";
Debug.ShouldStop(1024);
_crearnotificacion(servbackup3._idnotificacion,BA.ObjectToString("Mensaje del sistema"),RemoteObject.createImmutable("En espera..."));
 BA.debugLineNum = 44;BA.debugLine="Service.StartForeground(IdNotificacion,noti)";
Debug.ShouldStop(2048);
servbackup3.mostCurrent._service.runVoidMethod ("StartForeground",(Object)(servbackup3._idnotificacion),(Object)((servbackup3._noti.getObject())));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Service_Destroy (servbackup3) ","servbackup3",7,servbackup3.processBA,servbackup3.mostCurrent,173);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example.servbackup3.remoteMe.runUserSub(false, "servbackup3","service_destroy");}
 BA.debugLineNum = 173;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(4096);
 BA.debugLineNum = 175;BA.debugLine="Log(\"ServBackUp3: PASO POR Service_Destroy\")";
Debug.ShouldStop(16384);
servbackup3.mostCurrent.__c.runVoidMethod ("LogImpl","55636098",RemoteObject.createImmutable("ServBackUp3: PASO POR Service_Destroy"),0);
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Service_Start (servbackup3) ","servbackup3",7,servbackup3.processBA,servbackup3.mostCurrent,53);
if (RapidSub.canDelegate("service_start")) { b4a.example.servbackup3.remoteMe.runUserSub(false, "servbackup3","service_start", _startingintent); return;}
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
public ResumableSub_Service_Start(b4a.example.servbackup3 parent,RemoteObject _startingintent) {
this.parent = parent;
this._startingintent = _startingintent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.servbackup3 parent;
RemoteObject _startingintent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (servbackup3) ","servbackup3",7,servbackup3.processBA,servbackup3.mostCurrent,53);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 55;BA.debugLine="Try";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 56;BA.debugLine="Log(\"ServBackUp3: PASO POR Service_Start\")";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570563",RemoteObject.createImmutable("ServBackUp3: PASO POR Service_Start"),0);
 BA.debugLineNum = 58;BA.debugLine="If DatosGlobales.EnPrincipal = False Then";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 64;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._enprincipal /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 60;BA.debugLine="If DatosGlobales.Configurando = False Then";
Debug.ShouldStop(134217728);
if (true) break;

case 7:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._configurando /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 62;BA.debugLine="Log(\"Ejecutandose: \" & DatosGlobales.Ejecutand";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570569",RemoteObject.concat(RemoteObject.createImmutable("Ejecutandose: "),parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ),0);
 BA.debugLineNum = 65;BA.debugLine="If EsPrimeraVez = True Then";
Debug.ShouldStop(1);
if (true) break;

case 10:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",parent._esprimeravez,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 12;
}else {
this.state = 34;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 67;BA.debugLine="StartActivity(Login)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",servbackup3.processBA,(Object)((parent.mostCurrent._login.getObject())));
 BA.debugLineNum = 69;BA.debugLine="If DatosGlobales.LogOk Then";
Debug.ShouldStop(16);
if (true) break;

case 13:
//if
this.state = 32;
if (parent.mostCurrent._datosglobales._logok /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 70;BA.debugLine="EsPrimeraVez= False";
Debug.ShouldStop(32);
parent._esprimeravez = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 71;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
Debug.ShouldStop(64);
if (true) break;

case 16:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 18;
}else {
this.state = 30;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 72;BA.debugLine="Try";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 74;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServido";
Debug.ShouldStop(512);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*RemoteObject*/ );Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 75;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup3.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup3", "service_start"), _rs);
this.state = 68;
return;
case 68:
//C
this.state = 22;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 76;BA.debugLine="If Result = True Then 'Se pudo conectar al";
Debug.ShouldStop(2048);
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 77;BA.debugLine="Service.StopAutomaticForeground 'Call thi";
Debug.ShouldStop(4096);
parent.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 80;BA.debugLine="StartActivity(Backup)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",servbackup3.processBA,(Object)((parent.mostCurrent._backup.getObject())));
 BA.debugLineNum = 81;BA.debugLine="Log(\"Paso por aca 'Activity_Resume'\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570588",RemoteObject.createImmutable("Paso por aca 'Activity_Resume'"),0);
 BA.debugLineNum = 83;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fo";
Debug.ShouldStop(262144);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("Fotos"),RemoteObject.concat(RemoteObject.createImmutable("Copia en progreso... "),parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/ ));
 if (true) break;

case 25:
//C
this.state = 28;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 66;
 BA.debugLineNum = 92;BA.debugLine="Log(\"Paso por Catch 1 de Service_Start ->";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570599",RemoteObject.concat(RemoteObject.createImmutable("Paso por Catch 1 de Service_Start -> "),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup3.processBA)),0);
 BA.debugLineNum = 93;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(268435456);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
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
 BA.debugLineNum = 96;BA.debugLine="Log(\"No se puede ejecutar BKP porque una co";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570603",RemoteObject.createImmutable("No se puede ejecutar BKP porque una copia esta en curso..."),0);
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
 BA.debugLineNum = 103;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
Debug.ShouldStop(64);
if (true) break;

case 35:
//if
this.state = 50;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 37;
}else {
this.state = 49;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 105;BA.debugLine="Try";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 106;BA.debugLine="Log(\"Ejecutandose NO por primera vez...\")";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570613",RemoteObject.createImmutable("Ejecutandose NO por primera vez..."),0);
 BA.debugLineNum = 108;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServidor";
Debug.ShouldStop(2048);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*RemoteObject*/ );Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 109;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup3.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup3", "service_start"), _rs);
this.state = 69;
return;
case 69:
//C
this.state = 41;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 110;BA.debugLine="If Result = True Then 'Se pudo conectar al";
Debug.ShouldStop(8192);
if (true) break;

case 41:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 111;BA.debugLine="Service.StopAutomaticForeground 'Call this";
Debug.ShouldStop(16384);
parent.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 114;BA.debugLine="StartActivity(Backup)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",servbackup3.processBA,(Object)((parent.mostCurrent._backup.getObject())));
 BA.debugLineNum = 116;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fot";
Debug.ShouldStop(524288);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("Fotos"),RemoteObject.concat(RemoteObject.createImmutable("Copia en progreso... "),parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/ ));
 if (true) break;

case 44:
//C
this.state = 47;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 66;
 BA.debugLineNum = 125;BA.debugLine="Log(\"Paso por Catch 2 de Service_Start -> \"";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570632",RemoteObject.concat(RemoteObject.createImmutable("Paso por Catch 2 de Service_Start -> "),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup3.processBA)),0);
 BA.debugLineNum = 126;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(536870912);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
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
 BA.debugLineNum = 129;BA.debugLine="Log(\"No se puede ejecutar BKP porque una cop";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570636",RemoteObject.createImmutable("No se puede ejecutar BKP porque una copia esta en curso..."),0);
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
 BA.debugLineNum = 136;BA.debugLine="Log(\"Estado al finalizar de 'Ejecutandose': \"";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570643",RemoteObject.concat(RemoteObject.createImmutable("Estado al finalizar de 'Ejecutandose': "),parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ),0);
 if (true) break;
;
 BA.debugLineNum = 141;BA.debugLine="If DatosGlobales.Ejecutandose = True Then";
Debug.ShouldStop(4096);

case 52:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 54;
}else {
this.state = 56;
}if (true) break;

case 54:
//C
this.state = 63;
 BA.debugLineNum = 143;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fotos\",";
Debug.ShouldStop(16384);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("Fotos"),RemoteObject.concat(RemoteObject.createImmutable("Copia en progreso... "),parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/ ));
 if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 145;BA.debugLine="If DatosGlobales.CopiaPorcentEnCurso = \"100%\"";
Debug.ShouldStop(65536);
if (true) break;

case 57:
//if
this.state = 62;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/ ,BA.ObjectToString("100%"))) { 
this.state = 59;
}else {
this.state = 61;
}if (true) break;

case 59:
//C
this.state = 62;
 BA.debugLineNum = 146;BA.debugLine="Log(\"Esperando para hacer copia de seguridad.";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570653",RemoteObject.createImmutable("Esperando para hacer copia de seguridad..."),0);
 BA.debugLineNum = 148;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
Debug.ShouldStop(524288);
parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/  = BA.ObjectToString("0%");
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 150;BA.debugLine="Log(\"Esperando para hacer copia de seguridad.";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570657",RemoteObject.createImmutable("Esperando para hacer copia de seguridad..."),0);
 BA.debugLineNum = 151;BA.debugLine="CrearNotificacion(IdNotificacion, \"Fotos\",\"Es";
Debug.ShouldStop(4194304);
_crearnotificacion(parent._idnotificacion,BA.ObjectToString("Fotos"),RemoteObject.createImmutable("Esperando para hacer copia de seguridad..."));
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
 BA.debugLineNum = 158;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("StartServiceAt",servbackup3.processBA,(Object)(servbackup3.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),parent.mostCurrent._datosglobales._segundos /*RemoteObject*/ ,parent.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "+*",1, 2)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
if (true) break;

case 66:
//C
this.state = 67;
this.catchState = 0;
 BA.debugLineNum = 165;BA.debugLine="Log(\"#ERROR: en Service_Start --> \" & LastExcept";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55570672",RemoteObject.concat(RemoteObject.createImmutable("#ERROR: en Service_Start --> "),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup3.processBA)),0);
 if (true) break;
if (true) break;

case 67:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",servbackup3.processBA, e0.toString());}
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
		Debug.PushSubsStack("ValidarCnxServidor (servbackup3) ","servbackup3",7,servbackup3.processBA,servbackup3.mostCurrent,233);
if (RapidSub.canDelegate("validarcnxservidor")) { return b4a.example.servbackup3.remoteMe.runUserSub(false, "servbackup3","validarcnxservidor", _unaruta);}
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
public ResumableSub_ValidarCnxServidor(b4a.example.servbackup3 parent,RemoteObject _unaruta) {
this.parent = parent;
this._unaruta = _unaruta;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.servbackup3 parent;
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
		Debug.PushSubsStack("ValidarCnxServidor (servbackup3) ","servbackup3",7,servbackup3.processBA,servbackup3.mostCurrent,233);
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
 BA.debugLineNum = 235;BA.debugLine="Log(\"### Inicia validacion de conexion al servido";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55963778",RemoteObject.concat(RemoteObject.createImmutable("### Inicia validacion de conexion al servidor ### - "),_unaruta),0);
 BA.debugLineNum = 237;BA.debugLine="FtpTest.Initialize(\"FTP\",DatosGlobales.ServidorIp";
Debug.ShouldStop(4096);
parent._ftptest.runVoidMethod ("Initialize",servbackup3.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 238;BA.debugLine="FtpTest.PassiveMode = True";
Debug.ShouldStop(8192);
parent._ftptest.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 240;BA.debugLine="Dim Resu As Boolean = False";
Debug.ShouldStop(32768);
_resu = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resu", _resu);Debug.locals.put("Resu", _resu);
 BA.debugLineNum = 242;BA.debugLine="FtpTest.List(unaRuta)";
Debug.ShouldStop(131072);
parent._ftptest.runVoidMethod ("List",servbackup3.processBA,(Object)(_unaruta));
 BA.debugLineNum = 243;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", servbackup3.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup3", "validarcnxservidor"), null);
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
 BA.debugLineNum = 244;BA.debugLine="Dim TotalCarpetas As Int = Folders.Length";
Debug.ShouldStop(524288);
_totalcarpetas = _folders.getField(true,"length");Debug.locals.put("TotalCarpetas", _totalcarpetas);Debug.locals.put("TotalCarpetas", _totalcarpetas);
 BA.debugLineNum = 246;BA.debugLine="Log(\"Cantidad de carpetas leidas: \" & TotalCarpet";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55963789",RemoteObject.concat(RemoteObject.createImmutable("Cantidad de carpetas leidas: "),_totalcarpetas,RemoteObject.createImmutable(" ---> "),_success),0);
 BA.debugLineNum = 248;BA.debugLine="If Success = True  Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 249;BA.debugLine="Resu = True";
Debug.ShouldStop(16777216);
_resu = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resu", _resu);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 253;BA.debugLine="Log(\"### Fin de validacion de conexion al servido";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55963796",RemoteObject.createImmutable("### Fin de validacion de conexion al servidor ###"),0);
 BA.debugLineNum = 255;BA.debugLine="Return Resu";
Debug.ShouldStop(1073741824);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resu));return;};
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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