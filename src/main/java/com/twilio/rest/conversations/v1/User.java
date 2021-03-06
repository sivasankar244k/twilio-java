/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User extends Resource {
    private static final long serialVersionUID = 251738011021352L;

    /**
     * Create a UserCreator to execute create.
     *
     * @param identity The string that identifies the resource's User
     * @return UserCreator capable of executing the create
     */
    public static UserCreator creator(final String identity) {
        return new UserCreator(identity);
    }

    /**
     * Create a UserUpdater to execute update.
     *
     * @param pathSid The SID of the User resource to update
     * @return UserUpdater capable of executing the update
     */
    public static UserUpdater updater(final String pathSid) {
        return new UserUpdater(pathSid);
    }

    /**
     * Create a UserDeleter to execute delete.
     *
     * @param pathSid The SID of  the User resource to delete
     * @return UserDeleter capable of executing the delete
     */
    public static UserDeleter deleter(final String pathSid) {
        return new UserDeleter(pathSid);
    }

    /**
     * Create a UserFetcher to execute fetch.
     *
     * @param pathSid The SID of the User resource to fetch
     * @return UserFetcher capable of executing the fetch
     */
    public static UserFetcher fetcher(final String pathSid) {
        return new UserFetcher(pathSid);
    }

    /**
     * Create a UserReader to execute read.
     *
     * @return UserReader capable of executing the read
     */
    public static UserReader reader() {
        return new UserReader();
    }

    /**
     * Converts a JSON String into a User object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return User object represented by the provided JSON
     */
    public static User fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, User.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a User object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return User object represented by the provided JSON
     */
    public static User fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, User.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String chatServiceSid;
    private final String roleSid;
    private final String identity;
    private final String friendlyName;
    private final String attributes;
    private final Boolean isOnline;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private User(@JsonProperty("sid")
                 final String sid,
                 @JsonProperty("account_sid")
                 final String accountSid,
                 @JsonProperty("chat_service_sid")
                 final String chatServiceSid,
                 @JsonProperty("role_sid")
                 final String roleSid,
                 @JsonProperty("identity")
                 final String identity,
                 @JsonProperty("friendly_name")
                 final String friendlyName,
                 @JsonProperty("attributes")
                 final String attributes,
                 @JsonProperty("is_online")
                 final Boolean isOnline,
                 @JsonProperty("date_created")
                 final String dateCreated,
                 @JsonProperty("date_updated")
                 final String dateUpdated,
                 @JsonProperty("url")
                 final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.chatServiceSid = chatServiceSid;
        this.roleSid = roleSid;
        this.identity = identity;
        this.friendlyName = friendlyName;
        this.attributes = attributes;
        this.isOnline = isOnline;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
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
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The SID of the Service that the resource is associated with.
     *
     * @return The SID of the Service that the resource is associated with
     */
    public final String getChatServiceSid() {
        return this.chatServiceSid;
    }

    /**
     * Returns The SID of the Role assigned to the user.
     *
     * @return The SID of the Role assigned to the user
     */
    public final String getRoleSid() {
        return this.roleSid;
    }

    /**
     * Returns The string that identifies the resource's User.
     *
     * @return The string that identifies the resource's User
     */
    public final String getIdentity() {
        return this.identity;
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
     * Returns The JSON Object string that stores application-specific data.
     *
     * @return The JSON Object string that stores application-specific data
     */
    public final String getAttributes() {
        return this.attributes;
    }

    /**
     * Returns Whether the User is actively connected to the Service instance and
     * online.
     *
     * @return Whether the User is actively connected to the Service instance and
     *         online
     */
    public final Boolean getIsOnline() {
        return this.isOnline;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was created.
     *
     * @return The ISO 8601 date and time in GMT when the resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was last updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The absolute URL of the User resource.
     *
     * @return The absolute URL of the User resource
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

        User other = (User) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(chatServiceSid, other.chatServiceSid) &&
               Objects.equals(roleSid, other.roleSid) &&
               Objects.equals(identity, other.identity) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(attributes, other.attributes) &&
               Objects.equals(isOnline, other.isOnline) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            chatServiceSid,
                            roleSid,
                            identity,
                            friendlyName,
                            attributes,
                            isOnline,
                            dateCreated,
                            dateUpdated,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("chatServiceSid", chatServiceSid)
                          .add("roleSid", roleSid)
                          .add("identity", identity)
                          .add("friendlyName", friendlyName)
                          .add("attributes", attributes)
                          .add("isOnline", isOnline)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("url", url)
                          .toString();
    }
}