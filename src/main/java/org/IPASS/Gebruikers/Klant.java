package org.IPASS.Gebruikers;

import javax.security.auth.Subject;

public class Klant extends Gebruiker {

    public Klant(String voornaam, String achternaam, String email, String wachtwoord) {
        super(voornaam, achternaam, email, wachtwoord);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean implies(Subject subject) {
        return false;
    }
}
