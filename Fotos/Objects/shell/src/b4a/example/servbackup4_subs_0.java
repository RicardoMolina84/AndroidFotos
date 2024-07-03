package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class servbackup4_subs_0 {


public static RemoteObject  _cargarelxml() throws Exception{
try {
		Debug.PushSubsStack("CargarElXML (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,1252);
if (RapidSub.canDelegate("cargarelxml")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","cargarelxml");}
RemoteObject _archivoxml = RemoteObject.createImmutable("");
 BA.debugLineNum = 1252;BA.debugLine="Private Sub CargarElXML As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 1257;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"0\"";
Debug.ShouldStop(256);
servbackup4.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/  = BA.ObjectToString("0");
 BA.debugLineNum = 1262;BA.debugLine="Dim ArchivoXml As String = \"<?xml version=\"\"\"\"1.0";
Debug.ShouldStop(8192);
_archivoxml = RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"\"1.0\"\" encoding=\"\"UTF-8\"\"?>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1263;BA.debugLine="ArchivoXml = ArchivoXml & \"<fotos>\" & CRLF & \"\"";
Debug.ShouldStop(16384);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("<fotos>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1264;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(32768);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1266;BA.debugLine="ArchivoXml = ArchivoXml & \" <login>\" & CRLF & \"\"";
Debug.ShouldStop(131072);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <login>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1267;BA.debugLine="ArchivoXml = ArchivoXml & \"   <usuario>\" & DatosG";
Debug.ShouldStop(262144);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <usuario>"),servbackup4.mostCurrent._datosglobales._xml_usuario /*RemoteObject*/ ,RemoteObject.createImmutable("</usuario>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1268;BA.debugLine="ArchivoXml = ArchivoXml & \"   <contraseña>\" & Dat";
Debug.ShouldStop(524288);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <contraseña>"),servbackup4.mostCurrent._datosglobales._xml_contraseña /*RemoteObject*/ ,RemoteObject.createImmutable("</contraseña>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1269;BA.debugLine="ArchivoXml = ArchivoXml & \"   <recordar>\" & Datos";
Debug.ShouldStop(1048576);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <recordar>"),servbackup4.mostCurrent._datosglobales._xml_recordar /*RemoteObject*/ ,RemoteObject.createImmutable("</recordar>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1270;BA.debugLine="ArchivoXml = ArchivoXml & \" </login>\"  & CRLF & \"";
Debug.ShouldStop(2097152);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </login>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1272;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(8388608);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1273;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_origen>\" & CRLF";
Debug.ShouldStop(16777216);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <ruta_origen>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1274;BA.debugLine="ArchivoXml = ArchivoXml & \"   <fotoscamara>\" & Da";
Debug.ShouldStop(33554432);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <fotoscamara>"),servbackup4.mostCurrent._datosglobales._xml_fotoscamara /*RemoteObject*/ ,RemoteObject.createImmutable("</fotoscamara>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1275;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoscamara>\" & D";
Debug.ShouldStop(67108864);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <videoscamara>"),servbackup4.mostCurrent._datosglobales._xml_videoscamara /*RemoteObject*/ ,RemoteObject.createImmutable("</videoscamara>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1276;BA.debugLine="ArchivoXml = ArchivoXml & \"   <imageneswhatsapp>\"";
Debug.ShouldStop(134217728);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <imageneswhatsapp>"),servbackup4.mostCurrent._datosglobales._xml_imageneswhatsapp /*RemoteObject*/ ,RemoteObject.createImmutable("</imageneswhatsapp>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1277;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoswhatsapp>\" &";
Debug.ShouldStop(268435456);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <videoswhatsapp>"),servbackup4.mostCurrent._datosglobales._xml_videoswhatsapp /*RemoteObject*/ ,RemoteObject.createImmutable("</videoswhatsapp>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1279;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chfotoscamara>\" &";
Debug.ShouldStop(1073741824);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chfotoscamara>"),servbackup4.mostCurrent._datosglobales._xml_chfotoscamara /*RemoteObject*/ ,RemoteObject.createImmutable("</chfotoscamara>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1280;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoscamara>\" &";
Debug.ShouldStop(-2147483648);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chvideoscamara>"),servbackup4.mostCurrent._datosglobales._xml_chvideoscamara /*RemoteObject*/ ,RemoteObject.createImmutable("</chvideoscamara>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1281;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chimageneswhatsapp";
Debug.ShouldStop(1);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chimageneswhatsapp>"),servbackup4.mostCurrent._datosglobales._xml_chimageneswhatsapp /*RemoteObject*/ ,RemoteObject.createImmutable("</chimageneswhatsapp>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1282;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoswhatsapp>\"";
Debug.ShouldStop(2);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <chvideoswhatsapp>"),servbackup4.mostCurrent._datosglobales._xml_chvideoswhatsapp /*RemoteObject*/ ,RemoteObject.createImmutable("</chvideoswhatsapp>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1283;BA.debugLine="ArchivoXml = ArchivoXml & \"   <primeravez>\" & Dat";
Debug.ShouldStop(4);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <primeravez>"),servbackup4.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,RemoteObject.createImmutable("</primeravez>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1285;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_origen>\" & CRL";
Debug.ShouldStop(16);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </ruta_origen>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1287;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(64);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1288;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_destino>\" & CRL";
Debug.ShouldStop(128);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <ruta_destino>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1289;BA.debugLine="ArchivoXml = ArchivoXml & \"   <UsuarioRutaFotos>\"";
Debug.ShouldStop(256);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <UsuarioRutaFotos>"),servbackup4.mostCurrent._datosglobales._xml_usuariorutafotos /*RemoteObject*/ ,RemoteObject.createImmutable("</UsuarioRutaFotos>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1290;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_destino>\" & CR";
Debug.ShouldStop(512);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </ruta_destino>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1291;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(1024);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1293;BA.debugLine="ArchivoXml = ArchivoXml & \" <ftp>\" & CRLF & \"\"";
Debug.ShouldStop(4096);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" <ftp>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1294;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorruta>\" & D";
Debug.ShouldStop(8192);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorruta>"),servbackup4.mostCurrent._datosglobales._xml_servidorruta /*RemoteObject*/ ,RemoteObject.createImmutable("</servidorruta>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1295;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorip>\" & Dat";
Debug.ShouldStop(16384);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorip>"),servbackup4.mostCurrent._datosglobales._xml_servidorip /*RemoteObject*/ ,RemoteObject.createImmutable("</servidorip>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1296;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorpuerto>\" &";
Debug.ShouldStop(32768);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorpuerto>"),servbackup4.mostCurrent._datosglobales._xml_servidorpuerto /*RemoteObject*/ ,RemoteObject.createImmutable("</servidorpuerto>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1297;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorusuario>\"";
Debug.ShouldStop(65536);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorusuario>"),servbackup4.mostCurrent._datosglobales._xml_servidorusuario /*RemoteObject*/ ,RemoteObject.createImmutable("</servidorusuario>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1298;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorclave>\" &";
Debug.ShouldStop(131072);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("   <servidorclave>"),servbackup4.mostCurrent._datosglobales._xml_servidorclave /*RemoteObject*/ ,RemoteObject.createImmutable("</servidorclave>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1299;BA.debugLine="ArchivoXml = ArchivoXml & \" </ftp>\" & CRLF & \"\"";
Debug.ShouldStop(262144);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(" </ftp>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1301;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
Debug.ShouldStop(1048576);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable(""),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1302;BA.debugLine="ArchivoXml = ArchivoXml & \"</fotos>\" & CRLF & \"\"";
Debug.ShouldStop(2097152);
_archivoxml = RemoteObject.concat(_archivoxml,RemoteObject.createImmutable("</fotos>"),servbackup4.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(""));Debug.locals.put("ArchivoXml", _archivoxml);
 BA.debugLineNum = 1304;BA.debugLine="Return ArchivoXml";
Debug.ShouldStop(8388608);
if (true) return _archivoxml;
 BA.debugLineNum = 1306;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _consultarcantidadtotaldearchivos(RemoteObject _uncolmobilrutaorigen) throws Exception{
try {
		Debug.PushSubsStack("ConsultarCantidadTotalDeArchivos (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,1473);
if (RapidSub.canDelegate("consultarcantidadtotaldearchivos")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","consultarcantidadtotaldearchivos", _uncolmobilrutaorigen);}
ResumableSub_ConsultarCantidadTotalDeArchivos rsub = new ResumableSub_ConsultarCantidadTotalDeArchivos(null,_uncolmobilrutaorigen);
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
public static class ResumableSub_ConsultarCantidadTotalDeArchivos extends BA.ResumableSub {
public ResumableSub_ConsultarCantidadTotalDeArchivos(b4a.example.servbackup4 parent,RemoteObject _uncolmobilrutaorigen) {
this.parent = parent;
this._uncolmobilrutaorigen = _uncolmobilrutaorigen;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.servbackup4 parent;
RemoteObject _uncolmobilrutaorigen;
RemoteObject _resultado = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _contenidocoleccion_ = RemoteObject.createImmutable("");
RemoteObject _ruta_ = RemoteObject.createImmutable("");
RemoteObject _tipooperacion = RemoteObject.createImmutable("");
RemoteObject _primeravez = RemoteObject.createImmutable(false);
RemoteObject _listagenerica_ = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _h = 0;
RemoteObject _extension = RemoteObject.createImmutable("");
RemoteObject _archivox = RemoteObject.createImmutable("");
int step3;
int limit3;
int step17;
int limit17;
int step28;
int limit28;
int step39;
int limit39;
int step50;
int limit50;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ConsultarCantidadTotalDeArchivos (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,1473);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("unColMobilRutaOrigen", _uncolmobilrutaorigen);
 BA.debugLineNum = 1475;BA.debugLine="Dim Resultado As Boolean = False";
Debug.ShouldStop(4);
_resultado = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 1476;BA.debugLine="CantidadTotal = 0";
Debug.ShouldStop(8);
parent._cantidadtotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1480;BA.debugLine="For i = 0 To unColMobilRutaOrigen.Size-1";
Debug.ShouldStop(128);
if (true) break;

case 1:
//for
this.state = 74;
step3 = 1;
limit3 = RemoteObject.solve(new RemoteObject[] {_uncolmobilrutaorigen.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 75;
if (true) break;

case 75:
//C
this.state = 74;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 3;
if (true) break;

case 76:
//C
this.state = 75;
_i = ((int)(0 + _i + step3)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1481;BA.debugLine="Try";
Debug.ShouldStop(256);
if (true) break;

case 4:
//try
this.state = 73;
this.catchState = 72;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 72;
 BA.debugLineNum = 1482;BA.debugLine="Dim ContenidoColeccion_ As String= unColMobilRu";
Debug.ShouldStop(512);
_contenidocoleccion_ = BA.ObjectToString(_uncolmobilrutaorigen.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ContenidoColeccion_", _contenidocoleccion_);Debug.locals.put("ContenidoColeccion_", _contenidocoleccion_);
 BA.debugLineNum = 1483;BA.debugLine="Dim Ruta_ As String = (FxGlobales.Right(Conteni";
Debug.ShouldStop(1024);
_ruta_ = (parent.mostCurrent._fxglobales.runMethod(true,"_right" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_contenidocoleccion_),(Object)((RemoteObject.solve(new RemoteObject[] {_contenidocoleccion_.runMethod(true,"length"),_contenidocoleccion_.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(";"))),RemoteObject.createImmutable(1)}, "--",2, 1)))));Debug.locals.put("Ruta_", _ruta_);Debug.locals.put("Ruta_", _ruta_);
 BA.debugLineNum = 1485;BA.debugLine="Dim TipoOperacion As String = (FxGlobales.Left(";
Debug.ShouldStop(4096);
_tipooperacion = (parent.mostCurrent._fxglobales.runMethod(true,"_left" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_contenidocoleccion_),(Object)(_contenidocoleccion_.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(";"))))));Debug.locals.put("TipoOperacion", _tipooperacion);Debug.locals.put("TipoOperacion", _tipooperacion);
 BA.debugLineNum = 1487;BA.debugLine="Log(\"CONTENIDO DE LA LISTA --> \" & unColMobilRu";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51441806",RemoteObject.concat(RemoteObject.createImmutable("CONTENIDO DE LA LISTA --> "),_uncolmobilrutaorigen.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(" TIPO --> "),_tipooperacion),0);
 BA.debugLineNum = 1489;BA.debugLine="Dim PrimeraVez As Boolean";
Debug.ShouldStop(65536);
_primeravez = RemoteObject.createImmutable(false);Debug.locals.put("PrimeraVez", _primeravez);
 BA.debugLineNum = 1490;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1491;BA.debugLine="PrimeraVez= True";
Debug.ShouldStop(262144);
_primeravez = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("PrimeraVez", _primeravez);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1493;BA.debugLine="PrimeraVez= False";
Debug.ShouldStop(1048576);
_primeravez = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("PrimeraVez", _primeravez);
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1496;BA.debugLine="Dim ListaGenerica_ As List = DevolverLista(Ruta";
Debug.ShouldStop(8388608);
_listagenerica_ = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listagenerica_ = _devolverlista(_ruta_,_primeravez);Debug.locals.put("ListaGenerica_", _listagenerica_);Debug.locals.put("ListaGenerica_", _listagenerica_);
 BA.debugLineNum = 1511;BA.debugLine="If TipoOperacion = \"MobilRutaFotos\" Then";
Debug.ShouldStop(64);
if (true) break;

case 13:
//if
this.state = 70;
if (RemoteObject.solveBoolean("=",_tipooperacion,BA.ObjectToString("MobilRutaFotos"))) { 
this.state = 15;
}else 
{ BA.debugLineNum = 1523;BA.debugLine="Else If TipoOperacion = \"MobilRutaVideos\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_tipooperacion,BA.ObjectToString("MobilRutaVideos"))) { 
this.state = 29;
}else 
{ BA.debugLineNum = 1535;BA.debugLine="Else If TipoOperacion = \"MobilRutaFotosWhapp\" T";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_tipooperacion,BA.ObjectToString("MobilRutaFotosWhapp"))) { 
this.state = 43;
}else 
{ BA.debugLineNum = 1547;BA.debugLine="Else If TipoOperacion = \"MobilRutaVideosWhapp\"";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_tipooperacion,BA.ObjectToString("MobilRutaVideosWhapp"))) { 
this.state = 57;
}}}}
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1512;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
Debug.ShouldStop(128);
if (true) break;

case 16:
//for
this.state = 27;
step17 = 1;
limit17 = RemoteObject.solve(new RemoteObject[] {_listagenerica_.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_h = 0 ;
Debug.locals.put("h", _h);
this.state = 77;
if (true) break;

case 77:
//C
this.state = 27;
if ((step17 > 0 && _h <= limit17) || (step17 < 0 && _h >= limit17)) this.state = 18;
if (true) break;

case 78:
//C
this.state = 77;
_h = ((int)(0 + _h + step17)) ;
Debug.locals.put("h", _h);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1513;BA.debugLine="Dim Extension As String = \"\"";
Debug.ShouldStop(256);
_extension = BA.ObjectToString("");Debug.locals.put("Extension", _extension);Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1514;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
Debug.ShouldStop(512);
_archivox = BA.ObjectToString(_listagenerica_.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _h))));Debug.locals.put("Archivox", _archivox);Debug.locals.put("Archivox", _archivox);
 BA.debugLineNum = 1515;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
Debug.ShouldStop(1024);
_extension = parent.mostCurrent._fxglobales.runMethod(true,"_right" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_archivox),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1516;BA.debugLine="If Extension.ToUpperCase = \"JPG\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 19:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_extension.runMethod(true,"toUpperCase"),BA.ObjectToString("JPG"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1517;BA.debugLine="If DatosGlobales.XML_ChFotosCamara = \"1\" The";
Debug.ShouldStop(4096);
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_chfotoscamara /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1518;BA.debugLine="CantidadTotal = CantidadTotal + 1";
Debug.ShouldStop(8192);
parent._cantidadtotal = RemoteObject.solve(new RemoteObject[] {parent._cantidadtotal,RemoteObject.createImmutable(1)}, "+",1, 1);
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 78;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 70;
Debug.locals.put("h", _h);
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 1524;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
Debug.ShouldStop(524288);
if (true) break;

case 30:
//for
this.state = 41;
step28 = 1;
limit28 = RemoteObject.solve(new RemoteObject[] {_listagenerica_.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_h = 0 ;
Debug.locals.put("h", _h);
this.state = 79;
if (true) break;

case 79:
//C
this.state = 41;
if ((step28 > 0 && _h <= limit28) || (step28 < 0 && _h >= limit28)) this.state = 32;
if (true) break;

case 80:
//C
this.state = 79;
_h = ((int)(0 + _h + step28)) ;
Debug.locals.put("h", _h);
if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 1525;BA.debugLine="Dim Extension As String = \"\"";
Debug.ShouldStop(1048576);
_extension = BA.ObjectToString("");Debug.locals.put("Extension", _extension);Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1526;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
Debug.ShouldStop(2097152);
_archivox = BA.ObjectToString(_listagenerica_.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _h))));Debug.locals.put("Archivox", _archivox);Debug.locals.put("Archivox", _archivox);
 BA.debugLineNum = 1527;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
Debug.ShouldStop(4194304);
_extension = parent.mostCurrent._fxglobales.runMethod(true,"_right" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_archivox),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1528;BA.debugLine="If Extension.ToUpperCase = \"MP4\" Then";
Debug.ShouldStop(8388608);
if (true) break;

case 33:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_extension.runMethod(true,"toUpperCase"),BA.ObjectToString("MP4"))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1529;BA.debugLine="If DatosGlobales.XML_ChVideosCamara = \"1\" Th";
Debug.ShouldStop(16777216);
if (true) break;

case 36:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_chvideoscamara /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 1530;BA.debugLine="CantidadTotal = CantidadTotal + 1";
Debug.ShouldStop(33554432);
parent._cantidadtotal = RemoteObject.solve(new RemoteObject[] {parent._cantidadtotal,RemoteObject.createImmutable(1)}, "+",1, 1);
 if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 80;
;
 if (true) break;
if (true) break;

case 41:
//C
this.state = 70;
Debug.locals.put("h", _h);
;
 if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 1536;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
Debug.ShouldStop(-2147483648);
if (true) break;

case 44:
//for
this.state = 55;
step39 = 1;
limit39 = RemoteObject.solve(new RemoteObject[] {_listagenerica_.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_h = 0 ;
Debug.locals.put("h", _h);
this.state = 81;
if (true) break;

case 81:
//C
this.state = 55;
if ((step39 > 0 && _h <= limit39) || (step39 < 0 && _h >= limit39)) this.state = 46;
if (true) break;

case 82:
//C
this.state = 81;
_h = ((int)(0 + _h + step39)) ;
Debug.locals.put("h", _h);
if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1537;BA.debugLine="Dim Extension As String = \"\"";
Debug.ShouldStop(1);
_extension = BA.ObjectToString("");Debug.locals.put("Extension", _extension);Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1538;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
Debug.ShouldStop(2);
_archivox = BA.ObjectToString(_listagenerica_.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _h))));Debug.locals.put("Archivox", _archivox);Debug.locals.put("Archivox", _archivox);
 BA.debugLineNum = 1539;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
Debug.ShouldStop(4);
_extension = parent.mostCurrent._fxglobales.runMethod(true,"_right" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_archivox),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1540;BA.debugLine="If Extension.ToUpperCase = \"JPG\" Then";
Debug.ShouldStop(8);
if (true) break;

case 47:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_extension.runMethod(true,"toUpperCase"),BA.ObjectToString("JPG"))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 1541;BA.debugLine="If DatosGlobales.XML_ChImagenesWhatsApp = \"1";
Debug.ShouldStop(16);
if (true) break;

case 50:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_chimageneswhatsapp /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 1542;BA.debugLine="CantidadTotal = CantidadTotal + 1";
Debug.ShouldStop(32);
parent._cantidadtotal = RemoteObject.solve(new RemoteObject[] {parent._cantidadtotal,RemoteObject.createImmutable(1)}, "+",1, 1);
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 82;
;
 if (true) break;
if (true) break;

case 55:
//C
this.state = 70;
Debug.locals.put("h", _h);
;
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 1548;BA.debugLine="For	h = 0 To ListaGenerica_.Size-1";
Debug.ShouldStop(2048);
if (true) break;

case 58:
//for
this.state = 69;
step50 = 1;
limit50 = RemoteObject.solve(new RemoteObject[] {_listagenerica_.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_h = 0 ;
Debug.locals.put("h", _h);
this.state = 83;
if (true) break;

case 83:
//C
this.state = 69;
if ((step50 > 0 && _h <= limit50) || (step50 < 0 && _h >= limit50)) this.state = 60;
if (true) break;

case 84:
//C
this.state = 83;
_h = ((int)(0 + _h + step50)) ;
Debug.locals.put("h", _h);
if (true) break;

case 60:
//C
this.state = 61;
 BA.debugLineNum = 1549;BA.debugLine="Dim Extension As String = \"\"";
Debug.ShouldStop(4096);
_extension = BA.ObjectToString("");Debug.locals.put("Extension", _extension);Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1550;BA.debugLine="Dim Archivox As String = ListaGenerica_.Get(h";
Debug.ShouldStop(8192);
_archivox = BA.ObjectToString(_listagenerica_.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _h))));Debug.locals.put("Archivox", _archivox);Debug.locals.put("Archivox", _archivox);
 BA.debugLineNum = 1551;BA.debugLine="Extension = FxGlobales.Right(Archivox, 3)";
Debug.ShouldStop(16384);
_extension = parent.mostCurrent._fxglobales.runMethod(true,"_right" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_archivox),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1552;BA.debugLine="If Extension.ToUpperCase = \"MP4\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 61:
//if
this.state = 68;
if (RemoteObject.solveBoolean("=",_extension.runMethod(true,"toUpperCase"),BA.ObjectToString("MP4"))) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 1553;BA.debugLine="If DatosGlobales.XML_ChVideosWhatsApp = \"1\"";
Debug.ShouldStop(65536);
if (true) break;

case 64:
//if
this.state = 67;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_chvideoswhatsapp /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 1554;BA.debugLine="CantidadTotal = CantidadTotal + 1";
Debug.ShouldStop(131072);
parent._cantidadtotal = RemoteObject.solve(new RemoteObject[] {parent._cantidadtotal,RemoteObject.createImmutable(1)}, "+",1, 1);
 if (true) break;

case 67:
//C
this.state = 68;
;
 if (true) break;

case 68:
//C
this.state = 84;
;
 if (true) break;
if (true) break;

case 69:
//C
this.state = 70;
Debug.locals.put("h", _h);
;
 if (true) break;

case 70:
//C
this.state = 73;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 72:
//C
this.state = 73;
this.catchState = 0;
 BA.debugLineNum = 1579;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51441898",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)),0);
 BA.debugLineNum = 1580;BA.debugLine="ToastMessageShow(\"#ERROR: \" & LastException, Tr";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("#ERROR: "),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;
if (true) break;

case 73:
//C
this.state = 76;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 74:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1585;BA.debugLine="Resultado = True";
Debug.ShouldStop(65536);
_resultado = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 1587;BA.debugLine="Return Resultado";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 1590;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",servbackup4.processBA, e0.toString());}
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
public static RemoteObject  _crearnotificacion(RemoteObject _unidnotificacion,RemoteObject _titulo,RemoteObject _mensaje) throws Exception{
try {
		Debug.PushSubsStack("CrearNotificacion (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,406);
if (RapidSub.canDelegate("crearnotificacion")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","crearnotificacion", _unidnotificacion, _titulo, _mensaje);}
Debug.locals.put("UnIdNotificacion", _unidnotificacion);
Debug.locals.put("Titulo", _titulo);
Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 406;BA.debugLine="Private Sub CrearNotificacion(UnIdNotificacion As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 407;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
Debug.ShouldStop(4194304);
servbackup4._noti.runVoidMethod ("Initialize2",(Object)(servbackup4._noti.getField(true,"IMPORTANCE_LOW")));
 BA.debugLineNum = 409;BA.debugLine="noti.Icon = \"icon\"";
Debug.ShouldStop(16777216);
servbackup4._noti.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 410;BA.debugLine="noti.Vibrate = False";
Debug.ShouldStop(33554432);
servbackup4._noti.runVoidMethod ("setVibrate",servbackup4.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 411;BA.debugLine="noti.Sound = False";
Debug.ShouldStop(67108864);
servbackup4._noti.runVoidMethod ("setSound",servbackup4.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 412;BA.debugLine="noti.Light = False";
Debug.ShouldStop(134217728);
servbackup4._noti.runVoidMethod ("setLight",servbackup4.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 413;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
Debug.ShouldStop(268435456);
servbackup4._noti.runVoidMethod ("SetInfoNew",servbackup4.processBA,(Object)(BA.ObjectToCharSequence(_titulo)),(Object)(BA.ObjectToCharSequence(_mensaje)),(Object)((servbackup4.mostCurrent._principal.getObject())));
 BA.debugLineNum = 414;BA.debugLine="noti.Notify(UnIdNotificacion)";
Debug.ShouldStop(536870912);
servbackup4._noti.runVoidMethod ("Notify",(Object)(_unidnotificacion));
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _devolverlista(RemoteObject _unaruta,RemoteObject _oesprimeravez) throws Exception{
try {
		Debug.PushSubsStack("DevolverLista (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,1314);
if (RapidSub.canDelegate("devolverlista")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","devolverlista", _unaruta, _oesprimeravez);}
RemoteObject _unalistafinal = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _unalistaprovisoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _unalistaprovisoria2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fechaactual = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _archivo = RemoteObject.declareNull("Object");
RemoteObject _archivox = RemoteObject.createImmutable("");
RemoteObject _extension = RemoteObject.createImmutable("");
RemoteObject _d = RemoteObject.createImmutable(0L);
RemoteObject _unafechaarchivo = RemoteObject.createImmutable("");
RemoteObject _fechaayer = RemoteObject.createImmutable("");
RemoteObject _fecha2diasantes = RemoteObject.createImmutable("");
RemoteObject _fecha3diasantes = RemoteObject.createImmutable("");
RemoteObject _unalistafinalsindupli = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("unaRuta", _unaruta);
Debug.locals.put("oEsPrimeraVez", _oesprimeravez);
 BA.debugLineNum = 1314;BA.debugLine="Private Sub DevolverLista(unaRuta As String, oEsPr";
Debug.ShouldStop(2);
 BA.debugLineNum = 1318;BA.debugLine="Dim unaListaFinal As List";
Debug.ShouldStop(32);
_unalistafinal = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("unaListaFinal", _unalistafinal);
 BA.debugLineNum = 1319;BA.debugLine="Dim unaListaProvisoria As List";
Debug.ShouldStop(64);
_unalistaprovisoria = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("unaListaProvisoria", _unalistaprovisoria);
 BA.debugLineNum = 1320;BA.debugLine="Dim unaListaProvisoria2 As List";
Debug.ShouldStop(128);
_unalistaprovisoria2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("unaListaProvisoria2", _unalistaprovisoria2);
 BA.debugLineNum = 1322;BA.debugLine="unaListaFinal.Initialize";
Debug.ShouldStop(512);
_unalistafinal.runVoidMethod ("Initialize");
 BA.debugLineNum = 1323;BA.debugLine="unaListaProvisoria.Initialize";
Debug.ShouldStop(1024);
_unalistaprovisoria.runVoidMethod ("Initialize");
 BA.debugLineNum = 1324;BA.debugLine="unaListaProvisoria2.Initialize";
Debug.ShouldStop(2048);
_unalistaprovisoria2.runVoidMethod ("Initialize");
 BA.debugLineNum = 1326;BA.debugLine="unaListaFinal.Clear";
Debug.ShouldStop(8192);
_unalistafinal.runVoidMethod ("Clear");
 BA.debugLineNum = 1327;BA.debugLine="unaListaProvisoria.Clear";
Debug.ShouldStop(16384);
_unalistaprovisoria.runVoidMethod ("Clear");
 BA.debugLineNum = 1328;BA.debugLine="unaListaProvisoria2.Clear";
Debug.ShouldStop(32768);
_unalistaprovisoria2.runVoidMethod ("Clear");
 BA.debugLineNum = 1330;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(131072);
servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 1331;BA.debugLine="Dim FechaActual As String";
Debug.ShouldStop(262144);
_fechaactual = RemoteObject.createImmutable("");Debug.locals.put("FechaActual", _fechaactual);
 BA.debugLineNum = 1332;BA.debugLine="FechaActual = DateTime.Date(DateTime.Now)";
Debug.ShouldStop(524288);
_fechaactual = servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("FechaActual", _fechaactual);
 BA.debugLineNum = 1335;BA.debugLine="If oEsPrimeraVez = False Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_oesprimeravez,servbackup4.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1337;BA.debugLine="unaListaProvisoria = File.ListFiles(unaRuta)";
Debug.ShouldStop(16777216);
_unalistaprovisoria = servbackup4.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_unaruta));Debug.locals.put("unaListaProvisoria", _unalistaprovisoria);
 BA.debugLineNum = 1339;BA.debugLine="For i = 0 To unaListaProvisoria.Size -1";
Debug.ShouldStop(67108864);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_unalistaprovisoria.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1341;BA.debugLine="Dim	Archivo As Object = unaListaProvisoria.Get(";
Debug.ShouldStop(268435456);
_archivo = _unalistaprovisoria.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("Archivo", _archivo);Debug.locals.put("Archivo", _archivo);
 BA.debugLineNum = 1342;BA.debugLine="Dim Archivox As String = unaListaProvisoria.Get";
Debug.ShouldStop(536870912);
_archivox = BA.ObjectToString(_unalistaprovisoria.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Archivox", _archivox);Debug.locals.put("Archivox", _archivox);
 BA.debugLineNum = 1343;BA.debugLine="Dim Extension As String = FxGlobales.Right(Arch";
Debug.ShouldStop(1073741824);
_extension = servbackup4.mostCurrent._fxglobales.runMethod(true,"_right" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_archivox),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Extension", _extension);Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1346;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(2);
servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 1347;BA.debugLine="Dim d As Long";
Debug.ShouldStop(4);
_d = RemoteObject.createImmutable(0L);Debug.locals.put("d", _d);
 BA.debugLineNum = 1348;BA.debugLine="d = File.LastModified(unaRuta, Archivo)";
Debug.ShouldStop(8);
_d = servbackup4.mostCurrent.__c.getField(false,"File").runMethod(true,"LastModified",(Object)(_unaruta),(Object)(BA.ObjectToString(_archivo)));Debug.locals.put("d", _d);
 BA.debugLineNum = 1349;BA.debugLine="Dim unaFechaArchivo As String = DateTime.Date(d";
Debug.ShouldStop(16);
_unafechaarchivo = servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_d));Debug.locals.put("unaFechaArchivo", _unafechaarchivo);Debug.locals.put("unaFechaArchivo", _unafechaarchivo);
 BA.debugLineNum = 1351;BA.debugLine="If(FechaActual = unaFechaArchivo) Then 'hoy";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",_fechaactual,_unafechaarchivo))) { 
 BA.debugLineNum = 1352;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
Debug.ShouldStop(128);
_unalistaprovisoria2.runVoidMethod ("Add",(Object)(_unalistaprovisoria.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 };
 BA.debugLineNum = 1356;BA.debugLine="Dim FechaAyer As String";
Debug.ShouldStop(2048);
_fechaayer = RemoteObject.createImmutable("");Debug.locals.put("FechaAyer", _fechaayer);
 BA.debugLineNum = 1357;BA.debugLine="FechaAyer = DateTime.Date(DateTime.Add(DateTime";
Debug.ShouldStop(4096);
_fechaayer = servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))))));Debug.locals.put("FechaAyer", _fechaayer);
 BA.debugLineNum = 1358;BA.debugLine="If(FechaAyer = unaFechaArchivo) Then 'los de ay";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("=",_fechaayer,_unafechaarchivo))) { 
 BA.debugLineNum = 1359;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
Debug.ShouldStop(16384);
_unalistaprovisoria2.runVoidMethod ("Add",(Object)(_unalistaprovisoria.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 };
 BA.debugLineNum = 1362;BA.debugLine="Dim Fecha2DiasAntes As String";
Debug.ShouldStop(131072);
_fecha2diasantes = RemoteObject.createImmutable("");Debug.locals.put("Fecha2DiasAntes", _fecha2diasantes);
 BA.debugLineNum = 1363;BA.debugLine="Fecha2DiasAntes = DateTime.Date(DateTime.Add(Da";
Debug.ShouldStop(262144);
_fecha2diasantes = servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 2))))));Debug.locals.put("Fecha2DiasAntes", _fecha2diasantes);
 BA.debugLineNum = 1364;BA.debugLine="If(Fecha2DiasAntes = unaFechaArchivo) Then 'los";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",_fecha2diasantes,_unafechaarchivo))) { 
 BA.debugLineNum = 1365;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
