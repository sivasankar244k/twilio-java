/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.serverless.v1.service.environment;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class VariableUpdater extends Updater<Variable> {
    private final String pathServiceSid;
    private final String pathEnvironmentSid;
    private final String pathSid;
    private String key;
    private String value;

    /**
     * Construct a new VariableUpdater.
     *
     * @param pathServiceSid The SID of the Service to update the Variable resource
     *                       under
     * @param pathEnvironmentSid The SID of the environment with the Variable
     *                           resource to update
     * @param pathSid The SID of the Variable resource to update
     */
    public VariableUpdater(final String pathServiceSid,
                           final String pathEnvironmentSid,
                           final String pathSid) {
        this.pathServiceSid = pathServiceSid;
        this.pathEnvironmentSid = pathEnvironmentSid;
        this.pathSid = pathSid;
    }

    /**
     * A string by which the Variable resource can be referenced. Must be less than
     * 128 characters long..
     *
     * @param key A string by which the Variable resource can be referenced
     * @return this
     */
    public VariableUpdater setKey(final String key) {
        this.key = key;
        return this;
    }

    /**
     * A string that contains the actual value of the variable. Must have less than
     * 450 bytes..
     *
     * @param value A string that contains the actual value of the variable
     * @return this
     */
    public VariableUpdater setValue(final String value) {
        this.value = value;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated Variable
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Variable update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.SERVERLESS.toString(),
            "/v1/Services/" + this.pathServiceSid + "/Environments/" + this.pathEnvironmentSid + "/Variables/" + this.pathSid + ""
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Variable update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Variable.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (key != null) {
            request.addPostParam("Key", key);
        }

        if (value != null) {
            request.addPostParam("Value", value);
        }
    }
}