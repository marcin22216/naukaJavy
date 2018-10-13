package Piggybank;

public class Wallet {

    private double money;

    public double getMoney()
    { return money; }
    public void setMoney(double money)
    {this.money = money; }

    public void odejmijKase(double kasaDoOdjecia)
    {
        this.money = this.money - kasaDoOdjecia;
    }

}
