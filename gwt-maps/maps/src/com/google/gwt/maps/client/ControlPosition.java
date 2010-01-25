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
 * Identifiers used to specify the placement of controls on the map. Controls are positioned relative to other controls in the same layout position. Controls that are added first are positioned closer to the edge of the map.   +---------------+  + TL    T    TR +  +               +  + L           R +  +               +  +               +  +               +  + BL    B    BR +  +---------------+Elements in the top or bottom row flow towards the middle. Elements at the left or right sides flow downwards.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#ControlPosition">JavaScript reference page.</a>}
 */
public class ControlPosition extends JavaScriptObject {

  /**
   * Elements are positioned in the center of the bottom row.
   */
  public static final String BOTTOM = getConstant("BOTTOM");

  /**
   * Elements are positioned in the bottom left and flow towards the middle. Elements are positioned to the right of the Google logo.
   */
  public static final String BOTTOM_LEFT = getConstant("BOTTOM_LEFT");

  /**
   * Elements are positioned in the bottom right and flow towards the middle. Elements are positioned to the left of the copyrights.
   */
  public static final String BOTTOM_RIGHT = getConstant("BOTTOM_RIGHT");

  /**
   * Elements are positioned on the left, below top-left elements, and flow downwards.
   */
  public static final String LEFT = getConstant("LEFT");

  /**
   * Elements are positioned on the right, below top-right elements, and flow downwards.
   */
  public static final String RIGHT = getConstant("RIGHT");

  /**
   * Elements are positioned in the center of the top row.
   */
  public static final String TOP = getConstant("TOP");

  /**
   * Elements are positioned in the top left and flow towards the middle.
   */
  public static final String TOP_LEFT = getConstant("TOP_LEFT");

  /**
   * Elements are positioned in the top right and flow towards the middle.
   */
  public static final String TOP_RIGHT = getConstant("TOP_RIGHT");

  /**
   * Instantiates a ControlPosition object.
   * 
   * @return An instance of ControlPosition.
   * 
   * TODO: This class contains only static members. Consider removing factory method.
   */
  public static native ControlPosition newInstance() /*-{
    return new $wnd.ControlPosition();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.ControlPosition[name];
  }-*/;

  protected ControlPosition() { }

}