package org.IPASS.Gebruikers;

import org.IPASS.Afspraak.Afspraak;
import org.IPASS.Data.Manager;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class Kapper extends Gebruiker {
    private String wachtwoord;
    private String rol;
    private List<Afspraak> alleGeaccepteerdeAfspraken = new ArrayList<>();

    public Kapper(String voornaam, String achternaam, String email, String wachtwoord) {
        super(voornaam, achternaam, email, wachtwoord);
        this.rol = "kapper";
        if (!Manager.krijgAlleKappers().contains(this)) {
            Gebruiker.alleGebruikers.add(this);
            Manager.krijgAlleKappers().add(this);
        }
    }

    @Override
    public String getName() {
        return voornaam;
    }

    @Override
    public boolean implies(Subject subject) {
        return false;
    }

    public String krijgWachtwoord() {
        return wachtwoord;
    }

    public void zetWachtwoord(String wachtwoord) {
        if (wachtwoord.isBlank()) {
            throw new IllegalArgumentException("Achternaam is niet ingevuld");
        }
        this.wachtwoord = wachtwoord;
    }

    public String krijgVoornaam() {
        return voornaam;
    }

    public void zetVoornaam(String voornaam) {
        if (voornaam.isBlank()) {
            throw new IllegalArgumentException("Voornaam is niet ingevuld");
        }
        this.voornaam = voornaam;
    }

    public String krijgAchternaam() {
        return achternaam;
    }

    public void zetAchternaam(String achternaam) {
        if (achternaam.isBlank()) {
            throw new IllegalArgumentException("Achternaam is niet ingevuld");
        }
        this.achternaam = achternaam;
    }

    public String krijgEmail() {
        return email;
    }

    public void zetEmail(String email) {
        this.email = email;
    }

    public void voegAfspraakToe(Afspraak afspraak) {
        alleGeaccepteerdeAfspraken.add(afspraak);
        Manager.krijgAlleGeaccepteerdeAfspraken().add(afspraak);
    }

    public String krijgRol() {
        return rol;
    }

    public void zetRol(String rol) {
        this.rol = rol;
    }
}
