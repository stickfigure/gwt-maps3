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
 * The status returned by the DirectionsService on the completion of a call to route().
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsStatus">JavaScript reference page.</a>}
 */
public class DirectionsStatus extends JavaScriptObject {

  /**
   * The DirectionsRequest provided was invalid.
   */
  public static final String INVALID_REQUEST = getConstant("INVALID_REQUEST");

  /**
   * Too many DirectionsWaypoints were provided in the DirectionsRequest. The total allowed waypoints is 23, plus the origin, and destination.
   */
  public static final String MAX_WAYPOINTS_EXCEEDED = getConstant("MAX_WAYPOINTS_EXCEEDED");

  /**
   * At least one of the origin, destination, or waypoints could not be geocoded.
   */
  public static final String NOT_FOUND = getConstant("NOT_FOUND");

  /**
   * The response contains a valid DirectionsResult.
   */
  public static final String OK = getConstant("OK");

  /**
   * The webpage has gone over the requests limit in too short a period of time.
   */
  public static final String OVER_QUERY_LIMIT = getConstant("OVER_QUERY_LIMIT");

  /**
   * The webpage is not allowed to use the directions service.
   */
  public static final String REQUEST_DENIED = getConstant("REQUEST_DENIED");

  /**
   * A directions request could not be processed due to a server error. The request may succeed if you try again.
   */
  public static final String UNKNOWN_ERROR = getConstant("UNKNOWN_ERROR");

  /**
   * No route could be found between the origin and destination.
   */
  public static final String ZERO_RESULTS = getConstant("ZERO_RESULTS");

  /**
   * Instantiates a DirectionsStatus object.
   * 
   * @return An instance of DirectionsStatus.
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native DirectionsStatus newInstance() /*-{
    return new $wnd.DirectionsStatus();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.DirectionsStatus[name];
  }-*/;

  protected DirectionsStatus() { }

}