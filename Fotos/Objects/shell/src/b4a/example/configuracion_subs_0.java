package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class configuracion_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,51);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 56;BA.debugLine="DatosGlobales.Configurando = True";
Debug.ShouldStop(8388608);
configuracion.mostCurrent._datosglobales._configurando /*RemoteObject*/  = configuracion.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 58;BA.debugLine="FxGlobales.LeerXML()";
Debug.ShouldStop(33554432);
configuracion.mostCurrent._fxglobales.runVoidMethod ("_leerxml" /*RemoteObject*/ ,configuracion.mostCurrent.activityBA);
 BA.debugLineNum = 62;BA.debugLine="Activity.LoadLayout(\"configuracion\")";
Debug.ShouldStop(536870912);
configuracion.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("configuracion")),configuracion.mostCurrent.activityBA);
 BA.debugLineNum = 63;BA.debugLine="SvConfiguracion.Panel.LoadLayout(\"configuracionCo";
Debug.ShouldStop(1073741824);
configuracion.mostCurrent._svconfiguracion.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("configuracionContenido")),configuracion.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="SvConfiguracion.Panel.Width = 320dip";
Debug.ShouldStop(-2147483648);
configuracion.mostCurrent._svconfiguracion.runMethod(false,"getPanel").runMethod(true,"setWidth",configuracion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320))));
 BA.debugLineNum = 65;BA.debugLine="SvConfiguracion.Panel.Height = 1100dip";
Debug.ShouldStop(1);
configuracion.mostCurrent._svconfiguracion.runMethod(false,"getPanel").runMethod(true,"setHeight",configuracion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1100))));
 BA.debugLineNum = 68;BA.debugLine="EtUsuario.Text = DatosGlobales.XML_Usuario";
Debug.ShouldStop(8);
configuracion.mostCurrent._etusuario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_usuario /*RemoteObject*/ ));
 BA.debugLineNum = 69;BA.debugLine="EtClave.Text = DatosGlobales.XML_Contraseña";
Debug.ShouldStop(16);
configuracion.mostCurrent._etclave.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_contraseña /*RemoteObject*/ ));
 BA.debugLineNum = 70;BA.debugLine="EtClaveConf.Text = DatosGlobales.XML_Contraseña";
Debug.ShouldStop(32);
configuracion.mostCurrent._etclaveconf.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_contraseña /*RemoteObject*/ ));
 BA.debugLineNum = 72;BA.debugLine="If DatosGlobales.XML_Recordar = \"1\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._datosglobales._xml_recordar /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 73;BA.debugLine="CbRecordar.Checked = True";
Debug.ShouldStop(256);
configuracion.mostCurrent._cbrecordar.runMethodAndSync(true,"setChecked",configuracion.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 75;BA.debugLine="CbRecordar.Checked = False";
Debug.ShouldStop(1024);
configuracion.mostCurrent._cbrecordar.runMethodAndSync(true,"setChecked",configuracion.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 81;BA.debugLine="EtFotosCamara.Text = DatosGlobales.XML_FotosCamar";
Debug.ShouldStop(65536);
configuracion.mostCurrent._etfotoscamara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_fotoscamara /*RemoteObject*/ ));
 BA.debugLineNum = 82;BA.debugLine="EtVideosCamara.Text = DatosGlobales.XML_VideosCam";
Debug.ShouldStop(131072);
configuracion.mostCurrent._etvideoscamara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_videoscamara /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="EtImagenesWhapp.Text = DatosGlobales.XML_Imagenes";
Debug.ShouldStop(262144);
configuracion.mostCurrent._etimageneswhapp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_imageneswhatsapp /*RemoteObject*/ ));
 BA.debugLineNum = 84;BA.debugLine="EtVideosWhapp.Text = DatosGlobales.XML_VideosWhat";
