
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

public class servbackup4 implements IRemote{
	public static servbackup4 mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public servbackup4() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("servbackup4"), "b4a.example.servbackup4");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("b4a.example.servbackup4");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, servbackup4.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ftptest = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
public static RemoteObject _noti = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
public static RemoteObject _idnotificacion = RemoteObject.createImmutable(0);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _listacompleta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listafotos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listavideos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cantencurso = RemoteObject.createImmutable(0);
public static RemoteObject _cantidadtotal = RemoteObject.createImmutable(0);
public static RemoteObject _cantidadok = RemoteObject.createImmutable(0);
public static RemoteObject _cantidadfallidas = RemoteObject.createImmutable(0);
public static RemoteObject _awake = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
public static RemoteObject _operacion = RemoteObject.declareNull("b4a.example.servbackup4._tipooperacion");
public static RemoteObject _pathfotoscamara = RemoteObject.createImmutable("");
public static RemoteObject _pathvideoscamara = RemoteObject.createImmutable("");
public static RemoteObject _pathimageneswhatsapp = RemoteObject.createImmutable("");
public static RemoteObject _pathvideoswhatsapp = RemoteObject.createImmutable("");
public static RemoteObject _ftp3 = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
public static RemoteObject _ftp4 = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
public static RemoteObject _ftp_consulta = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
public static RemoteObject _currentfilesize = RemoteObject.createImmutable(0);
public static RemoteObject _esprimeravez = RemoteObject.createImmutable(false);
public static RemoteObject _fechawhapp = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.principal _principal = null;
public static b4a.example.datosglobales _datosglobales = null;
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
		return new Object[] {"Awake",servbackup4._awake,"Backup",Debug.moduleToString(b4a.example.backup.class),"CantEnCurso",servbackup4._cantencurso,"CantidadFallidas",servbackup4._cantidadfallidas,"CantidadOk",servbackup4._cantidadok,"CantidadTotal",servbackup4._cantidadtotal,"Configuracion",Debug.moduleToString(b4a.example.configuracion.class),"currentFileSize",servbackup4._currentfilesize,"DatosGlobales",Debug.moduleToString(b4a.example.datosglobales.class),"EsPrimeraVez",servbackup4._esprimeravez,"FechaWhapp",servbackup4._fechawhapp,"FTP_Consulta",servbackup4._ftp_consulta,"FTP3",servbackup4._ftp3,"FTP4",servbackup4._ftp4,"FtpTest",servbackup4._ftptest,"FxGlobales",Debug.moduleToString(b4a.example.fxglobales.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"IdNotificacion",servbackup4._idnotificacion,"ListaCompleta",servbackup4._listacompleta,"ListaFotos",servbackup4._listafotos,"ListaVideos",servbackup4._listavideos,"Login",Debug.moduleToString(b4a.example.login.class),"Main",Debug.moduleToString(b4a.example.main.class),"noti",servbackup4._noti,"Operacion",servbackup4._operacion,"PathFotosCamara",servbackup4._pathfotoscamara,"PathImagenesWhatsApp",servbackup4._pathimageneswhatsapp,"PathVideosCamara",servbackup4._pathvideoscamara,"PathVideosWhatsApp",servbackup4._pathvideoswhatsapp,"Principal",Debug.moduleToString(b4a.example.principal.class),"ServBackUp",Debug.moduleToString(b4a.example.servbackup.class),"ServBackUp2",Debug.moduleToString(b4a.example.servbackup2.class),"ServBackUp3",Debug.moduleToString(b4a.example.servbackup3.class),"Service",servbackup4.mostCurrent._service,"Starter",Debug.moduleToString(b4a.example.starter.class),"xui",servbackup4._xui};
}
}