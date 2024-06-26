package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class principal extends Activity implements B4AActivity{
	public static principal mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.principal");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (principal).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.principal");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.principal", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (principal) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (principal) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return principal.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (principal) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (principal) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            principal mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (principal) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _svconfiguracion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnconfiguracion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnverfotos = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsalir = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncerrarapp = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnejecutar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndetener = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncargarimg = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.net.FTPWrapper _ftp_consulta = null;
public anywheresoftware.b4a.net.FTPWrapper _ftp_consulta_carp_int = null;
public b4a.example.main _main = null;
public b4a.example.servbackup4 _servbackup4 = null;
public b4a.example.datosglobales _datosglobales = null;
public b4a.example.fxglobales _fxglobales = null;
public b4a.example.login _login = null;
public b4a.example.configuracion _configuracion = null;
public b4a.example.backup _backup = null;
public b4a.example.servbackup _servbackup = null;
public b4a.example.servbackup2 _servbackup2 = null;
public b4a.example.servbackup3 _servbackup3 = null;
public b4a.example.starter _starter = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 38;BA.debugLine="DatosGlobales.EnPrincipal = True";
mostCurrent._datosglobales._enprincipal /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"configuracion\") 're utilizo";
mostCurrent._activity.LoadLayout("configuracion",mostCurrent.activityBA);
 //BA.debugLineNum = 42;BA.debugLine="SvConfiguracion.Panel.LoadLayout(\"principal\")";
mostCurrent._svconfiguracion.getPanel().LoadLayout("principal",mostCurrent.activityBA);
 //BA.debugLineNum = 43;BA.debugLine="SvConfiguracion.Panel.Width = 320dip";
mostCurrent._svconfiguracion.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (320)));
 //BA.debugLineNum = 44;BA.debugLine="SvConfiguracion.Panel.Height = 1100dip";
mostCurrent._svconfiguracion.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1100)));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _btncargarimg_click() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Private Sub BtnCargarImg_Click";
 //BA.debugLineNum = 144;BA.debugLine="EncontroArchivoEnServidor(DatosGlobales.UsuarioRu";
_encontroarchivoenservidor(mostCurrent._datosglobales._usuariorutafotos /*String*/ );
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public static String  _btncerrarapp_click() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 88;BA.debugLine="Private Sub BtnCerrarApp_Click";
 //BA.debugLineNum = 89;BA.debugLine="StopService(ServBackUp)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._servbackup.getObject()));
 //BA.debugLineNum = 90;BA.debugLine="StopService(ServBackUp2)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._servbackup2.getObject()));
 //BA.debugLineNum = 91;BA.debugLine="StopService(ServBackUp4)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._servbackup4.getObject()));
 //BA.debugLineNum = 93;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 94;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(processBA);
 //BA.debugLineNum = 95;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
