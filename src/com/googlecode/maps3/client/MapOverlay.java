package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;


/**
 * Overlay for Google Maps v3 Map
 */
public class MapOverlay extends JavaScriptObject
{
	/** Required for Overlay types */
	protected MapOverlay() {}

	/** */
	public static native MapOverlay newInstance(Element ele, MapOptions opts) /*-{
		return new $wnd.google.maps.Map(ele, opts);
	}-*/;

	/** */
	public final native void fitBounds(LatLngBounds bounds) /*-{
		this.fitBounds(bounds);
	}-*/;
}
