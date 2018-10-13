package Piggybank;

public class PiggyMain {

    public static void main(String[] args) {
        Mother mother = new Mother();
        Child child = new Child();

        mother.dajKieszonkowe(child, 30);
        mother.dajKieszonkowe(child, 15);
        mother.dajKieszonkowe(child, 15);

        double moneyFromPiggyBank = child.getMoneyFromPiggyBank();

        System.out.println("Dziecko ma w skarbonce " + moneyFromPiggyBank + "zl");

    }

}
