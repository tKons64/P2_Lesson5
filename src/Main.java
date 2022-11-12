import Driver.Driver;
import Transports.Bus;
import Transports.Car;
import Transports.Transport;
import Transports.Truck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car1 = new Car("LADA", "2105", 0);
        Car car2 = new Car("LADA", "2105", 0);
        Car car3 = new Car("LADA", "2105", 0);
        Car car4 = new Car("LADA", "2105", 0);

        Truck truck1 = new Truck("КАМАЗ", "2105", 0);
        Truck truck2 = new Truck("КАМАЗ", "2105", 0);
        Truck truck3 = new Truck("КАМАЗ", "2105", 0);
        Truck truck4 = new Truck("КАМАЗ", "2105", 0);

        Bus bus1 = new Bus("ЛИАЗ", "2105", 0);
        Bus bus2 = new Bus("ЛИАЗ", "2105", 0);
        Bus bus3 = new Bus("ЛИАЗ", "2105", 0);
        Bus bus4 = new Bus("ЛИАЗ", "2105", 0);

        car1.pitStop();
        System.out.println(car2.bestLapTime());
        System.out.println(car3.maxSpeed());

        truck1.pitStop();
        System.out.println(truck2.bestLapTime());
        System.out.println(truck3.maxSpeed());

        bus1.pitStop();
        System.out.println(bus2.bestLapTime());
        System.out.println(bus3.maxSpeed());

        Driver<Car> DriverCar = new Driver<>("DriverCar", 10, car1);
        Driver<Truck> DriverTruck = new Driver<>("DriverTruck", 2, truck1);
        Driver<Bus> DriverBus = new Driver<>("DriverBus", 7, bus1);
        System.out.println(DriverCar);
        System.out.println(DriverTruck);
        System.out.println(DriverBus);

    }
}