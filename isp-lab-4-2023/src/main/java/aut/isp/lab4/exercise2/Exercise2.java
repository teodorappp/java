package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder();
        fishFeeder.fillUp();
        fishFeeder.feed();
        fishFeeder.feed();
        System.out.println(fishFeeder.toString());
    }
}
