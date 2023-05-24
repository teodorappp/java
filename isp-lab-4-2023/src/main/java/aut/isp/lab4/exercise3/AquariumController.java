package aut.isp.lab4.exercise3;

public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;
    private FishFeeder fishFeeder;

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public void setFishFeeder(FishFeeder fishFeeder) {
        this.fishFeeder = fishFeeder;
    }

    public String toString() {
        return "Aquarium Controller [Manufacturer: " + manufacturer + ", Model: " + model + "]";
    }

    public FishFeeder getFishFeeder() {
        return null;
    }
}
