// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookChartLegendRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartLegendFormatRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Legend Request Builder.
 */
public interface IBaseWorkbookChartLegendRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookChartLegendRequest instance
     */
    IWorkbookChartLegendRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartLegendRequest instance
     */
    IWorkbookChartLegendRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    /**
     * Gets the request builder for WorkbookChartLegendFormat
     *
     * @return the IWorkbookChartLegendFormatRequestBuilder instance
     */
    IWorkbookChartLegendFormatRequestBuilder format();

}
