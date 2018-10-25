package algorytmDwa.onlineShop;

public class Shop {

    private Ball ball;


    public void sprzedaj(Ball pilka)
    {
        if (pilka.isBall())
        {
            System.out.println("Sprzedaje piłke");
            pilka.setBall(false);
        }
        else
        {
            System.out.println("Nie mam juz tego produktu");
        }
    }

    public void zaopatrz(Ball pilka)
    {
        if (pilka.isBall())
        {
            System.out.println("jest piłka");
        }
        else
        {
            System.out.println("Zamawiam piłke");
            pilka.setBall(true);
        }


    }


    public void setBall(Ball ball) {
        this.ball = ball;
    }
}
