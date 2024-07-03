package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class login_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (login) ","login",5,login.mostCurrent.activityBA,login.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.login.remoteMe.runUserSub(false, "login","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 37;BA.debugLine="DatosGlobales.Configurando = True";
Debug.ShouldStop(16);
login.mostCurrent._datosglobales._configurando /*RemoteObject*/  = login.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 38;BA.debugLine="DatosGlobales.LogOk = False";
Debug.ShouldStop(32);
login.mostCurrent._datosglobales._logok /*RemoteObject*/  = login.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 40;BA.debugLine="Log(\"Llega a leer XML?\")";
Debug.ShouldStop(128);
login.mostCurrent.__c.runVoidMethod ("LogImpl","54259846",RemoteObject.createImmutable("Llega a leer XML?"),0);
 BA.debugLineNum = 42;BA.debugLine="FxGlobales.LeerXML()";
Debug.ShouldStop(512);
login.mostCurrent._fxglobales.runVoidMethod ("_leerxml" /*RemoteObject*/ ,login.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="Log(\"Termina de leer XML?\")";
Debug.ShouldStop(2048);
login.mostCurrent.__c.runVoidMethod ("LogImpl","54259850",RemoteObject.createImmutable("Termina de leer XML?"),0);
 BA.debugLineNum = 47;BA.debugLine="Activity.LoadLayout(\"login\")";
Debug.ShouldStop(16384);
login.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("login")),login.mostCurrent.activityBA);
 BA.debugLineNum = 51;BA.debugLine="If DatosGlobales.XML_Recordar = 1 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",login.mostCurrent._datosglobales._xml_recordar /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 53;BA.debugLine="Activity.Color = Colors.Transparent";
Debug.ShouldStop(1048576);
login.mostCurrent._activity.runVoidMethod ("setColor",login.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 55;BA.debugLine="Log(\"EN LOGING - USUARIO: \" & DatosGlobales.XML_";
Debug.ShouldStop(4194304);
login.mostCurrent.__c.runVoidMethod ("LogImpl","54259861",RemoteObject.concat(RemoteObject.createImmutable("EN LOGING - USUARIO: "),login.mostCurrent._datosglobales._xml_usuario /*RemoteObject*/ ),0);
 BA.debugLineNum = 57;BA.debugLine="EtUsuario.Text = DatosGlobales.XML_Usuario";
Debug.ShouldStop(16777216);
login.mostCurrent._etusuario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(login.mostCurrent._datosglobales._xml_usuario /*RemoteObject*/ ));
 BA.debugLineNum = 58;BA.debugLine="EtClave.Text = DatosGlobales.XML_Contraseña";
Debug.ShouldStop(33554432);
login.mostCurrent._etclave.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(login.mostCurrent._datosglobales._xml_contraseña /*RemoteObject*/ ));
 BA.debugLineNum = 60;BA.debugLine="BtnIngresar_Click";
