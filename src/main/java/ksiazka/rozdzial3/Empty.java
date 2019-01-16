package ksiazka.rozdzial3;
//Niektóre części pętli for mogą być puste.
public class Empty {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; ) {  //Brak wyrażenia iteracyjnego
            System.out.println("Przebieg " + i);
            i++; //inkrementuje zmienną sterującą pętli
        }
    }
}
