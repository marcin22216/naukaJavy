package mojSklep;

import java.util.List;

public class Customer {

    private Rzecz myNewThing;

    public void buySecondProductFromList(List<Rzecz> listOfProductsToBuy)
    {
        this.myNewThing = listOfProductsToBuy.get(1);
    }

    public Rzecz showNewThing()
    {
        return this.myNewThing;
    }

}
