package secondLesson;

public class Ticket {
    private boolean vaildated;

    public boolean isVaildated()
    {
        return vaildated;
    }
    public void setVaildated(boolean vaildated)
    {
        if (this.vaildated == true)
        {
            System.out.println("W porzadku, milej pdrozy");
        }
        else
        {
            System.out.println("Kasuje bilet");
        }
    }

}
