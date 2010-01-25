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
 * Identifiers for common types of navigation controls.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#NavigationControlStyle">JavaScript reference page.</a>}
 */
public class NavigationControlStyle extends JavaScriptObject {

  /**
   * The small zoom control similar to the one used by the native Maps application on Android.
   */
  public static final String ANDROID = getConstant("ANDROID");

  /**
   * The default navigation control. The control which DEFAULT maps to will vary according to map size and other factors. It may change in future versions of the API.
   */
  public static final String DEFAULT = getConstant("DEFAULT");

  /**
   * The small, zoom only control.
   */
  public static final String SMALL = getConstant("SMALL");

  /**
   * The larger control, with the zoom slider and pan directional pad.
   */
  public static final String ZOOM_PAN = getConstant("ZOOM_PAN");

  /**
   * Instantiates a NavigationControlStyle object.
   * 
   * @return An instance of NavigationControlStyle.
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native NavigationControlStyle newInstance() /*-{
    return new $wnd.NavigationControlStyle();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.NavigationControlStyle[name];
  }-*/;

  protected NavigationControlStyle() { }

}