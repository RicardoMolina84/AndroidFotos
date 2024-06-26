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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.configuracion");
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
 //BA.debugLineNum = 51;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 56;BA.debugLine="DatosGlobales.Configurando = True";
mostCurrent._datosglobales._configurando /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 58;BA.debugLine="FxGlobales.LeerXML()";
mostCurrent._fxglobales._leerxml /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 62;BA.debugLine="Activity.LoadLayout(\"configuracion\")";
mostCurrent._activity.LoadLayout("configuracion",mostCurrent.activityBA);
 //BA.debugLineNum = 63;BA.debugLine="SvConfiguracion.Panel.LoadLayout(\"configuracionCo";
mostCurrent._svconfiguracion.getPanel().LoadLayout("configuracionContenido",mostCurrent.activityBA);
 //BA.debugLineNum = 64;BA.debugLine="SvConfiguracion.Panel.Width = 320dip";
mostCurrent._svconfiguracion.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (320)));
 //BA.debugLineNum = 65;BA.debugLine="SvConfiguracion.Panel.Height = 1100dip";
mostCurrent._svconfiguracion.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1100)));
 //BA.debugLineNum = 68;BA.debugLine="EtUsuario.Text = DatosGlobales.XML_Usuario";
mostCurrent._etusuario.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_usuario /*String*/ ));
 //BA.debugLineNum = 69;BA.debugLine="EtClave.Text = DatosGlobales.XML_Contraseña";
mostCurrent._etclave.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_contraseña /*String*/ ));
 //BA.debugLineNum = 70;BA.debugLine="EtClaveConf.Text = DatosGlobales.XML_Contraseña";
mostCurrent._etclaveconf.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_contraseña /*String*/ ));
 //BA.debugLineNum = 72;BA.debugLine="If DatosGlobales.XML_Recordar = \"1\" Then";
if ((mostCurrent._datosglobales._xml_recordar /*String*/ ).equals("1")) { 
 //BA.debugLineNum = 73;BA.debugLine="CbRecordar.Checked = True";
mostCurrent._cbrecordar.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 75;BA.debugLine="CbRecordar.Checked = False";
mostCurrent._cbrecordar.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 81;BA.debugLine="EtFotosCamara.Text = DatosGlobales.XML_FotosCamar";
mostCurrent._etfotoscamara.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_fotoscamara /*String*/ ));
 //BA.debugLineNum = 82;BA.debugLine="EtVideosCamara.Text = DatosGlobales.XML_VideosCam";
mostCurrent._etvideoscamara.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_videoscamara /*String*/ ));
 //BA.debugLineNum = 83;BA.debugLine="EtImagenesWhapp.Text = DatosGlobales.XML_Imagenes";
mostCurrent._etimageneswhapp.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_imageneswhatsapp /*String*/ ));
 //BA.debugLineNum = 84;BA.debugLine="EtVideosWhapp.Text = DatosGlobales.XML_VideosWhat";
mostCurrent._etvideoswhapp.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_videoswhatsapp /*String*/ ));
 //BA.debugLineNum = 87;BA.debugLine="If DatosGlobales.XML_ChFotosCamara = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chfotoscamara /*String*/ ).equals("1")) { 
 //BA.debugLineNum = 88;BA.debugLine="ChFotosCamara.Checked = True";
mostCurrent._chfotoscamara.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 90;BA.debugLine="ChFotosCamara.Checked = False";
mostCurrent._chfotoscamara.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 93;BA.debugLine="If DatosGlobales.XML_ChVideosCamara = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chvideoscamara /*String*/ ).equals("1")) { 
 //BA.debugLineNum = 94;BA.debugLine="ChVideosCamara.Checked = True";
