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
 * Tests for the OverlayView class.
 */
public class OverlayViewTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", OverlayView.newInstance());
  }

  public void testOther() {
    OverlayView obj = OverlayView.newInstance();
    // Unit Test for draw()
    // Unit Test for getPanes()
    assertEquals("getPanes", obj.getPanes(), null);
    // Unit Test for getProjection()
    assertEquals("getProjection", obj.getProjection(), null);
    // Unit Test for onAdd()
    // Unit Test for onRemove()
  }

  public void testProperties() {
    OverlayView obj = OverlayView.newInstance();
    Map map = Map.newInstance(null, null);
    obj.setMap(map);
    assertSame("map", obj.getMap(), map);
  }
}