Debug.ShouldStop(1048576);
_unalistaprovisoria2.runVoidMethod ("Add",(Object)(_unalistaprovisoria.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 };
 BA.debugLineNum = 1368;BA.debugLine="Dim Fecha3DiasAntes As String";
Debug.ShouldStop(8388608);
_fecha3diasantes = RemoteObject.createImmutable("");Debug.locals.put("Fecha3DiasAntes", _fecha3diasantes);
 BA.debugLineNum = 1369;BA.debugLine="Fecha3DiasAntes = DateTime.Date(DateTime.Add(Da";
Debug.ShouldStop(16777216);
_fecha3diasantes = servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(servbackup4.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 3))))));Debug.locals.put("Fecha3DiasAntes", _fecha3diasantes);
 BA.debugLineNum = 1370;BA.debugLine="If(Fecha3DiasAntes = unaFechaArchivo) Then 'los";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",_fecha3diasantes,_unafechaarchivo))) { 
 BA.debugLineNum = 1371;BA.debugLine="unaListaProvisoria2.Add(unaListaProvisoria.Get";
Debug.ShouldStop(67108864);
_unalistaprovisoria2.runVoidMethod ("Add",(Object)(_unalistaprovisoria.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1376;BA.debugLine="unaListaFinal = unaListaProvisoria2";
Debug.ShouldStop(-2147483648);
_unalistafinal = _unalistaprovisoria2;Debug.locals.put("unaListaFinal", _unalistafinal);
 }else {
 BA.debugLineNum = 1380;BA.debugLine="unaListaFinal = File.ListFiles(unaRuta) ' [000_0";
Debug.ShouldStop(8);
_unalistafinal = servbackup4.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_unaruta));Debug.locals.put("unaListaFinal", _unalistafinal);
 };
 BA.debugLineNum = 1385;BA.debugLine="Dim unaListaFinalSinDupli As List = EliminarDupli";
Debug.ShouldStop(256);
_unalistafinalsindupli = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_unalistafinalsindupli = _eliminarduplicados(_unalistafinal);Debug.locals.put("unaListaFinalSinDupli", _unalistafinalsindupli);Debug.locals.put("unaListaFinalSinDupli", _unalistafinalsindupli);
 BA.debugLineNum = 1388;BA.debugLine="Return unaListaFinalSinDupli 'el return era el de";
