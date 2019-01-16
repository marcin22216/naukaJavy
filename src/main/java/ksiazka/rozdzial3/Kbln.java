package ksiazka.rozdzial3;
//Wczytuje znak z klawiatury.
public class Kbln {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch;

        System.out.print("Wprowadź znak, a następnie naciśnij ENTER: ");

        ch = (char) System.in.read();  //Wczytuje znak

        System.out.println("Wprowadziłeś: " + ch);
    }
}
