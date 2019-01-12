package ksiazka.rozdzial1;

public class inchToMetre {

    /*
    Program wyświetlający tabelę konwersacji cali na
    metry. Wyświetla dla 12 stóp, cal po calu.
        */
    public static void main(String[] args) {
        double inch, metr;
        int counter2;

        counter2 = 0;

        for (inch = 1; inch <= 144; inch++){
            metr = inch / 39.37;
            System.out.println(inch + " cali to " + metr + " metrów ");

            counter2++;

            if (counter2 == 12){
                System.out.println();
                counter2 = 0;
            }

        }

    }

}
