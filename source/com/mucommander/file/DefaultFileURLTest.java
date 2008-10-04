/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2008 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.file;

import com.mucommander.auth.AuthenticationTypes;
import com.mucommander.auth.Credentials;

/**
 * A {@link FileURLTestCase} implementation for URLs with no specific handler, i.e. using the
 * {@link com.mucommander.file.FileURL#getDefaultHandler() default URL handler}.
 *
 * @author Maxence Bernard
 */
public class DefaultFileURLTest extends FileURLTestCase {

    ////////////////////////////////////
    // FileURLTestCase implementation //
    ////////////////////////////////////

    protected String getScheme() {
        return "unknown";
    }

    protected int getDefaultPort() {
        return -1;
    }

    protected int getAuthenticationType() {
        return AuthenticationTypes.NO_AUTHENTICATION;
    }

    protected Credentials getGuestCredentials() {
        return null;
    }

    protected String getPathSeparator() {
        return "/";
    }

    protected String getTildeReplacement() {
        return null;
    }

    protected boolean isQueryParsed() {
        return false;
    }
}