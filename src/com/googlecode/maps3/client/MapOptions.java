package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Overlay for Google Maps v3 MapOptions.
 */
public class MapOptions extends JavaScriptObject
{
	/** Required by overlays */
	protected MapOptions() {}

	/** Creation */
	public static native MapOptions newInstance() /*-{
		return {};
	}-*/;

	
	public final native void setBackgroundColor(String value) /*-{ this.backgroundColor = value; }-*/;
	public final native void setCenter(LatLng value) /*-{ this.center = value; }-*/;
	public final native void setZoom(int value) /*-{ this.zoom = value; }-*/;

	/** TODO: parameterize these */
	public final native void setMapTypeId() /*-{ this.mapTypeId = $wnd.google.maps.MapTypeId.ROADMAP; }-*/;
	public final native void setNavigationControlOptions() /*-{
		this.navigationControlOptions = { position: $wnd.google.maps.ControlPosition.LEFT };
	}-*/;
}
