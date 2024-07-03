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

public class configuracion extends Activity implements B4AActivity{
	public static configuracion mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.configuracion");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (configuracion).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.configuracion");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.configuracion", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (configuracion) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (configuracion) Resume **");
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
		return configuracion.class;
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
            BA.LogInfo("** Activity (configuracion) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (configuracion) Pause event (activity is not paused). **");
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
            configuracion mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (configuracion) Resume **");
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
public anywheresoftware.b4a.objects.EditTextWrapper _etfotoscamara = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etvideoscamara = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etimageneswhapp = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etvideoswhapp = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _svconfiguracion = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etcarpetaserverbkp = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etservidorruta = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etservidorip = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etservidorpuerto = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etservidorusuario = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etservidorclave = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnguardar = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etusuario = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etclave = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etclaveconf = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbrecordar = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chfotoscamara = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chvideoscamara = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chimageneswhapp = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chvideoswhapp = null;
public static String _xml_chfotoscamara_hist = "";
public static String _xml_chvideoscamara_hist = "";
public static String _xml_chimageneswhatsapp_hist = "";
public static String _xml_chvideoswhatsapp_hist = "";
public b4a.example.main _main = null;
public b4a.example.servbackup4 _servbackup4 = null;
public b4a.example.principal _principal = null;
public b4a.example.datosglobales _datosglobales = null;
public b4a.example.fxglobales _fxglobales = null;
public b4a.example.login _login = null;
public b4a.example.servbackup3 _servbackup3 = null;
public b4a.example.servbackup2 _servbackup2 = null;
public b4a.example.backup _backup = null;
public b4a.example.servbackup _servbackup = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="configuracion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="DatosGlobales.Configurando = True";
mostCurrent._datosglobales._configurando /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="FxGlobales.LeerXML()";
mostCurrent._fxglobales._leerxml /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="Activity.LoadLayout(\"configuracion\")";
mostCurrent._activity.LoadLayout("configuracion",mostCurrent.activityBA);
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="SvConfiguracion.Panel.LoadLayout(\"configuracionCo";
mostCurrent._svconfiguracion.getPanel().LoadLayout("configuracionContenido",mostCurrent.activityBA);
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="SvConfiguracion.Panel.Width = 320dip";
mostCurrent._svconfiguracion.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (320)));
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="SvConfiguracion.Panel.Height = 1100dip";
mostCurrent._svconfiguracion.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1100)));
RDebugUtils.currentLine=4718609;
 //BA.debugLineNum = 4718609;BA.debugLine="EtUsuario.Text = DatosGlobales.XML_Usuario";
mostCurrent._etusuario.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_usuario /*String*/ ));
RDebugUtils.currentLine=4718610;
 //BA.debugLineNum = 4718610;BA.debugLine="EtClave.Text = DatosGlobales.XML_Contraseña";
mostCurrent._etclave.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_contraseña /*String*/ ));
RDebugUtils.currentLine=4718611;
 //BA.debugLineNum = 4718611;BA.debugLine="EtClaveConf.Text = DatosGlobales.XML_Contraseña";
mostCurrent._etclaveconf.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_contraseña /*String*/ ));
RDebugUtils.currentLine=4718613;
 //BA.debugLineNum = 4718613;BA.debugLine="If DatosGlobales.XML_Recordar = \"1\" Then";
if ((mostCurrent._datosglobales._xml_recordar /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=4718614;
 //BA.debugLineNum = 4718614;BA.debugLine="CbRecordar.Checked = True";
mostCurrent._cbrecordar.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=4718616;
 //BA.debugLineNum = 4718616;BA.debugLine="CbRecordar.Checked = False";
mostCurrent._cbrecordar.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=4718622;
 //BA.debugLineNum = 4718622;BA.debugLine="EtFotosCamara.Text = DatosGlobales.XML_FotosCamar";
mostCurrent._etfotoscamara.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_fotoscamara /*String*/ ));
RDebugUtils.currentLine=4718623;
 //BA.debugLineNum = 4718623;BA.debugLine="EtVideosCamara.Text = DatosGlobales.XML_VideosCam";
mostCurrent._etvideoscamara.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_videoscamara /*String*/ ));
RDebugUtils.currentLine=4718624;
 //BA.debugLineNum = 4718624;BA.debugLine="EtImagenesWhapp.Text = DatosGlobales.XML_Imagenes";
