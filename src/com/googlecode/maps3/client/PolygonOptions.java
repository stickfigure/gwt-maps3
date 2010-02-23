package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Overlay for Google Maps v3 Polygon options.
 */
public class PolygonOptions extends JavaScriptObject
{
	/** Required by overlays */
	protected PolygonOptions() {}

	/** Creation */
	public static native PolygonOptions newInstance() /*-{
		return {};
	}-*/;

	public final native void setFillColor(String value) /*-{ this.fillColor = value; }-*/;
	public final native void setFillOpacity(int value) /*-{ this.fillOpacity = value; }-*/;
	
	public final native void setStrokeColor(String value) /*-{ this.strokeColor = value; }-*/;
	public final native void setStrokeOpacity(int value) /*-{ this.strokeOpacity = value; }-*/;
	public final native void setStrokeWeight(int value) /*-{ this.strokeWeight = value; }-*/;

	/** Need to eventually make an MVCArray version */
	public final native void setPath(JsArray<LatLng> value) /*-{
		this.paths = value;
	}-*/;
	
	/** Need to eventually make an MVCArray version */
	public final native void setPaths(JsArray<JsArray<LatLng>> value) /*-{
		this.paths = value;
	}-*/;
}
