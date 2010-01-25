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
 * This class implements the MapType interface and is provided for rendering image tiles.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#ImageMapType">JavaScript reference page.</a>}
 */
public class ImageMapType extends JavaScriptObject {

  /**
   * Constructs an ImageMapType using the provided ImageMapTypeOptions
   * 
   * @param opts
   * @return An instance of ImageMapType.
   * 
   * TODO: Missing comments for parameter opts.
   */
  public static native ImageMapType newInstance(ImageMapTypeOptions opts) /*-{
    return new $wnd.ImageMapType(
      opts
    );
  }-*/;

  protected ImageMapType() { }

}