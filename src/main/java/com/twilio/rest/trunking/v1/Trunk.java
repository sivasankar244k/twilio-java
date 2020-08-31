/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.trunking.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Trunk extends Resource {
    private static final long serialVersionUID = 237038422793901L;

    public enum RecordingSetting {
        DO_NOT_RECORD("do-not-record"),
        RECORD_FROM_RINGING("record-from-ringing"),
        RECORD_FROM_ANSWER("record-from-answer");

        private final String value;

        private RecordingSetting(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a RecordingSetting from a string.
         * @param value string value
         * @return generated RecordingSetting
         */
        @JsonCreator
        public static RecordingSetting forValue(final String value) {
            return Promoter.enumFromString(value, RecordingSetting.values());
        }
    }

    /**
     * Create a TrunkFetcher to execute fetch.
     *
     * @param pathSid The unique string that identifies the resource
     * @return TrunkFetcher capable of executing the fetch
     */
    public static TrunkFetcher fetcher(final String pathSid) {
        return new TrunkFetcher(pathSid);
    }

    /**
     * Create a TrunkDeleter to execute delete.
     *
     * @param pathSid The unique string that identifies the resource
     * @return TrunkDeleter capable of executing the delete
     */
    public static TrunkDeleter deleter(final String pathSid) {
        return new TrunkDeleter(pathSid);
    }

    /**
     * Create a TrunkCreator to execute create.
     *
     * @return TrunkCreator capable of executing the create
     */
    public static TrunkCreator creator() {
        return new TrunkCreator();
    }

    /**
     * Create a TrunkReader to execute read.
     *
     * @return TrunkReader capable of executing the read
     */
    public static TrunkReader reader() {
        return new TrunkReader();
    }

    /**
     * Create a TrunkUpdater to execute update.
     *
     * @param pathSid The unique string that identifies the resource
     * @return TrunkUpdater capable of executing the update
     */
    public static TrunkUpdater updater(final String pathSid) {
        return new TrunkUpdater(pathSid);
    }

    /**
     * Converts a JSON String into a Trunk object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Trunk object represented by the provided JSON
     */
    public static Trunk fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Trunk.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Trunk object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Trunk object represented by the provided JSON
     */
    public static Trunk fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Trunk.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String domainName;
    private final HttpMethod disasterRecoveryMethod;
    private final URI disasterRecoveryUrl;
    private final String friendlyName;
    private final Boolean secure;
    private final Map<String, Object> recording;
    private final Boolean cnamLookupEnabled;
    private final String authType;
    private final List<String> authTypeSet;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String sid;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Trunk(@JsonProperty("account_sid")
                  final String accountSid,
                  @JsonProperty("domain_name")
                  final String domainName,
                  @JsonProperty("disaster_recovery_method")
                  final HttpMethod disasterRecoveryMethod,
                  @JsonProperty("disaster_recovery_url")
                  final URI disasterRecoveryUrl,
                  @JsonProperty("friendly_name")
                  final String friendlyName,
                  @JsonProperty("secure")
                  final Boolean secure,
                  @JsonProperty("recording")
                  final Map<String, Object> recording,
                  @JsonProperty("cnam_lookup_enabled")
                  final Boolean cnamLookupEnabled,
                  @JsonProperty("auth_type")
                  final String authType,
                  @JsonProperty("auth_type_set")
                  final List<String> authTypeSet,
                  @JsonProperty("date_created")
                  final String dateCreated,
                  @JsonProperty("date_updated")
                  final String dateUpdated,
                  @JsonProperty("sid")
                  final String sid,
                  @JsonProperty("url")
                  final URI url,
                  @JsonProperty("links")
                  final Map<String, String> links) {
        this.accountSid = accountSid;
        this.domainName = domainName;
        this.disasterRecoveryMethod = disasterRecoveryMethod;
        this.disasterRecoveryUrl = disasterRecoveryUrl;
        this.friendlyName = friendlyName;
        this.secure = secure;
        this.recording = recording;
        this.cnamLookupEnabled = cnamLookupEnabled;
        this.authType = authType;
        this.authTypeSet = authTypeSet;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.sid = sid;
        this.url = url;
        this.links = links;
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
     * Returns The unique address you reserve on Twilio to which you route your SIP
     * traffic.
     *
     * @return The unique address you reserve on Twilio to which you route your SIP
     *         traffic
     */
    public final String getDomainName() {
        return this.domainName;
    }

    /**
     * Returns The HTTP method we use to call the disaster_recovery_url.
     *
     * @return The HTTP method we use to call the disaster_recovery_url
     */
    public final HttpMethod getDisasterRecoveryMethod() {
        return this.disasterRecoveryMethod;
    }

    /**
     * Returns The HTTP URL that we call if an error occurs while sending SIP
     * traffic towards your configured Origination URL.
     *
     * @return The HTTP URL that we call if an error occurs while sending SIP
     *         traffic towards your configured Origination URL
     */
    public final URI getDisasterRecoveryUrl() {
        return this.disasterRecoveryUrl;
    }

    /**
     * Returns The string that you assigned to describe the resource.
     *
     * @return The string that you assigned to describe the resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns Whether Secure Trunking is enabled for the trunk.
     *
     * @return Whether Secure Trunking is enabled for the trunk
     */
    public final Boolean getSecure() {
        return this.secure;
    }

    /**
     * Returns The recording settings for the trunk.
     *
     * @return The recording settings for the trunk
     */
    public final Map<String, Object> getRecording() {
        return this.recording;
    }

    /**
     * Returns Whether Caller ID Name (CNAM) lookup is enabled for the trunk.
     *
     * @return Whether Caller ID Name (CNAM) lookup is enabled for the trunk
     */
    public final Boolean getCnamLookupEnabled() {
        return this.cnamLookupEnabled;
    }

    /**
     * Returns The types of authentication mapped to the domain.
     *
     * @return The types of authentication mapped to the domain
     */
    public final String getAuthType() {
        return this.authType;
    }

    /**
     * Returns Reserved.
     *
     * @return Reserved
     */
    public final List<String> getAuthTypeSet() {
        return this.authTypeSet;
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
     * Returns The unique string that identifies the resource.
     *
     * @return The unique string that identifies the resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The absolute URL of the resource.
     *
     * @return The absolute URL of the resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The URLs of related resources.
     *
     * @return The URLs of related resources
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Trunk other = (Trunk) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(domainName, other.domainName) &&
               Objects.equals(disasterRecoveryMethod, other.disasterRecoveryMethod) &&
               Objects.equals(disasterRecoveryUrl, other.disasterRecoveryUrl) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(secure, other.secure) &&
               Objects.equals(recording, other.recording) &&
               Objects.equals(cnamLookupEnabled, other.cnamLookupEnabled) &&
               Objects.equals(authType, other.authType) &&
               Objects.equals(authTypeSet, other.authTypeSet) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            domainName,
                            disasterRecoveryMethod,
                            disasterRecoveryUrl,
                            friendlyName,
                            secure,
                            recording,
                            cnamLookupEnabled,
                            authType,
                            authTypeSet,
                            dateCreated,
                            dateUpdated,
                            sid,
                            url,
                            links);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("domainName", domainName)
                          .add("disasterRecoveryMethod", disasterRecoveryMethod)
                          .add("disasterRecoveryUrl", disasterRecoveryUrl)
                          .add("friendlyName", friendlyName)
                          .add("secure", secure)
                          .add("recording", recording)
                          .add("cnamLookupEnabled", cnamLookupEnabled)
                          .add("authType", authType)
                          .add("authTypeSet", authTypeSet)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("sid", sid)
                          .add("url", url)
                          .add("links", links)
                          .toString();
    }
}