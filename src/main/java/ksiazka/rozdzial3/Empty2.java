package ksiazka.rozdzial3;
//Opuszcza kolejny element pętli for
public class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0;
        for (; i < 10; ) {
            System.out.println("Przebieg " + i);
            i++;
        }
    }
}
