package Piggybank;

public class Mother {

    private Wallet wallet;

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public void checkAndGiveMoney(Child child)
    {
        if (wallet.getMoney() < 20)
        {
            System.out.println("Nie mam pieniedzy, nie dostaniesz kieszonkowego");
        }
        else
        {
            System.out.println("Oto twoje kieszonkowe");

        }
    }

}
