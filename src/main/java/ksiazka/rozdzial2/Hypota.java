package ksiazka.rozdzial2;
import static java.lang.Math.*;

/*
Stosuję twierdzenie Pitagforasa
do obliczenia przeciewprostokątnej
znając długości przyprostokątnych
 */

public class Hypota {

    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = sqrt(x*x + y*y);

        System.out.println("Przeciwprostokątna wynosi: " + z);


    }

}
