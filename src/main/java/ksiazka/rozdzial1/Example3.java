package ksiazka.rozdzial1;

public class Example3 {

    /*
    Różnica pomiedzy int a double
     */

    public static void main(String[] args) {

        int var;
        double x;

        var = 10;

        x = 10.0;

        System.out.println("Początkowa wartość zmiennej var " + var);
        System.out.println("Początkowa wartość zmiennej x" + x);

        System.out.println();       //wyświetla pusty wiersz

        //podzielenie obu wartośći przez 4

        var = var / 4;
        x = x / 4;
        System.out.println("var po dzieleniu " + var);
        System.out.println("x po dzieleniu " + x);

    }

}
