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
 * A single route consisting of a set of steps in JSON format in a DirectionsResult. Some fields in the route may not be returned for all requests.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsRoute">JavaScript reference page.</a>}
 */
public class DirectionsRoute extends JavaScriptObject {

  /**
   * Instantiates a DirectionsRoute object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native DirectionsRoute newInstance() /*-{
    return new $wnd.DirectionsRoute();
  }-*/;

  protected DirectionsRoute() { }

  /**
   * The total distance covered by this route. This property may be undefined as the distance may be unknown.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsDistance getDistance() /*-{
    return this.distance;
  }-*/;

  /**
   * The total duration of this route. This property may be undefined as the duration may be unknown.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsDuration getDuration() /*-{
    return this.duration;
  }-*/;

  /**
   * The DirectionsService calculates directions between locations by using the nearest transportation option (usually a road) at the start and end points. end_geocode indicates the actual geocoded destination, which may be different than the last step if, for example, the road is not near the destination.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native GeocoderResponse getEnd_geocode() /*-{
    return this.end_geocode;
  }-*/;

  /**
   * The DirectionsService calculates directions between locations by using the nearest transportation option (usually a road) at the start and end points. start_geocode indicates the actual geocoded origin, which may be different than the first step if, for example, the road is not near the origin.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native GeocoderResponse getStart_geocode() /*-{
    return this.start_geocode;
  }-*/;

  /**
   * An array of DirectionsSteps, each of which contains information about the individual steps in this route.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsStep[] getSteps() /*-{
    return this.steps;
  }-*/;

  /**
   * The total distance covered by this route. This property may be undefined as the distance may be unknown.
   * 
   * @param distance
   * 
   * TODO: Missing comments for parameter distance.
   */
  public final native void setDistance(DirectionsDistance distance) /*-{
    this.distance = distance;
  }-*/;

  /**
   * The total duration of this route. This property may be undefined as the duration may be unknown.
   * 
   * @param duration
   * 
   * TODO: Missing comments for parameter duration.
   */
  public final native void setDuration(DirectionsDuration duration) /*-{
    this.duration = duration;
  }-*/;

  /**
   * The DirectionsService calculates directions between locations by using the nearest transportation option (usually a road) at the start and end points. end_geocode indicates the actual geocoded destination, which may be different than the last step if, for example, the road is not near the destination.
   * 
   * @param end_geocode
   * 
   * TODO: Missing comments for parameter end_geocode.
   */
  public final native void setEnd_geocode(GeocoderResponse end_geocode) /*-{
    this.end_geocode = end_geocode;
  }-*/;

  /**
   * The DirectionsService calculates directions between locations by using the nearest transportation option (usually a road) at the start and end points. start_geocode indicates the actual geocoded origin, which may be different than the first step if, for example, the road is not near the origin.
   * 
   * @param start_geocode
   * 
   * TODO: Missing comments for parameter start_geocode.
   */
  public final native void setStart_geocode(GeocoderResponse start_geocode) /*-{
    this.start_geocode = start_geocode;
  }-*/;

  /**
   * An array of DirectionsSteps, each of which contains information about the individual steps in this route.
   * 
   * @param steps
   * 
   * TODO: Missing comments for parameter steps.
   */
  public final native void setSteps(DirectionsStep[] steps) /*-{
    this.steps = steps;
  }-*/;

}