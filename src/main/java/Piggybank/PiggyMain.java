package Piggybank;

public class PiggyMain {

    public static void main(String[] args) {
        Mother mother = new Mother();
        Child child = new Child();

        System.out.println("Mama ma kasy PRZED daniem kieszonkowego = " + mother.getWallet().getMoney());

        mother.dajKieszonkowe(child, -30);
//        mother.dajKieszonkowe(child, 15);
//        mother.dajKieszonkowe(child, 15);

        double moneyFromPiggyBank = child.getMoneyFromPiggyBank();

        System.out.println("Dziecko ma w skarbonce " + moneyFromPiggyBank + "zl");

        System.out.println("Mama ma kasy PO daniu kieszonkowego = " + mother.getWallet().getMoney());

    }

}
