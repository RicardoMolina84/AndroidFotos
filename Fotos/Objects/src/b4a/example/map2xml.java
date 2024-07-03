package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class map2xml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.map2xml");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.map2xml.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public com.jamesmurty.utils.XMLBuilder _builder = null;
public b4a.example.main _main = null;
public b4a.example.servbackup4 _servbackup4 = null;
public b4a.example.principal _principal = null;
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
public String  _class_globals(b4a.example.map2xml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Private builder As XMLBuilder";
_builder = new com.jamesmurty.utils.XMLBuilder();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="End Sub";
return "";
}
public String  _handleelement(b4a.example.map2xml __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handleelement", true))
	 {return ((String) Debug.delegate(ba, "handleelement", new Object[] {_key,_value}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Private Sub HandleElement (key As String, value As";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="If value Is Map Then";
if (_value instanceof java.util.Map) { 
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="If key <> \"\" Then builder = builder.element(key)";
if ((_key).equals("") == false) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .element(_key);};
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="HandleMapElement(value)";
__ref._handlemapelement /*String*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value)));
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="If key <> \"\" Then builder = builder.up";
if ((_key).equals("") == false) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();};
 }else 
{RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="Else if value Is List Then";
if (_value instanceof java.util.List) { 
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="HandleListElement (key, value)";
__ref._handlelistelement /*String*/ (null,_key,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value)));
 }else {
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="builder = builder.element(key)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .element(_key);
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="builder = builder.text(value)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .text(BA.ObjectToString(_value));
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="builder = builder.up";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();
 }}
;
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="End Sub";
return "";
}
public String  _handlemapelement(b4a.example.map2xml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handlemapelement", true))
	 {return ((String) Debug.delegate(ba, "handlemapelement", new Object[] {_m}));}
anywheresoftware.b4a.objects.collections.Map _attributes = null;
String _attr = "";
String _k = "";
Object _value = null;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub HandleMapElement (m As Map)";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Dim attributes As Map = m.Get(\"Attributes\")";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m.Get((Object)("Attributes"))));
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="If attributes.IsInitialized Then";
if (_attributes.IsInitialized()) { 
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="For Each attr As String In attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _attributes.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_attr = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="builder.attribute(attr, attributes.Get(attr))";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .attribute(_attr,BA.ObjectToString(_attributes.Get((Object)(_attr))));
 }
};
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="If m.ContainsKey(\"Text\") Then builder.text(m.Get";
if (_m.ContainsKey((Object)("Text"))) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .text(BA.ObjectToString(_m.Get((Object)("Text"))));};
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="m.Remove(\"Attributes\")";
_m.Remove((Object)("Attributes"));
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="m.Remove(\"Text\")";
_m.Remove((Object)("Text"));
 };
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _m.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_k = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=9830411;
 //BA.debugLineNum = 9830411;BA.debugLine="Dim value As Object = m.Get(k)";
_value = _m.Get((Object)(_k));
RDebugUtils.currentLine=9830412;
 //BA.debugLineNum = 9830412;BA.debugLine="HandleElement(k, value)";
__ref._handleelement /*String*/ (null,_k,_value);
 }
};
RDebugUtils.currentLine=9830414;
 //BA.debugLineNum = 9830414;BA.debugLine="End Sub";
return "";
}
public String  _handlelistelement(b4a.example.map2xml __ref,String _key,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handlelistelement", true))
	 {return ((String) Debug.delegate(ba, "handlelistelement", new Object[] {_key,_lst}));}
Object _value = null;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub HandleListElement (key As String, lst";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="For Each value As Object In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_value = group1.Get(index1);
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="HandleElement(key, value)";
__ref._handleelement /*String*/ (null,_key,_value);
 }
};
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.map2xml __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="End Sub";
return "";
}
public String  _maptoxml(b4a.example.map2xml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "maptoxml", true))
	 {return ((String) Debug.delegate(ba, "maptoxml", new Object[] {_m}));}
String _k = "";
anywheresoftware.b4a.objects.collections.Map _props = null;
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Public Sub MapToXml (m As Map) As String";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="builder = builder.create(k)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .create(_k);
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="HandleElement(\"\", m.Get(k))";
__ref._handleelement /*String*/ (null,"",_m.Get((Object)(_k)));
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="builder = builder.up";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="Dim props As Map";
_props = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="props.Initialize";
_props.Initialize();
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="props.Put(\"{http://xml.apache.org/xslt}indent-amo";
_props.Put((Object)("{http://xml.apache.org/xslt}indent-amount"),(Object)("4"));
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="props.Put(\"indent\", \"yes\")";
_props.Put((Object)("indent"),(Object)("yes"));
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="Return builder.asString2(props)";
if (true) return __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .asString2((java.util.Map)(_props.getObject()));
RDebugUtils.currentLine=9764880;
 //BA.debugLineNum = 9764880;BA.debugLine="End Sub";
return "";
}
}