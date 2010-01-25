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
 * Identifiers for scale control ids.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#ScaleControlStyle">JavaScript reference page.</a>}
 */
public class ScaleControlStyle extends JavaScriptObject {

  /**
   * The standard scale control.
   */
  public static final String DEFAULT = getConstant("DEFAULT");

  /**
   * Instantiates a ScaleControlStyle object.
   * 
   * @return An instance of ScaleControlStyle.
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native ScaleControlStyle newInstance() /*-{
    return new $wnd.ScaleControlStyle();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.ScaleControlStyle[name];
  }-*/;

  protected ScaleControlStyle() { }

}