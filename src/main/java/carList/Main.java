package carList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Seller seller = new Seller();

        ListOfCarName carName = seller.getListOfCarName();

        List<Car> carList = carName.getCarList();

        carList.add(new Car("Audi"));
        carList.add(new Car("BMW"));
        carList.add(new Car("Ford"));
        carList.add(new Car("Bentley"));
        carList.add(new Car("Honda"));

        for (Car car : carList)
        {
            System.out.println(car.getMark());
        }

    }


}
