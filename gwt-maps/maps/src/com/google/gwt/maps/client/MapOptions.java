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
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MapOptions">JavaScript reference page.</a>}
 */
public class MapOptions extends JavaScriptObject {

  /**
   * Instantiates a MapOptions object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native MapOptions newInstance() /*-{
    return new $wnd.MapOptions();
  }-*/;

  protected MapOptions() { }

  /**
   * Color used for the background of the Map div. This color will be visible when tiles have not yet loaded as the user pans. This option can only be set when the map is initialized.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getBackgroundColor() /*-{
    return this.backgroundColor;
  }-*/;

  /**
   * The initial Map center. Required.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getCenter() /*-{
    return this.center;
  }-*/;

  /**
   * Enables/disables all default UI. May be overridden individually.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getDisableDefaultUI() /*-{
    return this.disableDefaultUI;
  }-*/;

  /**
   * Enables/disables zoom and center on double click. Enabled by default.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getDisableDoubleClickZoom() /*-{
    return this.disableDoubleClickZoom;
  }-*/;

  /**
   * If false, prevents the map from being dragged. Dragging is enabled by default.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getDraggable() /*-{
    return this.draggable;
  }-*/;

  /**
   * The name or url of the cursor to display on a draggable object.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getDraggableCursor() /*-{
    return this.draggableCursor;
  }-*/;

  /**
   * The name or url of the cursor to display when an object is dragging.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getDraggingCursor() /*-{
    return this.draggingCursor;
  }-*/;

  /**
   * If false, prevents the map from being controlled by the keyboard. Keyboard shortcuts are enabled by default.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getKeyboardShortcuts() /*-{
    return this.keyboardShortcuts;
  }-*/;

  /**
   * The initial enabled/disabled state of the Map type control.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getMapTypeControl() /*-{
    return this.mapTypeControl;
  }-*/;

  /**
   * The initial display options for the Map type control.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native MapTypeControlOptions getMapTypeControlOptions() /*-{
    return this.mapTypeControlOptions;
  }-*/;

  /**
   * The initial Map mapTypeId. Required.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native MapTypeId getMapTypeId() /*-{
    return this.mapTypeId;
  }-*/;

  /**
   * The initial enabled/disabled state of the navigation control.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getNavigationControl() /*-{
    return this.navigationControl;
  }-*/;

  /**
   * The initial display options for the navigation control.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native NavigationControlOptions getNavigationControlOptions() /*-{
    return this.navigationControlOptions;
  }-*/;

  /**
   * If true, do not clear the contents of the Map div.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getNoClear() /*-{
    return this.noClear;
  }-*/;

  /**
   * The initial enabled/disabled state of the scale control.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getScaleControl() /*-{
    return this.scaleControl;
  }-*/;

  /**
   * The initial display options for the scale control.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native ScaleControlOptions getScaleControlOptions() /*-{
    return this.scaleControlOptions;
  }-*/;

  /**
   * If false, disables scrollwheel zooming on the map. The scrollwheel is enabled by default.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getScrollwheel() /*-{
    return this.scrollwheel;
  }-*/;

  /**
   * The initial Map zoom level. Required.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getZoom() /*-{
    return this.zoom;
  }-*/;

  /**
   * Color used for the background of the Map div. This color will be visible when tiles have not yet loaded as the user pans. This option can only be set when the map is initialized.
   * 
   * @param backgroundColor
   * 
   * TODO: Missing comments for parameter backgroundColor.
   */
  public final native void setBackgroundColor(String backgroundColor) /*-{
    this.backgroundColor = backgroundColor;
  }-*/;

  /**
   * The initial Map center. Required.
   * 
   * @param center
   * 
   * TODO: Missing comments for parameter center.
   */
  public final native void setCenter(LatLng center) /*-{
    this.center = center;
  }-*/;

  /**
   * Enables/disables all default UI. May be overridden individually.
   * 
   * @param disableDefaultUI
   * 
   * TODO: Missing comments for parameter disableDefaultUI.
   */
  public final native void setDisableDefaultUI(boolean disableDefaultUI) /*-{
    this.disableDefaultUI = disableDefaultUI;
  }-*/;

  /**
   * Enables/disables zoom and center on double click. Enabled by default.
   * 
   * @param disableDoubleClickZoom
   * 
   * TODO: Missing comments for parameter disableDoubleClickZoom.
   */
  public final native void setDisableDoubleClickZoom(boolean disableDoubleClickZoom) /*-{
    this.disableDoubleClickZoom = disableDoubleClickZoom;
  }-*/;

