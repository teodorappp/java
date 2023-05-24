package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        AquariumController aquariumController = new AquariumController();
        aquariumController.setFishFeeder(new FishFeeder());
        aquariumController.getFishFeeder().fillUp();

        System.out.println(aquariumController.toString());
        System.out.println(aquariumController.getFishFeeder().toString());
    }
}
