package org.IPASS.Gebruikers;

import javax.security.auth.Subject;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

public abstract class Gebruiker implements Principal {
    public static List<Gebruiker> alleGebruikers = new ArrayList<>();
    protected String voornaam;
    protected String achternaam;
    protected String wachtwoord;
    protected String email;
    protected String rol;

    public Gebruiker(String voornaam, String achternaam, String email, String wachtwoord) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.wachtwoord = wachtwoord;
    }

    public static Gebruiker krijgGebruikerBijMail(String mail) {
        return alleGebruikers.stream()
                .filter(e -> e.email.equals(mail))
                .findFirst()
                .orElse(null);
    }

    public static String validateLogin(String mail, String ww) {
        Gebruiker gevonden = krijgGebruikerBijMail(mail);
        if (gevonden != null && ww.equals(gevonden.wachtwoord)) {
            return gevonden.krijgRol();
        }
        throw new IllegalArgumentException();
    }

    public String krijgRol() {
        return rol;
    }

    @Override
    public String getName() {
        return voornaam;
    }

    @Override
    public boolean implies(Subject subject) {
        return false;
    }
}