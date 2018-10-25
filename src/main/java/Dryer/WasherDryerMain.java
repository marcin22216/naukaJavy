package Dryer;

public class WasherDryerMain {

    public static void main(String[] args)
    {

        // ctrl + pewy przycisk myszy
//        Praczka dupa = new Praczka(new WasherDryer());

        Praczka praczka = new Praczka();
        Clothes clothes = new Clothes();
        clothes.setDirty(true);


        praczka.setClothes(clothes);

        System.out.println("Ubranie przed praniem jest brudne? " + clothes.isDirty());

        praczka.zamknijPralke();



        praczka.zrobPranie();



        System.out.println("");
        System.out.println("Czy ubranie jest brudne po praniu? " + clothes.isDirty());



    }

}
