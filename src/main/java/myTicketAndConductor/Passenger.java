package myTicketAndConductor;

public class Passenger {

    private int numberOfPenalties;
    private Ticket ticket;

    public void addOnePenalte()
    {
        this.numberOfPenalties++;
//        this.numberOfPenalties = numberOfPenalties+1;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getNumberOfPenalties() {
        return numberOfPenalties;
    }
}
