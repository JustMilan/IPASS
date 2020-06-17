package org.IPASS.Listeners;

import org.IPASS.Afspraak.Afspraak;
import org.IPASS.Gebruikers.Kapper;
import org.IPASS.Gebruikers.Klant;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDateTime;

@WebListener
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Applicatie is aan het opstarten");
        System.out.println("Initialiseer hier objecten, of laad alvast data");

//        Afspraak.maakAfspraakAan(LocalDateTime.of(2020, 2, 2, 2, 30), 30,
//                new Klant("Klant", "Klant", "klant@klant.com"));

        // if rol is null dan normale kapper if .zetadmin dan admin
        new Kapper("Milan", "Dol", "milandol321@gmail.com", "1234");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Applicatie gaat afsluiten");
        System.out.println("Ruim objecten op, of sla data op");
    }
}
