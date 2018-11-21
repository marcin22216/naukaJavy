package carList;

import java.util.ArrayList;
import java.util.List;

public class ListOfCarName {

   private List<Car> carList;

   public ListOfCarName()
   {
       this.carList = new ArrayList<Car>();
   }


    public List<Car> getCarList() {
        return carList;
    }
}
