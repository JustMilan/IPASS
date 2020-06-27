package org.IPASS.Afspraak;

import org.IPASS.Data.Manager;

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
    private static List<Afspraak> alleAfspraken = new ArrayList<>();

    public Afspraak(String voornaam, String achternaam, LocalDateTime datumTijd, String email, String afspraakVoor, String afspraakType) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.datumTijd = datumTijd;
        this.email = email;
        this.afspraakVoor = afspraakVoor;
        this.afspraakType = afspraakType;
        this.uuid = UUID.randomUUID();
        if (!Manager.krijgAlleNieuweAangevraagdeAfspraken().contains(this)) {
            Manager.krijgAlleNieuweAangevraagdeAfspraken().add(this);
        }
    }

    public static Afspraak getAfspraakByTijd(LocalDateTime datumEnTijd) {
        return alleAfspraken.stream().filter(e -> e.getDatumTijd() == datumEnTijd).findFirst().orElse(null);
    }

    public LocalDateTime getDatumTijd() {
        return datumTijd;
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

    public String getAfspraakType() {
        return afspraakType;
    }

    public UUID getUuid() {
        return uuid;
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
        return Objects.equals(voornaam, afspraak.voornaam) &&
                Objects.equals(achternaam, afspraak.achternaam) &&
                Objects.equals(datumTijd, afspraak.datumTijd) &&
                Objects.equals(email, afspraak.email) &&
                Objects.equals(afspraakVoor, afspraak.afspraakVoor) &&
                Objects.equals(afspraakType, afspraak.afspraakType) &&
                Objects.equals(uuid, afspraak.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voornaam, achternaam, datumTijd, email, afspraakVoor, afspraakType, uuid);
    }
}
