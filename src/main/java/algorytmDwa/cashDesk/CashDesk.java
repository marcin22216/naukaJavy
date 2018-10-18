package algorytmDwa.cashDesk;

public class CashDesk {

    private Cashier kasjer;

    public void setKasjer(Cashier kasjer)
    { this.kasjer = kasjer; }

    public void takeTheMoney()
    {
        this.kasjer.takeTheMoney();
    }

}
