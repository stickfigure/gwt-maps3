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
 * This class extends MVCObject.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#Marker">JavaScript reference page.</a>}
 */
public class Marker extends MVCObject {

  /**
   * Creates a marker with the options specified. If a map is specified, the marker is added to the map upon construction. Note that the position must be set for the marker to display.
   * 
   * @return An instance of Marker
   */
  public static native Marker newInstance() /*-{
    return new $wnd.Marker();
  }-*/;

  /**
   * Creates a marker with the options specified. If a map is specified, the marker is added to the map upon construction. Note that the position must be set for the marker to display.
   * 
   * @param opts
   * @return An instance of Marker
   * 
   * TODO: Missing comments for parameter opts.
   */
  public static native Marker newInstance(MarkerOptions opts) /*-{
    return new $wnd.Marker(
      opts
    );
  }-*/;

  protected Marker() { }

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native boolean getClickable() /*-{
    return this.getClickable();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native String getCursor() /*-{
    return this.getCursor();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native boolean getDraggable() /*-{
    return this.getDraggable();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native boolean getFlat() /*-{
    return this.getFlat();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native String getIcon() /*-{
    return this.getIcon();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native Map getMap() /*-{
    return this.getMap();
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
   */
  public final native String getShadow() /*-{
    return this.getShadow();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native JavaScriptObject getShape() /*-{
    return this.getShape();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native String getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native boolean getVisible() /*-{
    return this.getVisible();
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
   * @param flag
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter flag.
   */
  public final native void setClickable(boolean flag) /*-{
    this.setClickable(
      flag
    );
  }-*/;

  /**
   * @param cursor
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter cursor.
   */
  public final native void setCursor(String cursor) /*-{
    this.setCursor(
      cursor
    );
  }-*/;

  /**
   * @param flag
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter flag.
   */
  public final native void setDraggable(boolean flag) /*-{
    this.setDraggable(
      flag
    );
  }-*/;

  /**
   * @param flag
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter flag.
   */
  public final native void setFlat(boolean flag) /*-{
    this.setFlat(
      flag
    );
  }-*/;

  /**
   * @param icon
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter icon.
   */
  public final native void setIcon(MarkerImage icon) /*-{
    this.setIcon(
      icon
    );
  }-*/;

  /**
   * @param icon
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter icon.
   */
  public final native void setIcon(String icon) /*-{
    this.setIcon(
      icon
    );
  }-*/;

  /**
   * Renders the marker on the specified map. If map is set to null, the marker will be removed.
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
  public final native void setOptions(MarkerOptions options) /*-{
    this.setOptions(
      options
    );
  }-*/;

  /**
   * @param latlng
   * 
   * TODO: Missing comments for parameter latlng.
   * TODO: Missing method comments.
   */
  public final native void setPosition(LatLng latlng) /*-{
    this.setPosition(
      latlng
    );
  }-*/;

  /**
   * @param shadow
   * 
   * TODO: Missing comments for parameter shadow.
   * TODO: Missing method comments.
   */
  public final native void setShadow(MarkerImage shadow) /*-{
    this.setShadow(
      shadow
    );
  }-*/;

  /**
   * @param shadow
   * 
   * TODO: Missing comments for parameter shadow.
   * TODO: Missing method comments.
   */
  public final native void setShadow(String shadow) /*-{
    this.setShadow(
      shadow
    );
  }-*/;

  /**
   * @param shape
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter shape.
   */
  public final native void setShape(JavaScriptObject shape) /*-{
    this.setShape(
      shape
    );
  }-*/;

  /**
   * @param title
   * 
   * TODO: Missing comments for parameter title.
   * TODO: Missing method comments.
   */
  public final native void setTitle(String title) /*-{
    this.setTitle(
      title
    );
  }-*/;

  /**
   * @param visible
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter visible.
   */
  public final native void setVisible(boolean visible) /*-{
    this.setVisible(
      visible
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