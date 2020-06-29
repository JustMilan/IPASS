package org.IPASS.Mail;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VerstuurMailTest {

    // Er is hier weinig te testen ivm goede afsluiting van de methode. Daarnaast is de mehtode erg simpel.

    @BeforeEach
    void initializeBefore() {

    }

    @Test
    void setToShouldPass() {
       assertDoesNotThrow(() -> VerstuurMail.setTo("milandol321@gmail.com"));
    }

    @Test
    void setMailBodyShouldPass() {
        assertDoesNotThrow(() -> VerstuurMail.setMailbody("Dit is een testbody"));
    }

    @Test
    void setSubjectShouldPass() {
        assertDoesNotThrow(() -> VerstuurMail.setSubject("TestOnderwerp"));
    }
}