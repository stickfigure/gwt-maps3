package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * Overlay for Google Maps v3 InfoWindow
 */
public class InfoWindow extends JavaScriptObject
{
	/** Required for overlays */
	protected InfoWindow() {}
	
	/**
	 */
	public static native InfoWindow newInstance() /*-{
		return new $wnd.google.maps.InfoWindow();
	}-*/;

	/**
	 */
	public static native InfoWindow newInstance(InfoWindowOptions opts) /*-{
		return new $wnd.google.maps.InfoWindow(opts);
	}-*/;

	/** */
	public final native void close() /*-{
		this.close();
	}-*/;
	
	/** */
	public final native void open(MapJSO map) /*-{
		this.open(map);
	}-*/;

	/** Yeah, this is cheating WRT the marker.  Need to create an overlay for MVCObject */
	public final native void open(MapJSO map, JavaScriptObject marker) /*-{
		this.open(map, marker);
	}-*/;

	/** */
	public final native void setOptions(InfoWindowOptions value) /*-{
		this.setOptions(value);
	}-*/;
	
	/** @return a String or Element */
	public final native Object getContent() /*-{
		return this.getContent();
	}-*/;
	/** */
	public final native void setContent(String value) /*-{
		this.setContent(value);
	}-*/;
	/** */
	public final native void setContent(Element value) /*-{
		this.setContent(value);
	}-*/;

	/** */
	public final native LatLng getPosition() /*-{
	return this.getPosition();
	}-*/;
	/** */
	public final native void setPosition(LatLng value) /*-{
		this.setPosition(value);
	}-*/;

	/** */
	public final native int getZIndex() /*-{
	return this.getZIndex();
	}-*/;
	/** */
	public final native void setZIndex(int value) /*-{
		this.setZIndex(value);
	}-*/;
}