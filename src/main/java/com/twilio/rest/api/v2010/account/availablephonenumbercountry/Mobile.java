/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.availablephonenumbercountry;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.type.PhoneNumberCapabilities;
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Mobile extends Resource {
    private static final long serialVersionUID = 16937856072206L;

    /**
     * Create a MobileReader to execute read.
     *
     * @param pathAccountSid The SID of the Account requesting the
     *                       AvailablePhoneNumber resources
     * @param pathCountryCode The ISO Country code of the country from which to
     *                        read phone numbers
     * @return MobileReader capable of executing the read
     */
    public static MobileReader reader(final String pathAccountSid,
                                      final String pathCountryCode) {
        return new MobileReader(pathAccountSid, pathCountryCode);
    }

    /**
     * Create a MobileReader to execute read.
     *
     * @param pathCountryCode The ISO Country code of the country from which to
     *                        read phone numbers
     * @return MobileReader capable of executing the read
     */
    public static MobileReader reader(final String pathCountryCode) {
        return new MobileReader(pathCountryCode);
    }

    /**
     * Converts a JSON String into a Mobile object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Mobile object represented by the provided JSON
     */
    public static Mobile fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Mobile.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Mobile object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Mobile object represented by the provided JSON
     */
    public static Mobile fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Mobile.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final com.twilio.type.PhoneNumber friendlyName;
    private final com.twilio.type.PhoneNumber phoneNumber;
    private final String lata;
    private final String locality;
    private final String rateCenter;
    private final BigDecimal latitude;
    private final BigDecimal longitude;
    private final String region;
    private final String postalCode;
    private final String isoCountry;
    private final String addressRequirements;
    private final Boolean beta;
    private final PhoneNumberCapabilities capabilities;

    @JsonCreator
    private Mobile(@JsonProperty("friendly_name")
                   final com.twilio.type.PhoneNumber friendlyName,
                   @JsonProperty("phone_number")
                   final com.twilio.type.PhoneNumber phoneNumber,
                   @JsonProperty("lata")
                   final String lata,
                   @JsonProperty("locality")
                   final String locality,
                   @JsonProperty("rate_center")
                   final String rateCenter,
                   @JsonProperty("latitude")
                   final BigDecimal latitude,
                   @JsonProperty("longitude")
                   final BigDecimal longitude,
                   @JsonProperty("region")
                   final String region,
                   @JsonProperty("postal_code")
                   final String postalCode,
                   @JsonProperty("iso_country")
                   final String isoCountry,
                   @JsonProperty("address_requirements")
                   final String addressRequirements,
                   @JsonProperty("beta")
                   final Boolean beta,
                   @JsonProperty("capabilities")
                   final PhoneNumberCapabilities capabilities) {
        this.friendlyName = friendlyName;
        this.phoneNumber = phoneNumber;
        this.lata = lata;
        this.locality = locality;
        this.rateCenter = rateCenter;
        this.latitude = latitude;
        this.longitude = longitude;
        this.region = region;
        this.postalCode = postalCode;
        this.isoCountry = isoCountry;
        this.addressRequirements = addressRequirements;
        this.beta = beta;
        this.capabilities = capabilities;
    }

    /**
     * Returns A formatted version of the phone number.
     *
     * @return A formatted version of the phone number
     */
    public final com.twilio.type.PhoneNumber getFriendlyName() {
        return this.friendlyName;
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
     * Returns The LATA of this phone number.
     *
     * @return The LATA of this phone number
     */
    public final String getLata() {
        return this.lata;
    }

    /**
     * Returns The locality or city of this phone number's location.
     *
     * @return The locality or city of this phone number's location
     */
    public final String getLocality() {
        return this.locality;
    }

    /**
     * Returns The rate center of this phone number.
     *
     * @return The rate center of this phone number
     */
    public final String getRateCenter() {
        return this.rateCenter;
    }

    /**
     * Returns The latitude of this phone number's location.
     *
     * @return The latitude of this phone number's location
     */
    public final BigDecimal getLatitude() {
        return this.latitude;
    }

    /**
     * Returns The longitude of this phone number's location.
     *
     * @return The longitude of this phone number's location
     */
    public final BigDecimal getLongitude() {
        return this.longitude;
    }

    /**
     * Returns The two-letter state or province abbreviation of this phone number's
     * location.
     *
     * @return The two-letter state or province abbreviation of this phone number's
     *         location
     */
    public final String getRegion() {
        return this.region;
    }

    /**
     * Returns The postal or ZIP code of this phone number's location.
     *
     * @return The postal or ZIP code of this phone number's location
     */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Returns The ISO country code of this phone number.
     *
     * @return The ISO country code of this phone number
     */
    public final String getIsoCountry() {
        return this.isoCountry;
    }

    /**
     * Returns The type of Address resource the phone number requires.
     *
     * @return The type of Address resource the phone number requires
     */
    public final String getAddressRequirements() {
        return this.addressRequirements;
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
     * Returns Whether a phone number can receive calls or messages.
     *
     * @return Whether a phone number can receive calls or messages
     */
    public final PhoneNumberCapabilities getCapabilities() {
        return this.capabilities;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Mobile other = (Mobile) o;

        return Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(phoneNumber, other.phoneNumber) &&
               Objects.equals(lata, other.lata) &&
               Objects.equals(locality, other.locality) &&
               Objects.equals(rateCenter, other.rateCenter) &&
               Objects.equals(latitude, other.latitude) &&
               Objects.equals(longitude, other.longitude) &&
               Objects.equals(region, other.region) &&
               Objects.equals(postalCode, other.postalCode) &&
               Objects.equals(isoCountry, other.isoCountry) &&
               Objects.equals(addressRequirements, other.addressRequirements) &&
               Objects.equals(beta, other.beta) &&
               Objects.equals(capabilities, other.capabilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(friendlyName,
                            phoneNumber,
                            lata,
                            locality,
                            rateCenter,
                            latitude,
                            longitude,
                            region,
                            postalCode,
                            isoCountry,
                            addressRequirements,
                            beta,
                            capabilities);
    }
}