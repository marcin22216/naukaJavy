package Różne;

public class Operatory {

    private int liczba;
    private int wynik;

    public void przeksztalcBinarnie()
    {

    }

    public void podzielZReszta()
    {
        this.wynik = this.liczba/2 & liczba%2;
    }



    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    public static void main(String[] args) {
        Operatory operatory = new Operatory();
         operatory.setLiczba(7);
         operatory.podzielZReszta();
        System.out.println(operatory.wynik);
    }
}
