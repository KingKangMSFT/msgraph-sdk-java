// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnsAfterRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Range Columns After Request Builder.
 */
public interface IBaseWorkbookRangeColumnsAfterRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeColumnsAfterRequest
     *
     * @return the IWorkbookRangeColumnsAfterRequest instance
     */
    IWorkbookRangeColumnsAfterRequest buildRequest();

    /**
     * Creates the IWorkbookRangeColumnsAfterRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeColumnsAfterRequest instance
     */
    IWorkbookRangeColumnsAfterRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
