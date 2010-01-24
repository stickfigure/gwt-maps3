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
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#PolygonOptions">JavaScript reference page.</a>}
 */
public class PolygonOptions extends JavaScriptObject {

  /**
   * Instantiates a PolygonOptions object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native PolygonOptions newInstance() /*-{
    return new $wnd.PolygonOptions();
  }-*/;

  protected PolygonOptions() { }

  /**
   * The fill color in HTML hex style, ie. "#00AAFF"
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getFillColor() /*-{
    return this.fillColor;
  }-*/;

  /**
   * The fill opacity between 0.0 and 1.0
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getFillOpacity() /*-{
    return this.fillOpacity;
  }-*/;

  /**
   * The ordered sequence of coordinates that designates a closed loop. Unlike polylines, a polygon may consist of one or more paths. As a result, the paths property may specify one or more arrays of LatLng coordinates. Simple polygons may be defined using a single array of LatLngs. More complex polygons may specify an array of arrays. Any simple arrays are convered into MVCArrays. Inserting or removing LatLngs from the MVCArray will automatically update the polygon on the map.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng[] getPaths() /*-{
    return this.paths;
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
   * The fill color in HTML hex style, ie. "#00AAFF"
   * 
   * @param fillColor
   * 
   * TODO: Missing comments for parameter fillColor.
   */
  public final native void setFillColor(String fillColor) /*-{
    this.fillColor = fillColor;
  }-*/;

  /**
   * The fill opacity between 0.0 and 1.0
   * 
   * @param fillOpacity
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter fillOpacity.
   */
  public final native void setFillOpacity(double fillOpacity) /*-{
    this.fillOpacity = fillOpacity;
  }-*/;

  /**
   * The ordered sequence of coordinates that designates a closed loop. Unlike polylines, a polygon may consist of one or more paths. As a result, the paths property may specify one or more arrays of LatLng coordinates. Simple polygons may be defined using a single array of LatLngs. More complex polygons may specify an array of arrays. Any simple arrays are convered into MVCArrays. Inserting or removing LatLngs from the MVCArray will automatically update the polygon on the map.
   * 
   * @param paths
   * 
   * TODO: Missing comments for parameter paths.
   */
  public final native void setPaths(LatLng[] paths) /*-{
    this.paths = paths;
  }-*/;

  /**
   * The ordered sequence of coordinates that designates a closed loop. Unlike polylines, a polygon may consist of one or more paths. As a result, the paths property may specify one or more arrays of LatLng coordinates. Simple polygons may be defined using a single array of LatLngs. More complex polygons may specify an array of arrays. Any simple arrays are convered into MVCArrays. Inserting or removing LatLngs from the MVCArray will automatically update the polygon on the map.
   * 
   * @param paths
   * 
   * TODO: Missing comments for parameter paths.
   */
  public final native void setPaths(MVCArray<MVCArray<LatLng>> paths) /*-{
    this.setPaths(
      paths
    );
  }-*/;

  /**
   * The ordered sequence of coordinates that designates a closed loop. Unlike polylines, a polygon may consist of one or more paths. As a result, the paths property may specify one or more arrays of LatLng coordinates. Simple polygons may be defined using a single array of LatLngs. More complex polygons may specify an array of arrays. Any simple arrays are convered into MVCArrays. Inserting or removing LatLngs from the MVCArray will automatically update the polygon on the map.
   * 
   * @param paths
   * 
   * TODO: Missing comments for parameter paths.
   */
  public final native void setPaths(MVCArray<LatLng> paths) /*-{
    this.setPaths(
      paths
    );
  }-*/;

  /**
   * The ordered sequence of coordinates that designates a closed loop. Unlike polylines, a polygon may consist of one or more paths. As a result, the paths property may specify one or more arrays of LatLng coordinates. Simple polygons may be defined using a single array of LatLngs. More complex polygons may specify an array of arrays. Any simple arrays are convered into MVCArrays. Inserting or removing LatLngs from the MVCArray will automatically update the polygon on the map.
   * 
   * @param paths
   * 
   * TODO: Missing comments for parameter paths.
   */
  public final native void setPaths(Array<LatLng>[] paths) /*-{
    this.setPaths(
      @com.google.gwt.maps.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(paths)
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