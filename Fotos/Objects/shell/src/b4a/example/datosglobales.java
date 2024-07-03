
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class datosglobales implements IRemote{
	public static datosglobales mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public datosglobales() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, datosglobales.class);
    static {
		mostCurrent = new datosglobales();
        remoteMe = RemoteObject.declareNull("b4a.example.datosglobales");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("datosglobales"), "b4a.example.datosglobales");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.example.datosglobales"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _idusuario = RemoteObject.createImmutable(0);
public static RemoteObject _codusuario = RemoteObject.createImmutable("");
public static RemoteObject _descusuario = RemoteObject.createImmutable("");
public static RemoteObject _nombredispositivo = RemoteObject.createImmutable("");
public static RemoteObject _palabraclave = RemoteObject.createImmutable("");
public static RemoteObject _ejecutandose = RemoteObject.createImmutable(false);
public static RemoteObject _segundos = RemoteObject.createImmutable(0);
public static RemoteObject _logok = RemoteObject.createImmutable(false);
public static RemoteObject _configurando = RemoteObject.createImmutable(false);
public static RemoteObject _enprincipal = RemoteObject.createImmutable(false);
public static RemoteObject _forzarejecucion = RemoteObject.createImmutable(false);
public static RemoteObject _copiaporcentencurso = RemoteObject.createImmutable("");
public static RemoteObject _copiacantencurso = RemoteObject.createImmutable("");
public static RemoteObject _copiaprogreso = RemoteObject.createImmutable("");
public static RemoteObject _copiaprogress = RemoteObject.createImmutable("");
public static RemoteObject _nombrearchivo = RemoteObject.createImmutable("");
public static RemoteObject _xml_usuario = RemoteObject.createImmutable("");
public static RemoteObject _xml_contraseña = RemoteObject.createImmutable("");
public static RemoteObject _xml_recordar = RemoteObject.createImmutable("");
public static RemoteObject _xml_fotoscamara = RemoteObject.createImmutable("");
public static RemoteObject _xml_videoscamara = RemoteObject.createImmutable("");
public static RemoteObject _xml_imageneswhatsapp = RemoteObject.createImmutable("");
public static RemoteObject _xml_videoswhatsapp = RemoteObject.createImmutable("");
public static RemoteObject _xml_chfotoscamara = RemoteObject.createImmutable("");
public static RemoteObject _xml_chvideoscamara = RemoteObject.createImmutable("");
public static RemoteObject _xml_chimageneswhatsapp = RemoteObject.createImmutable("");
public static RemoteObject _xml_chvideoswhatsapp = RemoteObject.createImmutable("");
public static RemoteObject _xml_primeravez = RemoteObject.createImmutable("");
public static RemoteObject _xml_usuariorutafotos = RemoteObject.createImmutable("");
public static RemoteObject _xml_servidorruta = RemoteObject.createImmutable("");
public static RemoteObject _xml_servidorip = RemoteObject.createImmutable("");
public static RemoteObject _xml_servidorpuerto = RemoteObject.createImmutable("");
public static RemoteObject _xml_servidorusuario = RemoteObject.createImmutable("");
public static RemoteObject _xml_servidorclave = RemoteObject.createImmutable("");
public static RemoteObject _servidorruta = RemoteObject.createImmutable("");
public static RemoteObject _servidorip = RemoteObject.createImmutable("");
public static RemoteObject _servidorpuerto = RemoteObject.createImmutable("");
public static RemoteObject _servidorusuario = RemoteObject.createImmutable("");
public static RemoteObject _servidorclave = RemoteObject.createImmutable("");
public static RemoteObject _usuariorutafotos = RemoteObject.createImmutable("");
public static RemoteObject _usuariorutavideos = RemoteObject.createImmutable("");
public static RemoteObject _pathfotoscamara = RemoteObject.createImmutable("");
public static RemoteObject _pathvideoscamara = RemoteObject.createImmutable("");
public static RemoteObject _mobilrutafotoscamara = RemoteObject.createImmutable("");
public static RemoteObject _mobilrutavideoscamara = RemoteObject.createImmutable("");
public static RemoteObject _mobilrutaimageneswhapp = RemoteObject.createImmutable("");
public static RemoteObject _mobilrutavideoswhapp = RemoteObject.createImmutable("");
public static RemoteObject _colmobilrutaorigen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _indicefullbkp = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.servbackup4 _servbackup4 = null;
public static b4a.example.principal _principal = null;
public static b4a.example.fxglobales _fxglobales = null;
public static b4a.example.login _login = null;
public static b4a.example.configuracion _configuracion = null;
public static b4a.example.servbackup3 _servbackup3 = null;
public static b4a.example.servbackup2 _servbackup2 = null;
public static b4a.example.backup _backup = null;
public static b4a.example.servbackup _servbackup = null;
public static b4a.example.starter _starter = null;
public static b4a.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Backup",Debug.moduleToString(b4a.example.backup.class),"CodUsuario",datosglobales._codusuario,"ColMobilRutaOrigen",datosglobales._colmobilrutaorigen,"Configuracion",Debug.moduleToString(b4a.example.configuracion.class),"Configurando",datosglobales._configurando,"CopiaCantEnCurso",datosglobales._copiacantencurso,"CopiaPorcentEnCurso",datosglobales._copiaporcentencurso,"CopiaProgreso",datosglobales._copiaprogreso,"CopiaProgress",datosglobales._copiaprogress,"DescUsuario",datosglobales._descusuario,"Ejecutandose",datosglobales._ejecutandose,"EnPrincipal",datosglobales._enprincipal,"ForzarEjecucion",datosglobales._forzarejecucion,"FxGlobales",Debug.moduleToString(b4a.example.fxglobales.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"IdUsuario",datosglobales._idusuario,"IndiceFullBkp",datosglobales._indicefullbkp,"Login",Debug.moduleToString(b4a.example.login.class),"LogOk",datosglobales._logok,"Main",Debug.moduleToString(b4a.example.main.class),"MobilRutaFotosCamara",datosglobales._mobilrutafotoscamara,"MobilRutaImagenesWhapp",datosglobales._mobilrutaimageneswhapp,"MobilRutaVideosCamara",datosglobales._mobilrutavideoscamara,"MobilRutaVideosWhapp",datosglobales._mobilrutavideoswhapp,"NombreArchivo",datosglobales._nombrearchivo,"NombreDispositivo",datosglobales._nombredispositivo,"PalabraClave",datosglobales._palabraclave,"PathFotosCamara",datosglobales._pathfotoscamara,"PathVideosCamara",datosglobales._pathvideoscamara,"Principal",Debug.moduleToString(b4a.example.principal.class),"Segundos",datosglobales._segundos,"ServBackUp",Debug.moduleToString(b4a.example.servbackup.class),"ServBackUp2",Debug.moduleToString(b4a.example.servbackup2.class),"ServBackUp3",Debug.moduleToString(b4a.example.servbackup3.class),"ServBackUp4",Debug.moduleToString(b4a.example.servbackup4.class),"ServidorClave",datosglobales._servidorclave,"ServidorIp",datosglobales._servidorip,"ServidorPuerto",datosglobales._servidorpuerto,"ServidorRuta",datosglobales._servidorruta,"ServidorUsuario",datosglobales._servidorusuario,"Starter",Debug.moduleToString(b4a.example.starter.class),"UsuarioRutaFotos",datosglobales._usuariorutafotos,"UsuarioRutaVideos",datosglobales._usuariorutavideos,"XML_ChFotosCamara",datosglobales._xml_chfotoscamara,"XML_ChImagenesWhatsApp",datosglobales._xml_chimageneswhatsapp,"XML_ChVideosCamara",datosglobales._xml_chvideoscamara,"XML_ChVideosWhatsApp",datosglobales._xml_chvideoswhatsapp,"XML_Contraseña",datosglobales._xml_contraseña,"XML_FotosCamara",datosglobales._xml_fotoscamara,"XML_ImagenesWhatsApp",datosglobales._xml_imageneswhatsapp,"XML_PrimeraVez",datosglobales._xml_primeravez,"XML_Recordar",datosglobales._xml_recordar,"XML_ServidorClave",datosglobales._xml_servidorclave,"XML_ServidorIp",datosglobales._xml_servidorip,"XML_ServidorPuerto",datosglobales._xml_servidorpuerto,"XML_ServidorRuta",datosglobales._xml_servidorruta,"XML_ServidorUsuario",datosglobales._xml_servidorusuario,"XML_Usuario",datosglobales._xml_usuario,"XML_UsuarioRutaFotos",datosglobales._xml_usuariorutafotos,"XML_VideosCamara",datosglobales._xml_videoscamara,"XML_VideosWhatsApp",datosglobales._xml_videoswhatsapp};
}
}