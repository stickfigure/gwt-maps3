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

import com.google.gwt.dom.client.Element;

/**
 * This class extends MVCObject.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#Map">JavaScript reference page.</a>}
 */
public class Map extends MVCObject {

  /**
   * Creates a new map inside of the given HTML container, which is typically a DIV element.
   * 
   * @param mapDiv
   * @return An instance of Map
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter mapDiv.
   */
  public static native Map newInstance(Element mapDiv) /*-{
    return new $wnd.Map(
      mapDiv,
      undefined
    );
  }-*/;

  /**
   * Creates a new map inside of the given HTML container, which is typically a DIV element.
   * 
   * @param mapDiv
   * @param opts
   * @return An instance of Map
   * 
   * TODO: Missing comments for parameter opts.
   * TODO: Missing comments for parameter mapDiv.
   */
  public static native Map newInstance(Element mapDiv, MapOptions opts) /*-{
    return new $wnd.Map(
      mapDiv,
      opts
    );
  }-*/;

  protected Map() { }

  /**
   * Sets the maps to fit to the given bounds.
   * 
   * @param bounds
   * 
   * TODO: Missing comments for parameter bounds.
   */
  public final native void fitBounds(LatLngBounds bounds) /*-{
    this.fitBounds(
      bounds
    );
  }-*/;

  /**
   * Returns the lat/lng bounds of the current viewport. If the map is not yet initialized (i.e. the mapType is still null), or center and zoom have not been set then the result is null.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native LatLngBounds getBounds() /*-{
    return this.getBounds();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native LatLng getCenter() /*-{
    return this.getCenter();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native Element getDiv() /*-{
    return this.getDiv();
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   */
  public final native MapTypeId getMapTypeId() /*-{
    return this.getMapTypeId();
  }-*/;

  /**
   * A registry of MapType instances by string ID.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native MapTypeRegistry getMapTypes() /*-{
    return this.mapTypes;
  }-*/;

  /**
   * Additional map types to overlay.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native MVCArray<MapType> getOverlayMapTypes() /*-{
    return this.overlayMapTypes;
  }-*/;

  /**
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Missing method comments.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getZoom() /*-{
    return this.getZoom();
  }-*/;

  /**
   * Changes the center of the map by the given distance in pixels. If the distance is less than both the width and height of the map, the transition will be smoothly animated. Note that the map coordinate system increases from west to east (for x values) and north to south (for y values).
   * 
   * @param x
   * @param y
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter y.
   * TODO: Missing comments for parameter x.
   */
  public final native void panBy(double x, double y) /*-{
    this.panBy(
      x,
      y
    );
  }-*/;

  /**
   * Changes the center of the map to the given LatLng. If the change is less than both the width and height of the map, the transition will be smoothly animated.
   * 
   * @param latLng
   * 
   * TODO: Missing comments for parameter latLng.
   */
  public final native void panTo(LatLng latLng) /*-{
    this.panTo(
      latLng
    );
  }-*/;

  /**
   * Pans the map by the minimum amount necessary to contain the given LatLngBounds. It makes no guarantee where on the map the bounds will be, except that as much of the bounds as possible will be visible. The bounds will be positioned inside the area bounded by the map type and navigation controls, if they are present on the map. If the bounds is larger than the map, the map will be shifted to include the northwest corner of the bounds. If the change in the map's position is less than both the width and height of the map, the transition will be smoothly animated.
   * 
   * @param latLngBounds
   * 
   * TODO: Missing comments for parameter latLngBounds.
   */
  public final native void panToBounds(LatLngBounds latLngBounds) /*-{
    this.panToBounds(
      latLngBounds
    );
  }-*/;

  /**
   * @param latlng
   * 
   * TODO: Missing comments for parameter latlng.
   * TODO: Missing method comments.
   */
  public final native void setCenter(LatLng latlng) /*-{
    this.setCenter(
      latlng
    );
  }-*/;

  /**
   * @param mapTypeId
   * 
   * TODO: Missing comments for parameter mapTypeId.
   * TODO: Missing method comments.
   */
  public final native void setMapTypeId(MapTypeId mapTypeId) /*-{
    this.setMapTypeId(
      mapTypeId
    );
  }-*/;

  /**
   * A registry of MapType instances by string ID.
   * 
   * @param mapTypes
   * 
   * TODO: Missing comments for parameter mapTypes.
   */
  public final native void setMapTypes(MapTypeRegistry mapTypes) /*-{
    this.mapTypes = mapTypes;
  }-*/;

  /**
   * @param options
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter options.
   */
  public final native void setOptions(MapOptions options) /*-{
    this.setOptions(
      options
    );
  }-*/;

  /**
   * Additional map types to overlay.
   * 
   * @param overlayMapTypes
   * 
   * TODO: Missing comments for parameter overlayMapTypes.
   */
  public final native void setOverlayMapTypes(MVCArray<MapType> overlayMapTypes) /*-{
    this.overlayMapTypes = overlayMapTypes;
  }-*/;

  /**
   * @param zoom
   * 
   * TODO: Missing method comments.
   * TODO: Missing comments for parameter zoom.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native void setZoom(double zoom) /*-{
    this.setZoom(
      zoom
    );
  }-*/;

}