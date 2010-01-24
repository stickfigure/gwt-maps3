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
 * A single DirectionsStep in JSON format in a DirectionsResult. Some fields may be undefined.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsStep">JavaScript reference page.</a>}
 */
public class DirectionsStep extends JavaScriptObject {

  /**
   * Instantiates a DirectionsStep object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native DirectionsStep newInstance() /*-{
    return new $wnd.DirectionsStep();
  }-*/;

  protected DirectionsStep() { }

  /**
   * The distance covered by this step. This property may be undefined as the distance may be unknown.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsDistance getDistance() /*-{
    return this.getDistance();
  }-*/;

  /**
   * The typical time required to perform this step in seconds and in text form. This property may be undefined as the duration may be unknown.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native DirectionsDuration getDuration() /*-{
    return this.getDuration();
  }-*/;

  /**
   * The ending point of this step.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getEnd_point() /*-{
    return this.getEnd_point();
  }-*/;

  /**
   * Instructions for this step.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getInstructions() /*-{
    return this.getInstructions();
  }-*/;

  /**
   * The LatLng locations which indicate the vertices of the step's polyline.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng[] getLat_lngs() /*-{
    return @com.google.gwt.maps.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getLat_lngs());
  }-*/;

  /**
   * The starting point of this step.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getStart_point() /*-{
    return this.getStart_point();
  }-*/;

  /**
   * The distance covered by this step. This property may be undefined as the distance may be unknown.
   * 
   * @param distance
   * 
   * TODO: Missing comments for parameter distance.
   */
  public final native void setDistance(DirectionsDistance distance) /*-{
    this.setDistance(
      distance
    );
  }-*/;

  /**
   * The typical time required to perform this step in seconds and in text form. This property may be undefined as the duration may be unknown.
   * 
   * @param duration
   * 
   * TODO: Missing comments for parameter duration.
   */
  public final native void setDuration(DirectionsDuration duration) /*-{
    this.setDuration(
      duration
    );
  }-*/;

  /**
   * The ending point of this step.
   * 
   * @param end_point
   * 
   * TODO: Missing comments for parameter end_point.
   */
  public final native void setEnd_point(LatLng end_point) /*-{
    this.setEnd_point(
      end_point
    );
  }-*/;

  /**
   * Instructions for this step.
   * 
   * @param instructions
   * 
   * TODO: Missing comments for parameter instructions.
   */
  public final native void setInstructions(String instructions) /*-{
    this.setInstructions(
      instructions
    );
  }-*/;

  /**
   * The LatLng locations which indicate the vertices of the step's polyline.
   * 
   * @param lat_lngs
   * 
   * TODO: Missing comments for parameter lat_lngs.
   */
  public final native void setLat_lngs(LatLng[] lat_lngs) /*-{
    this.setLat_lngs(
      @com.google.gwt.maps.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(lat_lngs)
    );
  }-*/;

  /**
   * The starting point of this step.
   * 
   * @param start_point
   * 
   * TODO: Missing comments for parameter start_point.
   */
  public final native void setStart_point(LatLng start_point) /*-{
    this.setStart_point(
      start_point
    );
  }-*/;

}