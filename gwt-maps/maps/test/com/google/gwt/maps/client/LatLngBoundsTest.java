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
 * Tests for the LatLngBounds class.
 */
public class LatLngBoundsTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", LatLngBounds.newInstance(null, null));
  }

  public void testOther() {
    LatLngBounds obj = LatLngBounds.newInstance(null, null);
    // Unit Test for contains(LatLng point)
    // Unit Test for equals(LatLngBounds other)
    // Unit Test for extend(LatLng point)
    // Unit Test for getCenter()
    assertEquals("getCenter", obj.getCenter(), null);
    // Unit Test for getNorthEast()
    assertEquals("getNorthEast", obj.getNorthEast(), null);
    // Unit Test for getSouthWest()
    assertEquals("getSouthWest", obj.getSouthWest(), null);
    // Unit Test for intersects(LatLngBounds other)
    // Unit Test for isEmpty()
    assertEquals("isEmpty", obj.isEmpty(), false);
    // Unit Test for toSpan()
    assertEquals("toSpan", obj.toSpan(), null);
    // Unit Test for toString_()
    assertEquals("toString_", obj.toString_(), "");
    // Unit Test for toUrlValue(double precision)
    // Unit Test for union(LatLngBounds other)
  }
}
