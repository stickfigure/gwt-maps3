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
 * Tests for the MapTypeControlOptions class.
 */
public class MapTypeControlOptionsTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MapTypeControlOptions.newInstance());
  }

  public void testOther() {
    // Unit Test for setMapTypeIds(MapTypeId mapTypeIds)
  }

  public void testProperties() {
    MapTypeControlOptions obj = MapTypeControlOptions.newInstance();
    MapTypeControlStyle style = MapTypeControlStyle.newInstance();
    obj.setStyle(style);
    assertSame("style", obj.getStyle(), style);
    ControlPosition position = ControlPosition.newInstance();
    obj.setPosition(position);
    assertSame("position", obj.getPosition(), position);
    string> maptypeids = null;
    obj.setMapTypeIds(maptypeids);
    assertSame("maptypeids", obj.getMapTypeIds(), maptypeids);
  }
}
