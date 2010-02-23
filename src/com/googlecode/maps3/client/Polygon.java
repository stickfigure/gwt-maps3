package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Overlay for Google Maps v3 Polygon
 */
public class Polygon extends JavaScriptObject
{
	/** Required for overlays */
	protected Polygon() {}
	
	/**
	 */
	public static native Polygon newInstance() /*-{
		return new $wnd.google.maps.Polygon();
	}-*/;

	/**
	 */
	public static native Polygon newInstance(PolygonOptions opts) /*-{
		return new $wnd.google.maps.Polygon(opts);
	}-*/;

	/** */
	public final native void setMap(MapJSO map) /*-{
		this.setMap(map);
	}-*/;

	/** */
	public final native MapJSO getMap() /*-{
		return this.getMap();
	}-*/;

	/** */
	public final native void setOptions(PolygonOptions value) /*-{
		this.setOptions(value);
	}-*/;
	
	/** Need to eventually make an MVCArray version */
	public final native void setPath(JsArray<LatLng> value) /*-{
		this.setPath(value);
	}-*/;
	
	/** Need to eventually make an MVCArray version */
	public final native void setPaths(JsArray<JsArray<LatLng>> value) /*-{
		this.setPaths(value);
	}-*/;
}