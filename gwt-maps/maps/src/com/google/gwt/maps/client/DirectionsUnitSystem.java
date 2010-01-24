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
 * The valid unit systems that can be specified in a DirectionsRequest.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsUnitSystem">JavaScript reference page.</a>}
 */
public class DirectionsUnitSystem extends JavaScriptObject {

  /**
   * Specifies that distances in the DirectionsResult should be expressed in imperial units.
   */
  public static final String IMPERIAL = getConstant("IMPERIAL");

  /**
   * Specifies that distances in the DirectionsResult should be expressed in metric units.
   */
  public static final String METRIC = getConstant("METRIC");

  /**
   * Instantiates a DirectionsUnitSystem object.
   * 
   * @return An instance of null
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native DirectionsUnitSystem newInstance() /*-{
    return new $wnd.DirectionsUnitSystem();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.DirectionsUnitSystem[name];
  }-*/;

  protected DirectionsUnitSystem() { }

}