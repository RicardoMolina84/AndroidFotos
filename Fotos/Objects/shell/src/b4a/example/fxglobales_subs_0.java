package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class fxglobales_subs_0 {


public static RemoteObject  _cint(RemoteObject _ba,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CInt (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,38);
if (RapidSub.canDelegate("cint")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","cint", _ba, _o);}
;
Debug.locals.put("o", _o);
 BA.debugLineNum = 38;BA.debugLine="Sub CInt(o As Object) As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Return Floor(o)";
Debug.ShouldStop(64);
if (true) return BA.numberCast(int.class, fxglobales.mostCurrent.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _o))));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clng(RemoteObject _ba,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CLng (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,42);
if (RapidSub.canDelegate("clng")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","clng", _ba, _o);}
;
Debug.locals.put("o", _o);
 BA.debugLineNum = 42;BA.debugLine="Sub CLng(o As Object) As Long";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Return Floor(o)";
Debug.ShouldStop(1024);
if (true) return BA.numberCast(long.class, fxglobales.mostCurrent.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _o))));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearelxml(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CrearElXML (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,274);
if (RapidSub.canDelegate("crearelxml")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","crearelxml", _ba);}
RemoteObject _archivoxml = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 274;BA.debugLine="Public  Sub CrearElXML As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 317;BA.debugLine="Dim ArchivoXml As String = \"<?xml version=\"\"\"\"1.0";
Debug.ShouldStop(268435456);
_archivoxml = RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"\"1.0\"\" encoding=\"\"UTF-8\"\"?>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 318;BA.debugLine="ArchivoXml = ArchivoXml & \"<fotos>\" & CRLF & \"\"";
Debug.ShouldStop(536870912);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("<fotos>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 319;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(1073741824);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 321;BA.debugLine="ArchivoXml = ArchivoXml & \" <login>\" & CRLF & \"\"";
Debug.ShouldStop(1);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <login>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 322;BA.debugLine="ArchivoXml = ArchivoXml & \"   <usuario></usuario>";
Debug.ShouldStop(2);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <usuario></usuario>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 323;BA.debugLine="ArchivoXml = ArchivoXml & \"   <contraseña></contr";
Debug.ShouldStop(4);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <contraseña></contraseña>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 324;BA.debugLine="ArchivoXml = ArchivoXml & \"   <recordar></recorda";
Debug.ShouldStop(8);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <recordar></recordar>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 325;BA.debugLine="ArchivoXml = ArchivoXml & \" </login>\"  & CRLF & \"";
Debug.ShouldStop(16);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </login>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 327;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(64);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 328;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_origen>\" & CRLF";
Debug.ShouldStop(128);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <ruta_origen>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 329;BA.debugLine="ArchivoXml = ArchivoXml & \"   <fotoscamara></foto";
Debug.ShouldStop(256);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <fotoscamara></fotoscamara>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 330;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoscamara></vid";
Debug.ShouldStop(512);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <videoscamara></videoscamara>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 331;BA.debugLine="ArchivoXml = ArchivoXml & \"   <imageneswhatsapp><";
Debug.ShouldStop(1024);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <imageneswhatsapp></imageneswhatsapp>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 332;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoswhatsapp></v";
Debug.ShouldStop(2048);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <videoswhatsapp></videoswhatsapp>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 333;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chfotoscamara>0</c";
Debug.ShouldStop(4096);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chfotoscamara>0</chfotoscamara>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 334;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoscamara>0</";
Debug.ShouldStop(8192);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chvideoscamara>0</chvideoscamara>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 335;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chimageneswhatsapp";
Debug.ShouldStop(16384);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chimageneswhatsapp>0</chimageneswhatsapp>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 336;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoswhatsapp>0";
Debug.ShouldStop(32768);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chvideoswhatsapp>0</chvideoswhatsapp>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 337;BA.debugLine="ArchivoXml = ArchivoXml & \"   <primeravez>1</prim";
Debug.ShouldStop(65536);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <primeravez>1</primeravez>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 338;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_origen>\" & CRL";
Debug.ShouldStop(131072);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </ruta_origen>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 340;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(524288);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 341;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_destino>\" & CRL";
Debug.ShouldStop(1048576);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <ruta_destino>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 342;BA.debugLine="ArchivoXml = ArchivoXml & \"   <UsuarioRutaFotos><";
Debug.ShouldStop(2097152);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <UsuarioRutaFotos></UsuarioRutaFotos>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 343;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_destino>\" & CR";
Debug.ShouldStop(4194304);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </ruta_destino>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 344;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(8388608);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 346;BA.debugLine="ArchivoXml = ArchivoXml & \" <ftp>\" & CRLF & \"\"";
Debug.ShouldStop(33554432);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <ftp>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 347;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorruta></ser";
Debug.ShouldStop(67108864);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorruta></servidorruta>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 348;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorip></servi";
Debug.ShouldStop(134217728);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorip></servidorip>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 349;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorpuerto></s";
Debug.ShouldStop(268435456);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorpuerto></servidorpuerto>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 350;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorusuario></";
Debug.ShouldStop(536870912);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorusuario></servidorusuario>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 351;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorclave></se";
Debug.ShouldStop(1073741824);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorclave></servidorclave>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 352;BA.debugLine="ArchivoXml = ArchivoXml & \" </ftp>\" & CRLF & \"\"";
Debug.ShouldStop(-2147483648);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </ftp>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 354;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(2);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 355;BA.debugLine="ArchivoXml = ArchivoXml & \"</fotos>\" & CRLF & \"\"";
Debug.ShouldStop(4);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("</fotos>"),fxglobales.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 356;BA.debugLine="Return ArchivoXml";
Debug.ShouldStop(8);
if (true) return _archivoxml;
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cstr(RemoteObject _ba,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CStr (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,34);
if (RapidSub.canDelegate("cstr")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","cstr", _ba, _o);}
;
Debug.locals.put("o", _o);
 BA.debugLineNum = 34;BA.debugLine="Sub CStr(o As Object) As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Return \"\" & o";
Debug.ShouldStop(4);
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_o);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _desencriptar(RemoteObject _ba,RemoteObject _ingresado) throws Exception{
try {
		Debug.PushSubsStack("DesEncriptar (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,99);
if (RapidSub.canDelegate("desencriptar")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","desencriptar", _ba, _ingresado);}
RemoteObject _desencriptado = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.createImmutable("");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.object.B4XEncryption");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _e = null;
;
Debug.locals.put("Ingresado", _ingresado);
 BA.debugLineNum = 99;BA.debugLine="Public Sub DesEncriptar(Ingresado As String) As S";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Dim DesEncriptado As String = \"\"";
Debug.ShouldStop(8);
_desencriptado = BA.ObjectToString("");Debug.locals.put("DesEncriptado", _desencriptado);Debug.locals.put("DesEncriptado", _desencriptado);
 BA.debugLineNum = 101;BA.debugLine="Dim Resultado As String = \"\"";
Debug.ShouldStop(16);
_resultado = BA.ObjectToString("");Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 102;BA.debugLine="Dim c As B4XCipher";
Debug.ShouldStop(32);
_c = RemoteObject.createNew ("anywheresoftware.b4a.object.B4XEncryption");Debug.locals.put("c", _c);
 BA.debugLineNum = 103;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(64);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 104;BA.debugLine="Dim e() As Byte";
Debug.ShouldStop(128);
_e = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("e", _e);
 BA.debugLineNum = 106;BA.debugLine="e = su.DecodeBase64(Ingresado)";
Debug.ShouldStop(512);
_e = _su.runMethod(false,"DecodeBase64",(Object)(_ingresado));Debug.locals.put("e", _e);
 BA.debugLineNum = 107;BA.debugLine="e = c.Decrypt(e,DatosGlobales.PalabraClave)";
Debug.ShouldStop(1024);
_e = _c.runMethod(false,"Decrypt",(Object)(_e),(Object)(fxglobales.mostCurrent._datosglobales._palabraclave /*RemoteObject*/ ));Debug.locals.put("e", _e);
 BA.debugLineNum = 108;BA.debugLine="DesEncriptado = BytesToString(e, 0, e.Length, \"u";
Debug.ShouldStop(2048);
_desencriptado = fxglobales.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_e),(Object)(BA.numberCast(int.class, 0)),(Object)(_e.getField(true,"length")),(Object)(RemoteObject.createImmutable("utf8")));Debug.locals.put("DesEncriptado", _desencriptado);
 BA.debugLineNum = 109;BA.debugLine="Resultado = DesEncriptado";
Debug.ShouldStop(4096);
_resultado = _desencriptado;Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 110;BA.debugLine="Return Resultado";
Debug.ShouldStop(8192);
if (true) return _resultado;
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _encriptar(RemoteObject _ba,RemoteObject _ingresado) throws Exception{
try {
		Debug.PushSubsStack("Encriptar (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,85);
if (RapidSub.canDelegate("encriptar")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","encriptar", _ba, _ingresado);}
RemoteObject _encriptado = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.createImmutable("");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.object.B4XEncryption");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _e = null;
;
Debug.locals.put("Ingresado", _ingresado);
 BA.debugLineNum = 85;BA.debugLine="Public Sub Encriptar(Ingresado As String) As Stri";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Dim Encriptado As String = \"\"";
Debug.ShouldStop(2097152);
_encriptado = BA.ObjectToString("");Debug.locals.put("Encriptado", _encriptado);Debug.locals.put("Encriptado", _encriptado);
 BA.debugLineNum = 87;BA.debugLine="Dim Resultado As String = \"\"";
Debug.ShouldStop(4194304);
_resultado = BA.ObjectToString("");Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 88;BA.debugLine="Dim c As B4XCipher";
Debug.ShouldStop(8388608);
_c = RemoteObject.createNew ("anywheresoftware.b4a.object.B4XEncryption");Debug.locals.put("c", _c);
 BA.debugLineNum = 89;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(16777216);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 90;BA.debugLine="Dim e() As Byte";
Debug.ShouldStop(33554432);
_e = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("e", _e);
 BA.debugLineNum = 92;BA.debugLine="e = c.Encrypt(Ingresado.GetBytes(\"utf8\"), DatosG";
Debug.ShouldStop(134217728);
_e = _c.runMethod(false,"Encrypt",(Object)(_ingresado.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("utf8")))),(Object)(fxglobales.mostCurrent._datosglobales._palabraclave /*RemoteObject*/ ));Debug.locals.put("e", _e);
 BA.debugLineNum = 93;BA.debugLine="Encriptado = su.EncodeBase64(e)";
Debug.ShouldStop(268435456);
_encriptado = _su.runMethod(true,"EncodeBase64",(Object)(_e));Debug.locals.put("Encriptado", _encriptado);
 BA.debugLineNum = 94;BA.debugLine="Resultado = Encriptado";
Debug.ShouldStop(536870912);
_resultado = _encriptado;Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 96;BA.debugLine="Return Resultado";
Debug.ShouldStop(-2147483648);
if (true) return _resultado;
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparamfromxml(RemoteObject _ba,RemoteObject _sxml,RemoteObject _parametername) throws Exception{
try {
		Debug.PushSubsStack("GetParamFromXML (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,245);
if (RapidSub.canDelegate("getparamfromxml")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","getparamfromxml", _ba, _sxml, _parametername);}
RemoteObject _i1 = RemoteObject.createImmutable(0);
RemoteObject _i2 = RemoteObject.createImmutable(0);
RemoteObject _t1 = RemoteObject.createImmutable("");
RemoteObject _t2 = RemoteObject.createImmutable("");
;
Debug.locals.put("sXML", _sxml);
Debug.locals.put("ParameterName", _parametername);
 BA.debugLineNum = 245;BA.debugLine="Sub GetParamFromXML(sXML As String, ParameterName";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="Dim i1, i2 As Int";
Debug.ShouldStop(2097152);
_i1 = RemoteObject.createImmutable(0);Debug.locals.put("i1", _i1);
_i2 = RemoteObject.createImmutable(0);Debug.locals.put("i2", _i2);
 BA.debugLineNum = 247;BA.debugLine="Dim t1, t2 As String";
Debug.ShouldStop(4194304);
_t1 = RemoteObject.createImmutable("");Debug.locals.put("t1", _t1);
_t2 = RemoteObject.createImmutable("");Debug.locals.put("t2", _t2);
 BA.debugLineNum = 250;BA.debugLine="t1 = \"<\" & ParameterName & \">\"";
Debug.ShouldStop(33554432);
_t1 = RemoteObject.concat(RemoteObject.createImmutable("<"),_parametername,RemoteObject.createImmutable(">"));Debug.locals.put("t1", _t1);
 BA.debugLineNum = 251;BA.debugLine="t2 = \"</\" & ParameterName & \">\"";
Debug.ShouldStop(67108864);
_t2 = RemoteObject.concat(RemoteObject.createImmutable("</"),_parametername,RemoteObject.createImmutable(">"));Debug.locals.put("t2", _t2);
 BA.debugLineNum = 252;BA.debugLine="i1 = sXML.IndexOf(t1)";
Debug.ShouldStop(134217728);
_i1 = _sxml.runMethod(true,"indexOf",(Object)(_t1));Debug.locals.put("i1", _i1);
 BA.debugLineNum = 253;BA.debugLine="i2 = sXML.IndexOf(t2)";
Debug.ShouldStop(268435456);
_i2 = _sxml.runMethod(true,"indexOf",(Object)(_t2));Debug.locals.put("i2", _i2);
 BA.debugLineNum = 256;BA.debugLine="If i1<0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",_i1,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 257;BA.debugLine="LogColor(\"Not found in XML: \" & ParameterName, C";
Debug.ShouldStop(1);
fxglobales.mostCurrent.__c.runVoidMethod ("LogImpl","53932172",RemoteObject.concat(RemoteObject.createImmutable("Not found in XML: "),_parametername),fxglobales.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 258;BA.debugLine="ToastMessageShow(\"Not found in XML: \" & Paramete";
Debug.ShouldStop(2);
fxglobales.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Not found in XML: "),_parametername))),(Object)(fxglobales.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 259;BA.debugLine="Return(\"0\")";
Debug.ShouldStop(4);
if (true) return (RemoteObject.createImmutable("0"));
 };
 BA.debugLineNum = 262;BA.debugLine="LogColor(\"From XML: \" & ParameterName & \" = \" & s";
Debug.ShouldStop(32);
fxglobales.mostCurrent.__c.runVoidMethod ("LogImpl","53932177",RemoteObject.concat(RemoteObject.createImmutable("From XML: "),_parametername,RemoteObject.createImmutable(" = "),_sxml.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i1,_t1.runMethod(true,"length")}, "+",1, 1)),(Object)(_i2))),fxglobales.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 266;BA.debugLine="Return(sXML.SubString2(i1+t1.Length, i2))";
Debug.ShouldStop(512);
if (true) return (_sxml.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i1,_t1.runMethod(true,"length")}, "+",1, 1)),(Object)(_i2)));
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _leerxml(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("LeerXML (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,120);
if (RapidSub.canDelegate("leerxml")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","leerxml", _ba);}
RemoteObject _texto = RemoteObject.createImmutable("");
RemoteObject _unxml = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 120;BA.debugLine="Public Sub LeerXML()";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 125;BA.debugLine="If File.Exists(File.DirInternal,\"config.xml\") = T";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("config.xml"))),fxglobales.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 127;BA.debugLine="Dim texto As String = File.ReadString(File.DirIn";
Debug.ShouldStop(1073741824);
_texto = fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("config.xml")));Debug.locals.put("texto", _texto);Debug.locals.put("texto", _texto);
 BA.debugLineNum = 134;BA.debugLine="DatosGlobales.XML_Usuario = GetParamFromXML(text";
Debug.ShouldStop(32);
fxglobales.mostCurrent._datosglobales._xml_usuario /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("usuario"));
 BA.debugLineNum = 135;BA.debugLine="DatosGlobales.XML_Contraseña = GetParamFromXML(t";
Debug.ShouldStop(64);
fxglobales.mostCurrent._datosglobales._xml_contraseña /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("contraseña"));
 BA.debugLineNum = 136;BA.debugLine="DatosGlobales.XML_Recordar = GetParamFromXML(tex";
Debug.ShouldStop(128);
fxglobales.mostCurrent._datosglobales._xml_recordar /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("recordar"));
 BA.debugLineNum = 143;BA.debugLine="DatosGlobales.XML_FotosCamara =  GetParamFromXML";
Debug.ShouldStop(16384);
fxglobales.mostCurrent._datosglobales._xml_fotoscamara /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("fotoscamara"));
 BA.debugLineNum = 144;BA.debugLine="DatosGlobales.XML_VideosCamara =  GetParamFromXM";
Debug.ShouldStop(32768);
fxglobales.mostCurrent._datosglobales._xml_videoscamara /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("videoscamara"));
 BA.debugLineNum = 145;BA.debugLine="DatosGlobales.XML_ImagenesWhatsApp =  GetParamFr";
