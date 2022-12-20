import java.util.Objects;
public class Train extends Transport {
    private int travelCost;
    private float travelTime;
    private String departure;
    private String destination;
    private int wagonsCount;
    public Train(String brand, String model, int year, String country, String colour, Integer maxSpeed,
                 int travelCost, float travelTime, String departure, String destination, int wagonsCount) {
        super(brand, model, year, country, colour, maxSpeed);
        if (travelCost==0) {
            this.travelCost = 0;
        } else {
            this.travelCost = travelCost;
        }
        if (travelTime==0) {
            this.travelTime = 0;
        } else {
            this.travelTime = travelTime;
        }
        if (departure==null) {
            this.departure = "Информация не указана";
        } else {
            this.departure = departure;
        }
        if (destination==null) {
            this.destination = "Информация не указана";
        } else {
            this.destination = destination;
        }
        if (wagonsCount==0) {
            this.wagonsCount = 0;
        } else {
            this.wagonsCount = wagonsCount;
        }
    }

    public int getTravelCost() {
        return travelCost;
    }

    public float getTravelTime() {
        return travelTime;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }


    public void setTravelCost(int travelCost) {
        this.travelCost = travelCost;
    }

    public void setTravelTime(float travelTime) {
        this.travelTime = travelTime;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setWagonsCount(int wagonsCount) {
        this.wagonsCount = wagonsCount;
    }

    public int getWagonsCount() {
        return wagonsCount;
    }

    @Override
    public String toString() {
        return "Модель - " + getModel()+ ", бренд - " + getBrand() + ", год выпуска - " + getYear() + ", скорость - " + getMaxSpeed() +
                ", стоимость билета - " + travelCost + " руб.," + " время в пути - " + travelTime + ", станция отправления - " + departure + ", " +
                    "пункт назначения - " + destination + ", количество вагонов - " + wagonsCount + ".";
        }

    @Override
    public int hashCode(){
        return Objects.hash (getModel(), getBrand(), getYear(), getMaxSpeed(), travelCost, travelTime, departure, destination, wagonsCount);
        }

        @Override
    void refill () {
            System.out.println("Поезд будет заправлен дизелем");
        }
}

