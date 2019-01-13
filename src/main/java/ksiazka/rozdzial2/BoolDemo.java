package ksiazka.rozdzial2;

//Demonstruje typ boolean.

public class BoolDemo {

    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b jest " + b);
        b = true;
        System.out.println("b jest " + b);

        //wartość typu boolean może sterować instrukcją if
        if (b) System.out.println("To wywołanie zostało wykonane.");

        b = false;
        if (b) System.out.println("To wywołanie NIE zostało wykonane.");

        //wynikiem zastosowania operatora porównania jest wartośc boolean
        System.out.println("10 > 9 jest " + (10 > 9));
    }

}
