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
 * The directions response in JSON format retrieved from the directions server. You can render these using a DirectionsRenderer or parse this object and render it yourself. You must display the warnings and copyrights as noted in the Maps API terms of service.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsResult">JavaScript reference page.</a>}
 */
public class DirectionsResult extends JavaScriptObject {

  /**
   * Instantiates a DirectionsResult object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native DirectionsResult newInstance() /*-{
    return new $wnd.DirectionsResult();
  }-*/;

  protected DirectionsResult() { }

  /**
   * An array of DirectionsTrips, each of which contains information about the routes and steps of which it is composed. There will only be one trip unless the DirectionsRequest was made with provideTripAlternatives set to true.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsTrip[] getTrips() /*-{
    return @com.google.gwt.maps.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getTrips());
  }-*/;

  /**
   * An array of DirectionsTrips, each of which contains information about the routes and steps of which it is composed. There will only be one trip unless the DirectionsRequest was made with provideTripAlternatives set to true.
   * 
   * @param trips
   * 
   * TODO: Missing comments for parameter trips.
   */
  public final native void setTrips(DirectionsTrip[] trips) /*-{
    this.setTrips(
      @com.google.gwt.maps.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(trips)
    );
  }-*/;

}