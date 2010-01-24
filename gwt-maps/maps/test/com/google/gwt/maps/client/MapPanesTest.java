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
 * Tests for the MapPanes class.
 */
public class MapPanesTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MapPanes.newInstance());
  }

  public void testProperties() {
    MapPanes obj = MapPanes.newInstance();
    Element overlaymousetarget = RootPanel.getBodyElement();;
    obj.setOverlayMouseTarget(overlaymousetarget);
    assertSame("overlaymousetarget", obj.getOverlayMouseTarget(), overlaymousetarget);
    Element overlaylayer = RootPanel.getBodyElement();;
    obj.setOverlayLayer(overlaylayer);
    assertSame("overlaylayer", obj.getOverlayLayer(), overlaylayer);
    Element overlayshadow = RootPanel.getBodyElement();;
    obj.setOverlayShadow(overlayshadow);
    assertSame("overlayshadow", obj.getOverlayShadow(), overlayshadow);
    Element overlayimage = RootPanel.getBodyElement();;
    obj.setOverlayImage(overlayimage);
    assertSame("overlayimage", obj.getOverlayImage(), overlayimage);
    Element floatshadow = RootPanel.getBodyElement();;
    obj.setFloatShadow(floatshadow);
    assertSame("floatshadow", obj.getFloatShadow(), floatshadow);
    Element floatpane = RootPanel.getBodyElement();;
    obj.setFloatPane(floatpane);
    assertSame("floatpane", obj.getFloatPane(), floatpane);
    Element mappane = RootPanel.getBodyElement();;
    obj.setMapPane(mappane);
    assertSame("mappane", obj.getMapPane(), mappane);
  }
}
