package ksiazka.rozdzial3;
//Przykład użycia instrukcji continue.
public class ContDemo {
    public static void main(String[] args) {
        int i;

        //wyświetla liczby parzyste z przedziału od 0 do 100
        for (i = 0; i <= 100; i++){
            if ((i % 2) != 0) continue; //iteracja
            System.out.println(i);
        }
    }
}
