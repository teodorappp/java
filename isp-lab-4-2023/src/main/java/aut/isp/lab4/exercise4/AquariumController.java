package aut.isp.lab4.exercise4;

public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;
    private FishFeeder fishFeeder;
    private int lightOnTime;
    private int lightOffTime;

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        checkLights();
    }

    public void setFishFeeder(FishFeeder fishFeeder) {
        this.fishFeeder = fishFeeder;
    }

    public void setLightOnTime(int lightOnTime) {
        this.lightOnTime = lightOnTime;
    }

    public void setLightOffTime(int lightOffTime) {
        this.lightOffTime = lightOffTime;
    }

    private void checkLights() {
        if (currentTime >= lightOnTime && currentTime < lightOffTime) {
            System.out.println("Lights are ON.");
        } else {
            System.out.println("Lights are OFF.");
        }
    }

    public String toString() {
        return "Aquarium Controller [Manufacturer: " + manufacturer + ", Model: " + model + "]";
    }
}
