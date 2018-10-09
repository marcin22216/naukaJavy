package NewTicket;

public class Conductor {

    public void checkPassenger(Passenger passenger)
    {
        System.out.println("Prosze o bilet do kontroli");
        System.out.println("to jet karta miesieczna, bede potrzebowal dowod osobisty");

        if (passenger.getMonthlyPass().getName().equals(passenger.getPersonalData().getName2()))
        {
            System.out.println("imie OK");
        }
        else
        {
            System.out.println("dane z kart nie pokrywaja sie z danymi dowodu!");
        }
        if (passenger.getMonthlyPass().getSurname().equals(passenger.getPersonalData().getSurname2()))
        {
            System.out.println("nazwisko OK");
        }
        else
        {
            System.out.println("dane z kart nie pokrywaja sie z danymi dowodu!");
        }
        if (passenger.getMonthlyPass().getAge() == passenger.getPersonalData().getAge2())
        {
            System.out.println("Wiek OK");
        }
        else
        {
            System.out.println("dane z kart nie pokrywaja sie z danymi dowodu!");
        }



    }


}