Debug.ShouldStop(524288);
configuracion.mostCurrent._etvideoswhapp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_videoswhatsapp /*RemoteObject*/ ));
 BA.debugLineNum = 87;BA.debugLine="If DatosGlobales.XML_ChFotosCamara = \"1\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._datosglobales._xml_chfotoscamara /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 88;BA.debugLine="ChFotosCamara.Checked = True";
Debug.ShouldStop(8388608);
configuracion.mostCurrent._chfotoscamara.runMethodAndSync(true,"setChecked",configuracion.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 90;BA.debugLine="ChFotosCamara.Checked = False";
Debug.ShouldStop(33554432);
configuracion.mostCurrent._chfotoscamara.runMethodAndSync(true,"setChecked",configuracion.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 93;BA.debugLine="If DatosGlobales.XML_ChVideosCamara = \"1\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._datosglobales._xml_chvideoscamara /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 94;BA.debugLine="ChVideosCamara.Checked = True";
Debug.ShouldStop(536870912);
configuracion.mostCurrent._chvideoscamara.runMethodAndSync(true,"setChecked",configuracion.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 96;BA.debugLine="ChVideosCamara.Checked = False";
Debug.ShouldStop(-2147483648);
configuracion.mostCurrent._chvideoscamara.runMethodAndSync(true,"setChecked",configuracion.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 99;BA.debugLine="If DatosGlobales.XML_ChImagenesWhatsApp = \"1\" The";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._datosglobales._xml_chimageneswhatsapp /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 100;BA.debugLine="ChImagenesWhapp.Checked = True";
Debug.ShouldStop(8);
configuracion.mostCurrent._chimageneswhapp.runMethodAndSync(true,"setChecked",configuracion.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 102;BA.debugLine="ChImagenesWhapp.Checked = False";
Debug.ShouldStop(32);
configuracion.mostCurrent._chimageneswhapp.runMethodAndSync(true,"setChecked",configuracion.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 105;BA.debugLine="If DatosGlobales.XML_ChVideosWhatsApp = \"1\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._datosglobales._xml_chvideoswhatsapp /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 106;BA.debugLine="ChVideosWhapp.Checked = True";
Debug.ShouldStop(512);
configuracion.mostCurrent._chvideoswhapp.runMethodAndSync(true,"setChecked",configuracion.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 108;BA.debugLine="ChVideosWhapp.Checked = False";
Debug.ShouldStop(2048);
configuracion.mostCurrent._chvideoswhapp.runMethodAndSync(true,"setChecked",configuracion.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 115;BA.debugLine="EtCarpetaServerBkp.Text = DatosGlobales.XML_Usuar";
Debug.ShouldStop(262144);
configuracion.mostCurrent._etcarpetaserverbkp.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_usuariorutafotos /*RemoteObject*/ ));
 BA.debugLineNum = 118;BA.debugLine="EtServidorRuta.Text = DatosGlobales.XML_ServidorR";
Debug.ShouldStop(2097152);
configuracion.mostCurrent._etservidorruta.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_servidorruta /*RemoteObject*/ ));
 BA.debugLineNum = 119;BA.debugLine="EtServidorIp.Text = DatosGlobales.XML_ServidorIp";
Debug.ShouldStop(4194304);
configuracion.mostCurrent._etservidorip.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_servidorip /*RemoteObject*/ ));
 BA.debugLineNum = 120;BA.debugLine="EtServidorPuerto.Text = DatosGlobales.XML_Servido";
Debug.ShouldStop(8388608);
configuracion.mostCurrent._etservidorpuerto.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_servidorpuerto /*RemoteObject*/ ));
 BA.debugLineNum = 121;BA.debugLine="EtServidorUsuario.Text = DatosGlobales.XML_Servid";
Debug.ShouldStop(16777216);
configuracion.mostCurrent._etservidorusuario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_servidorusuario /*RemoteObject*/ ));
 BA.debugLineNum = 122;BA.debugLine="EtServidorClave.Text = DatosGlobales.XML_Servidor";
