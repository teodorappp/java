package aut.isp.lab4.exercise1;

public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public String toString() {
        return "Aquarium Controller [Manufacturer: " + manufacturer + ", Model: " + model + "]";
    }

    public double getCurrentTime() {
        return 0;
    }
}
