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

package com.googlecode.maps3.client.auto;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The status returned by the Geocoder on the completion of a call to geocode().
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#GeocoderStatus">JavaScript reference page.</a>}
 */
public class GeocoderStatus extends JavaScriptObject {

  /**
   * There was a problem contacting the Google servers.
   */
  public static final String ERROR = getConstant("ERROR");

  /**
   * This GeocoderRequest was invalid.
   */
  public static final String INVALID_REQUEST = getConstant("INVALID_REQUEST");

  /**
   * The response contains a valid GeocoderResponse.
   */
  public static final String OK = getConstant("OK");

  /**
   * The webpage has gone over the requests limit in too short a period of time.
   */
  public static final String OVER_QUERY_LIMIT = getConstant("OVER_QUERY_LIMIT");

  /**
   * The webpage is not allowed to use the geocoder.
   */
  public static final String REQUEST_DENIED = getConstant("REQUEST_DENIED");

  /**
   * A geocoding request could not be processed due to a server error. The request may succeed if you try again.
   */
  public static final String UNKNOWN_ERROR = getConstant("UNKNOWN_ERROR");

  /**
   * No result was found for this GeocoderRequest.
   */
  public static final String ZERO_RESULTS = getConstant("ZERO_RESULTS");

  /**
   * Instantiates a GeocoderStatus object.
   * 
   * @return An instance of GeocoderStatus.
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native GeocoderStatus newInstance() /*-{
    return new $wnd.google.maps.GeocoderStatus();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.maps.GeocoderStatus[name];
  }-*/;

  protected GeocoderStatus() { }

}