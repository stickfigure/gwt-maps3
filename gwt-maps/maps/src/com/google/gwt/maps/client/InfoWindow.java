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

import com.google.gwt.dom.client.Element;

/**
 * An overlay that looks like a bubble and is often connected to a marker. This class extends MVCObject.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#InfoWindow">JavaScript reference page.</a>}
 */
public class InfoWindow extends MVCObject {

  /**
   * Creates an info window with the given options. An InfoWindow can be placed on a map at a particular position or above a marker, depending on what is specified in the options. Unless auto-pan is disabled, an InfoWindow will pan the map to make itself visible when it is opened. After constructing an InfoWindow, you must call open to display it on the map. The user can click the close button on the InfoWindow to remove it from the map, or the developer can call close() for the same effect.
   * 
   * @return An instance of InfoWindow
   */
  public static native InfoWindow newInstance() /*-{
    return new $wnd.InfoWindow();
  }-*/;

  /**
   * Creates an info window with the given options. An InfoWindow can be placed on a map at a particular position or above a marker, depending on what is specified in the options. Unless auto-pan is disabled, an InfoWindow will pan the map to make itself visible when it is opened. After constructing an InfoWindow, you must call open to display it on the map. The user can click the close button on the InfoWindow to remove it from the map, or the developer can call close() for the same effect.
   * 
   * @param opts
   * @return An instance of InfoWindow
   * 
   * TODO: Missing comments for parameter opts.
   */
  public static native InfoWindow newInstance(InfoWindowOptions opts) /*-{
    return new $wnd.InfoWindow(
      opts
    );
  }-*/;

  protected InfoWindow() { }

  /**
   * Closes this InfoWindow by removing it from the DOM structure.
   */
  public final native void close() /*-{
    this.close();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native LatLng getPosition() /*-{
    return this.getPosition();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getZIndex() /*-{
    return this.getZIndex();
  }-*/;

  /**
   * Opens this InfoWindow on the given map. Optionally, an InfoWindow can be associated with an anchor. In the core API, the only anchor is the Marker class. However, an anchor can be any MVCObject that exposes the position property and optionally pixelBounds for calculating the pixelOffset (see InfoWindowOptions).
   * 
   * @param map
   * 
   * TODO: Missing comments for parameter map.
   * TODO: JSNI implementation contains the "undefined" keyword.
   */
  public final native void open(Map map) /*-{
    this.open(
      map,
      undefined
    );
  }-*/;

  /**
   * Opens this InfoWindow on the given map. Optionally, an InfoWindow can be associated with an anchor. In the core API, the only anchor is the Marker class. However, an anchor can be any MVCObject that exposes the position property and optionally pixelBounds for calculating the pixelOffset (see InfoWindowOptions).
   * 
   * @param map
   * @param anchor
   * 
   * TODO: Missing comments for parameter map.
   * TODO: Missing comments for parameter anchor.
   */
  public final native void open(Map map, MVCObject anchor) /*-{
    this.open(
      map,
      anchor
    );
  }-*/;

  /**
   * @param content
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter content.
   */
  public final native void setContent(Element content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * @param content
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter content.
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * @param options
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter options.
   */
  public final native void setOptions(InfoWindowOptions options) /*-{
    this.setOptions(
      options
    );
  }-*/;

  /**
   * @param position
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter position.
   */
  public final native void setPosition(LatLng position) /*-{
    this.setPosition(
      position
    );
  }-*/;

  /**
   * @param zIndex
   * 
   * TODO: Missing method comments.
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter zIndex.
   */
  public final native void setZIndex(double zIndex) /*-{
    this.setZIndex(
      zIndex
    );
  }-*/;

}