  /**
   * If false, prevents the map from being dragged. Dragging is enabled by default.
   * 
   * @param draggable
   * 
   * TODO: Missing comments for parameter draggable.
   */
  public final native void setDraggable(boolean draggable) /*-{
    this.draggable = draggable;
  }-*/;

  /**
   * The name or url of the cursor to display on a draggable object.
   * 
   * @param draggableCursor
   * 
   * TODO: Missing comments for parameter draggableCursor.
   */
  public final native void setDraggableCursor(String draggableCursor) /*-{
    this.draggableCursor = draggableCursor;
  }-*/;

  /**
   * The name or url of the cursor to display when an object is dragging.
   * 
   * @param draggingCursor
   * 
   * TODO: Missing comments for parameter draggingCursor.
   */
  public final native void setDraggingCursor(String draggingCursor) /*-{
    this.draggingCursor = draggingCursor;
  }-*/;

  /**
   * If false, prevents the map from being controlled by the keyboard. Keyboard shortcuts are enabled by default.
   * 
   * @param keyboardShortcuts
   * 
   * TODO: Missing comments for parameter keyboardShortcuts.
   */
  public final native void setKeyboardShortcuts(boolean keyboardShortcuts) /*-{
    this.keyboardShortcuts = keyboardShortcuts;
  }-*/;

  /**
   * The initial enabled/disabled state of the Map type control.
   * 
   * @param mapTypeControl
   * 
   * TODO: Missing comments for parameter mapTypeControl.
   */
  public final native void setMapTypeControl(boolean mapTypeControl) /*-{
    this.mapTypeControl = mapTypeControl;
  }-*/;

  /**
   * The initial display options for the Map type control.
   * 
   * @param mapTypeControlOptions
   * 
   * TODO: Missing comments for parameter mapTypeControlOptions.
   */
  public final native void setMapTypeControlOptions(MapTypeControlOptions mapTypeControlOptions) /*-{
    this.mapTypeControlOptions = mapTypeControlOptions;
  }-*/;

  /**
   * The initial Map mapTypeId. Required.
   * 
   * @param mapTypeId
   * 
   * TODO: Missing comments for parameter mapTypeId.
   */
  public final native void setMapTypeId(MapTypeId mapTypeId) /*-{
    this.mapTypeId = mapTypeId;
  }-*/;

  /**
   * The initial enabled/disabled state of the navigation control.
   * 
   * @param navigationControl
   * 
   * TODO: Missing comments for parameter navigationControl.
   */
  public final native void setNavigationControl(boolean navigationControl) /*-{
    this.navigationControl = navigationControl;
  }-*/;

  /**
   * The initial display options for the navigation control.
   * 
   * @param navigationControlOptions
   * 
   * TODO: Missing comments for parameter navigationControlOptions.
   */
  public final native void setNavigationControlOptions(NavigationControlOptions navigationControlOptions) /*-{
    this.navigationControlOptions = navigationControlOptions;
  }-*/;

  /**
   * If true, do not clear the contents of the Map div.
   * 
   * @param noClear
   * 
   * TODO: Missing comments for parameter noClear.
   */
  public final native void setNoClear(boolean noClear) /*-{
    this.noClear = noClear;
  }-*/;

  /**
   * The initial enabled/disabled state of the scale control.
   * 
   * @param scaleControl
   * 
   * TODO: Missing comments for parameter scaleControl.
   */
  public final native void setScaleControl(boolean scaleControl) /*-{
    this.scaleControl = scaleControl;
  }-*/;

  /**
   * The initial display options for the scale control.
   * 
   * @param scaleControlOptions
   * 
   * TODO: Missing comments for parameter scaleControlOptions.
   */
  public final native void setScaleControlOptions(ScaleControlOptions scaleControlOptions) /*-{
    this.scaleControlOptions = scaleControlOptions;
  }-*/;

  /**
   * If false, disables scrollwheel zooming on the map. The scrollwheel is enabled by default.
   * 
   * @param scrollwheel
   * 
   * TODO: Missing comments for parameter scrollwheel.
   */
  public final native void setScrollwheel(boolean scrollwheel) /*-{
    this.scrollwheel = scrollwheel;
  }-*/;

  /**
   * The initial Map zoom level. Required.
   * 
   * @param zoom
   * 
   * TODO: Missing comments for parameter zoom.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native void setZoom(double zoom) /*-{
    this.zoom = zoom;
  }-*/;

}