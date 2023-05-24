package aut.isp.lab4.exercise5;

public abstract class Actuator {
    protected String manufacturer;
    protected String model;

    public abstract void turnOn();

    public abstract void turnOff();

    public String toString() {
        return "Actuator [Manufacturer: " + manufacturer + ", Model: " + model + "]";
    }
}