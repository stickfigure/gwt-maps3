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
 * Tests for the DirectionsRoute class.
 */
public class DirectionsRouteTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", DirectionsRoute.newInstance());
  }

  public void testProperties() {
    DirectionsRoute obj = DirectionsRoute.newInstance();
    DirectionsDistance distance = DirectionsDistance.newInstance();
    obj.setDistance(distance);
    assertSame("distance", obj.getDistance(), distance);
    GeocoderResponse start_geocode = GeocoderResponse.newInstance();
    obj.setStart_geocode(start_geocode);
    assertSame("start_geocode", obj.getStart_geocode(), start_geocode);
    GeocoderResponse end_geocode = GeocoderResponse.newInstance();
    obj.setEnd_geocode(end_geocode);
    assertSame("end_geocode", obj.getEnd_geocode(), end_geocode);
    DirectionsStep[] steps = new DirectionsStep[]{ DirectionsStep.newInstance() };
    obj.setSteps(steps);
    assertEquals("steps", obj.getSteps().length, steps.length);
    DirectionsDuration duration = DirectionsDuration.newInstance();
    obj.setDuration(duration);
    assertSame("duration", obj.getDuration(), duration);
  }
}
