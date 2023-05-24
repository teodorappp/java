package aut.isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder();
        fishFeeder.fillUp();

        AquariumController aquariumController = new AquariumController();
        aquariumController.setFishFeeder(fishFeeder);
        aquariumController.setLightOnTime(8);
        aquariumController.setLightOffTime(16);

        aquariumController.setCurrentTime(10.5f); // 10.5 (10:30 AM)
        System.out.println(aquariumController.toString());
        aquariumController.setCurrentTime(17.5f); //17.5(17:30)
        System.out.println(aquariumController.toString());
    }
}

