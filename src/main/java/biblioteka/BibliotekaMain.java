package biblioteka;

public class BibliotekaMain {

    public static void main(String[] args) {

        Uzytkownik uzytkownik = new Uzytkownik();
        Biblioteka biblioteka = new Biblioteka();

        biblioteka.dodajKsiazke(new Ksiazka("Zbrodnia i Kara", "Fiodor Dostojewski", 354));
        biblioteka.dodajKsiazke(new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 653));
        biblioteka.dodajKsiazke(new Ksiazka("Mistrz i Malgorzata", "Michail Bulhakov", 145));
        biblioteka.dodajKsiazke(new Ksiazka("Dziady", "Adam Mickiewicz", 353));

        //uzytkownik.wypozyczKsiazke();


    }


}
