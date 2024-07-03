package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class fxglobales {
private static fxglobales mostCurrent = new fxglobales();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.servbackup4 _servbackup4 = null;
public b4a.example.principal _principal = null;
public b4a.example.datosglobales _datosglobales = null;
public b4a.example.login _login = null;
public b4a.example.configuracion _configuracion = null;
public b4a.example.servbackup3 _servbackup3 = null;
public b4a.example.servbackup2 _servbackup2 = null;
public b4a.example.backup _backup = null;
public b4a.example.servbackup _servbackup = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public static String  _right(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "right", false))
	 {return ((String) Debug.delegate(null, "right", new Object[] {_ba,_text,_length}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub Right(Text As String, Length As Int) As String";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Return Text.SubString(Text.Length-Length)";
if (true) return _text.substring((int) (_text.length()-_length));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public static String  _left(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "left", false))
	 {return ((String) Debug.delegate(null, "left", new Object[] {_ba,_text,_length}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Left(Text As String, Length As Int)As String";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Return Text.SubString2(0, Length)";
if (true) return _text.substring((int) (0),_length);
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="End Sub";
return "";
}
public static String  _obtenerhoraproximaejecucion(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "obtenerhoraproximaejecucion", false))
	 {return ((String) Debug.delegate(null, "obtenerhoraproximaejecucion", new Object[] {_ba}));}
long _ahora = 0L;
int _segundosasumar = 0;
long _nuevahora = 0L;
String _horaformateada = "";
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub ObtenerHoraProximaEjecucion() As String";
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="Dim ahora As Long";
_ahora = 0L;
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="ahora = DateTime.Now";
_ahora = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Dim segundosASumar As Int";
_segundosasumar = 0;
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="segundosASumar = DatosGlobales.Segundos '60  ' Po";
_segundosasumar = mostCurrent._datosglobales._segundos /*int*/ ;
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="Dim nuevaHora As Long";
_nuevahora = 0L;
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="nuevaHora = ahora + segundosASumar * 1000  ' Conv";
_nuevahora = (long) (_ahora+_segundosasumar*1000);
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="Dim horaFormateada As String";
_horaformateada = "";
RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="horaFormateada = DateTime.Time(nuevaHora)";
_horaformateada = anywheresoftware.b4a.keywords.Common.DateTime.Time(_nuevahora);
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="Return horaFormateada";
if (true) return _horaformateada;
RDebugUtils.currentLine=4063253;
 //BA.debugLineNum = 4063253;BA.debugLine="End Sub";
return "";
}
public static int  _cint(anywheresoftware.b4a.BA _ba,Object _o) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "cint", false))
	 {return ((Integer) Debug.delegate(null, "cint", new Object[] {_ba,_o}));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub CInt(o As Object) As Int";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Return Floor(o)";
if (true) return (int) (anywheresoftware.b4a.keywords.Common.Floor((double)(BA.ObjectToNumber(_o))));
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return 0;
}
public static String  _mid(anywheresoftware.b4a.BA _ba,String _text,int _start,int _length) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "mid", false))
	 {return ((String) Debug.delegate(null, "mid", new Object[] {_ba,_text,_start,_length}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub Mid(Text As String, Start As Int, Length As In";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Return Text.SubString2(Start-1,Start+Length-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_length-1));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return "";
}
public static long  _clng(anywheresoftware.b4a.BA _ba,Object _o) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "clng", false))
	 {return ((Long) Debug.delegate(null, "clng", new Object[] {_ba,_o}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub CLng(o As Object) As Long";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Return Floor(o)";
if (true) return (long) (anywheresoftware.b4a.keywords.Common.Floor((double)(BA.ObjectToNumber(_o))));
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return 0L;
}
public static String  _crearelxml(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "crearelxml", false))
	 {return ((String) Debug.delegate(null, "crearelxml", new Object[] {_ba}));}
String _archivoxml = "";
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public  Sub CrearElXML As String";
RDebugUtils.currentLine=3997739;
 //BA.debugLineNum = 3997739;BA.debugLine="Dim ArchivoXml As String = \"<?xml version=\"\"\"\"1.0";
_archivoxml = "<?xml version=\"\"1.0\"\" encoding=\"\"UTF-8\"\"?>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997740;
 //BA.debugLineNum = 3997740;BA.debugLine="ArchivoXml = ArchivoXml & \"<fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"<fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997741;
 //BA.debugLineNum = 3997741;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997743;
 //BA.debugLineNum = 3997743;BA.debugLine="ArchivoXml = ArchivoXml & \" <login>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997744;
 //BA.debugLineNum = 3997744;BA.debugLine="ArchivoXml = ArchivoXml & \"   <usuario></usuario>";
_archivoxml = _archivoxml+"   <usuario></usuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997745;
 //BA.debugLineNum = 3997745;BA.debugLine="ArchivoXml = ArchivoXml & \"   <contraseña></contr";
_archivoxml = _archivoxml+"   <contraseña></contraseña>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997746;
 //BA.debugLineNum = 3997746;BA.debugLine="ArchivoXml = ArchivoXml & \"   <recordar></recorda";
_archivoxml = _archivoxml+"   <recordar></recordar>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997747;
 //BA.debugLineNum = 3997747;BA.debugLine="ArchivoXml = ArchivoXml & \" </login>\"  & CRLF & \"";
_archivoxml = _archivoxml+" </login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997749;
 //BA.debugLineNum = 3997749;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997750;
 //BA.debugLineNum = 3997750;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_origen>\" & CRLF";
_archivoxml = _archivoxml+" <ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997751;
 //BA.debugLineNum = 3997751;BA.debugLine="ArchivoXml = ArchivoXml & \"   <fotoscamara></foto";
_archivoxml = _archivoxml+"   <fotoscamara></fotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997752;
 //BA.debugLineNum = 3997752;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoscamara></vid";
_archivoxml = _archivoxml+"   <videoscamara></videoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997753;
 //BA.debugLineNum = 3997753;BA.debugLine="ArchivoXml = ArchivoXml & \"   <imageneswhatsapp><";
_archivoxml = _archivoxml+"   <imageneswhatsapp></imageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997754;
 //BA.debugLineNum = 3997754;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoswhatsapp></v";
_archivoxml = _archivoxml+"   <videoswhatsapp></videoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997755;
 //BA.debugLineNum = 3997755;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chfotoscamara>0</c";
_archivoxml = _archivoxml+"   <chfotoscamara>0</chfotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997756;
 //BA.debugLineNum = 3997756;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoscamara>0</";
_archivoxml = _archivoxml+"   <chvideoscamara>0</chvideoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997757;
 //BA.debugLineNum = 3997757;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chimageneswhatsapp";
_archivoxml = _archivoxml+"   <chimageneswhatsapp>0</chimageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997758;
 //BA.debugLineNum = 3997758;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoswhatsapp>0";
_archivoxml = _archivoxml+"   <chvideoswhatsapp>0</chvideoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997759;
 //BA.debugLineNum = 3997759;BA.debugLine="ArchivoXml = ArchivoXml & \"   <primeravez>1</prim";
_archivoxml = _archivoxml+"   <primeravez>1</primeravez>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997760;
 //BA.debugLineNum = 3997760;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_origen>\" & CRL";
_archivoxml = _archivoxml+" </ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997762;
 //BA.debugLineNum = 3997762;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997763;
 //BA.debugLineNum = 3997763;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_destino>\" & CRL";
_archivoxml = _archivoxml+" <ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997764;
 //BA.debugLineNum = 3997764;BA.debugLine="ArchivoXml = ArchivoXml & \"   <UsuarioRutaFotos><";
_archivoxml = _archivoxml+"   <UsuarioRutaFotos></UsuarioRutaFotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997765;
 //BA.debugLineNum = 3997765;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_destino>\" & CR";
_archivoxml = _archivoxml+" </ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997766;
 //BA.debugLineNum = 3997766;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997768;
 //BA.debugLineNum = 3997768;BA.debugLine="ArchivoXml = ArchivoXml & \" <ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997769;
 //BA.debugLineNum = 3997769;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorruta></ser";
_archivoxml = _archivoxml+"   <servidorruta></servidorruta>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997770;
 //BA.debugLineNum = 3997770;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorip></servi";
_archivoxml = _archivoxml+"   <servidorip></servidorip>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997771;
 //BA.debugLineNum = 3997771;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorpuerto></s";
_archivoxml = _archivoxml+"   <servidorpuerto></servidorpuerto>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997772;
 //BA.debugLineNum = 3997772;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorusuario></";
_archivoxml = _archivoxml+"   <servidorusuario></servidorusuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997773;
 //BA.debugLineNum = 3997773;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorclave></se";
_archivoxml = _archivoxml+"   <servidorclave></servidorclave>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997774;
 //BA.debugLineNum = 3997774;BA.debugLine="ArchivoXml = ArchivoXml & \" </ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" </ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997776;
 //BA.debugLineNum = 3997776;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997777;
 //BA.debugLineNum = 3997777;BA.debugLine="ArchivoXml = ArchivoXml & \"</fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"</fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=3997778;
 //BA.debugLineNum = 3997778;BA.debugLine="Return ArchivoXml";
if (true) return _archivoxml;
RDebugUtils.currentLine=3997782;
 //BA.debugLineNum = 3997782;BA.debugLine="End Sub";
return "";
}
public static String  _cstr(anywheresoftware.b4a.BA _ba,Object _o) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "cstr", false))
	 {return ((String) Debug.delegate(null, "cstr", new Object[] {_ba,_o}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub CStr(o As Object) As String";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public static String  _desencriptar(anywheresoftware.b4a.BA _ba,String _ingresado) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "desencriptar", false))
	 {return ((String) Debug.delegate(null, "desencriptar", new Object[] {_ba,_ingresado}));}
String _desencriptado = "";
String _resultado = "";
anywheresoftware.b4a.object.B4XEncryption _c = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
byte[] _e = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub DesEncriptar(Ingresado As String) As S";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim DesEncriptado As String = \"\"";
_desencriptado = "";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Dim Resultado As String = \"\"";
_resultado = "";
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Dim c As B4XCipher";
_c = new anywheresoftware.b4a.object.B4XEncryption();
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Dim e() As Byte";
_e = new byte[(int) (0)];
;
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="e = su.DecodeBase64(Ingresado)";
_e = _su.DecodeBase64(_ingresado);
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="e = c.Decrypt(e,DatosGlobales.PalabraClave)";
_e = _c.Decrypt(_e,mostCurrent._datosglobales._palabraclave /*String*/ );
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="DesEncriptado = BytesToString(e, 0, e.Length, \"u";
_desencriptado = anywheresoftware.b4a.keywords.Common.BytesToString(_e,(int) (0),_e.length,"utf8");
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="Resultado = DesEncriptado";
_resultado = _desencriptado;
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="Return Resultado";
if (true) return _resultado;
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="End Sub";
return "";
}
public static String  _encriptar(anywheresoftware.b4a.BA _ba,String _ingresado) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "encriptar", false))
	 {return ((String) Debug.delegate(null, "encriptar", new Object[] {_ba,_ingresado}));}
