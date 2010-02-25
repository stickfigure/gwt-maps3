package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Overlay for Google Maps v3 RectangleOptions.
 */
public class RectangleOptions extends JavaScriptObject
{
	/** Required by overlays */
	protected RectangleOptions() {}

	/** Creation */
	public static native RectangleOptions newInstance() /*-{
		return {};
	}-*/;

	public final native void setFillColor(String value) /*-{ this.fillColor = value; }-*/;
	public final native void setFillOpacity(double value) /*-{ this.fillOpacity = value; }-*/;
	
	public final native void setStrokeColor(String value) /*-{ this.strokeColor = value; }-*/;
	public final native void setStrokeOpacity(double value) /*-{ this.strokeOpacity = value; }-*/;
	public final native void setStrokeWeight(double value) /*-{ this.strokeWeight = value; }-*/;

	public final native void setBounds(LatLngBounds value) /*-{ this.bounds = value; }-*/;
}
