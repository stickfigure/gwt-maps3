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
 * Tests for the DirectionsStep class.
 */
public class DirectionsStepTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", DirectionsStep.newInstance());
  }

  public void testProperties() {
    DirectionsStep obj = DirectionsStep.newInstance();
    String instructions = "myValue";
    obj.setInstructions(instructions);
    assertEquals("instructions", obj.getInstructions(), instructions);
    DirectionsDistance distance = DirectionsDistance.newInstance();
    obj.setDistance(distance);
    assertSame("distance", obj.getDistance(), distance);
    LatLng end_point = LatLng.newInstance(603813, 603813, true);
    obj.setEnd_point(end_point);
    assertSame("end_point", obj.getEnd_point(), end_point);
    LatLng start_point = LatLng.newInstance(603813, 603813, true);
    obj.setStart_point(start_point);
    assertSame("start_point", obj.getStart_point(), start_point);
    LatLng[] lat_lngs = new LatLng[]{ LatLng.newInstance(603813, 603813, true) };
    obj.setLat_lngs(lat_lngs);
    assertEquals("lat_lngs", obj.getLat_lngs().length, lat_lngs.length);
    DirectionsDuration duration = DirectionsDuration.newInstance();
    obj.setDuration(duration);
    assertSame("duration", obj.getDuration(), duration);
  }
}
