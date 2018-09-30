package MoneyForGame;

public class Child {
    private double myMoney;

    public double getMyMoney()
    { return myMoney + cardMoney; }

    public void setMyMoney(double myMoney)
    { this.myMoney = myMoney; }

    private double cardMoney;

    public double getCardMoney()
    { return cardMoney; }

    public void setCardMoney(double cardMoney)
    { this.cardMoney = cardMoney; }
}
