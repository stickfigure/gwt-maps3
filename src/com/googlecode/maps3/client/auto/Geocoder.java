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
 * A service for converting between an address and a LatLng.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#Geocoder">JavaScript reference page.</a>}
 */
public class Geocoder extends JavaScriptObject {

  /**
   * Creates a new instance of a Geocoder that sends geocode requests to Google servers.
   * 
   * @return An instance of Geocoder.
   */
  public static native Geocoder newInstance() /*-{
    return new $wnd.Geocoder();
  }-*/;

  protected Geocoder() { }

  /**
   * Geocode a request.
   * 
   * @param request
   * @param callback
   * 
   * TODO: Replace type Runnable with implementation of function(Array<GeocoderResponse>.
   * TODO: Missing comments for parameter callback.
   * TODO: Missing comments for parameter request.
   */
  public final native void geocode(GeocoderRequest request, Runnable callback) /*-{
    this.geocode(
      request,
      callback
    );
  }-*/;

}