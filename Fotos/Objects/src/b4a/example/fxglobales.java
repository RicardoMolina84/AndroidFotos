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
public b4a.example.backup _backup = null;
public b4a.example.servbackup _servbackup = null;
public b4a.example.servbackup2 _servbackup2 = null;
public b4a.example.servbackup3 _servbackup3 = null;
public b4a.example.starter _starter = null;
public static int  _cint(anywheresoftware.b4a.BA _ba,Object _o) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub CInt(o As Object) As Int";
 //BA.debugLineNum = 39;BA.debugLine="Return Floor(o)";
if (true) return (int) (anywheresoftware.b4a.keywords.Common.Floor((double)(BA.ObjectToNumber(_o))));
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return 0;
}
public static long  _clng(anywheresoftware.b4a.BA _ba,Object _o) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub CLng(o As Object) As Long";
 //BA.debugLineNum = 43;BA.debugLine="Return Floor(o)";
if (true) return (long) (anywheresoftware.b4a.keywords.Common.Floor((double)(BA.ObjectToNumber(_o))));
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return 0L;
}
public static String  _crearelxml(anywheresoftware.b4a.BA _ba) throws Exception{
String _archivoxml = "";
 //BA.debugLineNum = 274;BA.debugLine="Public  Sub CrearElXML As String";
 //BA.debugLineNum = 317;BA.debugLine="Dim ArchivoXml As String = \"<?xml version=\"\"\"\"1.0";
_archivoxml = "<?xml version=\"\"1.0\"\" encoding=\"\"UTF-8\"\"?>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 318;BA.debugLine="ArchivoXml = ArchivoXml & \"<fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"<fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 319;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 321;BA.debugLine="ArchivoXml = ArchivoXml & \" <login>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 322;BA.debugLine="ArchivoXml = ArchivoXml & \"   <usuario></usuario>";
_archivoxml = _archivoxml+"   <usuario></usuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 323;BA.debugLine="ArchivoXml = ArchivoXml & \"   <contraseña></contr";
_archivoxml = _archivoxml+"   <contraseña></contraseña>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 324;BA.debugLine="ArchivoXml = ArchivoXml & \"   <recordar></recorda";
_archivoxml = _archivoxml+"   <recordar></recordar>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 325;BA.debugLine="ArchivoXml = ArchivoXml & \" </login>\"  & CRLF & \"";
_archivoxml = _archivoxml+" </login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 327;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 328;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_origen>\" & CRLF";
_archivoxml = _archivoxml+" <ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 329;BA.debugLine="ArchivoXml = ArchivoXml & \"   <fotoscamara></foto";
_archivoxml = _archivoxml+"   <fotoscamara></fotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 330;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoscamara></vid";
_archivoxml = _archivoxml+"   <videoscamara></videoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 331;BA.debugLine="ArchivoXml = ArchivoXml & \"   <imageneswhatsapp><";
_archivoxml = _archivoxml+"   <imageneswhatsapp></imageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 332;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoswhatsapp></v";
_archivoxml = _archivoxml+"   <videoswhatsapp></videoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 333;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chfotoscamara>0</c";
_archivoxml = _archivoxml+"   <chfotoscamara>0</chfotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 334;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoscamara>0</";
_archivoxml = _archivoxml+"   <chvideoscamara>0</chvideoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 335;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chimageneswhatsapp";
_archivoxml = _archivoxml+"   <chimageneswhatsapp>0</chimageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 336;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoswhatsapp>0";
_archivoxml = _archivoxml+"   <chvideoswhatsapp>0</chvideoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 337;BA.debugLine="ArchivoXml = ArchivoXml & \"   <primeravez>1</prim";
_archivoxml = _archivoxml+"   <primeravez>1</primeravez>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 338;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_origen>\" & CRL";
_archivoxml = _archivoxml+" </ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 340;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 341;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_destino>\" & CRL";
_archivoxml = _archivoxml+" <ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 342;BA.debugLine="ArchivoXml = ArchivoXml & \"   <UsuarioRutaFotos><";
_archivoxml = _archivoxml+"   <UsuarioRutaFotos></UsuarioRutaFotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 343;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_destino>\" & CR";
_archivoxml = _archivoxml+" </ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 344;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 346;BA.debugLine="ArchivoXml = ArchivoXml & \" <ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 347;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorruta></ser";
_archivoxml = _archivoxml+"   <servidorruta></servidorruta>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 348;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorip></servi";
_archivoxml = _archivoxml+"   <servidorip></servidorip>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 349;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorpuerto></s";
_archivoxml = _archivoxml+"   <servidorpuerto></servidorpuerto>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 350;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorusuario></";
_archivoxml = _archivoxml+"   <servidorusuario></servidorusuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 351;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorclave></se";
_archivoxml = _archivoxml+"   <servidorclave></servidorclave>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 352;BA.debugLine="ArchivoXml = ArchivoXml & \" </ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" </ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 354;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 355;BA.debugLine="ArchivoXml = ArchivoXml & \"</fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"</fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 356;BA.debugLine="Return ArchivoXml";
if (true) return _archivoxml;
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public static String  _cstr(anywheresoftware.b4a.BA _ba,Object _o) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 35;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _desencriptar(anywheresoftware.b4a.BA _ba,String _ingresado) throws Exception{
String _desencriptado = "";
String _resultado = "";
anywheresoftware.b4a.object.B4XEncryption _c = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
byte[] _e = null;
 //BA.debugLineNum = 99;BA.debugLine="Public Sub DesEncriptar(Ingresado As String) As S";
 //BA.debugLineNum = 100;BA.debugLine="Dim DesEncriptado As String = \"\"";
_desencriptado = "";
 //BA.debugLineNum = 101;BA.debugLine="Dim Resultado As String = \"\"";
_resultado = "";
 //BA.debugLineNum = 102;BA.debugLine="Dim c As B4XCipher";
_c = new anywheresoftware.b4a.object.B4XEncryption();
 //BA.debugLineNum = 103;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 104;BA.debugLine="Dim e() As Byte";
_e = new byte[(int) (0)];
;
 //BA.debugLineNum = 106;BA.debugLine="e = su.DecodeBase64(Ingresado)";
_e = _su.DecodeBase64(_ingresado);
 //BA.debugLineNum = 107;BA.debugLine="e = c.Decrypt(e,DatosGlobales.PalabraClave)";
_e = _c.Decrypt(_e,mostCurrent._datosglobales._palabraclave /*String*/ );
 //BA.debugLineNum = 108;BA.debugLine="DesEncriptado = BytesToString(e, 0, e.Length, \"u";
_desencriptado = anywheresoftware.b4a.keywords.Common.BytesToString(_e,(int) (0),_e.length,"utf8");
 //BA.debugLineNum = 109;BA.debugLine="Resultado = DesEncriptado";
_resultado = _desencriptado;
 //BA.debugLineNum = 110;BA.debugLine="Return Resultado";
if (true) return _resultado;
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public static String  _encriptar(anywheresoftware.b4a.BA _ba,String _ingresado) throws Exception{
String _encriptado = "";
String _resultado = "";
anywheresoftware.b4a.object.B4XEncryption _c = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
byte[] _e = null;
 //BA.debugLineNum = 85;BA.debugLine="Public Sub Encriptar(Ingresado As String) As Stri";
 //BA.debugLineNum = 86;BA.debugLine="Dim Encriptado As String = \"\"";
_encriptado = "";
 //BA.debugLineNum = 87;BA.debugLine="Dim Resultado As String = \"\"";
_resultado = "";
 //BA.debugLineNum = 88;BA.debugLine="Dim c As B4XCipher";
_c = new anywheresoftware.b4a.object.B4XEncryption();
 //BA.debugLineNum = 89;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 90;BA.debugLine="Dim e() As Byte";
_e = new byte[(int) (0)];
;
 //BA.debugLineNum = 92;BA.debugLine="e = c.Encrypt(Ingresado.GetBytes(\"utf8\"), DatosG";
_e = _c.Encrypt(_ingresado.getBytes("utf8"),mostCurrent._datosglobales._palabraclave /*String*/ );
 //BA.debugLineNum = 93;BA.debugLine="Encriptado = su.EncodeBase64(e)";
_encriptado = _su.EncodeBase64(_e);
 //BA.debugLineNum = 94;BA.debugLine="Resultado = Encriptado";
_resultado = _encriptado;
 //BA.debugLineNum = 96;BA.debugLine="Return Resultado";
if (true) return _resultado;
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public static String  _getparamfromxml(anywheresoftware.b4a.BA _ba,String _sxml,String _parametername) throws Exception{
int _i1 = 0;
int _i2 = 0;
String _t1 = "";
String _t2 = "";
 //BA.debugLineNum = 245;BA.debugLine="Sub GetParamFromXML(sXML As String, ParameterName";
 //BA.debugLineNum = 246;BA.debugLine="Dim i1, i2 As Int";
_i1 = 0;
_i2 = 0;
 //BA.debugLineNum = 247;BA.debugLine="Dim t1, t2 As String";
_t1 = "";
_t2 = "";
 //BA.debugLineNum = 250;BA.debugLine="t1 = \"<\" & ParameterName & \">\"";
_t1 = "<"+_parametername+">";
 //BA.debugLineNum = 251;BA.debugLine="t2 = \"</\" & ParameterName & \">\"";
_t2 = "</"+_parametername+">";
 //BA.debugLineNum = 252;BA.debugLine="i1 = sXML.IndexOf(t1)";
_i1 = _sxml.indexOf(_t1);
 //BA.debugLineNum = 253;BA.debugLine="i2 = sXML.IndexOf(t2)";
_i2 = _sxml.indexOf(_t2);
 //BA.debugLineNum = 256;BA.debugLine="If i1<0 Then";
if (_i1<0) { 
 //BA.debugLineNum = 257;BA.debugLine="LogColor(\"Not found in XML: \" & ParameterName, C";
anywheresoftware.b4a.keywords.Common.LogImpl("64718604","Not found in XML: "+_parametername,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
 //BA.debugLineNum = 258;BA.debugLine="ToastMessageShow(\"Not found in XML: \" & Paramete";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Not found in XML: "+_parametername),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 259;BA.debugLine="Return(\"0\")";
if (true) return ("0");
 };
 //BA.debugLineNum = 262;BA.debugLine="LogColor(\"From XML: \" & ParameterName & \" = \" & s";
anywheresoftware.b4a.keywords.Common.LogImpl("64718609","From XML: "+_parametername+" = "+_sxml.substring((int) (_i1+_t1.length()),_i2),anywheresoftware.b4a.keywords.Common.Colors.Blue);
 //BA.debugLineNum = 266;BA.debugLine="Return(sXML.SubString2(i1+t1.Length, i2))";
if (true) return (_sxml.substring((int) (_i1+_t1.length()),_i2));
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return "";
}
public static String  _leerxml(anywheresoftware.b4a.BA _ba) throws Exception{
String _texto = "";
String _unxml = "";
 //BA.debugLineNum = 120;BA.debugLine="Public Sub LeerXML()";
 //BA.debugLineNum = 125;BA.debugLine="If File.Exists(File.DirInternal,\"config.xml\") = T";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"config.xml")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 127;BA.debugLine="Dim texto As String = File.ReadString(File.DirIn";
_texto = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"config.xml");
 //BA.debugLineNum = 134;BA.debugLine="DatosGlobales.XML_Usuario = GetParamFromXML(text";
mostCurrent._datosglobales._xml_usuario /*String*/  = _getparamfromxml(_ba,_texto,"usuario");
 //BA.debugLineNum = 135;BA.debugLine="DatosGlobales.XML_Contraseña = GetParamFromXML(t";
mostCurrent._datosglobales._xml_contraseña /*String*/  = _getparamfromxml(_ba,_texto,"contraseña");
 //BA.debugLineNum = 136;BA.debugLine="DatosGlobales.XML_Recordar = GetParamFromXML(tex";
mostCurrent._datosglobales._xml_recordar /*String*/  = _getparamfromxml(_ba,_texto,"recordar");
 //BA.debugLineNum = 143;BA.debugLine="DatosGlobales.XML_FotosCamara =  GetParamFromXML";
mostCurrent._datosglobales._xml_fotoscamara /*String*/  = _getparamfromxml(_ba,_texto,"fotoscamara");
 //BA.debugLineNum = 144;BA.debugLine="DatosGlobales.XML_VideosCamara =  GetParamFromXM";
mostCurrent._datosglobales._xml_videoscamara /*String*/  = _getparamfromxml(_ba,_texto,"videoscamara");
 //BA.debugLineNum = 145;BA.debugLine="DatosGlobales.XML_ImagenesWhatsApp =  GetParamFr";
mostCurrent._datosglobales._xml_imageneswhatsapp /*String*/  = _getparamfromxml(_ba,_texto,"imageneswhatsapp");
 //BA.debugLineNum = 146;BA.debugLine="DatosGlobales.XML_VideosWhatsApp =  GetParamFrom";
mostCurrent._datosglobales._xml_videoswhatsapp /*String*/  = _getparamfromxml(_ba,_texto,"videoswhatsapp");
 //BA.debugLineNum = 149;BA.debugLine="DatosGlobales.XML_ChFotosCamara = GetParamFromXM";
mostCurrent._datosglobales._xml_chfotoscamara /*String*/  = _getparamfromxml(_ba,_texto,"chfotoscamara");
 //BA.debugLineNum = 150;BA.debugLine="DatosGlobales.XML_ChVideosCamara = GetParamFromX";
mostCurrent._datosglobales._xml_chvideoscamara /*String*/  = _getparamfromxml(_ba,_texto,"chvideoscamara");
 //BA.debugLineNum = 151;BA.debugLine="DatosGlobales.XML_ChImagenesWhatsApp = GetParamF";
mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/  = _getparamfromxml(_ba,_texto,"chimageneswhatsapp");
 //BA.debugLineNum = 152;BA.debugLine="DatosGlobales.XML_ChVideosWhatsApp = GetParamFro";
mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/  = _getparamfromxml(_ba,_texto,"chvideoswhatsapp");
 //BA.debugLineNum = 154;BA.debugLine="DatosGlobales.XML_PrimeraVez = GetParamFromXML(t";
mostCurrent._datosglobales._xml_primeravez /*String*/  = _getparamfromxml(_ba,_texto,"primeravez");
 //BA.debugLineNum = 157;BA.debugLine="Log(\"Cargando primera vez: \" & DatosGlobales.XML";
anywheresoftware.b4a.keywords.Common.LogImpl("64653093","Cargando primera vez: "+mostCurrent._datosglobales._xml_primeravez /*String*/ ,0);
 //BA.debugLineNum = 161;BA.debugLine="DatosGlobales.XML_UsuarioRutaFotos = GetParamFro";
mostCurrent._datosglobales._xml_usuariorutafotos /*String*/  = _getparamfromxml(_ba,_texto,"UsuarioRutaFotos");
 //BA.debugLineNum = 164;BA.debugLine="DatosGlobales.XML_ServidorRuta = GetParamFromXML";
mostCurrent._datosglobales._xml_servidorruta /*String*/  = _getparamfromxml(_ba,_texto,"servidorruta");
 //BA.debugLineNum = 165;BA.debugLine="DatosGlobales.XML_ServidorIp = GetParamFromXML(t";
mostCurrent._datosglobales._xml_servidorip /*String*/  = _getparamfromxml(_ba,_texto,"servidorip");
 //BA.debugLineNum = 166;BA.debugLine="DatosGlobales.XML_ServidorPuerto = GetParamFromX";
mostCurrent._datosglobales._xml_servidorpuerto /*String*/  = _getparamfromxml(_ba,_texto,"servidorpuerto");
 //BA.debugLineNum = 167;BA.debugLine="DatosGlobales.XML_ServidorUsuario = GetParamFrom";
mostCurrent._datosglobales._xml_servidorusuario /*String*/  = _getparamfromxml(_ba,_texto,"servidorusuario");
 //BA.debugLineNum = 168;BA.debugLine="DatosGlobales.XML_ServidorClave = GetParamFromXM";
mostCurrent._datosglobales._xml_servidorclave /*String*/  = _getparamfromxml(_ba,_texto,"servidorclave");
 //BA.debugLineNum = 173;BA.debugLine="DatosGlobales.ServidorRuta = DatosGlobales.XML_S";
mostCurrent._datosglobales._servidorruta /*String*/  = mostCurrent._datosglobales._xml_servidorruta /*String*/ ;
 //BA.debugLineNum = 174;BA.debugLine="DatosGlobales.ServidorIp = DatosGlobales.XML_Ser";
mostCurrent._datosglobales._servidorip /*String*/  = mostCurrent._datosglobales._xml_servidorip /*String*/ ;
 //BA.debugLineNum = 175;BA.debugLine="DatosGlobales.ServidorPuerto = DatosGlobales.XML";
mostCurrent._datosglobales._servidorpuerto /*String*/  = mostCurrent._datosglobales._xml_servidorpuerto /*String*/ ;
 //BA.debugLineNum = 176;BA.debugLine="DatosGlobales.ServidorUsuario = DatosGlobales.XM";
mostCurrent._datosglobales._servidorusuario /*String*/  = mostCurrent._datosglobales._xml_servidorusuario /*String*/ ;
 //BA.debugLineNum = 177;BA.debugLine="DatosGlobales.ServidorClave = DatosGlobales.XML_";
mostCurrent._datosglobales._servidorclave /*String*/  = mostCurrent._datosglobales._xml_servidorclave /*String*/ ;
 //BA.debugLineNum = 181;BA.debugLine="DatosGlobales.UsuarioRutaFotos = DatosGlobales.S";
mostCurrent._datosglobales._usuariorutafotos /*String*/  = mostCurrent._datosglobales._servidorruta /*String*/ +mostCurrent._datosglobales._xml_usuariorutafotos /*String*/ ;
 //BA.debugLineNum = 182;BA.debugLine="DatosGlobales.UsuarioRutaVideos = DatosGlobales.";
mostCurrent._datosglobales._usuariorutavideos /*String*/  = mostCurrent._datosglobales._servidorruta /*String*/ +mostCurrent._datosglobales._xml_usuariorutafotos /*String*/ ;
 //BA.debugLineNum = 186;BA.debugLine="DatosGlobales.MobilRutaFotosCamara = DatosGlobal";
mostCurrent._datosglobales._mobilrutafotoscamara /*String*/  = mostCurrent._datosglobales._xml_fotoscamara /*String*/ ;
 //BA.debugLineNum = 187;BA.debugLine="DatosGlobales.MobilRutaVideosCamara = DatosGloba";
mostCurrent._datosglobales._mobilrutavideoscamara /*String*/  = mostCurrent._datosglobales._xml_videoscamara /*String*/ ;
 //BA.debugLineNum = 188;BA.debugLine="DatosGlobales.MobilRutaImagenesWhapp = DatosGlob";
mostCurrent._datosglobales._mobilrutaimageneswhapp /*String*/  = mostCurrent._datosglobales._xml_imageneswhatsapp /*String*/ ;
 //BA.debugLineNum = 189;BA.debugLine="DatosGlobales.MobilRutaVideosWhapp = DatosGlobal";
mostCurrent._datosglobales._mobilrutavideoswhapp /*String*/  = mostCurrent._datosglobales._xml_videoswhatsapp /*String*/ ;
 //BA.debugLineNum = 193;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Initialize";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 196;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Clear";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 //BA.debugLineNum = 199;BA.debugLine="If DatosGlobales.XML_ChFotosCamara = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chfotoscamara /*String*/ ).equals("1")) { 
 //BA.debugLineNum = 200;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("MobilRutaFotos;"+mostCurrent._datosglobales._mobilrutafotoscamara /*String*/ ));
 };
 //BA.debugLineNum = 203;BA.debugLine="If DatosGlobales.XML_ChVideosCamara = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chvideoscamara /*String*/ ).equals("1")) { 
 //BA.debugLineNum = 204;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("MobilRutaVideos;"+mostCurrent._datosglobales._mobilrutavideoscamara /*String*/ ));
 };
 //BA.debugLineNum = 207;BA.debugLine="If DatosGlobales.XML_ChImagenesWhatsApp = \"1\" Th";
if ((mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/ ).equals("1")) { 
 //BA.debugLineNum = 208;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("MobilRutaFotosWhapp;"+mostCurrent._datosglobales._mobilrutaimageneswhapp /*String*/ ));
 };
 //BA.debugLineNum = 211;BA.debugLine="If DatosGlobales.XML_ChVideosWhatsApp = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/ ).equals("1")) { 
 //BA.debugLineNum = 212;BA.debugLine="DatosGlobales.ColMobilRutaOrigen.Add(\"MobilRuta";
mostCurrent._datosglobales._colmobilrutaorigen /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("MobilRutaVideosWhapp;"+mostCurrent._datosglobales._mobilrutavideoswhapp /*String*/ ));
 };
 }else {
 //BA.debugLineNum = 217;BA.debugLine="Dim unXml As String = CrearElXML";
_unxml = _crearelxml(_ba);
 //BA.debugLineNum = 218;BA.debugLine="File.WriteString(File.DirInternal,\"config.xml\",u";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"config.xml",_unxml);
 };
 //BA.debugLineNum = 223;BA.debugLine="If File.Exists(File.DirInternal,\"indicefullbkp.tx";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 225;BA.debugLine="DatosGlobales.IndiceFullBkp = File.ReadString(Fi";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt")));
 //BA.debugLineNum = 226;BA.debugLine="If DatosGlobales.IndiceFullBkp > 2 Then";
