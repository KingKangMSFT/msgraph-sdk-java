// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IPersonRequest;
import com.microsoft.graph.requests.extensions.PersonRequest;
import com.microsoft.graph.models.extensions.Person;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Person Request.
 */
public class BasePersonRequest extends BaseRequest implements IBasePersonRequest {

    /**
     * The request for the Person
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BasePersonRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<Person> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Person from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Person> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Person from the service
     *
     * @return the Person from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Person get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Person> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Person with a source
     *
     * @param sourcePerson the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Person sourcePerson, final ICallback<Person> callback) {
        send(HttpMethod.PATCH, callback, sourcePerson);
    }

    /**
     * Patches this Person with a source
     *
     * @param sourcePerson the source object with updates
     * @return the updated Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Person patch(final Person sourcePerson) throws ClientException {
        return send(HttpMethod.PATCH, sourcePerson);
    }

    /**
     * Creates a Person with a new object
     *
     * @param newPerson the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Person newPerson, final ICallback<Person> callback) {
        send(HttpMethod.POST, callback, newPerson);
    }

    /**
     * Creates a Person with a new object
     *
     * @param newPerson the new object to create
     * @return the created Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Person post(final Person newPerson) throws ClientException {
        return send(HttpMethod.POST, newPerson);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPersonRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PersonRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPersonRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PersonRequest)this;
     }

}

