package algorytmDwa.carPricing;

public class Mirek {

    private Vehicle wycenaAuta;

    public void setWycenaAuta(Vehicle wycenaAuta)
    {
        this.wycenaAuta = wycenaAuta;
    }
    public void pricingAuto()
    {
        this.wycenaAuta.pricingAuto();
    }

    public Mirek() {
        System.out.println("Jestem w konstruktorze bezparametrowym klasy Mirek");
    }
}
