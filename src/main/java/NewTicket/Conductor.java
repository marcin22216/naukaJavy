package NewTicket;

public class Conductor {

    public void checkPassenger(Passenger passenger)
    {
        System.out.println("Prosze o bilet do kontroli");
        System.out.println("to jet karta miesieczna, bede potrzebowal dowod osobisty");
        if (passenger.getMonthlyPass().getName().equals(passenger.getPersonalData().getName2())&&passenger.getMonthlyPass().getSurname().equals(passenger.getPersonalData().getSurname2())&&passenger.getMonthlyPass().getAge()==passenger.getPersonalData().getAge2())
        {
            System.out.println("dane OK");

            if (passenger.getMonthlyPass().isValidate())
            {
                System.out.println("Bilet jest skasowany, bedzie kara!");
                passenger.getMonthlyPass().subValidate();
            }
            else
            {
                System.out.println("Kasuje bilet");
            }
        }
        else
        {
            System.out.println("Dane sie nie zgadzaja, bedzie kara");
            passenger.addPenalty();
        }




    }


}