Debug.ShouldStop(65536);
fxglobales.mostCurrent._datosglobales._xml_imageneswhatsapp /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("imageneswhatsapp"));
 BA.debugLineNum = 146;BA.debugLine="DatosGlobales.XML_VideosWhatsApp =  GetParamFrom";
Debug.ShouldStop(131072);
fxglobales.mostCurrent._datosglobales._xml_videoswhatsapp /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("videoswhatsapp"));
 BA.debugLineNum = 149;BA.debugLine="DatosGlobales.XML_ChFotosCamara = GetParamFromXM";
Debug.ShouldStop(1048576);
fxglobales.mostCurrent._datosglobales._xml_chfotoscamara /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("chfotoscamara"));
 BA.debugLineNum = 150;BA.debugLine="DatosGlobales.XML_ChVideosCamara = GetParamFromX";
Debug.ShouldStop(2097152);
fxglobales.mostCurrent._datosglobales._xml_chvideoscamara /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("chvideoscamara"));
 BA.debugLineNum = 151;BA.debugLine="DatosGlobales.XML_ChImagenesWhatsApp = GetParamF";
Debug.ShouldStop(4194304);
fxglobales.mostCurrent._datosglobales._xml_chimageneswhatsapp /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("chimageneswhatsapp"));
 BA.debugLineNum = 152;BA.debugLine="DatosGlobales.XML_ChVideosWhatsApp = GetParamFro";
