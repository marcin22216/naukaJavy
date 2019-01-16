package ksiazka.rozdzial3;
//Demonstruję instrukcję switch bez instrukcji break.
public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i jest mniejsze od jeden");
                case 1:
                    System.out.println("i jest mniejsze od dwóch");
                case 2:
                    System.out.println("i jest mniejsze od trzech");
                case 3:
                    System.out.println("i jest mniejsze od czterech");
                case 4:
                    System.out.println("i jest mnniejsz od pięciiu");
            }
            System.out.println();
        }
    }
}
