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
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MarkerOptions">JavaScript reference page.</a>}
 */
public class MarkerOptions extends JavaScriptObject {

  /**
   * Instantiates a MarkerOptions object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native MarkerOptions newInstance() /*-{
    return new $wnd.MarkerOptions();
  }-*/;

  protected MarkerOptions() { }

  /**
   * If true, the marker can be clicked
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getClickable() /*-{
    return this.getClickable();
  }-*/;

  /**
   * Mouse cursor to show on hover
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getCursor() /*-{
    return this.getCursor();
  }-*/;

  /**
   * If true, the marker can be dragged.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getDraggable() /*-{
    return this.getDraggable();
  }-*/;

  /**
   * If true, the marker shadow will not be displayed.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getFlat() /*-{
    return this.getFlat();
  }-*/;

  /**
   * Icon for the foreground
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native  getIcon() /*-{
    return this.getIcon();
  }-*/;

  /**
   * Map on which to display Marker.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Map getMap() /*-{
    return this.getMap();
  }-*/;

  /**
   * Marker position. Required.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getPosition() /*-{
    return this.getPosition();
  }-*/;

  /**
   * Shadow image
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native  getShadow() /*-{
    return this.getShadow();
  }-*/;

  /**
   * Image map region for drag/click. Array of x/y values that define the perimeter of the icon.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native JavaScriptObject getShape() /*-{
    return this.getShape();
  }-*/;

  /**
   * Rollover text
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * If true, the marker is visible
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getVisible() /*-{
    return this.getVisible();
  }-*/;

  /**
   * All Markers are displayed on the map in order of their zIndex, with higher values displaying in front of Markers with lower values. By default, Markers are displayed according to their latitude, with Markers of lower latitudes appearing in front of Markers at higher latitudes.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getZIndex() /*-{
    return this.getZIndex();
  }-*/;

  /**
   * If true, the marker can be clicked
   * 
   * @param clickable
   * 
   * TODO: Missing comments for parameter clickable.
   */
  public final native void setClickable(boolean clickable) /*-{
    this.setClickable(
      clickable
    );
  }-*/;

  /**
   * Mouse cursor to show on hover
   * 
   * @param cursor
   * 
   * TODO: Missing comments for parameter cursor.
   */
  public final native void setCursor(String cursor) /*-{
    this.setCursor(
      cursor
    );
  }-*/;

  /**
   * If true, the marker can be dragged.
   * 
   * @param draggable
   * 
   * TODO: Missing comments for parameter draggable.
   */
  public final native void setDraggable(boolean draggable) /*-{
    this.setDraggable(
      draggable
    );
  }-*/;

  /**
   * If true, the marker shadow will not be displayed.
   * 
   * @param flat
   * 
   * TODO: Missing comments for parameter flat.
   */
  public final native void setFlat(boolean flat) /*-{
    this.setFlat(
      flat
    );
  }-*/;

  /**
   * Icon for the foreground
   * 
   * @param icon
   * 
   * TODO: Missing comments for parameter icon.
   */
  public final native void setIcon(icon) /*-{
    this.setIcon(
      icon
    );
  }-*/;

  /**
   * Map on which to display Marker.
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
   * Marker position. Required.
   * 
   * @param position
   * 
   * TODO: Missing comments for parameter position.
   */
  public final native void setPosition(LatLng position) /*-{
    this.setPosition(
      position
    );
  }-*/;

  /**
   * Shadow image
   * 
   * @param shadow
   * 
   * TODO: Missing comments for parameter shadow.
   */
  public final native void setShadow(shadow) /*-{
    this.setShadow(
      shadow
    );
  }-*/;

  /**
   * Image map region for drag/click. Array of x/y values that define the perimeter of the icon.
   * 
   * @param shape
   * 
   * TODO: Missing comments for parameter shape.
   */
  public final native void setShape(JavaScriptObject shape) /*-{
    this.setShape(
      shape
    );
  }-*/;

  /**
   * Rollover text
   * 
   * @param title
   * 
   * TODO: Missing comments for parameter title.
   */
  public final native void setTitle(String title) /*-{
    this.setTitle(
      title
    );
  }-*/;

  /**
   * If true, the marker is visible
   * 
   * @param visible
   * 
   * TODO: Missing comments for parameter visible.
   */
  public final native void setVisible(boolean visible) /*-{
    this.setVisible(
      visible
    );
  }-*/;

  /**
   * All Markers are displayed on the map in order of their zIndex, with higher values displaying in front of Markers with lower values. By default, Markers are displayed according to their latitude, with Markers of lower latitudes appearing in front of Markers at higher latitudes.
   * 
   * @param zIndex
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter zIndex.
   */
  public final native void setZIndex(double zIndex) /*-{
    this.setZIndex(
      zIndex
    );
  }-*/;

}