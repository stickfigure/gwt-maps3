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
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#PolylineOptions">JavaScript reference page.</a>}
 */
public class PolylineOptions extends JavaScriptObject {

  /**
   * Instantiates a PolylineOptions object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native PolylineOptions newInstance() /*-{
    return new $wnd.PolylineOptions();
  }-*/;

  protected PolylineOptions() { }

  /**
   * The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng[] getPath() /*-{
    return this.path;
  }-*/;

  /**
   * The stroke color in HTML hex style, ie. "#FFAA00"
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getStrokeColor() /*-{
    return this.strokeColor;
  }-*/;

  /**
   * The stroke opacity between 0.0 and 1.0
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getStrokeOpacity() /*-{
    return this.strokeOpacity;
  }-*/;

  /**
   * The stroke width in pixels.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getStrokeWeight() /*-{
    return this.strokeWeight;
  }-*/;

  /**
   * The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   * 
   * @param path
   * 
   * TODO: Missing comments for parameter path.
   */
  public final native void setPath(LatLng[] path) /*-{
    this.path = path;
  }-*/;

  /**
   * The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   * 
   * @param path
   * 
   * TODO: Missing comments for parameter path.
   */
  public final native void setPath(MVCArray<LatLng> path) /*-{
    this.setPath(
      path
    );
  }-*/;

  /**
   * The stroke color in HTML hex style, ie. "#FFAA00"
   * 
   * @param strokeColor
   * 
   * TODO: Missing comments for parameter strokeColor.
   */
  public final native void setStrokeColor(String strokeColor) /*-{
    this.strokeColor = strokeColor;
  }-*/;

  /**
   * The stroke opacity between 0.0 and 1.0
   * 
   * @param strokeOpacity
   * 
   * TODO: Missing comments for parameter strokeOpacity.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native void setStrokeOpacity(double strokeOpacity) /*-{
    this.strokeOpacity = strokeOpacity;
  }-*/;

  /**
   * The stroke width in pixels.
   * 
   * @param strokeWeight
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter strokeWeight.
   */
  public final native void setStrokeWeight(double strokeWeight) /*-{
    this.strokeWeight = strokeWeight;
  }-*/;

}