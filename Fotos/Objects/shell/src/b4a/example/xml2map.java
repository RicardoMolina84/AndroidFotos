
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xml2map {
    public static RemoteObject myClass;
	public xml2map() {
	}
    public static PCBA staticBA = new PCBA(null, xml2map.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.SaxParser");
public static RemoteObject _elements = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mstripnamespaces = RemoteObject.createImmutable(false);
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
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"elements",_ref.getField(false, "_elements"),"mStripNamespaces",_ref.getField(false, "_mstripnamespaces"),"parser",_ref.getField(false, "_parser")};
}
}