package sklep;

import java.util.ArrayList;
import java.util.List;

public class Magazyn {

    // pola na samej gorze - wszystkie
    private List<Produkt> listaProduktow;


    // a potem metody


    public Magazyn() {
        this.listaProduktow = new ArrayList<Produkt>();
    }

    public void dodajProdukt(Produkt produktDoWlozeniaDoMagazynu)
    {
        this.listaProduktow.add(produktDoWlozeniaDoMagazynu);
    }


    public List<Produkt> zwrocAsortyment()
    {
        return this.listaProduktow;
    }



// Ta metoad jest na wpol dobra - ona umozliwia tylko dodanie Lalki i Pilki
//    public void dodaj() {
//        this.listaProduktow.add(new Produkt("Lalka", 10, 19.99));
//        this.listaProduktow.add(new Produkt("Pilka", 2, 15.20));
//    }
}