Debug.ShouldStop(2048);
if (true) return _unalistafinalsindupli;
 BA.debugLineNum = 1390;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eliminarduplicados(RemoteObject _lista) throws Exception{
try {
		Debug.PushSubsStack("EliminarDuplicados (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,1593);
if (RapidSub.canDelegate("eliminarduplicados")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","eliminarduplicados", _lista);}
RemoteObject _resultado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mapduplicados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _elemento = RemoteObject.declareNull("Object");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("lista", _lista);
 BA.debugLineNum = 1593;BA.debugLine="Sub EliminarDuplicados(lista As List) As List";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1595;BA.debugLine="Log(\"FX: EliminarDuplicados --> Entro --> Cantida";
Debug.ShouldStop(67108864);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51507330",RemoteObject.concat(RemoteObject.createImmutable("FX: EliminarDuplicados --> Entro --> Cantidad incio: "),(RemoteObject.solve(new RemoteObject[] {_lista.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))),0);
 BA.debugLineNum = 1597;BA.debugLine="Dim Resultado As List";
Debug.ShouldStop(268435456);
_resultado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 1598;BA.debugLine="Dim mapDuplicados As Map";
Debug.ShouldStop(536870912);
_mapduplicados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapDuplicados", _mapduplicados);
 BA.debugLineNum = 1599;BA.debugLine="mapDuplicados.Initialize";
Debug.ShouldStop(1073741824);
_mapduplicados.runVoidMethod ("Initialize");
 BA.debugLineNum = 1601;BA.debugLine="Resultado.Initialize";
Debug.ShouldStop(1);
_resultado.runVoidMethod ("Initialize");
 BA.debugLineNum = 1603;BA.debugLine="For i = 0 To lista.Size - 1";
Debug.ShouldStop(4);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_lista.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1604;BA.debugLine="Dim elemento As Object";
Debug.ShouldStop(8);
_elemento = RemoteObject.createNew ("Object");Debug.locals.put("elemento", _elemento);
 BA.debugLineNum = 1605;BA.debugLine="elemento = lista.Get(i)";
Debug.ShouldStop(16);
_elemento = _lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("elemento", _elemento);
 BA.debugLineNum = 1608;BA.debugLine="If Not(mapDuplicados.ContainsKey(elemento)) Then";
Debug.ShouldStop(128);
if (servbackup4.mostCurrent.__c.runMethod(true,"Not",(Object)(_mapduplicados.runMethod(true,"ContainsKey",(Object)(_elemento)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1609;BA.debugLine="mapDuplicados.Put(elemento, \"\")";
Debug.ShouldStop(256);
_mapduplicados.runVoidMethod ("Put",(Object)(_elemento),(Object)((RemoteObject.createImmutable(""))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1617;BA.debugLine="For Each key As Object In mapDuplicados.Keys";
Debug.ShouldStop(65536);
{
final RemoteObject group13 = _mapduplicados.runMethod(false,"Keys");
final int groupLen13 = group13.runMethod(true,"getSize").<Integer>get()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_key = group13.runMethod(false,"Get",index13);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 1618;BA.debugLine="Resultado.Add(key)";
Debug.ShouldStop(131072);
_resultado.runVoidMethod ("Add",(Object)(_key));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1621;BA.debugLine="Log(\"FX: EliminarDuplicados --> Llega hasta aca?";
Debug.ShouldStop(1048576);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51507356",RemoteObject.concat(RemoteObject.createImmutable("FX: EliminarDuplicados --> Llega hasta aca? --> CANTIDAD FIN: "),(RemoteObject.solve(new RemoteObject[] {_resultado.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))),0);
 BA.debugLineNum = 1623;BA.debugLine="Return Resultado";
Debug.ShouldStop(4194304);
if (true) return _resultado;
 BA.debugLineNum = 1625;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eliminarnotificacion(RemoteObject _unidnotificacion) throws Exception{
try {
		Debug.PushSubsStack("EliminarNotificacion (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,428);
if (RapidSub.canDelegate("eliminarnotificacion")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","eliminarnotificacion", _unidnotificacion);}
Debug.locals.put("UnIdNotificacion", _unidnotificacion);
 BA.debugLineNum = 428;BA.debugLine="Private Sub EliminarNotificacion(UnIdNotificacion";
Debug.ShouldStop(2048);
 BA.debugLineNum = 429;BA.debugLine="noti.Cancel(UnIdNotificacion)";
Debug.ShouldStop(4096);
servbackup4._noti.runVoidMethod ("Cancel",(Object)(_unidnotificacion));
 BA.debugLineNum = 431;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _encontroarchivoenservidor(RemoteObject _unarutaserver,RemoteObject _unarutamobile,RemoteObject _unarchivo) throws Exception{
try {
		Debug.PushSubsStack("EncontroArchivoEnServidor (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,1419);
if (RapidSub.canDelegate("encontroarchivoenservidor")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","encontroarchivoenservidor", _unarutaserver, _unarutamobile, _unarchivo);}
ResumableSub_EncontroArchivoEnServidor rsub = new ResumableSub_EncontroArchivoEnServidor(null,_unarutaserver,_unarutamobile,_unarchivo);
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
public ResumableSub_EncontroArchivoEnServidor(b4a.example.servbackup4 parent,RemoteObject _unarutaserver,RemoteObject _unarutamobile,RemoteObject _unarchivo) {
this.parent = parent;
this._unarutaserver = _unarutaserver;
this._unarutamobile = _unarutamobile;
this._unarchivo = _unarchivo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.servbackup4 parent;
RemoteObject _unarutaserver;
RemoteObject _unarutamobile;
RemoteObject _unarchivo;
RemoteObject _resu = RemoteObject.createImmutable(false);
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
RemoteObject _totalarchivos = RemoteObject.createImmutable(0);
int _i = 0;
int step12;
int limit12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EncontroArchivoEnServidor (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,1419);
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
Debug.locals.put("unaRutaMobile", _unarutamobile);
Debug.locals.put("unArchivo", _unarchivo);
 BA.debugLineNum = 1420;BA.debugLine="currentFileSize = File.Size(unaRutaMobile, unArch";
Debug.ShouldStop(2048);
parent._currentfilesize = BA.numberCast(int.class, parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Size",(Object)(_unarutamobile),(Object)(_unarchivo)));
 BA.debugLineNum = 1421;BA.debugLine="Dim Resu As Boolean = False";
Debug.ShouldStop(4096);
_resu = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resu", _resu);Debug.locals.put("Resu", _resu);
 BA.debugLineNum = 1429;BA.debugLine="If FTP_Consulta.IsInitialized = True Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._ftp_consulta.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1430;BA.debugLine="FTP_Consulta.CloseNow";
Debug.ShouldStop(2097152);
parent._ftp_consulta.runVoidMethod ("CloseNow");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1432;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Servi";
Debug.ShouldStop(8388608);
parent._ftp_consulta.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 1433;BA.debugLine="FTP_Consulta.PassiveMode = True";
Debug.ShouldStop(16777216);
parent._ftp_consulta.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1436;BA.debugLine="FTP_Consulta.List(unaRutaServer) 'ejemplo --> \"./";
Debug.ShouldStop(134217728);
parent._ftp_consulta.runVoidMethod ("List",servbackup4.processBA,(Object)(_unarutaserver));
 BA.debugLineNum = 1437;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "encontroarchivoenservidor"), null);
this.state = 23;
return;
case 23:
//C
this.state = 5;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 1438;BA.debugLine="Dim TotalArchivos As Int = Files.Length";
Debug.ShouldStop(536870912);
_totalarchivos = _files.getField(true,"length");Debug.locals.put("TotalArchivos", _totalarchivos);Debug.locals.put("TotalArchivos", _totalarchivos);
 BA.debugLineNum = 1440;BA.debugLine="If Success  Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 5:
//if
this.state = 22;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1441;BA.debugLine="For i = 0 To TotalArchivos-1";
Debug.ShouldStop(1);
if (true) break;

case 8:
//for
this.state = 21;
step12 = 1;
limit12 = RemoteObject.solve(new RemoteObject[] {_totalarchivos,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 24;
if (true) break;

case 24:
//C
this.state = 21;
if ((step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12)) this.state = 10;
if (true) break;

case 25:
//C
this.state = 24;
_i = ((int)(0 + _i + step12)) ;
Debug.locals.put("i", _i);
if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1442;BA.debugLine="If unArchivo = Files(i).Name Then";
Debug.ShouldStop(2);
if (true) break;

case 11:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_unarchivo,_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1451;BA.debugLine="Log(\"Archivo: \" & unArchivo & \" - Tamaño en se";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51376288",RemoteObject.concat(RemoteObject.createImmutable("Archivo: "),_unarchivo,RemoteObject.createImmutable(" - Tamaño en server: "),(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getSize")),RemoteObject.createImmutable(" - Tamaño en Dispositivo: "),(parent._currentfilesize)),0);
 BA.debugLineNum = 1453;BA.debugLine="If (currentFileSize) = (Files(i).Size) Then";
Debug.ShouldStop(4096);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",(parent._currentfilesize),BA.numberCast(double.class, (_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getSize"))))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 1454;BA.debugLine="Resu = True";
Debug.ShouldStop(8192);
_resu = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resu", _resu);
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1456;BA.debugLine="Log(\"Archivo existe en sel server, pero no co";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51376293",RemoteObject.concat(RemoteObject.createImmutable("Archivo existe en sel server, pero no coinciden los tamaños - "),RemoteObject.createImmutable("ARCHIVO EN SERVER: "),_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),RemoteObject.createImmutable(" - TAMAÑO ARCHIVO SERVER: "),_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getSize"),RemoteObject.createImmutable(" - TAMAÑO MOBILE: "),(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Size",(Object)(_unarutamobile),(Object)(_unarchivo)))),0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 1458;BA.debugLine="Return Resu";
Debug.ShouldStop(131072);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resu));return;};
 if (true) break;

case 20:
//C
this.state = 25;
;
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
Debug.locals.put("i", _i);
;
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 1464;BA.debugLine="Return Resu";
Debug.ShouldStop(8388608);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resu));return;};
 BA.debugLineNum = 1465;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _finalizarproceso() throws Exception{
try {
		Debug.PushSubsStack("FinalizarProceso (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,1630);
if (RapidSub.canDelegate("finalizarproceso")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","finalizarproceso");}
RemoteObject _unxml = RemoteObject.createImmutable("");
 BA.debugLineNum = 1630;BA.debugLine="Sub FinalizarProceso()";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1631;BA.debugLine="Log(\"EJECUTA LA FX --> FinalizarProceso() --> Can";
Debug.ShouldStop(1073741824);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51572865",RemoteObject.concat(RemoteObject.createImmutable("EJECUTA LA FX --> FinalizarProceso() --> Cant. en curso: "),servbackup4._cantencurso,RemoteObject.createImmutable(", Cant. Total: "),servbackup4._cantidadtotal,RemoteObject.createImmutable(", fallidas: "),servbackup4._cantidadfallidas,RemoteObject.createImmutable(", Ok: "),servbackup4._cantidadok),0);
 BA.debugLineNum = 1633;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",servbackup4._cantencurso,BA.numberCast(double.class, servbackup4._cantidadtotal))) { 
 BA.debugLineNum = 1634;BA.debugLine="If CantidadFallidas = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",servbackup4._cantidadfallidas,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1635;BA.debugLine="DatosGlobales.Segundos = 3600 'lo paso de 360s";
Debug.ShouldStop(4);
servbackup4.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 3600);
 BA.debugLineNum = 1636;BA.debugLine="Dim unXml As String = CargarElXML  'la tengo q";
Debug.ShouldStop(8);
_unxml = _cargarelxml();Debug.locals.put("unXml", _unxml);Debug.locals.put("unXml", _unxml);
 BA.debugLineNum = 1637;BA.debugLine="File.WriteString(File.DirInternal,\"config.xml\",";
Debug.ShouldStop(16);
servbackup4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(servbackup4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("config.xml")),(Object)(_unxml));
 BA.debugLineNum = 1638;BA.debugLine="CantEnCurso = 0";
Debug.ShouldStop(32);
servbackup4._cantencurso = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1639;BA.debugLine="CantidadTotal = 0";
Debug.ShouldStop(64);
servbackup4._cantidadtotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1640;BA.debugLine="CantidadOk = 0";
Debug.ShouldStop(128);
servbackup4._cantidadok = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1641;BA.debugLine="CantidadFallidas = 0";
Debug.ShouldStop(256);
servbackup4._cantidadfallidas = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1642;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(512);
servbackup4.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = servbackup4.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1643;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS\",";
Debug.ShouldStop(1024);
_modificarnotificacion(servbackup4._idnotificacion,BA.ObjectToString("FOTOS"),RemoteObject.concat(RemoteObject.createImmutable("Esperando para hacer copia... Próxima ejecucion: "),servbackup4.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)));
 BA.debugLineNum = 1644;BA.debugLine="Log(\"Esperando para hacer copia... Próxima ejec";
Debug.ShouldStop(2048);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51572878",RemoteObject.concat(RemoteObject.createImmutable("Esperando para hacer copia... Próxima ejecucion: "),servbackup4.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)),0);
 };
 BA.debugLineNum = 1646;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
Debug.ShouldStop(8192);
servbackup4.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/  = BA.ObjectToString("0%");
 BA.debugLineNum = 1647;BA.debugLine="DatosGlobales.CopiaProgress = 0";
Debug.ShouldStop(16384);
servbackup4.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1648;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
Debug.ShouldStop(32768);
servbackup4.mostCurrent._datosglobales._copiacantencurso /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1649;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
Debug.ShouldStop(65536);
servbackup4.mostCurrent._datosglobales._copiaprogreso /*RemoteObject*/  = BA.ObjectToString("0");
 BA.debugLineNum = 1650;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullbkp";
Debug.ShouldStop(131072);
servbackup4.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(servbackup4.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("indicefullbkp.txt")),(Object)(RemoteObject.createImmutable("-1")));
 BA.debugLineNum = 1651;BA.debugLine="StopService(Me)";
Debug.ShouldStop(262144);
servbackup4.mostCurrent.__c.runVoidMethod ("StopService",servbackup4.processBA,(Object)(servbackup4.getObject()));
 };
 BA.debugLineNum = 1653;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ftp_uploadcompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("ftp_UploadCompleted (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,865);
if (RapidSub.canDelegate("ftp_uploadcompleted")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","ftp_uploadcompleted", _serverpath, _success);}
Debug.locals.put("ServerPath", _serverpath);
Debug.locals.put("Success", _success);
 BA.debugLineNum = 865;BA.debugLine="Sub ftp_UploadCompleted (ServerPath As String, Suc";
Debug.ShouldStop(1);
 BA.debugLineNum = 868;BA.debugLine="If Success Then";
Debug.ShouldStop(8);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 869;BA.debugLine="Log(\"--> FTP_UploadCompleted --> Subio Ok.\")";
Debug.ShouldStop(16);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51114116",RemoteObject.createImmutable("--> FTP_UploadCompleted --> Subio Ok."),0);
 }else {
 BA.debugLineNum = 871;BA.debugLine="Log(\"--> FTP_UploadCompleted --> Fallo Subida\")";
Debug.ShouldStop(64);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51114118",RemoteObject.createImmutable("--> FTP_UploadCompleted --> Fallo Subida"),0);
 };
 BA.debugLineNum = 875;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ftp_uploadprogress(RemoteObject _serverpath,RemoteObject _totaluploaded,RemoteObject _total) throws Exception{
try {
		Debug.PushSubsStack("FTP_UploadProgress (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,797);
if (RapidSub.canDelegate("ftp_uploadprogress")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","ftp_uploadprogress", _serverpath, _totaluploaded, _total);}
Debug.locals.put("ServerPath", _serverpath);
Debug.locals.put("TotalUploaded", _totaluploaded);
Debug.locals.put("Total", _total);
 BA.debugLineNum = 797;BA.debugLine="Sub FTP_UploadProgress (ServerPath As String, Tota";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 799;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 801;BA.debugLine="DatosGlobales.CopiaProgreso =  \"[\" & TotalUpload";
Debug.ShouldStop(1);
servbackup4.mostCurrent._datosglobales._copiaprogreso /*RemoteObject*/  = RemoteObject.concat(RemoteObject.createImmutable("["),_totaluploaded,RemoteObject.createImmutable("]"));
 BA.debugLineNum = 804;BA.debugLine="DatosGlobales.CopiaProgress = FxGlobales.CInt(10";
Debug.ShouldStop(8);
servbackup4.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(servbackup4.mostCurrent._fxglobales.runMethod(true,"_cint" /*RemoteObject*/ ,servbackup4.processBA,(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_totaluploaded,servbackup4._currentfilesize}, "*/",0, 0)))));
 BA.debugLineNum = 811;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = Round2((Cant";
Debug.ShouldStop(1024);
servbackup4.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/  = RemoteObject.concat(servbackup4.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {servbackup4._cantencurso,RemoteObject.createImmutable(100)}, "*",0, 1)),servbackup4._cantidadtotal}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("%"));
 BA.debugLineNum = 812;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS - P";
Debug.ShouldStop(2048);
_modificarnotificacion(servbackup4._idnotificacion,RemoteObject.concat(RemoteObject.createImmutable("FOTOS - PROCESO GLOBAL ["),servbackup4._cantencurso,RemoteObject.createImmutable("/"),servbackup4._cantidadtotal,RemoteObject.createImmutable("]  "),servbackup4.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/ ),RemoteObject.concat(servbackup4.mostCurrent._datosglobales._nombrearchivo /*RemoteObject*/ ,servbackup4.mostCurrent.__c.getField(true,"CRLF"),servbackup4.mostCurrent._datosglobales._copiaprogreso /*RemoteObject*/ ,RemoteObject.createImmutable(" - "),servbackup4.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/ ,RemoteObject.createImmutable("%")));
 BA.debugLineNum = 816;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("g",servbackup4._cantencurso,BA.numberCast(double.class, servbackup4._cantidadtotal))) { 
 BA.debugLineNum = 817;BA.debugLine="FinalizarProceso";
Debug.ShouldStop(65536);
_finalizarproceso();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",servbackup4.processBA, e10.toString()); BA.debugLineNum = 859;BA.debugLine="Log(\"ERROR: en FTP_UploadProgress - \" & LastExce";
Debug.ShouldStop(67108864);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51048638",RemoteObject.concat(RemoteObject.createImmutable("ERROR: en FTP_UploadProgress - "),servbackup4.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)),0);
 };
 BA.debugLineNum = 862;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _guardararchivoenelservidor(RemoteObject _pathdelservidor,RemoteObject _ip,RemoteObject _puerto,RemoteObject _usuario,RemoteObject _contra,RemoteObject _rutamobile,RemoteObject _archivomobilefull,RemoteObject _tipodeoperacion) throws Exception{
try {
		Debug.PushSubsStack("GuardarArchivoEnElServidor (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,498);
if (RapidSub.canDelegate("guardararchivoenelservidor")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","guardararchivoenelservidor", _pathdelservidor, _ip, _puerto, _usuario, _contra, _rutamobile, _archivomobilefull, _tipodeoperacion);}
ResumableSub_GuardarArchivoEnElServidor rsub = new ResumableSub_GuardarArchivoEnElServidor(null,_pathdelservidor,_ip,_puerto,_usuario,_contra,_rutamobile,_archivomobilefull,_tipodeoperacion);
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
public static class ResumableSub_GuardarArchivoEnElServidor extends BA.ResumableSub {
public ResumableSub_GuardarArchivoEnElServidor(b4a.example.servbackup4 parent,RemoteObject _pathdelservidor,RemoteObject _ip,RemoteObject _puerto,RemoteObject _usuario,RemoteObject _contra,RemoteObject _rutamobile,RemoteObject _archivomobilefull,RemoteObject _tipodeoperacion) {
this.parent = parent;
this._pathdelservidor = _pathdelservidor;
this._ip = _ip;
this._puerto = _puerto;
this._usuario = _usuario;
this._contra = _contra;
this._rutamobile = _rutamobile;
this._archivomobilefull = _archivomobilefull;
this._tipodeoperacion = _tipodeoperacion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.servbackup4 parent;
RemoteObject _pathdelservidor;
RemoteObject _ip;
RemoteObject _puerto;
RemoteObject _usuario;
RemoteObject _contra;
RemoteObject _rutamobile;
RemoteObject _archivomobilefull;
RemoteObject _tipodeoperacion;
RemoteObject _path = RemoteObject.createImmutable("");
RemoteObject _resu = RemoteObject.createImmutable(false);
RemoteObject _archivomobile = RemoteObject.createImmutable("");
RemoteObject _fechaarchivo = RemoteObject.createImmutable("");
RemoteObject _primerubicacion = RemoteObject.createImmutable(0);
RemoteObject _segundaubicacion = RemoteObject.createImmutable(0);
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _command = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _replycode = RemoteObject.createImmutable(0);
RemoteObject _replystring = RemoteObject.createImmutable("");
RemoteObject _sf2 = RemoteObject.declareNull("Object");
RemoteObject _rsb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _complete = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GuardarArchivoEnElServidor (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,498);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("PathDelServidor", _pathdelservidor);
Debug.locals.put("Ip", _ip);
Debug.locals.put("Puerto", _puerto);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("Contra", _contra);
Debug.locals.put("RutaMobile", _rutamobile);
Debug.locals.put("ArchivoMobileFull", _archivomobilefull);
Debug.locals.put("TipoDeOperacion", _tipodeoperacion);
 BA.debugLineNum = 499;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//try
this.state = 88;
this.catchState = 87;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 87;
 BA.debugLineNum = 500;BA.debugLine="Dim Path As String = \"\"";
Debug.ShouldStop(524288);
_path = BA.ObjectToString("");Debug.locals.put("Path", _path);Debug.locals.put("Path", _path);
 BA.debugLineNum = 501;BA.debugLine="Dim Resu As Boolean = False";
Debug.ShouldStop(1048576);
_resu = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resu", _resu);Debug.locals.put("Resu", _resu);
 BA.debugLineNum = 504;BA.debugLine="DatosGlobales.CopiaProgress = 0";
Debug.ShouldStop(8388608);
parent.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 507;BA.debugLine="If TipoDeOperacion = 0 Then 'FOTOS CAMARA";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_tipodeoperacion,BA.numberCast(double.class, 0))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 509;BA.debugLine="Else If TipoDeOperacion = 1 Then 'VIDEOS CAMARA";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_tipodeoperacion,BA.numberCast(double.class, 1))) { 
this.state = 8;
}else 
{ BA.debugLineNum = 511;BA.debugLine="Else If TipoDeOperacion = 2 Then 'IMAGENES WHATS";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_tipodeoperacion,BA.numberCast(double.class, 2))) { 
this.state = 10;
}else 
{ BA.debugLineNum = 513;BA.debugLine="Else If TipoDeOperacion = 3 Then 'VIDEOS WHATSAP";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_tipodeoperacion,BA.numberCast(double.class, 3))) { 
this.state = 12;
}}}}
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 508;BA.debugLine="Path = PathFotosCamara";
Debug.ShouldStop(134217728);
_path = parent._pathfotoscamara;Debug.locals.put("Path", _path);
 if (true) break;

case 8:
//C
this.state = 13;
 BA.debugLineNum = 510;BA.debugLine="Path = PathVideosCamara";
Debug.ShouldStop(536870912);
_path = parent._pathvideoscamara;Debug.locals.put("Path", _path);
 if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 512;BA.debugLine="Path = PathImagenesWhatsApp";
Debug.ShouldStop(-2147483648);
_path = parent._pathimageneswhatsapp;Debug.locals.put("Path", _path);
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 514;BA.debugLine="Path = PathVideosWhatsApp";
Debug.ShouldStop(2);
_path = parent._pathvideoswhatsapp;Debug.locals.put("Path", _path);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 518;BA.debugLine="Dim ArchivoMobile As String = FxGlobales.Left(Ar";
Debug.ShouldStop(32);
_archivomobile = parent.mostCurrent._fxglobales.runMethod(true,"_left" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_archivomobilefull),(Object)(_archivomobilefull.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(";")))));Debug.locals.put("ArchivoMobile", _archivomobile);Debug.locals.put("ArchivoMobile", _archivomobile);
 BA.debugLineNum = 520;BA.debugLine="Dim FechaArchivo As String '= FxGlobales.Right(A";
Debug.ShouldStop(128);
_fechaarchivo = RemoteObject.createImmutable("");Debug.locals.put("FechaArchivo", _fechaarchivo);
 BA.debugLineNum = 522;BA.debugLine="DatosGlobales.NombreArchivo = ArchivoMobile";
Debug.ShouldStop(512);
parent.mostCurrent._datosglobales._nombrearchivo /*RemoteObject*/  = _archivomobile;
 BA.debugLineNum = 527;BA.debugLine="FechaWhapp = \"\"";
Debug.ShouldStop(16384);
parent._fechawhapp = BA.ObjectToString("");
 BA.debugLineNum = 528;BA.debugLine="If TipoDeOperacion = 2 Or TipoDeOperacion = 3 Th";
Debug.ShouldStop(32768);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_tipodeoperacion,BA.numberCast(double.class, 2)) || RemoteObject.solveBoolean("=",_tipodeoperacion,BA.numberCast(double.class, 3))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 532;BA.debugLine="Dim PrimerUbicacion As Int = ArchivoMobile.Inde";
Debug.ShouldStop(524288);
_primerubicacion = _archivomobile.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("PrimerUbicacion", _primerubicacion);Debug.locals.put("PrimerUbicacion", _primerubicacion);
 BA.debugLineNum = 533;BA.debugLine="Dim SegundaUbicacion As Int  = ArchivoMobile.La";
