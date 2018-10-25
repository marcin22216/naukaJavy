package Dryer;

public class Praczka {

    private WasherDryer washerDryer;
    private Clothes clothes;

    public Praczka()
    {
        this.washerDryer = new WasherDryer();
    }

    public Praczka(WasherDryer dupa)
    {
        this.washerDryer = dupa;
    }

    public void zamknijPralke()
    {
        this.washerDryer.setOpen(false);
    }

    public void zrobPranie()
    {
        washerDryer.washingAndCheckingbeforeStart(clothes);
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public void wlaczPratke() { this.washerDryer.setOn(true);}
}
