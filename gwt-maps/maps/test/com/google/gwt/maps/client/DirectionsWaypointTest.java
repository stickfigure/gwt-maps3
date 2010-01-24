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
 * Tests for the DirectionsWaypoint class.
 */
public class DirectionsWaypointTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", DirectionsWaypoint.newInstance());
  }

  public void testOther() {
    // Unit Test for setLocation(String location)
  }

  public void testProperties() {
    DirectionsWaypoint obj = DirectionsWaypoint.newInstance();
    LatLng location = LatLng.newInstance(603813, 603813, true);
    obj.setLocation(location);
    assertSame("location", obj.getLocation(), location);
    boolean stopover = true;
    obj.setStopover(stopover);
    assertSame("stopover", obj.getStopover(), stopover);
  }
}
