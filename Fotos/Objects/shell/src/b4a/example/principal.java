
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

public class principal implements IRemote{
	public static principal mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public principal() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("principal"), "b4a.example.principal");
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
		pcBA = new PCBA(this, principal.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _svconfiguracion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnconfiguracion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnverfotos = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnsalir = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btncerrarapp = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnejecutar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btndetener = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btncargarimg = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _ftp_consulta = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
public static RemoteObject _ftp_consulta_carp_int = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
public static RemoteObject _fd = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs2.InputDialog.FileDialog");
public static RemoteObject _pathseleccionado = RemoteObject.createImmutable("");
public static RemoteObject _btnselcarpeta = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _rbinterna = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _rbexterna = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static b4a.example.main _main = null;
public static b4a.example.servbackup4 _servbackup4 = null;
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
		return new Object[] {"Activity",principal.mostCurrent._activity,"Backup",Debug.moduleToString(b4a.example.backup.class),"BtnCargarImg",principal.mostCurrent._btncargarimg,"BtnCerrarApp",principal.mostCurrent._btncerrarapp,"BtnConfiguracion",principal.mostCurrent._btnconfiguracion,"BtnDetener",principal.mostCurrent._btndetener,"BtnEjecutar",principal.mostCurrent._btnejecutar,"BtnLogin",principal.mostCurrent._btnlogin,"BtnSalir",principal.mostCurrent._btnsalir,"BtnSelCarpeta",principal.mostCurrent._btnselcarpeta,"BtnVerFotos",principal.mostCurrent._btnverfotos,"Configuracion",Debug.moduleToString(b4a.example.configuracion.class),"DatosGlobales",Debug.moduleToString(b4a.example.datosglobales.class),"fd",principal.mostCurrent._fd,"FTP_Consulta",principal.mostCurrent._ftp_consulta,"FTP_Consulta_Carp_Int",principal.mostCurrent._ftp_consulta_carp_int,"FxGlobales",Debug.moduleToString(b4a.example.fxglobales.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"ImageView1",principal.mostCurrent._imageview1,"Login",Debug.moduleToString(b4a.example.login.class),"Main",Debug.moduleToString(b4a.example.main.class),"PathSeleccionado",principal.mostCurrent._pathseleccionado,"RbExterna",principal.mostCurrent._rbexterna,"RbInterna",principal.mostCurrent._rbinterna,"ServBackUp",Debug.moduleToString(b4a.example.servbackup.class),"ServBackUp2",Debug.moduleToString(b4a.example.servbackup2.class),"ServBackUp3",Debug.moduleToString(b4a.example.servbackup3.class),"ServBackUp4",Debug.moduleToString(b4a.example.servbackup4.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"SvConfiguracion",principal.mostCurrent._svconfiguracion};
}
}