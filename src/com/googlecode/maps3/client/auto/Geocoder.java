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
    return new $wnd.google.maps.Geocoder();
  }-*/;

  protected Geocoder() { }

  /**
   * Geocode a request.
   * 
   * @param request defines the request that will be made
   * @param callback will be called with whatever the geocoder returns
   */
  public final native void geocode(GeocoderRequest request, GeocoderCallback callback) /*-{
    this.geocode(
      request, function(results, status) {
      	callback.@com.googlecode.maps3.client.auto.GeocoderCallback::callback(Lcom/google/gwt/core/client/JsArray;Lcom/googlecode/maps3/client/auto/GeocoderStatus;)(results, status);
      }
    );
  }-*/;

}