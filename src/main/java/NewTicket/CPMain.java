package NewTicket;

public class CPMain {

    public static void main(String[] args) {

        Passenger passenger = new Passenger();

        TrafficCard mojaKarta = new TrafficCard();
        mojaKarta.setName("Marcin");
        mojaKarta.setSurname("Spytkowski");
        mojaKarta.setAge(22);

        ID mojDowod = new ID();
        mojDowod.setName2("Marcin");
        mojDowod.setSurname2("Spytkowski");
        mojDowod.setAge2(24);

        passenger.setMonthlyPass(mojaKarta);
        passenger.setPersonalData(mojDowod);
        passenger.getMonthlyPass().setValidate(true);




        Conductor conductor = new Conductor();

        conductor.checkPassenger(passenger);
        System.out.println("liczba kar:" + passenger.getPenalties());
        System.out.println();
        System.out.println("liczba skasowan:" + passenger.getMonthlyPass().getNumberOfValidate());



    }

}
