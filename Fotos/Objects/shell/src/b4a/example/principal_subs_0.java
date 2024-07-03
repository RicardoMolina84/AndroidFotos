package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class principal_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,43);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 47;BA.debugLine="DatosGlobales.EnPrincipal = True";
Debug.ShouldStop(16384);
principal.mostCurrent._datosglobales._enprincipal /*RemoteObject*/  = principal.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 50;BA.debugLine="Activity.LoadLayout(\"configuracion\") 're utilizo";
Debug.ShouldStop(131072);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("configuracion")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 51;BA.debugLine="SvConfiguracion.Panel.LoadLayout(\"principal\")";
Debug.ShouldStop(262144);
principal.mostCurrent._svconfiguracion.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("principal")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 52;BA.debugLine="SvConfiguracion.Panel.Width = 320dip";
Debug.ShouldStop(524288);
principal.mostCurrent._svconfiguracion.runMethod(false,"getPanel").runMethod(true,"setWidth",principal.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320))));
 BA.debugLineNum = 53;BA.debugLine="SvConfiguracion.Panel.Height = 1100dip";
Debug.ShouldStop(1048576);
principal.mostCurrent._svconfiguracion.runMethod(false,"getPanel").runMethod(true,"setHeight",principal.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1100))));
 BA.debugLineNum = 59;BA.debugLine="RbInterna.Checked = True";
