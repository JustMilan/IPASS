package org.IPASS.Afspraak;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AfspraakTest {
    Afspraak test;

    @BeforeEach
    void initialize() {
        test = new Afspraak("TestVoornaam", "TestAchternaam",
                LocalDateTime.of(2020, 7, 8, 10, 30),
                "testemail@email.com", "Heren", "Tondeuse");
    }

    @Test
    void validConstructorShouldPass() {
        assertDoesNotThrow(() -> test);
    }

    @Test
    void setVoornaamShouldPass() {
        assertDoesNotThrow(() -> test.setVoornaam("nieuweVoornaam"));
    }

    @Test
    void setAchternaamShouldPass() {
        assertDoesNotThrow(() -> test.setVoornaam("nieuweAchternaam"));
    }

    @Test
    void setEmailShouldPass() {
        assertDoesNotThrow(() -> test.setEmail("nieuweEmail@email.com"));
    }

    @Test
    void getDatumTijdShouldPass() {
        assertEquals(LocalDateTime.of(2020, 7, 8, 10, 30), test.getDatumTijd());
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
    void getAfspraakVoorShouldPass() {
        assertEquals("Heren", test.getAfspraakVoor());
    }

    @Test
    void getAfspraakTypeShouldPass() {
        assertEquals("Tondeuse", test.getAfspraakType());
    }

    @Test
    void getAfspraakOpUUIDShouldWork() {
        assertEquals(test, Afspraak.getAfspraakOpUuid(test.getUuid()));
    }
}