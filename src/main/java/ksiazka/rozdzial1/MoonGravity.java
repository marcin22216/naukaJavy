package ksiazka.rozdzial1;

public class MoonGravity {

    /*
    Program obliczający Twoją  wagę na księżycu
    przy założeniu, że grawitacja księżyca stanowi
    17% zeimskiej.
     */
    public static void main(String[] args) {

        double weight, moonWeight;

        weight = 95.5;
        System.out.println("Twoja waga na Ziemi wynosi: " + weight + " kg ");
        System.out.println();
        moonWeight = weight * 0.17;
        System.out.println("Twoja waga na Księżycu wynosi: " + moonWeight + " kg ");


    }


}
