/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1.room.participant;

import com.twilio.base.Updater;
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

public class SubscribeRulesUpdater extends Updater<SubscribeRules> {
    private final String pathRoomSid;
    private final String pathParticipantSid;
    private Map<String, Object> rules;

    /**
     * Construct a new SubscribeRulesUpdater.
     *
     * @param pathRoomSid The SID of the Room resource where the subscribe rules to
     *                    update apply
     * @param pathParticipantSid The SID of the Participant resource to update the
     *                           Subscribe Rules
     */
    public SubscribeRulesUpdater(final String pathRoomSid,
                                 final String pathParticipantSid) {
        this.pathRoomSid = pathRoomSid;
        this.pathParticipantSid = pathParticipantSid;
    }

    /**
     * A JSON-encoded array of subscribe rules. See the [Specifying Subscribe
     * Rules](https://www.twilio.com/docs/video/api/track-subscriptions#specifying-sr) section for further information..
     *
     * @param rules A JSON-encoded array of subscribe rules
     * @return this
     */
    public SubscribeRulesUpdater setRules(final Map<String, Object> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated SubscribeRules
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public SubscribeRules update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.VIDEO.toString(),
            "/v1/Rooms/" + this.pathRoomSid + "/Participants/" + this.pathParticipantSid + "/SubscribeRules"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("SubscribeRules update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return SubscribeRules.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (rules != null) {
            request.addPostParam("Rules", Converter.mapToJson(rules));
        }
    }
}