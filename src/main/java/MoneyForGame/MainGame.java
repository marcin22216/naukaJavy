package MoneyForGame;

import CheckAge.Seller;

public class MainGame {

    public static void main(String[] args) {

        Child money = new Child();

        Child cardMoney = new Child();

        Cashier cashier = new Cashier();

        Game game = new Game();

        money.setMyMoney(50);
        game.setGamePrice(99);
        cardMoney.setCardMoney(40);
        cashier.checkMoney(money, game, cardMoney);




    }
}
