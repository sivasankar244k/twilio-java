/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.autopilot.v1.assistant.task;

import com.twilio.base.Creator;
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
public class FieldCreator extends Creator<Field> {
    private final String pathAssistantSid;
    private final String pathTaskSid;
    private final String fieldType;
    private final String uniqueName;

    /**
     * Construct a new FieldCreator.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         Task associated with the new resource
     * @param pathTaskSid The SID of the
     *                    [Task](https://www.twilio.com/docs/autopilot/api/task)
     *                    resource associated with the new Field resource
     * @param fieldType The Field Type of this field
     * @param uniqueName An application-defined string that uniquely identifies the
     *                   new resource
     */
    public FieldCreator(final String pathAssistantSid,
                        final String pathTaskSid,
                        final String fieldType,
                        final String uniqueName) {
        this.pathAssistantSid = pathAssistantSid;
        this.pathTaskSid = pathTaskSid;
        this.fieldType = fieldType;
        this.uniqueName = uniqueName;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Field
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Field create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.AUTOPILOT.toString(),
            "/v1/Assistants/" + this.pathAssistantSid + "/Tasks/" + this.pathTaskSid + "/Fields"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Field creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Field.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (fieldType != null) {
            request.addPostParam("FieldType", fieldType);
        }

        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
        }
    }
}