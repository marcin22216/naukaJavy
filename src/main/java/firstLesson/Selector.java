package firstLesson;

public class Selector {

    public void letInTheClub(Identity client)
    {
        System.out.println("Witam, czy moge wejsc do klubu?");
        System.out.println();
        System.out.println("Dobry wieczor, prosze o okazanie dokumentu tożsamosci");
        System.out.println();

        if (client.getHumanAge() < 26)
        {
            if (client.isMan())
            {
                System.out.println("Jest Pan zbyt mlody, aby wejsc");
            }
            else
            {
                System.out.println("jest Pani zbyt mlda aby wejsc");
            }
        }
        else
        {
            if (client.isMan())
            {
                System.out.println("Zapraszam Pana");
            }
            else
            {
                System.out.println("Zapraszam Pania");
            }
        }
    }

}
