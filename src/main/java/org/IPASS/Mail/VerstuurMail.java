package org.IPASS.Mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class VerstuurMail {
    private static String to;
    private static String subject;
    private static String mailbody;


    public static void main(String[] args) {

        // Ontvanger ID is genoemd in de atributen.

        // Verstuurders ID
        String from = "milandol321@gmail.com";

        // SMTP server in dit geval SendGrid
        String host = "smtp.sendgrid.net";

        // Systeem properties worden hier opgevraagd
        Properties properties = System.getProperties();

        // zet mail server op
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Krijg het Session object. En geef de username en het wachtwoord.
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("milandol321@gmail.com", "K9wVPyHJ!");
            }
        });

        // Krijg SMTP debugger voor als iets fout gaat
//        session.setDebug(true);

        try {
            // Creër default Mime object.
            MimeMessage message = new MimeMessage(session);

            // Zet From: header field van de header.
            message.setFrom(new InternetAddress(from));

            // Zet To: header field van de header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Zet Onderwerp: header field
            message.setSubject(subject);

            // Hier wordt de mail body gezet.
            message.setText(mailbody);

            System.out.println("sending...");
            // Verzend mail.
            // Verzend mail.
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    public static void setTo(String to) {
        VerstuurMail.to = to;
    }

    public static void setSubject(String subject) {
        VerstuurMail.subject = subject;
    }

    public static void setMailbody(String mailbody) {
        VerstuurMail.mailbody = mailbody;
    }
}