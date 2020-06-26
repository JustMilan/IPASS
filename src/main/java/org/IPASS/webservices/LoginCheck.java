package org.IPASS.webservices;

import javax.annotation.security.RolesAllowed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/loggedin")
public class LoginCheck {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("kapper")
    public Response loginCheck() {
        return Response.status(Response.Status.OK).build();
    }
}
