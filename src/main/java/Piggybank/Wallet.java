package Piggybank;

public class Wallet {

    private double money;
    private double subMoney;

    public double getMoney()
    { return money; }
    public void setMoney(double money)
    {this.money = money; }

    public double getSubMoney()
    { return subMoney; }
    public void setSubMoney()
    {
        this.subMoney = money - getMoney();
    }

}
