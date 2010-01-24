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
 * This object is returned from various mouse events on the map and overlays, and contains all the fields shown below.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MouseEvent">JavaScript reference page.</a>}
 */
public class MouseEvent extends JavaScriptObject {

  /**
   * Instantiates a MouseEvent object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native MouseEvent newInstance() /*-{
    return new $wnd.MouseEvent();
  }-*/;

  protected MouseEvent() { }

  /**
   * The latitude/longitude that was below the cursor when the event occurred.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getLatLng() /*-{
    return this.latLng;
  }-*/;

  /**
   * The latitude/longitude that was below the cursor when the event occurred.
   * 
   * @param latLng
   * 
   * TODO: Missing comments for parameter latLng.
   */
  public final native void setLatLng(LatLng latLng) /*-{
    this.latLng = latLng;
  }-*/;

}