package org.IPASS.Mail;

public class Feedback {
  private String voornaam;
  private String achternaam;
  private String email;
  private String bericht;

    public Feedback(String voornaam, String achternaam, String email, String bericht) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.bericht = bericht;
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
}
