package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class datosglobales_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim IdUsuario As Int";
datosglobales._idusuario = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Dim CodUsuario As String";
datosglobales._codusuario = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim DescUsuario As String";
datosglobales._descusuario = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim NombreDispositivo As String";
datosglobales._nombredispositivo = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim PalabraClave As String = \"aMaPoLa_2970\"";
datosglobales._palabraclave = BA.ObjectToString("aMaPoLa_2970");
 //BA.debugLineNum = 16;BA.debugLine="Dim Ejecutandose As Boolean";
datosglobales._ejecutandose = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 17;BA.debugLine="Dim Segundos As Int = 3600  '3600 '20 estaba cada";
datosglobales._segundos = BA.numberCast(int.class, 3600);
 //BA.debugLineNum = 19;BA.debugLine="Dim LogOk As Boolean";
datosglobales._logok = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 20;BA.debugLine="Dim Configurando As Boolean 'si en backup o login";
datosglobales._configurando = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 21;BA.debugLine="Dim EnPrincipal As Boolean";
datosglobales._enprincipal = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 22;BA.debugLine="Dim ForzarEjecucion As Boolean";
datosglobales._forzarejecucion = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 25;BA.debugLine="Dim CopiaPorcentEnCurso As String";
datosglobales._copiaporcentencurso = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="Dim CopiaCantEnCurso As String";
datosglobales._copiacantencurso = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Dim CopiaProgreso As String";
datosglobales._copiaprogreso = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Dim CopiaProgress As String";
datosglobales._copiaprogress = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Dim NombreArchivo As String";
datosglobales._nombrearchivo = RemoteObject.createImmutable("");
 //BA.debugLineNum = 38;BA.debugLine="Dim XML_Usuario As String";
datosglobales._xml_usuario = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Dim XML_Contraseña As String";
datosglobales._xml_contraseña = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Dim XML_Recordar As String '0/1";
datosglobales._xml_recordar = RemoteObject.createImmutable("");
 //BA.debugLineNum = 43;BA.debugLine="Dim XML_FotosCamara As String";
datosglobales._xml_fotoscamara = RemoteObject.createImmutable("");
 //BA.debugLineNum = 44;BA.debugLine="Dim XML_VideosCamara As String";
datosglobales._xml_videoscamara = RemoteObject.createImmutable("");
 //BA.debugLineNum = 45;BA.debugLine="Dim XML_ImagenesWhatsApp As String";
datosglobales._xml_imageneswhatsapp = RemoteObject.createImmutable("");
 //BA.debugLineNum = 46;BA.debugLine="Dim XML_VideosWhatsApp As String";
datosglobales._xml_videoswhatsapp = RemoteObject.createImmutable("");
 //BA.debugLineNum = 47;BA.debugLine="Dim XML_ChFotosCamara As String";
datosglobales._xml_chfotoscamara = RemoteObject.createImmutable("");
 //BA.debugLineNum = 48;BA.debugLine="Dim XML_ChVideosCamara As String";
datosglobales._xml_chvideoscamara = RemoteObject.createImmutable("");
 //BA.debugLineNum = 49;BA.debugLine="Dim XML_ChImagenesWhatsApp As String";
datosglobales._xml_chimageneswhatsapp = RemoteObject.createImmutable("");
 //BA.debugLineNum = 50;BA.debugLine="Dim XML_ChVideosWhatsApp As String";
datosglobales._xml_chvideoswhatsapp = RemoteObject.createImmutable("");
 //BA.debugLineNum = 51;BA.debugLine="Dim XML_PrimeraVez As String";
datosglobales._xml_primeravez = RemoteObject.createImmutable("");
 //BA.debugLineNum = 54;BA.debugLine="Dim XML_UsuarioRutaFotos As String";
datosglobales._xml_usuariorutafotos = RemoteObject.createImmutable("");
 //BA.debugLineNum = 57;BA.debugLine="Dim XML_ServidorRuta As String";
datosglobales._xml_servidorruta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 58;BA.debugLine="Dim XML_ServidorIp As String";
datosglobales._xml_servidorip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 59;BA.debugLine="Dim XML_ServidorPuerto As String";
datosglobales._xml_servidorpuerto = RemoteObject.createImmutable("");
 //BA.debugLineNum = 60;BA.debugLine="Dim XML_ServidorUsuario As String";
datosglobales._xml_servidorusuario = RemoteObject.createImmutable("");
 //BA.debugLineNum = 61;BA.debugLine="Dim XML_ServidorClave As String";
datosglobales._xml_servidorclave = RemoteObject.createImmutable("");
 //BA.debugLineNum = 70;BA.debugLine="Dim ServidorRuta As String '= \"./H/DiscoCompart";
datosglobales._servidorruta = RemoteObject.createImmutable("");
 //BA.debugLineNum = 71;BA.debugLine="Dim ServidorIp As String '= \"192.168.1.112\"  '--";
datosglobales._servidorip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 72;BA.debugLine="Dim ServidorPuerto As String '= \"21\"  '--> Ya se";
datosglobales._servidorpuerto = RemoteObject.createImmutable("");
 //BA.debugLineNum = 73;BA.debugLine="Dim ServidorUsuario As String '= \"admin\"  '--> Y";
datosglobales._servidorusuario = RemoteObject.createImmutable("");
 //BA.debugLineNum = 74;BA.debugLine="Dim ServidorClave As String '= \"31119914\"  '-->";
datosglobales._servidorclave = RemoteObject.createImmutable("");
 //BA.debugLineNum = 79;BA.debugLine="Dim UsuarioRutaFotos As String '= ServidorRuta &";
datosglobales._usuariorutafotos = RemoteObject.createImmutable("");
 //BA.debugLineNum = 82;BA.debugLine="Dim UsuarioRutaVideos As String  '= ServidorRuta";
datosglobales._usuariorutavideos = RemoteObject.createImmutable("");
 //BA.debugLineNum = 94;BA.debugLine="Dim const PathFotosCamara As String = \"Fotos\"";
datosglobales._pathfotoscamara = BA.ObjectToString("Fotos");
 //BA.debugLineNum = 95;BA.debugLine="Dim const PathVideosCamara As String = \"Videos\"";
datosglobales._pathvideoscamara = BA.ObjectToString("Videos");
 //BA.debugLineNum = 122;BA.debugLine="Dim MobilRutaFotosCamara As String '=  \"/sdcard/P";
datosglobales._mobilrutafotoscamara = RemoteObject.createImmutable("");
 //BA.debugLineNum = 123;BA.debugLine="Dim MobilRutaVideosCamara As String ' =  \"/sdcard";
datosglobales._mobilrutavideoscamara = RemoteObject.createImmutable("");
 //BA.debugLineNum = 125;BA.debugLine="Dim MobilRutaImagenesWhapp As String";
datosglobales._mobilrutaimageneswhapp = RemoteObject.createImmutable("");
 //BA.debugLineNum = 126;BA.debugLine="Dim MobilRutaVideosWhapp As String";
datosglobales._mobilrutavideoswhapp = RemoteObject.createImmutable("");
 //BA.debugLineNum = 135;BA.debugLine="Dim ColMobilRutaOrigen As List";
datosglobales._colmobilrutaorigen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 167;BA.debugLine="Dim IndiceFullBkp As Int";
datosglobales._indicefullbkp = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}