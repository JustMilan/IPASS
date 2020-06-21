package org.IPASS.webservices;

import org.IPASS.Afspraak.Afspraak;
import org.IPASS.Data.Manager;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Path("/afspraakaanvragen")
public class AfpraakResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response maakAfspraakAanvraag(@FormParam("voornaam") String voornaam,
                                         @FormParam("achternaam") String achternaam,
                                         @FormParam("email") String email,
                                         @FormParam("gewensteDatumTijd") String datumTijd,
                                         @FormParam("afspraakVoor") String afspraakVoor,
                                         @FormParam("afspraakType") String afspraakType) {

//       datumtijd komt zo binnen yyyy-MM-ddTHH:mm

//        String readable maken voor de formatter
        String zonderT = datumTijd.replace('T', ' ');
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        Zo parse je hem van datetimeformatter naar localdatetime, nodig voor de constructor
        LocalDateTime dateTime = LocalDateTime.parse(zonderT, formatter);

        Afspraak nieuweAfspraak = new Afspraak(voornaam, achternaam, dateTime, email, afspraakVoor, afspraakType);

        if (!Manager.krijgAlleNieuweAangevraagdeAfspraken().contains(nieuweAfspraak)) {
            Manager.krijgAlleNieuweAangevraagdeAfspraken().add(nieuweAfspraak);
            return Response.ok(nieuweAfspraak).build();
        }
        return Response.status(Response.Status.CONFLICT).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
//    @RolesAllowed("kapper") nog implementeren
    public Response vraagNieuweAanvragenOp() {
        return Response.ok(Manager.krijgAlleNieuweAangevraagdeAfspraken()).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
//    @RolesAllowed("kapper")
    public Response updateAfspraak() {
        return Response.ok().build();
    }

    @Path("/accepteren/{id}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response accepteerAfspraak(@PathParam("id") UUID uuid) {
        Afspraak afspraak = Afspraak.getAfspraakOpUuid(uuid);

        if (Manager.krijgAlleNieuweAangevraagdeAfspraken().contains(afspraak)) {
            Manager.krijgAlleGeaccepteerdeAfspraken().add(afspraak);
            Manager.krijgAlleNieuweAangevraagdeAfspraken().remove(afspraak);
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        if (!Manager.krijgAlleNieuweAangevraagdeAfspraken().contains(afspraak)
                && Manager.krijgAlleGeaccepteerdeAfspraken().contains(afspraak)) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CONFLICT).build();
    }

    @Path("/weigeren")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response weigerAfspraak(UUID uuid) {
        Afspraak afspraak = Afspraak.getAfspraakOpUuid(uuid);

        if (Manager.krijgAlleNieuweAangevraagdeAfspraken().contains(afspraak)) {
            Manager.krijgAlleNieuweAangevraagdeAfspraken().remove(afspraak);
            Manager.getAlleGeweigerdeAfspraken().add(afspraak);
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        if (!Manager.krijgAlleNieuweAangevraagdeAfspraken().contains(afspraak)
                && Manager.getAlleGeweigerdeAfspraken().contains(afspraak)) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CONFLICT).build();
    }

    @Path("/geaccepteerd")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAlleGeaccepteerdeAfspraken() {
        return Response.ok(Manager.krijgAlleGeaccepteerdeAfspraken()).build();
    }
}