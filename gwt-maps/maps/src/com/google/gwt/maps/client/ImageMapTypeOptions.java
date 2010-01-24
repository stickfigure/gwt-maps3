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
 * This class is used to create a MapType that renders image tiles.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#ImageMapTypeOptions">JavaScript reference page.</a>}
 */
public class ImageMapTypeOptions extends JavaScriptObject {

  /**
   * Instantiates a ImageMapTypeOptions object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native ImageMapTypeOptions newInstance() /*-{
    return new $wnd.ImageMapTypeOptions();
  }-*/;

  protected ImageMapTypeOptions() { }

  /**
   * Alt text to display when this MapType's button is hovered over in the MapTypeControl.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getAlt() /*-{
    return this.alt;
  }-*/;

  /**
   * Returns a string (URL) for given tile coordinate (x, y) and zoom level. This function should have a signature of: getTileUrl(Point, number):string
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Function(Point, number):string getGetTileUrl() /*-{
    return this.getTileUrl;
  }-*/;

  /**
   * Is the image a PNG? This is needed by some old browsers.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getIsPng() /*-{
    return this.isPng;
  }-*/;

  /**
   * The maximum zoom level for the map when displaying this MapType.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getMaxZoom() /*-{
    return this.maxZoom;
  }-*/;

  /**
   * The minimum zoom level for the map when displaying this MapType. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getMinZoom() /*-{
    return this.minZoom;
  }-*/;

  /**
   * Name to display in the MapTypeControl.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * The tile size.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Size getTileSize() /*-{
    return this.tileSize;
  }-*/;

  /**
   * Alt text to display when this MapType's button is hovered over in the MapTypeControl.
   * 
   * @param alt
   * 
   * TODO: Missing comments for parameter alt.
   */
  public final native void setAlt(String alt) /*-{
    this.alt = alt;
  }-*/;

  /**
   * Returns a string (URL) for given tile coordinate (x, y) and zoom level. This function should have a signature of: getTileUrl(Point, number):string
   * 
   * @param getTileUrl
   * 
   * TODO: Missing comments for parameter getTileUrl.
   */
  public final native void setGetTileUrl(Function(Point, number):string getTileUrl) /*-{
    this.getTileUrl = getTileUrl;
  }-*/;

  /**
   * Is the image a PNG? This is needed by some old browsers.
   * 
   * @param isPng
   * 
   * TODO: Missing comments for parameter isPng.
   */
  public final native void setIsPng(boolean isPng) /*-{
    this.isPng = isPng;
  }-*/;

  /**
   * The maximum zoom level for the map when displaying this MapType.
   * 
   * @param maxZoom
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter maxZoom.
   */
  public final native void setMaxZoom(double maxZoom) /*-{
    this.maxZoom = maxZoom;
  }-*/;

  /**
   * The minimum zoom level for the map when displaying this MapType. Optional.
   * 
   * @param minZoom
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter minZoom.
   */
  public final native void setMinZoom(double minZoom) /*-{
    this.minZoom = minZoom;
  }-*/;

  /**
   * Name to display in the MapTypeControl.
   * 
   * @param name
   * 
   * TODO: Missing comments for parameter name.
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * The tile size.
   * 
   * @param tileSize
   * 
   * TODO: Missing comments for parameter tileSize.
   */
  public final native void setTileSize(Size tileSize) /*-{
    this.tileSize = tileSize;
  }-*/;

}