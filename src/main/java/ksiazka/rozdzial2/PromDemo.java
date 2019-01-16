package ksiazka.rozdzial2;
//Nieoczekiwany wynik promocji!
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b*b; //Rzutowanie nie potrzebne

        b = 10;
        b = (byte) (b * b);

        System.out.println("i oraz b: " + i + " " + b);
    }
}