Debug.ShouldStop(33554432);
configuracion.mostCurrent._etservidorclave.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(configuracion.mostCurrent._datosglobales._xml_servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,133);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 133;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 135;BA.debugLine="DatosGlobales.Configurando = False";
Debug.ShouldStop(64);
configuracion.mostCurrent._datosglobales._configurando /*RemoteObject*/  = configuracion.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,127);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","activity_resume");}
 BA.debugLineNum = 127;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 129;BA.debugLine="DatosGlobales.Configurando = True";
Debug.ShouldStop(1);
configuracion.mostCurrent._datosglobales._configurando /*RemoteObject*/  = configuracion.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnguardar_click() throws Exception{
try {
		Debug.PushSubsStack("BtnGuardar_Click (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,144);
if (RapidSub.canDelegate("btnguardar_click")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","btnguardar_click");}
RemoteObject _unxml = RemoteObject.createImmutable("");
 BA.debugLineNum = 144;BA.debugLine="Private Sub BtnGuardar_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 150;BA.debugLine="If EtClave.Text <> \"\" And (EtClave.Text <> EtClav";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",configuracion.mostCurrent._etclave.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",configuracion.mostCurrent._etclave.runMethod(true,"getText"),configuracion.mostCurrent._etclaveconf.runMethod(true,"getText")))))) { 
 BA.debugLineNum = 151;BA.debugLine="Msgbox(\"#ERROR: la clave ingresada no es correct";
Debug.ShouldStop(4194304);
configuracion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("#ERROR: la clave ingresada no es correcta.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Mensaje del sistema"))),configuracion.mostCurrent.activityBA);
 BA.debugLineNum = 152;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 155;BA.debugLine="Dim unXml As String = CargarElXML";
Debug.ShouldStop(67108864);
_unxml = _cargarelxml();Debug.locals.put("unXml", _unxml);Debug.locals.put("unXml", _unxml);
 BA.debugLineNum = 156;BA.debugLine="File.WriteString(File.DirInternal,\"config.xml\",un";
Debug.ShouldStop(134217728);
configuracion.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(configuracion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("config.xml")),(Object)(_unxml));
 BA.debugLineNum = 160;BA.debugLine="FxGlobales.LeerXML()";
Debug.ShouldStop(-2147483648);
configuracion.mostCurrent._fxglobales.runVoidMethod ("_leerxml" /*RemoteObject*/ ,configuracion.mostCurrent.activityBA);
 BA.debugLineNum = 163;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 164;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullbkp";
Debug.ShouldStop(8);
configuracion.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(configuracion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("indicefullbkp.txt")),(Object)(RemoteObject.createImmutable("-1")));
 BA.debugLineNum = 165;BA.debugLine="DatosGlobales.IndiceFullBkp = File.ReadString(Fi";
Debug.ShouldStop(16);
configuracion.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/  = BA.numberCast(int.class, configuracion.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(configuracion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("indicefullbkp.txt"))));
 BA.debugLineNum = 167;BA.debugLine="If DatosGlobales.IndiceFullBkp > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",configuracion.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 168;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
Debug.ShouldStop(128);
configuracion.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {configuracion.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "-",1, 1);
 };
 };
 BA.debugLineNum = 174;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
