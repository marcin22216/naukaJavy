package obiad;

public class ObiadMain {


    public static void main(String[] args) {

        // to jest przygotowanie do uruchomianie naszego programu
        Sklep sklep = new Sklep();

        Talerz talerz = new Talerz();
        Garnek garnek = new Garnek();
        Patelnia patelnia = new Patelnia();
        Kucharz kucharz = new Kucharz();


        // ale tu juz program sobie sam tworzy potrzebne mu obiekty i robi na nich logike

        Ziemniaki ziemniaki = sklep.kupZiemniaki();

        kucharz.obierzZiemniaki(ziemniaki);

        garnek.ugotujZiemniaki(ziemniaki);

        talerz.setMojeZiemniaki(ziemniaki);

        Schabowy schabowy = sklep.kupSchbowego();

        kucharz.ubijKotleta(schabowy);

        patelnia.usmazKotleta(schabowy);

        talerz.setMojSchabowy(schabowy);

        Suruwka suruwka = sklep.kupSuruwke();

        kucharz.pokrojSuruwke(suruwka);

        talerz.setMojasurowka(suruwka);




    }





}
