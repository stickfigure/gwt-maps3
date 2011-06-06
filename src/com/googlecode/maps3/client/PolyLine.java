package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class PolyLine extends JavaScriptObject {
	/** Required for overlays */
	protected PolyLine() {
	}

	/**
	 */
	public static native PolyLine newInstance() /*-{
		return new $wnd.google.maps.Polyline();
	}-*/;

	/**
	 * Set the map javascript object
	 */
	public final native void setMap(MapJSO map) /*-{
		this.setMap(map);
	}-*/;

	/**
	 * Get the javascript map-object
	 */
	public final native MapJSO getMap() /*-{
		return this.getMap();
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