configuracion.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarelxml() throws Exception{
try {
		Debug.PushSubsStack("CargarElXML (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,241);
if (RapidSub.canDelegate("cargarelxml")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","cargarelxml");}
RemoteObject _archivoxml = RemoteObject.createImmutable("");
 BA.debugLineNum = 241;BA.debugLine="Private Sub CargarElXML As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 247;BA.debugLine="If ChFotosCamara.Checked And XML_ChFotosCamara_Hi";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(".",configuracion.mostCurrent._chfotoscamara.runMethod(true,"getChecked")) && RemoteObject.solveBoolean("=",configuracion.mostCurrent._xml_chfotoscamara_hist,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 248;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
Debug.ShouldStop(8388608);
configuracion.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/  = BA.ObjectToString("1");
 };
 BA.debugLineNum = 252;BA.debugLine="If ChVideosCamara.Checked And XML_ChVideosCamara_";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(".",configuracion.mostCurrent._chvideoscamara.runMethod(true,"getChecked")) && RemoteObject.solveBoolean("=",configuracion.mostCurrent._xml_chvideoscamara_hist,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 253;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
Debug.ShouldStop(268435456);
configuracion.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/  = BA.ObjectToString("1");
 };
 BA.debugLineNum = 257;BA.debugLine="If ChImagenesWhapp.Checked And XML_ChImagenesWhat";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(".",configuracion.mostCurrent._chimageneswhapp.runMethod(true,"getChecked")) && RemoteObject.solveBoolean("=",configuracion.mostCurrent._xml_chimageneswhatsapp_hist,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 258;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
Debug.ShouldStop(2);
configuracion.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/  = BA.ObjectToString("1");
 };
 BA.debugLineNum = 262;BA.debugLine="If ChVideosWhapp.Checked And XML_ChVideosWhatsApp";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(".",configuracion.mostCurrent._chvideoswhapp.runMethod(true,"getChecked")) && RemoteObject.solveBoolean("=",configuracion.mostCurrent._xml_chvideoswhatsapp_hist,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 263;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
Debug.ShouldStop(64);
configuracion.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/  = BA.ObjectToString("1");
 };
 BA.debugLineNum = 266;BA.debugLine="If (ChFotosCamara.Checked = False) And (ChVideosC";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",configuracion.mostCurrent._chfotoscamara.runMethod(true,"getChecked"),configuracion.mostCurrent.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",configuracion.mostCurrent._chvideoscamara.runMethod(true,"getChecked"),configuracion.mostCurrent.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",configuracion.mostCurrent._chimageneswhapp.runMethod(true,"getChecked"),configuracion.mostCurrent.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",configuracion.mostCurrent._chvideoswhapp.runMethod(true,"getChecked"),configuracion.mostCurrent.__c.getField(true,"False")))))) { 
 BA.debugLineNum = 267;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"0\"";
Debug.ShouldStop(1024);
configuracion.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/  = BA.ObjectToString("0");
 };
 BA.debugLineNum = 274;BA.debugLine="Dim ArchivoXml As String = \"<?xml version=\"\"\"\"1.0";
