package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Overlay for Google Maps v3 LatLng
 * Immutable.
 */
public class LatLng extends JavaScriptObject
{
	/** Required for overlays */
	protected LatLng() {}
	
	/**
	 * Create a new point. latitude will be clamped to lie between -90 degrees and
	 * +90 degrees, and longitude will be wrapped to lie between -180 degrees and
	 * +180 degrees.
	 * 
	 * @param latitude value between -90 and +90 degrees (clamped)
	 * @param longitude value between -180 and +180 degrees (wrapped)
	 */
	public static native LatLng newInstance(double latitude, double longitude) /*-{
		return new $wnd.google.maps.LatLng(latitude, longitude);
	}-*/;

	/**
	 * Create a new point. latitude will be clamped to lie between -90 degrees and
	 * +90 degrees, and longitude will be wrapped to lie between -180 degrees and
	 * +180 degrees.
	 * 
	 * @param latitude value between -90 and +90 degrees (clamped)
	 * @param longitude value between -180 and +180 degrees (wrapped)
	 * @param unbounded if <code>true</code>, then numbers will not be wrapped or clamped.
	 */
	public static native LatLng newInstance(double latitude, double longitude, boolean unbounded) /*-{
		return new $wnd.google.maps.LatLng(latitude, longitude, unbounded);
	}-*/;

	/**
	 * Returns the latitude coordinate of this point in degrees as a number
	 * between -90 and 90.
	 * 
	 * @return the latitude coordinate of this point in degrees.
	 */
	public final native double getLatitude() /*-{
		return this.lat();
	}-*/;

	/**
	 * Returns the longitude coordinate of this point in degrees as a number
	 * between -180 and 180.
	 * 
	 * @return the longitude coordinate of this point in degrees.
	 */
	public final native double getLongitude() /*-{
		return this.lng();
	}-*/;

	/**
	 * Does what equals() ought to do, but we are constrained by the JS overlay
	 * rules.
	 * 
	 * @param other a point to compare
	 * @return <code>true</code> if the latitude and longitude match.
	 */
	public final native boolean isEquals(LatLng other) /*-{
		return this.equals(other);
	}-*/;

	/**
	 * Returns a string that represents this point in a format suitable for use as
	 * a URL parameter value.
	 * For example, a precision of six digits corresponds to a resolution of 4
	 * inches or 11 centimeters.
	 * 
	 * @param precision the precision in number of digits
	 * @return a URL-safe string that represents this point
	 */
	public final native String toUrlValue(int precision) /*-{
		return this.toUrlValue(precision);
	}-*/;
}