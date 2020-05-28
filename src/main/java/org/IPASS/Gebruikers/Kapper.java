package org.IPASS.Gebruikers;

public class Kapper extends Gebruiker {
    private String wachtwoord;

    public Kapper(String voornaam, String achternaam, String email, String wachtwoord) {
        super(voornaam, achternaam, email);
        this.wachtwoord = wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }
}
