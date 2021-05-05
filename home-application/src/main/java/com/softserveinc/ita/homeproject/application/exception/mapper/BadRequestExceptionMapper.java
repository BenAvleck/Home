package com.softserveinc.ita.homeproject.application.exception.mapper;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;


/**
 * BadRequestExceptionMapper class is used to return exception
 * response with HTTP status code, when a request not match API requirements.
 */

@Provider
public class BadRequestExceptionMapper extends BaseExceptionMapper<BadRequestException> {
    @Override
    protected Response.Status getStatus() {
        return Response.Status.BAD_REQUEST;
    }

    @Override
    protected String extractMessage(BadRequestException exception) {
        return exception.getMessage();
    }
}