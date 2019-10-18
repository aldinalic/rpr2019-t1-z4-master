package ba.unsa.etf.rpr;

public class Supermarket {

    Artikl[] artikli = new Artikl[1000];
    int broj_el = 0;

    public Artikl[] getArtikli() { return artikli; }    // ova funkcija vraca niz artikala, tj. sve artikleu supermarketu

    public void dodajArtikl(Artikl novi) {
        broj_el = broj_el + 1;
        artikli[broj_el-1] = new Artikl(novi.naziv, novi.cijena, novi.kod);
    }

    public Artikl izbaciArtiklSaKodom(String kod) { // ovo izbacuje iz supermarketa artikl, a vraca isti taj artikl koji ce ubaciti u korpu
        for (int i = 0; i < broj_el; i++) {
            if (artikli[i].kod.equals(kod)) {
                Artikl temp = new Artikl(artikli[i].naziv, artikli[i].cijena, artikli[i].kod);
                for (int j = i; j < broj_el-1; j++) artikli[j] = artikli[j+1];
                broj_el = broj_el - 1;
                artikli[broj_el] = null;    // OVO JE JAKO BITNO, ZBOG RANGOVSKE PETLJE, JER DA NISMO STAVILI NA NULL, ZADNJI OBJEKAT
                // BI SE SMATRA0 DA PRIPADA NIZU, IAKO SMO SMANJILI BROJ_ELEMENATA NIZA
                // DA JE ISLO PREKO OBICNE PETLJE, NE BI SE ISPISAO, JER SE ON NALAZI NA POZICIJI artikli[broj_el]
                return temp;
            }
        }
        return null;
    }
}
