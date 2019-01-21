package ksiazka.rozdzial3;
// Ciało pętli może byc puste.
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        //sumuje liczby do 5
        for (i = 1; i <= 5; sum += i++) ;
        System.out.println("Suma wynosi " + sum);
    }


    // suma += i  <=>  suma = suma + i
}
