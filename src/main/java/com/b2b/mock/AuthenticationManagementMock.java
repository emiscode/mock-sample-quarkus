package com.b2b.mock;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/authenticationManagement")
public class AuthenticationManagementMock {

    @POST
    @Path("/v1/AuthUserManager")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response authUserManager() {
        MockHelper.log(this.getClass().getName());
        return MockHelper.response(Response.Status.OK, "json/AuthUserManager.json");
    }
}
