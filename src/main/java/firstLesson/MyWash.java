package firstLesson;

public class MyWash {

    private double temeraure;


    public double getTemeraure() {
        return temeraure;
    }

    public void setTemeraure(double temeraure) {
        this.temeraure = temeraure;
    }

    //To jest moja klaska.
    //Jak widzisz w metodzie ponizej uzylem instrukcji warunkowej 'if'

    public void checkTemperature()
    {
        if(this.temeraure <= 0)
        {
            System.out.println("Is cold!");
        }
        else
        {
            System.out.println("Is HOT!");
        }
    }
}
