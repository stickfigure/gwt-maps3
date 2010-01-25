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
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#MarkerImage">JavaScript reference page.</a>}
 */
public class MarkerImage extends JavaScriptObject {

  /**
   * Defines an image to be used as the icon or shadow for a Marker. 'origin' and 'size' are used to select a segment of a sprite image and 'anchor' overrides the position of the anchor point from its default bottom middle position. The anchor of an image is the pixel to which the system refers in tracking the image's position. By default, the anchor is set to the bottom middle of the image (coordinates width/2, height). So when a marker is placed at a given LatLng, the pixel defined as the anchor is positioned at the specified LatLng. The MarkerImage cannot be changed once constructed.
   * 
   * @param url
   * @return An instance of MarkerImage.
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter url.
   */
  public static native MarkerImage newInstance(String url) /*-{
    return new $wnd.MarkerImage(
      url,
      undefined,
      undefined,
      undefined
    );
  }-*/;

  /**
   * Defines an image to be used as the icon or shadow for a Marker. 'origin' and 'size' are used to select a segment of a sprite image and 'anchor' overrides the position of the anchor point from its default bottom middle position. The anchor of an image is the pixel to which the system refers in tracking the image's position. By default, the anchor is set to the bottom middle of the image (coordinates width/2, height). So when a marker is placed at a given LatLng, the pixel defined as the anchor is positioned at the specified LatLng. The MarkerImage cannot be changed once constructed.
   * 
   * @param url
   * @param anchor
   * @return An instance of MarkerImage.
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter anchor.
   * TODO: Missing comments for parameter url.
   */
  public static native MarkerImage newInstance(String url, Point anchor) /*-{
    return new $wnd.MarkerImage(
      url,
      undefined,
      undefined,
      anchor
    );
  }-*/;

  /**
   * Defines an image to be used as the icon or shadow for a Marker. 'origin' and 'size' are used to select a segment of a sprite image and 'anchor' overrides the position of the anchor point from its default bottom middle position. The anchor of an image is the pixel to which the system refers in tracking the image's position. By default, the anchor is set to the bottom middle of the image (coordinates width/2, height). So when a marker is placed at a given LatLng, the pixel defined as the anchor is positioned at the specified LatLng. The MarkerImage cannot be changed once constructed.
   * 
   * @param url
   * @param origin
   * @return An instance of MarkerImage.
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter origin.
   * TODO: Missing comments for parameter url.
   */
  public static native MarkerImage newInstance(String url, Point origin) /*-{
    return new $wnd.MarkerImage(
      url,
      undefined,
      origin,
      undefined
    );
  }-*/;

  /**
   * Defines an image to be used as the icon or shadow for a Marker. 'origin' and 'size' are used to select a segment of a sprite image and 'anchor' overrides the position of the anchor point from its default bottom middle position. The anchor of an image is the pixel to which the system refers in tracking the image's position. By default, the anchor is set to the bottom middle of the image (coordinates width/2, height). So when a marker is placed at a given LatLng, the pixel defined as the anchor is positioned at the specified LatLng. The MarkerImage cannot be changed once constructed.
   * 
   * @param url
   * @param size
   * @return An instance of MarkerImage.
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter url.
   * TODO: Missing comments for parameter size.
   */
  public static native MarkerImage newInstance(String url, Size size) /*-{
    return new $wnd.MarkerImage(
      url,
      size,
      undefined,
      undefined
    );
  }-*/;

  /**
   * Defines an image to be used as the icon or shadow for a Marker. 'origin' and 'size' are used to select a segment of a sprite image and 'anchor' overrides the position of the anchor point from its default bottom middle position. The anchor of an image is the pixel to which the system refers in tracking the image's position. By default, the anchor is set to the bottom middle of the image (coordinates width/2, height). So when a marker is placed at a given LatLng, the pixel defined as the anchor is positioned at the specified LatLng. The MarkerImage cannot be changed once constructed.
   * 
   * @param url
   * @param origin
   * @param anchor
   * @return An instance of MarkerImage.
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter origin.
   * TODO: Missing comments for parameter anchor.
   * TODO: Missing comments for parameter url.
   */
  public static native MarkerImage newInstance(String url, Point origin, Point anchor) /*-{
    return new $wnd.MarkerImage(
      url,
      undefined,
      origin,
      anchor
    );
  }-*/;

  /**
   * Defines an image to be used as the icon or shadow for a Marker. 'origin' and 'size' are used to select a segment of a sprite image and 'anchor' overrides the position of the anchor point from its default bottom middle position. The anchor of an image is the pixel to which the system refers in tracking the image's position. By default, the anchor is set to the bottom middle of the image (coordinates width/2, height). So when a marker is placed at a given LatLng, the pixel defined as the anchor is positioned at the specified LatLng. The MarkerImage cannot be changed once constructed.
   * 
   * @param url
   * @param size
   * @param anchor
   * @return An instance of MarkerImage.
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter anchor.
   * TODO: Missing comments for parameter url.
   * TODO: Missing comments for parameter size.
   */
  public static native MarkerImage newInstance(String url, Size size, Point anchor) /*-{
    return new $wnd.MarkerImage(
      url,
      size,
      undefined,
      anchor
    );
  }-*/;

  /**
   * Defines an image to be used as the icon or shadow for a Marker. 'origin' and 'size' are used to select a segment of a sprite image and 'anchor' overrides the position of the anchor point from its default bottom middle position. The anchor of an image is the pixel to which the system refers in tracking the image's position. By default, the anchor is set to the bottom middle of the image (coordinates width/2, height). So when a marker is placed at a given LatLng, the pixel defined as the anchor is positioned at the specified LatLng. The MarkerImage cannot be changed once constructed.
   * 
   * @param url
   * @param size
   * @param origin
   * @return An instance of MarkerImage.
   * 
   * TODO: JSNI implementation contains the "undefined" keyword.
   * TODO: Missing comments for parameter origin.
   * TODO: Missing comments for parameter url.
   * TODO: Missing comments for parameter size.
   */
  public static native MarkerImage newInstance(String url, Size size, Point origin) /*-{
    return new $wnd.MarkerImage(
      url,
      size,
      origin,
      undefined
    );
  }-*/;

  /**
   * Defines an image to be used as the icon or shadow for a Marker. 'origin' and 'size' are used to select a segment of a sprite image and 'anchor' overrides the position of the anchor point from its default bottom middle position. The anchor of an image is the pixel to which the system refers in tracking the image's position. By default, the anchor is set to the bottom middle of the image (coordinates width/2, height). So when a marker is placed at a given LatLng, the pixel defined as the anchor is positioned at the specified LatLng. The MarkerImage cannot be changed once constructed.
   * 
   * @param url
   * @param size
   * @param origin
   * @param anchor
   * @return An instance of MarkerImage.
   * 
   * TODO: Missing comments for parameter origin.
   * TODO: Missing comments for parameter anchor.
   * TODO: Missing comments for parameter url.
   * TODO: Missing comments for parameter size.
   */
  public static native MarkerImage newInstance(String url, Size size, Point origin, Point anchor) /*-{
    return new $wnd.MarkerImage(
      url,
      size,
      origin,
      anchor
    );
  }-*/;

  protected MarkerImage() { }

}