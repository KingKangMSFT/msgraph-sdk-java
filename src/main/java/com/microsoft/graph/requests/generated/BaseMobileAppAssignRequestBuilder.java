// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IMobileAppAssignRequest;
import com.microsoft.graph.requests.extensions.MobileAppAssignRequest;
import com.microsoft.graph.models.extensions.MobileAppAssignment;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mobile App Assign Request Builder.
 */
public class BaseMobileAppAssignRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this MobileAppAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param mobileAppAssignments the mobileAppAssignments
     */
    public BaseMobileAppAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<MobileAppAssignment> mobileAppAssignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("mobileAppAssignments", mobileAppAssignments);
    }

    /**
     * Creates the IMobileAppAssignRequest
     *
     * @return the IMobileAppAssignRequest instance
     */
    public IMobileAppAssignRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMobileAppAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMobileAppAssignRequest instance
     */
    public IMobileAppAssignRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        MobileAppAssignRequest request = new MobileAppAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("mobileAppAssignments")) {
            request.body.mobileAppAssignments = getParameter("mobileAppAssignments");
        }

        return request;
    }
}
