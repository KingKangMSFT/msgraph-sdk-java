// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.UserActivity;
import com.microsoft.graph.requests.extensions.IUserActivityCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User Activity Collection Page.
 */
public class BaseUserActivityCollectionPage extends BaseCollectionPage<UserActivity, IUserActivityCollectionRequestBuilder> implements IBaseUserActivityCollectionPage {

    /**
     * A collection page for UserActivity
     *
     * @param response the serialized BaseUserActivityCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseUserActivityCollectionPage(final BaseUserActivityCollectionResponse response, final IUserActivityCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
