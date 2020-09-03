/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.sync.v1.service.syncmap;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class SyncMapItemReader extends Reader<SyncMapItem> {
    private final String pathServiceSid;
    private final String pathMapSid;
    private SyncMapItem.QueryResultOrder order;
    private String from;
    private SyncMapItem.QueryFromBoundType bounds;

    /**
     * Construct a new SyncMapItemReader.
     *
     * @param pathServiceSid The SID of the Sync Service with the Map Item
     *                       resources to read
     * @param pathMapSid The SID of the Sync Map with the Sync Map Item resource to
     *                   fetch
     */
    public SyncMapItemReader(final String pathServiceSid,
                             final String pathMapSid) {
        this.pathServiceSid = pathServiceSid;
        this.pathMapSid = pathMapSid;
    }

    /**
     * How to order the Map Items returned by their `key` value. Can be: `asc`
     * (ascending) or `desc` (descending) and the default is ascending. Map Items
     * are [ordered
     * lexicographically](https://en.wikipedia.org/wiki/Lexicographical_order) by
     * Item key..
     *
     * @param order How to order the Map Items returned by their key value
     * @return this
     */
    public SyncMapItemReader setOrder(final SyncMapItem.QueryResultOrder order) {
        this.order = order;
        return this;
    }

    /**
     * The `key` of the first Sync Map Item resource to read. See also `bounds`..
     *
     * @param from The index of the first Sync Map Item resource to read
     * @return this
     */
    public SyncMapItemReader setFrom(final String from) {
        this.from = from;
        return this;
    }

    /**
     * Whether to include the Map Item referenced by the `from` parameter. Can be:
     * `inclusive` to include the Map Item referenced by the `from` parameter or
     * `exclusive` to start with the next Map Item. The default value is
     * `inclusive`..
     *
     * @param bounds Whether to include the Map Item referenced by the from
     *               parameter
     * @return this
     */
    public SyncMapItemReader setBounds(final SyncMapItem.QueryFromBoundType bounds) {
        this.bounds = bounds;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return SyncMapItem ResourceSet
     */
    @Override
    public ResourceSet<SyncMapItem> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return SyncMapItem ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<SyncMapItem> firstPage(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.SYNC.toString(),
            "/v1/Services/" + this.pathServiceSid + "/Maps/" + this.pathMapSid + "/Items"
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the target page from the Twilio API.
     *
     * @param targetUrl API-generated URL for the requested results page
     * @param client TwilioRestClient with which to make the request
     * @return SyncMapItem ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<SyncMapItem> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }

    /**
     * Retrieve the next page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Next Page
     */
    @Override
    public Page<SyncMapItem> nextPage(final Page<SyncMapItem> page,
                                      final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.SYNC.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the previous page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Previous Page
     */
    @Override
    public Page<SyncMapItem> previousPage(final Page<SyncMapItem> page,
                                          final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.SYNC.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of SyncMapItem Resources for a given request.
     *
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<SyncMapItem> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("SyncMapItem read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
           throw new ApiException(restException);
        }

        return Page.fromJson(
            "items",
            response.getContent(),
            SyncMapItem.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (order != null) {
            request.addQueryParam("Order", order.toString());
        }

        if (from != null) {
            request.addQueryParam("From", from);
        }

        if (bounds != null) {
            request.addQueryParam("Bounds", bounds.toString());
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}