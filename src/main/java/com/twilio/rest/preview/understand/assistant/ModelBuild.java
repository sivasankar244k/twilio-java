/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.understand.assistant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelBuild extends Resource {
    private static final long serialVersionUID = 48078492703405L;

    public enum Status {
        ENQUEUED("enqueued"),
        BUILDING("building"),
        COMPLETED("completed"),
        FAILED("failed"),
        CANCELED("canceled");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Status from a string.
         * @param value string value
         * @return generated Status
         */
        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    /**
     * Create a ModelBuildFetcher to execute fetch.
     *
     * @param pathAssistantSid The assistant_sid
     * @param pathSid The sid
     * @return ModelBuildFetcher capable of executing the fetch
     */
    public static ModelBuildFetcher fetcher(final String pathAssistantSid,
                                            final String pathSid) {
        return new ModelBuildFetcher(pathAssistantSid, pathSid);
    }

    /**
     * Create a ModelBuildReader to execute read.
     *
     * @param pathAssistantSid The assistant_sid
     * @return ModelBuildReader capable of executing the read
     */
    public static ModelBuildReader reader(final String pathAssistantSid) {
        return new ModelBuildReader(pathAssistantSid);
    }

    /**
     * Create a ModelBuildCreator to execute create.
     *
     * @param pathAssistantSid The assistant_sid
     * @return ModelBuildCreator capable of executing the create
     */
    public static ModelBuildCreator creator(final String pathAssistantSid) {
        return new ModelBuildCreator(pathAssistantSid);
    }

    /**
     * Create a ModelBuildUpdater to execute update.
     *
     * @param pathAssistantSid The assistant_sid
     * @param pathSid The sid
     * @return ModelBuildUpdater capable of executing the update
     */
    public static ModelBuildUpdater updater(final String pathAssistantSid,
                                            final String pathSid) {
        return new ModelBuildUpdater(pathAssistantSid, pathSid);
    }

    /**
     * Create a ModelBuildDeleter to execute delete.
     *
     * @param pathAssistantSid The assistant_sid
     * @param pathSid The sid
     * @return ModelBuildDeleter capable of executing the delete
     */
    public static ModelBuildDeleter deleter(final String pathAssistantSid,
                                            final String pathSid) {
        return new ModelBuildDeleter(pathAssistantSid, pathSid);
    }

    /**
     * Converts a JSON String into a ModelBuild object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return ModelBuild object represented by the provided JSON
     */
    public static ModelBuild fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ModelBuild.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a ModelBuild object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return ModelBuild object represented by the provided JSON
     */
    public static ModelBuild fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ModelBuild.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String assistantSid;
    private final String sid;
    private final ModelBuild.Status status;
    private final String uniqueName;
    private final URI url;
    private final Integer buildDuration;
    private final Integer errorCode;

    @JsonCreator
    private ModelBuild(@JsonProperty("account_sid")
                       final String accountSid,
                       @JsonProperty("date_created")
                       final String dateCreated,
                       @JsonProperty("date_updated")
                       final String dateUpdated,
                       @JsonProperty("assistant_sid")
                       final String assistantSid,
                       @JsonProperty("sid")
                       final String sid,
                       @JsonProperty("status")
                       final ModelBuild.Status status,
                       @JsonProperty("unique_name")
                       final String uniqueName,
                       @JsonProperty("url")
                       final URI url,
                       @JsonProperty("build_duration")
                       final Integer buildDuration,
                       @JsonProperty("error_code")
                       final Integer errorCode) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.assistantSid = assistantSid;
        this.sid = sid;
        this.status = status;
        this.uniqueName = uniqueName;
        this.url = url;
        this.buildDuration = buildDuration;
        this.errorCode = errorCode;
    }

    /**
     * Returns The unique ID of the Account that created this Model Build..
     *
     * @return The unique ID of the Account that created this Model Build.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The date that this resource was created.
     *
     * @return The date that this resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date that this resource was last updated.
     *
     * @return The date that this resource was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The unique ID of the parent Assistant..
     *
     * @return The unique ID of the parent Assistant.
     */
    public final String getAssistantSid() {
        return this.assistantSid;
    }

    /**
     * Returns A 34 character string that uniquely identifies this resource..
     *
     * @return A 34 character string that uniquely identifies this resource.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns A string that described the model build status. The values can be:
     * enqueued, building, completed, failed.
     *
     * @return A string that described the model build status. The values can be:
     *         enqueued, building, completed, failed
     */
    public final ModelBuild.Status getStatus() {
        return this.status;
    }

    /**
     * Returns A user-provided string that uniquely identifies this resource as an
     * alternative to the sid. Unique up to 64 characters long..
     *
     * @return A user-provided string that uniquely identifies this resource as an
     *         alternative to the sid. Unique up to 64 characters long.
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The url.
     *
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The time in seconds it took to build the model..
     *
     * @return The time in seconds it took to build the model.
     */
    public final Integer getBuildDuration() {
        return this.buildDuration;
    }

    /**
     * Returns The error_code.
     *
     * @return The error_code
     */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ModelBuild other = (ModelBuild) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(assistantSid, other.assistantSid) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(status, other.status) &&
               Objects.equals(uniqueName, other.uniqueName) &&
               Objects.equals(url, other.url) &&
               Objects.equals(buildDuration, other.buildDuration) &&
               Objects.equals(errorCode, other.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            assistantSid,
                            sid,
                            status,
                            uniqueName,
                            url,
                            buildDuration,
                            errorCode);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("assistantSid", assistantSid)
                          .add("sid", sid)
                          .add("status", status)
                          .add("uniqueName", uniqueName)
                          .add("url", url)
                          .add("buildDuration", buildDuration)
                          .add("errorCode", errorCode)
                          .toString();
    }
}