// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsLookupRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Lookup Request Builder.
 */
public class WorkbookFunctionsLookupRequestBuilder extends BaseWorkbookFunctionsLookupRequestBuilder implements IWorkbookFunctionsLookupRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLookup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param lookupValue the lookupValue
     * @param lookupVector the lookupVector
     * @param resultVector the resultVector
     */
    public WorkbookFunctionsLookupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement lookupVector, final com.google.gson.JsonElement resultVector) {
        super(requestUrl, client, requestOptions, lookupValue, lookupVector, resultVector);
    }
}
