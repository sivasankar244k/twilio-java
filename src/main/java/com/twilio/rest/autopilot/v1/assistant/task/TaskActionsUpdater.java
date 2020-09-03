/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.autopilot.v1.assistant.task;

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

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class TaskActionsUpdater extends Updater<TaskActions> {
    private final String pathAssistantSid;
    private final String pathTaskSid;
    private Map<String, Object> actions;

    /**
     * Construct a new TaskActionsUpdater.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         Task for which the task actions to update were
     *                         defined
     * @param pathTaskSid The SID of the Task for which the task actions to update
     *                    were defined
     */
    public TaskActionsUpdater(final String pathAssistantSid,
                              final String pathTaskSid) {
        this.pathAssistantSid = pathAssistantSid;
        this.pathTaskSid = pathTaskSid;
    }

    /**
     * The JSON string that specifies the
     * [actions](https://www.twilio.com/docs/autopilot/actions) that instruct the
     * Assistant on how to perform the task..
     *
     * @param actions The JSON string that specifies the actions that instruct the
     *                Assistant on how to perform the task
     * @return this
     */
    public TaskActionsUpdater setActions(final Map<String, Object> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated TaskActions
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public TaskActions update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.AUTOPILOT.toString(),
            "/v1/Assistants/" + this.pathAssistantSid + "/Tasks/" + this.pathTaskSid + "/Actions"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("TaskActions update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return TaskActions.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (actions != null) {
            request.addPostParam("Actions", Converter.mapToJson(actions));
        }
    }
}