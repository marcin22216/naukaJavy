package algorytmDwa.onlineShop;

public class ShopMain {

    public static void main(String[] args) {

        Shop shop = new Shop();
        Ball ball = new Ball();
        ball.setBall(false);
        shop.sprzedaj(ball);
        shop.zaopatrz(ball);
        shop.sprzedaj(ball);
    }

}