Debug.ShouldStop(8388608);
fxglobales.mostCurrent._datosglobales._xml_chvideoswhatsapp /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("chvideoswhatsapp"));
 BA.debugLineNum = 154;BA.debugLine="DatosGlobales.XML_PrimeraVez = GetParamFromXML(t";
Debug.ShouldStop(33554432);
fxglobales.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("primeravez"));
 BA.debugLineNum = 157;BA.debugLine="Log(\"Cargando primera vez: \" & DatosGlobales.XML";
Debug.ShouldStop(268435456);
fxglobales.mostCurrent.__c.runVoidMethod ("LogImpl","53866661",RemoteObject.concat(RemoteObject.createImmutable("Cargando primera vez: "),fxglobales.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ),0);
 BA.debugLineNum = 161;BA.debugLine="DatosGlobales.XML_UsuarioRutaFotos = GetParamFro";
Debug.ShouldStop(1);
fxglobales.mostCurrent._datosglobales._xml_usuariorutafotos /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("UsuarioRutaFotos"));
 BA.debugLineNum = 164;BA.debugLine="DatosGlobales.XML_ServidorRuta = GetParamFromXML";
Debug.ShouldStop(8);
fxglobales.mostCurrent._datosglobales._xml_servidorruta /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("servidorruta"));
 BA.debugLineNum = 165;BA.debugLine="DatosGlobales.XML_ServidorIp = GetParamFromXML(t";
