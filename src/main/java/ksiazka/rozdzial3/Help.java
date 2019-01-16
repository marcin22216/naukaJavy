package ksiazka.rozdzial3;
/*
Prosty system pomocy
 */
public class Help {
    public static void main(String[] args)
        throws java.io.IOException {
        char choice;

        System.out.println("Informacja o skłądni instrukcji:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Wybierz numer instrukcji: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Instrukcja warunkowa if: \n");
                System.out.println("if(warunek) instrukcja;");
                System.out.println("else instrukcja;");
                break;
            case '2':
                System.out.println("Instrukcja warunkowa switch:\n");
                System.out.println("switch(wyrażenie) {");
                System.out.println("  case stała:");
                System.out.println("    sekwencja instrukcji");
                System.out.println("    break");
                System.out.println("  // ...");
                break;
                default:
                    System.out.println("nieprawidłowy wybór");
        }
    }
}
