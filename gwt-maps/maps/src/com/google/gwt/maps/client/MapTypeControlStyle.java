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
 * Identifiers for common MapTypesControls.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MapTypeControlStyle">JavaScript reference page.</a>}
 */
public class MapTypeControlStyle extends JavaScriptObject {

  /**
   * Uses the default map type control. The control which DEFAULT maps to will vary according to window size and other factors. It may change in future versions of the API.
   */
  public static final String DEFAULT = getConstant("DEFAULT");

  /**
   * A dropdown menu for the screen realestate conscious.
   */
  public static final String DROPDOWN_MENU = getConstant("DROPDOWN_MENU");

  /**
   * The standard horizontal radio buttons bar.
   */
  public static final String HORIZONTAL_BAR = getConstant("HORIZONTAL_BAR");

  /**
   * Instantiates a MapTypeControlStyle object.
   * 
   * @return An instance of MapTypeControlStyle.
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native MapTypeControlStyle newInstance() /*-{
    return new $wnd.MapTypeControlStyle();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.MapTypeControlStyle[name];
  }-*/;

  protected MapTypeControlStyle() { }

}