mostCurrent._etimageneswhapp.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_imageneswhatsapp /*String*/ ));
RDebugUtils.currentLine=4718625;
 //BA.debugLineNum = 4718625;BA.debugLine="EtVideosWhapp.Text = DatosGlobales.XML_VideosWhat";
mostCurrent._etvideoswhapp.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_videoswhatsapp /*String*/ ));
RDebugUtils.currentLine=4718628;
 //BA.debugLineNum = 4718628;BA.debugLine="If DatosGlobales.XML_ChFotosCamara = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chfotoscamara /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=4718629;
 //BA.debugLineNum = 4718629;BA.debugLine="ChFotosCamara.Checked = True";
mostCurrent._chfotoscamara.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=4718631;
 //BA.debugLineNum = 4718631;BA.debugLine="ChFotosCamara.Checked = False";
mostCurrent._chfotoscamara.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=4718634;
 //BA.debugLineNum = 4718634;BA.debugLine="If DatosGlobales.XML_ChVideosCamara = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chvideoscamara /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=4718635;
 //BA.debugLineNum = 4718635;BA.debugLine="ChVideosCamara.Checked = True";
mostCurrent._chvideoscamara.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=4718637;
 //BA.debugLineNum = 4718637;BA.debugLine="ChVideosCamara.Checked = False";
mostCurrent._chvideoscamara.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=4718640;
 //BA.debugLineNum = 4718640;BA.debugLine="If DatosGlobales.XML_ChImagenesWhatsApp = \"1\" The";
if ((mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=4718641;
 //BA.debugLineNum = 4718641;BA.debugLine="ChImagenesWhapp.Checked = True";
mostCurrent._chimageneswhapp.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=4718643;
 //BA.debugLineNum = 4718643;BA.debugLine="ChImagenesWhapp.Checked = False";
mostCurrent._chimageneswhapp.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=4718646;
 //BA.debugLineNum = 4718646;BA.debugLine="If DatosGlobales.XML_ChVideosWhatsApp = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=4718647;
 //BA.debugLineNum = 4718647;BA.debugLine="ChVideosWhapp.Checked = True";
mostCurrent._chvideoswhapp.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=4718649;
 //BA.debugLineNum = 4718649;BA.debugLine="ChVideosWhapp.Checked = False";
mostCurrent._chvideoswhapp.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=4718656;
 //BA.debugLineNum = 4718656;BA.debugLine="EtCarpetaServerBkp.Text = DatosGlobales.XML_Usuar";
mostCurrent._etcarpetaserverbkp.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_usuariorutafotos /*String*/ ));
RDebugUtils.currentLine=4718659;
 //BA.debugLineNum = 4718659;BA.debugLine="EtServidorRuta.Text = DatosGlobales.XML_ServidorR";
mostCurrent._etservidorruta.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_servidorruta /*String*/ ));
RDebugUtils.currentLine=4718660;
 //BA.debugLineNum = 4718660;BA.debugLine="EtServidorIp.Text = DatosGlobales.XML_ServidorIp";
mostCurrent._etservidorip.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_servidorip /*String*/ ));
RDebugUtils.currentLine=4718661;
 //BA.debugLineNum = 4718661;BA.debugLine="EtServidorPuerto.Text = DatosGlobales.XML_Servido";
mostCurrent._etservidorpuerto.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_servidorpuerto /*String*/ ));
RDebugUtils.currentLine=4718662;
 //BA.debugLineNum = 4718662;BA.debugLine="EtServidorUsuario.Text = DatosGlobales.XML_Servid";
mostCurrent._etservidorusuario.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_servidorusuario /*String*/ ));
RDebugUtils.currentLine=4718663;
 //BA.debugLineNum = 4718663;BA.debugLine="EtServidorClave.Text = DatosGlobales.XML_Servidor";
