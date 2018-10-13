package Dryer;

public class Praczka {

    private WasherDryer washerDryer;
    private Clothes clothes;

    public Praczka()
    {
        this.washerDryer = new WasherDryer();
    }

    public void zrobPranie()
    {
        washerDryer.washing(clothes);
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
}
