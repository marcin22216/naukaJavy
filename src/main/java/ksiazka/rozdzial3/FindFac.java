package ksiazka.rozdzial3;
/*
Używa zagnieżdżonych pętli do znalezienia
podzielników liczb z zakresu od 0 do 100
 */
public class FindFac {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            System.out.print("Podzielnik liczby " + i + ": ");
            for (int j = 2; j < i; j++)
                if ((i % j) == 0) System.out.print(j + " ");
            System.out.println();
        }
    }
}
