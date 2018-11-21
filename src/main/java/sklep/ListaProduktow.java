package sklep;

import java.util.ArrayList;
import java.util.List;

public class ListaProduktow {

    private List<Produkt> produkty;

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public ListaProduktow()
    { this.produkty = new ArrayList<Produkt>(); }



}
