package org.genivi.pki;
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Copyright (c) 2016 Jaguar Land Rover.
 *
 * This program is licensed under the terms and conditions of the
 * Mozilla Public License, version 2.0. The full text of the
 * Mozilla Public License is at https://www.mozilla.org/MPL/2.0/
 *
 * File:    PSVerificationNeededResponse.java
 * Project: PKI
 *
 * Created by Lilli Szafranski on 10/13/16.
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import com.google.gson.annotations.SerializedName;

/**
 * Object that represents the body of a verification needed response from the provisioning server.
 */
public class PSVerificationNeededResponse extends ProvisioningServerResponse
{
    @SerializedName("message")
    private String mMessage = "";

    /**
     * Constructor.
     */
    public PSVerificationNeededResponse() {
    }

    /**
     * Gets the message.
     * @return The message.
     */
    public String getMessage() {
        return mMessage;
    }
}
