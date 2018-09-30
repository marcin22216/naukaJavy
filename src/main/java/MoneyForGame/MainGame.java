package MoneyForGame;

import CheckAge.Seller;

public class MainGame {

    public static void main(String[] args) {

        Child myMoney = new Child();

        Cashier cashier = new Cashier();

        Game game = new Game();

        myMoney.setMyMoney(50.50);
        game.setGamePrice(99);
        cashier.checkMoney(myMoney);




    }
}
