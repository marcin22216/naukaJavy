package ksiazka.rozdzial3;
//Używa instrukcji break z etykietą
public class Break4 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++) {
            one: {
            two: {
                three: {
                    System.out.println("\ni jest równe " + i);
                    if (i == 1) break one;
                    if (i == 2) break two;
                    if (i == 3) break three;

                    //sterowanie nigdy tu nie trafi
                    System.out.println("ten tekst nie zostanie wyświetlony");
                }
                System.out.println("Za trzecim blokiem.");
            }
                System.out.println("Za drugim blokiem.");
            }
            System.out.println("Za pierwszym blokiem.");
        }
        System.out.println("Za pętlą for.");
    }
}
