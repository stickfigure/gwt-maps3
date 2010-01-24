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
 * Tests for the LatLng class.
 */
public class LatLngTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", LatLng.newInstance(603813, 603813, true));
  }

  public void testOther() {
    LatLng obj = LatLng.newInstance(603813, 603813, true);
    // Unit Test for equals(LatLng other)
    // Unit Test for lat()
    assertEquals("lat", obj.lat(), 0);
    // Unit Test for lng()
    assertEquals("lng", obj.lng(), 0);
    // Unit Test for toString_()
    assertEquals("toString_", obj.toString_(), "");
    // Unit Test for toUrlValue(double precision)
  }
}