Debug.ShouldStop(1048576);
_segundaubicacion = _archivomobile.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("SegundaUbicacion", _segundaubicacion);Debug.locals.put("SegundaUbicacion", _segundaubicacion);
 BA.debugLineNum = 534;BA.debugLine="FechaWhapp = FxGlobales.Mid(ArchivoMobile, Prim";
Debug.ShouldStop(2097152);
parent._fechawhapp = parent.mostCurrent._fxglobales.runMethod(true,"_mid" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_archivomobile),(Object)(RemoteObject.solve(new RemoteObject[] {_primerubicacion,RemoteObject.createImmutable(2)}, "+",1, 1)),(Object)(BA.numberCast(int.class, 8)));
 BA.debugLineNum = 535;BA.debugLine="FechaArchivo = FechaWhapp";
Debug.ShouldStop(4194304);
_fechaarchivo = parent._fechawhapp;Debug.locals.put("FechaArchivo", _fechaarchivo);
 if (true) break;
;
 BA.debugLineNum = 539;BA.debugLine="If TipoDeOperacion = 0 Or TipoDeOperacion = 1 Th";
Debug.ShouldStop(67108864);

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_tipodeoperacion,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_tipodeoperacion,BA.numberCast(double.class, 1))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 540;BA.debugLine="Dim PrimerUbicacion As Int = ArchivoMobile.Inde";
Debug.ShouldStop(134217728);
_primerubicacion = _archivomobile.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("_")));Debug.locals.put("PrimerUbicacion", _primerubicacion);Debug.locals.put("PrimerUbicacion", _primerubicacion);
 BA.debugLineNum = 541;BA.debugLine="Dim SegundaUbicacion As Int  = ArchivoMobile.La";
Debug.ShouldStop(268435456);
_segundaubicacion = _archivomobile.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("_")));Debug.locals.put("SegundaUbicacion", _segundaubicacion);Debug.locals.put("SegundaUbicacion", _segundaubicacion);
 BA.debugLineNum = 542;BA.debugLine="FechaWhapp = FxGlobales.Mid(ArchivoMobile, Prim";
Debug.ShouldStop(536870912);
parent._fechawhapp = parent.mostCurrent._fxglobales.runMethod(true,"_mid" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_archivomobile),(Object)(RemoteObject.solve(new RemoteObject[] {_primerubicacion,RemoteObject.createImmutable(2)}, "+",1, 1)),(Object)(BA.numberCast(int.class, 8)));
 BA.debugLineNum = 543;BA.debugLine="FechaArchivo = FechaWhapp";
Debug.ShouldStop(1073741824);
_fechaarchivo = parent._fechawhapp;Debug.locals.put("FechaArchivo", _fechaarchivo);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 547;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServidor";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983089",RemoteObject.concat(RemoteObject.createImmutable("Ejecutando FX -> GuardarArchivoEnElServidor - [1] - Para el archivo: "),_archivomobile,RemoteObject.createImmutable(" FechaArchivo =====================> "),parent._fechawhapp,RemoteObject.createImmutable(" VS "),_fechaarchivo),0);
 BA.debugLineNum = 556;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then 'esto";
Debug.ShouldStop(2048);
if (true) break;

case 21:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 558;BA.debugLine="If DatosGlobales.IndiceFullBkp > CantEnCurso Th";
Debug.ShouldStop(8192);
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._datosglobales._indicefullbkp /*RemoteObject*/ ,BA.numberCast(double.class, parent._cantencurso))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 560;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServid";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983102",RemoteObject.createImmutable("Ejecutando FX -> GuardarArchivoEnElServidor - [1-Z] - EXISTE PORQUE FUE GUADADO PREVIAMENTE PERO NO SE EVALUA  # ENTONCES NO HAGO NADA!!!"),0);
 BA.debugLineNum = 562;BA.debugLine="DatosGlobales.CopiaProgress = 100";
Debug.ShouldStop(131072);
parent.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(100);
 BA.debugLineNum = 563;BA.debugLine="CantidadOk = CantidadOk + 1 'si bien no hago o";
Debug.ShouldStop(262144);
parent._cantidadok = RemoteObject.solve(new RemoteObject[] {parent._cantidadok,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 564;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS -";
Debug.ShouldStop(524288);
_modificarnotificacion(parent._idnotificacion,RemoteObject.concat(RemoteObject.createImmutable("FOTOS - PROCESO GLOBAL ["),parent._cantencurso,RemoteObject.createImmutable("/"),parent._cantidadtotal,RemoteObject.createImmutable("]  "),parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/ ),RemoteObject.concat(parent.mostCurrent._datosglobales._nombrearchivo /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent._datosglobales._copiaprogreso /*RemoteObject*/ ,RemoteObject.createImmutable(" - "),parent.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/ ,RemoteObject.createImmutable("%")));
 BA.debugLineNum = 565;BA.debugLine="Resu = True";
Debug.ShouldStop(1048576);
_resu = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resu", _resu);
 BA.debugLineNum = 567;BA.debugLine="CantEnCurso = CantEnCurso + 1";
Debug.ShouldStop(4194304);
parent._cantencurso = RemoteObject.solve(new RemoteObject[] {parent._cantencurso,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 568;BA.debugLine="DatosGlobales.CopiaCantEnCurso = CantEnCurso &";
Debug.ShouldStop(8388608);
parent.mostCurrent._datosglobales._copiacantencurso /*RemoteObject*/  = RemoteObject.concat(parent._cantencurso,RemoteObject.createImmutable("/"),parent._cantidadtotal);
 BA.debugLineNum = 569;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = Round2((Ca";
Debug.ShouldStop(16777216);
parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/  = RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent._cantencurso,RemoteObject.createImmutable(100)}, "*",0, 1)),parent._cantidadtotal}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("%"));
 BA.debugLineNum = 571;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServid";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983113",RemoteObject.concat(RemoteObject.createImmutable("Ejecutando FX -> GuardarArchivoEnElServidor - [5-Z] -> Cantidad en curso: "),parent._cantencurso,RemoteObject.createImmutable(" - Cantidad Total: "),parent._cantidadtotal,RemoteObject.createImmutable(" - OK: "),parent._cantidadok,RemoteObject.createImmutable(" - Fallidas: "),parent._cantidadfallidas,RemoteObject.createImmutable(" - Progreso del proceso: "),parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/ ),0);
 BA.debugLineNum = 573;BA.debugLine="Return Resu";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resu));return;};
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
 BA.debugLineNum = 582;BA.debugLine="If File.Exists(PathDelServidor & \"/\" & Path & \"/";
Debug.ShouldStop(32);

case 28:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(_pathdelservidor,RemoteObject.createImmutable("/"),_path,RemoteObject.createImmutable("/"),_fechaarchivo)),(Object)(RemoteObject.createImmutable(""))),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 30;
}else {
this.state = 40;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 585;BA.debugLine="If FTP3.IsInitialized = True Then";
Debug.ShouldStop(256);
if (true) break;

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",parent._ftp3.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 586;BA.debugLine="FTP3.CloseNow";
Debug.ShouldStop(512);
parent._ftp3.runVoidMethod ("CloseNow");
 if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 589;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
Debug.ShouldStop(4096);
parent._ftp3.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 590;BA.debugLine="FTP3.PassiveMode = True";
Debug.ShouldStop(8192);
parent._ftp3.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 596;BA.debugLine="Dim sf As Object = FTP3.SendCommand(\"MKD\", Path";
Debug.ShouldStop(524288);
_sf = parent._ftp3.runMethod(false,"SendCommand",servbackup4.processBA,(Object)(BA.ObjectToString("MKD")),(Object)(RemoteObject.concat(_pathdelservidor,RemoteObject.createImmutable("/"),_path)));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 597;BA.debugLine="Wait For (sf) FTP_CommandCompleted(Command As S";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_commandcompleted", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "guardararchivoenelservidor"), _sf);
this.state = 89;
return;
case 89:
//C
this.state = 35;
_command = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Command", _command);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_replycode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ReplyCode", _replycode);
_replystring = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("ReplyString", _replystring);
;
 BA.debugLineNum = 598;BA.debugLine="If Success = True Then";
Debug.ShouldStop(2097152);
if (true) break;

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",_success,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 600;BA.debugLine="FTP3.CloseNow";
Debug.ShouldStop(8388608);
parent._ftp3.runVoidMethod ("CloseNow");
 if (true) break;

case 38:
//C
this.state = 41;
;
 if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 603;BA.debugLine="Log(\"No pudo crear carpeta: \" & PathDelServidor";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983145",RemoteObject.concat(RemoteObject.createImmutable("No pudo crear carpeta: "),_pathdelservidor,RemoteObject.createImmutable("/"),_path,RemoteObject.createImmutable("!!!")),0);
 if (true) break;
;
 BA.debugLineNum = 606;BA.debugLine="If File.Exists(PathDelServidor & \"/\" & Path & \"/";
Debug.ShouldStop(536870912);

case 41:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(_pathdelservidor,RemoteObject.createImmutable("/"),_path,RemoteObject.createImmutable("/"),_fechaarchivo)),(Object)(RemoteObject.createImmutable(""))),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 43;
}else {
this.state = 53;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 609;BA.debugLine="If FTP3.IsInitialized = True Then";
Debug.ShouldStop(1);
if (true) break;

case 44:
//if
this.state = 47;
if (RemoteObject.solveBoolean("=",parent._ftp3.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 610;BA.debugLine="FTP3.CloseNow";
Debug.ShouldStop(2);
parent._ftp3.runVoidMethod ("CloseNow");
 if (true) break;

case 47:
//C
this.state = 48;
;
 BA.debugLineNum = 613;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
Debug.ShouldStop(16);
parent._ftp3.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 614;BA.debugLine="FTP3.PassiveMode = True";
Debug.ShouldStop(32);
parent._ftp3.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 618;BA.debugLine="Dim sf2 As Object = FTP3.SendCommand(\"MKD\", Pat";
Debug.ShouldStop(512);
_sf2 = parent._ftp3.runMethod(false,"SendCommand",servbackup4.processBA,(Object)(BA.ObjectToString("MKD")),(Object)(RemoteObject.concat(_pathdelservidor,RemoteObject.createImmutable("/"),_path,RemoteObject.createImmutable("/"),_fechaarchivo)));Debug.locals.put("sf2", _sf2);Debug.locals.put("sf2", _sf2);
 BA.debugLineNum = 619;BA.debugLine="Wait For (sf2) FTP_CommandCompleted(Command As";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_commandcompleted", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "guardararchivoenelservidor"), _sf2);
this.state = 90;
return;
case 90:
//C
this.state = 48;
_command = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Command", _command);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_replycode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ReplyCode", _replycode);
_replystring = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("ReplyString", _replystring);
;
 BA.debugLineNum = 620;BA.debugLine="If Success = True Then";
Debug.ShouldStop(2048);
if (true) break;

case 48:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",_success,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 622;BA.debugLine="FTP3.CloseNow";
Debug.ShouldStop(8192);
parent._ftp3.runVoidMethod ("CloseNow");
 if (true) break;

case 51:
//C
this.state = 54;
;
 if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 625;BA.debugLine="Log(\"No pudo crear carpeta: \" & PathDelServidor";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983167",RemoteObject.concat(RemoteObject.createImmutable("No pudo crear carpeta: "),_pathdelservidor,RemoteObject.createImmutable("/"),_path,RemoteObject.createImmutable("/"),_fechaarchivo,RemoteObject.createImmutable("!!!")),0);
 if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 629;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServidor";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983171",RemoteObject.concat(RemoteObject.createImmutable("Ejecutando FX -> GuardarArchivoEnElServidor - [2] - Para el archivo: "),_archivomobile,RemoteObject.createImmutable(" - Termino de validar y crear carpetas en el server")),0);
 BA.debugLineNum = 633;BA.debugLine="Dim rsb As ResumableSub = EncontroArchivoEnServi";
Debug.ShouldStop(16777216);
_rsb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsb = _encontroarchivoenservidor(RemoteObject.concat(_pathdelservidor,RemoteObject.createImmutable("/"),_path,RemoteObject.createImmutable("/"),_fechaarchivo,RemoteObject.createImmutable("/")),_rutamobile,_archivomobile);Debug.locals.put("rsb", _rsb);Debug.locals.put("rsb", _rsb);
 BA.debugLineNum = 634;BA.debugLine="Wait For(rsb) complete (Result As Boolean)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "guardararchivoenelservidor"), _rsb);
this.state = 91;
return;
case 91:
//C
this.state = 55;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 635;BA.debugLine="If Result = True Then";
Debug.ShouldStop(67108864);
if (true) break;

case 55:
//if
this.state = 76;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 76;
 BA.debugLineNum = 639;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServido";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983181",RemoteObject.concat(RemoteObject.createImmutable("Ejecutando FX -> GuardarArchivoEnElServidor - [3-1] - EXISTE --> RUTA: "),_pathdelservidor,RemoteObject.createImmutable("/"),_path,RemoteObject.createImmutable("/"),_fechaarchivo,RemoteObject.createImmutable(" -  ARCHIVO --> "),_archivomobile,RemoteObject.createImmutable(" # ENTONCES NO HAGO NADA!!!")),0);
 BA.debugLineNum = 642;BA.debugLine="DatosGlobales.CopiaProgress = 100";
Debug.ShouldStop(2);
parent.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(100);
 BA.debugLineNum = 644;BA.debugLine="CantidadOk = CantidadOk + 1 'si bien no hago op";
Debug.ShouldStop(8);
parent._cantidadok = RemoteObject.solve(new RemoteObject[] {parent._cantidadok,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 648;BA.debugLine="ModificarNotificacion(IdNotificacion, \"FOTOS -";
Debug.ShouldStop(128);
_modificarnotificacion(parent._idnotificacion,RemoteObject.concat(RemoteObject.createImmutable("FOTOS - PROCESO GLOBAL ["),parent._cantencurso,RemoteObject.createImmutable("/"),parent._cantidadtotal,RemoteObject.createImmutable("]  "),parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/ ),RemoteObject.concat(parent.mostCurrent._datosglobales._nombrearchivo /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent._datosglobales._copiaprogreso /*RemoteObject*/ ,RemoteObject.createImmutable(" - "),parent.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/ ,RemoteObject.createImmutable("%")));
 BA.debugLineNum = 651;BA.debugLine="Resu = True";
Debug.ShouldStop(1024);
_resu = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resu", _resu);
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 654;BA.debugLine="Try '09/12/2023 --> nuevo try para ver si se pu";
Debug.ShouldStop(8192);
if (true) break;

case 60:
//try
this.state = 75;
this.catchState = 74;
this.state = 62;
if (true) break;

case 62:
//C
this.state = 63;
this.catchState = 74;
 BA.debugLineNum = 657;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServid";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983199",RemoteObject.concat(RemoteObject.createImmutable("Ejecutando FX -> GuardarArchivoEnElServidor - [3-2] - NO EXISTE!!! --> RUTA: "),_pathdelservidor,RemoteObject.createImmutable("/"),_path,RemoteObject.createImmutable("/"),_fechaarchivo,RemoteObject.createImmutable(" -  ARCHIVO --> "),_archivomobile,RemoteObject.createImmutable(" # ENTONCES SUBO EL ARCHIVO AL SERVER")),0);
 BA.debugLineNum = 661;BA.debugLine="currentFileSize = File.Size(RutaMobile, Archiv";
Debug.ShouldStop(1048576);
parent._currentfilesize = BA.numberCast(int.class, parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Size",(Object)(_rutamobile),(Object)(_archivomobile)));
 BA.debugLineNum = 664;BA.debugLine="If FTP4.IsInitialized = False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 63:
//if
this.state = 66;
if (RemoteObject.solveBoolean("=",parent._ftp4.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 665;BA.debugLine="FTP4.Initialize(\"FTP\",DatosGlobales.ServidorI";
Debug.ShouldStop(16777216);
parent._ftp4.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 666;BA.debugLine="FTP4.PassiveMode = True";
Debug.ShouldStop(33554432);
parent._ftp4.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 669;BA.debugLine="Dim complete As Object = FTP4.UploadFile(RutaM";
Debug.ShouldStop(268435456);
_complete = parent._ftp4.runMethod(false,"UploadFile",servbackup4.processBA,(Object)(_rutamobile),(Object)(_archivomobile),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(_pathdelservidor,RemoteObject.createImmutable("/"),_path,RemoteObject.createImmutable("/"),_fechaarchivo,RemoteObject.createImmutable("/"),_archivomobile)));Debug.locals.put("complete", _complete);Debug.locals.put("complete", _complete);
 BA.debugLineNum = 671;BA.debugLine="Wait For (complete) ftp_UploadCompleted (Serve";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "guardararchivoenelservidor"), _complete);
this.state = 92;
return;
case 92:
//C
this.state = 67;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 672;BA.debugLine="If Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 67:
//if
this.state = 72;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 69;
}else {
this.state = 71;
}if (true) break;

