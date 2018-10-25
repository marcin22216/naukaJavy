package algorytmDwa.carPricing;

public class Audi implements Vehicle {

    private double price;

    private int rimsSize;

    private boolean alu;

    private boolean metalic;

    private int enginePower;

    public Audi(boolean alu, boolean metalic) {
        this.alu = alu;
        this.metalic = metalic;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Audi(int rimsSize, int enginePower) {
        this.rimsSize = rimsSize;
        this.enginePower = enginePower;
    }


    public void pricingAuto() {
        if (this.rimsSize > 15) {
            this.price = this.price + 500;
        }
        if (this.enginePower > 150) {
            this.price = this.price + 1000;
        }

        if (this.alu) {
            this.price = this.price + 700;
        }
        if (this.metalic) {
            this.price = this.price + 1500;
        }
        System.out.println("Cena wynosi: " + this.price + " ZL");
    }
}




