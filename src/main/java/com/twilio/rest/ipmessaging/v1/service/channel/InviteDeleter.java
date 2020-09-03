/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.ipmessaging.v1.service.channel;

import com.twilio.base.Deleter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class InviteDeleter extends Deleter<Invite> {
    private final String pathServiceSid;
    private final String pathChannelSid;
    private final String pathSid;

    /**
     * Construct a new InviteDeleter.
     *
     * @param pathServiceSid The SID of the Service to delete the resource from
     * @param pathChannelSid The SID of the Channel the resource to delete belongs
     *                       to
     * @param pathSid The unique string that identifies the resource
     */
    public InviteDeleter(final String pathServiceSid,
                         final String pathChannelSid,
                         final String pathSid) {
        this.pathServiceSid = pathServiceSid;
        this.pathChannelSid = pathChannelSid;
        this.pathSid = pathSid;
    }

    /**
     * Make the request to the Twilio API to perform the delete.
     *
     * @param client TwilioRestClient with which to make the request
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public boolean delete(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.DELETE,
            Domains.IPMESSAGING.toString(),
            "/v1/Services/" + this.pathServiceSid + "/Channels/" + this.pathChannelSid + "/Invites/" + this.pathSid + ""
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Invite delete failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return response.getStatusCode() == 204;
    }
}