package org.example;

public class Motorcycle extends vehicle {

    private int drive;
    private String make;
    private String type;
    private int licenseType;

    public Motorcycle(String model, String engine, String colour, int modelYear, String make, String type, int licenseType, int drive) {
        super(model, engine, colour, modelYear);
        this.drive = drive;
        this.make = make;
        this.type = type;
        this.licenseType = licenseType;

    }

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(int licenseType) {
        this.licenseType = licenseType;
    }

    @Override
    public void drive() {
        System.out.println("A brand new motorcycle");
    }

    @Override
    public String toString() {
        return super.toString() + make + type + licenseType + drive;
    }
}