Debug.ShouldStop(134217728);
_btningresar_click();
 };
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Activity_Pause (login) ","login",5,login.mostCurrent.activityBA,login.mostCurrent,90);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.login.remoteMe.runUserSub(false, "login","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 90;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Log(\"LOGIN: saliendo\")";
Debug.ShouldStop(67108864);
login.mostCurrent.__c.runVoidMethod ("LogImpl","54390913",RemoteObject.createImmutable("LOGIN: saliendo"),0);
 BA.debugLineNum = 92;BA.debugLine="DatosGlobales.Configurando = False";
Debug.ShouldStop(134217728);
login.mostCurrent._datosglobales._configurando /*RemoteObject*/  = login.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Resume (login) ","login",5,login.mostCurrent.activityBA,login.mostCurrent,84);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.login.remoteMe.runUserSub(false, "login","activity_resume");}
 BA.debugLineNum = 84;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="DatosGlobales.Configurando = True";
Debug.ShouldStop(2097152);
login.mostCurrent._datosglobales._configurando /*RemoteObject*/  = login.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconfig_click() throws Exception{
try {
		Debug.PushSubsStack("BtnConfig_Click (login) ","login",5,login.mostCurrent.activityBA,login.mostCurrent,161);
if (RapidSub.canDelegate("btnconfig_click")) { return b4a.example.login.remoteMe.runUserSub(false, "login","btnconfig_click");}
 BA.debugLineNum = 161;BA.debugLine="Private Sub BtnConfig_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="StartActivity(Configuracion)";
Debug.ShouldStop(2);
login.mostCurrent.__c.runVoidMethod ("StartActivity",login.processBA,(Object)((login.mostCurrent._configuracion.getObject())));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btningresar_click() throws Exception{
try {
		Debug.PushSubsStack("BtnIngresar_Click (login) ","login",5,login.mostCurrent.activityBA,login.mostCurrent,96);
if (RapidSub.canDelegate("btningresar_click")) { return b4a.example.login.remoteMe.runUserSub(false, "login","btningresar_click");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 96;BA.debugLine="Private Sub BtnIngresar_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 110;BA.debugLine="Log(\"Usuario: \" & DatosGlobales.XML_Usuario & \" -";
Debug.ShouldStop(8192);
login.mostCurrent.__c.runVoidMethod ("LogImpl","54456462",RemoteObject.concat(RemoteObject.createImmutable("Usuario: "),login.mostCurrent._datosglobales._xml_usuario /*RemoteObject*/ ,RemoteObject.createImmutable(" - CLAVE: "),login.mostCurrent._datosglobales._xml_contraseña /*RemoteObject*/ ),0);
 BA.debugLineNum = 113;BA.debugLine="If EtUsuario.Text = DatosGlobales.XML_Usuario The";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",login.mostCurrent._etusuario.runMethod(true,"getText"),login.mostCurrent._datosglobales._xml_usuario /*RemoteObject*/ )) { 
 BA.debugLineNum = 114;BA.debugLine="If EtClave.Text = DatosGlobales.XML_Contraseña T";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",login.mostCurrent._etclave.runMethod(true,"getText"),login.mostCurrent._datosglobales._xml_contraseña /*RemoteObject*/ )) { 
 BA.debugLineNum = 115;BA.debugLine="DatosGlobales.LogOk = True";
Debug.ShouldStop(262144);
login.mostCurrent._datosglobales._logok /*RemoteObject*/  = login.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 116;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
login.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 118;BA.debugLine="intentos = intentos +1";
Debug.ShouldStop(2097152);
login._intentos = RemoteObject.solve(new RemoteObject[] {login._intentos,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 120;BA.debugLine="If intentos <= 3 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("k",login._intentos,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 121;BA.debugLine="Msgbox(\"#ERROR: clave incorrecta.\",\"Mensaje de";
Debug.ShouldStop(16777216);
login.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("#ERROR: clave incorrecta.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Mensaje del sistema"))),login.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 123;BA.debugLine="Msgbox(\"#ERROR: Demasiados intentos incorrecto";
Debug.ShouldStop(67108864);
login.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("#ERROR: Demasiados intentos incorrectos. El programa se cerrará.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Mensaje del sistema"))),login.mostCurrent.activityBA);
 BA.debugLineNum = 126;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(536870912);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 127;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(1073741824);
_jo.runVoidMethod ("InitializeContext",login.processBA);
 BA.debugLineNum = 128;BA.debugLine="jo.RunMethod(\"finishAffinity\",Null)";
Debug.ShouldStop(-2147483648);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("finishAffinity")),(Object)((login.mostCurrent.__c.getField(false,"Null"))));
 };
 };
 }else {
 BA.debugLineNum = 134;BA.debugLine="Msgbox(\"#ERROR: usuario incorrecto.\",\"Mensaje d";
Debug.ShouldStop(32);
login.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("#ERROR: usuario incorrecto.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Mensaje del sistema"))),login.mostCurrent.activityBA);
 };
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private BtnIngresar As Button";
login.mostCurrent._btningresar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private EtUsuario As EditText";
login.mostCurrent._etusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private EtClave As EditText";
login.mostCurrent._etclave = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim intentos As Int = 0";
login._intentos = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 31;BA.debugLine="Private BtnConfig As Button";
login.mostCurrent._btnconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
login._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}