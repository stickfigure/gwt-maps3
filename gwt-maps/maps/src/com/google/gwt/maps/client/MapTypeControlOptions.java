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
 * Options for the rendering of the map type control.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MapTypeControlOptions">JavaScript reference page.</a>}
 */
public class MapTypeControlOptions extends JavaScriptObject {

  /**
   * Instantiates a MapTypeControlOptions object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native MapTypeControlOptions newInstance() /*-{
    return new $wnd.MapTypeControlOptions();
  }-*/;

  protected MapTypeControlOptions() { }

  /**
   * IDs of map types to show in the control.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native string> getMapTypeIds() /*-{
    return this.getMapTypeIds();
  }-*/;

  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_RIGHT.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native ControlPosition getPosition() /*-{
    return this.getPosition();
  }-*/;

  /**
   * Style id. Used to select what style of map type control to display.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native MapTypeControlStyle getStyle() /*-{
    return this.getStyle();
  }-*/;

  /**
   * IDs of map types to show in the control.
   * 
   * @param mapTypeIds
   * 
   * TODO: Missing comments for parameter mapTypeIds.
   */
  public final native void setMapTypeIds(string> mapTypeIds) /*-{
    this.setMapTypeIds(
      mapTypeIds
    );
  }-*/;

  /**
   * IDs of map types to show in the control.
   * 
   * @param mapTypeIds
   * 
   * TODO: Missing comments for parameter mapTypeIds.
   */
  public final native void setMapTypeIds(MapTypeId[] mapTypeIds) /*-{
    this.setMapTypeIds(
      @com.google.gwt.maps.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(mapTypeIds)
    );
  }-*/;

  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_RIGHT.
   * 
   * @param position
   * 
   * TODO: Missing comments for parameter position.
   */
  public final native void setPosition(ControlPosition position) /*-{
    this.setPosition(
      position
    );
  }-*/;

  /**
   * Style id. Used to select what style of map type control to display.
   * 
   * @param style
   * 
   * TODO: Missing comments for parameter style.
   */
  public final native void setStyle(MapTypeControlStyle style) /*-{
    this.setStyle(
      style
    );
  }-*/;

}