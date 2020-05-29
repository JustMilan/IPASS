package org.IPASS.Afspraak;

import org.IPASS.Gebruikers.Klant;
import org.IPASS.Utils.Utils;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Afspraak implements Serializable {

    private LocalDateTime datumTijd;
    private int duratie;
    private Klant naam;
    private Klant mail;
    private String status;

    public Afspraak(LocalDateTime datumTijd, int duratie, Klant naam, Klant mail) {
        this.datumTijd = datumTijd;
        this.naam = naam;
        this.mail = mail;
        this.duratie = duratie;
        this.status = "Onbeoordeeld";
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

    public Klant getNaam() {
        return naam;
    }

    public void setNaam(Klant naam) {
        this.naam = naam;
    }

    public Klant getMail() {
        return mail;
    }

    public void setMail(Klant mail) {
        this.mail = mail;
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
}
