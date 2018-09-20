package firstLesson;

public class NewWash {

    private boolean state;

    public boolean getState()
    {
        return state;
    }
    public void setState(boolean state)
    {

        this.state = state;

    }
    public void checkState()
    {
        if (this.state == 1)
        {
            System.out.println("ON");
        }
        else
        {
            System.out.println("OFF");
        }

    }

}
