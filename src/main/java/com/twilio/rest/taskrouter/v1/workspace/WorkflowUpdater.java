/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Updater;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;

public class WorkflowUpdater extends Updater<Workflow> {
    private final String pathWorkspaceSid;
    private final String pathSid;
    private String friendlyName;
    private URI assignmentCallbackUrl;
    private URI fallbackAssignmentCallbackUrl;
    private String configuration;
    private Integer taskReservationTimeout;
    private String reEvaluateTasks;

    /**
     * Construct a new WorkflowUpdater.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Workflow to update
     * @param pathSid The SID of the resource
     */
    public WorkflowUpdater(final String pathWorkspaceSid,
                           final String pathSid) {
        this.pathWorkspaceSid = pathWorkspaceSid;
        this.pathSid = pathSid;
    }

    /**
     * A descriptive string that you create to describe the Workflow resource. For
     * example, `Inbound Call Workflow` or `2014 Outbound Campaign`..
     *
     * @param friendlyName  descriptive string that you create to describe the
     *                     Workflow resource
     * @return this
     */
    public WorkflowUpdater setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * The URL from your application that will process task assignment events. See
     * <a
     * href="https://www.twilio.com/docs/taskrouter/handle-assignment-callbacks">Handling
     * Task Assignment Callback</a> for more details..
     *
     * @param assignmentCallbackUrl The URL from your application that will process
     *                              task assignment events
     * @return this
     */
    public WorkflowUpdater setAssignmentCallbackUrl(final URI assignmentCallbackUrl) {
        this.assignmentCallbackUrl = assignmentCallbackUrl;
        return this;
    }

    /**
     * The URL from your application that will process task assignment events. See
     * <a
     * href="https://www.twilio.com/docs/taskrouter/handle-assignment-callbacks">Handling
     * Task Assignment Callback</a> for more details..
     *
     * @param assignmentCallbackUrl The URL from your application that will process
     *                              task assignment events
     * @return this
     */
    public WorkflowUpdater setAssignmentCallbackUrl(final String assignmentCallbackUrl) {
        return setAssignmentCallbackUrl(Promoter.uriFromString(assignmentCallbackUrl));
    }

    /**
     * The URL that we should call when a call to the `assignment_callback_url`
     * fails..
     *
     * @param fallbackAssignmentCallbackUrl The URL that we should call when a call
     *                                      to the `assignment_callback_url` fails
     * @return this
     */
    public WorkflowUpdater setFallbackAssignmentCallbackUrl(final URI fallbackAssignmentCallbackUrl) {
        this.fallbackAssignmentCallbackUrl = fallbackAssignmentCallbackUrl;
        return this;
    }

    /**
     * The URL that we should call when a call to the `assignment_callback_url`
     * fails..
     *
     * @param fallbackAssignmentCallbackUrl The URL that we should call when a call
     *                                      to the `assignment_callback_url` fails
     * @return this
     */
    public WorkflowUpdater setFallbackAssignmentCallbackUrl(final String fallbackAssignmentCallbackUrl) {
        return setFallbackAssignmentCallbackUrl(Promoter.uriFromString(fallbackAssignmentCallbackUrl));
    }

    /**
     * A JSON string that contains the rules to apply to the Workflow. See <a
     * href="https://www.twilio.com/docs/taskrouter/workflow-configuration">Configuring
     * Workflows</a> for more information..
     *
     * @param configuration A JSON string that contains the rules to apply to the
     *                      Workflow
     * @return this
     */
    public WorkflowUpdater setConfiguration(final String configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * How long TaskRouter will wait for a confirmation response from your
     * application after it assigns a Task to a Worker. Can be up to `86,400` (24
     * hours) and the default is `120`..
     *
     * @param taskReservationTimeout How long TaskRouter will wait for a
     *                               confirmation response from your application
     *                               after it assigns a Task to a Worker
     * @return this
     */
    public WorkflowUpdater setTaskReservationTimeout(final Integer taskReservationTimeout) {
        this.taskReservationTimeout = taskReservationTimeout;
        return this;
    }

    /**
     * Whether or not to re-evaluate Tasks. The default is `false`, which means
     * Tasks in the Workflow will not be processed through the assignment loop
     * again..
     *
     * @param reEvaluateTasks Whether or not to re-evaluate Tasks
     * @return this
     */
    public WorkflowUpdater setReEvaluateTasks(final String reEvaluateTasks) {
        this.reEvaluateTasks = reEvaluateTasks;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated Workflow
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Workflow update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.TASKROUTER.toString(),
            "/v1/Workspaces/" + this.pathWorkspaceSid + "/Workflows/" + this.pathSid + ""
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Workflow update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Workflow.fromJson(response.getStream(), client.getObjectMapper());
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

        if (assignmentCallbackUrl != null) {
            request.addPostParam("AssignmentCallbackUrl", assignmentCallbackUrl.toString());
        }

        if (fallbackAssignmentCallbackUrl != null) {
            request.addPostParam("FallbackAssignmentCallbackUrl", fallbackAssignmentCallbackUrl.toString());
        }

        if (configuration != null) {
            request.addPostParam("Configuration", configuration);
        }

        if (taskReservationTimeout != null) {
            request.addPostParam("TaskReservationTimeout", taskReservationTimeout.toString());
        }

        if (reEvaluateTasks != null) {
            request.addPostParam("ReEvaluateTasks", reEvaluateTasks);
        }
    }
}