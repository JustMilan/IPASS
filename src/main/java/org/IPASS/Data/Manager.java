package org.IPASS.Data;

import org.IPASS.Afspraak.Afspraak;
import org.IPASS.Gebruikers.Gebruiker;
import org.IPASS.Gebruikers.Kapper;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private static ArrayList<Gebruiker> alleGebruikers = new ArrayList<>();
    private static ArrayList<Kapper> alleKappers = new ArrayList<>();
    private static ArrayList<Afspraak> alleNieuweAangevraagdeAfspraken = new ArrayList<>();
    private static ArrayList<Afspraak> alleGeaccepteerdeAfspraken = new ArrayList<>();
    private static ArrayList<Afspraak> alleGeweigerdeAfspraken = new ArrayList<>();

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

    public static ArrayList<Gebruiker> getAlleGebruikers() {
        return alleGebruikers;
    }

    public static void setAlleGebruikers(ArrayList<Gebruiker> alleGebruikers) {
        Manager.alleGebruikers = alleGebruikers;
    }

    public static ArrayList<Kapper> getAlleKappers() {
        return alleKappers;
    }

    public static void setAlleKappers(ArrayList<Kapper> alleKappers) {
        Manager.alleKappers = alleKappers;
    }

    public static ArrayList<Afspraak> getAlleNieuweAangevraagdeAfspraken() {
        return alleNieuweAangevraagdeAfspraken;
    }

    public static void setAlleNieuweAangevraagdeAfspraken(ArrayList<Afspraak> alleNieuweAangevraagdeAfspraken) {
        Manager.alleNieuweAangevraagdeAfspraken = alleNieuweAangevraagdeAfspraken;
    }

    public static ArrayList<Afspraak> getAlleGeaccepteerdeAfspraken() {
        return alleGeaccepteerdeAfspraken;
    }

    public static void setAlleGeaccepteerdeAfspraken(ArrayList<Afspraak> alleGeaccepteerdeAfspraken) {
        Manager.alleGeaccepteerdeAfspraken = alleGeaccepteerdeAfspraken;
    }

    public static ArrayList<Afspraak> getAlleGeweigerdeAfspraken() {
        return alleGeweigerdeAfspraken;
    }

    public static void setAlleGeweigerdeAfspraken(ArrayList<Afspraak> alleGeweigerdeAfspraken) {
        Manager.alleGeweigerdeAfspraken = alleGeweigerdeAfspraken;
    }
}
