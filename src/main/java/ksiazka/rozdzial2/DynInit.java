package ksiazka.rozdzial2;

//Demonstruje dynamiczną inicjalizację

public class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        //dynamiczna inicjalizacja zmiennej volume

        double volume = 3.1416 * radius * radius * height;

        System.out.println("Pojemność walca wynosi " + volume);
    }
}
