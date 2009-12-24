package com.googlecode.maps3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * Overlay for Google Maps v3 InfoWindow options.
 */
public class InfoWindowOptions extends JavaScriptObject
{
	/** Required by overlays */
	protected InfoWindowOptions() {}

	/** Creation */
	public static native InfoWindowOptions newInstance() /*-{
		return {};
	}-*/;

	public final native void setContent(String value) /*-{ this.content = value; }-*/;
	public final native void setContent(Element value) /*-{ this.content = value; }-*/;
	
	public final native void setPixelOffset(int value) /*-{ this.pixelOffset = value; }-*/;
	public final native void setPosition(LatLng value) /*-{ this.position = value; }-*/;
	public final native void setMaxWidth(int value) /*-{ this.maxWidth = value; }-*/;
	public final native void setDisableAutoPan(boolean value) /*-{ this.disableAutoPan = value; }-*/;
	public final native void setZIndex(int value) /*-{ this.zIndex = value; }-*/;
}
