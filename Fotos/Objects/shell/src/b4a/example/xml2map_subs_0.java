package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xml2map_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private parser As SaxParser";
xml2map._parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.SaxParser");__ref.setField("_parser",xml2map._parser);
 //BA.debugLineNum = 5;BA.debugLine="Type XmlElement (Name As String, Children As List";
;
 //BA.debugLineNum = 6;BA.debugLine="Private elements As List";
xml2map._elements = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_elements",xml2map._elements);
 //BA.debugLineNum = 7;BA.debugLine="Private mStripNamespaces As Boolean";
xml2map._mstripnamespaces = RemoteObject.createImmutable(false);__ref.setField("_mstripnamespaces",xml2map._mstripnamespaces);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createelement(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("CreateElement (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("createelement")) { return __ref.runUserSub(false, "xml2map","createelement", __ref, _name);}
RemoteObject _xe = RemoteObject.declareNull("b4a.example.xml2map._xmlelement");
Debug.locals.put("Name", _name);
 BA.debugLineNum = 68;BA.debugLine="Private Sub CreateElement (Name As String) As XmlE";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="Dim xe As XmlElement";
Debug.JustUpdateDeviceLine();
_xe = RemoteObject.createNew ("b4a.example.xml2map._xmlelement");Debug.locals.put("xe", _xe);
 BA.debugLineNum = 70;BA.debugLine="xe.Initialize";
Debug.JustUpdateDeviceLine();
_xe.runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="xe.Children.Initialize";
Debug.JustUpdateDeviceLine();
_xe.getField(false,"Children" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="xe.Name = Name";
Debug.JustUpdateDeviceLine();
_xe.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 78;BA.debugLine="Return xe";
Debug.JustUpdateDeviceLine();
if (true) return _xe;
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _elementtoobject(RemoteObject __ref,RemoteObject _element) throws Exception{
try {
		Debug.PushSubsStack("ElementToObject (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("elementtoobject")) { return __ref.runUserSub(false, "xml2map","elementtoobject", __ref, _element);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _child = RemoteObject.declareNull("b4a.example.xml2map._xmlelement");
RemoteObject _childobject = RemoteObject.declareNull("Object");
RemoteObject _currentitem = RemoteObject.declareNull("Object");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Element", _element);
 BA.debugLineNum = 42;BA.debugLine="Private Sub ElementToObject (Element As XmlElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="If Element.Children.Size = 0 And Element.Attribut";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_element.getField(false,"Children" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_element.getField(false,"Attributes" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),xml2map.__c.getField(true,"False"))) { 
if (true) return (_element.getField(true,"Text" /*RemoteObject*/ ));};
 BA.debugLineNum = 44;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 45;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="If Element.Attributes.IsInitialized Then m.Put(\"A";
Debug.JustUpdateDeviceLine();
if (_element.getField(false,"Attributes" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Attributes"))),(Object)((_element.getField(false,"Attributes" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 47;BA.debugLine="If Element.Children.Size = 0 Then m.Put(\"Text\", E";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_element.getField(false,"Children" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Text"))),(Object)((_element.getField(true,"Text" /*RemoteObject*/ ))));};
 BA.debugLineNum = 48;BA.debugLine="For Each child As XmlElement In Element.Children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = _element.getField(false,"Children" /*RemoteObject*/ );
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_child = (group6.runMethod(false,"Get",index6));Debug.locals.put("child", _child);
Debug.locals.put("child", _child);
 BA.debugLineNum = 49;BA.debugLine="Dim childObject As Object = ElementToObject(chil";
Debug.JustUpdateDeviceLine();
_childobject = __ref.runClassMethod (b4a.example.xml2map.class, "_elementtoobject" /*RemoteObject*/ ,(Object)(_child));Debug.locals.put("childObject", _childobject);Debug.locals.put("childObject", _childobject);
 BA.debugLineNum = 50;BA.debugLine="If m.ContainsKey(child.Name) Then";
Debug.JustUpdateDeviceLine();
if (_m.runMethod(true,"ContainsKey",(Object)((_child.getField(true,"Name" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 51;BA.debugLine="Dim currentItem As Object = m.Get(child.Name)";
Debug.JustUpdateDeviceLine();
_currentitem = _m.runMethod(false,"Get",(Object)((_child.getField(true,"Name" /*RemoteObject*/ ))));Debug.locals.put("currentItem", _currentitem);Debug.locals.put("currentItem", _currentitem);
 BA.debugLineNum = 52;BA.debugLine="Dim list As List";
Debug.JustUpdateDeviceLine();
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 53;BA.debugLine="If currentItem Is List Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_currentitem, RemoteObject.createImmutable("java.util.List"))) { 
 BA.debugLineNum = 54;BA.debugLine="list = currentItem";
Debug.JustUpdateDeviceLine();
_list = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentitem);Debug.locals.put("list", _list);
 }else {
 BA.debugLineNum = 56;BA.debugLine="list.Initialize";
Debug.JustUpdateDeviceLine();
_list.runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="list.Add(currentItem)";
Debug.JustUpdateDeviceLine();
_list.runVoidMethod ("Add",(Object)(_currentitem));
 BA.debugLineNum = 58;BA.debugLine="m.Put(child.Name, list)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_child.getField(true,"Name" /*RemoteObject*/ ))),(Object)((_list.getObject())));
 };
 BA.debugLineNum = 60;BA.debugLine="list.Add(childObject)";
Debug.JustUpdateDeviceLine();
_list.runVoidMethod ("Add",(Object)(_childobject));
 }else {
 BA.debugLineNum = 62;BA.debugLine="m.Put(child.Name, childObject)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_child.getField(true,"Name" /*RemoteObject*/ ))),(Object)(_childobject));
 };
 }
}Debug.locals.put("child", _child);
;
 BA.debugLineNum = 65;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return (_m.getObject());
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastelement(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetLastElement (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("getlastelement")) { return __ref.runUserSub(false, "xml2map","getlastelement", __ref);}
 BA.debugLineNum = 127;BA.debugLine="Private Sub GetLastElement As XmlElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="Return elements.Get(elements.Size - 1)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_elements" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_elements" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstripnamespaces(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getStripNamespaces (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("getstripnamespaces")) { return __ref.runUserSub(false, "xml2map","getstripnamespaces", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Public Sub getStripNamespaces As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="Return mStripNamespaces";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mstripnamespaces" /*RemoteObject*/ );
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "xml2map","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="parser.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parser" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parse(RemoteObject __ref,RemoteObject _xml) throws Exception{
try {
		Debug.PushSubsStack("Parse (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("parse")) { return __ref.runUserSub(false, "xml2map","parse", __ref, _xml);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _b = null;
Debug.locals.put("XML", _xml);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Parse(XML As String) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="Dim in As InputStream";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 29;BA.debugLine="Dim b() As Byte = XML.GetBytes(\"UTF8\")";
Debug.JustUpdateDeviceLine();
_b = _xml.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 30;BA.debugLine="in.InitializeFromBytesArray(b, 0, b.Length)";
Debug.JustUpdateDeviceLine();
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")));
 BA.debugLineNum = 31;BA.debugLine="Return Parse2(in)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.xml2map.class, "_parse2" /*RemoteObject*/ ,(Object)(_in));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parse2(RemoteObject __ref,RemoteObject _input) throws Exception{
try {
		Debug.PushSubsStack("Parse2 (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("parse2")) { return __ref.runUserSub(false, "xml2map","parse2", __ref, _input);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Input", _input);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Parse2(Input As InputStream) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="elements.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_elements" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="elements.Add(CreateElement(\"stub\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_elements" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.xml2map.class, "_createelement" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("stub"))))));
 BA.debugLineNum = 37;BA.debugLine="parser.Parse(Input, \"parser\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parser" /*RemoteObject*/ ).runVoidMethodAndSync ("Parse",(Object)((_input.getObject())),(Object)(RemoteObject.createImmutable("parser")));
 BA.debugLineNum = 38;BA.debugLine="Dim m As Map = ElementToObject(elements.Get(0))";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.runClassMethod (b4a.example.xml2map.class, "_elementtoobject" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_elements" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 39;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parser_endelement(RemoteObject __ref,RemoteObject _uri,RemoteObject _name,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("Parser_EndElement (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("parser_endelement")) { return __ref.runUserSub(false, "xml2map","parser_endelement", __ref, _uri, _name, _text);}
RemoteObject _element = RemoteObject.declareNull("b4a.example.xml2map._xmlelement");
Debug.locals.put("Uri", _uri);
Debug.locals.put("Name", _name);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 131;BA.debugLine="Private Sub Parser_EndElement (Uri As String, Name";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="Dim Element As XmlElement = GetLastElement";
Debug.JustUpdateDeviceLine();
_element = __ref.runClassMethod (b4a.example.xml2map.class, "_getlastelement" /*RemoteObject*/ );Debug.locals.put("Element", _element);Debug.locals.put("Element", _element);
 BA.debugLineNum = 133;BA.debugLine="Element.Text = Text.ToString";
Debug.JustUpdateDeviceLine();
_element.setField ("Text" /*RemoteObject*/ ,_text.runMethod(true,"ToString"));
 BA.debugLineNum = 134;BA.debugLine="elements.RemoveAt(elements.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_elements" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_elements" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parser_startelement(RemoteObject __ref,RemoteObject _uri,RemoteObject _name,RemoteObject _attributes) throws Exception{
try {
		Debug.PushSubsStack("Parser_StartElement (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("parser_startelement")) { return __ref.runUserSub(false, "xml2map","parser_startelement", __ref, _uri, _name, _attributes);}
RemoteObject _element = RemoteObject.declareNull("b4a.example.xml2map._xmlelement");
RemoteObject _att = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("Uri", _uri);
Debug.locals.put("Name", _name);
Debug.locals.put("Attributes", _attributes);
 BA.debugLineNum = 85;BA.debugLine="Private Sub Parser_StartElement (Uri As String, Na";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="Dim Element As XmlElement = CreateElement(Name)";
Debug.JustUpdateDeviceLine();
_element = __ref.runClassMethod (b4a.example.xml2map.class, "_createelement" /*RemoteObject*/ ,(Object)(_name));Debug.locals.put("Element", _element);Debug.locals.put("Element", _element);
 BA.debugLineNum = 88;BA.debugLine="If Attributes.IsInitialized And Attributes.Size >";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_attributes.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_attributes.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 89;BA.debugLine="Dim att As Map";
Debug.JustUpdateDeviceLine();
_att = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("att", _att);
 BA.debugLineNum = 101;BA.debugLine="att.Initialize";
Debug.JustUpdateDeviceLine();
_att.runVoidMethod ("Initialize");
 BA.debugLineNum = 102;BA.debugLine="For i = 0 To Attributes.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_attributes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 103;BA.debugLine="Dim key As String = Attributes.GetName(i)";
Debug.JustUpdateDeviceLine();
_key = _attributes.runMethod(true,"GetName",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 104;BA.debugLine="If mStripNamespaces Then key = StripNamespace(k";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mstripnamespaces" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_key = __ref.runClassMethod (b4a.example.xml2map.class, "_stripnamespace" /*RemoteObject*/ ,(Object)(_key));Debug.locals.put("key", _key);};
 BA.debugLineNum = 105;BA.debugLine="att.Put(key, Attributes.GetValue(i))";
Debug.JustUpdateDeviceLine();
_att.runVoidMethod ("Put",(Object)((_key)),(Object)((_attributes.runMethod(true,"GetValue",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 108;BA.debugLine="Element.Attributes = att";
Debug.JustUpdateDeviceLine();
_element.setField ("Attributes" /*RemoteObject*/ ,_att);
 };
 BA.debugLineNum = 110;BA.debugLine="GetLastElement.Children.Add(Element)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.xml2map.class, "_getlastelement" /*RemoteObject*/ ).getField(false,"Children" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_element)));
 BA.debugLineNum = 111;BA.debugLine="elements.Add(Element)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_elements" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_element)));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstripnamespaces(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setStripNamespaces (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("setstripnamespaces")) { return __ref.runUserSub(false, "xml2map","setstripnamespaces", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 23;BA.debugLine="Public Sub setStripNamespaces (b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="mStripNamespaces = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mstripnamespaces" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stripnamespace(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("StripNamespace (xml2map) ","xml2map",15,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("stripnamespace")) { return __ref.runUserSub(false, "xml2map","stripnamespace", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 114;BA.debugLine="Private Sub StripNamespace(s As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}