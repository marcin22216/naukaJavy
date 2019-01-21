package ksiazka.rozdzial3;
//Używa instrukcji break w zagnieżdżonych pętlach.
public class Break3 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Licznik zewnętrznej pętli: " + i);
            System.out.print("   Licznik wewnętrznej pętli: ");

            int t = 0;
            while (t < 10) {
                if (t == 100) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Pętle zakończone.");
    }
}
