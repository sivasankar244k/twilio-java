/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml;

import com.twilio.twiml.voice.Connect;
import com.twilio.twiml.voice.Dial;
import com.twilio.twiml.voice.Echo;
import com.twilio.twiml.voice.Enqueue;
import com.twilio.twiml.voice.Gather;
import com.twilio.twiml.voice.Hangup;
import com.twilio.twiml.voice.Leave;
import com.twilio.twiml.voice.Pause;
import com.twilio.twiml.voice.Play;
import com.twilio.twiml.voice.Queue;
import com.twilio.twiml.voice.Record;
import com.twilio.twiml.voice.Redirect;
import com.twilio.twiml.voice.Reject;
import com.twilio.twiml.voice.Say;
import com.twilio.twiml.voice.Sms;

/**
 * TwiML wrapper for {@code <Response>}
 */
public class VoiceResponse extends TwiML {
    /**
     * For XML Serialization/Deserialization
     */
    private VoiceResponse() {
        this(new Builder());
    }

    /**
     * Create a new {@code <VoiceResponse>} element
     */
    private VoiceResponse(Builder b) {
        super("Response", b);
    }

    /**
     * Create a new {@code <Response>} element
     */
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Add a child {@code <Connect>} element
         */
        public Builder connect(Connect connect) {
            this.children.add(connect);
            return this;
        }

        /**
         * Add a child {@code <Dial>} element
         */
        public Builder dial(Dial dial) {
            this.children.add(dial);
            return this;
        }

        /**
         * Add a child {@code <Echo>} element
         */
        public Builder echo(Echo echo) {
            this.children.add(echo);
            return this;
        }

        /**
         * Add a child {@code <Enqueue>} element
         */
        public Builder enqueue(Enqueue enqueue) {
            this.children.add(enqueue);
            return this;
        }

        /**
         * Add a child {@code <Gather>} element
         */
        public Builder gather(Gather gather) {
            this.children.add(gather);
            return this;
        }

        /**
         * Add a child {@code <Hangup>} element
         */
        public Builder hangup(Hangup hangup) {
            this.children.add(hangup);
            return this;
        }

        /**
         * Add a child {@code <Leave>} element
         */
        public Builder leave(Leave leave) {
            this.children.add(leave);
            return this;
        }

        /**
         * Add a child {@code <Pause>} element
         */
        public Builder pause(Pause pause) {
            this.children.add(pause);
            return this;
        }

        /**
         * Add a child {@code <Play>} element
         */
        public Builder play(Play play) {
            this.children.add(play);
            return this;
        }

        /**
         * Add a child {@code <Queue>} element
         */
        public Builder queue(Queue queue) {
            this.children.add(queue);
            return this;
        }

        /**
         * Add a child {@code <Record>} element
         */
        public Builder record(Record record) {
            this.children.add(record);
            return this;
        }

        /**
         * Add a child {@code <Redirect>} element
         */
        public Builder redirect(Redirect redirect) {
            this.children.add(redirect);
            return this;
        }

        /**
         * Add a child {@code <Reject>} element
         */
        public Builder reject(Reject reject) {
            this.children.add(reject);
            return this;
        }

        /**
         * Add a child {@code <Say>} element
         */
        public Builder say(Say say) {
            this.children.add(say);
            return this;
        }

        /**
         * Add a child {@code <Sms>} element
         */
        public Builder sms(Sms sms) {
            this.children.add(sms);
            return this;
        }

        /**
         * Create and return resulting {@code <Response>} element
         */
        public VoiceResponse build() {
            return new VoiceResponse(this);
        }
    }
}