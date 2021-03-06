// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education School Collection Page.
 */
public class BaseEducationSchoolCollectionPage extends BaseCollectionPage<EducationSchool, IEducationSchoolCollectionRequestBuilder> implements IBaseEducationSchoolCollectionPage {

    /**
     * A collection page for EducationSchool
     *
     * @param response the serialized BaseEducationSchoolCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseEducationSchoolCollectionPage(final BaseEducationSchoolCollectionResponse response, final IEducationSchoolCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
