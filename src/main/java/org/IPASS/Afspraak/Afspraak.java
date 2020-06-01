package org.IPASS.Afspraak;

import org.IPASS.Gebruikers.Klant;
import org.IPASS.Utils.Utils;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Afspraak implements Serializable {

    private LocalDateTime datumTijd;
    private int duratie;
    private Klant klant;
    private String status;
    private static List<Afspraak> alleAfspraken = new ArrayList<>();

    public Afspraak(LocalDateTime datumTijd, int duratie, Klant klant) {
        this.datumTijd = datumTijd;
        this.klant = klant;
        this.duratie = duratie;
        this.status = "Onbeoordeeld";
        alleAfspraken.add(this);
    }

    public static Afspraak maakAfspraakAan(LocalDateTime datumTijd, int duratie, Klant klant) {
        if (alleAfspraken.stream().noneMatch(e->e.getDatumTijd().equals(datumTijd))) {
            return new Afspraak(datumTijd, duratie, klant);
        } else {
            return null;
        }
    }

    public static Afspraak getAfspraakByTijd(LocalDateTime datumEnTijd) {
        return alleAfspraken.stream().filter(e->e.getDatumTijd()==datumEnTijd).findFirst().orElse(null);
    }

    public static List<Afspraak> getAlleAfspraken() {
        return alleAfspraken;
    }

    public static void setAlleAfspraken(List<Afspraak> alleAfspraken) {
        Afspraak.alleAfspraken = alleAfspraken;
    }

    public int getDuratie() {
        return duratie;
    }

    public void setDuratie(int duratie) {
        this.duratie = duratie;
    }

    public static boolean checkDatumTijd(LocalDateTime datumTijd) {
        return Utils.checkDatumTijd(datumTijd);
    }

    public static String checkStatus(String status) {
        return status;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDatumTijd() {
        return datumTijd;
    }

    public void setDatumTijd(LocalDateTime datumTijd) {
        this.datumTijd = datumTijd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Afspraak afspraak = (Afspraak) o;
        return duratie == afspraak.duratie &&
                Objects.equals(datumTijd, afspraak.datumTijd) &&
                Objects.equals(klant, afspraak.klant) &&
                Objects.equals(status, afspraak.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datumTijd, duratie, klant, status);
    }
}
