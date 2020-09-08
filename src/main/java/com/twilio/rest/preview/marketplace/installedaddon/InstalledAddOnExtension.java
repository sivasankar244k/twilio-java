/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.marketplace.installedaddon;

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
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class InstalledAddOnExtension extends Resource {
    private static final long serialVersionUID = 70024747231532L;

    /**
     * Create a InstalledAddOnExtensionFetcher to execute fetch.
     *
     * @param pathInstalledAddOnSid The SID of the InstalledAddOn resource with the
     *                              extension to fetch
     * @param pathSid The SID of the InstalledAddOn Extension resource to fetch
     * @return InstalledAddOnExtensionFetcher capable of executing the fetch
     */
    public static InstalledAddOnExtensionFetcher fetcher(final String pathInstalledAddOnSid,
                                                         final String pathSid) {
        return new InstalledAddOnExtensionFetcher(pathInstalledAddOnSid, pathSid);
    }

    /**
     * Create a InstalledAddOnExtensionUpdater to execute update.
     *
     * @param pathInstalledAddOnSid The SID of the InstalledAddOn resource with the
     *                              extension to update
     * @param pathSid The SID of the InstalledAddOn Extension resource to update
     * @param enabled Whether the Extension should be invoked
     * @return InstalledAddOnExtensionUpdater capable of executing the update
     */
    public static InstalledAddOnExtensionUpdater updater(final String pathInstalledAddOnSid,
                                                         final String pathSid,
                                                         final Boolean enabled) {
        return new InstalledAddOnExtensionUpdater(pathInstalledAddOnSid, pathSid, enabled);
    }

    /**
     * Create a InstalledAddOnExtensionReader to execute read.
     *
     * @param pathInstalledAddOnSid The SID of the InstalledAddOn resource with the
     *                              extensions to read
     * @return InstalledAddOnExtensionReader capable of executing the read
     */
    public static InstalledAddOnExtensionReader reader(final String pathInstalledAddOnSid) {
        return new InstalledAddOnExtensionReader(pathInstalledAddOnSid);
    }

    /**
     * Converts a JSON String into a InstalledAddOnExtension object using the
     * provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return InstalledAddOnExtension object represented by the provided JSON
     */
    public static InstalledAddOnExtension fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InstalledAddOnExtension.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a InstalledAddOnExtension object using the
     * provided ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return InstalledAddOnExtension object represented by the provided JSON
     */
    public static InstalledAddOnExtension fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InstalledAddOnExtension.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String installedAddOnSid;
    private final String friendlyName;
    private final String productName;
    private final String uniqueName;
    private final Boolean enabled;
    private final URI url;

    @JsonCreator
    private InstalledAddOnExtension(@JsonProperty("sid")
                                    final String sid,
                                    @JsonProperty("installed_add_on_sid")
                                    final String installedAddOnSid,
                                    @JsonProperty("friendly_name")
                                    final String friendlyName,
                                    @JsonProperty("product_name")
                                    final String productName,
                                    @JsonProperty("unique_name")
                                    final String uniqueName,
                                    @JsonProperty("enabled")
                                    final Boolean enabled,
                                    @JsonProperty("url")
                                    final URI url) {
        this.sid = sid;
        this.installedAddOnSid = installedAddOnSid;
        this.friendlyName = friendlyName;
        this.productName = productName;
        this.uniqueName = uniqueName;
        this.enabled = enabled;
        this.url = url;
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
     * Returns The SID of the InstalledAddOn resource to which this extension
     * applies.
     *
     * @return The SID of the InstalledAddOn resource to which this extension
     *         applies
     */
    public final String getInstalledAddOnSid() {
        return this.installedAddOnSid;
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
     * Returns The name of the Extension's Product.
     *
     * @return The name of the Extension's Product
     */
    public final String getProductName() {
        return this.productName;
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
     * Returns Whether the Extension will be invoked.
     *
     * @return Whether the Extension will be invoked
     */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Returns The absolute URL of the resource.
     *
     * @return The absolute URL of the resource
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        InstalledAddOnExtension other = (InstalledAddOnExtension) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(installedAddOnSid, other.installedAddOnSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(productName, other.productName) &&
               Objects.equals(uniqueName, other.uniqueName) &&
               Objects.equals(enabled, other.enabled) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            installedAddOnSid,
                            friendlyName,
                            productName,
                            uniqueName,
                            enabled,
                            url);
    }
}