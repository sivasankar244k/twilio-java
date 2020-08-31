/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.messaging.v1;

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
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Service extends Resource {
    private static final long serialVersionUID = 155674022160031L;

    public enum ScanMessageContent {
        INHERIT("inherit"),
        ENABLE("enable"),
        DISABLE("disable");

        private final String value;

        private ScanMessageContent(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a ScanMessageContent from a string.
         * @param value string value
         * @return generated ScanMessageContent
         */
        @JsonCreator
        public static ScanMessageContent forValue(final String value) {
            return Promoter.enumFromString(value, ScanMessageContent.values());
        }
    }

    /**
     * Create a ServiceCreator to execute create.
     *
     * @param friendlyName A string to describe the resource
     * @return ServiceCreator capable of executing the create
     */
    public static ServiceCreator creator(final String friendlyName) {
        return new ServiceCreator(friendlyName);
    }

    /**
     * Create a ServiceUpdater to execute update.
     *
     * @param pathSid The SID that identifies the resource to update
     * @return ServiceUpdater capable of executing the update
     */
    public static ServiceUpdater updater(final String pathSid) {
        return new ServiceUpdater(pathSid);
    }

    /**
     * Create a ServiceReader to execute read.
     *
     * @return ServiceReader capable of executing the read
     */
    public static ServiceReader reader() {
        return new ServiceReader();
    }

    /**
     * Create a ServiceFetcher to execute fetch.
     *
     * @param pathSid The SID that identifies the resource to fetch
     * @return ServiceFetcher capable of executing the fetch
     */
    public static ServiceFetcher fetcher(final String pathSid) {
        return new ServiceFetcher(pathSid);
    }

    /**
     * Create a ServiceDeleter to execute delete.
     *
     * @param pathSid The SID that identifies the resource to delete
     * @return ServiceDeleter capable of executing the delete
     */
    public static ServiceDeleter deleter(final String pathSid) {
        return new ServiceDeleter(pathSid);
    }

    /**
     * Converts a JSON String into a Service object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Service object represented by the provided JSON
     */
    public static Service fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Service.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Service object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Service object represented by the provided JSON
     */
    public static Service fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Service.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI inboundRequestUrl;
    private final HttpMethod inboundMethod;
    private final URI fallbackUrl;
    private final HttpMethod fallbackMethod;
    private final URI statusCallback;
    private final Boolean stickySender;
    private final Boolean mmsConverter;
    private final Boolean smartEncoding;
    private final Service.ScanMessageContent scanMessageContent;
    private final Boolean fallbackToLongCode;
    private final Boolean areaCodeGeomatch;
    private final Boolean synchronousValidation;
    private final Integer validityPeriod;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Service(@JsonProperty("sid")
                    final String sid,
                    @JsonProperty("account_sid")
                    final String accountSid,
                    @JsonProperty("friendly_name")
                    final String friendlyName,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("date_updated")
                    final String dateUpdated,
                    @JsonProperty("inbound_request_url")
                    final URI inboundRequestUrl,
                    @JsonProperty("inbound_method")
                    final HttpMethod inboundMethod,
                    @JsonProperty("fallback_url")
                    final URI fallbackUrl,
                    @JsonProperty("fallback_method")
                    final HttpMethod fallbackMethod,
                    @JsonProperty("status_callback")
                    final URI statusCallback,
                    @JsonProperty("sticky_sender")
                    final Boolean stickySender,
                    @JsonProperty("mms_converter")
                    final Boolean mmsConverter,
                    @JsonProperty("smart_encoding")
                    final Boolean smartEncoding,
                    @JsonProperty("scan_message_content")
                    final Service.ScanMessageContent scanMessageContent,
                    @JsonProperty("fallback_to_long_code")
                    final Boolean fallbackToLongCode,
                    @JsonProperty("area_code_geomatch")
                    final Boolean areaCodeGeomatch,
                    @JsonProperty("synchronous_validation")
                    final Boolean synchronousValidation,
                    @JsonProperty("validity_period")
                    final Integer validityPeriod,
                    @JsonProperty("url")
                    final URI url,
                    @JsonProperty("links")
                    final Map<String, String> links) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.inboundRequestUrl = inboundRequestUrl;
        this.inboundMethod = inboundMethod;
        this.fallbackUrl = fallbackUrl;
        this.fallbackMethod = fallbackMethod;
        this.statusCallback = statusCallback;
        this.stickySender = stickySender;
        this.mmsConverter = mmsConverter;
        this.smartEncoding = smartEncoding;
        this.scanMessageContent = scanMessageContent;
        this.fallbackToLongCode = fallbackToLongCode;
        this.areaCodeGeomatch = areaCodeGeomatch;
        this.synchronousValidation = synchronousValidation;
        this.validityPeriod = validityPeriod;
        this.url = url;
        this.links = links;
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
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
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
     * Returns The ISO 8601 date and time in GMT when the resource was created.
     *
     * @return The ISO 8601 date and time in GMT when the resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was last updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The URL we call using inbound_method when a message is received by
     * any phone number or short code in the Service.
     *
     * @return The URL we call using inbound_method when a message is received by
     *         any phone number or short code in the Service
     */
    public final URI getInboundRequestUrl() {
        return this.inboundRequestUrl;
    }

    /**
     * Returns The HTTP method we use to call inbound_request_url.
     *
     * @return The HTTP method we use to call inbound_request_url
     */
    public final HttpMethod getInboundMethod() {
        return this.inboundMethod;
    }

    /**
     * Returns The URL that we call using fallback_method if an error occurs while
     * retrieving or executing the TwiML from the Inbound Request URL.
     *
     * @return The URL that we call using fallback_method if an error occurs while
     *         retrieving or executing the TwiML from the Inbound Request URL
     */
    public final URI getFallbackUrl() {
        return this.fallbackUrl;
    }

    /**
     * Returns The HTTP method we use to call fallback_url.
     *
     * @return The HTTP method we use to call fallback_url
     */
    public final HttpMethod getFallbackMethod() {
        return this.fallbackMethod;
    }

    /**
     * Returns The URL we call to pass status updates about message delivery.
     *
     * @return The URL we call to pass status updates about message delivery
     */
    public final URI getStatusCallback() {
        return this.statusCallback;
    }

    /**
     * Returns Whether to enable Sticky Sender on the Service instance.
     *
     * @return Whether to enable Sticky Sender on the Service instance
     */
    public final Boolean getStickySender() {
        return this.stickySender;
    }

    /**
     * Returns Whether to enable the MMS Converter for messages sent through the
     * Service instance.
     *
     * @return Whether to enable the MMS Converter for messages sent through the
     *         Service instance
     */
    public final Boolean getMmsConverter() {
        return this.mmsConverter;
    }

    /**
     * Returns Whether to enable Encoding for messages sent through the Service
     * instance.
     *
     * @return Whether to enable Encoding for messages sent through the Service
     *         instance
     */
    public final Boolean getSmartEncoding() {
        return this.smartEncoding;
    }

    /**
     * Returns Reserved.
     *
     * @return Reserved
     */
    public final Service.ScanMessageContent getScanMessageContent() {
        return this.scanMessageContent;
    }

    /**
     * Returns Whether to enable Fallback to Long Code for messages sent through the
     * Service instance.
     *
     * @return Whether to enable Fallback to Long Code for messages sent through
     *         the Service instance
     */
    public final Boolean getFallbackToLongCode() {
        return this.fallbackToLongCode;
    }

    /**
     * Returns Whether to enable Area Code Geomatch on the Service Instance.
     *
     * @return Whether to enable Area Code Geomatch on the Service Instance
     */
    public final Boolean getAreaCodeGeomatch() {
        return this.areaCodeGeomatch;
    }

    /**
     * Returns Reserved.
     *
     * @return Reserved
     */
    public final Boolean getSynchronousValidation() {
        return this.synchronousValidation;
    }

    /**
     * Returns How long, in seconds, messages sent from the Service are valid.
     *
     * @return How long, in seconds, messages sent from the Service are valid
     */
    public final Integer getValidityPeriod() {
        return this.validityPeriod;
    }

    /**
     * Returns The absolute URL of the Service resource.
     *
     * @return The absolute URL of the Service resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The absolute URLs of related resources.
     *
     * @return The absolute URLs of related resources
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

        Service other = (Service) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(inboundRequestUrl, other.inboundRequestUrl) &&
               Objects.equals(inboundMethod, other.inboundMethod) &&
               Objects.equals(fallbackUrl, other.fallbackUrl) &&
               Objects.equals(fallbackMethod, other.fallbackMethod) &&
               Objects.equals(statusCallback, other.statusCallback) &&
               Objects.equals(stickySender, other.stickySender) &&
               Objects.equals(mmsConverter, other.mmsConverter) &&
               Objects.equals(smartEncoding, other.smartEncoding) &&
               Objects.equals(scanMessageContent, other.scanMessageContent) &&
               Objects.equals(fallbackToLongCode, other.fallbackToLongCode) &&
               Objects.equals(areaCodeGeomatch, other.areaCodeGeomatch) &&
               Objects.equals(synchronousValidation, other.synchronousValidation) &&
               Objects.equals(validityPeriod, other.validityPeriod) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            friendlyName,
                            dateCreated,
                            dateUpdated,
                            inboundRequestUrl,
                            inboundMethod,
                            fallbackUrl,
                            fallbackMethod,
                            statusCallback,
                            stickySender,
                            mmsConverter,
                            smartEncoding,
                            scanMessageContent,
                            fallbackToLongCode,
                            areaCodeGeomatch,
                            synchronousValidation,
                            validityPeriod,
                            url,
                            links);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("friendlyName", friendlyName)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("inboundRequestUrl", inboundRequestUrl)
                          .add("inboundMethod", inboundMethod)
                          .add("fallbackUrl", fallbackUrl)
                          .add("fallbackMethod", fallbackMethod)
                          .add("statusCallback", statusCallback)
                          .add("stickySender", stickySender)
                          .add("mmsConverter", mmsConverter)
                          .add("smartEncoding", smartEncoding)
                          .add("scanMessageContent", scanMessageContent)
                          .add("fallbackToLongCode", fallbackToLongCode)
                          .add("areaCodeGeomatch", areaCodeGeomatch)
                          .add("synchronousValidation", synchronousValidation)
                          .add("validityPeriod", validityPeriod)
                          .add("url", url)
                          .add("links", links)
                          .toString();
    }
}