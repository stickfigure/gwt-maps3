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

package com.google.gwt.maps;

import com.google.gwt.junit.tools.GWTTestSuite;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * TestSuite for GoogleMapsTest.
 */
public class GoogleMapsTestSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("TestSuite for the GoogleMapsTest.");
    suite.addTestSuite(com.google.gwt.maps.client.MapTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MapOptionsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MapTypeIdTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MapTypeControlOptionsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MapTypeControlStyleTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.NavigationControlOptionsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.NavigationControlStyleTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.ScaleControlOptionsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.ScaleControlStyleTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.ControlPositionTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MapPanesTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MapCanvasProjectionTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MarkerTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MarkerOptionsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MarkerImageTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.PolylineTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.PolylineOptionsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.PolygonTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.PolygonOptionsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.InfoWindowTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.InfoWindowOptionsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.GeocoderTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.GeocoderRequestTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.GeocoderResponseTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.GeocoderStatusTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.GeocoderLocationTypeTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsRendererTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsRendererOptionsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsServiceTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsRequestTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsTravelModeTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsUnitSystemTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsWaypointTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsStatusTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsResultTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsTripTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsRouteTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsStepTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsDistanceTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.DirectionsDurationTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.OverlayViewTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MapTypeTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.ImageMapTypeTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.ImageMapTypeOptionsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MapsEventListenerTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.MouseEventTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.LatLngTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.LatLngBoundsTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.PointTest.class);
    suite.addTestSuite(com.google.gwt.maps.client.SizeTest.class);
    return suite;
  }
}
