package org.example;

public class Car extends vehicle {

    private int drive;
    private int doors;
    private int seats;
    private boolean winterTyres;

    public Car(String model, String engine, String colour, int modelYear, int doors, int seats, boolean winterTyres, int drive) {
        super(model, engine, colour, modelYear);
        this.drive = drive;
        this.doors = doors;
        this.seats = seats;
        this.winterTyres = winterTyres;
    }

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isWinterTyres() {
        return winterTyres;
    }

    public void setWinterTyres(boolean winterTyres) {
        this.winterTyres = winterTyres;
    }

    @Override
    public void drive() {
        System.out.println("A brand new car");
    }

    @Override
    public String toString() {
        return super.toString() + doors + seats + winterTyres + drive;
    }


    }

