package aut.isp.lab4.exercise6;

import aut.isp.lab4.exercise3.FishFeeder;
import aut.isp.lab4.exercise5.LeakDetector;
import aut.isp.lab4.exercise5.TemperatureController;

public class AquariumController {
    private String manufacturer;
    private String model;
    private float currentTime;
    private FishFeeder fishFeeder;
    private int lightOnTime;
    private int lightOffTime;
    private LeakDetector leakDetector;
    private TemperatureController temperatureController;
    private pHController pHController;

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

    public void setLeakDetector(LeakDetector leakDetector) {
        this.leakDetector = leakDetector;
    }

    public void setTemperatureController(TemperatureController temperatureController) {
        this.temperatureController = temperatureController;
    }

    public void setpHController(pHController pHController) {
        this.pHController = pHController;
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