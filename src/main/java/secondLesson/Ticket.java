package secondLesson;

public class Ticket {
    private boolean isVaildated;

    public boolean isVaildated()
    {
        return isVaildated;
    }
    public void setIsVaildated(boolean YES) {isVaildated = YES;}

    public void checkVaildate()

    {
        if (this.isVaildated == true)
        {
            System.out.println("W porzadku, milej pdrozy");
        }
        else
        {
            System.out.println("Kasuje bilet");
        }
    }

}
