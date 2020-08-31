/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.trunking.v1.trunk;

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

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhoneNumber extends Resource {
    private static final long serialVersionUID = 152136077896645L;

    public enum AddressRequirement {
        NONE("none"),
        ANY("any"),
        LOCAL("local"),
        FOREIGN("foreign");

        private final String value;

        private AddressRequirement(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a AddressRequirement from a string.
         * @param value string value
         * @return generated AddressRequirement
         */
        @JsonCreator
        public static AddressRequirement forValue(final String value) {
            return Promoter.enumFromString(value, AddressRequirement.values());
        }
    }

    /**
     * Create a PhoneNumberFetcher to execute fetch.
     *
     * @param pathTrunkSid The SID of the Trunk from which to fetch the PhoneNumber
     *                     resource
     * @param pathSid The unique string that identifies the resource
     * @return PhoneNumberFetcher capable of executing the fetch
     */
    public static PhoneNumberFetcher fetcher(final String pathTrunkSid,
                                             final String pathSid) {
        return new PhoneNumberFetcher(pathTrunkSid, pathSid);
    }

    /**
     * Create a PhoneNumberDeleter to execute delete.
     *
     * @param pathTrunkSid The SID of the Trunk from which to delete the
     *                     PhoneNumber resource
     * @param pathSid The unique string that identifies the resource
     * @return PhoneNumberDeleter capable of executing the delete
     */
    public static PhoneNumberDeleter deleter(final String pathTrunkSid,
                                             final String pathSid) {
        return new PhoneNumberDeleter(pathTrunkSid, pathSid);
    }

    /**
     * Create a PhoneNumberCreator to execute create.
     *
     * @param pathTrunkSid The SID of the Trunk to associate the phone number with
     * @param phoneNumberSid The SID of the Incoming Phone Number that you want to
     *                       associate with the trunk
     * @return PhoneNumberCreator capable of executing the create
     */
    public static PhoneNumberCreator creator(final String pathTrunkSid,
                                             final String phoneNumberSid) {
        return new PhoneNumberCreator(pathTrunkSid, phoneNumberSid);
    }

    /**
     * Create a PhoneNumberReader to execute read.
     *
     * @param pathTrunkSid The SID of the Trunk from which to read the PhoneNumber
     *                     resources
     * @return PhoneNumberReader capable of executing the read
     */
    public static PhoneNumberReader reader(final String pathTrunkSid) {
        return new PhoneNumberReader(pathTrunkSid);
    }

    /**
     * Converts a JSON String into a PhoneNumber object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return PhoneNumber object represented by the provided JSON
     */
    public static PhoneNumber fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PhoneNumber.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a PhoneNumber object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return PhoneNumber object represented by the provided JSON
     */
    public static PhoneNumber fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PhoneNumber.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final PhoneNumber.AddressRequirement addressRequirements;
    private final String apiVersion;
    private final Boolean beta;
    private final Map<String, String> capabilities;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String friendlyName;
    private final Map<String, String> links;
    private final com.twilio.type.PhoneNumber phoneNumber;
    private final String sid;
    private final String smsApplicationSid;
    private final HttpMethod smsFallbackMethod;
    private final URI smsFallbackUrl;
    private final HttpMethod smsMethod;
    private final URI smsUrl;
    private final URI statusCallback;
    private final HttpMethod statusCallbackMethod;
    private final String trunkSid;
    private final URI url;
    private final String voiceApplicationSid;
    private final Boolean voiceCallerIdLookup;
    private final HttpMethod voiceFallbackMethod;
    private final URI voiceFallbackUrl;
    private final HttpMethod voiceMethod;
    private final URI voiceUrl;

    @JsonCreator
    private PhoneNumber(@JsonProperty("account_sid")
                        final String accountSid,
                        @JsonProperty("address_requirements")
                        final PhoneNumber.AddressRequirement addressRequirements,
                        @JsonProperty("api_version")
                        final String apiVersion,
                        @JsonProperty("beta")
                        final Boolean beta,
                        @JsonProperty("capabilities")
                        final Map<String, String> capabilities,
                        @JsonProperty("date_created")
                        final String dateCreated,
                        @JsonProperty("date_updated")
                        final String dateUpdated,
                        @JsonProperty("friendly_name")
                        final String friendlyName,
                        @JsonProperty("links")
                        final Map<String, String> links,
                        @JsonProperty("phone_number")
                        final com.twilio.type.PhoneNumber phoneNumber,
                        @JsonProperty("sid")
                        final String sid,
                        @JsonProperty("sms_application_sid")
                        final String smsApplicationSid,
                        @JsonProperty("sms_fallback_method")
                        final HttpMethod smsFallbackMethod,
                        @JsonProperty("sms_fallback_url")
                        final URI smsFallbackUrl,
                        @JsonProperty("sms_method")
                        final HttpMethod smsMethod,
                        @JsonProperty("sms_url")
                        final URI smsUrl,
                        @JsonProperty("status_callback")
                        final URI statusCallback,
                        @JsonProperty("status_callback_method")
                        final HttpMethod statusCallbackMethod,
                        @JsonProperty("trunk_sid")
                        final String trunkSid,
                        @JsonProperty("url")
                        final URI url,
                        @JsonProperty("voice_application_sid")
                        final String voiceApplicationSid,
                        @JsonProperty("voice_caller_id_lookup")
                        final Boolean voiceCallerIdLookup,
                        @JsonProperty("voice_fallback_method")
                        final HttpMethod voiceFallbackMethod,
                        @JsonProperty("voice_fallback_url")
                        final URI voiceFallbackUrl,
                        @JsonProperty("voice_method")
                        final HttpMethod voiceMethod,
                        @JsonProperty("voice_url")
                        final URI voiceUrl) {
        this.accountSid = accountSid;
        this.addressRequirements = addressRequirements;
        this.apiVersion = apiVersion;
        this.beta = beta;
        this.capabilities = capabilities;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.links = links;
        this.phoneNumber = phoneNumber;
        this.sid = sid;
        this.smsApplicationSid = smsApplicationSid;
        this.smsFallbackMethod = smsFallbackMethod;
        this.smsFallbackUrl = smsFallbackUrl;
        this.smsMethod = smsMethod;
        this.smsUrl = smsUrl;
        this.statusCallback = statusCallback;
        this.statusCallbackMethod = statusCallbackMethod;
        this.trunkSid = trunkSid;
        this.url = url;
        this.voiceApplicationSid = voiceApplicationSid;
        this.voiceCallerIdLookup = voiceCallerIdLookup;
        this.voiceFallbackMethod = voiceFallbackMethod;
        this.voiceFallbackUrl = voiceFallbackUrl;
        this.voiceMethod = voiceMethod;
        this.voiceUrl = voiceUrl;
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
     * Returns Whether the phone number requires an Address registered with Twilio.
     *
     * @return Whether the phone number requires an Address registered with Twilio
     */
    public final PhoneNumber.AddressRequirement getAddressRequirements() {
        return this.addressRequirements;
    }

    /**
     * Returns The API version used to start a new TwiML session.
     *
     * @return The API version used to start a new TwiML session
     */
    public final String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Returns Whether the phone number is new to the Twilio platform.
     *
     * @return Whether the phone number is new to the Twilio platform
     */
    public final Boolean getBeta() {
        return this.beta;
    }

    /**
     * Returns Indicate if a phone can receive calls or messages.
     *
     * @return Indicate if a phone can receive calls or messages
     */
    public final Map<String, String> getCapabilities() {
        return this.capabilities;
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
     * Returns The string that you assigned to describe the resource.
     *
     * @return The string that you assigned to describe the resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The URLs of related resources.
     *
     * @return The URLs of related resources
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    /**
     * Returns The phone number in E.164 format.
     *
     * @return The phone number in E.164 format
     */
    public final com.twilio.type.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
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
     * Returns The SID of the application that handles SMS messages sent to the
     * phone number.
     *
     * @return The SID of the application that handles SMS messages sent to the
     *         phone number
     */
    public final String getSmsApplicationSid() {
        return this.smsApplicationSid;
    }

    /**
     * Returns The HTTP method used with sms_fallback_url.
     *
     * @return The HTTP method used with sms_fallback_url
     */
    public final HttpMethod getSmsFallbackMethod() {
        return this.smsFallbackMethod;
    }

    /**
     * Returns The URL that we call when an error occurs while retrieving or
     * executing the TwiML.
     *
     * @return The URL that we call when an error occurs while retrieving or
     *         executing the TwiML
     */
    public final URI getSmsFallbackUrl() {
        return this.smsFallbackUrl;
    }

    /**
     * Returns The HTTP method to use with sms_url.
     *
     * @return The HTTP method to use with sms_url
     */
    public final HttpMethod getSmsMethod() {
        return this.smsMethod;
    }

    /**
     * Returns The URL we call when the phone number receives an incoming SMS
     * message.
     *
     * @return The URL we call when the phone number receives an incoming SMS
     *         message
     */
    public final URI getSmsUrl() {
        return this.smsUrl;
    }

    /**
     * Returns The URL to send status information to your application.
     *
     * @return The URL to send status information to your application
     */
    public final URI getStatusCallback() {
        return this.statusCallback;
    }

    /**
     * Returns The HTTP method we use to call status_callback.
     *
     * @return The HTTP method we use to call status_callback
     */
    public final HttpMethod getStatusCallbackMethod() {
        return this.statusCallbackMethod;
    }

    /**
     * Returns The SID of the Trunk that handles calls to the phone number.
     *
     * @return The SID of the Trunk that handles calls to the phone number
     */
    public final String getTrunkSid() {
        return this.trunkSid;
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
     * Returns The SID of the application that handles calls to the phone number.
     *
     * @return The SID of the application that handles calls to the phone number
     */
    public final String getVoiceApplicationSid() {
        return this.voiceApplicationSid;
    }

    /**
     * Returns Whether to lookup the caller's name.
     *
     * @return Whether to lookup the caller's name
     */
    public final Boolean getVoiceCallerIdLookup() {
        return this.voiceCallerIdLookup;
    }

    /**
     * Returns The HTTP method that we use to call voice_fallback_url.
     *
     * @return The HTTP method that we use to call voice_fallback_url
     */
    public final HttpMethod getVoiceFallbackMethod() {
        return this.voiceFallbackMethod;
    }

    /**
     * Returns The URL we call when an error occurs in TwiML.
     *
     * @return The URL we call when an error occurs in TwiML
     */
    public final URI getVoiceFallbackUrl() {
        return this.voiceFallbackUrl;
    }

    /**
     * Returns The HTTP method used with the voice_url.
     *
     * @return The HTTP method used with the voice_url
     */
    public final HttpMethod getVoiceMethod() {
        return this.voiceMethod;
    }

    /**
     * Returns The URL we call when the phone number receives a call.
     *
     * @return The URL we call when the phone number receives a call
     */
    public final URI getVoiceUrl() {
        return this.voiceUrl;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PhoneNumber other = (PhoneNumber) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(addressRequirements, other.addressRequirements) &&
               Objects.equals(apiVersion, other.apiVersion) &&
               Objects.equals(beta, other.beta) &&
               Objects.equals(capabilities, other.capabilities) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(links, other.links) &&
               Objects.equals(phoneNumber, other.phoneNumber) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(smsApplicationSid, other.smsApplicationSid) &&
               Objects.equals(smsFallbackMethod, other.smsFallbackMethod) &&
               Objects.equals(smsFallbackUrl, other.smsFallbackUrl) &&
               Objects.equals(smsMethod, other.smsMethod) &&
               Objects.equals(smsUrl, other.smsUrl) &&
               Objects.equals(statusCallback, other.statusCallback) &&
               Objects.equals(statusCallbackMethod, other.statusCallbackMethod) &&
               Objects.equals(trunkSid, other.trunkSid) &&
               Objects.equals(url, other.url) &&
               Objects.equals(voiceApplicationSid, other.voiceApplicationSid) &&
               Objects.equals(voiceCallerIdLookup, other.voiceCallerIdLookup) &&
               Objects.equals(voiceFallbackMethod, other.voiceFallbackMethod) &&
               Objects.equals(voiceFallbackUrl, other.voiceFallbackUrl) &&
               Objects.equals(voiceMethod, other.voiceMethod) &&
               Objects.equals(voiceUrl, other.voiceUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            addressRequirements,
                            apiVersion,
                            beta,
                            capabilities,
                            dateCreated,
                            dateUpdated,
                            friendlyName,
                            links,
                            phoneNumber,
                            sid,
                            smsApplicationSid,
                            smsFallbackMethod,
                            smsFallbackUrl,
                            smsMethod,
                            smsUrl,
                            statusCallback,
                            statusCallbackMethod,
                            trunkSid,
                            url,
                            voiceApplicationSid,
                            voiceCallerIdLookup,
                            voiceFallbackMethod,
                            voiceFallbackUrl,
                            voiceMethod,
                            voiceUrl);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("addressRequirements", addressRequirements)
                          .add("apiVersion", apiVersion)
                          .add("beta", beta)
                          .add("capabilities", capabilities)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("friendlyName", friendlyName)
                          .add("links", links)
                          .add("phoneNumber", phoneNumber)
                          .add("sid", sid)
                          .add("smsApplicationSid", smsApplicationSid)
                          .add("smsFallbackMethod", smsFallbackMethod)
                          .add("smsFallbackUrl", smsFallbackUrl)
                          .add("smsMethod", smsMethod)
                          .add("smsUrl", smsUrl)
                          .add("statusCallback", statusCallback)
                          .add("statusCallbackMethod", statusCallbackMethod)
                          .add("trunkSid", trunkSid)
                          .add("url", url)
                          .add("voiceApplicationSid", voiceApplicationSid)
                          .add("voiceCallerIdLookup", voiceCallerIdLookup)
                          .add("voiceFallbackMethod", voiceFallbackMethod)
                          .add("voiceFallbackUrl", voiceFallbackUrl)
                          .add("voiceMethod", voiceMethod)
                          .add("voiceUrl", voiceUrl)
                          .toString();
    }
}