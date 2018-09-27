package HumanBook;

public class Human {

    public double checkPrice (Book priceForCheck)
    {
        System.out.println("Dzien dobry ile kosztuje ksiazka");

        if (priceForCheck >= 100)
        {
            System.out.println("OK Biore!");
        }
        else
        {
            System.out.println("Za Droga!");
        }
    }


}