case 69:
//C
this.state = 72;
 BA.debugLineNum = 673;BA.debugLine="Resu = True";
Debug.ShouldStop(1);
_resu = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resu", _resu);
 BA.debugLineNum = 674;BA.debugLine="CantidadOk = CantidadOk + 1";
Debug.ShouldStop(2);
parent._cantidadok = RemoteObject.solve(new RemoteObject[] {parent._cantidadok,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 675;BA.debugLine="DatosGlobales.CopiaProgress = 100 'pb.Progres";
Debug.ShouldStop(4);
parent.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(100);
 BA.debugLineNum = 679;BA.debugLine="FTP4.CloseNow";
Debug.ShouldStop(64);
parent._ftp4.runVoidMethod ("CloseNow");
 BA.debugLineNum = 681;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServi";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983223",RemoteObject.concat(RemoteObject.createImmutable("Ejecutando FX -> GuardarArchivoEnElServidor - [4-1] - El archivo se subio al servidor ok!!! -> "),_archivomobile),0);
 if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 684;BA.debugLine="CantidadFallidas = CantidadFallidas + 1";
Debug.ShouldStop(2048);
parent._cantidadfallidas = RemoteObject.solve(new RemoteObject[] {parent._cantidadfallidas,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 686;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServi";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983228",RemoteObject.concat(RemoteObject.createImmutable("Ejecutando FX -> GuardarArchivoEnElServidor - [4-2] - Fallo subida de archivo al servidor "),_archivomobile),0);
 if (true) break;

case 72:
//C
this.state = 75;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 74:
//C
this.state = 75;
this.catchState = 87;
 BA.debugLineNum = 693;BA.debugLine="Log(\"°°°°°°°°°°°°°°°°°°°°°° #ERROR: en subida";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983235",RemoteObject.concat(RemoteObject.createImmutable("°°°°°°°°°°°°°°°°°°°°°° #ERROR: en subida de archivo FTP4.UploadFile  °°°°°°°°°°°°°°°°°°°°°°°°°°°"),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)),0);
 if (true) break;
if (true) break;

case 75:
//C
this.state = 76;
this.catchState = 87;
;
 if (true) break;
;
 BA.debugLineNum = 712;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then 'esto";
Debug.ShouldStop(128);

case 76:
//if
this.state = 85;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 78;
}if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 715;BA.debugLine="If Resu = True Then";
Debug.ShouldStop(1024);
if (true) break;

case 79:
//if
this.state = 84;
if (RemoteObject.solveBoolean("=",_resu,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 81;
}else {
this.state = 83;
}if (true) break;

case 81:
//C
this.state = 84;
 BA.debugLineNum = 716;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullb";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("indicefullbkp.txt")),(Object)(BA.NumberToString(parent._cantencurso)));
 BA.debugLineNum = 717;BA.debugLine="Log(\" ---> GUARDO EN ARCHIVO INDICE: \" & CantE";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983259",RemoteObject.concat(RemoteObject.createImmutable(" ---> GUARDO EN ARCHIVO INDICE: "),parent._cantencurso,RemoteObject.createImmutable(" <---")),0);
 if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 719;BA.debugLine="Log(\" ---> #FALLO: ENTONCES NO GUARDO EN ARCHI";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983261",RemoteObject.concat(RemoteObject.createImmutable(" ---> #FALLO: ENTONCES NO GUARDO EN ARCHIVO INDICE: "),parent._cantencurso,RemoteObject.createImmutable("!!! <---")),0);
 if (true) break;

case 84:
//C
this.state = 85;
;
 if (true) break;

case 85:
//C
this.state = 88;
;
 BA.debugLineNum = 725;BA.debugLine="CantEnCurso = CantEnCurso + 1";
Debug.ShouldStop(1048576);
parent._cantencurso = RemoteObject.solve(new RemoteObject[] {parent._cantencurso,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 727;BA.debugLine="DatosGlobales.CopiaCantEnCurso = CantEnCurso & \"";
Debug.ShouldStop(4194304);
parent.mostCurrent._datosglobales._copiacantencurso /*RemoteObject*/  = RemoteObject.concat(parent._cantencurso,RemoteObject.createImmutable("/"),parent._cantidadtotal);
 BA.debugLineNum = 728;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = Round2((Cant";
Debug.ShouldStop(8388608);
parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/  = RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent._cantencurso,RemoteObject.createImmutable(100)}, "*",0, 1)),parent._cantidadtotal}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("%"));
 BA.debugLineNum = 737;BA.debugLine="Log(\"Ejecutando FX -> GuardarArchivoEnElServidor";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983279",RemoteObject.concat(RemoteObject.createImmutable("Ejecutando FX -> GuardarArchivoEnElServidor - [5] -> Cantidad en curso: "),parent._cantencurso,RemoteObject.createImmutable(" - Cantidad Total: "),parent._cantidadtotal,RemoteObject.createImmutable(" - OK: "),parent._cantidadok,RemoteObject.createImmutable(" - Fallidas: "),parent._cantidadfallidas,RemoteObject.createImmutable(" - Progreso del proceso: "),parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/ ),0);
 BA.debugLineNum = 786;BA.debugLine="Return Resu = True 'True";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean("=",_resu,parent.mostCurrent.__c.getField(true,"True")))));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 87:
//C
this.state = 88;
this.catchState = 0;
 BA.debugLineNum = 789;BA.debugLine="Log(\"#ERROR: en Fx GuardarArchivoEnElServidor --";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5983331",RemoteObject.concat(RemoteObject.createImmutable("#ERROR: en Fx GuardarArchivoEnElServidor --> "),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)),0);
 BA.debugLineNum = 790;BA.debugLine="Return Resu";
Debug.ShouldStop(2097152);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resu));return;};
 if (true) break;
if (true) break;

case 88:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 793;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",servbackup4.processBA, e0.toString());}
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
public static void  _ftp_commandcompleted(RemoteObject _command,RemoteObject _success,RemoteObject _replycode,RemoteObject _replystring) throws Exception{
}
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _iniciarproceso(RemoteObject _colmobilrutaorigen) throws Exception{
try {
		Debug.PushSubsStack("IniciarProceso (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,887);
if (RapidSub.canDelegate("iniciarproceso")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","iniciarproceso", _colmobilrutaorigen);}
ResumableSub_IniciarProceso rsub = new ResumableSub_IniciarProceso(null,_colmobilrutaorigen);
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
public static class ResumableSub_IniciarProceso extends BA.ResumableSub {
public ResumableSub_IniciarProceso(b4a.example.servbackup4 parent,RemoteObject _colmobilrutaorigen) {
this.parent = parent;
this._colmobilrutaorigen = _colmobilrutaorigen;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.servbackup4 parent;
RemoteObject _colmobilrutaorigen;
RemoteObject _resultado = RemoteObject.createImmutable(false);
RemoteObject _rscantarch = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _contenidocoleccion = RemoteObject.createImmutable("");
RemoteObject _tipo = RemoteObject.createImmutable("");
RemoteObject _ruta = RemoteObject.createImmutable("");
RemoteObject _operacionactual = RemoteObject.createImmutable(0);
RemoteObject _primeravez = RemoteObject.createImmutable(false);
RemoteObject _listagenerica = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _j = 0;
RemoteObject _archivo = RemoteObject.declareNull("Object");
RemoteObject _extension = RemoteObject.createImmutable("");
RemoteObject _d = RemoteObject.createImmutable(0L);
RemoteObject _concatfiledate = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
int step19;
int limit19;
int step41;
int limit41;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("IniciarProceso (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,887);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("ColMobilRutaOrigen", _colmobilrutaorigen);
 BA.debugLineNum = 890;BA.debugLine="Log(\"Inicio proceso\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179651",RemoteObject.createImmutable("Inicio proceso"),0);
 BA.debugLineNum = 895;BA.debugLine="ListaCompleta.Initialize";
Debug.ShouldStop(1073741824);
parent._listacompleta.runVoidMethod ("Initialize");
 BA.debugLineNum = 896;BA.debugLine="ListaFotos.Initialize";
Debug.ShouldStop(-2147483648);
parent._listafotos.runVoidMethod ("Initialize");
 BA.debugLineNum = 897;BA.debugLine="ListaVideos.Initialize";
Debug.ShouldStop(1);
parent._listavideos.runVoidMethod ("Initialize");
 BA.debugLineNum = 899;BA.debugLine="ListaCompleta.Clear";
Debug.ShouldStop(4);
parent._listacompleta.runVoidMethod ("Clear");
 BA.debugLineNum = 900;BA.debugLine="ListaFotos.Clear";
Debug.ShouldStop(8);
parent._listafotos.runVoidMethod ("Clear");
 BA.debugLineNum = 901;BA.debugLine="ListaVideos.Clear";
Debug.ShouldStop(16);
parent._listavideos.runVoidMethod ("Clear");
 BA.debugLineNum = 903;BA.debugLine="Dim Resultado As Boolean = False";
Debug.ShouldStop(64);
_resultado = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 961;BA.debugLine="ColMobilRutaOrigen = EliminarDuplicados(ColMobilR";
Debug.ShouldStop(1);
_colmobilrutaorigen = _eliminarduplicados(_colmobilrutaorigen);Debug.locals.put("ColMobilRutaOrigen", _colmobilrutaorigen);
 BA.debugLineNum = 963;BA.debugLine="Dim rsCantArch As ResumableSub = ConsultarCantida";
Debug.ShouldStop(4);
_rscantarch = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rscantarch = _consultarcantidadtotaldearchivos(_colmobilrutaorigen);Debug.locals.put("rsCantArch", _rscantarch);Debug.locals.put("rsCantArch", _rscantarch);
 BA.debugLineNum = 964;BA.debugLine="Wait For(rsCantArch) complete (result As Boolean)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "iniciarproceso"), _rscantarch);
this.state = 134;
return;
case 134:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 965;BA.debugLine="If result = True Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 966;BA.debugLine="Log(\"Resultado Fx --> ConsultarCantidadTotalDeAr";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179727",RemoteObject.createImmutable("Resultado Fx --> ConsultarCantidadTotalDeArchivos -> OK!"),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 968;BA.debugLine="Log(\"Resultado Fx --> ConsultarCantidadTotalDeAr";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179729",RemoteObject.createImmutable("Resultado Fx --> ConsultarCantidadTotalDeArchivos -> Fallo!!!"),0);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 975;BA.debugLine="Log(\"Cantidad total: \" & CantidadTotal)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179736",RemoteObject.concat(RemoteObject.createImmutable("Cantidad total: "),parent._cantidadtotal),0);
 BA.debugLineNum = 981;BA.debugLine="If CantidadTotal > 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 7:
//if
this.state = 133;
if (RemoteObject.solveBoolean(">",parent._cantidadtotal,BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 122;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 985;BA.debugLine="For i = 0 To ColMobilRutaOrigen.Size -1";
Debug.ShouldStop(16777216);
if (true) break;

case 10:
//for
this.state = 114;
step19 = 1;
limit19 = RemoteObject.solve(new RemoteObject[] {_colmobilrutaorigen.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 135;
if (true) break;

case 135:
//C
this.state = 114;
if ((step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19)) this.state = 12;
if (true) break;

case 136:
//C
this.state = 135;
_i = ((int)(0 + _i + step19)) ;
Debug.locals.put("i", _i);
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 987;BA.debugLine="Dim ContenidoColeccion As String= ColMobilRutaO";
Debug.ShouldStop(67108864);
_contenidocoleccion = BA.ObjectToString(_colmobilrutaorigen.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ContenidoColeccion", _contenidocoleccion);Debug.locals.put("ContenidoColeccion", _contenidocoleccion);
 BA.debugLineNum = 988;BA.debugLine="Dim Tipo As String = (FxGlobales.Left(Contenido";
Debug.ShouldStop(134217728);
_tipo = (parent.mostCurrent._fxglobales.runMethod(true,"_left" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_contenidocoleccion),(Object)(_contenidocoleccion.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(";"))))));Debug.locals.put("Tipo", _tipo);Debug.locals.put("Tipo", _tipo);
 BA.debugLineNum = 989;BA.debugLine="Dim Ruta As String = (FxGlobales.Right(Contenid";
Debug.ShouldStop(268435456);
_ruta = (parent.mostCurrent._fxglobales.runMethod(true,"_right" /*RemoteObject*/ ,servbackup4.processBA,(Object)(_contenidocoleccion),(Object)((RemoteObject.solve(new RemoteObject[] {_contenidocoleccion.runMethod(true,"length"),_contenidocoleccion.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(";"))),RemoteObject.createImmutable(1)}, "--",2, 1)))));Debug.locals.put("Ruta", _ruta);Debug.locals.put("Ruta", _ruta);
 BA.debugLineNum = 991;BA.debugLine="Dim OperacionActual As Int";
Debug.ShouldStop(1073741824);
_operacionactual = RemoteObject.createImmutable(0);Debug.locals.put("OperacionActual", _operacionactual);
 BA.debugLineNum = 995;BA.debugLine="If Tipo = \"MobilRutaFotos\" Then";
Debug.ShouldStop(4);
if (true) break;

case 13:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("MobilRutaFotos"))) { 
this.state = 15;
}else 
{ BA.debugLineNum = 997;BA.debugLine="Else If Tipo = \"MobilRutaVideos\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("MobilRutaVideos"))) { 
this.state = 17;
}else 
{ BA.debugLineNum = 999;BA.debugLine="Else If Tipo = \"MobilRutaFotosWhapp\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("MobilRutaFotosWhapp"))) { 
this.state = 19;
}else 
{ BA.debugLineNum = 1001;BA.debugLine="Else If Tipo = \"MobilRutaVideosWhapp\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("MobilRutaVideosWhapp"))) { 
this.state = 21;
}}}}
if (true) break;

case 15:
//C
this.state = 22;
 BA.debugLineNum = 996;BA.debugLine="OperacionActual = 0";
Debug.ShouldStop(8);
_operacionactual = BA.numberCast(int.class, 0);Debug.locals.put("OperacionActual", _operacionactual);
 if (true) break;

case 17:
//C
this.state = 22;
 BA.debugLineNum = 998;BA.debugLine="OperacionActual = 1";
Debug.ShouldStop(32);
_operacionactual = BA.numberCast(int.class, 1);Debug.locals.put("OperacionActual", _operacionactual);
 if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 1000;BA.debugLine="OperacionActual = 2";
Debug.ShouldStop(128);
_operacionactual = BA.numberCast(int.class, 2);Debug.locals.put("OperacionActual", _operacionactual);
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1002;BA.debugLine="OperacionActual = 3";
Debug.ShouldStop(512);
_operacionactual = BA.numberCast(int.class, 3);Debug.locals.put("OperacionActual", _operacionactual);
 if (true) break;
;
 BA.debugLineNum = 1007;BA.debugLine="Try";
Debug.ShouldStop(16384);

case 22:
//try
this.state = 113;
this.catchState = 112;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 112;
 BA.debugLineNum = 1011;BA.debugLine="Dim PrimeraVez As Boolean";
Debug.ShouldStop(262144);
_primeravez = RemoteObject.createImmutable(false);Debug.locals.put("PrimeraVez", _primeravez);
 BA.debugLineNum = 1012;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then";
Debug.ShouldStop(524288);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 1013;BA.debugLine="PrimeraVez= True";
Debug.ShouldStop(1048576);
_primeravez = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("PrimeraVez", _primeravez);
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 1015;BA.debugLine="PrimeraVez= False";
Debug.ShouldStop(4194304);
_primeravez = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("PrimeraVez", _primeravez);
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 1018;BA.debugLine="Dim ListaGenerica As List = DevolverLista(Ruta";
Debug.ShouldStop(33554432);
_listagenerica = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listagenerica = _devolverlista(_ruta,_primeravez);Debug.locals.put("ListaGenerica", _listagenerica);Debug.locals.put("ListaGenerica", _listagenerica);
 BA.debugLineNum = 1026;BA.debugLine="For j = 0 To ListaGenerica.Size -1";
Debug.ShouldStop(2);
if (true) break;

case 31:
//for
this.state = 110;
step41 = 1;
limit41 = RemoteObject.solve(new RemoteObject[] {_listagenerica.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
Debug.locals.put("j", _j);
this.state = 137;
if (true) break;

case 137:
//C
this.state = 110;
if ((step41 > 0 && _j <= limit41) || (step41 < 0 && _j >= limit41)) this.state = 33;
if (true) break;

case 138:
//C
this.state = 137;
_j = ((int)(0 + _j + step41)) ;
Debug.locals.put("j", _j);
if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 1028;BA.debugLine="Try";
Debug.ShouldStop(8);
if (true) break;

case 34:
//try
this.state = 109;
this.catchState = 108;
this.state = 36;
if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 108;
 BA.debugLineNum = 1029;BA.debugLine="Dim	Archivo As Object = ListaGenerica.Get(j)";
Debug.ShouldStop(16);
_archivo = _listagenerica.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j)));Debug.locals.put("Archivo", _archivo);Debug.locals.put("Archivo", _archivo);
 BA.debugLineNum = 1031;BA.debugLine="Dim Extension As String = \"\"";
Debug.ShouldStop(64);
_extension = BA.ObjectToString("");Debug.locals.put("Extension", _extension);Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1032;BA.debugLine="Extension = FxGlobales.Right(Archivo, 3)";
Debug.ShouldStop(128);
_extension = parent.mostCurrent._fxglobales.runMethod(true,"_right" /*RemoteObject*/ ,servbackup4.processBA,(Object)(BA.ObjectToString(_archivo)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Extension", _extension);
 BA.debugLineNum = 1033;BA.debugLine="If Extension.ToUpperCase = \"JPG\" Then";
Debug.ShouldStop(256);
if (true) break;

case 37:
//if
this.state = 106;
if (RemoteObject.solveBoolean("=",_extension.runMethod(true,"toUpperCase"),BA.ObjectToString("JPG"))) { 
this.state = 39;
}else 
{ BA.debugLineNum = 1096;BA.debugLine="Else If Extension.ToUpperCase = \"MP4\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_extension.runMethod(true,"toUpperCase"),BA.ObjectToString("MP4"))) { 
this.state = 73;
}}
if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 1034;BA.debugLine="Dim d As Long";
Debug.ShouldStop(512);
_d = RemoteObject.createImmutable(0L);Debug.locals.put("d", _d);
 BA.debugLineNum = 1035;BA.debugLine="d = File.LastModified(Ruta, Archivo)";
Debug.ShouldStop(1024);
_d = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"LastModified",(Object)(_ruta),(Object)(BA.ObjectToString(_archivo)));Debug.locals.put("d", _d);
 BA.debugLineNum = 1037;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 1038;BA.debugLine="Dim ConcatFileDate As String = Archivo & \";";
Debug.ShouldStop(8192);
_concatfiledate = RemoteObject.concat(_archivo,RemoteObject.createImmutable(";"),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_d)));Debug.locals.put("ConcatFileDate", _concatfiledate);Debug.locals.put("ConcatFileDate", _concatfiledate);
 BA.debugLineNum = 1040;BA.debugLine="Try";
