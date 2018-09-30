package HumanBook;

public class Human {

    public void checkPrice (Book book)
    {
        System.out.println("Dzien dobry ile kosztuje ksiazka");


        if (book.getBookPrice() < 100)
        {
            System.out.println("OK Biore!");
        }
        else
        {
            System.out.println("Za Droga!");
        }

    }


}
