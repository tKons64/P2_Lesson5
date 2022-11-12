package Transports;

public class Car extends Transport implements Competable{

    public enum bodyType{
        SEDAN,
        HATCHBACK,
        COUPE,
        UNIVERSAL,
        SUV,
        CROSSOVER,
        PICKUP,
        VAN,
        MINIVAN
    }
    public Car(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public int bestLapTime() {
        return 8;
    }

    @Override
    public int maxSpeed() {
        return 150;
    }
}
