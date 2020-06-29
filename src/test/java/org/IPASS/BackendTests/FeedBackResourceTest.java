package org.IPASS.BackendTests;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeedBackResourceTest {

    @Test
    void getMaakAfspraakAanShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/feedback");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void postMaakAfspraakAanShouldPass() {
        HttpUriRequest request = new HttpPost("http://localhost:8080/HTML/feedback");
        assertDoesNotThrow(() -> request);
    }
}
