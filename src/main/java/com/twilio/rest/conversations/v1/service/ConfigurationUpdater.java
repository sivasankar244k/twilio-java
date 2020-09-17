/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1.service;

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
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class ConfigurationUpdater extends Updater<Configuration> {
    private final String pathChatServiceSid;
    private String defaultConversationCreatorRoleSid;
    private String defaultConversationRoleSid;
    private String defaultChatServiceRoleSid;

    /**
     * Construct a new ConfigurationUpdater.
     *
     * @param pathChatServiceSid The SID of the Service configuration resource to
     *                           update
     */
    public ConfigurationUpdater(final String pathChatServiceSid) {
        this.pathChatServiceSid = pathChatServiceSid;
    }

    /**
     * The role assigned to a conversation creator when they join a new
     * conversation. See the [Role
     * resource](https://www.twilio.com/docs/chat/rest/role-resource) for more info
     * about roles..
     *
     * @param defaultConversationCreatorRoleSid The role assigned to a conversation
     *                                          creator when they join a new
     *                                          conversation
     * @return this
     */
    public ConfigurationUpdater setDefaultConversationCreatorRoleSid(final String defaultConversationCreatorRoleSid) {
        this.defaultConversationCreatorRoleSid = defaultConversationCreatorRoleSid;
        return this;
    }

    /**
     * The role assigned to users when they are added to a conversation. See the
     * [Role resource](https://www.twilio.com/docs/chat/rest/role-resource) for more
     * info about roles..
     *
     * @param defaultConversationRoleSid The role assigned to users when they are
     *                                   added to a conversation
     * @return this
     */
    public ConfigurationUpdater setDefaultConversationRoleSid(final String defaultConversationRoleSid) {
        this.defaultConversationRoleSid = defaultConversationRoleSid;
        return this;
    }

    /**
     * The service role assigned to users when they are added to the service. See
     * the [Role resource](https://www.twilio.com/docs/chat/rest/role-resource) for
     * more info about roles..
     *
     * @param defaultChatServiceRoleSid The service role assigned to users when
     *                                  they are added to the service
     * @return this
     */
    public ConfigurationUpdater setDefaultChatServiceRoleSid(final String defaultChatServiceRoleSid) {
        this.defaultChatServiceRoleSid = defaultChatServiceRoleSid;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated Configuration
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Configuration update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.CONVERSATIONS.toString(),
            "/v1/Services/" + this.pathChatServiceSid + "/Configuration"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Configuration update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Configuration.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (defaultConversationCreatorRoleSid != null) {
            request.addPostParam("DefaultConversationCreatorRoleSid", defaultConversationCreatorRoleSid);
        }

        if (defaultConversationRoleSid != null) {
            request.addPostParam("DefaultConversationRoleSid", defaultConversationRoleSid);
        }

        if (defaultChatServiceRoleSid != null) {
            request.addPostParam("DefaultChatServiceRoleSid", defaultChatServiceRoleSid);
        }
    }
}