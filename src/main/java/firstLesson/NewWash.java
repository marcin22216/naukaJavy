package firstLesson;

public class NewWash {

    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void checkState()
    {
        if (this.isOn == true)
        {
            System.out.println("ON");
        }
        else
        {
            System.out.println("OFF");
        }

    }

}
