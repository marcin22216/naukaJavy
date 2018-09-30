package CheckAge;

public class MainSellerBoy {
    public static void main(String[] args) {
        Boy age = new Boy();

        Seller seller = new Seller();

        age.setAge(17);

        seller.checkAge(age);
    }

}