Debug.ShouldStop(16);
fxglobales.mostCurrent._datosglobales._xml_servidorip /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("servidorip"));
 BA.debugLineNum = 166;BA.debugLine="DatosGlobales.XML_ServidorPuerto = GetParamFromX";
Debug.ShouldStop(32);
fxglobales.mostCurrent._datosglobales._xml_servidorpuerto /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("servidorpuerto"));
 BA.debugLineNum = 167;BA.debugLine="DatosGlobales.XML_ServidorUsuario = GetParamFrom";
Debug.ShouldStop(64);
fxglobales.mostCurrent._datosglobales._xml_servidorusuario /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("servidorusuario"));
 BA.debugLineNum = 168;BA.debugLine="DatosGlobales.XML_ServidorClave = GetParamFromXM";
Debug.ShouldStop(128);
fxglobales.mostCurrent._datosglobales._xml_servidorclave /*RemoteObject*/  = _getparamfromxml(_ba,_texto,RemoteObject.createImmutable("servidorclave"));
 BA.debugLineNum = 173;BA.debugLine="DatosGlobales.ServidorRuta = DatosGlobales.XML_S";
Debug.ShouldStop(4096);
fxglobales.mostCurrent._datosglobales._servidorruta /*RemoteObject*/  = fxglobales.mostCurrent._datosglobales._xml_servidorruta /*RemoteObject*/ ;
 BA.debugLineNum = 174;BA.debugLine="DatosGlobales.ServidorIp = DatosGlobales.XML_Ser";
