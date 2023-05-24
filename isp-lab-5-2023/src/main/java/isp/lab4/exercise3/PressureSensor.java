package isp.lab4.exercise3;

class PressureSensor extends Sensor {
    private double pressure;

    public PressureSensor(String installLocation, String name) {
        super(installLocation, name);
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}