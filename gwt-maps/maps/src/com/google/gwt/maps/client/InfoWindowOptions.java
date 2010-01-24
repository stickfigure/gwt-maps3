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
import com.google.gwt.dom.client.Element;

/**
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#InfoWindowOptions">JavaScript reference page.</a>}
 */
public class InfoWindowOptions extends JavaScriptObject {

  /**
   * Instantiates a InfoWindowOptions object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native InfoWindowOptions newInstance() /*-{
    return new $wnd.InfoWindowOptions();
  }-*/;

  protected InfoWindowOptions() { }

  /**
   * Content to display in the InfoWindow. This can be an HTML element, a plain-text string, or a string containing HTML. The InfoWindow will be sized according to the content. To set an explicit size for the content, set content to be a HTML element with that size.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Element getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Disable auto-pan on open. By default, the info window will pan the map so that it is fully visible when it opens.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native boolean getDisableAutoPan() /*-{
    return this.getDisableAutoPan();
  }-*/;

  /**
   * Maximum width of the infowindow, regardless of content's width. This value is only considered if it is set before a call to open. To change the maximum width when changing content, call close, setOptions, and then open.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getMaxWidth() /*-{
    return this.getMaxWidth();
  }-*/;

  /**
   * The offset, in pixels, of the tip of the info window from the point on the map at whose geographical coordinates the info window is anchored. If an InfoWindow is opened with an anchor, the pixelOffset will be calculated from the top-center of the anchor's bounds.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Size getPixelOffset() /*-{
    return this.getPixelOffset();
  }-*/;

  /**
   * The LatLng at which to display this InfoWindow. If the InfoWindow is opened with an anchor, the anchor's position will be used instead.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLng getPosition() /*-{
    return this.getPosition();
  }-*/;

  /**
   * All InfoWindows are displayed on the map in order of their zIndex, with higher values displaying in front of InfoWindows with lower values. By default, InfoWinodws are displayed according to their latitude, with InfoWindows of lower latitudes appearing in front of InfoWindows at higher latitudes. InfoWindows are always displayed in front of markers.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getZIndex() /*-{
    return this.getZIndex();
  }-*/;

  /**
   * Content to display in the InfoWindow. This can be an HTML element, a plain-text string, or a string containing HTML. The InfoWindow will be sized according to the content. To set an explicit size for the content, set content to be a HTML element with that size.
   * 
   * @param content
   * 
   * TODO: Missing comments for parameter content.
   */
  public final native void setContent(Element content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Content to display in the InfoWindow. This can be an HTML element, a plain-text string, or a string containing HTML. The InfoWindow will be sized according to the content. To set an explicit size for the content, set content to be a HTML element with that size.
   * 
   * @param content
   * 
   * TODO: Missing comments for parameter content.
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Disable auto-pan on open. By default, the info window will pan the map so that it is fully visible when it opens.
   * 
   * @param disableAutoPan
   * 
   * TODO: Missing comments for parameter disableAutoPan.
   */
  public final native void setDisableAutoPan(boolean disableAutoPan) /*-{
    this.setDisableAutoPan(
      disableAutoPan
    );
  }-*/;

  /**
   * Maximum width of the infowindow, regardless of content's width. This value is only considered if it is set before a call to open. To change the maximum width when changing content, call close, setOptions, and then open.
   * 
   * @param maxWidth
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter maxWidth.
   */
  public final native void setMaxWidth(double maxWidth) /*-{
    this.setMaxWidth(
      maxWidth
    );
  }-*/;

  /**
   * The offset, in pixels, of the tip of the info window from the point on the map at whose geographical coordinates the info window is anchored. If an InfoWindow is opened with an anchor, the pixelOffset will be calculated from the top-center of the anchor's bounds.
   * 
   * @param pixelOffset
   * 
   * TODO: Missing comments for parameter pixelOffset.
   */
  public final native void setPixelOffset(Size pixelOffset) /*-{
    this.setPixelOffset(
      pixelOffset
    );
  }-*/;

  /**
   * The LatLng at which to display this InfoWindow. If the InfoWindow is opened with an anchor, the anchor's position will be used instead.
   * 
   * @param position
   * 
   * TODO: Missing comments for parameter position.
   */
  public final native void setPosition(LatLng position) /*-{
    this.setPosition(
      position
    );
  }-*/;

  /**
   * All InfoWindows are displayed on the map in order of their zIndex, with higher values displaying in front of InfoWindows with lower values. By default, InfoWinodws are displayed according to their latitude, with InfoWindows of lower latitudes appearing in front of InfoWindows at higher latitudes. InfoWindows are always displayed in front of markers.
   * 
   * @param zIndex
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter zIndex.
   */
  public final native void setZIndex(double zIndex) /*-{
    this.setZIndex(
      zIndex
    );
  }-*/;

}