package sklep;

public class SklepMain {

    public static void main(String[] args) {


        Magazyn magazyn = new Magazyn();
        Klient klient = new Klient();

        magazyn.dodajProdukt(new Produkt("Pilka", 66));
        magazyn.dodajProdukt(new Produkt("Klocki", 88));
        magazyn.dodajProdukt(new Produkt("Lalka", 89));

//        klient.kupPierwszyProduktzListy(magazyn.zwrocAsortyment());
        klient.kupZMagazynu(magazyn);

        Produkt produktKlienta = klient.pochwalSieProduktem();

        System.out.println("produkt klienta to: " + produktKlienta.getNazwa());


    }



}
