import air.Helicopter;
import air.Glider;
import air.Radar;
import products.IProduct;
import products.Product;
import vehicles.Bicycle;
import vehicles.Car;
import vehicles.Engine;
import vehicles.Vehicle;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<IProduct> vehicles = new ArrayList<>();

        Bicycle bike = new Bicycle(
                10,
                20,
                new Product(350,6, "BMX")
        );
        vehicles.add(bike);

        Car car = new Car(
                2000,
                120,
                new Product(50000, 2, "BMW"),
                new Engine(100, 190)
        );
        vehicles.add(car);

        Engine newEngine = new Engine(200, 500);
        car.setEngine(newEngine);

        Helicopter helicopter = new Helicopter(
                1000,
                150,
                new Product(120000, 4, "Chopper"),
                new Engine(150, 700),
                400,
                new Radar("RADARCO", 314159, 700, new Product(20000,1, "radar"))
        );

        vehicles.add(helicopter);

        Glider glider = new Glider(
                120,
                50,
                new Product(20000, 1, "Hang Glider"),
                75
        );
        vehicles.add(glider);

        helicopter.startEngine();

        for (IProduct vehicle:vehicles) {
            System.out.println(vehicle.getTitle());
        }

    }
}
