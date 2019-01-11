package mojSklep;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Rzecz> listOfProducts;

    private List<Ilosci> listOfQuantity;

    public Warehouse() {
        this.listOfProducts = new ArrayList<Rzecz>();
        this.listOfQuantity = new ArrayList<Ilosci>();

    }

    public void addProduct(Rzecz thingToAdd, Ilosci ilosciDoDodania)
    {
        this.listOfProducts.add(thingToAdd);
        this.listOfQuantity.add(ilosciDoDodania);
    }

    public void odejmijKupione(int iloscDoOdjecia)
    {

    }


    public List<Rzecz> backListOfProduckts()
    {
        return this.listOfProducts;
    }

}
