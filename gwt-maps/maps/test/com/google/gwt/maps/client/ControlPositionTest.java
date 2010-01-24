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
 * Tests for the ControlPosition class.
 */
public class ControlPositionTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstants() {
    assertNotNull("BOTTOM", ControlPosition.BOTTOM);
    assertNotNull("BOTTOM_LEFT", ControlPosition.BOTTOM_LEFT);
    assertNotNull("BOTTOM_RIGHT", ControlPosition.BOTTOM_RIGHT);
    assertNotNull("LEFT", ControlPosition.LEFT);
    assertNotNull("RIGHT", ControlPosition.RIGHT);
    assertNotNull("TOP", ControlPosition.TOP);
    assertNotNull("TOP_LEFT", ControlPosition.TOP_LEFT);
    assertNotNull("TOP_RIGHT", ControlPosition.TOP_RIGHT);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", ControlPosition.newInstance());
  }
}
