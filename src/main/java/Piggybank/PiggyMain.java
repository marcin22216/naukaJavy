package Piggybank;

public class PiggyMain {

    public static void main(String[] args) {
        Mother mother = new Mother();
        Child child = new Child();
        Wallet wallet = new Wallet();
        PiggyBank piggyBank = new PiggyBank();

        mother.setWallet(wallet);
        wallet.setMoney(50);

        mother.checkAndGiveMoney(child);
        child.checkAndAddCash(piggyBank,mother);
        piggyBank.takeCash();

        System.out.println(wallet.getMoney());

    }

}
