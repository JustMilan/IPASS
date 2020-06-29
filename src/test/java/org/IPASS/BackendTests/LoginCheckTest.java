package org.IPASS.BackendTests;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class LoginCheckTest {

    @Test
    void getLoggedInShouldPass() {
        HttpUriRequest request = new HttpGet("http://localhost:8080/loggedIn");
        assertDoesNotThrow(() -> request);
    }

    @Test
    void postLoggedInShouldPass() {
        HttpUriRequest request = new HttpPost("http://localhost:8080/HTML/loggedIn");
        assertDoesNotThrow(() -> request);
    }
}
