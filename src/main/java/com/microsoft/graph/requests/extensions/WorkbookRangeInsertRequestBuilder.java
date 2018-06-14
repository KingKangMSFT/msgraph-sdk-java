// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookRangeInsertRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Range Insert Request Builder.
 */
public class WorkbookRangeInsertRequestBuilder extends BaseWorkbookRangeInsertRequestBuilder implements IWorkbookRangeInsertRequestBuilder {

    /**
     * The request builder for this WorkbookRangeInsert
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param shift the shift
     */
    public WorkbookRangeInsertRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String shift) {
        super(requestUrl, client, requestOptions, shift);
    }
}
