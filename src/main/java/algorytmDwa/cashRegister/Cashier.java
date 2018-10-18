package algorytmDwa.cashRegister;

public class Cashier {

    private PaymentMedium srodekPlatniczy;

    public void setSrodekPlatniczy(PaymentMedium srodekPlatniczy)
    {
        this.srodekPlatniczy = srodekPlatniczy;
    }

    public void describeYourself()
    {
        this.srodekPlatniczy.describeYourself();
    }

}
