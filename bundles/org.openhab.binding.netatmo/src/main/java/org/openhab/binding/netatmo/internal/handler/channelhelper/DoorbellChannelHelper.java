/**
 * Copyright (c) 2010-2022 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.netatmo.internal.handler.channelhelper;

import static org.openhab.binding.netatmo.internal.NetatmoBindingConstants.*;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link DoorbellChannelHelper} handles specific channels of doorbells
 *
 * @author Gaël L'hopital - Initial contribution
 *
 */
@NonNullByDefault
public class DoorbellChannelHelper extends CameraChannelHelper {

    public DoorbellChannelHelper() {
        super(GROUP_DOORBELL_STATUS, GROUP_DOORBELL_LIVE);
    }
}
