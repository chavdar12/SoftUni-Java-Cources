package CarShop;

import java.io.Serializable;

public class Seat implements Car, Serializable {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        this.setModel(model);
        this.setColor(color);
        this.setHorsePower(horsePower);
        this.setCountryProduced(countryProduced);
    }

    @Override
    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    private void setCountryProduced(String countryProduced) {
        this.countryProduced = countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                getModel(), getCountryProduced(), Car.TIRES);
    }
}
