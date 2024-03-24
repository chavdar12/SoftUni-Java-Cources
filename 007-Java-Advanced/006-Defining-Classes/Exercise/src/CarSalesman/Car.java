package src.CarSalesman;

import src.RawData.Engine;

public class Car {
    private static final String DEFAULT_VALUE = "n/a";

    private final String model;
    private final src.RawData.Engine engine;
    private String weight;
    private String color;

    public Car(String model, src.RawData.Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, src.RawData.Engine engine, String value) {
        this(model, engine, DEFAULT_VALUE, DEFAULT_VALUE);
        if (value.matches("-?\\d+(\\.\\d+)?")) {
            this.weight = value;
        } else {
            this.color = value;
        }
    }

    public Car(String model, Engine engine) {
        this(model, engine, DEFAULT_VALUE, DEFAULT_VALUE);
    }

    @Override
    public String toString() {
        return this.model + ":\n" +
                this.engine.toString() +
                "Weight: " + this.weight + "\n" +
                "Color: " + this.color;
    }
}