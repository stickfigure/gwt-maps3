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
import com.googlecode.maps3.client.LatLng;
import com.googlecode.maps3.client.LatLngBounds;

/**
 * The specification for a geocoding request to be sent to the Geocoder.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#GeocoderRequest">JavaScript reference page.</a>}
 */
public class GeocoderRequest extends JavaScriptObject {

  /**
   * Instantiates a GeocoderRequest object.
   * 
   * @return An instance of GeocoderRequest.
   */
  public static native GeocoderRequest newInstance() /*-{
    return {};
  }-*/;

  protected GeocoderRequest() { }

  /**
   * Address. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getAddress() /*-{
    return this.address;
  }-*/;

  /**
   * LatLngBounds within which to search. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLngBounds getBounds() /*-{
    return this.bounds;
  }-*/;

  /**
   * Preferred language for results. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getLanguage() /*-{
    return this.language;
  }-*/;

  /**
   * LatLng about which to search. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getLatLng() /*-{
    return this.latLng;
  }-*/;

  /**
   * Country code top-level domain within which to search. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getRegion() /*-{
    return this.region;
  }-*/;

  /**
   * Address. Optional.
   * 
   * @param address
   * 
   * TODO: Missing comments for parameter address.
   */
  public final native void setAddress(String address) /*-{
    this.address = address;
  }-*/;

  /**
   * LatLngBounds within which to search. Optional.
   * 
   * @param bounds
   * 
   * TODO: Missing comments for parameter bounds.
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.bounds = bounds;
  }-*/;

  /**
   * Preferred language for results. Optional.
   * 
   * @param language
   * 
   * TODO: Missing comments for parameter language.
   */
  public final native void setLanguage(String language) /*-{
    this.language = language;
  }-*/;

  /**
   * LatLng about which to search. Optional.
   * 
   * @param latLng
   * 
   * TODO: Missing comments for parameter latLng.
   */
  public final native void setLatLng(LatLng latLng) /*-{
    this.latLng = latLng;
  }-*/;

  /**
   * Country code top-level domain within which to search. Optional.
   * 
   * @param region
   * 
   * TODO: Missing comments for parameter region.
   */
  public final native void setRegion(String region) /*-{
    this.region = region;
  }-*/;

}