package aut.isp.lab4.exercise2;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;

    public void fillUp() {
        meals = 14;
        System.out.println("Fish feeder has been filled up. Meals: " + meals);
    }

    public void feed() {
        if (meals > 0) {
            meals--;
            System.out.println("Feeding fish. Remaining meals: " + meals);
        } else {
            System.out.println("No more meals in the fish feeder.");
        }
    }

    public String toString() {
        return "Fish Feeder [Manufacturer: " + manufacturer + ", Model: " + model + ", Meals: " + meals + "]";
    }

    public int getMeals() {
        return 0;
    }
}


