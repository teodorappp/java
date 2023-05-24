package isp.lab4.exercise2;

class Laptop implements Chargeable {
    private int batteryLevel;

    public Laptop() {
        this.batteryLevel = 0;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void charge(int durationInMinutes) {
        int maxBatteryLevel = 100;
        int chargingSpeed = 5; // Charging speed in percentage per minute

        for (int i = 0; i <= durationInMinutes; i++) {
            batteryLevel += chargingSpeed;

            if (batteryLevel > maxBatteryLevel) {
                batteryLevel = maxBatteryLevel;
            }

            System.out.println("Laptop battery level: " + batteryLevel);
        }
    }
}
