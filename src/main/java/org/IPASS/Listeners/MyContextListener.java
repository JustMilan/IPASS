//package org.IPASS.Listeners;
//
//import org.IPASS.Persistence.PersistenceManager;
//import reactor.core.scheduler.Schedulers;
//import reactor.netty.http.HttpResources;
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.servlet.annotation.WebListener;
//import java.io.IOException;
//import java.time.Duration;
//
//@WebListener
//public class MyContextListener implements ServletContextListener {
//
//    @Override
//    public void contextInitialized(ServletContextEvent sce) {
//        try {
//            PersistenceManager.loadAfspraakFromAzure();
//            System.out.println("Afspraak loaded");
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println("initialized fout");
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent sce) {
//        try {
//            PersistenceManager.saveAfspraakToAzure();
//            System.out.println("Afspraak saved");
//        } catch (IOException e) {
//            System.out.println("destroyed fout");
//            e.printStackTrace();
//        }
//
//        Schedulers.shutdownNow();
//        HttpResources.disposeLoopsAndConnectionsLater(Duration.ZERO, Duration.ZERO).block();
//    }
//}
