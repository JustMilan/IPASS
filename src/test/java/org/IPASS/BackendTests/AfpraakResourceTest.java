package org.IPASS.BackendTests;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AfpraakResourceTest {

    @Test
    void getHomePageShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getOverOnsPageShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/HTML/Overons.html");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getExpertisePageShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/HTML/Expertise.html");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getConctactPageShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/HTML/Contact.html");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getAfspraakAanvragenPageShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/HTML/AfspraakPlanner.html");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void putAfspraakAccepteerShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/restservices/afspraakaanvragen/accepteren/id");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void putAfspraakWeigerenShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/restservices/afspraakaanvragen/weigeren/id");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getAlleAfsprakenShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/restservices/afspraakaanvragen");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void postNieuweAfspraakShouldPass() {
        HttpUriRequest request = new HttpPost("http://localhost:8080/restservices/afspraakaanvragen");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getKappersPaginaShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/HTML/KappersPagina.html");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getInlogPaginaShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/HTML/inloggen.html");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getPrijslijstShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/HTML/Prijslijst.html");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getgeaccepteerdeAfsprakenShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/HTML/geaccepteerdeAfspraken.html");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getAfspraakAanvragenShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/HTML/AfspraakPlanner.html");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void getAfspraakAanvragenBeoordelenShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/HTML/afspraakAanvragenBeoordelen.html");
        assertDoesNotThrow(() -> request);
    }
}
