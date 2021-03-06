/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.numbers.v2.regulatorycompliance;

import com.twilio.base.Creator;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.util.Map;

public class EndUserCreator extends Creator<EndUser> {
    private final String friendlyName;
    private final EndUser.Type type;
    private Map<String, Object> attributes;

    /**
     * Construct a new EndUserCreator.
     *
     * @param friendlyName The string that you assigned to describe the resource
     * @param type The type of end user of the Bundle resource
     */
    public EndUserCreator(final String friendlyName,
                          final EndUser.Type type) {
        this.friendlyName = friendlyName;
        this.type = type;
    }

    /**
     * The set of parameters that are the attributes of the End User resource which
     * are derived End User Types..
     *
     * @param attributes The set of parameters that compose the End User resource
     * @return this
     */
    public EndUserCreator setAttributes(final Map<String, Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created EndUser
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public EndUser create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.NUMBERS.toString(),
            "/v2/RegulatoryCompliance/EndUsers"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("EndUser creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return EndUser.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (type != null) {
            request.addPostParam("Type", type.toString());
        }

        if (attributes != null) {
            request.addPostParam("Attributes", Converter.mapToJson(attributes));
        }
    }
}