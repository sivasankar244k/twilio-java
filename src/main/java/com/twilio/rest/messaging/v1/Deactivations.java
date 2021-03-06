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
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deactivations extends Resource {
    private static final long serialVersionUID = 141886233784936L;

    /**
     * Create a DeactivationsFetcher to execute fetch.
     *
     * @return DeactivationsFetcher capable of executing the fetch
     */
    public static DeactivationsFetcher fetcher() {
        return new DeactivationsFetcher();
    }

    /**
     * Converts a JSON String into a Deactivations object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Deactivations object represented by the provided JSON
     */
    public static Deactivations fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Deactivations.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Deactivations object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Deactivations object represented by the provided JSON
     */
    public static Deactivations fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Deactivations.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final URI redirectTo;

    @JsonCreator
    private Deactivations(@JsonProperty("redirect_to")
                          final URI redirectTo) {
        this.redirectTo = redirectTo;
    }

    /**
     * Returns Redirect url to the list of deactivated numbers..
     *
     * @return Redirect url to the list of deactivated numbers.
     */
    public final URI getRedirectTo() {
        return this.redirectTo;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Deactivations other = (Deactivations) o;

        return Objects.equals(redirectTo, other.redirectTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redirectTo);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("redirectTo", redirectTo)
                          .toString();
    }
}