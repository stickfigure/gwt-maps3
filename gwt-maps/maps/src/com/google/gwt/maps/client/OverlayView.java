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
 * You can implement this class if you want to display custom types of overlay objects on the map. This class extends MVCObject.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#OverlayView">JavaScript reference page.</a>}
 */
public class OverlayView extends MVCObject {

  /**
   * You should inherit from this class by setting your overlay's prototype to new OverlayView.prototype. You must implement three methods: onAdd(), draw(), and onRemove(). In the add() method, you should create DOM objects and append them as children of the panes. In the draw() method, you should position these elements. In the onRemove() method, you should remove the objects from the DOM. You must call setMap() with a valid Map object to trigger the call to the onAdd() method and setMap(null) in order to trigger the onRemove() method. The setMap() method can be called at the time of construction or at any point afterward when the overlay should be re-shown after removing. The draw() method will then be called whenever a map property changes that could change the position of the element, such as zoom, center, or map type.
   * 
   * @return An instance of OverlayView.
   */
  public static native OverlayView newInstance() /*-{
    return new $wnd.OverlayView();
  }-*/;

  protected OverlayView() { }

  /**
   * Implement this method to draw or update the overlay. This method is called after onAdd() and when the position from projection.fromLatLngToPixel() would return a new value for a given LatLng. This can happen on change of zoom, center, or map type. It is not necessarily called on drag or resize.
   */
  public final native void draw() /*-{
    this.draw();
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
   * Returns the panes in which this OverlayView can be rendered. Only available after draw has been called.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native MapPanes getPanes() /*-{
    return this.getPanes();
  }-*/;

  /**
   * Returns the MapCanvasProjection object associated with this OverlayView. Only available after draw has been called.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native MapCanvasProjection getProjection() /*-{
    return this.getProjection();
  }-*/;

  /**
   * Implement this method to initialize the overlay DOM elements. This method is called once after setMap() is called with a valid map. At this point, panes and projection will have been initialized.
   */
  public final native void onAdd() /*-{
    this.onAdd();
  }-*/;

  /**
   * Implement this method to remove your elements from the DOM. This method is called once following a call to setMap(null).
   */
  public final native void onRemove() /*-{
    this.onRemove();
  }-*/;

  /**
   * Adds the overlay to the map.
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

}