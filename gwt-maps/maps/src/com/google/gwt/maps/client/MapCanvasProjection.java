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
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MapCanvasProjection">JavaScript reference page.</a>}
 */
public class MapCanvasProjection extends JavaScriptObject {

  /**
   * Instantiates a MapCanvasProjection object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native MapCanvasProjection newInstance() /*-{
    return new $wnd.MapCanvasProjection();
  }-*/;

  protected MapCanvasProjection() { }

  /**
   * Computes the geographical coordinates from pixel coordinates in the map's container.
   * 
   * @param pixel
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter pixel.
   */
  public final native LatLng fromContainerPixelToLatLng(Point pixel) /*-{
    return this.fromContainerPixelToLatLng(
      pixel
    );
  }-*/;

  /**
   * Computes the geographical coordinates from pixel coordinates in the div that holds the draggable map.
   * 
   * @param pixel
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter pixel.
   */
  public final native LatLng fromDivPixelToLatLng(Point pixel) /*-{
    return this.fromDivPixelToLatLng(
      pixel
    );
  }-*/;

  /**
   * Computes the pixel coordinates of the given geographical location in the DOM element the map's outer container.
   * 
   * @param latLng
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter latLng.
   */
  public final native Point fromLatLngToContainerPixel(LatLng latLng) /*-{
    return this.fromLatLngToContainerPixel(
      latLng
    );
  }-*/;

  /**
   * Computes the pixel coordinates of the given geographical location in the DOM element that holds the draggable map.
   * 
   * @param latLng
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter latLng.
   */
  public final native Point fromLatLngToDivPixel(LatLng latLng) /*-{
    return this.fromLatLngToDivPixel(
      latLng
    );
  }-*/;

  /**
   * The width of the world in pixels in the current zoom level.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getWorldWidth() /*-{
    return this.getWorldWidth();
  }-*/;

}