Debug.ShouldStop(8192);
fxglobales.mostCurrent._datosglobales._servidorip /*RemoteObject*/  = fxglobales.mostCurrent._datosglobales._xml_servidorip /*RemoteObject*/ ;
 BA.debugLineNum = 175;BA.debugLine="DatosGlobales.ServidorPuerto = DatosGlobales.XML";
Debug.ShouldStop(16384);
fxglobales.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/  = fxglobales.mostCurrent._datosglobales._xml_servidorpuerto /*RemoteObject*/ ;
 BA.debugLineNum = 176;BA.debugLine="DatosGlobales.ServidorUsuario = DatosGlobales.XM";
Debug.ShouldStop(32768);
fxglobales.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/  = fxglobales.mostCurrent._datosglobales._xml_servidorusuario /*RemoteObject*/ ;
 BA.debugLineNum = 177;BA.debugLine="DatosGlobales.ServidorClave = DatosGlobales.XML_";
Debug.ShouldStop(65536);
fxglobales.mostCurrent._datosglobales._servidorclave /*RemoteObject*/  = fxglobales.mostCurrent._datosglobales._xml_servidorclave /*RemoteObject*/ ;
 BA.debugLineNum = 181;BA.debugLine="DatosGlobales.UsuarioRutaFotos = DatosGlobales.S";
Debug.ShouldStop(1048576);
fxglobales.mostCurrent._datosglobales._usuariorutafotos /*RemoteObject*/  = RemoteObject.concat(fxglobales.mostCurrent._datosglobales._servidorruta /*RemoteObject*/ ,fxglobales.mostCurrent._datosglobales._xml_usuariorutafotos /*RemoteObject*/ );
 BA.debugLineNum = 182;BA.debugLine="DatosGlobales.UsuarioRutaVideos = DatosGlobales.";
