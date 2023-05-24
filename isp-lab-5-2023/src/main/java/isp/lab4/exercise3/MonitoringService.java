package isp.lab4.exercise3;

import java.util.ArrayList;
import java.util.List;

class MonitoringService {
    private List<Sensor> sensors;

    public MonitoringService() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public double getAverageTemperatureSensors() {
        double sum = 0;
        int count = 0;

        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensor;
                sum += temperatureSensor.getTemperature();
                count++;
            }
        }

        return count > 0 ? sum / count : 0;
    }

    public double getAverageAllSensors() {
        double sum = 0;

        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensor;
                sum += temperatureSensor.getTemperature();
            } else if (sensor instanceof PressureSensor) {
                PressureSensor pressureSensor = (PressureSensor) sensor;
                sum += pressureSensor.getPressure();
            }
        }

        return sensors.size() > 0 ? sum / sensors.size() : 0;
    }
}
