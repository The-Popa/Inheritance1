package org.example;

public abstract class vehicle {

    public vehicle(String model, String engine, String colour, int modelYear) {
    }

    public abstract void drive();

    public abstract class Vehicle {

    private String model;
    private String engine;
    private String colour;
    private int modelYear;

    public Vehicle(String model, String engine, String colour, int modelYear) {
        this.model = model;
        this.engine = engine;
        this.colour = colour;
        this.modelYear = modelYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return model + engine + colour + modelYear;
    }
}


}
