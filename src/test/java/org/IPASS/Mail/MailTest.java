package org.IPASS.Mail;

import org.junit.Test;

import static org.junit.Assert.*;

public class MailTest {
    @Test
    public void checkMailDetecteertDubbeleAtEmailAdres() {
        assertFalse(Mail.checkMail("milan@@mail.com"));
    }

    @Test
    public void checkMailDetecteertDubbelePuntVoorEind() {
        assertFalse(Mail.checkMail("milandol@gmail..com"));
    }

    @Test
    public void checkMailLaatSubdomeinenToe() {
        assertTrue(Mail.checkMail("milan.dol@student.hu.nl"));
    }

    @Test
    public void checkOnderwerpLaatIngevuldOnderwerpDoor() {
        Mail test = new Mail("milan.dol@student.hu.nl", "te kort", "mijn kapsel is te kort");
        assertTrue(Mail.checkOnderwerpValid(test.toString()));
    }

//    @Test
//    void checkOnderwerpDetecteertLeegOnderwerp() {
//        Mail test = new Mail("milan.dol@student.hu.nl", "", "niets te melden");
//        assertFalse(Mail.checkOnderwerpValid(test.toString()));
//    }
//
//    @Test
//    void checkBerichtDetecteertLeegBericht() {
//        Mail testLeegBericht = new Mail("milan.dol@student.hu.nl", "onderwerp", "");
//        assertFalse(Mail.checkBericht(testLeegBericht.toString()));
//    }

    @Test
    public void checkBerichtLaatIngevuldBerichtDoor() {
        Mail test1 = new Mail("milan.dol@student.hu.nl", "onderwerp", "ingevuld");
        assertTrue(Mail.checkBericht(test1.toString()));
    }

}