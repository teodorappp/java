package isp.lab6.exercise2;
import java.util.HashSet;
import java.util.Set;

class Vehicle {
    private String vin;
    private String licensePlate;
    private String make;
    private String model;
    private int year;

    public Vehicle(String vin, String licensePlate, String make, String model, int year) {
        this.vin = vin;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if ((this.vin == null) ? (other.vin != null) : !this.vin.equals(other.vin)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.vin != null ? this.vin.hashCode() : 0);
        return hash;
    }

    public void displayInfo() {
        System.out.println("VIN: " + vin + ", License Plate: " + licensePlate + ", Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}