String _encriptado = "";
String _resultado = "";
anywheresoftware.b4a.object.B4XEncryption _c = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
byte[] _e = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub Encriptar(Ingresado As String) As Stri";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim Encriptado As String = \"\"";
_encriptado = "";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim Resultado As String = \"\"";
_resultado = "";
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Dim c As B4XCipher";
_c = new anywheresoftware.b4a.object.B4XEncryption();
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="Dim e() As Byte";
_e = new byte[(int) (0)];
;
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="e = c.Encrypt(Ingresado.GetBytes(\"utf8\"), DatosG";
_e = _c.Encrypt(_ingresado.getBytes("utf8"),mostCurrent._datosglobales._palabraclave /*String*/ );
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="Encriptado = su.EncodeBase64(e)";
_encriptado = _su.EncodeBase64(_e);
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="Resultado = Encriptado";
_resultado = _encriptado;
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="Return Resultado";
if (true) return _resultado;
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="End Sub";
return "";
}
public static String  _getparamfromxml(anywheresoftware.b4a.BA _ba,String _sxml,String _parametername) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "getparamfromxml", false))
	 {return ((String) Debug.delegate(null, "getparamfromxml", new Object[] {_ba,_sxml,_parametername}));}
int _i1 = 0;
int _i2 = 0;
String _t1 = "";
String _t2 = "";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub GetParamFromXML(sXML As String, ParameterName";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim i1, i2 As Int";
_i1 = 0;
_i2 = 0;
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim t1, t2 As String";
_t1 = "";
_t2 = "";
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="t1 = \"<\" & ParameterName & \">\"";
_t1 = "<"+_parametername+">";
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="t2 = \"</\" & ParameterName & \">\"";
_t2 = "</"+_parametername+">";
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="i1 = sXML.IndexOf(t1)";
_i1 = _sxml.indexOf(_t1);
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="i2 = sXML.IndexOf(t2)";
_i2 = _sxml.indexOf(_t2);
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="If i1<0 Then";
if (_i1<0) { 
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="LogColor(\"Not found in XML: \" & ParameterName, C";
anywheresoftware.b4a.keywords.Common.LogImpl("53932172","Not found in XML: "+_parametername,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="ToastMessageShow(\"Not found in XML: \" & Paramete";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Not found in XML: "+_parametername),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="Return(\"0\")";
if (true) return ("0");
 };
RDebugUtils.currentLine=3932177;
 //BA.debugLineNum = 3932177;BA.debugLine="LogColor(\"From XML: \" & ParameterName & \" = \" & s";
anywheresoftware.b4a.keywords.Common.LogImpl("53932177","From XML: "+_parametername+" = "+_sxml.substring((int) (_i1+_t1.length()),_i2),anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=3932181;
 //BA.debugLineNum = 3932181;BA.debugLine="Return(sXML.SubString2(i1+t1.Length, i2))";
if (true) return (_sxml.substring((int) (_i1+_t1.length()),_i2));
RDebugUtils.currentLine=3932183;
 //BA.debugLineNum = 3932183;BA.debugLine="End Sub";
return "";
}
public static String  _leerxml(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "leerxml", false))
	 {return ((String) Debug.delegate(null, "leerxml", new Object[] {_ba}));}
String _texto = "";
String _unxml = "";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub LeerXML()";
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="If File.Exists(File.DirInternal,\"config.xml\") = T";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"config.xml")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="Dim texto As String = File.ReadString(File.DirIn";
_texto = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"config.xml");
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="DatosGlobales.XML_Usuario = GetParamFromXML(text";
mostCurrent._datosglobales._xml_usuario /*String*/  = _getparamfromxml(_ba,_texto,"usuario");
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="DatosGlobales.XML_Contraseña = GetParamFromXML(t";
mostCurrent._datosglobales._xml_contraseña /*String*/  = _getparamfromxml(_ba,_texto,"contraseña");
RDebugUtils.currentLine=3866640;
 //BA.debugLineNum = 3866640;BA.debugLine="DatosGlobales.XML_Recordar = GetParamFromXML(tex";
