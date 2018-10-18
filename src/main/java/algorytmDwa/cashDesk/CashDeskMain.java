package algorytmDwa.cashDesk;

public class CashDeskMain {

    public static void main(String[] args) {

        CashDesk cashDesk = new CashDesk();

        cashDesk.setKasjer(new CashierGBP());

        cashDesk.takeTheMoney();

    }

}
