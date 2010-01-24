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
 * Tests for the ImageMapTypeOptions class.
 */
public class ImageMapTypeOptionsTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", ImageMapTypeOptions.newInstance());
  }

  public void testProperties() {
    ImageMapTypeOptions obj = ImageMapTypeOptions.newInstance();
    String name = "myValue";
    obj.setName(name);
    assertEquals("name", obj.getName(), name);
    String alt = "myValue";
    obj.setAlt(alt);
    assertEquals("alt", obj.getAlt(), alt);
    Function(Point, number):string gettileurl = null;
    obj.setGetTileUrl(gettileurl);
    assertSame("gettileurl", obj.getGetTileUrl(), gettileurl);
    Size tilesize = Size.newInstance(603813, 603813, "myValue", "myValue");
    obj.setTileSize(tilesize);
    assertSame("tilesize", obj.getTileSize(), tilesize);
    double minzoom = 600813;
    obj.setMinZoom(minzoom);
    assertEquals("minzoom", obj.getMinZoom(), minzoom);
    double maxzoom = 600813;
    obj.setMaxZoom(maxzoom);
    assertEquals("maxzoom", obj.getMaxZoom(), maxzoom);
    boolean ispng = true;
    obj.setIsPng(ispng);
    assertSame("ispng", obj.getIsPng(), ispng);
  }
}
