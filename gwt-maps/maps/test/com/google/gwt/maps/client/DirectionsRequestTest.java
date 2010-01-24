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
 * Tests for the DirectionsRequest class.
 */
public class DirectionsRequestTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", DirectionsRequest.newInstance());
  }

  public void testOther() {
    // Unit Test for setDestination(String destination)
    // Unit Test for setOrigin(String origin)
  }

  public void testProperties() {
    DirectionsRequest obj = DirectionsRequest.newInstance();
    DirectionsUnitSystem unitsystem = DirectionsUnitSystem.newInstance();
    obj.setUnitSystem(unitsystem);
    assertSame("unitsystem", obj.getUnitSystem(), unitsystem);
    LatLng origin = LatLng.newInstance(603813, 603813, true);
    obj.setOrigin(origin);
    assertSame("origin", obj.getOrigin(), origin);
    LatLng destination = LatLng.newInstance(603813, 603813, true);
    obj.setDestination(destination);
    assertSame("destination", obj.getDestination(), destination);
    DirectionsTravelMode travelmode = DirectionsTravelMode.newInstance();
    obj.setTravelMode(travelmode);
    assertSame("travelmode", obj.getTravelMode(), travelmode);
    String region = "myValue";
    obj.setRegion(region);
    assertEquals("region", obj.getRegion(), region);
    DirectionsWaypoint[] waypoints = new DirectionsWaypoint[]{ DirectionsWaypoint.newInstance() };
    obj.setWaypoints(waypoints);
    assertEquals("waypoints", obj.getWaypoints().length, waypoints.length);
    boolean providetripalternatives = true;
    obj.setProvideTripAlternatives(providetripalternatives);
    assertSame("providetripalternatives", obj.getProvideTripAlternatives(), providetripalternatives);
  }
}