mostCurrent._datosglobales._xml_recordar /*String*/  = _getparamfromxml(_ba,_texto,"recordar");
RDebugUtils.currentLine=3866647;
 //BA.debugLineNum = 3866647;BA.debugLine="DatosGlobales.XML_FotosCamara =  GetParamFromXML";
mostCurrent._datosglobales._xml_fotoscamara /*String*/  = _getparamfromxml(_ba,_texto,"fotoscamara");
RDebugUtils.currentLine=3866648;
 //BA.debugLineNum = 3866648;BA.debugLine="DatosGlobales.XML_VideosCamara =  GetParamFromXM";
mostCurrent._datosglobales._xml_videoscamara /*String*/  = _getparamfromxml(_ba,_texto,"videoscamara");
RDebugUtils.currentLine=3866649;
 //BA.debugLineNum = 3866649;BA.debugLine="DatosGlobales.XML_ImagenesWhatsApp =  GetParamFr";
mostCurrent._datosglobales._xml_imageneswhatsapp /*String*/  = _getparamfromxml(_ba,_texto,"imageneswhatsapp");
RDebugUtils.currentLine=3866650;
 //BA.debugLineNum = 3866650;BA.debugLine="DatosGlobales.XML_VideosWhatsApp =  GetParamFrom";
mostCurrent._datosglobales._xml_videoswhatsapp /*String*/  = _getparamfromxml(_ba,_texto,"videoswhatsapp");
RDebugUtils.currentLine=3866653;
 //BA.debugLineNum = 3866653;BA.debugLine="DatosGlobales.XML_ChFotosCamara = GetParamFromXM";
