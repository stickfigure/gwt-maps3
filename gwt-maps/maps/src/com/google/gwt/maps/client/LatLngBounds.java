/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.maps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A LatLngBounds instance represents a rectangle in geographical coordinates, including one that crosses the 180 degrees longitudinal meridian.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#LatLngBounds">JavaScript reference page.</a>}
 */
public class LatLngBounds extends JavaScriptObject {

  /**
   * Constructs a rectangle from the points at its south-west and north-east corners.
   * 
   * @return An instance of LatLngBounds
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   */
  public static native LatLngBounds newInstance() /*-{
    return new $wnd.LatLngBounds(
      undefined,
      undefined
    );
  }-*/;

  /**
   * Constructs a rectangle from the points at its south-west and north-east corners.
   * 
   * @param ne
   * @return An instance of LatLngBounds
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter ne.
   */
  public static native LatLngBounds newInstance(LatLng ne) /*-{
    return new $wnd.LatLngBounds(
      undefined,
      ne
    );
  }-*/;

  /**
   * Constructs a rectangle from the points at its south-west and north-east corners.
   * 
   * @param sw
   * @return An instance of LatLngBounds
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter sw.
   */
  public static native LatLngBounds newInstance(LatLng sw) /*-{
    return new $wnd.LatLngBounds(
      sw,
      undefined
    );
  }-*/;

  /**
   * Constructs a rectangle from the points at its south-west and north-east corners.
   * 
   * @param sw
   * @param ne
   * @return An instance of LatLngBounds
   * 
   * TODO: Missing comments for parameter ne.
   * TODO: Missing comments for parameter sw.
   */
  public static native LatLngBounds newInstance(LatLng sw, LatLng ne) /*-{
    return new $wnd.LatLngBounds(
      sw,
      ne
    );
  }-*/;

  protected LatLngBounds() { }

  /**
   * Returns true if the given lat/lng is in this bounds.
   * 
   * @param point
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter point.
   */
  public final native boolean contains(LatLng point) /*-{
    return this.contains(
      point
    );
  }-*/;

  /**
   * Returns true if this bounds approximately equals the given bounds.
   * 
   * @param other
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter other.
   */
  public final native boolean equals(LatLngBounds other) /*-{
    return this.equals(
      other
    );
  }-*/;

  /**
   * Extends this bounds to contain the given point.
   * 
   * @param point
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter point.
   */
  public final native LatLngBounds extend(LatLng point) /*-{
    return this.extend(
      point
    );
  }-*/;

  /**
   * Computes the center of this LatLngBounds
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getCenter() /*-{
    return this.getCenter();
  }-*/;

  /**
   * Returns the north-east corner of this bounds.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getNorthEast() /*-{
    return this.getNorthEast();
  }-*/;

  /**
   * Returns the south-west corner of this bounds.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getSouthWest() /*-{
    return this.getSouthWest();
  }-*/;

  /**
   * Returns true if this bounds shares any points with this bounds.
   * 
   * @param other
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter other.
   */
  public final native boolean intersects(LatLngBounds other) /*-{
    return this.intersects(
      other
    );
  }-*/;

  /**
   * Returns if the bounds are empty.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean isEmpty() /*-{
    return this.isEmpty();
  }-*/;

  /**
   * Converts the given map bounds to a lat/lng span.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng toSpan() /*-{
    return this.toSpan();
  }-*/;

  /**
   * Converts to string.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: An underscore has been appended to the method name (collision with final method).
   */
  public final native String toString_() /*-{
    return this.toString_();
  }-*/;

  /**
   * Returns a string of the form "lat_lo,lng_lo,lat_hi,lng_hi" for this bounds, where "lo" corresponds to the southwest corner of the bounding box, while "hi" corresponds to the northeast corner of that box.
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String toUrlValue() /*-{
    return this.toUrlValue();
  }-*/;

  /**
   * Returns a string of the form "lat_lo,lng_lo,lat_hi,lng_hi" for this bounds, where "lo" corresponds to the southwest corner of the bounding box, while "hi" corresponds to the northeast corner of that box.
   * 
   * @param precision
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter precision.
   */
  public final native String toUrlValue(double precision) /*-{
    return this.toUrlValue(
      precision
    );
  }-*/;

  /**
   * Extends this bounds to contain the union of this and the given bounds.
   * 
   * @param other
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter other.
   */
  public final native LatLngBounds union(LatLngBounds other) /*-{
    return this.union(
      other
    );
  }-*/;

}