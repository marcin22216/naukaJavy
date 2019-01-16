package ksiazka.rozdzial3;
//Demonstruje działanie if-else-if
public class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x równe jeden");
            else if (x == 2)
                System.out.println("x równe dwa");
            else if (x == 3)
                System.out.println("x równe trzy");
            else if (x == 4)
                System.out.println("x równe cztery");
            else
                System.out.println("x nie należy do przedziału od 1 do 4");
        }
    }
}
