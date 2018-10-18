package algorytmDwa.cashRegister;

public class PaymentMain {

    public static void main(String[] args) {

        Cashier cashier = new Cashier();

        cashier.setSrodekPlatniczy(new PLN());

        cashier.describeYourself();

    }

}
