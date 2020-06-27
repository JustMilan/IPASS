//package org.IPASS.Gebruikers;
//
//import junit.framework.TestCase;
//import org.junit.jupiter.api.BeforeEach;
//
//public class KapperTest extends TestCase {
//    private Kapper testKapper;
//
//    @BeforeEach
//    public void initialize() {
//        testKapper = new Kapper("VoornaamTest", "AchternaamTest", "testtest@test.com", "testwachtwoord");
//    }
//
//    public void testKrijgRol() {
//        assertNull(testKapper.krijgRol());
//    }
//
//    public void testZetRol() {
//        testKapper.zetRol("kapper");
//        assertEquals("kapper", testKapper.krijgRol());
//    }
//}