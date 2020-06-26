package org.IPASS.webservices;

import com.azure.core.annotation.Post;
import org.IPASS.Afspraak.Afspraak;
import org.IPASS.Data.Manager;
import org.IPASS.Mail.Feedback;
import org.IPASS.Mail.Mail;
import org.IPASS.Mail.VerstuurMail;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Path("/feedback")
public class FeedbackResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response maakAfspraakAanvraag(@FormParam("feedbackVoornaam") String voornaam,
                                         @FormParam("feedbackVoornaam") String achternaam,
                                         @FormParam("feedbackEmail") String email,
                                         @FormParam("feedbackBericht") String bericht) {

        try {
            VerstuurMail.setTo("milandol321@gmail.com");
            VerstuurMail.setSubject("Feedback");
            VerstuurMail.setMailbody(bericht);
            VerstuurMail.main(null);
            return Response.status(Response.Status.OK).build();
        } catch (Exception e) {
            return Response.status(Response.Status.CONFLICT).build();
        }
    }
}
