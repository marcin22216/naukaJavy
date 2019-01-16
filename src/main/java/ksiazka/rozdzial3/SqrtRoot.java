package ksiazka.rozdzial3;
import static java.lang.Math.*;
//Wylicza pierwiastki wartości od 1 do 99 oraz błąd zaookrąglenia.
public class SqrtRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100; num++) {
            sroot = Math.sqrt(num);

            System.out.println("Pierwiastek kwadratowy z " + num +
                    " wynosi " + sroot);

            //wylicza błąd zaokrąglenia
            rerr = num - (sroot * sroot);
            System.out.println("Błąd zaokrąglenia wynosi " + rerr);
            System.out.println();
        }
    }
}