if (mostCurrent._datosglobales._indicefullbkp /*int*/ >2) { 
 //BA.debugLineNum = 227;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int) (mostCurrent._datosglobales._indicefullbkp /*int*/ -3);
 }else if(mostCurrent._datosglobales._indicefullbkp /*int*/ >1) { 
 //BA.debugLineNum = 229;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int) (mostCurrent._datosglobales._indicefullbkp /*int*/ -2);
 }else if(mostCurrent._datosglobales._indicefullbkp /*int*/ >0) { 
 //BA.debugLineNum = 231;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int) (mostCurrent._datosglobales._indicefullbkp /*int*/ -1);
 };
 }else {
 //BA.debugLineNum = 236;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullbkp";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt","-1");
 //BA.debugLineNum = 237;BA.debugLine="DatosGlobales.IndiceFullBkp = File.ReadString(Fi";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt")));
 };
 //BA.debugLineNum = 241;BA.debugLine="Log(\"INDICE FULL BACKUP: \" & DatosGlobales.Indice";
anywheresoftware.b4a.keywords.Common.LogImpl("64653177","INDICE FULL BACKUP: "+BA.NumberToString(mostCurrent._datosglobales._indicefullbkp /*int*/ ),0);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public static String  _left(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Left(Text As String, Length As Int)As String";
 //BA.debugLineNum = 12;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
 //BA.debugLineNum = 13;BA.debugLine="Return Text.SubString2(0, Length)";
if (true) return _text.substring((int) (0),_length);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public static String  _ltrim(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
 //BA.debugLineNum = 48;BA.debugLine="Sub LTrim(s As String) As String";
 //BA.debugLineNum = 49;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"^(\\s+)\", s)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(\\s+)",_s);
 //BA.debugLineNum = 50;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
 //BA.debugLineNum = 51;BA.debugLine="Return s.SubString(m.GetEnd(1))";
if (true) return _s.substring(_m.GetEnd((int) (1)));
 }else {
 //BA.debugLineNum = 53;BA.debugLine="Return s";
if (true) return _s;
 };
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _mid(anywheresoftware.b4a.BA _ba,String _text,int _start,int _length) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Mid(Text As String, Start As Int, Length As In";
 //BA.debugLineNum = 22;BA.debugLine="Return Text.SubString2(Start-1,Start+Length-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_length-1));
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static String  _obtenerhoraproximaejecucion(anywheresoftware.b4a.BA _ba) throws Exception{
long _ahora = 0L;
int _segundosasumar = 0;
long _nuevahora = 0L;
String _horaformateada = "";
 //BA.debugLineNum = 370;BA.debugLine="Public Sub ObtenerHoraProximaEjecucion() As String";
 //BA.debugLineNum = 374;BA.debugLine="Dim ahora As Long";
_ahora = 0L;
 //BA.debugLineNum = 375;BA.debugLine="ahora = DateTime.Now";
_ahora = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 378;BA.debugLine="Dim segundosASumar As Int";
_segundosasumar = 0;
 //BA.debugLineNum = 379;BA.debugLine="segundosASumar = DatosGlobales.Segundos '60  ' Po";
_segundosasumar = mostCurrent._datosglobales._segundos /*int*/ ;
 //BA.debugLineNum = 382;BA.debugLine="Dim nuevaHora As Long";
_nuevahora = 0L;
 //BA.debugLineNum = 383;BA.debugLine="nuevaHora = ahora + segundosASumar * 1000  ' Conv";
_nuevahora = (long) (_ahora+_segundosasumar*1000);
 //BA.debugLineNum = 386;BA.debugLine="Dim horaFormateada As String";
_horaformateada = "";
 //BA.debugLineNum = 387;BA.debugLine="horaFormateada = DateTime.Time(nuevaHora)";
_horaformateada = anywheresoftware.b4a.keywords.Common.DateTime.Time(_nuevahora);
 //BA.debugLineNum = 389;BA.debugLine="Return horaFormateada";
if (true) return _horaformateada;
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _right(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Right(Text As String, Length As Int) As String";
 //BA.debugLineNum = 17;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
 //BA.debugLineNum = 18;BA.debugLine="Return Text.SubString(Text.Length-Length)";
if (true) return _text.substring((int) (_text.length()-_length));
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _rtrim(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
 //BA.debugLineNum = 57;BA.debugLine="Sub RTrim(s As String) As String";
 //BA.debugLineNum = 58;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\s+)$\", s)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("(\\s+)$",_s);
 //BA.debugLineNum = 59;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
 //BA.debugLineNum = 60;BA.debugLine="Return s.SubString(m.GetEnd(1))";
if (true) return _s.substring(_m.GetEnd((int) (1)));
 }else {
 //BA.debugLineNum = 62;BA.debugLine="Return s";
if (true) return _s;
 };
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String[]  _split(anywheresoftware.b4a.BA _ba,String _text,String _delimiter) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Split(Text As String, Delimiter As String) As";
 //BA.debugLineNum = 26;BA.debugLine="Return Regex.Split(Delimiter,Text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.Split(_delimiter,_text);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
}
