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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the MapCanvasProjection class.
 */
public class MapCanvasProjectionTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MapCanvasProjection.newInstance());
  }

  public void testOther() {
    MapCanvasProjection obj = MapCanvasProjection.newInstance();
    // Unit Test for fromContainerPixelToLatLng(Point pixel)
    // Unit Test for fromDivPixelToLatLng(Point pixel)
    // Unit Test for fromLatLngToContainerPixel(LatLng latLng)
    // Unit Test for fromLatLngToDivPixel(LatLng latLng)
    // Unit Test for getWorldWidth()
    assertEquals("getWorldWidth", obj.getWorldWidth(), 0);
  }
}
