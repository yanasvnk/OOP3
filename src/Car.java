public class Car extends Transport {
    public Car(String brand, String model, int year, String country, String colour, Integer maxSpeed) {
        super(brand, model, year, country, colour, maxSpeed);
    }

    @Override
    void refill () {
        System.out.println("Машина будет заправлена бензином, дизелем на заправке или заряжена на специальных электропарковках, если это электрокар");
    }
}
