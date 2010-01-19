package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Overlay for Google Maps v3 Marker.
 */
public class Marker extends JavaScriptObject
{
	/** Required by overlays */
	protected Marker() {}
	
	/**
	 * This suffices since all the MarkerOptions are duplicated with setters.
	 */
	public static native Marker newInstance() /*-{
		return new $wnd.google.maps.Marker();
	}-*/;

	/** */
	public final native void setMap(MapJSO map) /*-{
		this.setMap(map);
	}-*/;

	/** */
	public final native void setPosition(LatLng value) /*-{
		this.setPosition(value);
	}-*/;

	/** */
	public final native LatLng getPosition() /*-{
		return this.getPosition();
	}-*/;

	/** */
	public final native void setTitle(String value) /*-{
		this.setTitle(value);
	}-*/;

	/** TODO: add MarkerImage version too */
	public final native void setIcon(String value) /*-{
		this.setIcon(value);
	}-*/;
	
	/** */
	public final native void setZIndex(int value) /*-{
		this.setZIndex(value);
	}-*/;

	/** */
	public final native void setClickable(boolean value) /*-{
		this.setClickable(value);
	}-*/;

	/** */
	public final native void addListener(String event, Runnable handler) /*-{
		$wnd.google.maps.event.addListener(this, event, function() {
			handler.@java.lang.Runnable::run()();
		});
	}-*/;
}
