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
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#Point">JavaScript reference page.</a>}
 */
public class Point extends JavaScriptObject {

  /**
   * A point on a two-dimensional plane.
   * 
   * @param x
   * @param y
   * @return An instance of Point
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter y.
   * TODO: Missing comments for parameter x.
   */
  public static native Point newInstance(double x, double y) /*-{
    return new $wnd.Point(
      x,
      y
    );
  }-*/;

  protected Point() { }

  /**
   * Compares two Points
   * 
   * @param other
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter other.
   */
  public final native boolean equals(Point other) /*-{
    return this.equals(
      other
    );
  }-*/;

  /**
   * Returns a string representation of this Point.
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