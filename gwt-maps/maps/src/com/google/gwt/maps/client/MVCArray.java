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

/**
 * Back to top
 */
public class MVCArray<T> extends MVCObject<T> {

  /**
   * A mutable MVC Array.
   * 
   * @return 
   * 
   * TODO: Missing comments for parameter array.
   */
  public static native <T> MVCArray<T> newInstance() /*-{
    return new $wnd.MVCArray();
  }-*/;

  /**
   * A mutable MVC Array.
   * 
   * @param array
   * @return 
   * 
   * TODO: Missing comments for parameter array.
   */
  public static native <T> MVCArray<T> newInstance(T[] array) /*-{
    return new $wnd.MVCArray(array);
  }-*/;

  protected MVCArray() { }

  /**
   * Iterate over each element, calling the provided callback. The callback is called for each element like: callback(element, index).
   * 
   * @param callback
   * 
   * TODO: Replace type Runnable with implementation of Runnable.
   * TODO: Missing comments for parameter callback.
   */
  public final native void forEach(Runnable callback) /*-{
    this.forEach(callback);
  }-*/;

  /**
   * Get an element at the specified index.
   * 
   * @param i
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter i.
   */
  public final native T getAt(int i) /*-{
    return this.getAt(i);
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native int getLength() /*-{
    return this.getLength();
  }-*/;

  /**
   * Insert an element at the specified index.
   * 
   * @param i
   * @param elem
   * 
   * TODO: Missing comments for parameter elem.
   */
  public final native void insertAt(int i, T elem) /*-{
    this.insertAt(i, elem);
  }-*/;

  /**
   * Removes the last element of the array and returns that element.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native T pop() /*-{
    return this.pop();
  }-*/;

  /**
   * Adds one element to the end of the array and returns the new length of the array.
   * 
   * @param elem
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter elem.
   */
  public final native int push(T elem) /*-{
    return this.push(elem);
  }-*/;

  /**
   * Remove an element from the specified index.
   * 
   * @param i
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter i.
   */
  public final native T removeAt(int i) /*-{
    return this.removeAt(i);
  }-*/;

  /**
   * Set an element at the specified index.
   * 
   * @param i
   * @param elem
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter elem.
   * TODO: Missing comments for parameter i.
   */
  public final native void setAt(int i, T elem) /*-{
    this.setAt(i, elem);
  }-*/;

}