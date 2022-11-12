package Transports;

public class Bus extends Transport implements Competable{

    public enum capacity{
        EXTRA_SMALL,        //до 10 мест
        SMALL,              //до 25
        MEDIUM,             //40–50
        LARGE,              //60–80
        ESPECIALLY_LARGE    //100–120 мест
    }
    public Bus(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public int bestLapTime() {
        return 10;
    }

    @Override
    public int maxSpeed() {
        return 80;
    }
}
