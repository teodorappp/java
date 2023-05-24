package aut.isp.lab4.exercise5;

public abstract class Sensor {
    protected String manufacturer;
    protected String model;

    public String toString() {
        return "Sensor [Manufacturer: " + manufacturer + ", Model: " + model + "]";
    }
}
