package algorytmDwa.onlineShop;

public class Shop {

    private Ball ball;


    public void sprzedaj()
    {
        if (this.ball.isBall())
        {
            System.out.println("Sprzedaje piłke");
            this.ball.setBall(false);
        }
        else
        {
            System.out.println("Nie mam juz tego produktu");
        }
    }

    public void zaopatrz()
    {
        if (this.ball.isBall())
        {
            System.out.println("jest piłka");
        }
        else
        {
            System.out.println("Zamawiam piłke");
            this.ball.setBall(true);
        }


    }


    public void setBall(Ball ball) {
        this.ball = ball;
    }
}
