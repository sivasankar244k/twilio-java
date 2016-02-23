package com.twilio.sdk.updaters.taskrouter.v1.workspace.task;

import com.twilio.sdk.clients.TwilioRestClient;
import com.twilio.sdk.converters.Promoter;
import com.twilio.sdk.exceptions.ApiConnectionException;
import com.twilio.sdk.exceptions.ApiException;
import com.twilio.sdk.http.HttpMethod;
import com.twilio.sdk.http.Request;
import com.twilio.sdk.http.Response;
import com.twilio.sdk.resources.RestException;
import com.twilio.sdk.resources.taskrouter.v1.workspace.task.Reservation;
import com.twilio.sdk.updaters.Updater;

import java.net.URI;

public class ReservationUpdater extends Updater<Reservation> {
    private final String workspaceSid;
    private final String taskSid;
    private final String sid;
    private final String reservationStatus;
    private String workerActivitySid;
    private String instruction;
    private String dequeuePostWorkActivitySid;
    private String dequeueFrom;
    private String dequeueRecord;
    private Integer dequeueTimeout;
    private String dequeueTo;
    private URI dequeueStatusCallbackUrl;
    private String callFrom;
    private String callRecord;
    private Integer callTimeout;
    private String callTo;
    private URI callUrl;
    private URI callStatusCallbackUrl;
    private Boolean callAccept;
    private String redirectCallSid;
    private Boolean redirectAccept;
    private URI redirectUrl;

    /**
     * Construct a new ReservationUpdater.
     * 
     * @param workspaceSid The workspace_sid
     * @param taskSid The task_sid
     * @param sid The sid
     * @param reservationStatus The reservation_status
     */
    public ReservationUpdater(final String workspaceSid, final String taskSid, final String sid, final String reservationStatus) {
        this.workspaceSid = workspaceSid;
        this.taskSid = taskSid;
        this.sid = sid;
        this.reservationStatus = reservationStatus;
    }

    /**
     * The worker_activity_sid.
     * 
     * @param workerActivitySid The worker_activity_sid
     * @return this
     */
    public ReservationUpdater setWorkerActivitySid(final String workerActivitySid) {
        this.workerActivitySid = workerActivitySid;
        return this;
    }

    /**
     * The instruction.
     * 
     * @param instruction The instruction
     * @return this
     */
    public ReservationUpdater setInstruction(final String instruction) {
        this.instruction = instruction;
        return this;
    }

    /**
     * The dequeue_post_work_activity_sid.
     * 
     * @param dequeuePostWorkActivitySid The dequeue_post_work_activity_sid
     * @return this
     */
    public ReservationUpdater setDequeuePostWorkActivitySid(final String dequeuePostWorkActivitySid) {
        this.dequeuePostWorkActivitySid = dequeuePostWorkActivitySid;
        return this;
    }

    /**
     * The dequeue_from.
     * 
     * @param dequeueFrom The dequeue_from
     * @return this
     */
    public ReservationUpdater setDequeueFrom(final String dequeueFrom) {
        this.dequeueFrom = dequeueFrom;
        return this;
    }

    /**
     * The dequeue_record.
     * 
     * @param dequeueRecord The dequeue_record
     * @return this
     */
    public ReservationUpdater setDequeueRecord(final String dequeueRecord) {
        this.dequeueRecord = dequeueRecord;
        return this;
    }

    /**
     * The dequeue_timeout.
     * 
     * @param dequeueTimeout The dequeue_timeout
     * @return this
     */
    public ReservationUpdater setDequeueTimeout(final Integer dequeueTimeout) {
        this.dequeueTimeout = dequeueTimeout;
        return this;
    }

    /**
     * The dequeue_to.
     * 
     * @param dequeueTo The dequeue_to
     * @return this
     */
    public ReservationUpdater setDequeueTo(final String dequeueTo) {
        this.dequeueTo = dequeueTo;
        return this;
    }

    /**
     * The dequeue_status_callback_url.
     * 
     * @param dequeueStatusCallbackUrl The dequeue_status_callback_url
     * @return this
     */
    public ReservationUpdater setDequeueStatusCallbackUrl(final URI dequeueStatusCallbackUrl) {
        this.dequeueStatusCallbackUrl = dequeueStatusCallbackUrl;
        return this;
    }

    /**
     * The dequeue_status_callback_url.
     * 
     * @param dequeueStatusCallbackUrl The dequeue_status_callback_url
     * @return this
     */
    public ReservationUpdater setDequeueStatusCallbackUrl(final String dequeueStatusCallbackUrl) {
        return setDequeueStatusCallbackUrl(Promoter.uriFromString(dequeueStatusCallbackUrl));
    }

    /**
     * The call_from.
     * 
     * @param callFrom The call_from
     * @return this
     */
    public ReservationUpdater setCallFrom(final String callFrom) {
        this.callFrom = callFrom;
        return this;
    }

    /**
     * The call_record.
     * 
     * @param callRecord The call_record
     * @return this
     */
    public ReservationUpdater setCallRecord(final String callRecord) {
        this.callRecord = callRecord;
        return this;
    }

    /**
     * The call_timeout.
     * 
     * @param callTimeout The call_timeout
     * @return this
     */
    public ReservationUpdater setCallTimeout(final Integer callTimeout) {
        this.callTimeout = callTimeout;
        return this;
    }

