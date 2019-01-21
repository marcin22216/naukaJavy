package ksiazka.rozdzial3;
//Demonstruje pętlę while
public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        //wyświetla alfabet za pomocą pętli while
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
    }
}
