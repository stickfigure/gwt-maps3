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
 * A polyline is a linear overlay of connected line segments on the map. This class extends MVCObject.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#Polyline">JavaScript reference page.</a>}
 */
public class Polyline extends MVCObject {

  /**
   * Create a polyline using the passed Polyline options, which specify both the path of the polyline and the stroke style to use when drawing the polyline. You may pass either an array of LatLngs or an MVCArray of LatLngs when constructing a polyline, though simple arrays are converted to MVCArrays within the polyline upon instantiation.
   * 
   * @return An instance of Polyline
   */
  public static native Polyline newInstance() /*-{
    return new $wnd.Polyline();
  }-*/;

  /**
   * Create a polyline using the passed Polyline options, which specify both the path of the polyline and the stroke style to use when drawing the polyline. You may pass either an array of LatLngs or an MVCArray of LatLngs when constructing a polyline, though simple arrays are converted to MVCArrays within the polyline upon instantiation.
   * 
   * @param opts
   * @return An instance of Polyline
   * 
   * TODO: Missing comments for parameter opts.
   */
  public static native Polyline newInstance(PolylineOptions opts) /*-{
    return new $wnd.Polyline(
      opts
    );
  }-*/;

  protected Polyline() { }

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
  public final native void setOptions(PolylineOptions options) /*-{
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

}