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
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MVCObject">JavaScript reference page.</a>}
 */
public class MVCObject<T> extends JavaScriptObject {

  /**
   * Base class implementing KVO.
   * 
   * @return An instance of MVCObject
   */
  public static native <T> MVCObject<T> newInstance() /*-{
    return new $wnd.MVCObject();
  }-*/;

  protected MVCObject() { }

  /**
   * Binds a View to a Model.
   * 
   * @param key
   * @param target
   * @param targetKey
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter key.
   * TODO: Missing comments for parameter targetKey.
   * TODO: Missing comments for parameter target.
   */
  public final native void bindTo(String key, MVCObject<T> target, String targetKey) /*-{
    this.bindTo(
      key,
      target,
      targetKey,
      undefined
    );
  }-*/;

  /**
   * Binds a View to a Model.
   * 
   * @param key
   * @param target
   * @param targetKey
   * @param noNotify
   * 
   * TODO: Missing comments for parameter noNotify.
   * TODO: Missing comments for parameter key.
   * TODO: Missing comments for parameter targetKey.
   * TODO: Missing comments for parameter target.
   */
  public final native void bindTo(String key, MVCObject<T> target, String targetKey, boolean noNotify) /*-{
    this.bindTo(
      key,
      target,
      targetKey,
      noNotify
    );
  }-*/;

  /**
   * Generic handler for state changes. Override this in derived classes to handle arbitrary state changes.
   * 
   * @param key
   * 
   * TODO: Missing comments for parameter key.
   */
  public final native void changed(String key) /*-{
    this.changed(
      key
    );
  }-*/;

  /**
   * Gets a value.
   * 
   * @param key
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing comments for parameter key.
   */
  public final native T get(String key) /*-{
    return this.get(
      key
    );
  }-*/;

  /**
   * Notify all observers of a change on this property. This notifies both objects that are bound to the object's property as well as the object that it is bound to.
   * 
   * @param key
   * 
   * TODO: Missing comments for parameter key.
   */
  public final native void notify(String key) /*-{
    this.notify(
      key
    );
  }-*/;

  /**
   * Sets a value.
   * 
   * @param key
   * @param value
   * 
   * TODO: Missing comments for parameter key.
   * TODO: Missing comments for parameter value.
   */
  public final native void set(String key, T value) /*-{
    this.set(
      key,
      value
    );
  }-*/;

  /**
   * Sets a collection of key-value pairs.
   * 
   * @param values
   * 
   * TODO: Missing comments for parameter values.
   */
  public final native void setValues(JavaScriptObject values) /*-{
    this.setValues(
      values
    );
  }-*/;

  /**
   * Removes a binding. Unbinding will set the unbound property to the current value. The object will not be notified, as the value has not changed.
   * 
   * @param key
   * 
   * TODO: Missing comments for parameter key.
   */
  public final native void unbind(String key) /*-{
    this.unbind(
      key
    );
  }-*/;

  /**
   * Removes all bindings.
   */
  public final native void unbindAll() /*-{
    this.unbindAll();
  }-*/;

}