package isp.lab4.exercise3;

class TemperatureSensor extends Sensor {
    private double temperature;

    public TemperatureSensor(String installLocation, String name) {
        super(installLocation, name);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
