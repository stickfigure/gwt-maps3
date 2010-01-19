package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Overlay for Google Maps v3 LatLngBounds.  Immutable.
 * 
 * Represents a rectangle in geographical coordinates, including one that
 * crosses the 180 degrees meridian.
 */
public class LatLngBounds extends JavaScriptObject
{
	/** Required by overlays */
	protected LatLngBounds() {}
	
	/**
	 * Construct an empty LatLngBounds object for expansion
	 */
	public static native LatLngBounds newInstance() /*-{
		return new $wnd.google.maps.LatLngBounds();
	}-*/;

	/**
	 * Construct a new LatLngBounds object by specifying two opposite corners.
	 * 
	 * @param southWest the south-west corner of the bounds to create.
	 * @param northEast the north-east corner of the bounds to create.
	 */
	public static native LatLngBounds newInstance(LatLng southWest, LatLng northEast) /*-{
		return new $wnd.google.maps.LatLngBounds(southWest, northEast);
	}-*/;

	/**
	 * Returns true iff the geographical coordinates of the point lie within this
	 * rectangle.
	 * 
	 * @param coordinate point to compare
	 * @return <code>true</code> if the geographical coordinates of the point
	 *         lie within this rectangle.
	 */
	public final native boolean contains(LatLng coordinate) /*-{
		return this.contains(coordinate);
	}-*/;

	/**
	 * Returns a new rectangle such that it contains the given point. In longitude
	 * direction, it is created in the smaller of the two possible ways. If both
	 * are equal, it is created at the eastern boundary.
	 * 
	 * @param coordinate coordinate to use in creating the new LatLngBounds object.
	 */
	public final native void extend(LatLng coordinate) /*-{
		this.extend(coordinate);
	}-*/;

	/**
	 * Returns the point at the center of the rectangle.
	 * 
	 * @return the point at the center of the rectangle.
	 */
	public final native LatLng getCenter() /*-{
		return this.getCenter();
	}-*/;

	/**
	 * Returns the point at the north-east corner of the rectangle.
	 * 
	 * @return the point at the north-east corner of the rectangle.
	 */
	public final native LatLng getNorthEast() /*-{
		return this.getNorthEast();
	}-*/;

	/**
	 * Returns the point at the south-west corner of the rectangle.
	 * 
	 * @return the point at the south-west corner of the rectangle.
	 */
	public final native LatLng getSouthWest() /*-{
		return this.getSouthWest();
	}-*/;

	/**
	 * Returns <code>true</code> if the specified rectangle intersects this rectangle.
	 * 
	 * @param other the rectangle to compare.
	 * @return <code>true</code> if the specified rectangle intersects this rectangle.
	 */
	public final native boolean intersects(LatLngBounds other) /*-{
		return this.intersects(other);
	}-*/;

	/**
	 * Returns <code>true</code> if this rectangle is empty.
	 * 
	 * @return <code>true</code> if this rectangle is empty.
	 */
	public final native boolean isEmpty() /*-{
		return this.isEmpty();
	}-*/;

	/**
	 * Returns a LatLng whose coordinates represent the size of this rectangle.
	 * 
	 * @return a LatLng whose coordinates represent the size of this rectangle.
	 */
	public final native LatLng toSpan() /*-{
		return this.toSpan();
	}-*/;
	
	/**
	 * Returns a string of the form "lat_lo,lng_lo,lat_hi,lng_hi" for this bounds,
	 * where "lo" corresponds to the southwest corner of the bounding box, while "hi"
	 * corresponds to the northeast corner of that box.
	 */
	public final native String toUrlValue() /*-{
		return this.toUrlValue();
	}-*/;
}
