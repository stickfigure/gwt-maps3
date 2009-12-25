/*
 * $Id$
 */

package com.googlecode.maps3.client;


/**
 * The various types of events that happen in maps.
 * 
 * @author Jeff Schnitzer
 */
public enum MapEventType
{
	ZOOM_CHANGED("zoom_changed"),
	CENTER_CHANGED("center_changed"),
	BOUNDS_CHANGED("bounds_changed");
	
	/** The actual text name of the event type in google maps */
	String underlying;
	public String getUnderlying() { return this.underlying; }
	
	/** */
	private MapEventType(String underlying)
	{
		this.underlying = underlying;
	}
}