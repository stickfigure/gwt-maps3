package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Overlay for Google Maps v3 Rectangle
 */
public class Rectangle extends JavaScriptObject
{
	/** Required for overlays */
	protected Rectangle() {}
	
	/**
	 */
	public static native Rectangle newInstance() /*-{
		return new $wnd.google.maps.Rectangle();
	}-*/;

	/**
	 */
	public static native Rectangle newInstance(RectangleOptions opts) /*-{
		return new $wnd.google.maps.Rectangle(opts);
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
	public final native void setOptions(RectangleOptions value) /*-{
		this.setOptions(value);
	}-*/;
	
	/** */
	public final native void setBounds(LatLngBounds value) /*-{
		this.setBounds(value);
	}-*/;
	
	/** */
	public final native LatLngBounds getBounds() /*-{
		return this.getBounds();
	}-*/;
	
	/** */
	public final native void addListener(String whichEvent, Runnable handler) /*-{
		var that = this;
		$wnd.google.maps.event.addListener(this, whichEvent, function() {
			handler.@java.lang.Runnable::run()();
		});
	}-*/;
}