mostCurrent._etservidorclave.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_servidorclave /*String*/ ));
RDebugUtils.currentLine=4718666;
 //BA.debugLineNum = 4718666;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="configuracion";
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="DatosGlobales.Configurando = False";
mostCurrent._datosglobales._configurando /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="configuracion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="DatosGlobales.Configurando = True";
mostCurrent._datosglobales._configurando /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="End Sub";
return "";
}
public static String  _btnguardar_click() throws Exception{
RDebugUtils.currentModule="configuracion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnguardar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnguardar_click", null));}
String _unxml = "";
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub BtnGuardar_Click";
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="If EtClave.Text <> \"\" And (EtClave.Text <> EtClav";
if ((mostCurrent._etclave.getText()).equals("") == false && ((mostCurrent._etclave.getText()).equals(mostCurrent._etclaveconf.getText()) == false)) { 
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="Msgbox(\"#ERROR: la clave ingresada no es correct";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("#ERROR: la clave ingresada no es correcta."),BA.ObjectToCharSequence("Mensaje del sistema"),mostCurrent.activityBA);
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="Dim unXml As String = CargarElXML";
_unxml = _cargarelxml();
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="File.WriteString(File.DirInternal,\"config.xml\",un";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"config.xml",_unxml);
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="FxGlobales.LeerXML()";
mostCurrent._fxglobales._leerxml /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=4915219;
 //BA.debugLineNum = 4915219;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then";
