
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

public class servbackup2 implements IRemote{
	public static servbackup2 mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public servbackup2() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("servbackup2"), "b4a.example.servbackup2");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("b4a.example.servbackup2");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, servbackup2.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _noti = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
public static RemoteObject _idnotificacion = RemoteObject.createImmutable(0);
public static RemoteObject _contador = RemoteObject.createImmutable(0);
public static RemoteObject _ftptest = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
public static b4a.example.main _main = null;
public static b4a.example.servbackup4 _servbackup4 = null;
public static b4a.example.principal _principal = null;
public static b4a.example.datosglobales _datosglobales = null;
public static b4a.example.fxglobales _fxglobales = null;
public static b4a.example.login _login = null;
public static b4a.example.configuracion _configuracion = null;
public static b4a.example.servbackup3 _servbackup3 = null;
public static b4a.example.backup _backup = null;
public static b4a.example.servbackup _servbackup = null;
public static b4a.example.starter _starter = null;
public static b4a.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Backup",Debug.moduleToString(b4a.example.backup.class),"Configuracion",Debug.moduleToString(b4a.example.configuracion.class),"Contador",servbackup2._contador,"DatosGlobales",Debug.moduleToString(b4a.example.datosglobales.class),"FtpTest",servbackup2._ftptest,"FxGlobales",Debug.moduleToString(b4a.example.fxglobales.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"IdNotificacion",servbackup2._idnotificacion,"Login",Debug.moduleToString(b4a.example.login.class),"Main",Debug.moduleToString(b4a.example.main.class),"noti",servbackup2._noti,"Principal",Debug.moduleToString(b4a.example.principal.class),"ServBackUp",Debug.moduleToString(b4a.example.servbackup.class),"ServBackUp3",Debug.moduleToString(b4a.example.servbackup3.class),"ServBackUp4",Debug.moduleToString(b4a.example.servbackup4.class),"Service",servbackup2.mostCurrent._service,"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}