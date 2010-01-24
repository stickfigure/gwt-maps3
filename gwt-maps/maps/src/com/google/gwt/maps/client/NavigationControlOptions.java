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
 * Options for the rendering of the navigation control.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#NavigationControlOptions">JavaScript reference page.</a>}
 */
public class NavigationControlOptions extends JavaScriptObject {

  /**
   * Instantiates a NavigationControlOptions object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native NavigationControlOptions newInstance() /*-{
    return new $wnd.NavigationControlOptions();
  }-*/;

  protected NavigationControlOptions() { }

  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native ControlPosition getPosition() /*-{
    return this.position;
  }-*/;

  /**
   * Style id. Used to select what style of navigation control to display.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native NavigationControlStyle getStyle() /*-{
    return this.style;
  }-*/;

  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
   * 
   * @param position
   * 
   * TODO: Missing comments for parameter position.
   */
  public final native void setPosition(ControlPosition position) /*-{
    this.position = position;
  }-*/;

  /**
   * Style id. Used to select what style of navigation control to display.
   * 
   * @param style
   * 
   * TODO: Missing comments for parameter style.
   */
  public final native void setStyle(NavigationControlStyle style) /*-{
    this.style = style;
  }-*/;

}