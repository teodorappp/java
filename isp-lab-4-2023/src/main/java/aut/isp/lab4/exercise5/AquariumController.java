package aut.isp.lab4.exercise5;

public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;
    private FishFeeder fishFeeder;
    private int lightOnTime;
    private int lightOffTime;
    private Sensor sensor;

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

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
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

    public void setLeakDetector(LeakDetector leakDetector) {
    }
}
