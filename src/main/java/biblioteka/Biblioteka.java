package biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {

    private List<Ksiazka> listaKsiazek;

    public Biblioteka()
    {
        this.listaKsiazek = new ArrayList<Ksiazka>();
    }

    public void dodajKsiazke(Ksiazka ksiazkaDoDodania)
    {
        this.listaKsiazek.add(ksiazkaDoDodania);
    }

    public List<Ksiazka> zwrocListeKsiazek()
    {
        return this.listaKsiazek;
    }
}
