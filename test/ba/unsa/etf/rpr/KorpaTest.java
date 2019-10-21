package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void provjeraDodavanjaArtikla() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Ovo je test", 399, "1"));
        Artikl[] artikli = supermarket.getArtikli();

        assertTrue(artikli[0] != null);
        for (int i = 1; i < 50; i++) {
            assertTrue(artikli[i] == null);
        }// ovaj sad provjerava da li smo dodali prvi element, a s tim da su ostali null
    }



}