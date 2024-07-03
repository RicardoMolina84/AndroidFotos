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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.principal");
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



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
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
public anywheresoftware.b4a.agraham.dialogs2.InputDialog.FileDialog _fd = null;
public static String _pathseleccionado = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btnselcarpeta = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rbinterna = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rbexterna = null;
public b4a.example.main _main = null;
public b4a.example.servbackup4 _servbackup4 = null;
public b4a.example.datosglobales _datosglobales = null;
public b4a.example.fxglobales _fxglobales = null;
public b4a.example.login _login = null;
public b4a.example.configuracion _configuracion = null;
public b4a.example.servbackup3 _servbackup3 = null;
public b4a.example.servbackup2 _servbackup2 = null;
public b4a.example.backup _backup = null;
public b4a.example.servbackup _servbackup = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="DatosGlobales.EnPrincipal = True";
mostCurrent._datosglobales._enprincipal /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Activity.LoadLayout(\"configuracion\") 're utilizo";
mostCurrent._activity.LoadLayout("configuracion",mostCurrent.activityBA);
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="SvConfiguracion.Panel.LoadLayout(\"principal\")";
mostCurrent._svconfiguracion.getPanel().LoadLayout("principal",mostCurrent.activityBA);
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="SvConfiguracion.Panel.Width = 320dip";
mostCurrent._svconfiguracion.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (320)));
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="SvConfiguracion.Panel.Height = 1100dip";
mostCurrent._svconfiguracion.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1100)));
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="RbInterna.Checked = True";
mostCurrent._rbinterna.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="RbInterna_CheckedChange(True)";
_rbinterna_checkedchange(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1900563;
 //BA.debugLineNum = 1900563;BA.debugLine="End Sub";
return "";
}
public static String  _rbinterna_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rbinterna_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "rbinterna_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub RbInterna_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="PathSeleccionado = File.DirInternal";
mostCurrent._pathseleccionado = anywheresoftware.b4a.keywords.Common.File.getDirInternal();
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="principal";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _btncargarimg_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncargarimg_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncargarimg_click", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub BtnCargarImg_Click";
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="EncontroArchivoEnServidor(DatosGlobales.UsuarioRu";
_encontroarchivoenservidor(mostCurrent._datosglobales._usuariorutafotos /*String*/ );
RDebugUtils.currentLine=2555932;
 //BA.debugLineNum = 2555932;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _encontroarchivoenservidor(String _unarutaserver) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "encontroarchivoenservidor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "encontroarchivoenservidor", new Object[] {_unarutaserver}));}
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
RDebugUtils.currentModule="principal";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim ListaCarpetasBase As List";
_listacarpetasbase = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="ListaCarpetasBase.Initialize";
_listacarpetasbase.Initialize();
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Dim ListaCarpetasInternas As List";
_listacarpetasinternas = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="ListaCarpetasInternas.Initialize";
_listacarpetasinternas.Initialize();
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Dim rs As ResumableSub = ObtenerListaCarpetasBase";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _obtenerlistacarpetasbase(_unarutaserver);
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="Wait For(rs) Complete (Result As List)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "encontroarchivoenservidor"), _rs);
this.state = 25;
return;
case 25:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="If Result.Size > 0 Then";
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
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="ListaCarpetasBase = Result";
_listacarpetasbase = _result;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="Log(\"CANTIDAD DE CARPETAS --> Tamaño de 'ListaCar";
anywheresoftware.b4a.keywords.Common.LogImpl("52621454","CANTIDAD DE CARPETAS --> Tamaño de 'ListaCarpetasBase.Size':"+BA.NumberToString(_listacarpetasbase.getSize()),0);
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="For i = 0 To ListaCarpetasBase.Size-1";
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
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="Log(\" ### \" & ListaCarpetasBase.Get(i) & \" ### \"";
anywheresoftware.b4a.keywords.Common.LogImpl("52621458"," ### "+BA.ObjectToString(_listacarpetasbase.Get(_i))+" ### ",0);
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="Dim rs As ResumableSub = ObtenerListaCarpetasBas";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _obtenerlistacarpetasbase(BA.ObjectToString(_listacarpetasbase.Get(_i)));
RDebugUtils.currentLine=2621461;
 //BA.debugLineNum = 2621461;BA.debugLine="Wait For(rs) Complete (Result As List)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "encontroarchivoenservidor"), _rs);
this.state = 28;
return;
case 28:
//C
this.state = 8;
_result = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=2621462;
 //BA.debugLineNum = 2621462;BA.debugLine="If Result.Size > 0 Then";
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
RDebugUtils.currentLine=2621464;
 //BA.debugLineNum = 2621464;BA.debugLine="For j = 0 To Result.Size -1";
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
RDebugUtils.currentLine=2621466;
 //BA.debugLineNum = 2621466;BA.debugLine="Log(\" ## \" & Result.Get(j) & \" ## \")";
