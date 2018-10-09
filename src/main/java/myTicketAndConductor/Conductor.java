package myTicketAndConductor;

public class Conductor {


    public void checkPassenger(Passenger passenger)
    {
//        Ticket ticket = passenger.getTicket();
//        boolean validate = ticket.isValidate();
        System.out.println("Witam Pana - bilety do kontroli!");

        if(passenger.getTicket().isValidate())
        {
            System.out.println("Drogi pasazerze! Twoj bilet jest juz skasowany! Bedzie kara!");
            System.out.println();
            passenger.addOnePenalte();
        }
        else
        {
            System.out.println("Dziekuje za okazanie biletu. Wszyst jest w porzadku. Teraz skasuje pana bilet");
            passenger.getTicket().setValidate(true);
        }

    }

}