mostCurrent._chvideoscamara.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 96;BA.debugLine="ChVideosCamara.Checked = False";
mostCurrent._chvideoscamara.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 99;BA.debugLine="If DatosGlobales.XML_ChImagenesWhatsApp = \"1\" The";
if ((mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/ ).equals("1")) { 
 //BA.debugLineNum = 100;BA.debugLine="ChImagenesWhapp.Checked = True";
mostCurrent._chimageneswhapp.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 102;BA.debugLine="ChImagenesWhapp.Checked = False";
mostCurrent._chimageneswhapp.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 105;BA.debugLine="If DatosGlobales.XML_ChVideosWhatsApp = \"1\" Then";
if ((mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/ ).equals("1")) { 
 //BA.debugLineNum = 106;BA.debugLine="ChVideosWhapp.Checked = True";
mostCurrent._chvideoswhapp.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 108;BA.debugLine="ChVideosWhapp.Checked = False";
mostCurrent._chvideoswhapp.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 115;BA.debugLine="EtCarpetaServerBkp.Text = DatosGlobales.XML_Usuar";
mostCurrent._etcarpetaserverbkp.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_usuariorutafotos /*String*/ ));
 //BA.debugLineNum = 118;BA.debugLine="EtServidorRuta.Text = DatosGlobales.XML_ServidorR";
mostCurrent._etservidorruta.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_servidorruta /*String*/ ));
 //BA.debugLineNum = 119;BA.debugLine="EtServidorIp.Text = DatosGlobales.XML_ServidorIp";
mostCurrent._etservidorip.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_servidorip /*String*/ ));
 //BA.debugLineNum = 120;BA.debugLine="EtServidorPuerto.Text = DatosGlobales.XML_Servido";
mostCurrent._etservidorpuerto.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_servidorpuerto /*String*/ ));
 //BA.debugLineNum = 121;BA.debugLine="EtServidorUsuario.Text = DatosGlobales.XML_Servid";
mostCurrent._etservidorusuario.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_servidorusuario /*String*/ ));
 //BA.debugLineNum = 122;BA.debugLine="EtServidorClave.Text = DatosGlobales.XML_Servidor";
