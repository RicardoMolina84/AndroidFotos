
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

public class login implements IRemote{
	public static login mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public login() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("login"), "b4a.example.login");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, login.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _btningresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _etusuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etclave = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _intentos = RemoteObject.createImmutable(0);
public static RemoteObject _btnconfig = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.main _main = null;
public static b4a.example.servbackup4 _servbackup4 = null;
public static b4a.example.principal _principal = null;
public static b4a.example.datosglobales _datosglobales = null;
public static b4a.example.fxglobales _fxglobales = null;
public static b4a.example.configuracion _configuracion = null;
public static b4a.example.servbackup3 _servbackup3 = null;
public static b4a.example.servbackup2 _servbackup2 = null;
public static b4a.example.backup _backup = null;
public static b4a.example.servbackup _servbackup = null;
public static b4a.example.starter _starter = null;
public static b4a.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",login.mostCurrent._activity,"Backup",Debug.moduleToString(b4a.example.backup.class),"BtnConfig",login.mostCurrent._btnconfig,"BtnIngresar",login.mostCurrent._btningresar,"Configuracion",Debug.moduleToString(b4a.example.configuracion.class),"DatosGlobales",Debug.moduleToString(b4a.example.datosglobales.class),"EtClave",login.mostCurrent._etclave,"EtUsuario",login.mostCurrent._etusuario,"FxGlobales",Debug.moduleToString(b4a.example.fxglobales.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"intentos",login._intentos,"Main",Debug.moduleToString(b4a.example.main.class),"Principal",Debug.moduleToString(b4a.example.principal.class),"ServBackUp",Debug.moduleToString(b4a.example.servbackup.class),"ServBackUp2",Debug.moduleToString(b4a.example.servbackup2.class),"ServBackUp3",Debug.moduleToString(b4a.example.servbackup3.class),"ServBackUp4",Debug.moduleToString(b4a.example.servbackup4.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"xui",login._xui};
}
}