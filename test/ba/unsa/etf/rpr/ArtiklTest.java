package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void ispravnostGettera() {
        Artikl artikl = new Artikl("Test", 100, "kod broj 1");

        assertEquals(100, artikl.getCijena());
        assertEquals("kod broj 1", artikl.getKod());
        assertEquals("Test", artikl.getNaziv());
    }

}