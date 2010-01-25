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
 * Describes the type of location returned from a geocode.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#GeocoderLocationType">JavaScript reference page.</a>}
 */
public class GeocoderLocationType extends JavaScriptObject {

  /**
   * The returned result is approximate.
   */
  public static final String APPROXIMATE = getConstant("APPROXIMATE");

  /**
   * The returned result is the geometric center of a result such a line (e.g. street) or polygon (region).
   */
  public static final String GEOMETRIC_CENTER = getConstant("GEOMETRIC_CENTER");

  /**
   * The returned result reflects an approximation (usually on a road) interpolated between two precise points (such as intersections). Interpolated results are generally returned when rooftop geocodes are unavilable for a street address.
   */
  public static final String RANGE_INTERPOLATED = getConstant("RANGE_INTERPOLATED");

  /**
   * The returned result reflects a precise geocode.
   */
  public static final String ROOFTOP = getConstant("ROOFTOP");

  /**
   * Instantiates a GeocoderLocationType object.
   * 
   * @return An instance of GeocoderLocationType.
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native GeocoderLocationType newInstance() /*-{
    return new $wnd.GeocoderLocationType();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.GeocoderLocationType[name];
  }-*/;

  protected GeocoderLocationType() { }

}