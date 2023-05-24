package aut.isp.lab4.exercise5;

public class LeakDetector {
    public void checkWaterLevel(float currentWaterLevel, float presetWaterLevel) {
        if (currentWaterLevel < presetWaterLevel) {
            System.out.println("Water level is low. Turning on the alarm."); //turn on alarm
        } else {
            System.out.println("Water level is normal."); //turn off alarm
        }
    }
}
