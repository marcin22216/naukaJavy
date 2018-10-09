package Piggybank;

public class PiggyBank {

    private double cash;
    private Child child;

    public Child getChild()
    { return child; }
    public void setChild(Child child)
    { this.child = child; }

    public double getCash()
    { return cash; }
    public void setCash(double cash)
    { this.cash = cash; }

    public void takeCash()
    {
        this.cash = cash + 20;
    }

}
