package Transports;

public class Truck extends Transport implements Competable{

    public enum loadCapacity{
        N1, //с полной массой до 3,5 тонн
        N2, //с полной массой свыше 3,5 до 12 тонн
        N3  //с полной массой свыше 12 тонн
    }

    public Truck(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public int bestLapTime() {
        return 9;
    }

    @Override
    public int maxSpeed() {
        return 120;
    }
}
