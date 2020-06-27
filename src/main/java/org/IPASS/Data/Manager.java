package org.IPASS.Data;

import org.IPASS.Afspraak.Afspraak;
import org.IPASS.Gebruikers.Kapper;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private static ArrayList<Kapper> alleKappers = new ArrayList<>();
    private static ArrayList<Afspraak> alleNieuweAangevraagdeAfspraken = new ArrayList<>();
    private static ArrayList<Afspraak> alleGeaccepteerdeAfspraken = new ArrayList<>();
    private static ArrayList<Afspraak> alleGeweigerdeAfspraken = new ArrayList<>();

    public static List<Afspraak> krijgAlleGeaccepteerdeAfspraken() {
        return alleGeaccepteerdeAfspraken;
    }

    public static ArrayList<Kapper> krijgAlleKappers() {
        return alleKappers;
    }

    public static ArrayList<Afspraak> krijgAlleNieuweAangevraagdeAfspraken() {
        return alleNieuweAangevraagdeAfspraken;
    }

    public static ArrayList<Afspraak> getAlleGeweigerdeAfspraken() {
        return alleGeweigerdeAfspraken;
    }
}
