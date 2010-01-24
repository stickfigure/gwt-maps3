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
 * This class is opaque. It has no methods and no constructor. Its instances are returned from addListener(), addDomListener() and are eventually passed back to removeListener().
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MapsEventListener">JavaScript reference page.</a>}
 */
public class MapsEventListener extends JavaScriptObject {

  /**
   * Instantiates a MapsEventListener object.
   * 
   * @return An instance of null
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native MapsEventListener newInstance() /*-{
    return new $wnd.MapsEventListener();
  }-*/;

  protected MapsEventListener() { }

}