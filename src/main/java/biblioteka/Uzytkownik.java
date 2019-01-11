package biblioteka;

import java.util.List;

public class Uzytkownik {

    private Ksiazka wypozyczonaKsiazka;

    public void wypozyczKsiazke(List<Ksiazka> listaKsiazekDoWypozyczenia)
    {
        this.wypozyczonaKsiazka = listaKsiazekDoWypozyczenia.get(1);
    }

    public Ksiazka pokazKsiazke()
    {
        return this.wypozyczonaKsiazka;
    }

}
