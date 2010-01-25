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
 * Identifiers for common MapTypes.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MapTypeId">JavaScript reference page.</a>}
 */
public class MapTypeId extends JavaScriptObject {

  /**
   * This map type displays a transparent layer of major streets on satellite images.
   */
  public static final String HYBRID = getConstant("HYBRID");

  /**
   * This map type displays a normal street map.
   */
  public static final String ROADMAP = getConstant("ROADMAP");

  /**
   * This map type displays satellite images.
   */
  public static final String SATELLITE = getConstant("SATELLITE");

  /**
   * This map type displays maps with physical features such as terrain and vegetation.
   */
  public static final String TERRAIN = getConstant("TERRAIN");

  /**
   * Instantiates a MapTypeId object.
   * 
   * @return An instance of MapTypeId.
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native MapTypeId newInstance() /*-{
    return new $wnd.MapTypeId();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.MapTypeId[name];
  }-*/;

  protected MapTypeId() { }

}