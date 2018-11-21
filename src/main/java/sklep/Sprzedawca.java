package sklep;

import java.util.List;

public class Sprzedawca {


    private Sklep sklep;

    public Sklep getSklep() {
        return sklep;
    }

    List<Produkt> listaProduktow = (List<Produkt>) sklep.magazyn.getListaProduktow();

    public void pokazProdukty()
    {
        for (Produkt produkt : listaProduktow)
        {
            System.out.println(produkt.getNazwa());
            System.out.println(produkt.getCena());
        }
    }

    public void SprawdzIlosc()
    {

    }

    public void sprzedajProdukt(Produkt produktNaSprzedaz, int ilosc)
    {

        if (produktNaSprzedaz.isProdukt() == true)
        {
            produktNaSprzedaz.odejmijIlosc(ilosc);

            System.out.println("Oto" + produktNaSprzedaz.getNazwa());
        }
        else
        {
            System.out.println("Niestety nie ma" + produktNaSprzedaz.getNazwa());
        }
    }
}
