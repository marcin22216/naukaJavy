package sklep;

public class Produkt {

    private String nazwa;

    private int ilosc;

    private double cena;

    private boolean isProdukt;

    public void odejmijIlosc(int iloscDoOdjecia) { this.ilosc = this.ilosc - iloscDoOdjecia; }

    public Produkt(String nazwa, int ilosc, double cena, boolean isProdukt) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.cena = cena;
        this.isProdukt = isProdukt;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public boolean isProdukt() {
        return isProdukt;
    }

    public void setProdukt(boolean produkt) {
        isProdukt = produkt;
    }
}
