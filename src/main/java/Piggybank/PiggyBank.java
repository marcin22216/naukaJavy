package Piggybank;

public class PiggyBank {

    private double cash;

    public double getCash()
    { return this.cash; }

    public void addCash(double kieszonkowe)
    {
        this.cash = this.cash + kieszonkowe;
    }

}
