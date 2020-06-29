package org.IPASS.Mail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeedbackTest {
    Feedback test;

    @BeforeEach
    void initialize() {
        test = new Feedback("TestVoornaam", "TestAchternaam", "testemail@email.com",
                "Dit is een testbericht voor een test");
    }

    @Test
    void validConstructorShouldPass() {
        assertDoesNotThrow(() -> test);
    }

    @Test
    void getVoornaamShouldPass() {
        assertEquals("TestVoornaam", test.getVoornaam());
    }

    @Test
    void getAchternaamShouldPass() {
        assertEquals("TestAchternaam", test.getAchternaam());
    }

    @Test
    void getEmailShouldPass() {
        assertEquals("testemail@email.com", test.getEmail());
    }

    @Test
    void setEmailShouldPass() {
        assertDoesNotThrow(() -> test.setEmail("nieuweTestEmail@email.com"));
    }

    @Test
    void setVoornaamShouldPass() {
        assertDoesNotThrow(() -> test.setVoornaam("NieuweVoornaam"));
    }

    @Test
    void setAchternaamShouldPass() {
        assertDoesNotThrow(() -> test.setAchternaam("setNieuweAchternaam"));
    }
}
