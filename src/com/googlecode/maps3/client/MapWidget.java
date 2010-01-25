package com.googlecode.maps3.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.AnimatedLayout;
import com.google.gwt.user.client.ui.Widget;

/**
 * Widget wrapper for the MapOverlay
 */
public class MapWidget extends Widget
{
	/** */
	protected MapJSO map;

	/**
	 */
	public MapWidget(MapOptions opts)
	{
		this.setElement(Document.get().createDivElement());
		
		this.map = MapJSO.newInstance(this.getElement(), opts);
	}
	
	/** */
	public MapJSO getMapJSO()
	{
		return this.map;
	}

	/**
	 * Note:  Call this *after* you add it to a LayoutPanel
	 */
	public void fitBounds(LatLngBounds bounds)
	{
		// Doesn't seem to work without this
		this.forceParentLayout(this.getParent());
		
		this.map.fitBounds(bounds);
	}
	
	/**
	 * Recursive method that will fore layout everything from the root down
	 */
	private void forceParentLayout(Widget w)
	{
		if (w == null)
			return;
		else
			forceParentLayout(w.getParent());
		
		if (w instanceof AnimatedLayout)
			((AnimatedLayout)w).forceLayout();
	}

	/**
	 * Using Runnable is probably too simple, it should be replaced with a better interface.
	 */
	public void addListener(MapEventType type, Runnable handler)
	{
		this.map.addListener(type.getUnderlying(), handler);
	}	
}