Debug.ShouldStop(32768);
if (true) break;

case 40:
//try
this.state = 71;
this.catchState = 70;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 43;
this.catchState = 70;
 BA.debugLineNum = 1041;BA.debugLine="If OperacionActual = 0 Then 'MobilRutaFoto";
Debug.ShouldStop(65536);
if (true) break;

case 43:
//if
this.state = 68;
if (RemoteObject.solveBoolean("=",_operacionactual,BA.numberCast(double.class, 0))) { 
this.state = 45;
}else 
{ BA.debugLineNum = 1066;BA.debugLine="Else If OperacionActual = 2 Then 'MobilRut";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_operacionactual,BA.numberCast(double.class, 2))) { 
this.state = 57;
}}
if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 1042;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*RemoteObject*/ ,parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ,BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ ),parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ,parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ,_ruta,_concatfiledate,parent._operacion.getField(true,"FotosCamara" /*RemoteObject*/ ));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1043;BA.debugLine="Wait For(rs) complete (result As Boolean)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "iniciarproceso"), _rs);
this.state = 139;
return;
case 139:
//C
this.state = 46;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1044;BA.debugLine="If result = True Then";
Debug.ShouldStop(524288);
if (true) break;

case 46:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 55;
 BA.debugLineNum = 1045;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179806",RemoteObject.concat(RemoteObject.createImmutable("Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE LA CAMARA] - Archivo: "),_archivo,RemoteObject.createImmutable(" -> Lo copio OK!")),0);
 if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 1047;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179808",RemoteObject.concat(RemoteObject.createImmutable("Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE LA CAMARA] - Archivo: "),_archivo,RemoteObject.createImmutable(" -> Fallo!!!")),0);
 BA.debugLineNum = 1050;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
Debug.ShouldStop(33554432);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("FOTOS"),RemoteObject.concat(RemoteObject.createImmutable("Falló la copia del archivo: "),_archivo,RemoteObject.createImmutable(" - Próxima ejecución: "),parent.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)));
 BA.debugLineNum = 1051;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(67108864);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1052;BA.debugLine="DatosGlobales.Segundos = 60";
Debug.ShouldStop(134217728);
parent.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 60);
 BA.debugLineNum = 1058;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
Debug.ShouldStop(2);
if (true) break;

case 51:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 1059;BA.debugLine="PrimeraVez= True";
Debug.ShouldStop(4);
_primeravez = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("PrimeraVez", _primeravez);
 if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 1061;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179822",RemoteObject.concat(RemoteObject.createImmutable("Primera vez: "),_primeravez),0);
 BA.debugLineNum = 1062;BA.debugLine="Return False";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 55:
//C
this.state = 68;
;
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 1067;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
Debug.ShouldStop(1024);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*RemoteObject*/ ,parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ,BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ ),parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ,parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ,_ruta,_concatfiledate,parent._operacion.getField(true,"ImagenesWhatsApp" /*RemoteObject*/ ));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1068;BA.debugLine="Wait For(rs) complete (result As Boolean)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "iniciarproceso"), _rs);
this.state = 140;
return;
case 140:
//C
this.state = 58;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1069;BA.debugLine="If result =True Then";
Debug.ShouldStop(4096);
if (true) break;

case 58:
//if
this.state = 67;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 67;
 BA.debugLineNum = 1070;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179831",RemoteObject.concat(RemoteObject.createImmutable("Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE WHATSAPP] - Archivo: "),_archivo,RemoteObject.createImmutable(" -> Lo copio OK!")),0);
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 1072;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179833",RemoteObject.concat(RemoteObject.createImmutable("Resultado Fx --> GuardarArchivoEnElServidor [FOTOS DE WHATSAPP] - Archivo: "),_archivo,RemoteObject.createImmutable(" -> Fallo!!!")),0);
 BA.debugLineNum = 1075;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
Debug.ShouldStop(262144);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("FOTOS"),RemoteObject.concat(RemoteObject.createImmutable("Falló la copia del archivo: "),_archivo,RemoteObject.createImmutable(" - Próxima ejecución: "),parent.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)));
 BA.debugLineNum = 1076;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(524288);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1077;BA.debugLine="DatosGlobales.Segundos = 60";
Debug.ShouldStop(1048576);
parent.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 60);
 BA.debugLineNum = 1083;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
Debug.ShouldStop(67108864);
if (true) break;

case 63:
//if
this.state = 66;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 1084;BA.debugLine="PrimeraVez= True";
Debug.ShouldStop(134217728);
_primeravez = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("PrimeraVez", _primeravez);
 if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 1086;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179847",RemoteObject.concat(RemoteObject.createImmutable("Primera vez: "),_primeravez),0);
 BA.debugLineNum = 1087;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 67:
//C
this.state = 68;
;
 if (true) break;

case 68:
//C
this.state = 71;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 70:
//C
this.state = 71;
this.catchState = 108;
 BA.debugLineNum = 1093;BA.debugLine="Log(\"#ERROR: salio por CATCH de [FOTOS DE";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179854",RemoteObject.concat(RemoteObject.createImmutable("#ERROR: salio por CATCH de [FOTOS DE LA CAMARA] o [FOTOS DE WHATSAPP]"),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)),0);
 if (true) break;
if (true) break;

case 71:
//C
this.state = 106;
this.catchState = 108;
;
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 1097;BA.debugLine="Dim d As Long";
Debug.ShouldStop(256);
_d = RemoteObject.createImmutable(0L);Debug.locals.put("d", _d);
 BA.debugLineNum = 1098;BA.debugLine="d = File.LastModified(Ruta, Archivo)";
Debug.ShouldStop(512);
_d = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"LastModified",(Object)(_ruta),(Object)(BA.ObjectToString(_archivo)));Debug.locals.put("d", _d);
 BA.debugLineNum = 1100;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 1101;BA.debugLine="Dim ConcatFileDate As String = Archivo & \";";
Debug.ShouldStop(4096);
_concatfiledate = RemoteObject.concat(_archivo,RemoteObject.createImmutable(";"),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_d)));Debug.locals.put("ConcatFileDate", _concatfiledate);Debug.locals.put("ConcatFileDate", _concatfiledate);
 BA.debugLineNum = 1103;BA.debugLine="Try";
Debug.ShouldStop(16384);
if (true) break;

case 74:
//try
this.state = 105;
this.catchState = 104;
this.state = 76;
if (true) break;

case 76:
//C
this.state = 77;
this.catchState = 104;
 BA.debugLineNum = 1104;BA.debugLine="If OperacionActual = 1 Then 'MobilRutaFoto";
Debug.ShouldStop(32768);
if (true) break;

case 77:
//if
this.state = 102;
if (RemoteObject.solveBoolean("=",_operacionactual,BA.numberCast(double.class, 1))) { 
this.state = 79;
}else 
{ BA.debugLineNum = 1128;BA.debugLine="Else If OperacionActual = 3 Then 'MobilRut";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_operacionactual,BA.numberCast(double.class, 3))) { 
this.state = 91;
}}
if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 1105;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
Debug.ShouldStop(65536);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*RemoteObject*/ ,parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ,BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ ),parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ,parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ,_ruta,_concatfiledate,parent._operacion.getField(true,"VideosCamara" /*RemoteObject*/ ));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1106;BA.debugLine="Wait For(rs) complete (result As Boolean)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "iniciarproceso"), _rs);
this.state = 141;
return;
case 141:
//C
this.state = 80;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1107;BA.debugLine="If result =True Then";
Debug.ShouldStop(262144);
if (true) break;

case 80:
//if
this.state = 89;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 89;
 BA.debugLineNum = 1108;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179869",RemoteObject.concat(RemoteObject.createImmutable("Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE LA CAMARA] - Archivo: "),_archivo,RemoteObject.createImmutable(" -> Lo copio OK!")),0);
 if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 1110;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179871",RemoteObject.concat(RemoteObject.createImmutable("Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE LA CAMARA] - Archivo: "),_archivo,RemoteObject.createImmutable(" -> Fallo!!!")),0);
 BA.debugLineNum = 1113;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
Debug.ShouldStop(16777216);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("FOTOS"),RemoteObject.concat(RemoteObject.createImmutable("Falló la copia del archivo: "),_archivo,RemoteObject.createImmutable(" - Próxima ejecución: "),parent.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)));
 BA.debugLineNum = 1114;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1115;BA.debugLine="DatosGlobales.Segundos = 60";
Debug.ShouldStop(67108864);
parent.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 60);
 BA.debugLineNum = 1116;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/  = BA.ObjectToString("0%");
 BA.debugLineNum = 1117;BA.debugLine="DatosGlobales.CopiaProgress = 0";
Debug.ShouldStop(268435456);
parent.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1118;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
Debug.ShouldStop(536870912);
parent.mostCurrent._datosglobales._copiacantencurso /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1119;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._datosglobales._copiaprogreso /*RemoteObject*/  = BA.ObjectToString("0");
 BA.debugLineNum = 1121;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
Debug.ShouldStop(1);
if (true) break;

case 85:
//if
this.state = 88;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 87;
}if (true) break;

case 87:
//C
this.state = 88;
 BA.debugLineNum = 1122;BA.debugLine="PrimeraVez= True";
Debug.ShouldStop(2);
_primeravez = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("PrimeraVez", _primeravez);
 if (true) break;

case 88:
//C
this.state = 89;
;
 BA.debugLineNum = 1124;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179885",RemoteObject.concat(RemoteObject.createImmutable("Primera vez: "),_primeravez),0);
 BA.debugLineNum = 1125;BA.debugLine="Return False";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 89:
//C
this.state = 102;
;
 if (true) break;

case 91:
//C
this.state = 92;
 BA.debugLineNum = 1130;BA.debugLine="Dim rs As ResumableSub = GuardarArchivoEn";
Debug.ShouldStop(512);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _guardararchivoenelservidor(parent.mostCurrent._datosglobales._usuariorutafotos /*RemoteObject*/ ,parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ,BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ ),parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ,parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ,_ruta,_concatfiledate,parent._operacion.getField(true,"VideosWhatsApp" /*RemoteObject*/ ));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1131;BA.debugLine="Wait For(rs) complete (result As Boolean)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "iniciarproceso"), _rs);
this.state = 142;
return;
case 142:
//C
this.state = 92;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1132;BA.debugLine="If result =True Then";
Debug.ShouldStop(2048);
if (true) break;

case 92:
//if
this.state = 101;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 94;
}else {
this.state = 96;
}if (true) break;

case 94:
//C
this.state = 101;
 BA.debugLineNum = 1133;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179894",RemoteObject.concat(RemoteObject.createImmutable("Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE WHATSAPP] - Archivo: "),_archivo,RemoteObject.createImmutable(" -> Lo copio OK!")),0);
 if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 1135;BA.debugLine="Log(\"Resultado Fx --> GuardarArchivoEnEl";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179896",RemoteObject.concat(RemoteObject.createImmutable("Resultado Fx --> GuardarArchivoEnElServidor [VIDEOS DE WHATSAPP] - Archivo: "),_archivo,RemoteObject.createImmutable(" -> Fallo!!!")),0);
 BA.debugLineNum = 1139;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
Debug.ShouldStop(262144);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("FOTOS"),RemoteObject.concat(RemoteObject.createImmutable("Falló la copia del archivo: "),_archivo,RemoteObject.createImmutable(" - Próxima ejecución: "),parent.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)));
 BA.debugLineNum = 1140;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(524288);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1141;BA.debugLine="DatosGlobales.Segundos = 60";
Debug.ShouldStop(1048576);
parent.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 60);
 BA.debugLineNum = 1142;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
Debug.ShouldStop(2097152);
parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/  = BA.ObjectToString("0%");
 BA.debugLineNum = 1143;BA.debugLine="DatosGlobales.CopiaProgress = 0";
Debug.ShouldStop(4194304);
parent.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1144;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
Debug.ShouldStop(8388608);
parent.mostCurrent._datosglobales._copiacantencurso /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1145;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
Debug.ShouldStop(16777216);
parent.mostCurrent._datosglobales._copiaprogreso /*RemoteObject*/  = BA.ObjectToString("0");
 BA.debugLineNum = 1147;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Th";
Debug.ShouldStop(67108864);
if (true) break;

case 97:
//if
this.state = 100;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._xml_primeravez /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 99;
}if (true) break;

case 99:
//C
this.state = 100;
 BA.debugLineNum = 1148;BA.debugLine="PrimeraVez= True";
Debug.ShouldStop(134217728);
_primeravez = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("PrimeraVez", _primeravez);
 if (true) break;

case 100:
//C
this.state = 101;
;
 BA.debugLineNum = 1150;BA.debugLine="Log(\"Primera vez: \" & PrimeraVez)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179911",RemoteObject.concat(RemoteObject.createImmutable("Primera vez: "),_primeravez),0);
 BA.debugLineNum = 1151;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 101:
//C
this.state = 102;
;
 if (true) break;

case 102:
//C
this.state = 105;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 104:
//C
this.state = 105;
this.catchState = 108;
 BA.debugLineNum = 1158;BA.debugLine="Log(\"#ERROR: salio por CATCH de [VIDEOS DE";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179919",RemoteObject.concat(RemoteObject.createImmutable("#ERROR: salio por CATCH de [VIDEOS DE LA CAMARA] o [FOTOS DE WHATSAPP] o [VIDEOS DE WHATSAPP]"),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)),0);
 if (true) break;
if (true) break;

case 105:
//C
this.state = 106;
this.catchState = 108;
;
 if (true) break;

case 106:
//C
this.state = 109;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 108:
//C
this.state = 109;
this.catchState = 112;
 BA.debugLineNum = 1168;BA.debugLine="Log(\"#ERROR: salio por CATCH FX --> IniciarP";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179929",RemoteObject.concat(RemoteObject.createImmutable("#ERROR: salio por CATCH FX --> IniciarProceso [DETRO DEL TERCER FOR] "),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)),0);
 if (true) break;
if (true) break;

case 109:
//C
this.state = 138;
this.catchState = 112;
;
 if (true) break;
if (true) break;

case 110:
//C
this.state = 113;
Debug.locals.put("j", _j);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 112:
//C
this.state = 113;
this.catchState = 0;
 BA.debugLineNum = 1179;BA.debugLine="ToastMessageShow(\"#ERROR: \" & LastException &";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("#ERROR: "),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1180;BA.debugLine="Log(LastException & CRLF & \"No paso la lista:";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179941",RemoteObject.concat(parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("No paso la lista: "),_tipo,RemoteObject.createImmutable(" -> Por no tener datos")),0);
 BA.debugLineNum = 1181;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(268435456);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;
if (true) break;

case 113:
//C
this.state = 136;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 114:
//C
this.state = 115;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1189;BA.debugLine="Log(\"Finalizo proceso - CantidadFallidas: \" & Ca";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179950",RemoteObject.concat(RemoteObject.createImmutable("Finalizo proceso - CantidadFallidas: "),parent._cantidadfallidas),0);
 BA.debugLineNum = 1192;BA.debugLine="If CantidadFallidas > 0 Then";
Debug.ShouldStop(128);
if (true) break;

case 115:
//if
this.state = 120;
if (RemoteObject.solveBoolean(">",parent._cantidadfallidas,BA.numberCast(double.class, 0))) { 
this.state = 117;
}else {
this.state = 119;
}if (true) break;

case 117:
//C
this.state = 120;
 BA.debugLineNum = 1193;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(256);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 119:
//C
this.state = 120;
 BA.debugLineNum = 1198;BA.debugLine="Resultado = True";
Debug.ShouldStop(8192);
_resultado = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resultado", _resultado);
 if (true) break;

case 120:
//C
this.state = 133;
;
 if (true) break;

case 122:
//C
this.state = 123;
 BA.debugLineNum = 1210;BA.debugLine="If	FTP3.IsInitialized Then";
Debug.ShouldStop(33554432);
if (true) break;

case 123:
//if
this.state = 126;
if (parent._ftp3.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 125;
}if (true) break;

case 125:
//C
this.state = 126;
 BA.debugLineNum = 1211;BA.debugLine="FTP3.CloseNow";
Debug.ShouldStop(67108864);
parent._ftp3.runVoidMethod ("CloseNow");
 if (true) break;
;
 BA.debugLineNum = 1214;BA.debugLine="If	FTP4.IsInitialized Then";
Debug.ShouldStop(536870912);

case 126:
//if
this.state = 129;
if (parent._ftp4.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 128;
}if (true) break;

case 128:
//C
this.state = 129;
 BA.debugLineNum = 1215;BA.debugLine="FTP4.CloseNow";
Debug.ShouldStop(1073741824);
parent._ftp4.runVoidMethod ("CloseNow");
 if (true) break;
;
 BA.debugLineNum = 1218;BA.debugLine="If	FTP_Consulta.IsInitialized Then";
Debug.ShouldStop(2);

case 129:
//if
this.state = 132;
if (parent._ftp_consulta.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 131;
}if (true) break;

case 131:
//C
this.state = 132;
 BA.debugLineNum = 1219;BA.debugLine="FTP_Consulta.CloseNow";
Debug.ShouldStop(4);
parent._ftp_consulta.runVoidMethod ("CloseNow");
 if (true) break;

case 132:
//C
this.state = 133;
;
 BA.debugLineNum = 1223;BA.debugLine="CantEnCurso = 0";
Debug.ShouldStop(64);
parent._cantencurso = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1224;BA.debugLine="CantidadTotal = 0";
Debug.ShouldStop(128);
parent._cantidadtotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1227;BA.debugLine="Resultado = True";
Debug.ShouldStop(1024);
_resultado = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 1230;BA.debugLine="Log(\"Finalizo proceso\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51179991",RemoteObject.createImmutable("Finalizo proceso"),0);
 if (true) break;