anywheresoftware.b4a.keywords.Common.LogImpl("52621466"," ## "+BA.ObjectToString(_result.Get(_j))+" ## ",0);
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="Dim rs As ResumableSub = ObtenerListaDeArchiv";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _obtenerlistadearchivos(BA.ObjectToString(_result.Get(_j)));
RDebugUtils.currentLine=2621468;
 //BA.debugLineNum = 2621468;BA.debugLine="Wait For(rs) Complete (ResultArch As List)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "encontroarchivoenservidor"), _rs);
this.state = 31;
return;
case 31:
//C
this.state = 14;
_resultarch = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=2621469;
 //BA.debugLineNum = 2621469;BA.debugLine="If ResultArch.Size > 0 Then";
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
RDebugUtils.currentLine=2621470;
 //BA.debugLineNum = 2621470;BA.debugLine="For k = 0 To ResultArch.Size -1";
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
RDebugUtils.currentLine=2621471;
 //BA.debugLineNum = 2621471;BA.debugLine="Log(\"- \" & ResultArch.Get(k) & \" -\")";
anywheresoftware.b4a.keywords.Common.LogImpl("52621471","- "+BA.ObjectToString(_resultarch.Get(_k))+" -",0);
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
RDebugUtils.currentLine=2621490;
 //BA.debugLineNum = 2621490;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btncerrarapp_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncerrarapp_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncerrarapp_click", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub BtnCerrarApp_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="StopService(ServBackUp)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._servbackup.getObject()));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="StopService(ServBackUp2)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._servbackup2.getObject()));
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="StopService(ServBackUp4)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._servbackup4.getObject()));
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(processBA);
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
_jo.RunMethod("finishAffinity",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfiguracion_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnconfiguracion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnconfiguracion_click", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub BtnConfiguracion_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="StartActivity(Configuracion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._configuracion.getObject()));
 }else {
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="ToastMessageShow(\"#ERROR: no es posible realizar";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("#ERROR: no es posible realizar esta operación mientras hay una copia en curso."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="End Sub";
return "";
}
public static String  _btndetener_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndetener_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndetener_click", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub BtnDetener_Click";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="StopService(ServBackUp4)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._servbackup4.getObject()));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="End Sub";
return "";
}
public static String  _btnejecutar_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnejecutar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnejecutar_click", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub BtnEjecutar_Click";
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Log(\"BtnEjecutar_Click --> Log? \" & DatosGlobales";
anywheresoftware.b4a.keywords.Common.LogImpl("52424835","BtnEjecutar_Click --> Log? "+BA.ObjectToString(mostCurrent._datosglobales._logok /*boolean*/ )+" - Ejecutandose? "+BA.ObjectToString(mostCurrent._datosglobales._ejecutandose /*boolean*/ ),0);
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="DatosGlobales.Ejecutandose = False";
mostCurrent._datosglobales._ejecutandose /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="If DatosGlobales.LogOk = True Then";
if (mostCurrent._datosglobales._logok /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="StopService(ServBackUp4)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._servbackup4.getObject()));
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="StartService(ServBackUp4)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._servbackup4.getObject()));
 }else {
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._login.getObject()));
 };
RDebugUtils.currentLine=2424854;
 //BA.debugLineNum = 2424854;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=2424856;
 //BA.debugLineNum = 2424856;BA.debugLine="ToastMessageShow(\"#ERROR: no es posible realizar";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("#ERROR: no es posible realizar esta operación mientras hay una copia en curso."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=2424865;
 //BA.debugLineNum = 2424865;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogin_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlogin_click", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub BtnLogin_Click";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If DatosGlobales.Ejecutandose = False Then";
