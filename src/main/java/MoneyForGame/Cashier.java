package MoneyForGame;

public class Cashier {

    public void checkMoney(Child money, Game game, Child cardMoney)
    {
        System.out.println("Ile masz pieniedzy?");

        if (money.getMyMoney() < game.getGamePrice())
        {
            System.out.println("Nie sprzedaje, masz za mało pieniedzy, ale mozesz doplacic karta");

            if (money.getMyMoney() + cardMoney.getCardMoney() < game.getGamePrice())
            {
                System.out.println("Dalej za mało, transakcja nie przeszla");
            }
            else
            {
                System.out.println("Wszystko w porzadku, oto twoja gra");
            }
        }
        else
        {
            System.out.println("Sprzedaje");
        }
    }

}
