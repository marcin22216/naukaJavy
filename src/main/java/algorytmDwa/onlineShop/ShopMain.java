package algorytmDwa.onlineShop;

public class ShopMain {

    public static void main(String[] args) {

        Shop shop = new Shop();
        Ball ball = new Ball();
        shop.setBall(new Ball());
        ball.setBall(false);
        shop.sprzedaj();
        shop.zaopatrz();
        shop.sprzedaj();
    }

}
