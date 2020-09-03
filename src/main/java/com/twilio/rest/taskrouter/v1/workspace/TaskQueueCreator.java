/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class TaskQueueCreator extends Creator<TaskQueue> {
    private final String pathWorkspaceSid;
    private final String friendlyName;
    private String targetWorkers;
    private Integer maxReservedWorkers;
    private TaskQueue.TaskOrder taskOrder;
    private String reservationActivitySid;
    private String assignmentActivitySid;

    /**
     * Construct a new TaskQueueCreator.
     *
     * @param pathWorkspaceSid The SID of the Workspace that the new TaskQueue
     *                         belongs to
     * @param friendlyName A string to describe the resource
     */
    public TaskQueueCreator(final String pathWorkspaceSid,
                            final String friendlyName) {
        this.pathWorkspaceSid = pathWorkspaceSid;
        this.friendlyName = friendlyName;
    }

    /**
     * A string that describes the Worker selection criteria for any Tasks that
     * enter the TaskQueue. For example, `'"language" == "spanish"'`. The default
     * value is `1==1`. If this value is empty, Tasks will wait in the TaskQueue
     * until they are deleted or moved to another TaskQueue. For more information
     * about Worker selection, see [Describing Worker selection
     * criteria](https://www.twilio.com/docs/taskrouter/api/taskqueues#target-workers)..
     *
     * @param targetWorkers A string describing the Worker selection criteria for
     *                      any Tasks that enter the TaskQueue
     * @return this
     */
    public TaskQueueCreator setTargetWorkers(final String targetWorkers) {
        this.targetWorkers = targetWorkers;
        return this;
    }

    /**
     * The maximum number of Workers to reserve for the assignment of a Task in the
     * queue. Can be an integer between 1 and 50, inclusive and defaults to 1..
     *
     * @param maxReservedWorkers The maximum number of Workers to reserve
     * @return this
     */
    public TaskQueueCreator setMaxReservedWorkers(final Integer maxReservedWorkers) {
        this.maxReservedWorkers = maxReservedWorkers;
        return this;
    }

    /**
     * How Tasks will be assigned to Workers. Set this parameter to `LIFO` to assign
     * most recently created Task first or FIFO to assign the oldest Task first.
     * Default is `FIFO`. [Click
     * here](https://www.twilio.com/docs/taskrouter/queue-ordering-last-first-out-lifo) to learn more..
     *
     * @param taskOrder How Tasks will be assigned to Workers
     * @return this
     */
    public TaskQueueCreator setTaskOrder(final TaskQueue.TaskOrder taskOrder) {
        this.taskOrder = taskOrder;
        return this;
    }

    /**
     * The SID of the Activity to assign Workers when a task is reserved for them..
     *
     * @param reservationActivitySid The SID of the Activity to assign Workers when
     *                               a task is reserved for them
     * @return this
     */
    public TaskQueueCreator setReservationActivitySid(final String reservationActivitySid) {
        this.reservationActivitySid = reservationActivitySid;
        return this;
    }

    /**
     * The SID of the Activity to assign Workers when a task is assigned to them..
     *
     * @param assignmentActivitySid The SID of the Activity to assign Workers once
     *                              a task is assigned to them
     * @return this
     */
    public TaskQueueCreator setAssignmentActivitySid(final String assignmentActivitySid) {
        this.assignmentActivitySid = assignmentActivitySid;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created TaskQueue
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public TaskQueue create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.TASKROUTER.toString(),
            "/v1/Workspaces/" + this.pathWorkspaceSid + "/TaskQueues"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("TaskQueue creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return TaskQueue.fromJson(response.getStream(), client.getObjectMapper());
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

        if (targetWorkers != null) {
            request.addPostParam("TargetWorkers", targetWorkers);
        }

        if (maxReservedWorkers != null) {
            request.addPostParam("MaxReservedWorkers", maxReservedWorkers.toString());
        }

        if (taskOrder != null) {
            request.addPostParam("TaskOrder", taskOrder.toString());
        }

        if (reservationActivitySid != null) {
            request.addPostParam("ReservationActivitySid", reservationActivitySid);
        }

        if (assignmentActivitySid != null) {
            request.addPostParam("AssignmentActivitySid", assignmentActivitySid);
        }
    }
}