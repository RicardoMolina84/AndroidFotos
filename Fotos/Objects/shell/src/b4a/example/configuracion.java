
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

public class configuracion implements IRemote{
	public static configuracion mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public configuracion() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("configuracion"), "b4a.example.configuracion");
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
		pcBA = new PCBA(this, configuracion.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _etfotoscamara = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etvideoscamara = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etimageneswhapp = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etvideoswhapp = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _svconfiguracion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _etcarpetaserverbkp = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etservidorruta = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etservidorip = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etservidorpuerto = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etservidorusuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etservidorclave = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnguardar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _etusuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etclave = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etclaveconf = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _cbrecordar = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _chfotoscamara = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _chvideoscamara = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _chimageneswhapp = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _chvideoswhapp = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _xml_chfotoscamara_hist = RemoteObject.createImmutable("");
public static RemoteObject _xml_chvideoscamara_hist = RemoteObject.createImmutable("");
public static RemoteObject _xml_chimageneswhatsapp_hist = RemoteObject.createImmutable("");
public static RemoteObject _xml_chvideoswhatsapp_hist = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.servbackup4 _servbackup4 = null;
public static b4a.example.principal _principal = null;
public static b4a.example.datosglobales _datosglobales = null;
public static b4a.example.fxglobales _fxglobales = null;
public static b4a.example.login _login = null;
public static b4a.example.servbackup3 _servbackup3 = null;
public static b4a.example.servbackup2 _servbackup2 = null;
public static b4a.example.backup _backup = null;
public static b4a.example.servbackup _servbackup = null;
public static b4a.example.starter _starter = null;
public static b4a.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",configuracion.mostCurrent._activity,"Backup",Debug.moduleToString(b4a.example.backup.class),"BtnGuardar",configuracion.mostCurrent._btnguardar,"CbRecordar",configuracion.mostCurrent._cbrecordar,"ChFotosCamara",configuracion.mostCurrent._chfotoscamara,"ChImagenesWhapp",configuracion.mostCurrent._chimageneswhapp,"ChVideosCamara",configuracion.mostCurrent._chvideoscamara,"ChVideosWhapp",configuracion.mostCurrent._chvideoswhapp,"DatosGlobales",Debug.moduleToString(b4a.example.datosglobales.class),"EtCarpetaServerBkp",configuracion.mostCurrent._etcarpetaserverbkp,"EtClave",configuracion.mostCurrent._etclave,"EtClaveConf",configuracion.mostCurrent._etclaveconf,"EtFotosCamara",configuracion.mostCurrent._etfotoscamara,"EtImagenesWhapp",configuracion.mostCurrent._etimageneswhapp,"EtServidorClave",configuracion.mostCurrent._etservidorclave,"EtServidorIp",configuracion.mostCurrent._etservidorip,"EtServidorPuerto",configuracion.mostCurrent._etservidorpuerto,"EtServidorRuta",configuracion.mostCurrent._etservidorruta,"EtServidorUsuario",configuracion.mostCurrent._etservidorusuario,"EtUsuario",configuracion.mostCurrent._etusuario,"EtVideosCamara",configuracion.mostCurrent._etvideoscamara,"EtVideosWhapp",configuracion.mostCurrent._etvideoswhapp,"FxGlobales",Debug.moduleToString(b4a.example.fxglobales.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"Login",Debug.moduleToString(b4a.example.login.class),"Main",Debug.moduleToString(b4a.example.main.class),"Principal",Debug.moduleToString(b4a.example.principal.class),"ServBackUp",Debug.moduleToString(b4a.example.servbackup.class),"ServBackUp2",Debug.moduleToString(b4a.example.servbackup2.class),"ServBackUp3",Debug.moduleToString(b4a.example.servbackup3.class),"ServBackUp4",Debug.moduleToString(b4a.example.servbackup4.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"SvConfiguracion",configuracion.mostCurrent._svconfiguracion,"XML_ChFotosCamara_Hist",configuracion.mostCurrent._xml_chfotoscamara_hist,"XML_ChImagenesWhatsApp_Hist",configuracion.mostCurrent._xml_chimageneswhatsapp_hist,"XML_ChVideosCamara_Hist",configuracion.mostCurrent._xml_chvideoscamara_hist,"XML_ChVideosWhatsApp_Hist",configuracion.mostCurrent._xml_chvideoswhatsapp_hist};
}
}