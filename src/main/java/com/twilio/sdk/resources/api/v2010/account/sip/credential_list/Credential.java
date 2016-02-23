package com.twilio.sdk.resources.api.v2010.account.sip.credential_list;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.sdk.clients.TwilioRestClient;
import com.twilio.sdk.converters.MarshalConverter;
import com.twilio.sdk.creators.api.v2010.account.sip.credential_list.CredentialCreator;
import com.twilio.sdk.deleters.api.v2010.account.sip.credential_list.CredentialDeleter;
import com.twilio.sdk.exceptions.ApiConnectionException;
import com.twilio.sdk.exceptions.ApiException;
import com.twilio.sdk.fetchers.api.v2010.account.sip.credential_list.CredentialFetcher;
import com.twilio.sdk.http.HttpMethod;
import com.twilio.sdk.http.Request;
import com.twilio.sdk.http.Response;
import com.twilio.sdk.readers.api.v2010.account.sip.credential_list.CredentialReader;
import com.twilio.sdk.resources.RestException;
import com.twilio.sdk.resources.SidResource;
import com.twilio.sdk.updaters.api.v2010.account.sip.credential_list.CredentialUpdater;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Credential extends SidResource {
    private static final long serialVersionUID = 207131851434233L;

    /**
     * Create a CredentialReader to execute read.
     * 
     * @param accountSid The account_sid
     * @param credentialListSid The credential_list_sid
     * @return CredentialReader capable of executing the read
     */
    public static CredentialReader read(final String accountSid, 
                                        final String credentialListSid) {
        return new CredentialReader(accountSid, credentialListSid);
    }

    /**
     * Create a CredentialCreator to execute create.
     * 
     * @param accountSid The account_sid
     * @param credentialListSid The credential_list_sid
     * @param username The username
     * @param password The password
     * @return CredentialCreator capable of executing the create
     */
    public static CredentialCreator create(final String accountSid, 
                                           final String credentialListSid, 
                                           final String username, 
                                           final String password) {
        return new CredentialCreator(accountSid, credentialListSid, username, password);
    }

    /**
     * Create a CredentialFetcher to execute fetch.
     * 
     * @param accountSid The account_sid
     * @param credentialListSid The credential_list_sid
     * @param sid The sid
     * @return CredentialFetcher capable of executing the fetch
     */
    public static CredentialFetcher fetch(final String accountSid, 
                                          final String credentialListSid, 
                                          final String sid) {
        return new CredentialFetcher(accountSid, credentialListSid, sid);
    }

    /**
     * Create a CredentialUpdater to execute update.
     * 
     * @param accountSid The account_sid
     * @param credentialListSid The credential_list_sid
     * @param sid The sid
     * @param username The username
     * @param password The password
     * @return CredentialUpdater capable of executing the update
     */
    public static CredentialUpdater update(final String accountSid, 
                                           final String credentialListSid, 
                                           final String sid, 
                                           final String username, 
                                           final String password) {
        return new CredentialUpdater(accountSid, credentialListSid, sid, username, password);
    }

    /**
     * Create a CredentialDeleter to execute delete.
     * 
     * @param accountSid The account_sid
     * @param credentialListSid The credential_list_sid
     * @param sid The sid
     * @return CredentialDeleter capable of executing the delete
     */
    public static CredentialDeleter delete(final String accountSid, 
                                           final String credentialListSid, 
                                           final String sid) {
        return new CredentialDeleter(accountSid, credentialListSid, sid);
    }

    /**
     * Converts a JSON String into a Credential object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Credential object represented by the provided JSON
     */
    public static Credential fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Credential.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Credential object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Credential object represented by the provided JSON
     */
    public static Credential fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Credential.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String credentialListSid;
    private final String username;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String uri;

    @JsonCreator
    private Credential(@JsonProperty("sid")
                       final String sid, 
                       @JsonProperty("account_sid")
                       final String accountSid, 
                       @JsonProperty("credential_list_sid")
                       final String credentialListSid, 
                       @JsonProperty("username")
                       final String username, 
                       @JsonProperty("date_created")
                       final String dateCreated, 
                       @JsonProperty("date_updated")
                       final String dateUpdated, 
                       @JsonProperty("uri")
                       final String uri) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.credentialListSid = credentialListSid;
        this.username = username;
        this.dateCreated = MarshalConverter.dateTimeFromString(dateCreated);
        this.dateUpdated = MarshalConverter.dateTimeFromString(dateUpdated);
        this.uri = uri;
    }

    /**
     * Returns The The sid.
     * 
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The credential_list_sid.
     * 
     * @return The credential_list_sid
     */
    public final String getCredentialListSid() {
        return this.credentialListSid;
    }

    /**
     * Returns The The username.
     * 
     * @return The username
     */
    public final String getUsername() {
        return this.username;
    }

    /**
     * Returns The The date_created.
     * 
     * @return The date_created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date_updated.
     * 
     * @return The date_updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The uri.
     * 
     * @return The uri
     */
    public final String getUri() {
        return this.uri;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Credential other = (Credential) o;
        
        return Objects.equals(sid, other.sid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(credentialListSid, other.credentialListSid) && 
               Objects.equals(username, other.username) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(uri, other.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            credentialListSid,
                            username,
                            dateCreated,
                            dateUpdated,
                            uri);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("credentialListSid", credentialListSid)
                          .add("username", username)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("uri", uri)
                          .toString();
    }
}