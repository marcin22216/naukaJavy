package sklep;

import java.util.List;

public class Sprzedawca {

    private Produkt kupionyProdukt;

    Klient klient = new Klient();

    public Sprzedawca(Klient klient) {
        this.klient = klient;
    }

    public void sprzedajProdukt(List<Produkt> listaProduktowNaSprzedaz)
    {
        this.kupionyProdukt = listaProduktowNaSprzedaz.get(1);
    }


}
