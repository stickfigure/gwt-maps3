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
 * Renders directions retrieved in the form of a DirectionsResult object retrieved from the DirectionsService. This class extends MVCObject.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsRenderer">JavaScript reference page.</a>}
 */
public class DirectionsRenderer extends MVCObject {

  /**
   * Creates the renderer with the given options. Directions can be rendered on a map (as visual overlays) or additionally on a <div> panel (as textual instructions).
   * 
   * @return An instance of DirectionsRenderer
   */
  public static native DirectionsRenderer newInstance() /*-{
    return new $wnd.DirectionsRenderer();
  }-*/;

  /**
   * Creates the renderer with the given options. Directions can be rendered on a map (as visual overlays) or additionally on a <div> panel (as textual instructions).
   * 
   * @param opts
   * @return An instance of DirectionsRenderer
   * 
   * TODO: Missing comments for parameter opts.
   */
  public static native DirectionsRenderer newInstance(DirectionsRendererOptions opts) /*-{
    return new $wnd.DirectionsRenderer(
      opts
    );
  }-*/;

  protected DirectionsRenderer() { }

  /**
   * Returns the renderer's current set of directions.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsResult getDirections() /*-{
    return this.getDirections();
  }-*/;

  /**
   * Returns the map on which the DirectionsResult is rendered.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Map getMap() /*-{
    return this.getMap();
  }-*/;

  /**
   * Returns the panel <div> in which the DirectionsResult is rendered.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Element getPanel() /*-{
    return this.getPanel();
  }-*/;

  /**
   * Returns the current trip index in use by this DirectionsRenderer object.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getTripIndex() /*-{
    return this.getTripIndex();
  }-*/;

  /**
   * Set the renderer to use the result from the DirectionsService. Setting a valid set of directions in this manner will display the directions on the renderer's designated map and panel.
   * 
   * @param directions
   * 
   * TODO: Missing comments for parameter directions.
   */
  public final native void setDirections(DirectionsResult directions) /*-{
    this.setDirections(
      directions
    );
  }-*/;

  /**
   * This method specifies the map on which directions will be rendered. Pass null to remove the directions from the map.
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
   * This method renders the directions in a <div>. Pass null to remove the content from the panel.
   * 
   * @param panel
   * 
   * TODO: Missing comments for parameter panel.
   */
  public final native void setPanel(Element panel) /*-{
    this.setPanel(
      panel
    );
  }-*/;

  /**
   * Set the index of the trip in the DirectionsResult object to render. By default, the first trip in the array will be rendered.
   * 
   * @param tripIndex
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter tripIndex.
   */
  public final native void setTripIndex(double tripIndex) /*-{
    this.setTripIndex(
      tripIndex
    );
  }-*/;

}