/*******************************************************************************
 * Copyright (c) 2008, 2010 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   VMware Inc. - initial contribution
 *******************************************************************************/

package org.eclipse.virgo.nano.config.internal;

import java.util.Map;
import java.util.Properties;

import org.osgi.service.cm.ConfigurationAdmin;

/**
 * Represents a source for configuration properties. These configuration properties will be exported to
 * {@link ConfigurationAdmin} under the kernel PID.
 * <p />
 * 
 * <strong>Concurrent Semantics</strong><br />
 * 
 * Implementations must be threadsafe.
 * 
 */
public interface PropertiesSource {

    /**
     * Gets all the configuration properties from this source.
     * <p/>
     * Each entry in the map represents one configuration. The entry key is the PID of the configuration, and the entry
     * value is the properties to be exposed under that PID.
     * 
     * @return all configuration properties from this source.
     */
    Map<String, Properties> getConfigurationProperties();

}
