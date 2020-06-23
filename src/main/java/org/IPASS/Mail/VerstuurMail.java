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

        // Recipient's email ID needs to be mentioned.
        to = "milandol321@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "milandol321@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.sendgrid.net";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("milandol321@gmail.com", "K9wVPyHJ!");
            }
        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(subject);

            // Now set the actual message
            message.setText(mailbody);

            System.out.println("sending...");
            // Send message
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