package firstLesson;

public class NewWash {

    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void setIsOn(boolean on) {
        isOn = on;
    }

    public void startWorking()
    {
        if (this.isOn == true)
        {
            System.out.println("Jestem wlaczony, bede pracowac");
        }
        else
        {
            System.out.println("Jestem wylaczony - nic nie robie");
        }

    }

}