mostCurrent._datosglobales._xml_chfotoscamara /*String*/  = _getparamfromxml(_ba,_texto,"chfotoscamara");
RDebugUtils.currentLine=3866654;
 //BA.debugLineNum = 3866654;BA.debugLine="DatosGlobales.XML_ChVideosCamara = GetParamFromX";
mostCurrent._datosglobales._xml_chvideoscamara /*String*/  = _getparamfromxml(_ba,_texto,"chvideoscamara");
RDebugUtils.currentLine=3866655;
 //BA.debugLineNum = 3866655;BA.debugLine="DatosGlobales.XML_ChImagenesWhatsApp = GetParamF";
mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/  = _getparamfromxml(_ba,_texto,"chimageneswhatsapp");
RDebugUtils.currentLine=3866656;
 //BA.debugLineNum = 3866656;BA.debugLine="DatosGlobales.XML_ChVideosWhatsApp = GetParamFro";
mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/  = _getparamfromxml(_ba,_texto,"chvideoswhatsapp");
RDebugUtils.currentLine=3866658;
 //BA.debugLineNum = 3866658;BA.debugLine="DatosGlobales.XML_PrimeraVez = GetParamFromXML(t";
mostCurrent._datosglobales._xml_primeravez /*String*/  = _getparamfromxml(_ba,_texto,"primeravez");
RDebugUtils.currentLine=3866661;
 //BA.debugLineNum = 3866661;BA.debugLine="Log(\"Cargando primera vez: \" & DatosGlobales.XML";
