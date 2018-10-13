package Piggybank;

public class Child {

    private PiggyBank skarbonke;

    public Child() {
        this.skarbonke = new PiggyBank();
    }

    public void przyjmijKieszonkowe(double kieszonkowe)
    {
        System.out.println("Huura! Dostalem " + kieszonkowe + "zl kieszonkowego");
        this.skarbonke.addCash(kieszonkowe);
    }

    public double getMoneyFromPiggyBank()
    {
        return this.skarbonke.getCash();
    }

}
