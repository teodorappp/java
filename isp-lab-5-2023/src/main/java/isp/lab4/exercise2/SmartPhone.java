package isp.lab4.exercise2;

class Smartphone implements Chargeable {
    private int batteryLevel;

    public Smartphone() {
        this.batteryLevel = 0;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void charge(int durationInMinutes) {
        int maxBatteryLevel = 100;
        int chargingSpeed = 10; // Charging speed in percentage per minute

        for (int i = 0; i <= durationInMinutes; i++) {
            batteryLevel += chargingSpeed;

            if (batteryLevel > maxBatteryLevel) {
                batteryLevel = maxBatteryLevel;
            }

            System.out.println("Smartphone battery level: " + batteryLevel);
        }
    }
}
