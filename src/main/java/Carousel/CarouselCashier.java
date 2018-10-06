package Carousel;

public class CarouselCashier {

    public void checkChildAge(CarouselChild child)
    {
        System.out.println("Czesc, ile masz lat lub wzrostu?");

        if (child.getChildAge() >= 12)
        {
            System.out.println("Wsiadaj");
        }
        else
        {
            System.out.println("Jestes zbyt mlody, ale sprawdzimy twoj wzrost");

            if (child.getChildGrowth() >= 120)
            {
                System.out.println("Wzrost OK, wsiadaj");
            }
            else
            {
                System.out.println("Zbyt mlody i zbyt niski, nie moge cie wpuscic");
            }
        }
    }

}
