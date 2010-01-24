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
 * Tests for the GeocoderRequest class.
 */
public class GeocoderRequestTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", GeocoderRequest.newInstance());
  }

  public void testProperties() {
    GeocoderRequest obj = GeocoderRequest.newInstance();
    String language = "myValue";
    obj.setLanguage(language);
    assertEquals("language", obj.getLanguage(), language);
    LatLngBounds bounds = LatLngBounds.newInstance(null, null);
    obj.setBounds(bounds);
    assertSame("bounds", obj.getBounds(), bounds);
    LatLng latlng = LatLng.newInstance(603813, 603813, true);
    obj.setLatLng(latlng);
    assertSame("latlng", obj.getLatLng(), latlng);
    String region = "myValue";
    obj.setRegion(region);
    assertEquals("region", obj.getRegion(), region);
    String address = "myValue";
    obj.setAddress(address);
    assertEquals("address", obj.getAddress(), address);
  }
}
