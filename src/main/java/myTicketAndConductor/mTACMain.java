package myTicketAndConductor;

public class mTACMain {

    public static void main(String[] args) {

        Passenger passenger = new Passenger();
        passenger.setTicket(new Ticket(120));

        Conductor conductor = new Conductor();

        conductor.checkPassenger(passenger);
        System.out.println("");
        conductor.checkPassenger(passenger);
        conductor.checkPassenger(passenger);
        conductor.checkPassenger(passenger);

        System.out.println("Liczba kart = " + passenger.getNumberOfPenalties());


    }


}
