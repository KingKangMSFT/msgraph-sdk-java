// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.ContactFolder;
import com.microsoft.graph.requests.extensions.IContactFolderCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Contact Folder Collection Page.
 */
public class BaseContactFolderCollectionPage extends BaseCollectionPage<ContactFolder, IContactFolderCollectionRequestBuilder> implements IBaseContactFolderCollectionPage {

    /**
     * A collection page for ContactFolder
     *
     * @param response the serialized BaseContactFolderCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseContactFolderCollectionPage(final BaseContactFolderCollectionResponse response, final IContactFolderCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
