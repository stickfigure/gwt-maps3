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
 * This interface defines map type. This interface is typically used for base maps such as road, satellite or hybrid maps. Immutable.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MapType">JavaScript reference page.</a>}
 */
public class MapType extends JavaScriptObject {

  /**
   * Instantiates a MapType object.
   * 
   * @return An instance of MapType.
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native MapType newInstance() /*-{
    return new $wnd.MapType();
  }-*/;

  protected MapType() { }

  /**
   * Alt text to display when this MapType's button is hovered over in the MapTypeControl. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getAlt() /*-{
    return this.alt;
  }-*/;

  /**
   * The maximum zoom level for the map when displaying this MapType.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getMaxZoom() /*-{
    return this.maxZoom;
  }-*/;

  /**
   * The minimum zoom level for the map when displaying this MapType. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getMinZoom() /*-{
    return this.minZoom;
  }-*/;

  /**
   * Name to display in the MapTypeControl. Optional.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * The Projection used to render this MapType. Defaults to Mercator.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Projection getProjection() /*-{
    return this.projection;
  }-*/;

  /**
   * Returns a tile for the given tile coordinate (x, y) and zoom level. This tile will be appended to the given ownerDocument.
   * 
   * @param tileCoord
   * @param zoom
   * @param ownerDocument
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter tileCoord.
   * TODO: Missing comments for parameter zoom.
   * TODO: Missing comments for parameter ownerDocument.
   */
  public final native Element getTile(Point tileCoord, double zoom, Document ownerDocument) /*-{
    return this.getTile(
      tileCoord,
      zoom,
      ownerDocument
    );
  }-*/;

  /**
   * The dimensions of each tile.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native Size getTileSize() /*-{
    return this.tileSize;
  }-*/;

  /**
   * Releases the given tile, performing any necessary cleanup. The provided tile will have already been removed from the document. Optional.
   * 
   * @param tile
   * 
   * TODO: Missing comments for parameter tile.
   */
  public final native void releaseTile(Element tile) /*-{
    this.releaseTile(
      tile
    );
  }-*/;

  /**
   * Alt text to display when this MapType's button is hovered over in the MapTypeControl. Optional.
   * 
   * @param alt
   * 
   * TODO: Missing comments for parameter alt.
   */
  public final native void setAlt(String alt) /*-{
    this.alt = alt;
  }-*/;

  /**
   * The maximum zoom level for the map when displaying this MapType.
   * 
   * @param maxZoom
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter maxZoom.
   */
  public final native void setMaxZoom(double maxZoom) /*-{
    this.maxZoom = maxZoom;
  }-*/;

  /**
   * The minimum zoom level for the map when displaying this MapType. Optional.
   * 
   * @param minZoom
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter minZoom.
   */
  public final native void setMinZoom(double minZoom) /*-{
    this.minZoom = minZoom;
  }-*/;

  /**
   * Name to display in the MapTypeControl. Optional.
   * 
   * @param name
   * 
   * TODO: Missing comments for parameter name.
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * The Projection used to render this MapType. Defaults to Mercator.
   * 
   * @param projection
   * 
   * TODO: Missing comments for parameter projection.
   */
  public final native void setProjection(Projection projection) /*-{
    this.projection = projection;
  }-*/;

  /**
   * The dimensions of each tile.
   * 
   * @param tileSize
   * 
   * TODO: Missing comments for parameter tileSize.
   */
  public final native void setTileSize(Size tileSize) /*-{
    this.tileSize = tileSize;
  }-*/;

}