Debug.ShouldStop(131072);
_archivoxml = RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"\"1.0\"\" encoding=\"\"UTF-8\"\"?>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 275;BA.debugLine="ArchivoXml = ArchivoXml & \"<fotos>\" & CRLF & \"\"";
Debug.ShouldStop(262144);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("<fotos>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 276;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(524288);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 278;BA.debugLine="ArchivoXml = ArchivoXml & \" <login>\" & CRLF & \"\"";
Debug.ShouldStop(2097152);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <login>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 279;BA.debugLine="ArchivoXml = ArchivoXml & \"   <usuario>\" & EtUsua";
Debug.ShouldStop(4194304);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <usuario>"),configuracion.mostCurrent._etusuario.runMethod(true,"getText"),RemoteObject.createImmutable("</usuario>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 280;BA.debugLine="ArchivoXml = ArchivoXml & \"   <contraseña>\" & EtC";
Debug.ShouldStop(8388608);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <contraseña>"),configuracion.mostCurrent._etclave.runMethod(true,"getText"),RemoteObject.createImmutable("</contraseña>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 281;BA.debugLine="ArchivoXml = ArchivoXml & \"   <recordar>\" & Datos";
Debug.ShouldStop(16777216);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <recordar>"),configuracion.mostCurrent._datosglobales._xml_recordar /*RemoteObject*/ ,RemoteObject.createImmutable("</recordar>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 282;BA.debugLine="ArchivoXml = ArchivoXml & \" </login>\"  & CRLF & \"";
Debug.ShouldStop(33554432);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </login>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 284;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(134217728);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 285;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_origen>\" & CRLF";
Debug.ShouldStop(268435456);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <ruta_origen>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 286;BA.debugLine="ArchivoXml = ArchivoXml & \"   <fotoscamara>\" & Et";
Debug.ShouldStop(536870912);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <fotoscamara>"),configuracion.mostCurrent._etfotoscamara.runMethod(true,"getText"),RemoteObject.createImmutable("</fotoscamara>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 287;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoscamara>\" & E";
Debug.ShouldStop(1073741824);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <videoscamara>"),configuracion.mostCurrent._etvideoscamara.runMethod(true,"getText"),RemoteObject.createImmutable("</videoscamara>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 288;BA.debugLine="ArchivoXml = ArchivoXml & \"   <imageneswhatsapp>\"";
Debug.ShouldStop(-2147483648);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <imageneswhatsapp>"),configuracion.mostCurrent._etimageneswhapp.runMethod(true,"getText"),RemoteObject.createImmutable("</imageneswhatsapp>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 289;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoswhatsapp>\" &";
Debug.ShouldStop(1);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <videoswhatsapp>"),configuracion.mostCurrent._etvideoswhapp.runMethod(true,"getText"),RemoteObject.createImmutable("</videoswhatsapp>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 291;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chfotoscamara>\" &";
Debug.ShouldStop(4);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chfotoscamara>"),configuracion.mostCurrent._datosglobales._xml_chfotoscamara /*RemoteObject*/ ,RemoteObject.createImmutable("</chfotoscamara>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 292;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoscamara>\" &";
Debug.ShouldStop(8);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chvideoscamara>"),configuracion.mostCurrent._datosglobales._xml_chvideoscamara /*RemoteObject*/ ,RemoteObject.createImmutable("</chvideoscamara>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 293;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chimageneswhatsapp";
Debug.ShouldStop(16);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chimageneswhatsapp>"),configuracion.mostCurrent._datosglobales._xml_chimageneswhatsapp /*RemoteObject*/ ,RemoteObject.createImmutable("</chimageneswhatsapp>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 294;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoswhatsapp>\"";
Debug.ShouldStop(32);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chvideoswhatsapp>"),configuracion.mostCurrent._datosglobales._xml_chvideoswhatsapp /*RemoteObject*/ ,RemoteObject.createImmutable("</chvideoswhatsapp>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 295;BA.debugLine="ArchivoXml = ArchivoXml & \"   <primeravez>\" & Dat";
Debug.ShouldStop(64);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <primeravez>"),configuracion.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,RemoteObject.createImmutable("</primeravez>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 297;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_origen>\" & CRL";
Debug.ShouldStop(256);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </ruta_origen>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 299;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(1024);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 300;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_destino>\" & CRL";
Debug.ShouldStop(2048);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <ruta_destino>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 301;BA.debugLine="ArchivoXml = ArchivoXml & \"   <UsuarioRutaFotos>\"";
Debug.ShouldStop(4096);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <UsuarioRutaFotos>"),configuracion.mostCurrent._etcarpetaserverbkp.runMethod(true,"getText"),RemoteObject.createImmutable("</UsuarioRutaFotos>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 302;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_destino>\" & CR";
Debug.ShouldStop(8192);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </ruta_destino>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 303;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(16384);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 305;BA.debugLine="ArchivoXml = ArchivoXml & \" <ftp>\" & CRLF & \"\"";
Debug.ShouldStop(65536);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <ftp>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 306;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorruta>\" & E";
Debug.ShouldStop(131072);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorruta>"),configuracion.mostCurrent._etservidorruta.runMethod(true,"getText"),RemoteObject.createImmutable("</servidorruta>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 307;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorip>\" & EtS";
Debug.ShouldStop(262144);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorip>"),configuracion.mostCurrent._etservidorip.runMethod(true,"getText"),RemoteObject.createImmutable("</servidorip>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 308;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorpuerto>\" &";
Debug.ShouldStop(524288);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorpuerto>"),configuracion.mostCurrent._etservidorpuerto.runMethod(true,"getText"),RemoteObject.createImmutable("</servidorpuerto>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 309;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorusuario>\"";
Debug.ShouldStop(1048576);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorusuario>"),configuracion.mostCurrent._etservidorusuario.runMethod(true,"getText"),RemoteObject.createImmutable("</servidorusuario>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 310;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorclave>\" &";
Debug.ShouldStop(2097152);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorclave>"),configuracion.mostCurrent._etservidorclave.runMethod(true,"getText"),RemoteObject.createImmutable("</servidorclave>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 311;BA.debugLine="ArchivoXml = ArchivoXml & \" </ftp>\" & CRLF & \"\"";
Debug.ShouldStop(4194304);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </ftp>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 313;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(16777216);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 314;BA.debugLine="ArchivoXml = ArchivoXml & \"</fotos>\" & CRLF & \"\"";
Debug.ShouldStop(33554432);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("</fotos>"),configuracion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 319;BA.debugLine="Return ArchivoXml";
Debug.ShouldStop(1073741824);
if (true) return _archivoxml;
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cbrecordar_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CbRecordar_CheckedChange (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,326);
if (RapidSub.canDelegate("cbrecordar_checkedchange")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","cbrecordar_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 326;BA.debugLine="Private Sub CbRecordar_CheckedChange(Checked As Bo";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="If CbRecordar.Checked = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._cbrecordar.runMethod(true,"getChecked"),configuracion.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 328;BA.debugLine="DatosGlobales.XML_Recordar = \"1\"";
Debug.ShouldStop(128);
configuracion.mostCurrent._datosglobales._xml_recordar /*RemoteObject*/  = BA.ObjectToString("1");
 }else {
 BA.debugLineNum = 330;BA.debugLine="DatosGlobales.XML_Recordar = \"0\"";
Debug.ShouldStop(512);
configuracion.mostCurrent._datosglobales._xml_recordar /*RemoteObject*/  = BA.ObjectToString("0");
 };
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chfotoscamara_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ChFotosCamara_CheckedChange (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,335);
if (RapidSub.canDelegate("chfotoscamara_checkedchange")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","chfotoscamara_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 335;BA.debugLine="Private Sub ChFotosCamara_CheckedChange(Checked As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="If ChFotosCamara.Checked = True Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._chfotoscamara.runMethod(true,"getChecked"),configuracion.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 337;BA.debugLine="DatosGlobales.XML_ChFotosCamara = \"1\"";
Debug.ShouldStop(65536);
configuracion.mostCurrent._datosglobales._xml_chfotoscamara /*RemoteObject*/  = BA.ObjectToString("1");
 }else {
 BA.debugLineNum = 339;BA.debugLine="DatosGlobales.XML_ChFotosCamara = \"0\"";
Debug.ShouldStop(262144);
configuracion.mostCurrent._datosglobales._xml_chfotoscamara /*RemoteObject*/  = BA.ObjectToString("0");
 };
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chimageneswhapp_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ChImagenesWhapp_CheckedChange (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,351);
if (RapidSub.canDelegate("chimageneswhapp_checkedchange")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","chimageneswhapp_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 351;BA.debugLine="Private Sub ChImagenesWhapp_CheckedChange(Checked";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 352;BA.debugLine="If ChImagenesWhapp.Checked = True Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._chimageneswhapp.runMethod(true,"getChecked"),configuracion.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 353;BA.debugLine="DatosGlobales.XML_ChImagenesWhatsApp = \"1\"";
Debug.ShouldStop(1);
configuracion.mostCurrent._datosglobales._xml_chimageneswhatsapp /*RemoteObject*/  = BA.ObjectToString("1");
 }else {
 BA.debugLineNum = 355;BA.debugLine="DatosGlobales.XML_ChImagenesWhatsApp = \"0\"";
Debug.ShouldStop(4);
configuracion.mostCurrent._datosglobales._xml_chimageneswhatsapp /*RemoteObject*/  = BA.ObjectToString("0");
 };
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chvideoscamara_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ChVideosCamara_CheckedChange (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,343);
if (RapidSub.canDelegate("chvideoscamara_checkedchange")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","chvideoscamara_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 343;BA.debugLine="Private Sub ChVideosCamara_CheckedChange(Checked A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="If ChVideosCamara.Checked = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._chvideoscamara.runMethod(true,"getChecked"),configuracion.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 345;BA.debugLine="DatosGlobales.XML_ChVideosCamara = \"1\"";
Debug.ShouldStop(16777216);
configuracion.mostCurrent._datosglobales._xml_chvideoscamara /*RemoteObject*/  = BA.ObjectToString("1");
 }else {
 BA.debugLineNum = 347;BA.debugLine="DatosGlobales.XML_ChVideosCamara = \"0\"";
Debug.ShouldStop(67108864);
configuracion.mostCurrent._datosglobales._xml_chvideoscamara /*RemoteObject*/  = BA.ObjectToString("0");
 };
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chvideoswhapp_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("ChVideosWhapp_CheckedChange (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,359);
if (RapidSub.canDelegate("chvideoswhapp_checkedchange")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","chvideoswhapp_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 359;BA.debugLine="Private Sub ChVideosWhapp_CheckedChange(Checked As";
Debug.ShouldStop(64);
 BA.debugLineNum = 360;BA.debugLine="If ChVideosWhapp.Checked = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._chvideoswhapp.runMethod(true,"getChecked"),configuracion.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 361;BA.debugLine="DatosGlobales.XML_ChVideosWhatsApp = \"1\"";
Debug.ShouldStop(256);
configuracion.mostCurrent._datosglobales._xml_chvideoswhatsapp /*RemoteObject*/  = BA.ObjectToString("1");
 }else {
 BA.debugLineNum = 363;BA.debugLine="DatosGlobales.XML_ChVideosWhatsApp = \"0\"";
Debug.ShouldStop(1024);
configuracion.mostCurrent._datosglobales._xml_chvideoswhatsapp /*RemoteObject*/  = BA.ObjectToString("0");
 };
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private EtFotosCamara As EditText";
configuracion.mostCurrent._etfotoscamara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EtVideosCamara As EditText";
configuracion.mostCurrent._etvideoscamara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private EtImagenesWhapp As EditText";
configuracion.mostCurrent._etimageneswhapp = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private EtVideosWhapp As EditText";
configuracion.mostCurrent._etvideoswhapp = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private SvConfiguracion As ScrollView";
configuracion.mostCurrent._svconfiguracion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private EtCarpetaServerBkp As EditText";
configuracion.mostCurrent._etcarpetaserverbkp = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EtServidorRuta As EditText";
configuracion.mostCurrent._etservidorruta = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EtServidorIp As EditText";
configuracion.mostCurrent._etservidorip = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private EtServidorPuerto As EditText";
configuracion.mostCurrent._etservidorpuerto = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private EtServidorUsuario As EditText";
configuracion.mostCurrent._etservidorusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EtServidorClave As EditText";
configuracion.mostCurrent._etservidorclave = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private BtnGuardar As Button";
configuracion.mostCurrent._btnguardar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private EtUsuario As EditText";
configuracion.mostCurrent._etusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private EtClave As EditText";
configuracion.mostCurrent._etclave = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private EtClaveConf As EditText";
configuracion.mostCurrent._etclaveconf = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private CbRecordar As CheckBox";
configuracion.mostCurrent._cbrecordar = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ChFotosCamara As CheckBox";
configuracion.mostCurrent._chfotoscamara = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private ChVideosCamara As CheckBox";
configuracion.mostCurrent._chvideoscamara = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private ChImagenesWhapp As CheckBox";
configuracion.mostCurrent._chimageneswhapp = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private ChVideosWhapp As CheckBox";
configuracion.mostCurrent._chvideoswhapp = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private XML_ChFotosCamara_Hist As String = DatosG";
configuracion.mostCurrent._xml_chfotoscamara_hist = configuracion.mostCurrent._datosglobales._xml_chfotoscamara /*RemoteObject*/ ;
 //BA.debugLineNum = 44;BA.debugLine="Private XML_ChVideosCamara_Hist As String = Datos";
configuracion.mostCurrent._xml_chvideoscamara_hist = configuracion.mostCurrent._datosglobales._xml_chvideoscamara /*RemoteObject*/ ;
 //BA.debugLineNum = 45;BA.debugLine="Private XML_ChImagenesWhatsApp_Hist As String = D";
configuracion.mostCurrent._xml_chimageneswhatsapp_hist = configuracion.mostCurrent._datosglobales._xml_chimageneswhatsapp /*RemoteObject*/ ;
 //BA.debugLineNum = 46;BA.debugLine="Private XML_ChVideosWhatsApp_Hist As String = Dat";
configuracion.mostCurrent._xml_chvideoswhatsapp_hist = configuracion.mostCurrent._datosglobales._xml_chvideoswhatsapp /*RemoteObject*/ ;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _validardatos() throws Exception{
try {
		Debug.PushSubsStack("ValidarDatos (configuracion) ","configuracion",6,configuracion.mostCurrent.activityBA,configuracion.mostCurrent,180);
if (RapidSub.canDelegate("validardatos")) { return b4a.example.configuracion.remoteMe.runUserSub(false, "configuracion","validardatos");}
RemoteObject _resultado = RemoteObject.createImmutable(false);
 BA.debugLineNum = 180;BA.debugLine="Private Sub ValidarDatos() As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="Dim Resultado As Boolean = True";
Debug.ShouldStop(1048576);
_resultado = configuracion.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 184;BA.debugLine="If EtUsuario.Text = \"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etusuario.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 185;BA.debugLine="Resultado = False";
Debug.ShouldStop(16777216);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 188;BA.debugLine="If EtClave.Text = \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etclave.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 189;BA.debugLine="Resultado = False";
Debug.ShouldStop(268435456);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 192;BA.debugLine="If EtClaveConf.Text = \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etclaveconf.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 193;BA.debugLine="Resultado = False";
Debug.ShouldStop(1);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 196;BA.debugLine="If EtFotosCamara.Text = \"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etfotoscamara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 197;BA.debugLine="Resultado = False";
Debug.ShouldStop(16);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 200;BA.debugLine="If EtVideosCamara.Text = \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etvideoscamara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 201;BA.debugLine="Resultado = False";
Debug.ShouldStop(256);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 204;BA.debugLine="If EtImagenesWhapp.Text = \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etimageneswhapp.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 205;BA.debugLine="Resultado = False";
Debug.ShouldStop(4096);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 208;BA.debugLine="If EtVideosWhapp.Text = \"\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etvideoswhapp.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 209;BA.debugLine="Resultado = False";
Debug.ShouldStop(65536);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 212;BA.debugLine="If EtCarpetaServerBkp.Text = \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etcarpetaserverbkp.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 213;BA.debugLine="Resultado = False";
Debug.ShouldStop(1048576);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 216;BA.debugLine="If EtServidorRuta.Text = \"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etservidorruta.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 217;BA.debugLine="Resultado = False";
Debug.ShouldStop(16777216);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 220;BA.debugLine="If EtServidorIp.Text = \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etservidorip.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 221;BA.debugLine="Resultado = False";
Debug.ShouldStop(268435456);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 224;BA.debugLine="If EtServidorPuerto.Text = \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etservidorpuerto.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 225;BA.debugLine="Resultado = False";
Debug.ShouldStop(1);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 228;BA.debugLine="If EtServidorUsuario.Text = \"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etservidorusuario.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 229;BA.debugLine="Resultado = False";
Debug.ShouldStop(16);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 232;BA.debugLine="If EtServidorClave.Text = \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",configuracion.mostCurrent._etservidorclave.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 233;BA.debugLine="Resultado = False";
Debug.ShouldStop(256);
_resultado = configuracion.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);
 };
 BA.debugLineNum = 236;BA.debugLine="Return Resultado";
Debug.ShouldStop(2048);
if (true) return _resultado;
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}