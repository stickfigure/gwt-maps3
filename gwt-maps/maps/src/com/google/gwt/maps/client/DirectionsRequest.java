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
 * The specification for a directions query to be sent to the DirectionsService.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsRequest">JavaScript reference page.</a>}
 */
public class DirectionsRequest extends JavaScriptObject {

  /**
   * Instantiates a DirectionsRequest object.
   * 
   * @return An instance of DirectionsRequest.
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native DirectionsRequest newInstance() /*-{
    return new $wnd.DirectionsRequest();
  }-*/;

  protected DirectionsRequest() { }

  /**
   * Location of destination. This can be specified as either a string to be geocoded or a LatLng. Required.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getDestination() /*-{
    return this.destination;
  }-*/;

  /**
   * Location of origin. This can be specified as either a string to be geocoded or a LatLng. Required.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getOrigin() /*-{
    return this.origin;
  }-*/;

  /**
   * Whether or not trip alternatives should be provided. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getProvideTripAlternatives() /*-{
    return this.provideTripAlternatives;
  }-*/;

  /**
   * Region code used as a bias for geocoding requests. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getRegion() /*-{
    return this.region;
  }-*/;

  /**
   * Type of routing requested. Required.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsTravelMode getTravelMode() /*-{
    return this.travelMode;
  }-*/;

  /**
   * Preferred unit system to use when displaying distance. Defaults to the unit system used in the country of origin.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsUnitSystem getUnitSystem() /*-{
    return this.unitSystem;
  }-*/;

  /**
   * Array of intermediate waypoints. Directions will be calculated from the origin to the destination by way of each waypoint in this array. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsWaypoint[] getWaypoints() /*-{
    return @com.google.gwt.maps.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.waypoints);
  }-*/;

  /**
   * Location of destination. This can be specified as either a string to be geocoded or a LatLng. Required.
   * 
   * @param destination
   * 
   * TODO: Missing comments for parameter destination.
   */
  public final native void setDestination(LatLng destination) /*-{
    this.destination = destination;
  }-*/;

  /**
   * Location of destination. This can be specified as either a string to be geocoded or a LatLng. Required.
   * 
   * @param destination
   * 
   * TODO: Missing comments for parameter destination.
   */
  public final native void setDestination(String destination) /*-{
    this.setDestination(
      destination
    );
  }-*/;

  /**
   * Location of origin. This can be specified as either a string to be geocoded or a LatLng. Required.
   * 
   * @param origin
   * 
   * TODO: Missing comments for parameter origin.
   */
  public final native void setOrigin(LatLng origin) /*-{
    this.origin = origin;
  }-*/;

  /**
   * Location of origin. This can be specified as either a string to be geocoded or a LatLng. Required.
   * 
   * @param origin
   * 
   * TODO: Missing comments for parameter origin.
   */
  public final native void setOrigin(String origin) /*-{
    this.setOrigin(
      origin
    );
  }-*/;

  /**
   * Whether or not trip alternatives should be provided. Optional.
   * 
   * @param provideTripAlternatives
   * 
   * TODO: Missing comments for parameter provideTripAlternatives.
   */
  public final native void setProvideTripAlternatives(boolean provideTripAlternatives) /*-{
    this.provideTripAlternatives = provideTripAlternatives;
  }-*/;

  /**
   * Region code used as a bias for geocoding requests. Optional.
   * 
   * @param region
   * 
   * TODO: Missing comments for parameter region.
   */
  public final native void setRegion(String region) /*-{
    this.region = region;
  }-*/;

  /**
   * Type of routing requested. Required.
   * 
   * @param travelMode
   * 
   * TODO: Missing comments for parameter travelMode.
   */
  public final native void setTravelMode(DirectionsTravelMode travelMode) /*-{
    this.travelMode = travelMode;
  }-*/;

  /**
   * Preferred unit system to use when displaying distance. Defaults to the unit system used in the country of origin.
   * 
   * @param unitSystem
   * 
   * TODO: Missing comments for parameter unitSystem.
   */
  public final native void setUnitSystem(DirectionsUnitSystem unitSystem) /*-{
    this.unitSystem = unitSystem;
  }-*/;

  /**
   * Array of intermediate waypoints. Directions will be calculated from the origin to the destination by way of each waypoint in this array. Optional.
   * 
   * @param waypoints
   * 
   * TODO: Missing comments for parameter waypoints.
   */
  public final native void setWaypoints(DirectionsWaypoint[] waypoints) /*-{
    this.waypoints = @com.google.gwt.maps.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(waypoints);
  }-*/;

}