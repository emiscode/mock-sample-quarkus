package com.b2b.mock;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/OUDServicesMVE")
public class OUDServicesMVEMock {

    @POST
    @Path("/EmailSendOTP")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response emailSendOTP() {
        MockHelper.log(this.getClass().getName());
        return MockHelper.response(Response.Status.OK, "json/EmailSendOTP.json");
    }
}
