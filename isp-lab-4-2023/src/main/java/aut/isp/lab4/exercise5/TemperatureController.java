package aut.isp.lab4.exercise5;

public class TemperatureController {
    private int presetTemperature;
    private Heater heater;

    public void setPresetTemperature(int presetTemperature) {
        this.presetTemperature = presetTemperature;
    }

    public void setHeater(Heater heater) {
        this.heater = heater;
    }

    public void checkTemperature(int currentTemperature) {
        if (currentTemperature < presetTemperature) {
            System.out.println("Temperature is low. Turning on the heater.");
            heater.turnOn();
        } else if (currentTemperature == presetTemperature) {
            System.out.println("Temperature is at the desired level. Turning off the heater.");
            heater.turnOff();
        } else {
            System.out.println("Temperature is within the acceptable range."); //cod sa vedem daca avem nevoie de alte temperaturi
        }
    }
}
