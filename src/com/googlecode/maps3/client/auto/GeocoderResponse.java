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
 * An array of these objects are returned from the geocoder. Some fields in the response may not be returned for all requests - those are marked with a "?".
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#GeocoderResponse">JavaScript reference page.</a>}
 */
public class GeocoderResponse extends JavaScriptObject {

  /**
   * Instantiates a GeocoderResponse object.
   * 
   * @return An instance of GeocoderResponse.
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native GeocoderResponse newInstance() /*-{
    return new $wnd.GeocoderResponse();
  }-*/;

  protected GeocoderResponse() { }

}