anywheresoftware.b4a.keywords.Common.LogImpl("53866661","Cargando primera vez: "+mostCurrent._datosglobales._xml_primeravez /*String*/ ,0);
RDebugUtils.currentLine=3866665;
 //BA.debugLineNum = 3866665;BA.debugLine="DatosGlobales.XML_UsuarioRutaFotos = GetParamFro";
mostCurrent._datosglobales._xml_usuariorutafotos /*String*/  = _getparamfromxml(_ba,_texto,"UsuarioRutaFotos");
RDebugUtils.currentLine=3866668;
 //BA.debugLineNum = 3866668;BA.debugLine="DatosGlobales.XML_ServidorRuta = GetParamFromXML";
mostCurrent._datosglobales._xml_servidorruta /*String*/  = _getparamfromxml(_ba,_texto,"servidorruta");
RDebugUtils.currentLine=3866669;
 //BA.debugLineNum = 3866669;BA.debugLine="DatosGlobales.XML_ServidorIp = GetParamFromXML(t";
mostCurrent._datosglobales._xml_servidorip /*String*/  = _getparamfromxml(_ba,_texto,"servidorip");
RDebugUtils.currentLine=3866670;
 //BA.debugLineNum = 3866670;BA.debugLine="DatosGlobales.XML_ServidorPuerto = GetParamFromX";
mostCurrent._datosglobales._xml_servidorpuerto /*String*/  = _getparamfromxml(_ba,_texto,"servidorpuerto");
RDebugUtils.currentLine=3866671;
 //BA.debugLineNum = 3866671;BA.debugLine="DatosGlobales.XML_ServidorUsuario = GetParamFrom";
mostCurrent._datosglobales._xml_servidorusuario /*String*/  = _getparamfromxml(_ba,_texto,"servidorusuario");
RDebugUtils.currentLine=3866672;
 //BA.debugLineNum = 3866672;BA.debugLine="DatosGlobales.XML_ServidorClave = GetParamFromXM";
mostCurrent._datosglobales._xml_servidorclave /*String*/  = _getparamfromxml(_ba,_texto,"servidorclave");
RDebugUtils.currentLine=3866677;
 //BA.debugLineNum = 3866677;BA.debugLine="DatosGlobales.ServidorRuta = DatosGlobales.XML_S";
mostCurrent._datosglobales._servidorruta /*String*/  = mostCurrent._datosglobales._xml_servidorruta /*String*/ ;
RDebugUtils.currentLine=3866678;
 //BA.debugLineNum = 3866678;BA.debugLine="DatosGlobales.ServidorIp = DatosGlobales.XML_Ser";
mostCurrent._datosglobales._servidorip /*String*/  = mostCurrent._datosglobales._xml_servidorip /*String*/ ;
RDebugUtils.currentLine=3866679;
 //BA.debugLineNum = 3866679;BA.debugLine="DatosGlobales.ServidorPuerto = DatosGlobales.XML";
mostCurrent._datosglobales._servidorpuerto /*String*/  = mostCurrent._datosglobales._xml_servidorpuerto /*String*/ ;
RDebugUtils.currentLine=3866680;
 //BA.debugLineNum = 3866680;BA.debugLine="DatosGlobales.ServidorUsuario = DatosGlobales.XM";
