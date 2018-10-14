package Matematyk;

public class MathMain {

    public static void main(String[] args) {

        Mathman mathman = new Mathman();

        double result = mathman.divide(10, 0);

        System.out.println("Wynik dzielenia wynosi " + result);
    }
}
