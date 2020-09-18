/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.chat.v1.service;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class UserCreator extends Creator<User> {
    private final String pathServiceSid;
    private final String identity;
    private String roleSid;
    private String attributes;
    private String friendlyName;

    /**
     * Construct a new UserCreator.
     *
     * @param pathServiceSid The SID of the Service to create the new resource under
     * @param identity The `identity` value that identifies the new resource's User
     */
    public UserCreator(final String pathServiceSid,
                       final String identity) {
        this.pathServiceSid = pathServiceSid;
        this.identity = identity;
    }

    /**
     * The SID of the <a
     * href="https://www.twilio.com/docs/api/chat/rest/roles">Role</a> assigned to
     * the new User..
     *
     * @param roleSid The SID of the Role assigned to this user
     * @return this
     */
    public UserCreator setRoleSid(final String roleSid) {
        this.roleSid = roleSid;
        return this;
    }

    /**
     * A valid JSON string that contains application-specific data..
     *
     * @param attributes A valid JSON string that contains application-specific data
     * @return this
     */
    public UserCreator setAttributes(final String attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * A descriptive string that you create to describe the new resource. This value
     * is often used for display purposes..
     *
     * @param friendlyName A string to describe the new resource
     * @return this
     */
    public UserCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created User
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public User create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.CHAT.toString(),
            "/v1/Services/" + this.pathServiceSid + "/Users"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("User creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return User.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (identity != null) {
            request.addPostParam("Identity", identity);
        }

        if (roleSid != null) {
            request.addPostParam("RoleSid", roleSid);
        }

        if (attributes != null) {
            request.addPostParam("Attributes", attributes);
        }

        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }
    }
}