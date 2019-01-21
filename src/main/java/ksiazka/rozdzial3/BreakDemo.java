package ksiazka.rozdzial3;
//Używa instrukcji break do przetwarzania pętli.
public class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;

        //wykonuję pętlę dopóki kwadrat i jest mniejszy od num
        for (int i = 0; i < num; i++) {
            if (i * i >= num) break; //przerywa pętlę, jeśli i*i >= 100
            System.out.println(i + " ");
        }
        System.out.println("Pętla zakończona.");
    }
}
