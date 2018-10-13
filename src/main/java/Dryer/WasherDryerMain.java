package Dryer;

public class WasherDryerMain {

    public static void main(String[] args) {

        WasherDryer washerDryer = new WasherDryer();
        Clothes clothes = new Clothes();
        Human human = new Human();

        clothes.setDirty(true);

        human.wlozPranie(clothes);

        washerDryer.washing(clothes);
        washerDryer.washing(clothes);

    }

}
