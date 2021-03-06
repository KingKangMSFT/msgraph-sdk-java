// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.MobileAppContent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Mobile App Content Request.
 */
public interface IBaseMobileAppContentRequest extends IHttpRequest {

    /**
     * Gets the MobileAppContent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MobileAppContent> callback);

    /**
     * Gets the MobileAppContent from the service
     *
     * @return the MobileAppContent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppContent get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MobileAppContent> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileAppContent with a source
     *
     * @param sourceMobileAppContent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileAppContent sourceMobileAppContent, final ICallback<MobileAppContent> callback);

    /**
     * Patches this MobileAppContent with a source
     *
     * @param sourceMobileAppContent the source object with updates
     * @return the updated MobileAppContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppContent patch(final MobileAppContent sourceMobileAppContent) throws ClientException;

    /**
     * Posts a MobileAppContent with a new object
     *
     * @param newMobileAppContent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileAppContent newMobileAppContent, final ICallback<MobileAppContent> callback);

    /**
     * Posts a MobileAppContent with a new object
     *
     * @param newMobileAppContent the new object to create
     * @return the created MobileAppContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppContent post(final MobileAppContent newMobileAppContent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseMobileAppContentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseMobileAppContentRequest expand(final String value);

}

