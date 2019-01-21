package ksiazka.rozdzial3;
//Przykłąd użycia instrukcji continue z etykietą.
public class ContToLabel {
    public static void main(String[] args) {
        outerloop:
        for (int i = 1; i < 10; i++){
            System.out.print("\nPrzebieg pętli zewnętrznej: " + i +
                    ", pętli wewnętrznej: ");
            for (int j = 1; j < 10; j++){
                if (j == 5) continue outerloop; //kontunuuje pętlę zewnętrzną
                System.out.print(j);
            }
        }
    }
}
