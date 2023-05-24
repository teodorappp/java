package aut.isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder();
        fishFeeder.fillUp();

        AquariumController aquariumController = new AquariumController();
        aquariumController.setFishFeeder(fishFeeder);
        aquariumController.setLightOnTime(8); // Set lightOnTime to 8 (8 AM)
        aquariumController.setLightOffTime(16); // Set lightOffTime to 16 (4 PM)

        LeakDetector leakDetector = new LeakDetector();
        aquariumController.setLeakDetector(leakDetector);

        TemperatureController temperatureController = new TemperatureController();
        Heater heater = new Heater();
        temperatureController.setHeater(heater);
        temperatureController.setPresetTemperature(26);
    }
}