if (mostCurrent._datosglobales._ejecutandose /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._login.getObject()));
 }else {
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="ToastMessageShow(\"#ERROR: no es posible realizar";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("#ERROR: no es posible realizar esta operación mientras hay una copia en curso."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="End Sub";
return "";
}
public static String  _btnsalir_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsalir_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsalir_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub BtnSalir_Click";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="DatosGlobales.EnPrincipal = False";
mostCurrent._datosglobales._enprincipal /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="End Sub";
return "";
}
public static void  _btnselcarpeta_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnselcarpeta_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnselcarpeta_click", null); return;}
ResumableSub_BtnSelCarpeta_Click rsub = new ResumableSub_BtnSelCarpeta_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnSelCarpeta_Click extends BA.ResumableSub {
public ResumableSub_BtnSelCarpeta_Click(b4a.example.principal parent) {
this.parent = parent;
}
b4a.example.principal parent;
Object _sf = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="principal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="fd.ShowOnlyFolders = True";
parent.mostCurrent._fd.setShowOnlyFolders(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="fd.FilePath = PathSeleccionado 'File.DirInternal";
parent.mostCurrent._fd.setFilePath(parent.mostCurrent._pathseleccionado);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="fd.FileFilter = Null ' No filtrar ningún archivo";
parent.mostCurrent._fd.setFileFilter(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="Dim sf As Object = fd.ShowAsync(\"Seleccioná una r";
_sf = parent.mostCurrent._fd.ShowAsync(BA.ObjectToCharSequence("Seleccioná una ruta"),"Si","Cancelar","No",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="Wait For (sf) Dialog_Result(Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "btnselcarpeta_click"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="Log(\"Resultado: \" & Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("52818059","Resultado: "+BA.NumberToString(_result),0);
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="Log(\"Selected Folder: \" & fd.FilePath)";
anywheresoftware.b4a.keywords.Common.LogImpl("52818062","Selected Folder: "+parent.mostCurrent._fd.getFilePath(),0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="Log(\"No se seleccionó ninguna carpeta.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("52818064","No se seleccionó ninguna carpeta.",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnverfotos_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnverfotos_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnverfotos_click", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub BtnVerFotos_Click";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenerlistacarpetasbase(String _unarutaserver) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "obtenerlistacarpetasbase", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "obtenerlistacarpetasbase", new Object[] {_unarutaserver}));}
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
RDebugUtils.currentModule="principal";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim TotalArchivos As Int";
_totalarchivos = 0;
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim TotalCarpetas As Int";
_totalcarpetas = 0;
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Dim ListaCarpetasBase As List";
_listacarpetasbase = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="ListaCarpetasBase.Initialize";
_listacarpetasbase.Initialize();
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="If FTP_Consulta.IsInitialized = True Then";
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
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="FTP_Consulta.CloseNow";
parent.mostCurrent._ftp_consulta.CloseNow();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Servi";
parent.mostCurrent._ftp_consulta.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="FTP_Consulta.PassiveMode = True";
parent.mostCurrent._ftp_consulta.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="FTP_Consulta.List(unaRutaServer) 'ejemplo --> \"./";
parent.mostCurrent._ftp_consulta.List(processBA,_unarutaserver);
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "obtenerlistacarpetasbase"), null);
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
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="If Success  Then";
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
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="TotalArchivos = Files.Length";
_totalarchivos = _files.length;
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="TotalCarpetas = Folders.Length";
_totalcarpetas = _folders.length;
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="For j = 0 To TotalCarpetas-1";
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
RDebugUtils.currentLine=2686992;
 //BA.debugLineNum = 2686992;BA.debugLine="ListaCarpetasBase.Add(unaRutaServer & \"/\" & Fol";
_listacarpetasbase.Add((Object)(_unarutaserver+"/"+_folders[_j].getName()));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="FTP_Consulta.CloseNow";
parent.mostCurrent._ftp_consulta.CloseNow();
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="Return ListaCarpetasBase";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_listacarpetasbase));return;};
RDebugUtils.currentLine=2686997;
 //BA.debugLineNum = 2686997;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenerlistadearchivos(String _unarutaserver) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "obtenerlistadearchivos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "obtenerlistadearchivos", new Object[] {_unarutaserver}));}
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
RDebugUtils.currentModule="principal";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim TotalArchivos As Int";
_totalarchivos = 0;
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim ListaCarpetasBase As List";
_listacarpetasbase = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="ListaCarpetasBase.Initialize";
_listacarpetasbase.Initialize();
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="If FTP_Consulta.IsInitialized = True Then";
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
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="FTP_Consulta.CloseNow";
parent.mostCurrent._ftp_consulta.CloseNow();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="FTP_Consulta.Initialize(\"FTP\",DatosGlobales.Servi";
parent.mostCurrent._ftp_consulta.Initialize(processBA,"FTP",parent.mostCurrent._datosglobales._servidorip /*String*/ ,(int)(Double.parseDouble(parent.mostCurrent._datosglobales._servidorpuerto /*String*/ )),parent.mostCurrent._datosglobales._servidorusuario /*String*/ ,parent.mostCurrent._datosglobales._servidorclave /*String*/ );
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="FTP_Consulta.PassiveMode = True";
parent.mostCurrent._ftp_consulta.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="FTP_Consulta.List(unaRutaServer) 'ejemplo --> \"./";
parent.mostCurrent._ftp_consulta.List(processBA,_unarutaserver);
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Wait For FTP_ListCompleted (ServerPath As String,";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "obtenerlistadearchivos"), null);
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
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="If Success  Then";
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
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="TotalArchivos = Files.Length";
_totalarchivos = _files.length;
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="For j = 0 To TotalArchivos-1";
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
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="ListaCarpetasBase.Add(unaRutaServer & \"/\" & Fil";
_listacarpetasbase.Add((Object)(_unarutaserver+"/"+_files[_j].getName()));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=2752530;
 //BA.debugLineNum = 2752530;BA.debugLine="FTP_Consulta.CloseNow";
parent.mostCurrent._ftp_consulta.CloseNow();
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="Return ListaCarpetasBase";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_listacarpetasbase));return;};
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _eventname_result(boolean _result) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "eventname_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "eventname_result", new Object[] {_result}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub EventName_Result (Result As Boolean)";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public static String  _rbexterna_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rbexterna_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "rbexterna_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub RbExterna_CheckedChange(Checked As Boo";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="PathSeleccionado = File.DirRootExternal";
mostCurrent._pathseleccionado = anywheresoftware.b4a.keywords.Common.File.getDirRootExternal();
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return "";
}
}