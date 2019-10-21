package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void provjeraDodavanjaArtikla() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Ovo je test", 399, "1"));
        Artikl[] artikli = supermarket.getArtikli();

        // 1. TEST ovo ce proci ako sljedeci izraz bude tacan
        assertTrue(artikli[0] != null);
        //assertNotNull(artikli[0]);  // drugi, efikasniji nacin

        //artikli[2].getCijena(); // 2. TEST ovaj pada zato sto je ovo null, tj. objekat uopce ne postoji u nizu
    }

    @Test
    void provjeraPrekoracenja() {
        assertDoesNotThrow(
                () ->  {
                    Supermarket supermarket = new Supermarket();
                    for (int i = 0; i < 1000; i++) {
                        supermarket.dodajArtikl(new Artikl("ime", 399, "kodi"));
                    }
                    //supermarket.dodajArtikl(new Artikl("test", 299, "kod"));  // ako ovaj clan dodamo, onda ce se prekoraciti broj elemenata niza
                }
        );
    }
}