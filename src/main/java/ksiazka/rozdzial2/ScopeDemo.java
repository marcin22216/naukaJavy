package ksiazka.rozdzial2;

//Demonstruje zasięg bloku.

public class ScopeDemo {

    public static void main(String[] args) {
        int x; //widoczna w całym kodzie metody main

        x = 10;
        if (x == 10){
            int y = 20;

            //tutaj widoczne x i y
            System.out.println("x i y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; //błąd y  nie jest tu widoczne
        // x jest tu nadal widoczne
        System.out.println("x jest " + x);
    }

}
