package com.googlecode.maps3.demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.googlecode.maps3.client.LatLng;
import com.googlecode.maps3.client.LatLngBounds;
import com.googlecode.maps3.client.MapOptions;
import com.googlecode.maps3.client.MapWidget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Demo implements EntryPoint
{
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{
		MapOptions opts = MapOptions.newInstance();
		opts.setMapTypeId();
//		opts.setCenter(LatLng.newInstance(37.760773,-122.434448));
//		opts.setZoom(14);
		
		MapWidget map = new MapWidget(opts);

		LatLngBounds bounds = LatLngBounds.newInstance();
		bounds.extend(LatLng.newInstance(37.660773,-122.534448));
		bounds.extend(LatLng.newInstance(37.860773,-122.334448));
		
		RootLayoutPanel.get().add(map);
		
		map.fitBounds(bounds);
	}
}
