// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Store App Request.
 */
public class BaseIosStoreAppRequest extends BaseRequest implements IBaseIosStoreAppRequest {

    /**
     * The request for the IosStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseIosStoreAppRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<IosStoreApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the IosStoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosStoreApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosStoreApp from the service
     *
     * @return the IosStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosStoreApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this IosStoreApp with a source
     *
     * @param sourceIosStoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosStoreApp sourceIosStoreApp, final ICallback<IosStoreApp> callback) {
        send(HttpMethod.PATCH, callback, sourceIosStoreApp);
    }

    /**
     * Patches this IosStoreApp with a source
     *
     * @param sourceIosStoreApp the source object with updates
     * @return the updated IosStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosStoreApp patch(final IosStoreApp sourceIosStoreApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosStoreApp);
    }

    /**
     * Creates a IosStoreApp with a new object
     *
     * @param newIosStoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosStoreApp newIosStoreApp, final ICallback<IosStoreApp> callback) {
        send(HttpMethod.POST, callback, newIosStoreApp);
    }

    /**
     * Creates a IosStoreApp with a new object
     *
     * @param newIosStoreApp the new object to create
     * @return the created IosStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosStoreApp post(final IosStoreApp newIosStoreApp) throws ClientException {
        return send(HttpMethod.POST, newIosStoreApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosStoreAppRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (IosStoreAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosStoreAppRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (IosStoreAppRequest)this;
     }

}