case 133:
//C
this.state = -1;
;
 BA.debugLineNum = 1239;BA.debugLine="Log(\"Llego al --> DatosGlobales.Ejecutandose = Fa";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","51180000",RemoteObject.createImmutable("Llego al --> DatosGlobales.Ejecutandose = False"),0);
 BA.debugLineNum = 1240;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(8388608);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1242;BA.debugLine="Return Resultado";
Debug.ShouldStop(33554432);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 1244;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",servbackup4.processBA, e0.toString());}
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
public static RemoteObject  _modificarnotificacion(RemoteObject _unidnotificacion,RemoteObject _titulo,RemoteObject _mensaje) throws Exception{
try {
		Debug.PushSubsStack("ModificarNotificacion (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,417);
if (RapidSub.canDelegate("modificarnotificacion")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","modificarnotificacion", _unidnotificacion, _titulo, _mensaje);}
Debug.locals.put("UnIdNotificacion", _unidnotificacion);
Debug.locals.put("Titulo", _titulo);
Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 417;BA.debugLine="Private Sub ModificarNotificacion(UnIdNotificacion";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="noti.Initialize2(noti.IMPORTANCE_LOW) 'para q no";
Debug.ShouldStop(2);
servbackup4._noti.runVoidMethod ("Initialize2",(Object)(servbackup4._noti.getField(true,"IMPORTANCE_LOW")));
 BA.debugLineNum = 420;BA.debugLine="noti.Icon = \"icon\"";
Debug.ShouldStop(8);
servbackup4._noti.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 421;BA.debugLine="noti.Vibrate = False";
Debug.ShouldStop(16);
servbackup4._noti.runVoidMethod ("setVibrate",servbackup4.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 422;BA.debugLine="noti.Sound = False";
Debug.ShouldStop(32);
servbackup4._noti.runVoidMethod ("setSound",servbackup4.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 423;BA.debugLine="noti.Light = False";
Debug.ShouldStop(64);
servbackup4._noti.runVoidMethod ("setLight",servbackup4.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 424;BA.debugLine="noti.SetInfo(Titulo, Mensaje, Principal)";
Debug.ShouldStop(128);
servbackup4._noti.runVoidMethod ("SetInfoNew",servbackup4.processBA,(Object)(BA.ObjectToCharSequence(_titulo)),(Object)(BA.ObjectToCharSequence(_mensaje)),(Object)((servbackup4.mostCurrent._principal.getObject())));
 BA.debugLineNum = 425;BA.debugLine="noti.Notify(UnIdNotificacion)";
Debug.ShouldStop(256);
servbackup4._noti.runVoidMethod ("Notify",(Object)(_unidnotificacion));
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 11;BA.debugLine="Dim FtpTest As FTP";
servbackup4._ftptest = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");
 //BA.debugLineNum = 12;BA.debugLine="FtpTest.PassiveMode = True";
servbackup4._ftptest.runMethod(true,"setPassiveMode",servbackup4.mostCurrent.__c.getField(true,"True"));
 //BA.debugLineNum = 13;BA.debugLine="Dim noti As Notification";
servbackup4._noti = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Dim IdNotificacion As Int = 1 ' Identificador úni";
servbackup4._idnotificacion = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 17;BA.debugLine="Private xui As XUI";
servbackup4._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="Dim ListaCompleta As List";
servbackup4._listacompleta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 20;BA.debugLine="Dim ListaFotos As List";
servbackup4._listafotos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 21;BA.debugLine="Dim ListaVideos As List";
servbackup4._listavideos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 26;BA.debugLine="Dim CantEnCurso As Int";
servbackup4._cantencurso = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 28;BA.debugLine="Dim CantidadTotal As Int = 0 'CONTADOR";
servbackup4._cantidadtotal = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 29;BA.debugLine="Dim CantidadOk As Int = 0 'CONTADOR";
servbackup4._cantidadok = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 30;BA.debugLine="Dim CantidadFallidas As Int = 0 'CONTADOR";
servbackup4._cantidadfallidas = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 32;BA.debugLine="Dim Awake As PhoneWakeState";
servbackup4._awake = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
 //BA.debugLineNum = 36;BA.debugLine="Type TipoOperacion (FotosCamara As Int, VideosCam";
;
 //BA.debugLineNum = 38;BA.debugLine="Dim Operacion As TipoOperacion";
servbackup4._operacion = RemoteObject.createNew ("b4a.example.servbackup4._tipooperacion");
 //BA.debugLineNum = 39;BA.debugLine="Operacion.FotosCamara = 0";
servbackup4._operacion.setField ("FotosCamara" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 //BA.debugLineNum = 40;BA.debugLine="Operacion.VideosCamara = 1";
servbackup4._operacion.setField ("VideosCamara" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 //BA.debugLineNum = 41;BA.debugLine="Operacion.ImagenesWhatsApp = 2";
servbackup4._operacion.setField ("ImagenesWhatsApp" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 //BA.debugLineNum = 42;BA.debugLine="Operacion.VideosWhatsApp = 3";
servbackup4._operacion.setField ("VideosWhatsApp" /*RemoteObject*/ ,BA.numberCast(int.class, 3));
 //BA.debugLineNum = 44;BA.debugLine="Dim const PathFotosCamara As String = \"Fotos\"";
servbackup4._pathfotoscamara = BA.ObjectToString("Fotos");
 //BA.debugLineNum = 45;BA.debugLine="Dim const PathVideosCamara As String = \"Videos\"";
servbackup4._pathvideoscamara = BA.ObjectToString("Videos");
 //BA.debugLineNum = 46;BA.debugLine="Dim const PathImagenesWhatsApp As String = \"Image";
servbackup4._pathimageneswhatsapp = BA.ObjectToString("Imagenes WhatsApp");
 //BA.debugLineNum = 47;BA.debugLine="Dim const PathVideosWhatsApp As String = \"Videos";
servbackup4._pathvideoswhatsapp = BA.ObjectToString("Videos WhatsApp");
 //BA.debugLineNum = 50;BA.debugLine="Dim FTP3 As FTP";
servbackup4._ftp3 = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Dim FTP4 As FTP";
servbackup4._ftp4 = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Dim FTP_Consulta As FTP";
servbackup4._ftp_consulta = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Dim currentFileSize As Int";
servbackup4._currentfilesize = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 57;BA.debugLine="Dim EsPrimeraVez As Boolean = True";
servbackup4._esprimeravez = servbackup4.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 59;BA.debugLine="Dim FechaWhapp As String";
servbackup4._fechawhapp = RemoteObject.createImmutable("");
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,63);
if (RapidSub.canDelegate("service_create")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","service_create");}
 BA.debugLineNum = 63;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="DatosGlobales.EnPrincipal = False";
Debug.ShouldStop(1);
servbackup4.mostCurrent._datosglobales._enprincipal /*RemoteObject*/  = servbackup4.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 66;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
Debug.ShouldStop(2);
servbackup4.mostCurrent._service.setField ("AutomaticForegroundMode",servbackup4.mostCurrent._service.getField(true,"AUTOMATIC_FOREGROUND_ALWAYS"));
 BA.debugLineNum = 68;BA.debugLine="CrearNotificacion(IdNotificacion, \"FOTOS\", \"Inici";
Debug.ShouldStop(8);
_crearnotificacion(servbackup4._idnotificacion,BA.ObjectToString("FOTOS"),RemoteObject.createImmutable("Iniciando..."));
 BA.debugLineNum = 69;BA.debugLine="Service.StartForeground(IdNotificacion,noti)";
Debug.ShouldStop(16);
servbackup4.mostCurrent._service.runVoidMethod ("StartForeground",(Object)(servbackup4._idnotificacion),(Object)((servbackup4._noti.getObject())));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Service_Destroy (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,373);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","service_destroy");}
 BA.debugLineNum = 373;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 376;BA.debugLine="CantEnCurso = 0";
Debug.ShouldStop(8388608);
servbackup4._cantencurso = BA.numberCast(int.class, 0);
 BA.debugLineNum = 377;BA.debugLine="CantidadTotal = 0";
Debug.ShouldStop(16777216);
servbackup4._cantidadtotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 378;BA.debugLine="CantidadOk = 0";
Debug.ShouldStop(33554432);
servbackup4._cantidadok = BA.numberCast(int.class, 0);
 BA.debugLineNum = 379;BA.debugLine="CantidadFallidas = 0";
Debug.ShouldStop(67108864);
servbackup4._cantidadfallidas = BA.numberCast(int.class, 0);
 BA.debugLineNum = 380;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
Debug.ShouldStop(134217728);
servbackup4.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/  = BA.ObjectToString("0%");
 BA.debugLineNum = 381;BA.debugLine="DatosGlobales.CopiaProgress = 0";
Debug.ShouldStop(268435456);
servbackup4.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 382;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
Debug.ShouldStop(536870912);
servbackup4.mostCurrent._datosglobales._copiacantencurso /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 383;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
Debug.ShouldStop(1073741824);
servbackup4.mostCurrent._datosglobales._copiaprogreso /*RemoteObject*/  = BA.ObjectToString("0");
 BA.debugLineNum = 386;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(2);
servbackup4.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = servbackup4.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 388;BA.debugLine="Log(\"Salio por --> Service_Destroy\")";
Debug.ShouldStop(8);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","5655375",RemoteObject.createImmutable("Salio por --> Service_Destroy"),0);
 BA.debugLineNum = 393;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_error(RemoteObject _error,RemoteObject _code) throws Exception{
try {
		Debug.PushSubsStack("Service_Error (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,1669);
if (RapidSub.canDelegate("service_error")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","service_error", _error, _code);}
Debug.locals.put("Error", _error);
Debug.locals.put("Code", _code);
 BA.debugLineNum = 1669;BA.debugLine="Sub Service_Error (Error As String, Code As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1672;BA.debugLine="Log(\"=== SALIO POR --> Service_Error  ===\")";
Debug.ShouldStop(128);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51703939",RemoteObject.createImmutable("=== SALIO POR --> Service_Error  ==="),0);
 BA.debugLineNum = 1674;BA.debugLine="Log(\"Error en el servicio: \" & Error)";
Debug.ShouldStop(512);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51703941",RemoteObject.concat(RemoteObject.createImmutable("Error en el servicio: "),_error),0);
 BA.debugLineNum = 1675;BA.debugLine="Log(\"Código de error: \" & Code)";
Debug.ShouldStop(1024);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51703942",RemoteObject.concat(RemoteObject.createImmutable("Código de error: "),_code),0);
 BA.debugLineNum = 1677;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Service_Start (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,81);
if (RapidSub.canDelegate("service_start")) { b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","service_start", _startingintent); return;}
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
public ResumableSub_Service_Start(b4a.example.servbackup4 parent,RemoteObject _startingintent) {
this.parent = parent;
this._startingintent = _startingintent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.servbackup4 parent;
RemoteObject _startingintent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,81);
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
 BA.debugLineNum = 84;BA.debugLine="Awake.KeepAlive(True)";
Debug.ShouldStop(524288);
parent._awake.runVoidMethod ("KeepAlive",servbackup4.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 87;BA.debugLine="Log(\"ServBackUp4: Service_Start --> Ejecutandose.";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589830",RemoteObject.concat(RemoteObject.createImmutable("ServBackUp4: Service_Start --> Ejecutandose... cada: "),parent.mostCurrent._datosglobales._segundos /*RemoteObject*/ ,RemoteObject.createImmutable(" segundos. Ejecutandose: "),parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ),0);
 BA.debugLineNum = 90;BA.debugLine="If DatosGlobales.Ejecutandose = True Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 91;BA.debugLine="Log(\"$$$ EJECUTANDOSE -> entonces sigue el --> S";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589834",RemoteObject.createImmutable("$$$ EJECUTANDOSE -> entonces sigue el --> StartServiceAt... $$$"),0);
 BA.debugLineNum = 92;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("StartServiceAt",servbackup4.processBA,(Object)(servbackup4.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),parent.mostCurrent._datosglobales._segundos /*RemoteObject*/ ,parent.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "+*",1, 2)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 93;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 95;BA.debugLine="Log(\"$$$ NO SE ESTA EJECUTANDO $$$\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589838",RemoteObject.createImmutable("$$$ NO SE ESTA EJECUTANDO $$$"),0);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 98;BA.debugLine="Log(\"$$$ POST EJECUTANDOSE $$$\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589841",RemoteObject.createImmutable("$$$ POST EJECUTANDOSE $$$"),0);
 BA.debugLineNum = 103;BA.debugLine="If DatosGlobales.LogOk Then";
Debug.ShouldStop(64);
if (true) break;

case 7:
//if
this.state = 26;
if (parent.mostCurrent._datosglobales._logok /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 25;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 106;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
Debug.ShouldStop(512);
if (true) break;

case 10:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 108;BA.debugLine="If FTP3.IsInitialized = False Then";
Debug.ShouldStop(2048);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",parent._ftp3.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 109;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp";
Debug.ShouldStop(4096);
parent._ftp3.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 110;BA.debugLine="FTP3.PassiveMode = True";
Debug.ShouldStop(8192);
parent._ftp3.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 113;BA.debugLine="If FTP4.IsInitialized = False Then";
Debug.ShouldStop(65536);

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",parent._ftp4.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 114;BA.debugLine="FTP4.Initialize(\"FTP\",DatosGlobales.ServidorIp";
Debug.ShouldStop(131072);
parent._ftp4.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 115;BA.debugLine="FTP4.PassiveMode = True";
Debug.ShouldStop(262144);
parent._ftp4.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 118;BA.debugLine="If FTP_Consulta.IsInitialized = False Then";
Debug.ShouldStop(2097152);

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",parent._ftp_consulta.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 119;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Se";
Debug.ShouldStop(4194304);
parent._ftp_consulta.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 120;BA.debugLine="FTP_Consulta.PassiveMode = True";
Debug.ShouldStop(8388608);
parent._ftp_consulta.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 123;BA.debugLine="Log(\"Servicios ftp incializados: FTP3 -> \" & FT";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589866",RemoteObject.concat(RemoteObject.createImmutable("Servicios ftp incializados: FTP3 -> "),parent._ftp3.runMethod(true,"IsInitialized"),RemoteObject.createImmutable(" - FTP4 -> "),parent._ftp4.runMethod(true,"IsInitialized"),RemoteObject.createImmutable(" - FTP_Consulta ->  "),parent._ftp_consulta.runMethod(true,"IsInitialized")),0);
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 128;BA.debugLine="Log(\"NO LOG\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589871",RemoteObject.createImmutable("NO LOG"),0);
 BA.debugLineNum = 129;BA.debugLine="StartActivity(Login)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",servbackup4.processBA,(Object)((parent.mostCurrent._login.getObject())));
 if (true) break;
;
 BA.debugLineNum = 155;BA.debugLine="Try";
Debug.ShouldStop(67108864);

case 26:
//try
this.state = 124;
this.catchState = 123;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 123;
 BA.debugLineNum = 156;BA.debugLine="Log(\"ServBackUp4: PASO POR Service_Start y el pr";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589899",RemoteObject.createImmutable("ServBackUp4: PASO POR Service_Start y el primer TRY"),0);
 BA.debugLineNum = 158;BA.debugLine="If DatosGlobales.EnPrincipal = False Then";
Debug.ShouldStop(536870912);
if (true) break;

case 29:
//if
this.state = 121;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._enprincipal /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 160;BA.debugLine="If DatosGlobales.Configurando = False Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 32:
//if
this.state = 103;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._configurando /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 162;BA.debugLine="Log(\"Ejecutandose: \" & DatosGlobales.Ejecutand";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589905",RemoteObject.concat(RemoteObject.createImmutable("Ejecutandose: "),parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ),0);
 BA.debugLineNum = 167;BA.debugLine="If EsPrimeraVez = True Then 'comentado 31/12/2";
Debug.ShouldStop(64);
if (true) break;

case 35:
//if
this.state = 102;
if (RemoteObject.solveBoolean("=",parent._esprimeravez,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 37;
}else {
this.state = 73;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 170;BA.debugLine="StartActivity(Login)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",servbackup4.processBA,(Object)((parent.mostCurrent._login.getObject())));
 BA.debugLineNum = 172;BA.debugLine="If DatosGlobales.LogOk Then";
Debug.ShouldStop(2048);
if (true) break;

case 38:
//if
this.state = 71;
if (parent.mostCurrent._datosglobales._logok /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 173;BA.debugLine="EsPrimeraVez= False";
Debug.ShouldStop(4096);
parent._esprimeravez = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 175;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
Debug.ShouldStop(16384);
if (true) break;

case 41:
//if
this.state = 70;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 43;
}else {
this.state = 69;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 176;BA.debugLine="Try";
Debug.ShouldStop(32768);
if (true) break;

case 44:
//try
this.state = 67;
this.catchState = 66;
this.state = 46;
if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 66;
 BA.debugLineNum = 178;BA.debugLine="DatosGlobales.Ejecutandose = True '16/12/2";
Debug.ShouldStop(131072);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 180;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServido";
Debug.ShouldStop(524288);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*RemoteObject*/ );Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 181;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "service_start"), _rs);
this.state = 125;
return;
case 125:
//C
this.state = 47;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 182;BA.debugLine="If Result = True Then 'Se pudo conectar al";
Debug.ShouldStop(2097152);
if (true) break;

case 47:
//if
this.state = 64;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 49;
}else {
this.state = 63;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 192;BA.debugLine="ModificarNotificacion(IdNotificacion, \"F";
Debug.ShouldStop(-2147483648);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("Fotos"),RemoteObject.createImmutable("Copia en curso... "));
 BA.debugLineNum = 194;BA.debugLine="Dim rs As ResumableSub = IniciarProceso";
Debug.ShouldStop(2);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _iniciarproceso(parent.mostCurrent._datosglobales._colmobilrutaorigen /*RemoteObject*/ );Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 196;BA.debugLine="Wait For(rs) complete (Result As Boolea";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "service_start"), _rs);
this.state = 126;
return;
case 126:
//C
this.state = 50;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 199;BA.debugLine="If Result = True Then";
Debug.ShouldStop(64);
if (true) break;

case 50:
//if
this.state = 61;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 52;
}else {
this.state = 60;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 201;BA.debugLine="Log(\"### FINALIZO BIEN!!! (FULL BACKUP";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589944",RemoteObject.createImmutable("### FINALIZO BIEN!!! (FULL BACKUP) --> ENTONCES EJECUTO LA FX --> FinalizarProceso"),0);
 BA.debugLineNum = 204;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
Debug.ShouldStop(2048);
if (true) break;

case 53:
//if
this.state = 58;
if (RemoteObject.solveBoolean("g",parent._cantencurso,BA.numberCast(double.class, parent._cantidadtotal))) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
 BA.debugLineNum = 205;BA.debugLine="FinalizarProceso";
Debug.ShouldStop(4096);
_finalizarproceso();
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 207;BA.debugLine="CantEnCurso = 0";
Debug.ShouldStop(16384);
parent._cantencurso = BA.numberCast(int.class, 0);
 BA.debugLineNum = 208;BA.debugLine="CantidadTotal = 0";
Debug.ShouldStop(32768);
parent._cantidadtotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 209;BA.debugLine="CantidadOk = 0";
Debug.ShouldStop(65536);
parent._cantidadok = BA.numberCast(int.class, 0);
 BA.debugLineNum = 210;BA.debugLine="CantidadFallidas = 0";
Debug.ShouldStop(131072);
parent._cantidadfallidas = BA.numberCast(int.class, 0);
 BA.debugLineNum = 211;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"";
Debug.ShouldStop(262144);
parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/  = BA.ObjectToString("0%");
 BA.debugLineNum = 212;BA.debugLine="DatosGlobales.CopiaProgress = 0";
Debug.ShouldStop(524288);
parent.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 213;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
Debug.ShouldStop(1048576);
parent.mostCurrent._datosglobales._copiacantencurso /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 214;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
Debug.ShouldStop(2097152);
parent.mostCurrent._datosglobales._copiaprogreso /*RemoteObject*/  = BA.ObjectToString("0");
 if (true) break;

case 58:
//C
this.state = 61;
;
 if (true) break;

case 60:
//C
this.state = 61;
 BA.debugLineNum = 219;BA.debugLine="Log(\"### NOOO FINALIZO BIEN!!! (FULL B";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589962",RemoteObject.createImmutable("### NOOO FINALIZO BIEN!!! (FULL BACKUP)"),0);
 BA.debugLineNum = 220;BA.debugLine="DatosGlobales.Segundos = 60  '3600s =";
Debug.ShouldStop(134217728);
parent.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 60);
 BA.debugLineNum = 222;BA.debugLine="Log(\"Poner en Notificacion: próxima ej";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589965",RemoteObject.concat(RemoteObject.createImmutable("Poner en Notificacion: próxima ejecucion: "),parent.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)),0);
 if (true) break;

case 61:
//C
this.state = 64;
;
 BA.debugLineNum = 226;BA.debugLine="Log(\"Paso por aca 'Activity_Resume' ->";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589969",RemoteObject.createImmutable("Paso por aca 'Activity_Resume' -> Post 'IniciarProceso'"),0);
 BA.debugLineNum = 231;BA.debugLine="Log(\"Poner en Notificacion: próxima ejecu";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589974",RemoteObject.concat(RemoteObject.createImmutable("Poner en Notificacion: próxima ejecucion: "),parent.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)),0);
 if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 234;BA.debugLine="Log(\"No se encuentra en el Wifi presetead";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589977",RemoteObject.createImmutable("No se encuentra en el Wifi preseteado"),0);
 BA.debugLineNum = 235;BA.debugLine="ModificarNotificacion(IdNotificacion,\"Fot";
Debug.ShouldStop(1024);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("Fotos"),RemoteObject.createImmutable("No se encuentra en el Wifi preseteado"));
 BA.debugLineNum = 236;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(2048);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 64:
//C
this.state = 67;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 66:
//C
this.state = 67;
this.catchState = 123;
 BA.debugLineNum = 240;BA.debugLine="DatosGlobales.Segundos = 360  '3600s = 1hs";
Debug.ShouldStop(32768);
parent.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 360);
 BA.debugLineNum = 241;BA.debugLine="Log(\"Paso por Catch 1 de Service_Start ->";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589984",RemoteObject.concat(RemoteObject.createImmutable("Paso por Catch 1 de Service_Start -> "),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)),0);
 BA.debugLineNum = 242;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(131072);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;
if (true) break;

case 67:
//C
this.state = 70;
this.catchState = 123;
;
 if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 245;BA.debugLine="Log(\"No se puede ejecutar BKP porque una co";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5589988",RemoteObject.createImmutable("No se puede ejecutar BKP porque una copia esta en curso..."),0);
 if (true) break;

case 70:
//C
this.state = 71;
;
 if (true) break;

case 71:
//C
this.state = 102;
;
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 255;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 74:
//if
this.state = 101;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 76;
}else {
this.state = 100;
}if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 257;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 77:
//try
this.state = 98;
this.catchState = 97;
this.state = 79;
if (true) break;

case 79:
//C
this.state = 80;
this.catchState = 97;
 BA.debugLineNum = 258;BA.debugLine="DatosGlobales.Ejecutandose = True '16/12/20";
Debug.ShouldStop(2);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 260;BA.debugLine="Log(\"Ejecutandose NO por primera vez...\")";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5590003",RemoteObject.createImmutable("Ejecutandose NO por primera vez..."),0);
 BA.debugLineNum = 262;BA.debugLine="Dim rs As ResumableSub = ValidarCnxServidor";
Debug.ShouldStop(32);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _validarcnxservidor(parent.mostCurrent._datosglobales._xml_servidorruta /*RemoteObject*/ );Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 263;BA.debugLine="Wait For(rs) Complete (Result As Boolean)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "service_start"), _rs);
this.state = 127;
return;
case 127:
//C
this.state = 80;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 264;BA.debugLine="If Result = True Then 'Se pudo conectar al";
Debug.ShouldStop(128);
if (true) break;

case 80:
//if
this.state = 95;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 82;
}if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 274;BA.debugLine="Dim rs As ResumableSub = IniciarProceso(Da";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _iniciarproceso(parent.mostCurrent._datosglobales._colmobilrutaorigen /*RemoteObject*/ );Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 275;BA.debugLine="Wait For(rs) complete (Result As Boolean)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "service_start"), _rs);
this.state = 128;
return;
case 128:
//C
this.state = 83;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 278;BA.debugLine="If Result = True Then";
Debug.ShouldStop(2097152);
if (true) break;

case 83:
//if
this.state = 94;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 85;
}else {
this.state = 93;
}if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 279;BA.debugLine="Log(\"### FINALIZO BIEN!!! (BACKUP DIARIO)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5590022",RemoteObject.createImmutable("### FINALIZO BIEN!!! (BACKUP DIARIO) --> ENTONCES EJECUTO LA FX --> FinalizarProceso"),0);
 BA.debugLineNum = 284;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
Debug.ShouldStop(134217728);
if (true) break;

case 86:
//if
this.state = 91;
if (RemoteObject.solveBoolean("g",parent._cantencurso,BA.numberCast(double.class, parent._cantidadtotal))) { 
this.state = 88;
}else {
this.state = 90;
}if (true) break;

case 88:
//C
this.state = 91;
 BA.debugLineNum = 285;BA.debugLine="FinalizarProceso";
Debug.ShouldStop(268435456);
_finalizarproceso();
 if (true) break;

case 90:
//C
this.state = 91;
 BA.debugLineNum = 287;BA.debugLine="CantEnCurso = 0";
Debug.ShouldStop(1073741824);
parent._cantencurso = BA.numberCast(int.class, 0);
 BA.debugLineNum = 288;BA.debugLine="CantidadTotal = 0";
Debug.ShouldStop(-2147483648);
parent._cantidadtotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 289;BA.debugLine="CantidadOk = 0";
Debug.ShouldStop(1);
parent._cantidadok = BA.numberCast(int.class, 0);
 BA.debugLineNum = 290;BA.debugLine="CantidadFallidas = 0";
Debug.ShouldStop(2);
parent._cantidadfallidas = BA.numberCast(int.class, 0);
 BA.debugLineNum = 291;BA.debugLine="DatosGlobales.CopiaPorcentEnCurso = \"0%\"";
Debug.ShouldStop(4);
parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/  = BA.ObjectToString("0%");
 BA.debugLineNum = 292;BA.debugLine="DatosGlobales.CopiaProgress = 0";
Debug.ShouldStop(8);
parent.mostCurrent._datosglobales._copiaprogress /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 293;BA.debugLine="DatosGlobales.CopiaCantEnCurso = 0";
Debug.ShouldStop(16);
parent.mostCurrent._datosglobales._copiacantencurso /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 294;BA.debugLine="DatosGlobales.CopiaProgreso =  \"0\"";
Debug.ShouldStop(32);
parent.mostCurrent._datosglobales._copiaprogreso /*RemoteObject*/  = BA.ObjectToString("0");
 if (true) break;

case 91:
//C
this.state = 94;
;
 if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 298;BA.debugLine="Log(\"### NOOO FINALIZO BIEN!!! (BACKUP DI";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5590041",RemoteObject.createImmutable("### NOOO FINALIZO BIEN!!! (BACKUP DIARIO)"),0);
 BA.debugLineNum = 299;BA.debugLine="DatosGlobales.Segundos = 60  '3600s = 1hs";
Debug.ShouldStop(1024);
parent.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 60);
 BA.debugLineNum = 300;BA.debugLine="Log(\"Poner en Notificacion: próxima ejecu";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5590043",RemoteObject.concat(RemoteObject.createImmutable("Poner en Notificacion: próxima ejecucion: "),parent.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)),0);
 if (true) break;

case 94:
//C
this.state = 95;
;
 if (true) break;

case 95:
//C
this.state = 98;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 97:
//C
this.state = 98;
this.catchState = 123;
 BA.debugLineNum = 314;BA.debugLine="DatosGlobales.Segundos = 360  '3600s = 1hs";
Debug.ShouldStop(33554432);
parent.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 360);
 BA.debugLineNum = 315;BA.debugLine="Log(\"Paso por Catch 2 de Service_Start -> \"";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5590058",RemoteObject.concat(RemoteObject.createImmutable("Paso por Catch 2 de Service_Start -> "),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)),0);
 BA.debugLineNum = 316;BA.debugLine="DatosGlobales.Ejecutandose = False";
Debug.ShouldStop(134217728);
parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;
if (true) break;

case 98:
//C
this.state = 101;
this.catchState = 123;
;
 if (true) break;

case 100:
//C
this.state = 101;
 BA.debugLineNum = 319;BA.debugLine="Log(\"No se puede ejecutar BKP porque una cop";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5590062",RemoteObject.createImmutable("No se puede ejecutar BKP porque una copia esta en curso..."),0);
 if (true) break;

case 101:
//C
this.state = 102;
;
 if (true) break;

case 102:
//C
this.state = 103;
;
 BA.debugLineNum = 326;BA.debugLine="Log(\"Estado al finalizar de 'Ejecutandose': \"";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5590069",RemoteObject.concat(RemoteObject.createImmutable("Estado al finalizar de 'Ejecutandose': "),parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ),0);
 if (true) break;
;
 BA.debugLineNum = 332;BA.debugLine="If DatosGlobales.Ejecutandose = True Then";
Debug.ShouldStop(2048);

case 103:
//if
this.state = 120;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._ejecutandose /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 105;
}else {
this.state = 107;
}if (true) break;

case 105:
//C
this.state = 120;
 if (true) break;

case 107:
//C
this.state = 108;
 BA.debugLineNum = 337;BA.debugLine="If DatosGlobales.CopiaPorcentEnCurso = \"100%\"";
Debug.ShouldStop(65536);
if (true) break;

case 108:
//if
this.state = 119;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._datosglobales._copiaporcentencurso /*RemoteObject*/ ,BA.ObjectToString("100%"))) { 
this.state = 110;
}else {
this.state = 112;
}if (true) break;

