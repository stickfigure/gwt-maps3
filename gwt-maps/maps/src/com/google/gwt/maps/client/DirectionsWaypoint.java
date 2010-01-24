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
 * A DirectionsWaypoint represents a location between origin and destination through which the trip should be routed.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsWaypoint">JavaScript reference page.</a>}
 */
public class DirectionsWaypoint extends JavaScriptObject {

  /**
   * Instantiates a DirectionsWaypoint object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native DirectionsWaypoint newInstance() /*-{
    return new $wnd.DirectionsWaypoint();
  }-*/;

  protected DirectionsWaypoint() { }

  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getLocation() /*-{
    return this.location;
  }-*/;

  /**
   * If true, indicates that this waypoint is a stop between the origin and destination. This has the effect of splitting the route into two. This value is true by default. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getStopover() /*-{
    return this.stopover;
  }-*/;

  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   * 
   * @param location
   * 
   * TODO: Missing comments for parameter location.
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;

  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   * 
   * @param location
   * 
   * TODO: Missing comments for parameter location.
   */
  public final native void setLocation(String location) /*-{
    this.setLocation(
      location
    );
  }-*/;

  /**
   * If true, indicates that this waypoint is a stop between the origin and destination. This has the effect of splitting the route into two. This value is true by default. Optional.
   * 
   * @param stopover
   * 
   * TODO: Missing comments for parameter stopover.
   */
  public final native void setStopover(boolean stopover) /*-{
    this.stopover = stopover;
  }-*/;

}