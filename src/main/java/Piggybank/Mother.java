package Piggybank;

public class Mother {

    private Wallet wallet;

    public Mother() {
        this.wallet = new Wallet();
        this.wallet.setMoney(50);
    }

    public void dajKieszonkowe(Child child, double kwotaKieszonkowe) {
        if (this.wallet.getMoney() >= kwotaKieszonkowe) {
            child.przyjmijKieszonkowe(kwotaKieszonkowe);

//            double nowaIloscKAsyWPortfelu = wallet.getMoney() - kwotaKieszonkowe;
//            this.wallet.setMoney(nowaIloscKAsyWPortfelu);

            this.wallet.odejmijKase(kwotaKieszonkowe);

        } else {
            System.out.println("Brak srodkow w porfelu. Mam tylko + " + this.wallet.getMoney());
        }
    }

}