_jo.RunMethod("finishAffinity",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfiguracion_click() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Private Sub BtnConfiguracion_Click";
 //BA.debugLineNum = 71;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 72;BA.debugLine="StartActivity(Configuracion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._configuracion.getObject()));
 }else {
 //BA.debugLineNum = 74;BA.debugLine="ToastMessageShow(\"#ERROR: no es posible realizar";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("#ERROR: no es posible realizar esta operación mientras hay una copia en curso."),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _btndetener_click() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Private Sub BtnDetener_Click";
 //BA.debugLineNum = 135;BA.debugLine="StopService(ServBackUp4)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._servbackup4.getObject()));
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public static String  _btnejecutar_click() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Private Sub BtnEjecutar_Click";
 //BA.debugLineNum = 101;BA.debugLine="Log(\"BtnEjecutar_Click --> Log? \" & DatosGlobales";
anywheresoftware.b4a.keywords.Common.LogImpl("62293763","BtnEjecutar_Click --> Log? "+BA.ObjectToString(mostCurrent._datosglobales._logok /*boolean*/ )+" - Ejecutandose? "+BA.ObjectToString(mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
 //BA.debugLineNum = 103;BA.debugLine="DatosGlobales.Ejecutandose = False";
mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 105;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 110;BA.debugLine="If DatosGlobales.LogOk = True Then";
if (mostCurrent._datosglobales._logok /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 113;BA.debugLine="StopService(ServBackUp4)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._servbackup4.getObject()));
 //BA.debugLineNum = 115;BA.debugLine="StartService(ServBackUp4)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._servbackup4.getObject()));
 }else {
 //BA.debugLineNum = 117;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._login.getObject()));
 };
 //BA.debugLineNum = 120;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
 //BA.debugLineNum = 122;BA.debugLine="ToastMessageShow(\"#ERROR: no es posible realizar";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("#ERROR: no es posible realizar esta operación mientras hay una copia en curso."),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Private Sub BtnLogin_Click";
 //BA.debugLineNum = 63;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 64;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._login.getObject()));
 }else {
 //BA.debugLineNum = 66;BA.debugLine="ToastMessageShow(\"#ERROR: no es posible realizar";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("#ERROR: no es posible realizar esta operación mientras hay una copia en curso."),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _btnsalir_click() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Private Sub BtnSalir_Click";
 //BA.debugLineNum = 84;BA.debugLine="DatosGlobales.EnPrincipal = False";
mostCurrent._datosglobales._enprincipal /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 85;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _btnverfotos_click() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Private Sub BtnVerFotos_Click";
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _encontroarchivoenservidor(String _unarutaserver) throws Exception{
ResumableSub_EncontroArchivoEnServidor rsub = new ResumableSub_EncontroArchivoEnServidor(null,_unarutaserver);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EncontroArchivoEnServidor extends BA.ResumableSub {
public ResumableSub_EncontroArchivoEnServidor(b4a.example.principal parent,String _unarutaserver) {
this.parent = parent;
this._unarutaserver = _unarutaserver;
}
b4a.example.principal parent;
String _unarutaserver;
anywheresoftware.b4a.objects.collections.List _listacarpetasbase = null;
anywheresoftware.b4a.objects.collections.List _listacarpetasinternas = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _result = null;
int _i = 0;
int _j = 0;
anywheresoftware.b4a.objects.collections.List _resultarch = null;
int _k = 0;
int step11;
int limit11;
int step16;
int limit16;
int step21;
int limit21;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 177;BA.debugLine="Dim ListaCarpetasBase As List";
_listacarpetasbase = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 178;BA.debugLine="ListaCarpetasBase.Initialize";
_listacarpetasbase.Initialize();
 //BA.debugLineNum = 180;BA.debugLine="Dim ListaCarpetasInternas As List";
_listacarpetasinternas = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 181;BA.debugLine="ListaCarpetasInternas.Initialize";
_listacarpetasinternas.Initialize();
 //BA.debugLineNum = 183;BA.debugLine="Dim rs As ResumableSub = ObtenerListaCarpetasBase";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _obtenerlistacarpetasbase(_unarutaserver);
 //BA.debugLineNum = 184;BA.debugLine="Wait For(rs) Complete (Result As List)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 25;
return;
case 25:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 185;BA.debugLine="If Result.Size > 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result.getSize()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 186;BA.debugLine="ListaCarpetasBase = Result";
_listacarpetasbase = _result;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 189;BA.debugLine="Log(\"CANTIDAD DE CARPETAS --> Tamaño de 'ListaCar";
anywheresoftware.b4a.keywords.Common.LogImpl("62490382","CANTIDAD DE CARPETAS --> Tamaño de 'ListaCarpetasBase.Size':"+BA.NumberToString(_listacarpetasbase.getSize()),0);
 //BA.debugLineNum = 192;BA.debugLine="For i = 0 To ListaCarpetasBase.Size-1";
if (true) break;

case 5:
//for
this.state = 24;
step11 = 1;
limit11 = (int) (_listacarpetasbase.getSize()-1);
_i = (int) (0) ;
this.state = 26;
if (true) break;

case 26:
//C
this.state = 24;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 7;
if (true) break;

case 27:
//C
this.state = 26;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 193;BA.debugLine="Log(\" ### \" & ListaCarpetasBase.Get(i) & \" ### \"";
anywheresoftware.b4a.keywords.Common.LogImpl("62490386"," ### "+BA.ObjectToString(_listacarpetasbase.Get(_i))+" ### ",0);
 //BA.debugLineNum = 195;BA.debugLine="Dim rs As ResumableSub = ObtenerListaCarpetasBas";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _obtenerlistacarpetasbase(BA.ObjectToString(_listacarpetasbase.Get(_i)));
 //BA.debugLineNum = 196;BA.debugLine="Wait For(rs) Complete (Result As List)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 28;
return;
case 28:
//C
this.state = 8;
_result = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 197;BA.debugLine="If Result.Size > 0 Then";
if (true) break;

case 8:
//if
this.state = 23;
if (_result.getSize()>0) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 199;BA.debugLine="For j = 0 To Result.Size -1";
if (true) break;

case 11:
//for
this.state = 22;
step16 = 1;
limit16 = (int) (_result.getSize()-1);
_j = (int) (0) ;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 22;
if ((step16 > 0 && _j <= limit16) || (step16 < 0 && _j >= limit16)) this.state = 13;
if (true) break;

case 30:
//C
this.state = 29;
_j = ((int)(0 + _j + step16)) ;
if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 201;BA.debugLine="Log(\" ## \" & Result.Get(j) & \" ## \")";
anywheresoftware.b4a.keywords.Common.LogImpl("62490394"," ## "+BA.ObjectToString(_result.Get(_j))+" ## ",0);
 //BA.debugLineNum = 202;BA.debugLine="Dim rs As ResumableSub = ObtenerListaDeArchiv";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _obtenerlistadearchivos(BA.ObjectToString(_result.Get(_j)));
 //BA.debugLineNum = 203;BA.debugLine="Wait For(rs) Complete (ResultArch As List)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 31;
return;
case 31:
//C
this.state = 14;
_resultarch = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 204;BA.debugLine="If ResultArch.Size > 0 Then";
if (true) break;

case 14:
//if
this.state = 21;
if (_resultarch.getSize()>0) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 205;BA.debugLine="For k = 0 To ResultArch.Size -1";
if (true) break;

case 17:
//for
this.state = 20;
step21 = 1;
limit21 = (int) (_resultarch.getSize()-1);
_k = (int) (0) ;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 20;
if ((step21 > 0 && _k <= limit21) || (step21 < 0 && _k >= limit21)) this.state = 19;
if (true) break;

case 33:
//C
this.state = 32;
_k = ((int)(0 + _k + step21)) ;
if (true) break;

case 19:
//C
this.state = 33;
 //BA.debugLineNum = 206;BA.debugLine="Log(\"- \" & ResultArch.Get(k) & \" -\")";
anywheresoftware.b4a.keywords.Common.LogImpl("62490399","- "+BA.ObjectToString(_resultarch.Get(_k))+" -",0);
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 30;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 27;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
;
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(anywheresoftware.b4a.objects.collections.List _result) throws Exception{
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private SvConfiguracion As ScrollView";
mostCurrent._svconfiguracion = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private BtnLogin As Button";
mostCurrent._btnlogin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private BtnConfiguracion As Button";
mostCurrent._btnconfiguracion = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private BtnVerFotos As Button";
mostCurrent._btnverfotos = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private BtnSalir As Button";
mostCurrent._btnsalir = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private BtnCerrarApp As Button";
mostCurrent._btncerrarapp = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private BtnEjecutar As Button";
mostCurrent._btnejecutar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private BtnDetener As Button";
mostCurrent._btndetener = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private BtnCargarImg As Button";
mostCurrent._btncargarimg = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private ImageView1 As ImageView";
mostCurrent._imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim FTP_Consulta As FTP";
mostCurrent._ftp_consulta = new anywheresoftware.b4a.net.FTPWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Dim FTP_Consulta_Carp_Int As FTP";
mostCurrent._ftp_consulta_carp_int = new anywheresoftware.b4a.net.FTPWrapper();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenerlistacarpetasbase(String _unarutaserver) throws Exception{
ResumableSub_ObtenerListaCarpetasBase rsub = new ResumableSub_ObtenerListaCarpetasBase(null,_unarutaserver);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ObtenerListaCarpetasBase extends BA.ResumableSub {
public ResumableSub_ObtenerListaCarpetasBase(b4a.example.principal parent,String _unarutaserver) {
this.parent = parent;
this._unarutaserver = _unarutaserver;
}
b4a.example.principal parent;
String _unarutaserver;
int _totalarchivos = 0;
int _totalcarpetas = 0;
anywheresoftware.b4a.objects.collections.List _listacarpetasbase = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _j = 0;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 229;BA.debugLine="Dim TotalArchivos As Int";
_totalarchivos = 0;
 //BA.debugLineNum = 230;BA.debugLine="Dim TotalCarpetas As Int";
_totalcarpetas = 0;
 //BA.debugLineNum = 231;BA.debugLine="Dim ListaCarpetasBase As List";
_listacarpetasbase = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 232;BA.debugLine="ListaCarpetasBase.Initialize";
_listacarpetasbase.Initialize();
 //BA.debugLineNum = 233;BA.debugLine="If FTP_Consulta.IsInitialized = True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._ftp_consulta.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 234;BA.debugLine="FTP_Consulta.CloseNow";
parent.mostCurrent._ftp_consulta.CloseNow();
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 236;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Servi";
parent.mostCurrent._ftp_consulta.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 237;BA.debugLine="FTP_Consulta.PassiveMode = True";
parent.mostCurrent._ftp_consulta.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 238;BA.debugLine="FTP_Consulta.List(unaRutaServer) 'ejemplo --> \"./";
parent.mostCurrent._ftp_consulta.List(processBA,_unarutaserver);
 //BA.debugLineNum = 239;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
 //BA.debugLineNum = 240;BA.debugLine="If Success  Then";
if (true) break;

case 5:
//if
this.state = 12;
if (_success) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 241;BA.debugLine="TotalArchivos = Files.Length";
_totalarchivos = _files.length;
 //BA.debugLineNum = 242;BA.debugLine="TotalCarpetas = Folders.Length";
_totalcarpetas = _folders.length;
 //BA.debugLineNum = 243;BA.debugLine="For j = 0 To TotalCarpetas-1";
if (true) break;

case 8:
//for
this.state = 11;
step15 = 1;
limit15 = (int) (_totalcarpetas-1);
_j = (int) (0) ;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 11;
if ((step15 > 0 && _j <= limit15) || (step15 < 0 && _j >= limit15)) this.state = 10;
if (true) break;

case 15:
//C
this.state = 14;
_j = ((int)(0 + _j + step15)) ;
if (true) break;

case 10:
//C
this.state = 15;
 //BA.debugLineNum = 244;BA.debugLine="ListaCarpetasBase.Add(unaRutaServer & \"/\" & Fol";
_listacarpetasbase.Add((Object)(_unarutaserver+"/"+_folders[_j].getName()));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 //BA.debugLineNum = 246;BA.debugLine="FTP_Consulta.CloseNow";
parent.mostCurrent._ftp_consulta.CloseNow();
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 248;BA.debugLine="Return ListaCarpetasBase";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_listacarpetasbase));return;};
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _ftp_listcompleted(String _serverpath,boolean _success,anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders,anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files) throws Exception{
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenerlistadearchivos(String _unarutaserver) throws Exception{
ResumableSub_ObtenerListaDeArchivos rsub = new ResumableSub_ObtenerListaDeArchivos(null,_unarutaserver);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ObtenerListaDeArchivos extends BA.ResumableSub {
public ResumableSub_ObtenerListaDeArchivos(b4a.example.principal parent,String _unarutaserver) {
this.parent = parent;
this._unarutaserver = _unarutaserver;
}
b4a.example.principal parent;
String _unarutaserver;
int _totalarchivos = 0;
anywheresoftware.b4a.objects.collections.List _listacarpetasbase = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _j = 0;
int step13;
int limit13;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 253;BA.debugLine="Dim TotalArchivos As Int";
_totalarchivos = 0;
 //BA.debugLineNum = 255;BA.debugLine="Dim ListaCarpetasBase As List";
_listacarpetasbase = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 256;BA.debugLine="ListaCarpetasBase.Initialize";
_listacarpetasbase.Initialize();
 //BA.debugLineNum = 257;BA.debugLine="If FTP_Consulta.IsInitialized = True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._ftp_consulta.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 258;BA.debugLine="FTP_Consulta.CloseNow";
parent.mostCurrent._ftp_consulta.CloseNow();
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 260;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Servi";
parent.mostCurrent._ftp_consulta.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
 //BA.debugLineNum = 261;BA.debugLine="FTP_Consulta.PassiveMode = True";
parent.mostCurrent._ftp_consulta.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 262;BA.debugLine="FTP_Consulta.List(unaRutaServer) 'ejemplo --> \"./";
parent.mostCurrent._ftp_consulta.List(processBA,_unarutaserver);
 //BA.debugLineNum = 263;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
 //BA.debugLineNum = 264;BA.debugLine="If Success  Then";
if (true) break;

case 5:
//if
this.state = 12;
if (_success) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 265;BA.debugLine="TotalArchivos = Files.Length";
_totalarchivos = _files.length;
 //BA.debugLineNum = 267;BA.debugLine="For j = 0 To TotalArchivos-1";
if (true) break;

case 8:
//for
this.state = 11;
step13 = 1;
limit13 = (int) (_totalarchivos-1);
_j = (int) (0) ;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 11;
if ((step13 > 0 && _j <= limit13) || (step13 < 0 && _j >= limit13)) this.state = 10;
if (true) break;

case 15:
//C
this.state = 14;
_j = ((int)(0 + _j + step13)) ;
if (true) break;

case 10:
//C
this.state = 15;
 //BA.debugLineNum = 268;BA.debugLine="ListaCarpetasBase.Add(unaRutaServer & \"/\" & Fil";
_listacarpetasbase.Add((Object)(_unarutaserver+"/"+_files[_j].getName()));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 //BA.debugLineNum = 270;BA.debugLine="FTP_Consulta.CloseNow";
parent.mostCurrent._ftp_consulta.CloseNow();
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 272;BA.debugLine="Return ListaCarpetasBase";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_listacarpetasbase));return;};
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
}
