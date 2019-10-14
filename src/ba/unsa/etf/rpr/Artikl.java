package ba.unsa.etf.rpr;

public class Artikl {

    String naziv, kod;
    int cijena;

    public Artikl(String n, int c, String k) {
        this.naziv = n;
        this.cijena = c;
        this.kod = k;
    }

    public String getNaziv() { return this.naziv; }
    public String getKod() { return this.kod; }
    public int getCijena() { return this.cijena; }
}
