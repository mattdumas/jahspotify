package jahspotify.service;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 *        or more contributor license agreements.  See the NOTICE file
 *        distributed with this work for additional information
 *        regarding copyright ownership.  The ASF licenses this file
 *        to you under the Apache License, Version 2.0 (the
 *        "License"); you may not use this file except in compliance
 *        with the License.  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *        Unless required by applicable law or agreed to in writing,
 *        software distributed under the License is distributed on an
 *        "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *        KIND, either express or implied.  See the License for the
 *        specific language governing permissions and limitations
 *        under the License.
 */

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Johan Lindquist
 */
public class SpotiseekResultContentHandler extends DefaultHandler
{
    private enum TAG
    {
        TRACKS, TRACK, ARTIST, ALBUM
    }

    private TAG _currentTag;

    @Override
    public void startDocument() throws SAXException
    {
        super.startDocument();
    }

    @Override
    public void startElement(final String uri, final String localName, final String qName, final Attributes attributes) throws SAXException
    {
    }
}
