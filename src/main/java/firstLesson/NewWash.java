package firstLesson;

public class NewWash {

    private int state;

    public int getState()
    {
        return state;
    }
    public void setState(int state)
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
