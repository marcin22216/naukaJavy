package TicketAndConductor;

public class TicketAndConductorMain {

    /*
        Hej, hej

        Na poczatku troche teorii i jedna wskazowka - przeczytaj ten tekst pare razy by go jak najlepiej zrozumiec.
        Jakbys mial watpliwosci to od razu pytaj.
        Postaram sie teraz krok po kroku opisac jak podejsc do rozwiazania tego zadanka z biletem i konduktorem.

        A wiec tak: zaczynamy od uswiadomienia sobie i zdefiniowania potrzeby biznesowej klienta.

        To co my mamy zakodowac jest to taka sytuacja:
        Jest sobie konduktor, ktory kasuje bilet. Jak widzimy zachodzi tutaj relacja miedzy dwoma fizycznymi obiektami: konduktorem i biletem.
        Bo wszak konduktor bierze fizycznie bilet do reki i go kasuje. Ok. Czyli widze, ze modelujac ten problem w moim programie przydadza mi sie przynajmniej dwa rozne obiekty -
        bilet i konduktor.
        A jak zrobic, bym mogl stworzyc sobie takie obiekty? A no potrzebuje dwoch klas: public class Ticket oraz public class Conductor.
        Super. Czyli na ten moment ogarnalem ze potrzebuje dwoch klas. A jak rozmawialismy, klasy sa to definicje dwoch obszarow: prywatnych pol ktore trzymaja stan obiektu oraz
        publicznych metod, ktore wykonuja jakas czynnosc.

        To zastanawiam sie teraz co tak wlasciwie dana klasa ma robic. I tak dochodze do wniosku ze:

        1) W klasie Ticket:
        - w tej klasie musze miec pole, ktore bedzie trzymac aktualny stan skasowania biletu. Mozliwe sa dwie opcje: bilet jest skasowany albo nie jest skasowany.
        Po ktotkim zastanowieniu dochodze do wniosku, ze pole typu boolean bedzie idealne.
        - druga rzecza, ktora potrzebuje w tej klasie jest mozliwosc sprawdzenia aktualnego stanu biletu oraz ustawienia aktualnego stanu biletu. Czyli potrzebuje dwoch metedek:
        settera, ktory pozwoli mi ustawic wartosc dla mojego pola oraz gettera, ktory pozwoli mi na odczyt aktualnej wartosci pola

        2) w klasie Conduktor
        - tak na prawde nie potrzebuje na dzien dzisiejszy trzymac jakichkolwoiek informacji na temat samego konduktora. Nie potrzebuje znac jego imienia, wieku czy plci.
        Interesuje mnie jedno: konduktor powienien umiec wykonac czynnosc (czyli miec metode), ktora sprawdza czy dany bilet ktory aktualnie chce skasowac jest skasowany czy nie (czyli
        sprawdzic stan biletu) i w zaleznosci od wyniku skasowac bilet (zmienic jego stan) albo wyswietlic na konsoli ze bilet jest juz skasowany.

        No to super. Teraz biore sie do IMPLEMENTACJI tego zadanka.

        Pierwsze co robie, to tworze klase Ticket - przejdz prosze do tej klasy teraz.
        ...
        Witam z powrotem. Jak zauwazyles, mamy juz w programie klase naszego biletu ktore ma wszystko czego potrzebowalismy.
        Teraz jedziemy z klasa Conductor - przejdz prosze do tej klasy teraz;
        ...
        Hej hej. Troche sie dzialo w klasie Conductor. Zaimplementowalismy metodke, ktora jest odpowiedzialna za kasowanie biletow. Super. Jedna rzecz dla Ciebie do uswiadomienia:
        Popatrz na piekno swiata obiektowego. To obiekt klasy Conduktor zmienia stan obiektu klasy Ticket ! Zachodzi miedzy nimi relacja. Cos wspanialego

        No ale dosc zachwytu - czas na uruchomienie naszego programu. Lecimy do metody main


         */

    public static void main(String[] args) {

        /*
        Witam witam.
        Tutaj zrobimy takie cus:
        1) stworzymy bilet ktory defaultowo bedzie mial wartosc pola isValidate ustawiona na FALSE (bo do domyslna wartosc dla zmiennej typu boolean)
        2) stowrzymy konduktora
        3) sprawdzimy - wyswietlajac na konsoli - stan biletu przed skasowaniem przez konduktora i po

        A wiec do dziela:
         */

        //Tworze nowy obiekt bilet i przypisuje go do zmiennej
        Ticket ticket = new Ticket();

        //Tworze nowy obiekt Conducotr i przypisuje go do zmiennej
        Conductor conductor = new Conductor();

        //sprawdzam stan biletu przed skasowaniem:
        System.out.println("Wartosc pola 'isValidate' biletu PRZED skasowaniem rowna sie: " + ticket.isValidate());
        // nowa pusta linia (by byl odstep miedzy komunikatami)
        System.out.println();

        //wywoluje na obiekcie conductor metode do kasowanie biletu i przekazuje do tej metody stworzony przeze mnie bilet
        conductor.validateTicket(ticket);

        //sprawdzam stan biletu po kasowaniu:
        System.out.println();
        System.out.println("Wartosc pola 'isValidate' biletu PO kasowaniu rowna sie: " + ticket.isValidate());
        System.out.println();

        //probuje jeszcze raz skasowan ten sam bilet (ktory zostal wczesniej skasowany)
        System.out.println("Ponowna kontrola tego samego biletu:");
        conductor.validateTicket(ticket);




    }
}
