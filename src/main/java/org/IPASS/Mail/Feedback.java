package org.IPASS.Mail;

import org.IPASS.Gebruikers.Klant;

public class Feedback {
    private Klant mail;
    private Klant naam;
    private String onderwerp;
    private String bericht;

    public Feedback(Klant mail, Klant naam, String onderwerp, String bericht) {
        this.mail = mail;
        this.naam = naam;
        this.onderwerp = onderwerp;
        this.bericht = bericht;
    }
}
