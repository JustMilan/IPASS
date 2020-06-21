package org.IPASS.Afspraak;

import org.IPASS.Data.Manager;
import org.IPASS.Gebruikers.Klant;
import org.IPASS.Utils.Utils;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Afspraak implements Serializable {
    private String voornaam;
    private String achternaam;
    private LocalDateTime datumTijd;
    private String email;
    private String afspraakVoor;
    private String afspraakType;
    private UUID uuid;

    private int duratie;
    private Klant klant;
    private String status;
    private static List<Afspraak> alleAfspraken = new ArrayList<>();

    public Afspraak(String voornaam, String achternaam, LocalDateTime datumTijd, String email, String afspraakVoor, String afspraakType) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.datumTijd = datumTijd;
        this.email = email;
        this.afspraakVoor = afspraakVoor;
        this.afspraakType = afspraakType;
        this.uuid = UUID.randomUUID();
    }

//    public Afspraak(LocalDateTime datumTijd, int duratie, Klant klant) {
//        this.datumTijd = datumTijd;
//        this.klant = klant;
//        this.duratie = duratie;
//        this.status = "Onbeoordeeld";
//        alleAfspraken.add(this);
//        Manager.krijgAlleNieuweAangevraagdeAfspraken().add(this);
//    }

//    public static Afspraak maakAfspraakAan(LocalDateTime datumTijd, int duratie, Klant klant) {
//        if (alleAfspraken.stream().noneMatch(e->e.getDatumTijd().equals(datumTijd))) {
//            return new Afspraak(datumTijd, duratie, klant);
//        } else {
//            return null;
//        }
//    }

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

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAfspraakVoor() {
        return afspraakVoor;
    }

    public void setAfspraakVoor(String afspraakVoor) {
        this.afspraakVoor = afspraakVoor;
    }

    public String getAfspraakType() {
        return afspraakType;
    }

    public void setAfspraakType(String afspraakType) {
        this.afspraakType = afspraakType;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public static Afspraak getAfspraakOpUuid(UUID uuid) {
        return Manager.krijgAlleNieuweAangevraagdeAfspraken().stream()
                .filter(Afspraak -> Afspraak.getUuid().equals(uuid))
                .findFirst().orElse(null);
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
