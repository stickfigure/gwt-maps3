package com.googlecode.maps3.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;

/**
 * Widget wrapper for the MapOverlay
 */
public class MapWidget extends Widget
{
	/** */
	MapOverlay map;

	/**
	 */
	public MapWidget(MapOptions opts)
	{
		this.setElement(Document.get().createDivElement());
		
		this.map = MapOverlay.newInstance(this.getElement(), opts);
	}
	
	/** */
	public void fitBounds(LatLngBounds bounds)
	{
		this.map.fitBounds(bounds);
	}
}
