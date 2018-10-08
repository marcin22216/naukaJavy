package TicketAndConductor;

public class Conductor {

    //tak jak ustalilismy na poczatku - nie potrzebuje w tej klasie zadnych pol. Bo mnie w ogole nie obchodzi trzymanie jakiegokolwiek stanu danego obiektu.
    // nie chce wiedziec jak dany obiekt klasy Conducotr ma na imie, ile ma lat itp itd

    // to co ja POTRZEBUJE by dany konduktor robil to jedna rzecz: kasowal bilety. A jest to czynnosc (czasownik} wiec potrzebuje metody
    // a oto ona:


    // jedna uwaga: dla mnie validateTicket znaczy tyle co po polsku: skasowac bilet
    public void validateTicket(Ticket ticketForCheckAndValidate, Passenger penalty)
    {
        // jak widzisz powyzej ta metodka:
        // - jest publiczna czyli moze zostac wywolana na kazdym obiekcie tej klasy i wszedzie
        // - jest typu void czyli fizycznie niczego nie zwraca
        // - jej nazwa 'validateTicket' opisuje co ta metodka robi. Czyli robi tyle co 'kasujeBilet'
        // - i niesluchana wazna rzecz: w parametrze metody mamy szufladke do ktorej trzeba bedzie wlozyc bilet ktory bedziemy chcieli skasowac. Do tego biletu w ciele metody
        // moge sie dobrac przez zmienna 'ticketForCheckAndValidate'

        //ok. To teraz implementuje ciala metedy. To co musze zrobic to:
        // 1) sprawdzic czy dany bilet jest skasowany.
        // 2) jak nie jest to go skasowac i wyswietlic komunikt. A jak nie jest - to po prostu wyswietlic adekwatny komunikat.

        // no to do dziela:

        System.out.println("Witam Panstwa - bilety do kontroli!");

        // sprawdzam stan aktualnego biletu poprzez wywolanie na tym bilecie gettera
        if(ticketForCheckAndValidate.isValidate() == true)
        {
            System.out.println("Drogi pasazerze! Twoj bilet jest juz skasowany! Bedzie kara!");
            System.out.println();
            int newPenalty = penalty.getNumberOfPenalties() + 1;
            penalty.setNumberOfPenalties(newPenalty);
            System.out.println();
            System.out.println("Liczba Panskich kar wynosi: " + penalty.getNumberOfPenalties());
        }
        else
        {
            System.out.println("Dziekuje za okazanie biletu. Wszyst jest w porzadku. Teraz skasuje pana bilet");
            // ustawiam nowy stan (kasuje fizycznie bilet) poprzez wywolanie settera na tym bilecie z wartoscia 'true' (bo bilet zostal juz skasowany
            ticketForCheckAndValidate.setValidate(true);
        }


        // wroc teraz do TicketAndConductorMain


    }

}
