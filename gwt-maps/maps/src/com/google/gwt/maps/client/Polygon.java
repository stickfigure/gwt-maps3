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

/**
 * A polygon (like a polyline) defines a series of connected coordinates in an ordered sequence; additionally, polygons form a closed loop and define a filled region. This class extends MVCObject.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#Polygon">JavaScript reference page.</a>}
 */
public class Polygon extends MVCObject {

  /**
   * Create a polygon using the passed Polygon options, which specify the polygon's path, the stroke style for the polygon's edges, and the fill style for the polygon's interior regions. A polygon may contain one or more paths, where each path consists of an array of LatLngs. You may pass either an array of LatLngs or an MVCArray of LatLngs when constructing these paths. Arrays are converted to MVCArrays within the polygon upon instantiation.
   * 
   * @return An instance of Polygon
   */
  public static native Polygon newInstance() /*-{
    return new $wnd.Polygon();
  }-*/;

  /**
   * Create a polygon using the passed Polygon options, which specify the polygon's path, the stroke style for the polygon's edges, and the fill style for the polygon's interior regions. A polygon may contain one or more paths, where each path consists of an array of LatLngs. You may pass either an array of LatLngs or an MVCArray of LatLngs when constructing these paths. Arrays are converted to MVCArrays within the polygon upon instantiation.
   * 
   * @param opts
   * @return An instance of Polygon
   * 
   * TODO: Missing comments for parameter opts.
   */
  public static native Polygon newInstance(PolygonOptions opts) /*-{
    return new $wnd.Polygon(
      opts
    );
  }-*/;

  protected Polygon() { }

  /**
   * Retrieves the first path.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native MVCArray<LatLng> getPath() /*-{
    return this.getPath();
  }-*/;

  /**
   * Retrieves the paths for this Polygon.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native MVCArray<MVCArray<LatLng>> getPaths() /*-{
    return this.getPaths();
  }-*/;

  /**
   * Renders this Polyline or Polygon on the specified map. If map is set to null, the Poly will be removed.
   * 
   * @param map
   * 
   * TODO: Missing comments for parameter map.
   */
  public final native void setMap(Map map) /*-{
    this.setMap(
      map
    );
  }-*/;

  /**
   * @param options
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter options.
   */
  public final native void setOptions(PolygonOptions options) /*-{
    this.setOptions(
      options
    );
  }-*/;

  /**
   * Sets the first path. See Polyline options for more details.
   * 
   * @param path
   * 
   * TODO: Missing comments for parameter path.
   */
  public final native void setPath(LatLng[] path) /*-{
    this.setPath(
      @com.google.gwt.maps.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(path)
    );
  }-*/;

  /**
   * Sets the first path. See Polyline options for more details.
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
   * Sets the path for this Polygon.
   * 
   * @param paths
   * 
   * TODO: Missing comments for parameter paths.
   */
  public final native void setPaths(LatLng[] paths) /*-{
    this.setPaths(
      @com.google.gwt.maps.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(paths)
    );
  }-*/;

  /**
   * Sets the path for this Polygon.
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
   * Sets the path for this Polygon.
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
   * Sets the path for this Polygon.
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

}