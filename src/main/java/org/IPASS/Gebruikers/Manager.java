package org.IPASS.Gebruikers;

import org.IPASS.Afspraak.Afspraak;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private static ArrayList<Gebruiker> alleGebruikers = new ArrayList<>();
    private static ArrayList<Kapper> alleKappers = new ArrayList<>();
    private static ArrayList<Afspraak> alleNieuweAangevraagdeAfspraken = new ArrayList<>();
    private static ArrayList<Afspraak> alleGeaccepteerdeAfspraken = new ArrayList<>();

    public static List<Afspraak> krijgAlleGeaccepteerdeAfspraken() {
        return alleGeaccepteerdeAfspraken;
    }

    public static ArrayList<Gebruiker> krijgAlleGebruikers() {
        return alleGebruikers;
    }

    public static void zetAlleGebruikers(ArrayList<Gebruiker> alleGebruikers) {
        Manager.alleGebruikers = alleGebruikers;
    }

    public static ArrayList<Kapper> krijgAlleKappers() {
        return alleKappers;
    }

    public static void zetAlleKappers(ArrayList<Kapper> alleKappers) {
        Manager.alleKappers = alleKappers;
    }

    public static ArrayList<Afspraak> krijgAlleNieuweAangevraagdeAfspraken() {
        return alleNieuweAangevraagdeAfspraken;
    }

    public static void zetAlleNieuweAangevraagdeAfspraken(ArrayList<Afspraak> alleNieuweAangevraagdeAfspraken) {
        Manager.alleNieuweAangevraagdeAfspraken = alleNieuweAangevraagdeAfspraken;
    }

    public static void zetAlleGeaccepteerdeAfspraken(ArrayList<Afspraak> alleGeaccepteerdeAfspraken) {
        Manager.alleGeaccepteerdeAfspraken = alleGeaccepteerdeAfspraken;
    }
}
