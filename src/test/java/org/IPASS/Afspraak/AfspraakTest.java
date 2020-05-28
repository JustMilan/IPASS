//package org.IPASS.Afspraak;
//
//import org.IPASS.Gebruikers.Klant;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.time.LocalDateTime;
//
//public class AfspraakTest {
//
//    @Test
//    public void AfspraakKanNietVoorVandaag() {
//        LocalDateTime gister = (LocalDateTime.now().minusDays(1));
//        Assert.assertFalse(Afspraak.checkDatumTijd(gister));
//    }
//
//    @Test
//    public void AfspraakKanNietVandaag() {
//        LocalDateTime vandaag = LocalDateTime.now();
//        Assert.assertFalse(Afspraak.checkDatumTijd(vandaag));
//    }
//
//    @Test
//    public void StandaardStatusMoetFalseZijn() {
//        Afspraak testAfspraak = new Afspraak(LocalDateTime.now().plusDays(1),
//                new Klant("TestKlant", "testklant@gmail.com"), new Klant("TestKlant", "testklant@gmail.com")) ;
//        Assert.assertFalse(Afspraak.checkStatus(testAfspraak.getStatus()));
//    }
//
//}