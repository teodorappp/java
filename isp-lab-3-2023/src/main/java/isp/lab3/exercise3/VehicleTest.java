package isp.lab3.exercise3;

public class VehicleTest {
    public static void main(String[] args) {
        // create two vehicle objects
        Vehicle vehicle1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle vehicle2 = new Vehicle("Ford", "Focus", 180, 'D');

        // test getters and setters
        vehicle1.setModel("Renault");
        System.out.println("Model of vehicle1: " + vehicle1.getModel());

        vehicle2.setSpeed(200);
        System.out.println("Speed of vehicle2: " + vehicle2.getSpeed());

        // test equals method
        if (vehicle1.equals(vehicle2)) {
            System.out.println("The two vehicles are equal");
        } else {
            System.out.println("The two vehicles are not equal");
        }

        // test static attribute and method
        System.out.println("Number of vehicles created: " + Vehicle.getNumberOfVehicles());
        Vehicle.displayNumberOfVehicles();

        // test toString method
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
    }
}
