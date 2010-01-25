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
 * A single trip containing a set of routes in JSON format in a DirectionsResult.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsTrip">JavaScript reference page.</a>}
 */
public class DirectionsTrip extends JavaScriptObject {

  /**
   * Instantiates a DirectionsTrip object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native DirectionsTrip newInstance() /*-{
    return new $wnd.DirectionsTrip();
  }-*/;

  protected DirectionsTrip() { }

  /**
   * Copyrights text to be displayed for this trip.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getCopyrights() /*-{
    return this.copyrights;
  }-*/;

  /**
   * An array of DirectionsRoutes, each of which contains information about the steps of which it is composed. There will be one route for each waypoint or destination specified. So a trip with no waypoints will contain one DirectionsRoute and a route with one waypoint will contain two.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsRoute[] getRoutes() /*-{
    return @com.google.gwt.maps.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.routes);
  }-*/;

  /**
   * Warnings to be displayed when showing these directions.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String[] getWarnings() /*-{
    return @com.google.gwt.maps.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.warnings);
  }-*/;

  /**
   * Copyrights text to be displayed for this trip.
   * 
   * @param copyrights
   * 
   * TODO: Missing comments for parameter copyrights.
   */
  public final native void setCopyrights(String copyrights) /*-{
    this.copyrights = copyrights;
  }-*/;

  /**
   * An array of DirectionsRoutes, each of which contains information about the steps of which it is composed. There will be one route for each waypoint or destination specified. So a trip with no waypoints will contain one DirectionsRoute and a route with one waypoint will contain two.
   * 
   * @param routes
   * 
   * TODO: Missing comments for parameter routes.
   */
  public final native void setRoutes(DirectionsRoute[] routes) /*-{
    this.routes = @com.google.gwt.maps.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(routes);
  }-*/;

  /**
   * Warnings to be displayed when showing these directions.
   * 
   * @param warnings
   * 
   * TODO: Missing comments for parameter warnings.
   */
  public final native void setWarnings(String[] warnings) /*-{
    this.warnings = @com.google.gwt.maps.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(warnings);
  }-*/;

}