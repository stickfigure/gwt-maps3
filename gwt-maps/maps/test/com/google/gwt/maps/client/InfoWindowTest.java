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
 * Tests for the InfoWindow class.
 */
public class InfoWindowTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", InfoWindow.newInstance(null));
  }

  public void testOther() {
    // Unit Test for close()
    // Unit Test for open(Map map, MVCObject anchor)
    // Unit Test for setContent(Element content)
    // Unit Test for setOptions(InfoWindowOptions options)
  }

  public void testProperties() {
    InfoWindow obj = InfoWindow.newInstance(null);
    LatLng position = LatLng.newInstance(603813, 603813, true);
    obj.setPosition(position);
    assertSame("position", obj.getPosition(), position);
    String content = "myValue";
    obj.setContent(content);
    assertEquals("content", obj.getContent(), content);
    double zindex = 600813;
    obj.setZIndex(zindex);
    assertEquals("zindex", obj.getZIndex(), zindex);
  }
}