mostCurrent._etservidorclave.setText(BA.ObjectToCharSequence(mostCurrent._datosglobales._xml_servidorclave /*String*/ ));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 135;BA.debugLine="DatosGlobales.Configurando = False";
mostCurrent._datosglobales._configurando /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 129;BA.debugLine="DatosGlobales.Configurando = True";
mostCurrent._datosglobales._configurando /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _btnguardar_click() throws Exception{
String _unxml = "";
 //BA.debugLineNum = 144;BA.debugLine="Private Sub BtnGuardar_Click";
 //BA.debugLineNum = 150;BA.debugLine="If EtClave.Text <> \"\" And (EtClave.Text <> EtClav";
if ((mostCurrent._etclave.getText()).equals("") == false && ((mostCurrent._etclave.getText()).equals(mostCurrent._etclaveconf.getText()) == false)) { 
 //BA.debugLineNum = 151;BA.debugLine="Msgbox(\"#ERROR: la clave ingresada no es correct";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("#ERROR: la clave ingresada no es correcta."),BA.ObjectToCharSequence("Mensaje del sistema"),mostCurrent.activityBA);
 //BA.debugLineNum = 152;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 155;BA.debugLine="Dim unXml As String = CargarElXML";
_unxml = _cargarelxml();
 //BA.debugLineNum = 156;BA.debugLine="File.WriteString(File.DirInternal,\"config.xml\",un";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"config.xml",_unxml);
 //BA.debugLineNum = 160;BA.debugLine="FxGlobales.LeerXML()";
mostCurrent._fxglobales._leerxml /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 163;BA.debugLine="If DatosGlobales.XML_PrimeraVez = \"1\" Then";
if ((mostCurrent._datosglobales._xml_primeravez /*String*/ ).equals("1")) { 
 //BA.debugLineNum = 164;BA.debugLine="File.WriteString(File.DirInternal,\"indicefullbkp";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt","-1");
 //BA.debugLineNum = 165;BA.debugLine="DatosGlobales.IndiceFullBkp = File.ReadString(Fi";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"indicefullbkp.txt")));
 //BA.debugLineNum = 167;BA.debugLine="If DatosGlobales.IndiceFullBkp > 0 Then";
if (mostCurrent._datosglobales._indicefullbkp /*int*/ >0) { 
 //BA.debugLineNum = 168;BA.debugLine="DatosGlobales.IndiceFullBkp = DatosGlobales.Ind";
mostCurrent._datosglobales._indicefullbkp /*int*/  = (int) (mostCurrent._datosglobales._indicefullbkp /*int*/ -1);
 };
 };
 //BA.debugLineNum = 174;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public static String  _cargarelxml() throws Exception{
String _archivoxml = "";
 //BA.debugLineNum = 241;BA.debugLine="Private Sub CargarElXML As String";
 //BA.debugLineNum = 247;BA.debugLine="If ChFotosCamara.Checked And XML_ChFotosCamara_Hi";
if (mostCurrent._chfotoscamara.getChecked() && (mostCurrent._xml_chfotoscamara_hist).equals("0")) { 
 //BA.debugLineNum = 248;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "1";
 };
 //BA.debugLineNum = 252;BA.debugLine="If ChVideosCamara.Checked And XML_ChVideosCamara_";
if (mostCurrent._chvideoscamara.getChecked() && (mostCurrent._xml_chvideoscamara_hist).equals("0")) { 
 //BA.debugLineNum = 253;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "1";
 };
 //BA.debugLineNum = 257;BA.debugLine="If ChImagenesWhapp.Checked And XML_ChImagenesWhat";
if (mostCurrent._chimageneswhapp.getChecked() && (mostCurrent._xml_chimageneswhatsapp_hist).equals("0")) { 
 //BA.debugLineNum = 258;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "1";
 };
 //BA.debugLineNum = 262;BA.debugLine="If ChVideosWhapp.Checked And XML_ChVideosWhatsApp";
if (mostCurrent._chvideoswhapp.getChecked() && (mostCurrent._xml_chvideoswhatsapp_hist).equals("0")) { 
 //BA.debugLineNum = 263;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"1\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "1";
 };
 //BA.debugLineNum = 266;BA.debugLine="If (ChFotosCamara.Checked = False) And (ChVideosC";
if ((mostCurrent._chfotoscamara.getChecked()==anywheresoftware.b4a.keywords.Common.False) && (mostCurrent._chvideoscamara.getChecked()==anywheresoftware.b4a.keywords.Common.False) && (mostCurrent._chimageneswhapp.getChecked()==anywheresoftware.b4a.keywords.Common.False) && (mostCurrent._chvideoswhapp.getChecked()==anywheresoftware.b4a.keywords.Common.False)) { 
 //BA.debugLineNum = 267;BA.debugLine="DatosGlobales.XML_PrimeraVez = \"0\"";
mostCurrent._datosglobales._xml_primeravez /*String*/  = "0";
 };
 //BA.debugLineNum = 274;BA.debugLine="Dim ArchivoXml As String = \"<?xml version=\"\"\"\"1.0";
_archivoxml = "<?xml version=\"\"1.0\"\" encoding=\"\"UTF-8\"\"?>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 275;BA.debugLine="ArchivoXml = ArchivoXml & \"<fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"<fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 276;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 278;BA.debugLine="ArchivoXml = ArchivoXml & \" <login>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 279;BA.debugLine="ArchivoXml = ArchivoXml & \"   <usuario>\" & EtUsua";
_archivoxml = _archivoxml+"   <usuario>"+mostCurrent._etusuario.getText()+"</usuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 280;BA.debugLine="ArchivoXml = ArchivoXml & \"   <contraseña>\" & EtC";
_archivoxml = _archivoxml+"   <contraseña>"+mostCurrent._etclave.getText()+"</contraseña>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 281;BA.debugLine="ArchivoXml = ArchivoXml & \"   <recordar>\" & Datos";
_archivoxml = _archivoxml+"   <recordar>"+mostCurrent._datosglobales._xml_recordar /*String*/ +"</recordar>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 282;BA.debugLine="ArchivoXml = ArchivoXml & \" </login>\"  & CRLF & \"";
_archivoxml = _archivoxml+" </login>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 284;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 285;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_origen>\" & CRLF";
_archivoxml = _archivoxml+" <ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 286;BA.debugLine="ArchivoXml = ArchivoXml & \"   <fotoscamara>\" & Et";
_archivoxml = _archivoxml+"   <fotoscamara>"+mostCurrent._etfotoscamara.getText()+"</fotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 287;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoscamara>\" & E";
_archivoxml = _archivoxml+"   <videoscamara>"+mostCurrent._etvideoscamara.getText()+"</videoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 288;BA.debugLine="ArchivoXml = ArchivoXml & \"   <imageneswhatsapp>\"";
_archivoxml = _archivoxml+"   <imageneswhatsapp>"+mostCurrent._etimageneswhapp.getText()+"</imageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 289;BA.debugLine="ArchivoXml = ArchivoXml & \"   <videoswhatsapp>\" &";
_archivoxml = _archivoxml+"   <videoswhatsapp>"+mostCurrent._etvideoswhapp.getText()+"</videoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 291;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chfotoscamara>\" &";
_archivoxml = _archivoxml+"   <chfotoscamara>"+mostCurrent._datosglobales._xml_chfotoscamara /*String*/ +"</chfotoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 292;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoscamara>\" &";
_archivoxml = _archivoxml+"   <chvideoscamara>"+mostCurrent._datosglobales._xml_chvideoscamara /*String*/ +"</chvideoscamara>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 293;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chimageneswhatsapp";
_archivoxml = _archivoxml+"   <chimageneswhatsapp>"+mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/ +"</chimageneswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 294;BA.debugLine="ArchivoXml = ArchivoXml & \"   <chvideoswhatsapp>\"";
_archivoxml = _archivoxml+"   <chvideoswhatsapp>"+mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/ +"</chvideoswhatsapp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 295;BA.debugLine="ArchivoXml = ArchivoXml & \"   <primeravez>\" & Dat";
_archivoxml = _archivoxml+"   <primeravez>"+mostCurrent._datosglobales._xml_primeravez /*String*/ +"</primeravez>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 297;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_origen>\" & CRL";
_archivoxml = _archivoxml+" </ruta_origen>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 299;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 300;BA.debugLine="ArchivoXml = ArchivoXml & \" <ruta_destino>\" & CRL";
_archivoxml = _archivoxml+" <ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 301;BA.debugLine="ArchivoXml = ArchivoXml & \"   <UsuarioRutaFotos>\"";
_archivoxml = _archivoxml+"   <UsuarioRutaFotos>"+mostCurrent._etcarpetaserverbkp.getText()+"</UsuarioRutaFotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 302;BA.debugLine="ArchivoXml = ArchivoXml & \" </ruta_destino>\" & CR";
_archivoxml = _archivoxml+" </ruta_destino>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 303;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 305;BA.debugLine="ArchivoXml = ArchivoXml & \" <ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" <ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 306;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorruta>\" & E";
_archivoxml = _archivoxml+"   <servidorruta>"+mostCurrent._etservidorruta.getText()+"</servidorruta>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 307;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorip>\" & EtS";
_archivoxml = _archivoxml+"   <servidorip>"+mostCurrent._etservidorip.getText()+"</servidorip>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 308;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorpuerto>\" &";
_archivoxml = _archivoxml+"   <servidorpuerto>"+mostCurrent._etservidorpuerto.getText()+"</servidorpuerto>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 309;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorusuario>\"";
_archivoxml = _archivoxml+"   <servidorusuario>"+mostCurrent._etservidorusuario.getText()+"</servidorusuario>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 310;BA.debugLine="ArchivoXml = ArchivoXml & \"   <servidorclave>\" &";
_archivoxml = _archivoxml+"   <servidorclave>"+mostCurrent._etservidorclave.getText()+"</servidorclave>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 311;BA.debugLine="ArchivoXml = ArchivoXml & \" </ftp>\" & CRLF & \"\"";
_archivoxml = _archivoxml+" </ftp>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 313;BA.debugLine="ArchivoXml = ArchivoXml & \"\" & CRLF & \"\"";
_archivoxml = _archivoxml+""+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 314;BA.debugLine="ArchivoXml = ArchivoXml & \"</fotos>\" & CRLF & \"\"";
_archivoxml = _archivoxml+"</fotos>"+anywheresoftware.b4a.keywords.Common.CRLF+"";
 //BA.debugLineNum = 319;BA.debugLine="Return ArchivoXml";
if (true) return _archivoxml;
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return "";
}
public static String  _cbrecordar_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Private Sub CbRecordar_CheckedChange(Checked As Bo";
 //BA.debugLineNum = 327;BA.debugLine="If CbRecordar.Checked = True Then";
if (mostCurrent._cbrecordar.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 328;BA.debugLine="DatosGlobales.XML_Recordar = \"1\"";
mostCurrent._datosglobales._xml_recordar /*String*/  = "1";
 }else {
 //BA.debugLineNum = 330;BA.debugLine="DatosGlobales.XML_Recordar = \"0\"";
mostCurrent._datosglobales._xml_recordar /*String*/  = "0";
 };
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return "";
}
public static String  _chfotoscamara_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Private Sub ChFotosCamara_CheckedChange(Checked As";
 //BA.debugLineNum = 336;BA.debugLine="If ChFotosCamara.Checked = True Then";
if (mostCurrent._chfotoscamara.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 337;BA.debugLine="DatosGlobales.XML_ChFotosCamara = \"1\"";
mostCurrent._datosglobales._xml_chfotoscamara /*String*/  = "1";
 }else {
 //BA.debugLineNum = 339;BA.debugLine="DatosGlobales.XML_ChFotosCamara = \"0\"";
mostCurrent._datosglobales._xml_chfotoscamara /*String*/  = "0";
 };
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return "";
}
public static String  _chimageneswhapp_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Private Sub ChImagenesWhapp_CheckedChange(Checked";
 //BA.debugLineNum = 352;BA.debugLine="If ChImagenesWhapp.Checked = True Then";
if (mostCurrent._chimageneswhapp.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 353;BA.debugLine="DatosGlobales.XML_ChImagenesWhatsApp = \"1\"";
mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/  = "1";
 }else {
 //BA.debugLineNum = 355;BA.debugLine="DatosGlobales.XML_ChImagenesWhatsApp = \"0\"";
mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/  = "0";
 };
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return "";
}
public static String  _chvideoscamara_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Private Sub ChVideosCamara_CheckedChange(Checked A";
 //BA.debugLineNum = 344;BA.debugLine="If ChVideosCamara.Checked = True Then";
if (mostCurrent._chvideoscamara.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 345;BA.debugLine="DatosGlobales.XML_ChVideosCamara = \"1\"";
mostCurrent._datosglobales._xml_chvideoscamara /*String*/  = "1";
 }else {
 //BA.debugLineNum = 347;BA.debugLine="DatosGlobales.XML_ChVideosCamara = \"0\"";
mostCurrent._datosglobales._xml_chvideoscamara /*String*/  = "0";
 };
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return "";
}
public static String  _chvideoswhapp_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Private Sub ChVideosWhapp_CheckedChange(Checked As";
 //BA.debugLineNum = 360;BA.debugLine="If ChVideosWhapp.Checked = True Then";
if (mostCurrent._chvideoswhapp.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 361;BA.debugLine="DatosGlobales.XML_ChVideosWhatsApp = \"1\"";
mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/  = "1";
 }else {
 //BA.debugLineNum = 363;BA.debugLine="DatosGlobales.XML_ChVideosWhatsApp = \"0\"";
mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/  = "0";
 };
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private EtFotosCamara As EditText";
mostCurrent._etfotoscamara = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private EtVideosCamara As EditText";
mostCurrent._etvideoscamara = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private EtImagenesWhapp As EditText";
mostCurrent._etimageneswhapp = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private EtVideosWhapp As EditText";
mostCurrent._etvideoswhapp = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private SvConfiguracion As ScrollView";
mostCurrent._svconfiguracion = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private EtCarpetaServerBkp As EditText";
mostCurrent._etcarpetaserverbkp = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private EtServidorRuta As EditText";
mostCurrent._etservidorruta = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private EtServidorIp As EditText";
mostCurrent._etservidorip = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private EtServidorPuerto As EditText";
mostCurrent._etservidorpuerto = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private EtServidorUsuario As EditText";
mostCurrent._etservidorusuario = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private EtServidorClave As EditText";
mostCurrent._etservidorclave = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private BtnGuardar As Button";
mostCurrent._btnguardar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private EtUsuario As EditText";
mostCurrent._etusuario = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private EtClave As EditText";
mostCurrent._etclave = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private EtClaveConf As EditText";
mostCurrent._etclaveconf = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private CbRecordar As CheckBox";
mostCurrent._cbrecordar = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private ChFotosCamara As CheckBox";
mostCurrent._chfotoscamara = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private ChVideosCamara As CheckBox";
mostCurrent._chvideoscamara = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private ChImagenesWhapp As CheckBox";
mostCurrent._chimageneswhapp = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private ChVideosWhapp As CheckBox";
mostCurrent._chvideoswhapp = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private XML_ChFotosCamara_Hist As String = DatosG";
mostCurrent._xml_chfotoscamara_hist = mostCurrent._datosglobales._xml_chfotoscamara /*String*/ ;
 //BA.debugLineNum = 44;BA.debugLine="Private XML_ChVideosCamara_Hist As String = Datos";
mostCurrent._xml_chvideoscamara_hist = mostCurrent._datosglobales._xml_chvideoscamara /*String*/ ;
 //BA.debugLineNum = 45;BA.debugLine="Private XML_ChImagenesWhatsApp_Hist As String = D";
mostCurrent._xml_chimageneswhatsapp_hist = mostCurrent._datosglobales._xml_chimageneswhatsapp /*String*/ ;
 //BA.debugLineNum = 46;BA.debugLine="Private XML_ChVideosWhatsApp_Hist As String = Dat";
mostCurrent._xml_chvideoswhatsapp_hist = mostCurrent._datosglobales._xml_chvideoswhatsapp /*String*/ ;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public static boolean  _validardatos() throws Exception{
boolean _resultado = false;
 //BA.debugLineNum = 180;BA.debugLine="Private Sub ValidarDatos() As Boolean";
 //BA.debugLineNum = 181;BA.debugLine="Dim Resultado As Boolean = True";
_resultado = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 184;BA.debugLine="If EtUsuario.Text = \"\" Then";
if ((mostCurrent._etusuario.getText()).equals("")) { 
 //BA.debugLineNum = 185;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 188;BA.debugLine="If EtClave.Text = \"\" Then";
if ((mostCurrent._etclave.getText()).equals("")) { 
 //BA.debugLineNum = 189;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 192;BA.debugLine="If EtClaveConf.Text = \"\" Then";
if ((mostCurrent._etclaveconf.getText()).equals("")) { 
 //BA.debugLineNum = 193;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 196;BA.debugLine="If EtFotosCamara.Text = \"\" Then";
if ((mostCurrent._etfotoscamara.getText()).equals("")) { 
 //BA.debugLineNum = 197;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 200;BA.debugLine="If EtVideosCamara.Text = \"\" Then";
if ((mostCurrent._etvideoscamara.getText()).equals("")) { 
 //BA.debugLineNum = 201;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 204;BA.debugLine="If EtImagenesWhapp.Text = \"\" Then";
if ((mostCurrent._etimageneswhapp.getText()).equals("")) { 
 //BA.debugLineNum = 205;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 208;BA.debugLine="If EtVideosWhapp.Text = \"\" Then";
if ((mostCurrent._etvideoswhapp.getText()).equals("")) { 
 //BA.debugLineNum = 209;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 212;BA.debugLine="If EtCarpetaServerBkp.Text = \"\" Then";
if ((mostCurrent._etcarpetaserverbkp.getText()).equals("")) { 
 //BA.debugLineNum = 213;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 216;BA.debugLine="If EtServidorRuta.Text = \"\" Then";
if ((mostCurrent._etservidorruta.getText()).equals("")) { 
 //BA.debugLineNum = 217;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 220;BA.debugLine="If EtServidorIp.Text = \"\" Then";
if ((mostCurrent._etservidorip.getText()).equals("")) { 
 //BA.debugLineNum = 221;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 224;BA.debugLine="If EtServidorPuerto.Text = \"\" Then";
if ((mostCurrent._etservidorpuerto.getText()).equals("")) { 
 //BA.debugLineNum = 225;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 228;BA.debugLine="If EtServidorUsuario.Text = \"\" Then";
if ((mostCurrent._etservidorusuario.getText()).equals("")) { 
 //BA.debugLineNum = 229;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 232;BA.debugLine="If EtServidorClave.Text = \"\" Then";
if ((mostCurrent._etservidorclave.getText()).equals("")) { 
 //BA.debugLineNum = 233;BA.debugLine="Resultado = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 236;BA.debugLine="Return Resultado";
if (true) return _resultado;
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return false;
}
}
