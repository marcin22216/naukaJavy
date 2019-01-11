package ksiazka.rozdzial1;

public class IfDemo {

    /*
    Instrukcja warunkowa if
     */

    public static void main(String[] args) {

        int a, b, c;
        a = 2;
        b = 3;

        if(a<b) System.out.println("a jest mniejsze od b");

        //poniższa instrukcja nie zostanie wykonana
        if (a == b) System.out.println("To wywołanie nie zostanie wykonane");
        System.out.println();

        c = a - b;

        System.out.println("c zawiera -1");
        if (c >= 0) System.out.println("c NIE jest ujemne");
        if (c < 0) System.out.println("c jest ujemne");

        System.out.println();

        c = b - a;

        System.out.println("c zawiera 1");
        if (c >= 0) System.out.println("c jest nieujemne");
        if (c < 0) System.out.println("c jest ujemne");




    }



}
