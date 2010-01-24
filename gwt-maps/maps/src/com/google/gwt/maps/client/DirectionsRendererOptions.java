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
import com.google.gwt.dom.client.Element;

/**
 * This object defines the properties that can be set on a DirectionsRenderer object.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsRendererOptions">JavaScript reference page.</a>}
 */
public class DirectionsRendererOptions extends JavaScriptObject {

  /**
   * Instantiates a DirectionsRendererOptions object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native DirectionsRendererOptions newInstance() /*-{
    return new $wnd.DirectionsRendererOptions();
  }-*/;

  protected DirectionsRendererOptions() { }

  /**
   * The directions to display on the map and/or in a <div> panel, retrieved as a DirectionsResult object from DirectionsService.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsResult getDirections() /*-{
    return this.directions;
  }-*/;

  /**
   * This property indicates whether the renderer should provide UI to select amongst alternative trips. By default, this flag is false and a user-selectable list of trips will be shown in the directions' associated panel. To hide that list, set hideTripList to true.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getHideTripList() /*-{
    return this.hideTripList;
  }-*/;

  /**
   * Map on which to display the directions.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Map getMap() /*-{
    return this.map;
  }-*/;

  /**
   * The <div> in which to display the directions steps.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Element getPanel() /*-{
    return this.panel;
  }-*/;

  /**
   * By default, the input map is centered and zoomed to the bounding box of this set of directions. If this option is set to true, the viewport is left unchanged, unless the map's center and zoom were never set.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getPreserveViewport() /*-{
    return this.preserveViewport;
  }-*/;

  /**
   * The index of the trip within the DirectionsResult object. The default value is 0.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getTripIndex() /*-{
    return this.tripIndex;
  }-*/;

  /**
   * The directions to display on the map and/or in a <div> panel, retrieved as a DirectionsResult object from DirectionsService.
   * 
   * @param directions
   * 
   * TODO: Missing comments for parameter directions.
   */
  public final native void setDirections(DirectionsResult directions) /*-{
    this.directions = directions;
  }-*/;

  /**
   * This property indicates whether the renderer should provide UI to select amongst alternative trips. By default, this flag is false and a user-selectable list of trips will be shown in the directions' associated panel. To hide that list, set hideTripList to true.
   * 
   * @param hideTripList
   * 
   * TODO: Missing comments for parameter hideTripList.
   */
  public final native void setHideTripList(boolean hideTripList) /*-{
    this.hideTripList = hideTripList;
  }-*/;

  /**
   * Map on which to display the directions.
   * 
   * @param map
   * 
   * TODO: Missing comments for parameter map.
   */
  public final native void setMap(Map map) /*-{
    this.map = map;
  }-*/;

  /**
   * The <div> in which to display the directions steps.
   * 
   * @param panel
   * 
   * TODO: Missing comments for parameter panel.
   */
  public final native void setPanel(Element panel) /*-{
    this.panel = panel;
  }-*/;

  /**
   * By default, the input map is centered and zoomed to the bounding box of this set of directions. If this option is set to true, the viewport is left unchanged, unless the map's center and zoom were never set.
   * 
   * @param preserveViewport
   * 
   * TODO: Missing comments for parameter preserveViewport.
   */
  public final native void setPreserveViewport(boolean preserveViewport) /*-{
    this.preserveViewport = preserveViewport;
  }-*/;

  /**
   * The index of the trip within the DirectionsResult object. The default value is 0.
   * 
   * @param tripIndex
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter tripIndex.
   */
  public final native void setTripIndex(double tripIndex) /*-{
    this.tripIndex = tripIndex;
  }-*/;

}