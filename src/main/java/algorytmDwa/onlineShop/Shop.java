package algorytmDwa.onlineShop;

public class Shop {

    private Ball ball;


    public void sprzedaj()
    {

        if (this.ball != null)
        {
            System.out.println("Sprzedaje piłke");
            this.ball = null;

        }
        else
        {
            System.out.println("Nie mam juz tego produktu");
        }
    }

    public void zaopatrz()
    {
        if (this.ball == null)
        {
            System.out.println("Zamawiam pilke");
            this.ball = new Ball();

        }



    }



}
