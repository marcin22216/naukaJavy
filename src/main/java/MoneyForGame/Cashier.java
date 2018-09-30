package MoneyForGame;

public class Cashier {

    public void checkMoney(Child money, Game game)
    {
        System.out.println("Ile masz pieniedzy?");

        if (money.getMyMoney() < game.getGamePrice())
        {
            System.out.println("Nie sprzedaje, masz za mało pieniedzy");
        }
        else
        {
            System.out.println("Sprzedaje");
        }
    }

}
