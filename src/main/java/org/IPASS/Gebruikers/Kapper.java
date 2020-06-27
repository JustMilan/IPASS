package org.IPASS.Gebruikers;

import org.IPASS.Afspraak.Afspraak;
import org.IPASS.Data.Manager;

import java.util.ArrayList;
import java.util.List;

public class Kapper extends Gebruiker {
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

    public String krijgRol() {
        return rol;
    }

    public void zetRol(String rol) {
        this.rol = rol;
    }
}
