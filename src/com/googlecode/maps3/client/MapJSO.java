package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;


/**
 * GWT Overlay for Google Maps v3 Map... not to be confused with a maps "Overlay".
 */
public class MapJSO extends JavaScriptObject
{
	/** Required for Overlay types */
	protected MapJSO() {}

	/** */
	public static native MapJSO newInstance(Element ele, MapOptions opts) /*-{
		return new $wnd.google.maps.Map(ele, opts);
	}-*/;

	/** */
	public final native void fitBounds(LatLngBounds bounds) /*-{
		this.fitBounds(bounds);
	}-*/;
	
	/** */
	public final native LatLngBounds getBounds() /*-{
		return this.getBounds();
	}-*/;
	
	/** */
	public final native LatLng getCenter() /*-{
		return this.getCenter();
	}-*/;
	
	/** */
	public final native void setCenter(LatLng value) /*-{
		this.setCenter(value);
	}-*/;
	
	/** */
	public final native void panTo(LatLng value) /*-{
		this.panTo(value);
	}-*/;
	
	/** */
	public final native int getZoom() /*-{
		return this.getZoom();
	}-*/;
	
	/** */
	public final native void setZoom(int value) /*-{
		this.setZoom(value);
	}-*/;
	
	/** */
	public final native void addListener(String whichEvent, Runnable handler) /*-{
		var that = this;
		$wnd.google.maps.event.addListener(this, whichEvent, function() {
			handler.@java.lang.Runnable::run()();
		});
	}-*/;
}
