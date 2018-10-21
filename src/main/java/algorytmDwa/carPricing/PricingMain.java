package algorytmDwa.carPricing;

public class PricingMain {

    public static void main(String[] args) {
        Mirek mirek = new Mirek();
        mirek.setWycenaAuta(new Audi(16, 155));
        mirek.pricingAuto();
    }

}
