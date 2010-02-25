/*
 * $Id$
 */

package com.googlecode.maps3.client;


/**
 * The various types of events that happen in maps and map objects.
 * 
 * @author Jeff Schnitzer
 */
public enum MapEventType
{
	ZOOM_CHANGED("zoom_changed"),
	CENTER_CHANGED("center_changed"),
	BOUNDS_CHANGED("bounds_changed"),
	CLICK("click"),
	DBL_CLICK("dblclick"),
	MOUSE_UP("mouseup"),
	MOUSE_DOWN("mousedown"),
	MOUSE_OVER("mouseover"),
	MOUSE_OUT("mouseout"),
	MOUSE_MOVE("mousemove");
	
	/** The actual text name of the event type in google maps */
	String underlying;
	public String getUnderlying() { return this.underlying; }
	
	/** */
	private MapEventType(String underlying)
	{
		this.underlying = underlying;
	}
}