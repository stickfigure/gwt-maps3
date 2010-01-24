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
 * Notice also that you cannot modify the coordinates of a LatLng. If you want to compute another point, you have to create a new one.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#LatLng">JavaScript reference page.</a>}
 */
public class LatLng extends JavaScriptObject {

  /**
   * Notice the ordering of latitude and longitude. If the noWrap flag is true, then the numbers will be used as passed, otherwise latitude will be clamped to lie between -90 degrees and +90 degrees, and longitude will be wrapped to lie between -180 degrees and +180 degrees.
   * 
   * @param lat
   * @param lng
   * @return An instance of LatLng
   * 
   * TODO: Missing comments for parameter lng.
   * TODO: Missing comments for parameter lat.
   * TODO: JSNI implementation contains the "undefined" keyword.
   */
  public static native LatLng newInstance(double lat, double lng) /*-{
    return new $wnd.LatLng(
      lat,
      lng,
      undefined
    );
  }-*/;

  /**
   * Notice the ordering of latitude and longitude. If the noWrap flag is true, then the numbers will be used as passed, otherwise latitude will be clamped to lie between -90 degrees and +90 degrees, and longitude will be wrapped to lie between -180 degrees and +180 degrees.
   * 
   * @param lat
   * @param lng
   * @param noWrap
   * @return An instance of LatLng
   * 
   * TODO: Missing comments for parameter lng.
   * TODO: Missing comments for parameter lat.
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter noWrap.
   */
  public static native LatLng newInstance(double lat, double lng, boolean noWrap) /*-{
    return new $wnd.LatLng(
      lat,
      lng,
      noWrap
    );
  }-*/;

  protected LatLng() { }

  /**
   * Comparison function.
   * 
   * @param other
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter other.
   */
  public final native boolean equals(LatLng other) /*-{
    return this.equals(
      other
    );
  }-*/;

  /**
   * Returns the latitude in degrees.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double lat() /*-{
    return this.lat();
  }-*/;

  /**
   * Returns the longitude in degrees.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double lng() /*-{
    return this.lng();
  }-*/;

  /**
   * Converts to string representation.
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
   * Returns a string of the form "lat,lng" for this LatLng. We round the lat/lng values to 6 decimal places by default.
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String toUrlValue() /*-{
    return this.toUrlValue();
  }-*/;

  /**
   * Returns a string of the form "lat,lng" for this LatLng. We round the lat/lng values to 6 decimal places by default.
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

}