Debug.ShouldStop(67108864);
principal.mostCurrent._rbinterna.runMethodAndSync(true,"setChecked",principal.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="RbInterna_CheckedChange(True)";
Debug.ShouldStop(134217728);
_rbinterna_checkedchange(principal.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,68);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 68;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Resume (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,64);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","activity_resume");}
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncargarimg_click() throws Exception{
try {
		Debug.PushSubsStack("BtnCargarImg_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,152);
if (RapidSub.canDelegate("btncargarimg_click")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","btncargarimg_click");}
 BA.debugLineNum = 152;BA.debugLine="Private Sub BtnCargarImg_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 157;BA.debugLine="EncontroArchivoEnServidor(DatosGlobales.UsuarioRu";
Debug.ShouldStop(268435456);
_encontroarchivoenservidor(principal.mostCurrent._datosglobales._usuariorutafotos /*RemoteObject*/ );
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncerrarapp_click() throws Exception{
try {
		Debug.PushSubsStack("BtnCerrarApp_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,101);
if (RapidSub.canDelegate("btncerrarapp_click")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","btncerrarapp_click");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 101;BA.debugLine="Private Sub BtnCerrarApp_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="StopService(ServBackUp)";
Debug.ShouldStop(32);
principal.mostCurrent.__c.runVoidMethod ("StopService",principal.processBA,(Object)((principal.mostCurrent._servbackup.getObject())));
 BA.debugLineNum = 103;BA.debugLine="StopService(ServBackUp2)";
Debug.ShouldStop(64);
principal.mostCurrent.__c.runVoidMethod ("StopService",principal.processBA,(Object)((principal.mostCurrent._servbackup2.getObject())));
 BA.debugLineNum = 104;BA.debugLine="StopService(ServBackUp4)";
Debug.ShouldStop(128);
principal.mostCurrent.__c.runVoidMethod ("StopService",principal.processBA,(Object)((principal.mostCurrent._servbackup4.getObject())));
 BA.debugLineNum = 106;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(512);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 107;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(1024);
_jo.runVoidMethod ("InitializeContext",principal.processBA);
 BA.debugLineNum = 108;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
Debug.ShouldStop(2048);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("finishAffinity")),(Object)((principal.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("BtnConfiguracion_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,83);
if (RapidSub.canDelegate("btnconfiguracion_click")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","btnconfiguracion_click");}
 BA.debugLineNum = 83;BA.debugLine="Private Sub BtnConfiguracion_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 85;BA.debugLine="StartActivity(Configuracion)";
Debug.ShouldStop(1048576);
principal.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((principal.mostCurrent._configuracion.getObject())));
 }else {
 BA.debugLineNum = 87;BA.debugLine="ToastMessageShow(\"#ERROR: no es posible realizar";
Debug.ShouldStop(4194304);
principal.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("#ERROR: no es posible realizar esta operación mientras hay una copia en curso.")),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndetener_click() throws Exception{
try {
		Debug.PushSubsStack("BtnDetener_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,146);
if (RapidSub.canDelegate("btndetener_click")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","btndetener_click");}
 BA.debugLineNum = 146;BA.debugLine="Private Sub BtnDetener_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="StopService(ServBackUp4)";
Debug.ShouldStop(524288);
principal.mostCurrent.__c.runVoidMethod ("StopService",principal.processBA,(Object)((principal.mostCurrent._servbackup4.getObject())));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnejecutar_click() throws Exception{
try {
		Debug.PushSubsStack("BtnEjecutar_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,111);
if (RapidSub.canDelegate("btnejecutar_click")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","btnejecutar_click");}
 BA.debugLineNum = 111;BA.debugLine="Private Sub BtnEjecutar_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 114;BA.debugLine="Log(\"BtnEjecutar_Click --> Log? \" & DatosGlobales";
Debug.ShouldStop(131072);
principal.mostCurrent.__c.runVoidMethod ("LogImpl","52424835",RemoteObject.concat(RemoteObject.createImmutable("BtnEjecutar_Click --> Log? "),principal.mostCurrent._datosglobales._logok /*RemoteObject*/ ,RemoteObject.createImmutable(" - Ejecutandose? "),principal.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ),0);
 BA.debugLineNum = 116;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(524288);
principal.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = principal.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 118;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 123;BA.debugLine="If DatosGlobales.LogOk = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._datosglobales._logok /*RemoteObject*/ ,principal.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 126;BA.debugLine="StopService(ServBackUp4)";
Debug.ShouldStop(536870912);
principal.mostCurrent.__c.runVoidMethod ("StopService",principal.processBA,(Object)((principal.mostCurrent._servbackup4.getObject())));
 BA.debugLineNum = 128;BA.debugLine="StartService(ServBackUp4)";
Debug.ShouldStop(-2147483648);
principal.mostCurrent.__c.runVoidMethod ("StartService",principal.processBA,(Object)((principal.mostCurrent._servbackup4.getObject())));
 }else {
 BA.debugLineNum = 130;BA.debugLine="StartActivity(Login)";
Debug.ShouldStop(2);
principal.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((principal.mostCurrent._login.getObject())));
 };
 BA.debugLineNum = 133;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
principal.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 135;BA.debugLine="ToastMessageShow(\"#ERROR: no es posible realizar";
Debug.ShouldStop(64);
principal.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("#ERROR: no es posible realizar esta operación mientras hay una copia en curso.")),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,75);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","btnlogin_click");}
 BA.debugLineNum = 75;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 77;BA.debugLine="StartActivity(Login)";
Debug.ShouldStop(4096);
principal.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((principal.mostCurrent._login.getObject())));
 }else {
 BA.debugLineNum = 79;BA.debugLine="ToastMessageShow(\"#ERROR: no es posible realizar";
Debug.ShouldStop(16384);
principal.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("#ERROR: no es posible realizar esta operación mientras hay una copia en curso.")),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsalir_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSalir_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,96);
if (RapidSub.canDelegate("btnsalir_click")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","btnsalir_click");}
 BA.debugLineNum = 96;BA.debugLine="Private Sub BtnSalir_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="DatosGlobales.EnPrincipal = False";
Debug.ShouldStop(1);
principal.mostCurrent._datosglobales._enprincipal /*RemoteObject*/  = principal.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 98;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
principal.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnselcarpeta_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSelCarpeta_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,334);
if (RapidSub.canDelegate("btnselcarpeta_click")) { b4a.example.principal.remoteMe.runUserSub(false, "principal","btnselcarpeta_click"); return;}
ResumableSub_BtnSelCarpeta_Click rsub = new ResumableSub_BtnSelCarpeta_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnSelCarpeta_Click extends BA.ResumableSub {
public ResumableSub_BtnSelCarpeta_Click(b4a.example.principal parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.principal parent;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnSelCarpeta_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,334);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 336;BA.debugLine="fd.ShowOnlyFolders = True";
Debug.ShouldStop(32768);
parent.mostCurrent._fd.runMethod(true,"setShowOnlyFolders",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 338;BA.debugLine="fd.FilePath = PathSeleccionado 'File.DirInternal";
Debug.ShouldStop(131072);
parent.mostCurrent._fd.runMethod(true,"setFilePath",parent.mostCurrent._pathseleccionado);
 BA.debugLineNum = 339;BA.debugLine="fd.FileFilter = Null ' No filtrar ningún archivo";
Debug.ShouldStop(262144);
parent.mostCurrent._fd.runMethod(true,"setFileFilter",BA.ObjectToString(parent.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 341;BA.debugLine="Dim sf As Object = fd.ShowAsync(\"Seleccioná una r";
Debug.ShouldStop(1048576);
_sf = parent.mostCurrent._fd.runMethod(false,"ShowAsync",(Object)(BA.ObjectToCharSequence("Seleccioná una ruta")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("No")),principal.mostCurrent.activityBA,(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 343;BA.debugLine="Wait For (sf) Dialog_Result(Result As Int)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_result", principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "btnselcarpeta_click"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 345;BA.debugLine="Log(\"Resultado: \" & Result)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52818059",RemoteObject.concat(RemoteObject.createImmutable("Resultado: "),_result),0);
 BA.debugLineNum = 347;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 348;BA.debugLine="Log(\"Selected Folder: \" & fd.FilePath)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52818062",RemoteObject.concat(RemoteObject.createImmutable("Selected Folder: "),parent.mostCurrent._fd.runMethod(true,"getFilePath")),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 350;BA.debugLine="Log(\"No se seleccionó ninguna carpeta.\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52818064",RemoteObject.createImmutable("No se seleccionó ninguna carpeta."),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static void  _dialog_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnverfotos_click() throws Exception{
try {
		Debug.PushSubsStack("BtnVerFotos_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,92);
if (RapidSub.canDelegate("btnverfotos_click")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","btnverfotos_click");}
 BA.debugLineNum = 92;BA.debugLine="Private Sub BtnVerFotos_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _encontroarchivoenservidor(RemoteObject _unarutaserver) throws Exception{
try {
		Debug.PushSubsStack("EncontroArchivoEnServidor (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,188);
if (RapidSub.canDelegate("encontroarchivoenservidor")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","encontroarchivoenservidor", _unarutaserver);}
ResumableSub_EncontroArchivoEnServidor rsub = new ResumableSub_EncontroArchivoEnServidor(null,_unarutaserver);
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
public static class ResumableSub_EncontroArchivoEnServidor extends BA.ResumableSub {
public ResumableSub_EncontroArchivoEnServidor(b4a.example.principal parent,RemoteObject _unarutaserver) {
this.parent = parent;
this._unarutaserver = _unarutaserver;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.principal parent;
RemoteObject _unarutaserver;
RemoteObject _listacarpetasbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listacarpetasinternas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
int _j = 0;
RemoteObject _resultarch = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _k = 0;
int step11;
int limit11;
int step16;
int limit16;
int step21;
int limit21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EncontroArchivoEnServidor (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,188);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("unaRutaServer", _unarutaserver);
 BA.debugLineNum = 190;BA.debugLine="Dim ListaCarpetasBase As List";
Debug.ShouldStop(536870912);
_listacarpetasbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListaCarpetasBase", _listacarpetasbase);
 BA.debugLineNum = 191;BA.debugLine="ListaCarpetasBase.Initialize";
Debug.ShouldStop(1073741824);
_listacarpetasbase.runVoidMethod ("Initialize");
 BA.debugLineNum = 193;BA.debugLine="Dim ListaCarpetasInternas As List";
Debug.ShouldStop(1);
_listacarpetasinternas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListaCarpetasInternas", _listacarpetasinternas);
 BA.debugLineNum = 194;BA.debugLine="ListaCarpetasInternas.Initialize";
Debug.ShouldStop(2);
_listacarpetasinternas.runVoidMethod ("Initialize");
 BA.debugLineNum = 196;BA.debugLine="Dim rs As ResumableSub = ObtenerListaCarpetasBase";
Debug.ShouldStop(8);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _obtenerlistacarpetasbase(_unarutaserver);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 197;BA.debugLine="Wait For(rs) Complete (Result As List)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "encontroarchivoenservidor"), _rs);
this.state = 25;
return;
case 25:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 198;BA.debugLine="If Result.Size > 0 Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(">",_result.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 199;BA.debugLine="ListaCarpetasBase = Result";
Debug.ShouldStop(64);
_listacarpetasbase = _result;Debug.locals.put("ListaCarpetasBase", _listacarpetasbase);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 202;BA.debugLine="Log(\"CANTIDAD DE CARPETAS --> Tamaño de 'ListaCar";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52621454",RemoteObject.concat(RemoteObject.createImmutable("CANTIDAD DE CARPETAS --> Tamaño de 'ListaCarpetasBase.Size':"),_listacarpetasbase.runMethod(true,"getSize")),0);
 BA.debugLineNum = 205;BA.debugLine="For i = 0 To ListaCarpetasBase.Size-1";
Debug.ShouldStop(4096);
if (true) break;

case 5:
//for
this.state = 24;
step11 = 1;
limit11 = RemoteObject.solve(new RemoteObject[] {_listacarpetasbase.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 26;
if (true) break;

case 26:
//C
this.state = 24;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 7;
if (true) break;

case 27:
//C
this.state = 26;
_i = ((int)(0 + _i + step11)) ;
Debug.locals.put("i", _i);
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 206;BA.debugLine="Log(\" ### \" & ListaCarpetasBase.Get(i) & \" ### \"";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52621458",RemoteObject.concat(RemoteObject.createImmutable(" ### "),_listacarpetasbase.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(" ### ")),0);
 BA.debugLineNum = 208;BA.debugLine="Dim rs As ResumableSub = ObtenerListaCarpetasBas";
Debug.ShouldStop(32768);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _obtenerlistacarpetasbase(BA.ObjectToString(_listacarpetasbase.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 209;BA.debugLine="Wait For(rs) Complete (Result As List)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "encontroarchivoenservidor"), _rs);
this.state = 28;
return;
case 28:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 210;BA.debugLine="If Result.Size > 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 8:
//if
this.state = 23;
if (RemoteObject.solveBoolean(">",_result.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 212;BA.debugLine="For j = 0 To Result.Size -1";
Debug.ShouldStop(524288);
if (true) break;

case 11:
//for
this.state = 22;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {_result.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
Debug.locals.put("j", _j);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 22;
if ((step16 > 0 && _j <= limit16) || (step16 < 0 && _j >= limit16)) this.state = 13;
if (true) break;

case 30:
//C
this.state = 29;
_j = ((int)(0 + _j + step16)) ;
Debug.locals.put("j", _j);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 214;BA.debugLine="Log(\" ## \" & Result.Get(j) & \" ## \")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52621466",RemoteObject.concat(RemoteObject.createImmutable(" ## "),_result.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))),RemoteObject.createImmutable(" ## ")),0);
 BA.debugLineNum = 215;BA.debugLine="Dim rs As ResumableSub = ObtenerListaDeArchiv";
Debug.ShouldStop(4194304);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _obtenerlistadearchivos(BA.ObjectToString(_result.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j)))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 216;BA.debugLine="Wait For(rs) Complete (ResultArch As List)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "encontroarchivoenservidor"), _rs);
this.state = 31;
return;
case 31:
//C
this.state = 14;
_resultarch = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("ResultArch", _resultarch);
;
 BA.debugLineNum = 217;BA.debugLine="If ResultArch.Size > 0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 14:
//if
this.state = 21;
if (RemoteObject.solveBoolean(">",_resultarch.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 218;BA.debugLine="For k = 0 To ResultArch.Size -1";
Debug.ShouldStop(33554432);
if (true) break;

case 17:
//for
this.state = 20;
step21 = 1;
limit21 = RemoteObject.solve(new RemoteObject[] {_resultarch.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
Debug.locals.put("k", _k);
this.state = 32;
if (true) break;

case 32:
//C
this.state = 20;
if ((step21 > 0 && _k <= limit21) || (step21 < 0 && _k >= limit21)) this.state = 19;
if (true) break;

case 33:
//C
this.state = 32;
_k = ((int)(0 + _k + step21)) ;
Debug.locals.put("k", _k);
if (true) break;

case 19:
//C
this.state = 33;
 BA.debugLineNum = 219;BA.debugLine="Log(\"- \" & ResultArch.Get(k) & \" -\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52621471",RemoteObject.concat(RemoteObject.createImmutable("- "),_resultarch.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))),RemoteObject.createImmutable(" -")),0);
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("k", _k);
;
 if (true) break;

case 21:
//C
this.state = 30;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
Debug.locals.put("j", _j);
;
 if (true) break;

case 23:
//C
this.state = 27;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _eventname_result(RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("EventName_Result (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,370);
if (RapidSub.canDelegate("eventname_result")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","eventname_result", _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 370;BA.debugLine="Sub EventName_Result (Result As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private SvConfiguracion As ScrollView";
principal.mostCurrent._svconfiguracion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private BtnLogin As Button";
principal.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private BtnConfiguracion As Button";
principal.mostCurrent._btnconfiguracion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private BtnVerFotos As Button";
principal.mostCurrent._btnverfotos = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private BtnSalir As Button";
principal.mostCurrent._btnsalir = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private BtnCerrarApp As Button";
principal.mostCurrent._btncerrarapp = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private BtnEjecutar As Button";
principal.mostCurrent._btnejecutar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private BtnDetener As Button";
principal.mostCurrent._btndetener = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private BtnCargarImg As Button";
principal.mostCurrent._btncargarimg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ImageView1 As ImageView";
principal.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim FTP_Consulta As FTP";
principal.mostCurrent._ftp_consulta = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim FTP_Consulta_Carp_Int As FTP";
principal.mostCurrent._ftp_consulta_carp_int = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Dim fd As FileDialog";
principal.mostCurrent._fd = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs2.InputDialog.FileDialog");
 //BA.debugLineNum = 34;BA.debugLine="Dim PathSeleccionado As String";
principal.mostCurrent._pathseleccionado = RemoteObject.createImmutable("");
 //BA.debugLineNum = 38;BA.debugLine="Private BtnSelCarpeta As Button";
principal.mostCurrent._btnselcarpeta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private RbInterna As RadioButton";
principal.mostCurrent._rbinterna = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private RbExterna As RadioButton";
principal.mostCurrent._rbexterna = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _obtenerlistacarpetasbase(RemoteObject _unarutaserver) throws Exception{
try {
		Debug.PushSubsStack("ObtenerListaCarpetasBase (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,241);
if (RapidSub.canDelegate("obtenerlistacarpetasbase")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","obtenerlistacarpetasbase", _unarutaserver);}
ResumableSub_ObtenerListaCarpetasBase rsub = new ResumableSub_ObtenerListaCarpetasBase(null,_unarutaserver);
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
public static class ResumableSub_ObtenerListaCarpetasBase extends BA.ResumableSub {
public ResumableSub_ObtenerListaCarpetasBase(b4a.example.principal parent,RemoteObject _unarutaserver) {
this.parent = parent;
this._unarutaserver = _unarutaserver;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.principal parent;
RemoteObject _unarutaserver;
RemoteObject _totalarchivos = RemoteObject.createImmutable(0);
RemoteObject _totalcarpetas = RemoteObject.createImmutable(0);
RemoteObject _listacarpetasbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _j = 0;
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObtenerListaCarpetasBase (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,241);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("unaRutaServer", _unarutaserver);
 BA.debugLineNum = 242;BA.debugLine="Dim TotalArchivos As Int";
Debug.ShouldStop(131072);
_totalarchivos = RemoteObject.createImmutable(0);Debug.locals.put("TotalArchivos", _totalarchivos);
 BA.debugLineNum = 243;BA.debugLine="Dim TotalCarpetas As Int";
Debug.ShouldStop(262144);
_totalcarpetas = RemoteObject.createImmutable(0);Debug.locals.put("TotalCarpetas", _totalcarpetas);
 BA.debugLineNum = 244;BA.debugLine="Dim ListaCarpetasBase As List";
Debug.ShouldStop(524288);
_listacarpetasbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListaCarpetasBase", _listacarpetasbase);
 BA.debugLineNum = 245;BA.debugLine="ListaCarpetasBase.Initialize";
Debug.ShouldStop(1048576);
_listacarpetasbase.runVoidMethod ("Initialize");
 BA.debugLineNum = 246;BA.debugLine="If FTP_Consulta.IsInitialized = True Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._ftp_consulta.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 247;BA.debugLine="FTP_Consulta.CloseNow";
Debug.ShouldStop(4194304);
parent.mostCurrent._ftp_consulta.runVoidMethod ("CloseNow");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 249;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Servi";
Debug.ShouldStop(16777216);
parent.mostCurrent._ftp_consulta.runVoidMethod ("Initialize",principal.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 250;BA.debugLine="FTP_Consulta.PassiveMode = True";
Debug.ShouldStop(33554432);
parent.mostCurrent._ftp_consulta.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 251;BA.debugLine="FTP_Consulta.List(unaRutaServer) 'ejemplo --> \"./";
Debug.ShouldStop(67108864);
parent.mostCurrent._ftp_consulta.runVoidMethod ("List",principal.processBA,(Object)(_unarutaserver));
 BA.debugLineNum = 252;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "obtenerlistacarpetasbase"), null);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 253;BA.debugLine="If Success  Then";
Debug.ShouldStop(268435456);
if (true) break;

case 5:
//if
this.state = 12;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 254;BA.debugLine="TotalArchivos = Files.Length";
Debug.ShouldStop(536870912);
_totalarchivos = _files.getField(true,"length");Debug.locals.put("TotalArchivos", _totalarchivos);
 BA.debugLineNum = 255;BA.debugLine="TotalCarpetas = Folders.Length";
Debug.ShouldStop(1073741824);
_totalcarpetas = _folders.getField(true,"length");Debug.locals.put("TotalCarpetas", _totalcarpetas);
 BA.debugLineNum = 256;BA.debugLine="For j = 0 To TotalCarpetas-1";
Debug.ShouldStop(-2147483648);
if (true) break;

case 8:
//for
this.state = 11;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_totalcarpetas,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
Debug.locals.put("j", _j);
this.state = 14;
if (true) break;

case 14:
//C
this.state = 11;
if ((step15 > 0 && _j <= limit15) || (step15 < 0 && _j >= limit15)) this.state = 10;
if (true) break;

case 15:
//C
this.state = 14;
_j = ((int)(0 + _j + step15)) ;
Debug.locals.put("j", _j);
if (true) break;

case 10:
//C
this.state = 15;
 BA.debugLineNum = 257;BA.debugLine="ListaCarpetasBase.Add(unaRutaServer & \"/\" & Fol";
Debug.ShouldStop(1);
_listacarpetasbase.runVoidMethod ("Add",(Object)((RemoteObject.concat(_unarutaserver,RemoteObject.createImmutable("/"),_folders.getArrayElement(false,BA.numberCast(int.class, _j)).runMethod(true,"getName")))));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("j", _j);
;
 BA.debugLineNum = 259;BA.debugLine="FTP_Consulta.CloseNow";
Debug.ShouldStop(4);
parent.mostCurrent._ftp_consulta.runVoidMethod ("CloseNow");
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 261;BA.debugLine="Return ListaCarpetasBase";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_listacarpetasbase));return;};
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _obtenerlistadearchivos(RemoteObject _unarutaserver) throws Exception{
try {
		Debug.PushSubsStack("ObtenerListaDeArchivos (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,265);
if (RapidSub.canDelegate("obtenerlistadearchivos")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","obtenerlistadearchivos", _unarutaserver);}
ResumableSub_ObtenerListaDeArchivos rsub = new ResumableSub_ObtenerListaDeArchivos(null,_unarutaserver);
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
public static class ResumableSub_ObtenerListaDeArchivos extends BA.ResumableSub {
public ResumableSub_ObtenerListaDeArchivos(b4a.example.principal parent,RemoteObject _unarutaserver) {
this.parent = parent;
this._unarutaserver = _unarutaserver;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.principal parent;
RemoteObject _unarutaserver;
RemoteObject _totalarchivos = RemoteObject.createImmutable(0);
RemoteObject _listacarpetasbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _j = 0;
int step13;
int limit13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObtenerListaDeArchivos (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,265);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("unaRutaServer", _unarutaserver);
 BA.debugLineNum = 266;BA.debugLine="Dim TotalArchivos As Int";
Debug.ShouldStop(512);
_totalarchivos = RemoteObject.createImmutable(0);Debug.locals.put("TotalArchivos", _totalarchivos);
 BA.debugLineNum = 268;BA.debugLine="Dim ListaCarpetasBase As List";
Debug.ShouldStop(2048);
_listacarpetasbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListaCarpetasBase", _listacarpetasbase);
 BA.debugLineNum = 269;BA.debugLine="ListaCarpetasBase.Initialize";
Debug.ShouldStop(4096);
_listacarpetasbase.runVoidMethod ("Initialize");
 BA.debugLineNum = 270;BA.debugLine="If FTP_Consulta.IsInitialized = True Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._ftp_consulta.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 271;BA.debugLine="FTP_Consulta.CloseNow";
Debug.ShouldStop(16384);
parent.mostCurrent._ftp_consulta.runVoidMethod ("CloseNow");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 273;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Servi";
Debug.ShouldStop(65536);
parent.mostCurrent._ftp_consulta.runVoidMethod ("Initialize",principal.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 274;BA.debugLine="FTP_Consulta.PassiveMode = True";
Debug.ShouldStop(131072);
parent.mostCurrent._ftp_consulta.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 275;BA.debugLine="FTP_Consulta.List(unaRutaServer) 'ejemplo --> \"./";
Debug.ShouldStop(262144);
parent.mostCurrent._ftp_consulta.runVoidMethod ("List",principal.processBA,(Object)(_unarutaserver));
 BA.debugLineNum = 276;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "obtenerlistadearchivos"), null);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 277;BA.debugLine="If Success  Then";
Debug.ShouldStop(1048576);
if (true) break;

case 5:
//if
this.state = 12;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 278;BA.debugLine="TotalArchivos = Files.Length";
Debug.ShouldStop(2097152);
_totalarchivos = _files.getField(true,"length");Debug.locals.put("TotalArchivos", _totalarchivos);
 BA.debugLineNum = 280;BA.debugLine="For j = 0 To TotalArchivos-1";
Debug.ShouldStop(8388608);
if (true) break;

case 8:
//for
this.state = 11;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_totalarchivos,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
Debug.locals.put("j", _j);
this.state = 14;
if (true) break;

case 14:
//C
this.state = 11;
if ((step13 > 0 && _j <= limit13) || (step13 < 0 && _j >= limit13)) this.state = 10;
if (true) break;

case 15:
//C
this.state = 14;
_j = ((int)(0 + _j + step13)) ;
Debug.locals.put("j", _j);
if (true) break;

case 10:
//C
this.state = 15;
 BA.debugLineNum = 281;BA.debugLine="ListaCarpetasBase.Add(unaRutaServer & \"/\" & Fil";
Debug.ShouldStop(16777216);
_listacarpetasbase.runVoidMethod ("Add",(Object)((RemoteObject.concat(_unarutaserver,RemoteObject.createImmutable("/"),_files.getArrayElement(false,BA.numberCast(int.class, _j)).runMethod(true,"getName")))));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("j", _j);
;
 BA.debugLineNum = 283;BA.debugLine="FTP_Consulta.CloseNow";
Debug.ShouldStop(67108864);
parent.mostCurrent._ftp_consulta.runVoidMethod ("CloseNow");
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 285;BA.debugLine="Return ListaCarpetasBase";
Debug.ShouldStop(268435456);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_listacarpetasbase));return;};
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _rbexterna_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("RbExterna_CheckedChange (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,379);
if (RapidSub.canDelegate("rbexterna_checkedchange")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","rbexterna_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 379;BA.debugLine="Private Sub RbExterna_CheckedChange(Checked As Boo";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 380;BA.debugLine="PathSeleccionado = File.DirRootExternal";
Debug.ShouldStop(134217728);
principal.mostCurrent._pathseleccionado = principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal");
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rbinterna_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("RbInterna_CheckedChange (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,375);
if (RapidSub.canDelegate("rbinterna_checkedchange")) { return b4a.example.principal.remoteMe.runUserSub(false, "principal","rbinterna_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 375;BA.debugLine="Private Sub RbInterna_CheckedChange(Checked As Boo";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 376;BA.debugLine="PathSeleccionado = File.DirInternal";
Debug.ShouldStop(8388608);
principal.mostCurrent._pathseleccionado = principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}