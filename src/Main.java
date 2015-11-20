import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Created by paul on 13/11/15.
 */
public class Main {

    public static void main(String[] arga){
//        Car.CLASS_IDENTIFICATOR;
        Car car = new Mercedes("mercedesCar");


        ((Mercedes)car).mercedesMethod();
        System.out.println(car.getName());
        car.filterName("Car");
        System.out.print(car.getName());

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car);
    }

}