Debug.ShouldStop(2097152);
fxglobales.mostCurrent._datosglobales._usuariorutavideos /*RemoteObject*/  = RemoteObject.concat(fxglobales.mostCurrent._datosglobales._servidorruta /*RemoteObject*/ ,fxglobales.mostCurrent._datosglobales._xml_usuariorutafotos /*RemoteObject*/ );
 BA.debugLineNum = 186;BA.debugLine="DatosGlobales.MobilRutaFotosCamara = DatosGlobal";
Debug.ShouldStop(33554432);
fxglobales.mostCurrent._datosglobales._mobilrutafotoscamara /*RemoteObject*/  = fxglobales.mostCurrent._datosglobales._xml_fotoscamara /*RemoteObject*/ ;
 BA.debugLineNum = 187;BA.debugLine="DatosGlobales.MobilRutaVideosCamara = DatosGloba";
Debug.ShouldStop(67108864);
fxglobales.mostCurrent._datosglobales._mobilrutavideoscamara /*RemoteObject*/  = fxglobales.mostCurrent._datosglobales._xml_videoscamara /*RemoteObject*/ ;
 BA.debugLineNum = 188;BA.debugLine="DatosGlobales.MobilRutaImagenesWhapp = DatosGlob";
Debug.ShouldStop(134217728);
fxglobales.mostCurrent._datosglobales._mobilrutaimageneswhapp /*RemoteObject*/  = fxglobales.mostCurrent._datosglobales._xml_imageneswhatsapp /*RemoteObject*/ ;
 BA.debugLineNum = 189;BA.debugLine="DatosGlobales.MobilRutaVideosWhapp = DatosGlobal";
Debug.ShouldStop(268435456);
fxglobales.mostCurrent._datosglobales._mobilrutavideoswhapp /*RemoteObject*/  = fxglobales.mostCurrent._datosglobales._xml_videoswhatsapp /*RemoteObject*/ ;
 BA.debugLineNum = 193;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Initialize";
Debug.ShouldStop(1);
fxglobales.mostCurrent._datosglobales._colmobilrutaorigen /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 196;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Clear";
Debug.ShouldStop(8);
fxglobales.mostCurrent._datosglobales._colmobilrutaorigen /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 199;BA.debugLine="If DatosGlobales.XML_ChFotosCamara = \"1\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",fxglobales.mostCurrent._datosglobales._xml_chfotoscamara /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 200;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
Debug.ShouldStop(128);
fxglobales.mostCurrent._datosglobales._colmobilrutaorigen /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("MobilRutaFotos;"),fxglobales.mostCurrent._datosglobales._mobilrutafotoscamara /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 203;BA.debugLine="If DatosGlobales.XML_ChVideosCamara = \"1\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",fxglobales.mostCurrent._datosglobales._xml_chvideoscamara /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 204;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
Debug.ShouldStop(2048);
fxglobales.mostCurrent._datosglobales._colmobilrutaorigen /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("MobilRutaVideos;"),fxglobales.mostCurrent._datosglobales._mobilrutavideoscamara /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 207;BA.debugLine="If DatosGlobales.XML_ChImagenesWhatsApp = \"1\" Th";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",fxglobales.mostCurrent._datosglobales._xml_chimageneswhatsapp /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 208;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
Debug.ShouldStop(32768);
fxglobales.mostCurrent._datosglobales._colmobilrutaorigen /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("MobilRutaFotosWhapp;"),fxglobales.mostCurrent._datosglobales._mobilrutaimageneswhapp /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 211;BA.debugLine="If DatosGlobales.XML_ChVideosWhatsApp = \"1\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",fxglobales.mostCurrent._datosglobales._xml_chvideoswhatsapp /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
 BA.debugLineNum = 212;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
Debug.ShouldStop(524288);
fxglobales.mostCurrent._datosglobales._colmobilrutaorigen /*RemoteObject*/ .runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("MobilRutaVideosWhapp;"),fxglobales.mostCurrent._datosglobales._mobilrutavideoswhapp /*RemoteObject*/ ))));
 };
 }else {
 BA.debugLineNum = 217;BA.debugLine="Dim unXml As String = CrearElXML";
Debug.ShouldStop(16777216);
_unxml = _crearelxml(_ba);Debug.locals.put("unXml", _unxml);Debug.locals.put("unXml", _unxml);
 BA.debugLineNum = 218;BA.debugLine="File.WriteString(File.DirInternal,\"config.xml\",u";
Debug.ShouldStop(33554432);
fxglobales.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("config.xml")),(Object)(_unxml));
 };
 BA.debugLineNum = 223;BA.debugLine="If File.Exists(File.DirInternal,\"indicefullbkp.tx";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("indicefullbkp.txt"))),fxglobales.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 225;BA.debugLine="DatosGlobales.IndiceFullBkp = File.ReadString(Fi";
