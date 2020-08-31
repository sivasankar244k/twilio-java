/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.autopilot.v1.assistant;

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
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         resource to fetch
     * @param pathSid The unique string that identifies the resource
     * @return ModelBuildFetcher capable of executing the fetch
     */
    public static ModelBuildFetcher fetcher(final String pathAssistantSid,
                                            final String pathSid) {
        return new ModelBuildFetcher(pathAssistantSid, pathSid);
    }

    /**
     * Create a ModelBuildReader to execute read.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         resources to read
     * @return ModelBuildReader capable of executing the read
     */
    public static ModelBuildReader reader(final String pathAssistantSid) {
        return new ModelBuildReader(pathAssistantSid);
    }

    /**
     * Create a ModelBuildCreator to execute create.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         new resource
     * @return ModelBuildCreator capable of executing the create
     */
    public static ModelBuildCreator creator(final String pathAssistantSid) {
        return new ModelBuildCreator(pathAssistantSid);
    }

    /**
     * Create a ModelBuildUpdater to execute update.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         resource to update
     * @param pathSid The unique string that identifies the resource to update
     * @return ModelBuildUpdater capable of executing the update
     */
    public static ModelBuildUpdater updater(final String pathAssistantSid,
                                            final String pathSid) {
        return new ModelBuildUpdater(pathAssistantSid, pathSid);
    }

    /**
     * Create a ModelBuildDeleter to execute delete.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         resources to delete
     * @param pathSid The unique string that identifies the resource
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
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The RFC 2822 date and time in GMT when the resource was created.
     *
     * @return The RFC 2822 date and time in GMT when the resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The RFC 2822 date and time in GMT when the resource was last updated.
     *
     * @return The RFC 2822 date and time in GMT when the resource was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The SID of the Assistant that is the parent of the resource.
     *
     * @return The SID of the Assistant that is the parent of the resource
     */
    public final String getAssistantSid() {
        return this.assistantSid;
    }

    /**
     * Returns The unique string that identifies the resource.
     *
     * @return The unique string that identifies the resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The status of the model build process.
     *
     * @return The status of the model build process
     */
    public final ModelBuild.Status getStatus() {
        return this.status;
    }

    /**
     * Returns An application-defined string that uniquely identifies the resource.
     *
     * @return An application-defined string that uniquely identifies the resource
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The absolute URL of the ModelBuild resource.
     *
     * @return The absolute URL of the ModelBuild resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The time in seconds it took to build the model.
     *
     * @return The time in seconds it took to build the model
     */
    public final Integer getBuildDuration() {
        return this.buildDuration;
    }

    /**
     * Returns More information about why the model build failed, if `status` is
     * `failed`.
     *
     * @return More information about why the model build failed, if `status` is
     *         `failed`
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