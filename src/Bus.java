import java.util.Objects;

public class Bus extends Transport {
    public Bus (String brand, String model, int year, String country, String colour, Integer maxSpeed) {
        super(brand, model, year, country, colour, maxSpeed);
    }

    @Override
    public String toString() {
        return "Модель - " + getModel()+ ", бренд - " + getBrand() + ", год выпуска - " + getYear() + ", скорость - " + getMaxSpeed() + ".";
    }

    @Override
    public int hashCode(){
        return Objects.hash (getModel(), getBrand(), getYear(), getMaxSpeed());
    }
    void refill () {
        System.out.println("Автобус будет заправлен бензином или дизелем на заправке");
    }
}
