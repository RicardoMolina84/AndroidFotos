
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

public class httputils2service implements IRemote{
	public static httputils2service mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public httputils2service() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("httputils2service"), "b4a.example.httputils2service");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _receiver;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _receiver = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("b4a.example.httputils2service");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, httputils2service.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _hc = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
public static RemoteObject _taskidtojob = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _tempfolder = RemoteObject.createImmutable("");
public static RemoteObject _taskcounter = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.servbackup4 _servbackup4 = null;
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
  public Object[] GetGlobals() {
		return new Object[] {"Backup",Debug.moduleToString(b4a.example.backup.class),"Configuracion",Debug.moduleToString(b4a.example.configuracion.class),"DatosGlobales",Debug.moduleToString(b4a.example.datosglobales.class),"FxGlobales",Debug.moduleToString(b4a.example.fxglobales.class),"hc",httputils2service._hc,"Login",Debug.moduleToString(b4a.example.login.class),"Main",Debug.moduleToString(b4a.example.main.class),"Principal",Debug.moduleToString(b4a.example.principal.class),"Receiver",httputils2service.mostCurrent._receiver,"ServBackUp",Debug.moduleToString(b4a.example.servbackup.class),"ServBackUp2",Debug.moduleToString(b4a.example.servbackup2.class),"ServBackUp3",Debug.moduleToString(b4a.example.servbackup3.class),"ServBackUp4",Debug.moduleToString(b4a.example.servbackup4.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"taskCounter",httputils2service._taskcounter,"TaskIdToJob",httputils2service._taskidtojob,"TempFolder",httputils2service._tempfolder};
}
}