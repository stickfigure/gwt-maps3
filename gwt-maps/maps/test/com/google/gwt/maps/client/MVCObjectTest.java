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
 * Tests for the MVCObject class.
 */
public class MVCObjectTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MVCObject.newInstance());
  }

  public void testOther() {
    // Unit Test for bindTo(String key, MVCObject target, String targetKey, boolean noNotify)
    // Unit Test for changed(String key)
    // Unit Test for get(String key)
    // Unit Test for notify(String key)
    // Unit Test for set(String key, * value)
    // Unit Test for setValues(JavaScriptObject values)
    // Unit Test for unbind(String key)
    // Unit Test for unbindAll()
  }
}
