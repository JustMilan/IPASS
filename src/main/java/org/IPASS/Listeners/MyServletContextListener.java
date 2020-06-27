package org.IPASS.Listeners;

import org.IPASS.Afspraak.Afspraak;
import org.IPASS.Data.Manager;
import org.IPASS.Gebruikers.Kapper;

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

        Afspraak mock = new Afspraak("VoornaamTest", "AchternaamTest",
                LocalDateTime.of(2020, 10, 10, 13, 20),
                "testemail@gmail.com", "Heren", "Tondeuse");

        Kapper milan = new Kapper("Milan", "Dol", "milandol321@gmail.com", "1234");
        Kapper k1 = new Kapper("Karen", "Cares", "karen@kikakappers.nl", "1234");
        Kapper k2 = new Kapper("Marie", "Mul", "marie@kikakappers.nl", "1234");
        Kapper k3 = new Kapper("Snelle", "Jongen", "snelle@kikakappers.nl", "1234");
        Kapper k4 = new Kapper("Punker", "Rock", "punker@kikakappers.nl", "1234");
        Kapper k5 = new Kapper("Lara", "Bootman", "lara@kikakappers.nl", "1234");
        milan.zetRol("kapper");
        k1.zetRol("kapper");
        k2.zetRol("kapper");
        k3.zetRol("kapper");
        k4.zetRol("kapper");
        k5.zetRol("kapper");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Applicatie gaat afsluiten");
        System.out.println("Ruim objecten op, of sla data op");
    }
}