if ((mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=4915220;
 //BA.debugLineNum = 4915220;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullbkp";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt","-1");
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="DatosGlobales.IndiceFullBkp = File.ReadString(Fi";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt")));
RDebugUtils.currentLine=4915223;
 //BA.debugLineNum = 4915223;BA.debugLine="If DatosGlobales.IndiceFullBkp > 0 Then";
if (mostCurrent._datosglobales._indicefullbkp /*int*/ >0) { 
RDebugUtils.currentLine=4915224;
 //BA.debugLineNum = 4915224;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int) (mostCurrent._datosglobales._indicefullbkp /*int*/ -1);
 };
 };
RDebugUtils.currentLine=4915230;
 //BA.debugLineNum = 4915230;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4915232;
 //BA.debugLineNum = 4915232;BA.debugLine="End Sub";
return "";
}
public static String  _cargarelxml() throws Exception{
RDebugUtils.currentModule="configuracion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarelxml", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargarelxml", null));}
String _archivoxml = "";
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub CargarElXML As String";
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="If ChFotosCamara.Checked And XML_ChFotosCamara_Hi";
if (mostCurrent._chfotoscamara.getChecked() && (mostCurrent._xml_chfotoscamara_hist).equals("0")) { 
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "1";
 };
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="If ChVideosCamara.Checked And XML_ChVideosCamara_";
if (mostCurrent._chvideoscamara.getChecked() && (mostCurrent._xml_chvideoscamara_hist).equals("0")) { 
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "1";
 };
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="If ChImagenesWhapp.Checked And XML_ChImagenesWhat";
if (mostCurrent._chimageneswhapp.getChecked() && (mostCurrent._xml_chimageneswhatsapp_hist).equals("0")) { 
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "1";
 };
RDebugUtils.currentLine=5046293;
 //BA.debugLineNum = 5046293;BA.debugLine="If ChVideosWhapp.Checked And XML_ChVideosWhatsApp";
if (mostCurrent._chvideoswhapp.getChecked() && (mostCurrent._xml_chvideoswhatsapp_hist).equals("0")) { 
RDebugUtils.currentLine=5046294;
 //BA.debugLineNum = 5046294;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "1";
 };
RDebugUtils.currentLine=5046297;
 //BA.debugLineNum = 5046297;BA.debugLine="If (ChFotosCamara.Checked = False) And (ChVideosC";
if ((mostCurrent._chfotoscamara.getChecked()==anywheresoftware.b4a.keywords.Common.False) && (mostCurrent._chvideoscamara.getChecked()==anywheresoftware.b4a.keywords.Common.False) && (mostCurrent._chimageneswhapp.getChecked()==anywheresoftware.b4a.keywords.Common.False) && (mostCurrent._chvideoswhapp.getChecked()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=5046298;
 //BA.debugLineNum = 5046298;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"0\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "0";
 };
RDebugUtils.currentLine=5046305;
 //BA.debugLineNum = 5046305;BA.debugLine="Dim ArchivoXml As String = \"<?xml version=\"\"\"\"1.0";
_archivoxml = "<?xml version=\"\"1.0\"\" encoding=\"\"UTF-8\"\"?>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046306;
 //BA.debugLineNum = 5046306;BA.debugLine="ArchivoXml = ArchivoXml & \"<fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"<fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046307;
 //BA.debugLineNum = 5046307;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046309;
 //BA.debugLineNum = 5046309;BA.debugLine="ArchivoXml = ArchivoXml & \" <login>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046310;
 //BA.debugLineNum = 5046310;BA.debugLine="ArchivoXml = ArchivoXml & \"   <usuario>\" & EtUsua";
_archivoxml = _archivoxml+"   <usuario>"+mostCurrent._etusuario.getText()+"</usuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046311;
 //BA.debugLineNum = 5046311;BA.debugLine="ArchivoXml = ArchivoXml & \"   <contraseña>\" & EtC";
_archivoxml = _archivoxml+"   <contraseña>"+mostCurrent._etclave.getText()+"</contraseña>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046312;
 //BA.debugLineNum = 5046312;BA.debugLine="ArchivoXml = ArchivoXml & \"   <recordar>\" & Datos";
_archivoxml = _archivoxml+"   <recordar>"+mostCurrent._datosglobales._xml_recordar /*String*/ +"</recordar>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046313;
 //BA.debugLineNum = 5046313;BA.debugLine="ArchivoXml = ArchivoXml & \" </login>\"  & CRLF & \"";
_archivoxml = _archivoxml+" </login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046315;
 //BA.debugLineNum = 5046315;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046316;
 //BA.debugLineNum = 5046316;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_origen>\" & CRLF";
_archivoxml = _archivoxml+" <ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046317;
 //BA.debugLineNum = 5046317;BA.debugLine="ArchivoXml = ArchivoXml & \"   <fotoscamara>\" & Et";
_archivoxml = _archivoxml+"   <fotoscamara>"+mostCurrent._etfotoscamara.getText()+"</fotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046318;
 //BA.debugLineNum = 5046318;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoscamara>\" & E";
_archivoxml = _archivoxml+"   <videoscamara>"+mostCurrent._etvideoscamara.getText()+"</videoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046319;
 //BA.debugLineNum = 5046319;BA.debugLine="ArchivoXml = ArchivoXml & \"   <imageneswhatsapp>\"";
_archivoxml = _archivoxml+"   <imageneswhatsapp>"+mostCurrent._etimageneswhapp.getText()+"</imageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046320;
 //BA.debugLineNum = 5046320;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoswhatsapp>\" &";
_archivoxml = _archivoxml+"   <videoswhatsapp>"+mostCurrent._etvideoswhapp.getText()+"</videoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046322;
 //BA.debugLineNum = 5046322;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chfotoscamara>\" &";
_archivoxml = _archivoxml+"   <chfotoscamara>"+mostCurrent._datosglobales._xml_chfotoscamara /*String*/ +"</chfotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046323;
 //BA.debugLineNum = 5046323;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoscamara>\" &";
_archivoxml = _archivoxml+"   <chvideoscamara>"+mostCurrent._datosglobales._xml_chvideoscamara /*String*/ +"</chvideoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046324;
 //BA.debugLineNum = 5046324;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chimageneswhatsapp";
_archivoxml = _archivoxml+"   <chimageneswhatsapp>"+mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/ +"</chimageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046325;
 //BA.debugLineNum = 5046325;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoswhatsapp>\"";
_archivoxml = _archivoxml+"   <chvideoswhatsapp>"+mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/ +"</chvideoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046326;
 //BA.debugLineNum = 5046326;BA.debugLine="ArchivoXml = ArchivoXml & \"   <primeravez>\" & Dat";
_archivoxml = _archivoxml+"   <primeravez>"+mostCurrent._datosglobales._xml_primeravez /*String*/ +"</primeravez>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046328;
 //BA.debugLineNum = 5046328;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_origen>\" & CRL";
_archivoxml = _archivoxml+" </ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046330;
 //BA.debugLineNum = 5046330;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046331;
 //BA.debugLineNum = 5046331;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_destino>\" & CRL";
_archivoxml = _archivoxml+" <ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046332;
 //BA.debugLineNum = 5046332;BA.debugLine="ArchivoXml = ArchivoXml & \"   <UsuarioRutaFotos>\"";
_archivoxml = _archivoxml+"   <UsuarioRutaFotos>"+mostCurrent._etcarpetaserverbkp.getText()+"</UsuarioRutaFotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046333;
 //BA.debugLineNum = 5046333;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_destino>\" & CR";
_archivoxml = _archivoxml+" </ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046334;
 //BA.debugLineNum = 5046334;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046336;
 //BA.debugLineNum = 5046336;BA.debugLine="ArchivoXml = ArchivoXml & \" <ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046337;
 //BA.debugLineNum = 5046337;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorruta>\" & E";
_archivoxml = _archivoxml+"   <servidorruta>"+mostCurrent._etservidorruta.getText()+"</servidorruta>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046338;
 //BA.debugLineNum = 5046338;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorip>\" & EtS";
_archivoxml = _archivoxml+"   <servidorip>"+mostCurrent._etservidorip.getText()+"</servidorip>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046339;
 //BA.debugLineNum = 5046339;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorpuerto>\" &";
_archivoxml = _archivoxml+"   <servidorpuerto>"+mostCurrent._etservidorpuerto.getText()+"</servidorpuerto>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046340;
 //BA.debugLineNum = 5046340;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorusuario>\"";
_archivoxml = _archivoxml+"   <servidorusuario>"+mostCurrent._etservidorusuario.getText()+"</servidorusuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046341;
 //BA.debugLineNum = 5046341;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorclave>\" &";
_archivoxml = _archivoxml+"   <servidorclave>"+mostCurrent._etservidorclave.getText()+"</servidorclave>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046342;
 //BA.debugLineNum = 5046342;BA.debugLine="ArchivoXml = ArchivoXml & \" </ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" </ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046344;
 //BA.debugLineNum = 5046344;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046345;
 //BA.debugLineNum = 5046345;BA.debugLine="ArchivoXml = ArchivoXml & \"</fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"</fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
RDebugUtils.currentLine=5046350;
 //BA.debugLineNum = 5046350;BA.debugLine="Return ArchivoXml";
if (true) return _archivoxml;
RDebugUtils.currentLine=5046354;
 //BA.debugLineNum = 5046354;BA.debugLine="End Sub";
return "";
}
public static String  _cbrecordar_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="configuracion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cbrecordar_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cbrecordar_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub CbRecordar_CheckedChange(Checked As Bo";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="If CbRecordar.Checked = True Then";
if (mostCurrent._cbrecordar.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="DatosGlobales.XML_Recordar = \"1\"";
mostCurrent._datosglobales._xml_recordar /*String*/  = "1";
 }else {
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="DatosGlobales.XML_Recordar = \"0\"";
mostCurrent._datosglobales._xml_recordar /*String*/  = "0";
 };
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="End Sub";
return "";
}
public static String  _chfotoscamara_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="configuracion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chfotoscamara_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chfotoscamara_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub ChFotosCamara_CheckedChange(Checked As";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If ChFotosCamara.Checked = True Then";
if (mostCurrent._chfotoscamara.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="DatosGlobales.XML_ChFotosCamara = \"1\"";
mostCurrent._datosglobales._xml_chfotoscamara /*String*/  = "1";
 }else {
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="DatosGlobales.XML_ChFotosCamara = \"0\"";
mostCurrent._datosglobales._xml_chfotoscamara /*String*/  = "0";
 };
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="End Sub";
return "";
}
public static String  _chimageneswhapp_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="configuracion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chimageneswhapp_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chimageneswhapp_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Private Sub ChImagenesWhapp_CheckedChange(Checked";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="If ChImagenesWhapp.Checked = True Then";
if (mostCurrent._chimageneswhapp.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="DatosGlobales.XML_ChImagenesWhatsApp = \"1\"";
mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/  = "1";
 }else {
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="DatosGlobales.XML_ChImagenesWhatsApp = \"0\"";
mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/  = "0";
 };
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="End Sub";
return "";
}
public static String  _chvideoscamara_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="configuracion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chvideoscamara_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chvideoscamara_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub ChVideosCamara_CheckedChange(Checked A";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="If ChVideosCamara.Checked = True Then";
if (mostCurrent._chvideoscamara.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="DatosGlobales.XML_ChVideosCamara = \"1\"";
mostCurrent._datosglobales._xml_chvideoscamara /*String*/  = "1";
 }else {
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="DatosGlobales.XML_ChVideosCamara = \"0\"";
mostCurrent._datosglobales._xml_chvideoscamara /*String*/  = "0";
 };
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="End Sub";
return "";
}
public static String  _chvideoswhapp_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="configuracion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chvideoswhapp_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chvideoswhapp_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub ChVideosWhapp_CheckedChange(Checked As";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="If ChVideosWhapp.Checked = True Then";
if (mostCurrent._chvideoswhapp.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="DatosGlobales.XML_ChVideosWhatsApp = \"1\"";
mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/  = "1";
 }else {
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="DatosGlobales.XML_ChVideosWhatsApp = \"0\"";
mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/  = "0";
 };
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="End Sub";
return "";
}
public static boolean  _validardatos() throws Exception{
RDebugUtils.currentModule="configuracion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "validardatos", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "validardatos", null));}
boolean _resultado = false;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub ValidarDatos() As Boolean";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim Resultado As Boolean = True";
_resultado = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="If EtUsuario.Text = \"\" Then";
if ((mostCurrent._etusuario.getText()).equals("")) { 
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="If EtClave.Text = \"\" Then";
if ((mostCurrent._etclave.getText()).equals("")) { 
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="If EtClaveConf.Text = \"\" Then";
if ((mostCurrent._etclaveconf.getText()).equals("")) { 
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980752;
 //BA.debugLineNum = 4980752;BA.debugLine="If EtFotosCamara.Text = \"\" Then";
if ((mostCurrent._etfotoscamara.getText()).equals("")) { 
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980756;
 //BA.debugLineNum = 4980756;BA.debugLine="If EtVideosCamara.Text = \"\" Then";
if ((mostCurrent._etvideoscamara.getText()).equals("")) { 
RDebugUtils.currentLine=4980757;
 //BA.debugLineNum = 4980757;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980760;
 //BA.debugLineNum = 4980760;BA.debugLine="If EtImagenesWhapp.Text = \"\" Then";
if ((mostCurrent._etimageneswhapp.getText()).equals("")) { 
RDebugUtils.currentLine=4980761;
 //BA.debugLineNum = 4980761;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980764;
 //BA.debugLineNum = 4980764;BA.debugLine="If EtVideosWhapp.Text = \"\" Then";
if ((mostCurrent._etvideoswhapp.getText()).equals("")) { 
RDebugUtils.currentLine=4980765;
 //BA.debugLineNum = 4980765;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980768;
 //BA.debugLineNum = 4980768;BA.debugLine="If EtCarpetaServerBkp.Text = \"\" Then";
if ((mostCurrent._etcarpetaserverbkp.getText()).equals("")) { 
RDebugUtils.currentLine=4980769;
 //BA.debugLineNum = 4980769;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980772;
 //BA.debugLineNum = 4980772;BA.debugLine="If EtServidorRuta.Text = \"\" Then";
if ((mostCurrent._etservidorruta.getText()).equals("")) { 
RDebugUtils.currentLine=4980773;
 //BA.debugLineNum = 4980773;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980776;
 //BA.debugLineNum = 4980776;BA.debugLine="If EtServidorIp.Text = \"\" Then";
if ((mostCurrent._etservidorip.getText()).equals("")) { 
RDebugUtils.currentLine=4980777;
 //BA.debugLineNum = 4980777;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980780;
 //BA.debugLineNum = 4980780;BA.debugLine="If EtServidorPuerto.Text = \"\" Then";
if ((mostCurrent._etservidorpuerto.getText()).equals("")) { 
RDebugUtils.currentLine=4980781;
 //BA.debugLineNum = 4980781;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980784;
 //BA.debugLineNum = 4980784;BA.debugLine="If EtServidorUsuario.Text = \"\" Then";
if ((mostCurrent._etservidorusuario.getText()).equals("")) { 
RDebugUtils.currentLine=4980785;
 //BA.debugLineNum = 4980785;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980788;
 //BA.debugLineNum = 4980788;BA.debugLine="If EtServidorClave.Text = \"\" Then";
if ((mostCurrent._etservidorclave.getText()).equals("")) { 
RDebugUtils.currentLine=4980789;
 //BA.debugLineNum = 4980789;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4980792;
 //BA.debugLineNum = 4980792;BA.debugLine="Return Resultado";
if (true) return _resultado;
RDebugUtils.currentLine=4980793;
 //BA.debugLineNum = 4980793;BA.debugLine="End Sub";
return false;
}
}