package ksiazka.rozdzial3;
//Używa przecinków w instrukcji for
public class Comma {
    public static void main(String[] args) {
        int i, j;

        for (i = 0, j = 10; i < j; i++, j--)
            System.out.println("i i j: " + i + " " + j);
    }
}
