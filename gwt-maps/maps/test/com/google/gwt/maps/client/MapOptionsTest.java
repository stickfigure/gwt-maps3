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
 * Tests for the MapOptions class.
 */
public class MapOptionsTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MapOptions.newInstance());
  }

  public void testProperties() {
    MapOptions obj = MapOptions.newInstance();
    MapTypeControlOptions maptypecontroloptions = MapTypeControlOptions.newInstance();
    obj.setMapTypeControlOptions(maptypecontroloptions);
    assertSame("maptypecontroloptions", obj.getMapTypeControlOptions(), maptypecontroloptions);
    boolean scalecontrol = true;
    obj.setScaleControl(scalecontrol);
    assertSame("scalecontrol", obj.getScaleControl(), scalecontrol);
    boolean scrollwheel = true;
    obj.setScrollwheel(scrollwheel);
    assertSame("scrollwheel", obj.getScrollwheel(), scrollwheel);
    ScaleControlOptions scalecontroloptions = ScaleControlOptions.newInstance();
    obj.setScaleControlOptions(scalecontroloptions);
    assertSame("scalecontroloptions", obj.getScaleControlOptions(), scalecontroloptions);
    double zoom = 600813;
    obj.setZoom(zoom);
    assertEquals("zoom", obj.getZoom(), zoom);
    boolean draggable = true;
    obj.setDraggable(draggable);
    assertSame("draggable", obj.getDraggable(), draggable);
    String backgroundcolor = "myValue";
    obj.setBackgroundColor(backgroundcolor);
    assertEquals("backgroundcolor", obj.getBackgroundColor(), backgroundcolor);
    MapTypeId maptypeid = MapTypeId.newInstance();
    obj.setMapTypeId(maptypeid);
    assertSame("maptypeid", obj.getMapTypeId(), maptypeid);
    boolean disabledoubleclickzoom = true;
    obj.setDisableDoubleClickZoom(disabledoubleclickzoom);
    assertSame("disabledoubleclickzoom", obj.getDisableDoubleClickZoom(), disabledoubleclickzoom);
    LatLng center = LatLng.newInstance(603813, 603813, true);
    obj.setCenter(center);
    assertSame("center", obj.getCenter(), center);
    String draggingcursor = "myValue";
    obj.setDraggingCursor(draggingcursor);
    assertEquals("draggingcursor", obj.getDraggingCursor(), draggingcursor);
    boolean noclear = true;
    obj.setNoClear(noclear);
    assertSame("noclear", obj.getNoClear(), noclear);
    boolean navigationcontrol = true;
    obj.setNavigationControl(navigationcontrol);
    assertSame("navigationcontrol", obj.getNavigationControl(), navigationcontrol);
    boolean maptypecontrol = true;
    obj.setMapTypeControl(maptypecontrol);
    assertSame("maptypecontrol", obj.getMapTypeControl(), maptypecontrol);
    boolean disabledefaultui = true;
    obj.setDisableDefaultUI(disabledefaultui);
    assertSame("disabledefaultui", obj.getDisableDefaultUI(), disabledefaultui);
    String draggablecursor = "myValue";
    obj.setDraggableCursor(draggablecursor);
    assertEquals("draggablecursor", obj.getDraggableCursor(), draggablecursor);
    NavigationControlOptions navigationcontroloptions = NavigationControlOptions.newInstance();
    obj.setNavigationControlOptions(navigationcontroloptions);
    assertSame("navigationcontroloptions", obj.getNavigationControlOptions(), navigationcontroloptions);
    boolean keyboardshortcuts = true;
    obj.setKeyboardShortcuts(keyboardshortcuts);
    assertSame("keyboardshortcuts", obj.getKeyboardShortcuts(), keyboardshortcuts);
  }
}
