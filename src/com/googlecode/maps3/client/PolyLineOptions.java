package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class PolyLineOptions extends JavaScriptObject {
	/** Required by overlays */
	protected PolyLineOptions() {
	}

	/** Creation */
	public static native PolygonOptions newInstance() /*-{
		return {};
	}-*/;

	public final native void setFillColor(String value) /*-{
		this.fillColor = value;
	}-*/;

	public final native void setFillOpacity(double value) /*-{
		this.fillOpacity = value;
	}-*/;

	public final native void setStrokeColor(String value) /*-{
		this.strokeColor = value;
	}-*/;

	public final native void setStrokeOpacity(double value) /*-{
		this.strokeOpacity = value;
	}-*/;

	public final native void setStrokeWeight(double value) /*-{
		this.strokeWeight = value;
	}-*/;

	public final native void setZIndex(double value) /*-{
		this.zIndex = value;
	}-*/;

	/** Need to eventually make an MVCArray version */
	public final native void setPath(JsArray<LatLng> value) /*-{
		this.paths = value;
	}-*/;

	/** Need to eventually make an MVCArray version */
	public final native void setPaths(JsArray<JsArray<LatLng>> value) /*-{
		this.paths = value;
	}-*/;
}