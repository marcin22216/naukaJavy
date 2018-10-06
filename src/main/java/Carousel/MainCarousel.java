package Carousel;

public class MainCarousel {

    public static void main(String[] args) {

        CarouselChild child = new CarouselChild();


        CarouselCashier cashier = new CarouselCashier();

        child.setChildAge(12);
        child.setChildGrowth(120);
        cashier.checkChildAge(child);

    }

}