Debug.ShouldStop(1);
fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/  = BA.numberCast(int.class, fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("indicefullbkp.txt"))));
 BA.debugLineNum = 226;BA.debugLine="If DatosGlobales.IndiceFullBkp > 2 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/ ,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 227;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
Debug.ShouldStop(4);
fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/ ,RemoteObject.createImmutable(3)}, "-",1, 1);
 }else 
{ BA.debugLineNum = 228;BA.debugLine="Else If DatosGlobales.IndiceFullBkp > 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 229;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
Debug.ShouldStop(16);
fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/ ,RemoteObject.createImmutable(2)}, "-",1, 1);
 }else 
{ BA.debugLineNum = 230;BA.debugLine="Else If DatosGlobales.IndiceFullBkp > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 231;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
Debug.ShouldStop(64);
fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "-",1, 1);
 }}}
;
 }else {
 BA.debugLineNum = 236;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullbkp";
Debug.ShouldStop(2048);
fxglobales.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("indicefullbkp.txt")),(Object)(RemoteObject.createImmutable("-1")));
 BA.debugLineNum = 237;BA.debugLine="DatosGlobales.IndiceFullBkp = File.ReadString(Fi";
Debug.ShouldStop(4096);
fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/  = BA.numberCast(int.class, fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(fxglobales.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("indicefullbkp.txt"))));
 };
 BA.debugLineNum = 241;BA.debugLine="Log(\"INDICE FULL BACKUP: \" & DatosGlobales.Indice";
Debug.ShouldStop(65536);
fxglobales.mostCurrent.__c.runVoidMethod ("LogImpl","53866745",RemoteObject.concat(RemoteObject.createImmutable("INDICE FULL BACKUP: "),fxglobales.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/ ),0);
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _left(RemoteObject _ba,RemoteObject _text,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Left (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,11);
if (RapidSub.canDelegate("left")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","left", _ba, _text, _length);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 11;BA.debugLine="Sub Left(Text As String, Length As Int)As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_length,BA.numberCast(double.class, _text.runMethod(true,"length")))) { 
_length = _text.runMethod(true,"length");Debug.locals.put("Length", _length);};
 BA.debugLineNum = 13;BA.debugLine="Return Text.SubString2(0, Length)";
