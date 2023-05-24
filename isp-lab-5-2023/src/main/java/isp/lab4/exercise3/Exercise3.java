package isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        TemperatureSensor sensor1 = new TemperatureSensor("Living Room", "Temperature Sensor 1");
        sensor1.setTemperature(25.5);

        TemperatureSensor sensor2 = new TemperatureSensor("Bedroom", "Temperature Sensor 2");
        sensor2.setTemperature(23.7);

        PressureSensor sensor3 = new PressureSensor("Kitchen", "Pressure Sensor 3");
        sensor3.setPressure(1013.2);

        MonitoringService monitoringService = new MonitoringService();
        monitoringService.addSensor(sensor1);
        monitoringService.addSensor(sensor2);
        monitoringService.addSensor(sensor3);

        double averageTemperature = monitoringService.getAverageTemperatureSensors();
        double averageAllSensors = monitoringService.getAverageAllSensors();

        System.out.println("Average Temperature from Temperature Sensors: " + averageTemperature);
        System.out.println("Average Value from All Sensors: " + averageAllSensors);
    }
}