    /**
     * The call_to.
     * 
     * @param callTo The call_to
     * @return this
     */
    public ReservationUpdater setCallTo(final String callTo) {
        this.callTo = callTo;
        return this;
    }

    /**
     * The call_url.
     * 
     * @param callUrl The call_url
     * @return this
     */
    public ReservationUpdater setCallUrl(final URI callUrl) {
        this.callUrl = callUrl;
        return this;
    }

    /**
     * The call_url.
     * 
     * @param callUrl The call_url
     * @return this
     */
    public ReservationUpdater setCallUrl(final String callUrl) {
        return setCallUrl(Promoter.uriFromString(callUrl));
    }

    /**
     * The call_status_callback_url.
     * 
     * @param callStatusCallbackUrl The call_status_callback_url
     * @return this
     */
    public ReservationUpdater setCallStatusCallbackUrl(final URI callStatusCallbackUrl) {
        this.callStatusCallbackUrl = callStatusCallbackUrl;
        return this;
    }

    /**
     * The call_status_callback_url.
     * 
     * @param callStatusCallbackUrl The call_status_callback_url
     * @return this
     */
    public ReservationUpdater setCallStatusCallbackUrl(final String callStatusCallbackUrl) {
        return setCallStatusCallbackUrl(Promoter.uriFromString(callStatusCallbackUrl));
    }

    /**
     * The call_accept.
     * 
     * @param callAccept The call_accept
     * @return this
     */
    public ReservationUpdater setCallAccept(final Boolean callAccept) {
        this.callAccept = callAccept;
        return this;
    }

    /**
     * The redirect_call_sid.
     * 
     * @param redirectCallSid The redirect_call_sid
     * @return this
     */
    public ReservationUpdater setRedirectCallSid(final String redirectCallSid) {
        this.redirectCallSid = redirectCallSid;
        return this;
    }

    /**
     * The redirect_accept.
     * 
     * @param redirectAccept The redirect_accept
     * @return this
     */
    public ReservationUpdater setRedirectAccept(final Boolean redirectAccept) {
        this.redirectAccept = redirectAccept;
        return this;
    }

    /**
     * The redirect_url.
     * 
     * @param redirectUrl The redirect_url
     * @return this
     */
    public ReservationUpdater setRedirectUrl(final URI redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * The redirect_url.
     * 
     * @param redirectUrl The redirect_url
     * @return this
     */
    public ReservationUpdater setRedirectUrl(final String redirectUrl) {
        return setRedirectUrl(Promoter.uriFromString(redirectUrl));
    }

    /**
     * Make the request to the Twilio API to perform the update.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Updated Reservation
     */
    @Override
    public Reservation execute(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            TwilioRestClient.Domains.TASKROUTER,
            "/v1/Workspaces/" + this.workspaceSid + "/Tasks/" + this.taskSid + "/Reservations/" + this.sid + "",
            client.getAccountSid()
        );
        
        addPostParams(request);
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("Reservation update failed: Unable to connect to server");
        } else if (response.getStatusCode() != TwilioRestClient.HTTP_STATUS_CODE_OK) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
        
            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }
        
        return Reservation.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (reservationStatus != null) {
            request.addPostParam("ReservationStatus", reservationStatus);
        }
        
        if (workerActivitySid != null) {
            request.addPostParam("WorkerActivitySid", workerActivitySid);
        }
        
        if (instruction != null) {
            request.addPostParam("Instruction", instruction);
        }
        
        if (dequeuePostWorkActivitySid != null) {
            request.addPostParam("DequeuePostWorkActivitySid", dequeuePostWorkActivitySid);
        }
        
        if (dequeueFrom != null) {
            request.addPostParam("DequeueFrom", dequeueFrom);
        }
        
        if (dequeueRecord != null) {
            request.addPostParam("DequeueRecord", dequeueRecord);
        }
        
        if (dequeueTimeout != null) {
            request.addPostParam("DequeueTimeout", dequeueTimeout.toString());
        }
        
        if (dequeueTo != null) {
            request.addPostParam("DequeueTo", dequeueTo);
        }
        
        if (dequeueStatusCallbackUrl != null) {
            request.addPostParam("DequeueStatusCallbackUrl", dequeueStatusCallbackUrl.toString());
        }
        
        if (callFrom != null) {
            request.addPostParam("CallFrom", callFrom);
        }
        
        if (callRecord != null) {
            request.addPostParam("CallRecord", callRecord);
        }
        
        if (callTimeout != null) {
            request.addPostParam("CallTimeout", callTimeout.toString());
        }
        
        if (callTo != null) {
            request.addPostParam("CallTo", callTo);
        }
        
        if (callUrl != null) {
            request.addPostParam("CallUrl", callUrl.toString());
        }
        
        if (callStatusCallbackUrl != null) {
            request.addPostParam("CallStatusCallbackUrl", callStatusCallbackUrl.toString());
        }
        
        if (callAccept != null) {
            request.addPostParam("CallAccept", callAccept.toString());
        }
        
        if (redirectCallSid != null) {
            request.addPostParam("RedirectCallSid", redirectCallSid);
        }
        
        if (redirectAccept != null) {
            request.addPostParam("RedirectAccept", redirectAccept.toString());
        }
        
        if (redirectUrl != null) {
            request.addPostParam("RedirectUrl", redirectUrl.toString());
        }
    }
}