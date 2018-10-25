package wycenaAut;

public class Audi implements Auto {

    private int rocznik;
    private boolean isAlu;

    public Audi(int rocznik, boolean isAlu) {
        this.rocznik = rocznik;
        this.isAlu = isAlu;
    }

    @Override
    public int getRocznik() {
        return this.rocznik;
    }

    @Override
    public boolean isAlu() {
        return this.isAlu;
    }
}
