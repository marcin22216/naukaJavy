package algorytmDwa.Lampa;

public class Lamp {

    private LightBulb mojaZarowka;


    public Lamp() {
        this.mojaZarowka = new LightBulb();
    }

    public void turnOn()
    {
        this.mojaZarowka.swiec();
    }
}
