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

        Ziemniak ziemniak = sklep.kupZiemniaki();

        kucharz.obierzZiemniaki(ziemniak);

        garnek.ugotujZiemniaki(ziemniak);

        talerz.setMojeZiemniak(ziemniak);

        Schabowy schabowy = sklep.kupSchabowego();

        kucharz.ubijKotleta(schabowy);

        patelnia.usmazKotleta(schabowy);

        talerz.setMojSchabowy(schabowy);

        Suruwka suruwka = sklep.kupSurowke();

        kucharz.pokrojSuruwke(suruwka);

        talerz.setMojasurowka(suruwka);




    }





}
