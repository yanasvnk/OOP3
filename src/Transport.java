public abstract class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String colour;
    private Integer maxSpeed;
    private String fuel;
    protected float fuelPercentage;


    public Transport (String brand, String model, int year, String country, String colour, Integer maxSpeed) {
        this.year = year;
        this.country = country;

        if (brand==null) {
            this.brand = "Информация не указана";
        } else {
            this.brand = brand;
        }
        if (model==null) {
            this.model = "Информация не указана";
        } else {
            this.model = model;
        }
        if (colour==null) {
            this.colour = "Информация не указана";
        } else {
            this.colour = colour;
        }
        if (maxSpeed==null) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }

    }
    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public String getColour() {
        return colour;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    abstract void refill();
}



