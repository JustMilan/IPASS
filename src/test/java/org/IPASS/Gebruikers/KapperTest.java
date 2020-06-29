package org.IPASS.Gebruikers;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class KapperTest {
    private Kapper testKapper;

    @BeforeEach
    public void initialize() {
        testKapper = new Kapper("VoornaamTest", "AchternaamTest", "testtest@test.com", "testwachtwoord");
    }

    @Test
    public void krijgRolShouldPass() {
        assertEquals("kapper", testKapper.krijgRol());
    }

    @Test
    public void zetRolShouldPass() {
        testKapper.zetRol("anders");
        assertEquals("anders", testKapper.krijgRol());
    }

    @Test
    void krijgVoornaamShouldPass() {
        assertEquals("VoornaamTest", testKapper.voornaam);
    }

    @Test
    void krijgAchternaamShouldPass() {
        assertEquals("AchternaamTest", testKapper.achternaam);
    }

    @Test
    void krijgEmailShouldPass() {
        assertEquals("testtest@test.com", testKapper.email);
    }

    @Test
    void krijgWachtwoordShouldPass() {
        assertEquals("testwachtwoord", testKapper.wachtwoord);
    }
}