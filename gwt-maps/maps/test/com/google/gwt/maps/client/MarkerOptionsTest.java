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
 * Tests for the MarkerOptions class.
 */
public class MarkerOptionsTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MarkerOptions.newInstance());
  }

  public void testOther() {
    MarkerOptions obj = MarkerOptions.newInstance();
    // Unit Test for getIcon()
    assertEquals("getIcon", obj.getIcon(), null);
    // Unit Test for setIcon( icon)
    // Unit Test for getShadow()
    assertEquals("getShadow", obj.getShadow(), null);
    // Unit Test for setShadow( shadow)
  }

  public void testProperties() {
    MarkerOptions obj = MarkerOptions.newInstance();
    Map map = Map.newInstance(null, null);
    obj.setMap(map);
    assertSame("map", obj.getMap(), map);
    boolean draggable = true;
    obj.setDraggable(draggable);
    assertSame("draggable", obj.getDraggable(), draggable);
    LatLng position = LatLng.newInstance(603813, 603813, true);
    obj.setPosition(position);
    assertSame("position", obj.getPosition(), position);
    JavaScriptObject shape = null;
    obj.setShape(shape);
    assertSame("shape", obj.getShape(), shape);
    boolean flat = true;
    obj.setFlat(flat);
    assertSame("flat", obj.getFlat(), flat);
    String title = "myValue";
    obj.setTitle(title);
    assertEquals("title", obj.getTitle(), title);
    boolean visible = true;
    obj.setVisible(visible);
    assertSame("visible", obj.getVisible(), visible);
    boolean clickable = true;
    obj.setClickable(clickable);
    assertSame("clickable", obj.getClickable(), clickable);
    String cursor = "myValue";
    obj.setCursor(cursor);
    assertEquals("cursor", obj.getCursor(), cursor);
    double zindex = 600813;
    obj.setZIndex(zindex);
    assertEquals("zindex", obj.getZIndex(), zindex);
  }
}