case 110:
//C
this.state = 119;
 if (true) break;

case 112:
//C
this.state = 113;
 BA.debugLineNum = 346;BA.debugLine="If CantEnCurso >= CantidadTotal Then";
Debug.ShouldStop(33554432);
if (true) break;

case 113:
//if
this.state = 118;
if (RemoteObject.solveBoolean("g",parent._cantencurso,BA.numberCast(double.class, parent._cantidadtotal))) { 
this.state = 115;
}else {
this.state = 117;
}if (true) break;

case 115:
//C
this.state = 118;
 BA.debugLineNum = 347;BA.debugLine="DatosGlobales.Segundos = 3600";
Debug.ShouldStop(67108864);
parent.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 3600);
 if (true) break;

case 117:
//C
this.state = 118;
 BA.debugLineNum = 349;BA.debugLine="DatosGlobales.Segundos = 360";
Debug.ShouldStop(268435456);
parent.mostCurrent._datosglobales._segundos /*RemoteObject*/  = BA.numberCast(int.class, 360);
 if (true) break;

case 118:
//C
this.state = 119;
;
 BA.debugLineNum = 354;BA.debugLine="ModificarNotificacion(IdNotificacion, \"Fotos\"";
Debug.ShouldStop(2);
_modificarnotificacion(parent._idnotificacion,BA.ObjectToString("Fotos"),RemoteObject.concat(RemoteObject.createImmutable("Esperando para hacer copia de seguridad a las: "),parent.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)));
 BA.debugLineNum = 355;BA.debugLine="Log(\"Esperando para hacer copia de seguridad";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5590098",RemoteObject.concat(RemoteObject.createImmutable("Esperando para hacer copia de seguridad a las: "),parent.mostCurrent._fxglobales.runMethod(true,"_obtenerhoraproximaejecucion" /*RemoteObject*/ ,servbackup4.processBA)),0);
 if (true) break;

case 119:
//C
this.state = 120;
;
 if (true) break;

case 120:
//C
this.state = 121;
;
 if (true) break;

case 121:
//C
this.state = 124;
;
 BA.debugLineNum = 363;BA.debugLine="StartServiceAt(Me, DateTime.Now + DatosGlobales.";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("StartServiceAt",servbackup4.processBA,(Object)(servbackup4.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),parent.mostCurrent._datosglobales._segundos /*RemoteObject*/ ,parent.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "+*",1, 2)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
if (true) break;

case 123:
//C
this.state = 124;
this.catchState = 0;
 BA.debugLineNum = 367;BA.debugLine="Log(\"#ERROR: en Service_Start --> \" & LastExcept";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5590110",RemoteObject.concat(RemoteObject.createImmutable("#ERROR: en Service_Start --> "),parent.mostCurrent.__c.runMethod(false,"LastException",servbackup4.processBA)),0);
 if (true) break;
if (true) break;

case 124:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",servbackup4.processBA, e0.toString());}
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
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,1660);
if (RapidSub.canDelegate("service_taskremoved")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","service_taskremoved");}
 BA.debugLineNum = 1660;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1664;BA.debugLine="Log(\"=== SALIO POR --> Service_TaskRemoved  ===\")";
Debug.ShouldStop(-2147483648);
servbackup4.mostCurrent.__c.runVoidMethod ("LogImpl","51638404",RemoteObject.createImmutable("=== SALIO POR --> Service_TaskRemoved  ==="),0);
 BA.debugLineNum = 1666;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validarcnxservidor(RemoteObject _unaruta) throws Exception{
try {
		Debug.PushSubsStack("ValidarCnxServidor (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,440);
if (RapidSub.canDelegate("validarcnxservidor")) { return b4a.example.servbackup4.remoteMe.runUserSub(false, "servbackup4","validarcnxservidor", _unaruta);}
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
public ResumableSub_ValidarCnxServidor(b4a.example.servbackup4 parent,RemoteObject _unaruta) {
this.parent = parent;
this._unaruta = _unaruta;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.servbackup4 parent;
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
		Debug.PushSubsStack("ValidarCnxServidor (servbackup4) ","servbackup4",1,servbackup4.processBA,servbackup4.mostCurrent,440);
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
 BA.debugLineNum = 442;BA.debugLine="Log(\"### Inicia validacion de conexion al servido";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5917506",RemoteObject.concat(RemoteObject.createImmutable("### Inicia validacion de conexion al servidor ### - "),_unaruta),0);
 BA.debugLineNum = 444;BA.debugLine="FtpTest.Initialize(\"FTP\",DatosGlobales.ServidorIp";
Debug.ShouldStop(134217728);
parent._ftptest.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 445;BA.debugLine="FtpTest.PassiveMode = True";
Debug.ShouldStop(268435456);
parent._ftptest.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 447;BA.debugLine="Dim Resu As Boolean = False";
Debug.ShouldStop(1073741824);
_resu = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resu", _resu);Debug.locals.put("Resu", _resu);
 BA.debugLineNum = 449;BA.debugLine="FtpTest.List(unaRuta)";
Debug.ShouldStop(1);
parent._ftptest.runVoidMethod ("List",servbackup4.processBA,(Object)(_unaruta));
 BA.debugLineNum = 450;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", servbackup4.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "servbackup4", "validarcnxservidor"), null);
this.state = 20;
return;
case 20:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 451;BA.debugLine="Dim TotalCarpetas As Int = Folders.Length";
Debug.ShouldStop(4);
_totalcarpetas = _folders.getField(true,"length");Debug.locals.put("TotalCarpetas", _totalcarpetas);Debug.locals.put("TotalCarpetas", _totalcarpetas);
 BA.debugLineNum = 453;BA.debugLine="Log(\"Cantidad de carpetas leidas: \" & TotalCarpet";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5917517",RemoteObject.concat(RemoteObject.createImmutable("Cantidad de carpetas leidas: "),_totalcarpetas,RemoteObject.createImmutable(" ---> "),_success,RemoteObject.createImmutable(" - "),_serverpath),0);
 BA.debugLineNum = 455;BA.debugLine="If Success = True  Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_success,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 16;
 BA.debugLineNum = 456;BA.debugLine="Resu = True";
Debug.ShouldStop(128);
_resu = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resu", _resu);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 458;BA.debugLine="If FTP3.IsInitialized = False Then";
Debug.ShouldStop(512);
if (true) break;

case 6:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",parent._ftp3.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 459;BA.debugLine="FTP3.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
Debug.ShouldStop(1024);
parent._ftp3.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 460;BA.debugLine="FTP3.PassiveMode = True";
Debug.ShouldStop(2048);
parent._ftp3.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 463;BA.debugLine="If FTP4.IsInitialized = False Then";
Debug.ShouldStop(16384);

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent._ftp4.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 464;BA.debugLine="FTP4.Initialize(\"FTP\",DatosGlobales.ServidorIp,";
Debug.ShouldStop(32768);
parent._ftp4.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 465;BA.debugLine="FTP4.PassiveMode = True";
Debug.ShouldStop(65536);
parent._ftp4.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 468;BA.debugLine="If FTP_Consulta.IsInitialized = False Then";
Debug.ShouldStop(524288);

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",parent._ftp_consulta.runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 469;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Ser";
Debug.ShouldStop(1048576);
parent._ftp_consulta.runVoidMethod ("Initialize",servbackup4.processBA,(Object)(BA.ObjectToString("FTP")),(Object)(parent.mostCurrent._datosglobales._servidorip /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, parent.mostCurrent._datosglobales._servidorpuerto /*RemoteObject*/ )),(Object)(parent.mostCurrent._datosglobales._servidorusuario /*RemoteObject*/ ),(Object)(parent.mostCurrent._datosglobales._servidorclave /*RemoteObject*/ ));
 BA.debugLineNum = 470;BA.debugLine="FTP_Consulta.PassiveMode = True";
Debug.ShouldStop(2097152);
parent._ftp_consulta.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
 BA.debugLineNum = 475;BA.debugLine="If	FtpTest.IsInitialized Then";
Debug.ShouldStop(67108864);

case 16:
//if
this.state = 19;
if (parent._ftptest.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 476;BA.debugLine="FtpTest.CloseNow";
Debug.ShouldStop(134217728);
parent._ftptest.runVoidMethod ("CloseNow");
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 479;BA.debugLine="Log(\"### Fin de validacion de conexion al servido";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5917543",RemoteObject.createImmutable("### Fin de validacion de conexion al servidor ###"),0);
 BA.debugLineNum = 481;BA.debugLine="Return Resu";
Debug.ShouldStop(1);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resu));return;};
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
}