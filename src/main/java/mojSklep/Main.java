package mojSklep;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        Warehouse warehouse = new Warehouse();

        warehouse.addProduct(new Rzecz("Doll", 19.99),(new Ilosci(10)));
        warehouse.addProduct(new Rzecz("Car", 15.70),(new Ilosci(15)));
        warehouse.addProduct(new Rzecz("Butter", 3.87),(new Ilosci(2)));


    }

}
