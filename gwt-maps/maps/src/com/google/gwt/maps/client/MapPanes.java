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
 * This object contains the DOM elements in which overlays are rendered. They are listed below with 'Pane 0' at the bottom and 'Pane 6' at the top.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MapPanes">JavaScript reference page.</a>}
 */
public class MapPanes extends JavaScriptObject {

  /**
   * Instantiates a MapPanes object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native MapPanes newInstance() /*-{
    return new $wnd.MapPanes();
  }-*/;

  protected MapPanes() { }

  /**
   * This pane contains the info window. It is above all map overlays. (Pane 6).
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Element getFloatPane() /*-{
    return this.floatPane;
  }-*/;

  /**
   * This pane contains the info window shadow. It is above the overlayImage, so that markers can be in the shadow of the info window. (Pane 4).
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Element getFloatShadow() /*-{
    return this.floatShadow;
  }-*/;

  /**
   * This pane is the lowest pane and is above the tiles. (Pane 0).
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Element getMapPane() /*-{
    return this.mapPane;
  }-*/;

  /**
   * This pane contains the marker foreground images. (Pane 3).
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Element getOverlayImage() /*-{
    return this.overlayImage;
  }-*/;

  /**
   * This pane contains polylines, polygons, ground overlays and tile layer overlays. (Pane 1).
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Element getOverlayLayer() /*-{
    return this.overlayLayer;
  }-*/;

  /**
   * This pane contains transparent elements that receive DOM mouse events for the markers. It is above the floatShadow, so that markers in the shadow of the info window can be clickable. (Pane 5).
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Element getOverlayMouseTarget() /*-{
    return this.overlayMouseTarget;
  }-*/;

  /**
   * This pane contains the marker shadows. (Pane 2).
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Element getOverlayShadow() /*-{
    return this.overlayShadow;
  }-*/;

  /**
   * This pane contains the info window. It is above all map overlays. (Pane 6).
   * 
   * @param floatPane
   * 
   * TODO: Missing comments for parameter floatPane.
   */
  public final native void setFloatPane(Element floatPane) /*-{
    this.floatPane = floatPane;
  }-*/;

  /**
   * This pane contains the info window shadow. It is above the overlayImage, so that markers can be in the shadow of the info window. (Pane 4).
   * 
   * @param floatShadow
   * 
   * TODO: Missing comments for parameter floatShadow.
   */
  public final native void setFloatShadow(Element floatShadow) /*-{
    this.floatShadow = floatShadow;
  }-*/;

  /**
   * This pane is the lowest pane and is above the tiles. (Pane 0).
   * 
   * @param mapPane
   * 
   * TODO: Missing comments for parameter mapPane.
   */
  public final native void setMapPane(Element mapPane) /*-{
    this.mapPane = mapPane;
  }-*/;

  /**
   * This pane contains the marker foreground images. (Pane 3).
   * 
   * @param overlayImage
   * 
   * TODO: Missing comments for parameter overlayImage.
   */
  public final native void setOverlayImage(Element overlayImage) /*-{
    this.overlayImage = overlayImage;
  }-*/;

  /**
   * This pane contains polylines, polygons, ground overlays and tile layer overlays. (Pane 1).
   * 
   * @param overlayLayer
   * 
   * TODO: Missing comments for parameter overlayLayer.
   */
  public final native void setOverlayLayer(Element overlayLayer) /*-{
    this.overlayLayer = overlayLayer;
  }-*/;

  /**
   * This pane contains transparent elements that receive DOM mouse events for the markers. It is above the floatShadow, so that markers in the shadow of the info window can be clickable. (Pane 5).
   * 
   * @param overlayMouseTarget
   * 
   * TODO: Missing comments for parameter overlayMouseTarget.
   */
  public final native void setOverlayMouseTarget(Element overlayMouseTarget) /*-{
    this.overlayMouseTarget = overlayMouseTarget;
  }-*/;

  /**
   * This pane contains the marker shadows. (Pane 2).
   * 
   * @param overlayShadow
   * 
   * TODO: Missing comments for parameter overlayShadow.
   */
  public final native void setOverlayShadow(Element overlayShadow) /*-{
    this.overlayShadow = overlayShadow;
  }-*/;

}