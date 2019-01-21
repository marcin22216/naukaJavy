package ksiazka.rozdzial3;
//Kolejny przykład użycia instrukcji break z etykietą
public class Break5 {
    public static void main(String[] args) {

        done:
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                    if(k == 5) break done; //skok do done
                    System.out.println(k + " ");
                }
                System.out.println("za pętlą k");
            }
            System.out.println("za pętlą j");
        }
        System.out.println("za pętlą i");
    }
}
