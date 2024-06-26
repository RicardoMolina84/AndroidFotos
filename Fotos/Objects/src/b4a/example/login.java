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

public class login extends Activity implements B4AActivity{
	public static login mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.login");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (login).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.login");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.login", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (login) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (login) Resume **");
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
		return login.class;
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
            BA.LogInfo("** Activity (login) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (login) Pause event (activity is not paused). **");
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
            login mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (login) Resume **");
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
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btningresar = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etusuario = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etclave = null;
public static int _intentos = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btnconfig = null;
public b4a.example.main _main = null;
public b4a.example.servbackup4 _servbackup4 = null;
public b4a.example.principal _principal = null;
public b4a.example.datosglobales _datosglobales = null;
public b4a.example.fxglobales _fxglobales = null;
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
 //BA.debugLineNum = 37;BA.debugLine="DatosGlobales.Configurando = True";
mostCurrent._datosglobales._configurando /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 38;BA.debugLine="DatosGlobales.LogOk = False";
mostCurrent._datosglobales._logok /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 40;BA.debugLine="Log(\"Llega a leer XML?\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65046278","Llega a leer XML?",0);
 //BA.debugLineNum = 42;BA.debugLine="FxGlobales.LeerXML()";
mostCurrent._fxglobales._leerxml /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 44;BA.debugLine="Log(\"Termina de leer XML?\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65046282","Termina de leer XML?",0);
 //BA.debugLineNum = 47;BA.debugLine="Activity.LoadLayout(\"login\")";
mostCurrent._activity.LoadLayout("login",mostCurrent.activityBA);
 //BA.debugLineNum = 51;BA.debugLine="If DatosGlobales.XML_Recordar = 1 Then";
if ((mostCurrent._datosglobales._xml_recordar /*String*/ ).equals(BA.NumberToString(1))) { 
 //BA.debugLineNum = 53;BA.debugLine="Activity.Color = Colors.Transparent";
mostCurrent._activity.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 55;BA.debugLine="Log(\"EN LOGING - USUARIO: \" & DatosGlobales.XML_";
anywheresoftware.b4a.keywords.Common.LogImpl("65046293","EN LOGING - USUARIO: "+mostCurrent._datosglobales._xml_usuario /*String*/ ,0);
 //BA.debugLineNum = 57;BA.debugLine="EtUsuario.Text = DatosGlobales.XML_Usuario";
mostCurrent._etusuario.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_usuario /*String*/ ));
 //BA.debugLineNum = 58;BA.debugLine="EtClave.Text = DatosGlobales.XML_Contraseña";
mostCurrent._etclave.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_contraseña /*String*/ ));
 //BA.debugLineNum = 60;BA.debugLine="BtnIngresar_Click";
_btningresar_click();
 };
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 91;BA.debugLine="Log(\"LOGIN: saliendo\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65177345","LOGIN: saliendo",0);
 //BA.debugLineNum = 92;BA.debugLine="DatosGlobales.Configurando = False";
mostCurrent._datosglobales._configurando /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 86;BA.debugLine="DatosGlobales.Configurando = True";
mostCurrent._datosglobales._configurando /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfig_click() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Private Sub BtnConfig_Click";
 //BA.debugLineNum = 162;BA.debugLine="StartActivity(Configuracion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._configuracion.getObject()));
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public static String  _btningresar_click() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 96;BA.debugLine="Private Sub BtnIngresar_Click";
 //BA.debugLineNum = 110;BA.debugLine="Log(\"Usuario: \" & DatosGlobales.XML_Usuario & \" -";
anywheresoftware.b4a.keywords.Common.LogImpl("65242894","Usuario: "+mostCurrent._datosglobales._xml_usuario /*String*/ +" - CLAVE: "+mostCurrent._datosglobales._xml_contraseña /*String*/ ,0);
 //BA.debugLineNum = 113;BA.debugLine="If EtUsuario.Text = DatosGlobales.XML_Usuario The";
if ((mostCurrent._etusuario.getText()).equals(mostCurrent._datosglobales._xml_usuario /*String*/ )) { 
 //BA.debugLineNum = 114;BA.debugLine="If EtClave.Text = DatosGlobales.XML_Contraseña T";
if ((mostCurrent._etclave.getText()).equals(mostCurrent._datosglobales._xml_contraseña /*String*/ )) { 
 //BA.debugLineNum = 115;BA.debugLine="DatosGlobales.LogOk = True";
mostCurrent._datosglobales._logok /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 116;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
 //BA.debugLineNum = 118;BA.debugLine="intentos = intentos +1";
_intentos = (int) (_intentos+1);
 //BA.debugLineNum = 120;BA.debugLine="If intentos <= 3 Then";
if (_intentos<=3) { 
 //BA.debugLineNum = 121;BA.debugLine="Msgbox(\"#ERROR: clave incorrecta.\",\"Mensaje de";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("#ERROR: clave incorrecta."),BA.ObjectToCharSequence("Mensaje del sistema"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 123;BA.debugLine="Msgbox(\"#ERROR: Demasiados intentos incorrecto";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("#ERROR: Demasiados intentos incorrectos. El programa se cerrará."),BA.ObjectToCharSequence("Mensaje del sistema"),mostCurrent.activityBA);
 //BA.debugLineNum = 126;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 127;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(processBA);
 //BA.debugLineNum = 128;BA.debugLine="jo.RunMethod(\"finishAffinity\",Null)";
_jo.RunMethod("finishAffinity",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 };
 };
 }else {
 //BA.debugLineNum = 134;BA.debugLine="Msgbox(\"#ERROR: usuario incorrecto.\",\"Mensaje d";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("#ERROR: usuario incorrecto."),BA.ObjectToCharSequence("Mensaje del sistema"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private BtnIngresar As Button";
mostCurrent._btningresar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private EtUsuario As EditText";
mostCurrent._etusuario = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private EtClave As EditText";
mostCurrent._etclave = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim intentos As Int = 0";
_intentos = (int) (0);
 //BA.debugLineNum = 31;BA.debugLine="Private BtnConfig As Button";
mostCurrent._btnconfig = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
}