mostCurrent._datosglobales._servidorusuario /*String*/  = mostCurrent._datosglobales._xml_servidorusuario /*String*/ ;
RDebugUtils.currentLine=3866681;
 //BA.debugLineNum = 3866681;BA.debugLine="DatosGlobales.ServidorClave = DatosGlobales.XML_";
mostCurrent._datosglobales._servidorclave /*String*/  = mostCurrent._datosglobales._xml_servidorclave /*String*/ ;
RDebugUtils.currentLine=3866685;
 //BA.debugLineNum = 3866685;BA.debugLine="DatosGlobales.UsuarioRutaFotos = DatosGlobales.S";
mostCurrent._datosglobales._usuariorutafotos /*String*/  = mostCurrent._datosglobales._servidorruta /*String*/ +mostCurrent._datosglobales._xml_usuariorutafotos /*String*/ ;
RDebugUtils.currentLine=3866686;
 //BA.debugLineNum = 3866686;BA.debugLine="DatosGlobales.UsuarioRutaVideos = DatosGlobales.";
mostCurrent._datosglobales._usuariorutavideos /*String*/  = mostCurrent._datosglobales._servidorruta /*String*/ +mostCurrent._datosglobales._xml_usuariorutafotos /*String*/ ;
RDebugUtils.currentLine=3866690;
 //BA.debugLineNum = 3866690;BA.debugLine="DatosGlobales.MobilRutaFotosCamara = DatosGlobal";
mostCurrent._datosglobales._mobilrutafotoscamara /*String*/  = mostCurrent._datosglobales._xml_fotoscamara /*String*/ ;
RDebugUtils.currentLine=3866691;
 //BA.debugLineNum = 3866691;BA.debugLine="DatosGlobales.MobilRutaVideosCamara = DatosGloba";
mostCurrent._datosglobales._mobilrutavideoscamara /*String*/  = mostCurrent._datosglobales._xml_videoscamara /*String*/ ;
RDebugUtils.currentLine=3866692;
 //BA.debugLineNum = 3866692;BA.debugLine="DatosGlobales.MobilRutaImagenesWhapp = DatosGlob";
mostCurrent._datosglobales._mobilrutaimageneswhapp /*String*/  = mostCurrent._datosglobales._xml_imageneswhatsapp /*String*/ ;
RDebugUtils.currentLine=3866693;
 //BA.debugLineNum = 3866693;BA.debugLine="DatosGlobales.MobilRutaVideosWhapp = DatosGlobal";
mostCurrent._datosglobales._mobilrutavideoswhapp /*String*/  = mostCurrent._datosglobales._xml_videoswhatsapp /*String*/ ;
RDebugUtils.currentLine=3866697;
 //BA.debugLineNum = 3866697;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Initialize";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=3866700;
 //BA.debugLineNum = 3866700;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Clear";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=3866703;
 //BA.debugLineNum = 3866703;BA.debugLine="If DatosGlobales.XML_ChFotosCamara = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chfotoscamara /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=3866704;
 //BA.debugLineNum = 3866704;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("MobilRutaFotos;"+mostCurrent._datosglobales._mobilrutafotoscamara /*String*/ ));
 };
RDebugUtils.currentLine=3866707;
 //BA.debugLineNum = 3866707;BA.debugLine="If DatosGlobales.XML_ChVideosCamara = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chvideoscamara /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=3866708;
 //BA.debugLineNum = 3866708;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("MobilRutaVideos;"+mostCurrent._datosglobales._mobilrutavideoscamara /*String*/ ));
 };
RDebugUtils.currentLine=3866711;
 //BA.debugLineNum = 3866711;BA.debugLine="If DatosGlobales.XML_ChImagenesWhatsApp = \"1\" Th";
if ((mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=3866712;
 //BA.debugLineNum = 3866712;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("MobilRutaFotosWhapp;"+mostCurrent._datosglobales._mobilrutaimageneswhapp /*String*/ ));
 };
RDebugUtils.currentLine=3866715;
 //BA.debugLineNum = 3866715;BA.debugLine="If DatosGlobales.XML_ChVideosWhatsApp = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=3866716;
 //BA.debugLineNum = 3866716;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("MobilRutaVideosWhapp;"+mostCurrent._datosglobales._mobilrutavideoswhapp /*String*/ ));
 };
 }else {
RDebugUtils.currentLine=3866721;
 //BA.debugLineNum = 3866721;BA.debugLine="Dim unXml As String = CrearElXML";
_unxml = _crearelxml(_ba);
RDebugUtils.currentLine=3866722;
 //BA.debugLineNum = 3866722;BA.debugLine="File.WriteString(File.DirInternal,\"config.xml\",u";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"config.xml",_unxml);
 };
