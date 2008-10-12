package com.svgobjects;
/*
 * Copyright (c) 2001 ravi@svgobjects.com. All rights reserved.
 *
 * The code in this file are subject to the Artistic License:
 * http://www.svgobjects.com/documentation/reference/Copyright.html
 */
import com.webobjects.foundation.*;
import com.webobjects.appserver.*;

/*
 * SVG <tref...></tref>
 * additional bindings of the form "$key" are placed in the style string.
 */
@Deprecated
public class SOTextReference extends SODynamicElement {
    /*
     * constructors
     */
    public SOTextReference(String name, NSDictionary associations, WOElement element) {
        super(name, associations, element);

        // set the tag
        super.elementName = "tref";
    }
}