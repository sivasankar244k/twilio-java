/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.ipmessaging.v1.service.channel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import lombok.ToString;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Message extends Resource {
    private static final long serialVersionUID = 68490171213295L;

    public enum OrderType {
        ASC("asc"),
        DESC("desc");

        private final String value;

        private OrderType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a OrderType from a string.
         * @param value string value
         * @return generated OrderType
         */
        @JsonCreator
        public static OrderType forValue(final String value) {
            return Promoter.enumFromString(value, OrderType.values());
        }
    }

    /**
     * Create a MessageFetcher to execute fetch.
     *
     * @param pathServiceSid The SID of the Service to fetch the resource from
     * @param pathChannelSid The unique ID of the Channel the message to fetch
     *                       belongs to
     * @param pathSid The unique string that identifies the resource
     * @return MessageFetcher capable of executing the fetch
     */
    public static MessageFetcher fetcher(final String pathServiceSid,
                                         final String pathChannelSid,
                                         final String pathSid) {
        return new MessageFetcher(pathServiceSid, pathChannelSid, pathSid);
    }

    /**
     * Create a MessageCreator to execute create.
     *
     * @param pathServiceSid The SID of the Service to create the resource under
     * @param pathChannelSid The unique ID of the channel the new resource belongs
     *                       to
     * @param body The message to send to the channel
     * @return MessageCreator capable of executing the create
     */
    public static MessageCreator creator(final String pathServiceSid,
                                         final String pathChannelSid,
                                         final String body) {
        return new MessageCreator(pathServiceSid, pathChannelSid, body);
    }

    /**
     * Create a MessageReader to execute read.
     *
     * @param pathServiceSid The SID of the Service to read the resources from
     * @param pathChannelSid The unique ID of the Channel the message to read
     *                       belongs to
     * @return MessageReader capable of executing the read
     */
    public static MessageReader reader(final String pathServiceSid,
                                       final String pathChannelSid) {
        return new MessageReader(pathServiceSid, pathChannelSid);
    }

    /**
     * Create a MessageDeleter to execute delete.
     *
     * @param pathServiceSid The SID of the Service to delete the resource from
     * @param pathChannelSid The unique ID of the channel the message to delete
     *                       belongs to
     * @param pathSid The unique string that identifies the resource
     * @return MessageDeleter capable of executing the delete
     */
    public static MessageDeleter deleter(final String pathServiceSid,
                                         final String pathChannelSid,
                                         final String pathSid) {
        return new MessageDeleter(pathServiceSid, pathChannelSid, pathSid);
    }

    /**
     * Create a MessageUpdater to execute update.
     *
     * @param pathServiceSid The SID of the Service to update the resource from
     * @param pathChannelSid he unique ID of the Channel the message belongs to
     * @param pathSid The unique string that identifies the resource
     * @return MessageUpdater capable of executing the update
     */
    public static MessageUpdater updater(final String pathServiceSid,
                                         final String pathChannelSid,
                                         final String pathSid) {
        return new MessageUpdater(pathServiceSid, pathChannelSid, pathSid);
    }

    /**
     * Converts a JSON String into a Message object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Message object represented by the provided JSON
     */
    public static Message fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Message.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Message object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Message object represented by the provided JSON
     */
    public static Message fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Message.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String attributes;
    private final String serviceSid;
    private final String to;
    private final String channelSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final Boolean wasEdited;
    private final String from;
    private final String body;
    private final Integer index;
    private final URI url;

    @JsonCreator
    private Message(@JsonProperty("sid")
                    final String sid,
                    @JsonProperty("account_sid")
                    final String accountSid,
                    @JsonProperty("attributes")
                    final String attributes,
                    @JsonProperty("service_sid")
                    final String serviceSid,
                    @JsonProperty("to")
                    final String to,
                    @JsonProperty("channel_sid")
                    final String channelSid,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("date_updated")
                    final String dateUpdated,
                    @JsonProperty("was_edited")
                    final Boolean wasEdited,
                    @JsonProperty("from")
                    final String from,
                    @JsonProperty("body")
                    final String body,
                    @JsonProperty("index")
                    final Integer index,
                    @JsonProperty("url")
                    final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.attributes = attributes;
        this.serviceSid = serviceSid;
        this.to = to;
        this.channelSid = channelSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.wasEdited = wasEdited;
        this.from = from;
        this.body = body;
        this.index = index;
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
     * Returns The JSON string that stores application-specific data.
     *
     * @return The JSON string that stores application-specific data
     */
    public final String getAttributes() {
        return this.attributes;
    }

    /**
     * Returns The SID of the Service that the resource is associated with.
     *
     * @return The SID of the Service that the resource is associated with
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The SID of the Channel that the message was sent to.
     *
     * @return The SID of the Channel that the message was sent to
     */
    public final String getTo() {
        return this.to;
    }

    /**
     * Returns The unique ID of the Channel the Message resource belongs to.
     *
     * @return The unique ID of the Channel the Message resource belongs to
     */
    public final String getChannelSid() {
        return this.channelSid;
    }

    /**
     * Returns The RFC 2822 date and time in GMT when the resource was created.
     *
     * @return The RFC 2822 date and time in GMT when the resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The RFC 2822 date and time in GMT when the resource was last updated.
     *
     * @return The RFC 2822 date and time in GMT when the resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns Whether the message has been edited since  it was created.
     *
     * @return Whether the message has been edited since  it was created
     */
    public final Boolean getWasEdited() {
        return this.wasEdited;
    }

    /**
     * Returns The identity of the message's author.
     *
     * @return The identity of the message's author
     */
    public final String getFrom() {
        return this.from;
    }

    /**
     * Returns The content of the message.
     *
     * @return The content of the message
     */
    public final String getBody() {
        return this.body;
    }

    /**
     * Returns The index of the message within the Channel.
     *
     * @return The index of the message within the Channel
     */
    public final Integer getIndex() {
        return this.index;
    }

    /**
     * Returns The absolute URL of the Message resource.
     *
     * @return The absolute URL of the Message resource
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

        Message other = (Message) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(attributes, other.attributes) &&
               Objects.equals(serviceSid, other.serviceSid) &&
               Objects.equals(to, other.to) &&
               Objects.equals(channelSid, other.channelSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(wasEdited, other.wasEdited) &&
               Objects.equals(from, other.from) &&
               Objects.equals(body, other.body) &&
               Objects.equals(index, other.index) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            attributes,
                            serviceSid,
                            to,
                            channelSid,
                            dateCreated,
                            dateUpdated,
                            wasEdited,
                            from,
                            body,
                            index,
                            url);
    }
}