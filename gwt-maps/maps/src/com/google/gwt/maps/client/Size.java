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
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#Size">JavaScript reference page.</a>}
 */
public class Size extends JavaScriptObject {

  /**
   * Two-dimensonal size, where width is the distance on the x-axis, and height is the distance on the y-axis.
   * 
   * @param width
   * @param height
   * @return An instance of Size.
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter height.
   * TODO: Missing comments for parameter width.
   */
  public static native Size newInstance(double width, double height) /*-{
    return new $wnd.Size(
      width,
      height,
      undefined,
      undefined
    );
  }-*/;

  /**
   * Two-dimensonal size, where width is the distance on the x-axis, and height is the distance on the y-axis.
   * 
   * @param width
   * @param height
   * @param heightUnit
   * @return An instance of Size.
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter height.
   * TODO: Missing comments for parameter heightUnit.
   * TODO: Missing comments for parameter width.
   */
  public static native Size newInstance(double width, double height, String heightUnit) /*-{
    return new $wnd.Size(
      width,
      height,
      undefined,
      heightUnit
    );
  }-*/;

  /**
   * Two-dimensonal size, where width is the distance on the x-axis, and height is the distance on the y-axis.
   * 
   * @param width
   * @param height
   * @param widthUnit
   * @return An instance of Size.
   * 
   * TODO: Missing comments for parameter widthUnit.
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter height.
   * TODO: Missing comments for parameter width.
   */
  public static native Size newInstance(double width, double height, String widthUnit) /*-{
    return new $wnd.Size(
      width,
      height,
      widthUnit,
      undefined
    );
  }-*/;

  /**
   * Two-dimensonal size, where width is the distance on the x-axis, and height is the distance on the y-axis.
   * 
   * @param width
   * @param height
   * @param widthUnit
   * @param heightUnit
   * @return An instance of Size.
   * 
   * TODO: Missing comments for parameter widthUnit.
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter height.
   * TODO: Missing comments for parameter heightUnit.
   * TODO: Missing comments for parameter width.
   */
  public static native Size newInstance(double width, double height, String widthUnit, String heightUnit) /*-{
    return new $wnd.Size(
      width,
      height,
      widthUnit,
      heightUnit
    );
  }-*/;

  protected Size() { }

  /**
   * Compares two Sizes.
   * 
   * @param other
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter other.
   */
  public final native boolean equals(Size other) /*-{
    return this.equals(
      other
    );
  }-*/;

  /**
   * Returns a string representation of this Size.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: An underscore has been appended to the method name (collision with final method).
   */
  public final native String toString_() /*-{
    return this.toString_();
  }-*/;

}