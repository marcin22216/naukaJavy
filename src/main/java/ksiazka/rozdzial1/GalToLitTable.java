package ksiazka.rozdzial1;

public class GalToLitTable {

    /*
    Program wyświetla tabelę zamiany galonów na litry.
     */

    public static void main(String[] args) {
        double gallons, litres;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 30; gallons++){
            litres = gallons * 3.7854;
            System.out.println(gallons + " galonów to " +
                    litres + " litrów ");

            counter++;

            if (counter == 10){
                System.out.println();
                counter = 0;
            }
        }

    }

}
