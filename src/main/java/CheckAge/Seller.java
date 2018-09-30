package CheckAge;

public class Seller {
    public void checkAge(Boy age) {
        System.out.println("Witaj ile masz lat?");

        if (age.getAge() < 18) {
            System.out.println("Jestes niepelnoletni!");

        } else {
            System.out.println("Sprzedaje");
        }
    }
}