RDebugUtils.currentLine=3866727;
 //BA.debugLineNum = 3866727;BA.debugLine="If File.Exists(File.DirInternal,\"indicefullbkp.tx";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3866729;
 //BA.debugLineNum = 3866729;BA.debugLine="DatosGlobales.IndiceFullBkp = File.ReadString(Fi";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt")));
RDebugUtils.currentLine=3866730;
 //BA.debugLineNum = 3866730;BA.debugLine="If DatosGlobales.IndiceFullBkp > 2 Then";
if (mostCurrent._datosglobales._indicefullbkp /*int*/ >2) { 
RDebugUtils.currentLine=3866731;
 //BA.debugLineNum = 3866731;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int) (mostCurrent._datosglobales._indicefullbkp /*int*/ -3);
 }else 
{RDebugUtils.currentLine=3866732;
 //BA.debugLineNum = 3866732;BA.debugLine="Else If DatosGlobales.IndiceFullBkp > 1 Then";
if (mostCurrent._datosglobales._indicefullbkp /*int*/ >1) { 
RDebugUtils.currentLine=3866733;
 //BA.debugLineNum = 3866733;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int) (mostCurrent._datosglobales._indicefullbkp /*int*/ -2);
 }else 
{RDebugUtils.currentLine=3866734;
 //BA.debugLineNum = 3866734;BA.debugLine="Else If DatosGlobales.IndiceFullBkp > 0 Then";
if (mostCurrent._datosglobales._indicefullbkp /*int*/ >0) { 
RDebugUtils.currentLine=3866735;
 //BA.debugLineNum = 3866735;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int) (mostCurrent._datosglobales._indicefullbkp /*int*/ -1);
 }}}
;
 }else {
RDebugUtils.currentLine=3866740;
 //BA.debugLineNum = 3866740;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullbkp";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt","-1");
RDebugUtils.currentLine=3866741;
 //BA.debugLineNum = 3866741;BA.debugLine="DatosGlobales.IndiceFullBkp = File.ReadString(Fi";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt")));
 };
RDebugUtils.currentLine=3866745;
 //BA.debugLineNum = 3866745;BA.debugLine="Log(\"INDICE FULL BACKUP: \" & DatosGlobales.Indice";
anywheresoftware.b4a.keywords.Common.LogImpl("53866745","INDICE FULL BACKUP: "+BA.NumberToString(mostCurrent._datosglobales._indicefullbkp /*int*/ ),0);
RDebugUtils.currentLine=3866747;
 //BA.debugLineNum = 3866747;BA.debugLine="End Sub";
return "";
}
public static String  _ltrim(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "ltrim", false))
	 {return ((String) Debug.delegate(null, "ltrim", new Object[] {_ba,_s}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub LTrim(s As String) As String";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"^(\\s+)\", s)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(\\s+)",_s);
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Return s.SubString(m.GetEnd(1))";
if (true) return _s.substring(_m.GetEnd((int) (1)));
 }else {
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Return s";
if (true) return _s;
 };
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="End Sub";
return "";
}
public static String  _rtrim(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "rtrim", false))
	 {return ((String) Debug.delegate(null, "rtrim", new Object[] {_ba,_s}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub RTrim(s As String) As String";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\s+)$\", s)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("(\\s+)$",_s);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Return s.SubString(m.GetEnd(1))";
if (true) return _s.substring(_m.GetEnd((int) (1)));
 }else {
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="Return s";
if (true) return _s;
 };
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="End Sub";
return "";
}
public static String[]  _split(anywheresoftware.b4a.BA _ba,String _text,String _delimiter) throws Exception{
RDebugUtils.currentModule="fxglobales";
if (Debug.shouldDelegate(null, "split", false))
	 {return ((String[]) Debug.delegate(null, "split", new Object[] {_ba,_text,_delimiter}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub Split(Text As String, Delimiter As String) As";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Return Regex.Split(Delimiter,Text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.Split(_delimiter,_text);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return null;
}
}