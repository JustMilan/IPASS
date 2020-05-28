package org.IPASS.Gebruikers;

public abstract class Gebruiker {
    protected String voornaam;
    protected String achternaam;
    protected String email;

    public Gebruiker(String voornaam, String achternaam, String email) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
    }
}
