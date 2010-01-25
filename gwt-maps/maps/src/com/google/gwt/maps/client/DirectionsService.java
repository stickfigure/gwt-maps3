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
 * A service for computing directions between two or more places.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsService">JavaScript reference page.</a>}
 */
public class DirectionsService extends JavaScriptObject {

  /**
   * Creates a new instance of a DirectionsService that sends directions queries to Google servers.
   * 
   * @return An instance of DirectionsService.
   */
  public static native DirectionsService newInstance() /*-{
    return new $wnd.DirectionsService();
  }-*/;

  protected DirectionsService() { }

  /**
   * Issue a directions search request.
   * 
   * @param request
   * @param callback
   * 
   * TODO: Replace type Runnable with implementation of function(DirectionsResult, DirectionsStatus)).
   * TODO: Missing comments for parameter callback.
   * TODO: Missing comments for parameter request.
   */
  public final native void route(DirectionsRequest request, Runnable callback) /*-{
    this.route(
      request,
      callback
    );
  }-*/;

}