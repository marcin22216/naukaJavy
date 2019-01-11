package ksiazka.rozdzial1;

public class GalToLit {

    /*
    Program zmieniający Galony na litry
     */

    public static void main(String[] args) {

        double gallons; //przechowuje liczbę galonów
        double litres;  //przechowuje liczbę litrów (po zamianie)

        gallons = 10;

        litres = gallons * 3.7854;

        System.out.println(gallons + " galonów odpowiada " + litres);

    }

}
