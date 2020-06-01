package org.IPASS.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/afspraak")
public class AfspraakTestResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAfspraak() {
        return "not ok";
    }
}
