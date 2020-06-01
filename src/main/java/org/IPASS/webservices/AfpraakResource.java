package org.IPASS.webservices;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.AbstractMap;

@Path("/afspraakmaken")
public class AfpraakResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response maakAfspraak(@FormParam("name") String name) {
        System.out.println("Entered method");
        if (name == null) {
            System.out.println("Naam is leeg");
            return Response.status(Response.Status.CONFLICT).entity(
                    new AbstractMap.SimpleEntry<String, String>("result", "Naam mag niet leeg zijn!")).build();
        }
            return Response.ok(new AbstractMap.SimpleEntry<>("result", "naam toegevoegd!")).build();
    }
}
