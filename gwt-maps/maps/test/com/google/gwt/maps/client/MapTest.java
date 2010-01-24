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
 * Tests for the Map class.
 */
public class MapTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Map.newInstance(null, null));
  }

  public void testOther() {
    Map obj = Map.newInstance(null, null);
    // Unit Test for fitBounds(LatLngBounds bounds)
    // Unit Test for getBounds()
    assertEquals("getBounds", obj.getBounds(), null);
    // Unit Test for getDiv()
    assertEquals("getDiv", obj.getDiv(), null);
    // Unit Test for panBy(double x, double y)
    // Unit Test for panTo(LatLng latLng)
    // Unit Test for panToBounds(LatLngBounds latLngBounds)
    // Unit Test for setOptions(MapOptions options)
  }

  public void testProperties() {
    Map obj = Map.newInstance(null, null);
    MapTypeId maptypeid = MapTypeId.newInstance();
    obj.setMapTypeId(maptypeid);
    assertSame("maptypeid", obj.getMapTypeId(), maptypeid);
    MVCArray<MapType> overlaymaptypes = MVCArray.newInstance(null);
    obj.setOverlayMapTypes(overlaymaptypes);
    assertSame("overlaymaptypes", obj.getOverlayMapTypes(), overlaymaptypes);
    MapTypeRegistry maptypes = null;
    obj.setMapTypes(maptypes);
    assertSame("maptypes", obj.getMapTypes(), maptypes);
    double zoom = 600813;
    obj.setZoom(zoom);
    assertEquals("zoom", obj.getZoom(), zoom);
    LatLng center = LatLng.newInstance(603813, 603813, true);
    obj.setCenter(center);
    assertSame("center", obj.getCenter(), center);
  }
}
