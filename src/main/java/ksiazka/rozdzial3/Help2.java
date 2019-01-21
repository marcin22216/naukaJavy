package ksiazka.rozdzial3;
/*
Prosty system pomocy
 */
public class Help2 {

    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Informacja o skłądni instrukcji:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.print("Wybierz numer instrukcji: ");

            choice = (char) System.in.read();

//            do {
//                ignore = (char) System.in.read();
//            } while (ignore != '\n');
        } while ( choice < '1' | choice > '5');
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
                System.out.println("}");
                break;
            case '3':
                System.out.println("Pętla for:\n");
                System.out.print("for(inicjalizacja; warunek; iteracja)");
                System.out.println(" instrukcja");
                break;
            case '4':
                System.out.println("Pętla while:\n");
                System.out.println("while(warunek) instrukcja");
//                break;
            case '5':
                System.out.println("Pętla do-while:\n");
                System.out.println("do {");
                System.out.println(" instrukcja;");
                System.out.println("} while (warunek);");
                break;
            default:
                System.out.println("nieprawidłowy wybór");
        }
    }
}
