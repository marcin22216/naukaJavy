package sklep;

import java.util.List;

public class Klient {

    private Produkt mojProdukt;


    public void kupPierwszyProduktzListy(List<Produkt> listaProdutkowDoKupienia)
    {
        this.mojProdukt = listaProdutkowDoKupienia.get(0);


    }


    public void kupZMagazynu(Magazyn magazyn)
    {
        this.mojProdukt = magazyn.zwrocAsortyment().get(0);
    }

    public Produkt pochwalSieProduktem()
    {
        return this.mojProdukt;
    }
}
