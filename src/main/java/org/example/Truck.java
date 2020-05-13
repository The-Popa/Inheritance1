package org.example;

public class Truck extends vehicle {

    private boolean allWheelDrive;
    private int drive;

    public Truck(String model, String engine, String colour, int modelYear, boolean allWheelDrive, int drive) {
        super(model, engine, colour, modelYear);
        this.allWheelDrive = allWheelDrive;
        this.drive = drive;
    }

    public boolean isAllWheelDrive() {
        return allWheelDrive;
    }

    public void setAllWheelDrive(boolean allWheelDrive) {
        this.allWheelDrive = allWheelDrive;
    }

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    @Override
    public void drive() {
        System.out.println("A brand new truck");
    }

    @Override
    public String toString() {
        return super.toString() + allWheelDrive + drive;
    }
}
