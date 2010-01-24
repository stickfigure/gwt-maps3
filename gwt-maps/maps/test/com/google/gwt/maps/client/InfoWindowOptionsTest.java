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

import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Tests for the InfoWindowOptions class.
 */
public class InfoWindowOptionsTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", InfoWindowOptions.newInstance());
  }

  public void testOther() {
    // Unit Test for setContent(String content)
  }

  public void testProperties() {
    InfoWindowOptions obj = InfoWindowOptions.newInstance();
    LatLng position = LatLng.newInstance(603813, 603813, true);
    obj.setPosition(position);
    assertSame("position", obj.getPosition(), position);
    Element content = RootPanel.getBodyElement();;
    obj.setContent(content);
    assertSame("content", obj.getContent(), content);
    boolean disableautopan = true;
    obj.setDisableAutoPan(disableautopan);
    assertSame("disableautopan", obj.getDisableAutoPan(), disableautopan);
    Size pixeloffset = Size.newInstance(603813, 603813, "myValue", "myValue");
    obj.setPixelOffset(pixeloffset);
    assertSame("pixeloffset", obj.getPixelOffset(), pixeloffset);
    double maxwidth = 600813;
    obj.setMaxWidth(maxwidth);
    assertEquals("maxwidth", obj.getMaxWidth(), maxwidth);
    double zindex = 600813;
    obj.setZIndex(zindex);
    assertEquals("zindex", obj.getZIndex(), zindex);
  }
}