Debug.ShouldStop(4096);
if (true) return _text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_length));
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ltrim(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("LTrim (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,48);
if (RapidSub.canDelegate("ltrim")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","ltrim", _ba, _s);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
;
Debug.locals.put("s", _s);
 BA.debugLineNum = 48;BA.debugLine="Sub LTrim(s As String) As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"^(\\s+)\", s)";
Debug.ShouldStop(65536);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = fxglobales.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^(\\s+)")),(Object)(_s));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 50;BA.debugLine="If m.Find Then";
Debug.ShouldStop(131072);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 51;BA.debugLine="Return s.SubString(m.GetEnd(1))";
Debug.ShouldStop(262144);
if (true) return _s.runMethod(true,"substring",(Object)(_m.runMethod(true,"GetEnd",(Object)(BA.numberCast(int.class, 1)))));
 }else {
 BA.debugLineNum = 53;BA.debugLine="Return s";
Debug.ShouldStop(1048576);
if (true) return _s;
 };
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
public static RemoteObject  _mid(RemoteObject _ba,RemoteObject _text,RemoteObject _start,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Mid (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,21);
if (RapidSub.canDelegate("mid")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","mid", _ba, _text, _start, _length);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Start", _start);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 21;BA.debugLine="Sub Mid(Text As String, Start As Int, Length As In";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Return Text.SubString2(Start-1,Start+Length-1)";
Debug.ShouldStop(2097152);
if (true) return _text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_start,RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_start,_length,RemoteObject.createImmutable(1)}, "+-",2, 1)));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _obtenerhoraproximaejecucion(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("ObtenerHoraProximaEjecucion (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,370);
if (RapidSub.canDelegate("obtenerhoraproximaejecucion")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","obtenerhoraproximaejecucion", _ba);}
RemoteObject _ahora = RemoteObject.createImmutable(0L);
RemoteObject _segundosasumar = RemoteObject.createImmutable(0);
RemoteObject _nuevahora = RemoteObject.createImmutable(0L);
RemoteObject _horaformateada = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 370;BA.debugLine="Public Sub ObtenerHoraProximaEjecucion() As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 374;BA.debugLine="Dim ahora As Long";
Debug.ShouldStop(2097152);
_ahora = RemoteObject.createImmutable(0L);Debug.locals.put("ahora", _ahora);
 BA.debugLineNum = 375;BA.debugLine="ahora = DateTime.Now";
Debug.ShouldStop(4194304);
_ahora = fxglobales.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("ahora", _ahora);
 BA.debugLineNum = 378;BA.debugLine="Dim segundosASumar As Int";
Debug.ShouldStop(33554432);
_segundosasumar = RemoteObject.createImmutable(0);Debug.locals.put("segundosASumar", _segundosasumar);
 BA.debugLineNum = 379;BA.debugLine="segundosASumar = DatosGlobales.Segundos '60  ' Po";
Debug.ShouldStop(67108864);
_segundosasumar = fxglobales.mostCurrent._datosglobales._segundos /*RemoteObject*/ ;Debug.locals.put("segundosASumar", _segundosasumar);
 BA.debugLineNum = 382;BA.debugLine="Dim nuevaHora As Long";
Debug.ShouldStop(536870912);
_nuevahora = RemoteObject.createImmutable(0L);Debug.locals.put("nuevaHora", _nuevahora);
 BA.debugLineNum = 383;BA.debugLine="nuevaHora = ahora + segundosASumar * 1000  ' Conv";
Debug.ShouldStop(1073741824);
_nuevahora = RemoteObject.solve(new RemoteObject[] {_ahora,_segundosasumar,RemoteObject.createImmutable(1000)}, "+*",1, 2);Debug.locals.put("nuevaHora", _nuevahora);
 BA.debugLineNum = 386;BA.debugLine="Dim horaFormateada As String";
Debug.ShouldStop(2);
_horaformateada = RemoteObject.createImmutable("");Debug.locals.put("horaFormateada", _horaformateada);
 BA.debugLineNum = 387;BA.debugLine="horaFormateada = DateTime.Time(nuevaHora)";
Debug.ShouldStop(4);
_horaformateada = fxglobales.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_nuevahora));Debug.locals.put("horaFormateada", _horaformateada);
 BA.debugLineNum = 389;BA.debugLine="Return horaFormateada";
Debug.ShouldStop(16);
if (true) return _horaformateada;
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _right(RemoteObject _ba,RemoteObject _text,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Right (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,16);
if (RapidSub.canDelegate("right")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","right", _ba, _text, _length);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 16;BA.debugLine="Sub Right(Text As String, Length As Int) As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_length,BA.numberCast(double.class, _text.runMethod(true,"length")))) { 
_length = _text.runMethod(true,"length");Debug.locals.put("Length", _length);};
 BA.debugLineNum = 18;BA.debugLine="Return Text.SubString(Text.Length-Length)";
Debug.ShouldStop(131072);
if (true) return _text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_text.runMethod(true,"length"),_length}, "-",1, 1)));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rtrim(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("RTrim (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,57);
if (RapidSub.canDelegate("rtrim")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","rtrim", _ba, _s);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
;
Debug.locals.put("s", _s);
 BA.debugLineNum = 57;BA.debugLine="Sub RTrim(s As String) As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\s+)$\", s)";
Debug.ShouldStop(33554432);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = fxglobales.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("(\\s+)$")),(Object)(_s));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 59;BA.debugLine="If m.Find Then";
Debug.ShouldStop(67108864);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 60;BA.debugLine="Return s.SubString(m.GetEnd(1))";
Debug.ShouldStop(134217728);
if (true) return _s.runMethod(true,"substring",(Object)(_m.runMethod(true,"GetEnd",(Object)(BA.numberCast(int.class, 1)))));
 }else {
 BA.debugLineNum = 62;BA.debugLine="Return s";
Debug.ShouldStop(536870912);
if (true) return _s;
 };
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _split(RemoteObject _ba,RemoteObject _text,RemoteObject _delimiter) throws Exception{
try {
		Debug.PushSubsStack("Split (fxglobales) ","fxglobales",4,_ba,fxglobales.mostCurrent,25);
if (RapidSub.canDelegate("split")) { return b4a.example.fxglobales.remoteMe.runUserSub(false, "fxglobales","split", _ba, _text, _delimiter);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Delimiter", _delimiter);
 BA.debugLineNum = 25;BA.debugLine="Sub Split(Text As String, Delimiter As String) As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Return Regex.Split(Delimiter,Text)";
Debug.ShouldStop(33554432);
if (true) return fxglobales.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(_delimiter),(Object)(_text));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}