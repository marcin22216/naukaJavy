package ksiazka.rozdzial3;
//Deklaruje zmienną sterującą wewnątrz pętli for
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        //wyznacz silnię liczby 5
        for (int i = 1; i <=  5; i++) {
            sum += i; //i jest znane w pętli
            fact *= i;
        }

        //tutaj i nie jest już znane

        System.out.println("Suma wynosi " + sum);
        System.out.println("Silnia wynosi " + fact);
    }
}
