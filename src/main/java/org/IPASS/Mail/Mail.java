package org.IPASS.Mail;

import org.IPASS.Utils.Utils;

public class Mail {
    private String mail;
    private String onderwerp;
    private String bericht;

    public String getMail() {
        return mail;
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public String getBericht() {
        return bericht;
    }

    public Mail(String mail, String onderwerp, String bericht) {
        this.mail = mail;
        this.onderwerp = onderwerp;
        this.bericht = bericht;
    }

    public static boolean checkMail (String mail) {
        return Utils.checkMail(mail);
    }

    public static boolean checkOnderwerpValid(String onderwerp) {
        return Utils.checkOnderwerpValid(onderwerp);
    }

    public static boolean checkBericht (String bericht) {
        return Utils.checkBericht(bericht);
    }
}
