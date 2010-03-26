package com.googlecode.maps3.demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.googlecode.maps3.client.InfoWindow;
import com.googlecode.maps3.client.InfoWindowJSO;
import com.googlecode.maps3.client.LatLng;
import com.googlecode.maps3.client.LatLngBounds;
import com.googlecode.maps3.client.MapOptions;
import com.googlecode.maps3.client.MapWidget;
import com.googlecode.maps3.client.auto.Geocoder;
import com.googlecode.maps3.client.auto.GeocoderCallback;
import com.googlecode.maps3.client.auto.GeocoderRequest;
import com.googlecode.maps3.client.auto.GeocoderResponse;
import com.googlecode.maps3.client.auto.GeocoderStatus;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Demo implements EntryPoint
{
	TextBox latLonBox;
	InfoWindow infoWindow;
	
	ClickHandler handler1 = new ClickHandler() {
		@Override
		public void onClick(ClickEvent event)
		{
			FlowPanel alternate = new FlowPanel();
			alternate.add(new Button("ToHandler2", handler2));
			infoWindow.setContent(alternate);
		}
	};
	
	ClickHandler handler2 = new ClickHandler() {
		@Override
		public void onClick(ClickEvent event)
		{
			FlowPanel alternate = new FlowPanel();
			alternate.add(new Button("ToHandler1", handler1));
			infoWindow.setContent(alternate);
		}
	};
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{
		MapOptions opts = MapOptions.newInstance();
		opts.setMapTypeId();
//		opts.setCenter(LatLng.newInstance(37.760773,-122.434448));
//		opts.setZoom(14);
		
		DockLayoutPanel mainDock = new DockLayoutPanel(Unit.EM);
		RootLayoutPanel.get().add(mainDock);
		
		FlowPanel controls = new FlowPanel();
		controls.setStyleName("controls");
		mainDock.addNorth(controls, 2);
		
		final MapWidget map = new MapWidget(opts);
		mainDock.add(map);

		LatLngBounds bounds = LatLngBounds.newInstance();
		bounds.extend(LatLng.newInstance(37.660773,-122.534448));
		bounds.extend(LatLng.newInstance(37.860773,-122.334448));
		map.fitBounds(bounds);
		
		// Add the controls
		latLonBox = new TextBox();
		latLonBox.setText("37,-122");
		controls.add(latLonBox);
		
		controls.add(new Button("Switching InfoWindow", new ClickHandler() {
			@Override
			public void onClick(ClickEvent event)
			{
				initInfoWindow();
				
				FlowPanel panel = new FlowPanel();
				panel.add(new Button("Click Me", handler1));
				
				infoWindow.setContent(panel);
				infoWindow.open(map.getMapJSO());
			}
		}));
		
		controls.add(new Button("Expanding InfoWindow", new ClickHandler() {
			@Override
			public void onClick(ClickEvent event)
			{
				initInfoWindow();

				final FlowPanel panel = new FlowPanel();
				panel.add(new Button("Click Me", new ClickHandler() {
					@Override
					public void onClick(ClickEvent event)
					{
						// Doesn't work
						panel.clear();
						panel.add(new Label("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
						infoWindow.setContent(panel);

						// Works
//						FlowPanel nextPanel = new FlowPanel();
//						nextPanel.add(new Label("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
//						infoWindow.setContent(nextPanel);
					}
				}));
				
				infoWindow.setContent(panel);
				infoWindow.open(map.getMapJSO());
			}
		}));
		
		controls.add(new Button("Reverse Geocode", new ClickHandler() {
			@Override
			public void onClick(ClickEvent event)
			{
				String latLonStr = latLonBox.getText();
				String[] split = latLonStr.split(",");
				
				float lat = Float.parseFloat(split[0]);
				float lon = Float.parseFloat(split[1]);
				final LatLng point = LatLng.newInstance(lat, lon);
				
				map.getMapJSO().panTo(point);
				
				GeocoderRequest request = GeocoderRequest.newInstance();
				request.setLatLng(point);
				
				GWT.log("Geocoding " + point, null);
				
				Geocoder geocoder = Geocoder.newInstance();
				geocoder.geocode(request, new GeocoderCallback() {
					@Override
					public void callback(JsArray<GeocoderResponse> responses, GeocoderStatus status)
					{
						GWT.log("Got callback with status " + status, null);
						
						if (status.equals(GeocoderStatus.OK))
						{
							InfoWindowJSO info = InfoWindowJSO.newInstance();
							info.setPosition(point);
							if (responses.length() > 0)
							{
								info.setContent(responses.get(0).toString());
							}
							else
							{
								info.setContent("No results from geocoder");
							}
							
							info.open(map.getMapJSO());
						}
						else
						{
							Window.alert("Geocoder failed: " + status);
						}
					}
				});
			}
		}));
	}
	
	/**
	 * Initialize the infoWindow variable
	 */
	void initInfoWindow()
	{
		String latLonStr = latLonBox.getText();
		String[] split = latLonStr.split(",");
		
		float lat = Float.parseFloat(split[0]);
		float lon = Float.parseFloat(split[1]);
		final LatLng point = LatLng.newInstance(lat, lon);
		
		infoWindow = new InfoWindow();
		infoWindow.setPosition(point);
	}
}
