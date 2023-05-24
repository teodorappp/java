package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Set;

public class VehicleRegistrySystem {
    private Set<Vehicle> vehicles;

    public VehicleRegistrySystem() {
        this.vehicles = new HashSet<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
        } else {
            System.out.println("Error: Vehicle with VIN " + vehicle.getVin() + " already exists in the registry.");
        }
    }

    public void removeVehicle(String vin) {
        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin().equals(vin)) {
                vehicleToRemove = vehicle;
                break;
            }
        }
        if (vehicleToRemove != null) {
            vehicles.remove(vehicleToRemove);
        } else {
            System.out.println("Error: Vehicle with VIN " + vin + " not found in the registry.");
        }
    }

    public boolean isVehicleInRegistry(String vin) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin().equals(vin)) {
                return true;
            }
        }
        return false;
    }

    public void displayVehicles() {
        System.out.println("List of vehicles in the registry:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
