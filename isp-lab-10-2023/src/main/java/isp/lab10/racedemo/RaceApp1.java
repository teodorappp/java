package isp.lab10.racedemo;

import javax.swing.*;
import java.awt.*;

public class RaceApp1 {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Car Race");
        frame.setLayout(new GridLayout(2, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();
        SemaphorePanel semaphorePanel = new SemaphorePanel();
        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        frame.getContentPane().add(semaphorePanel);
        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setSize(500, 300);
        frame.setVisible(true);

        TimerThread timerThread = new TimerThread(); // Create a TimerThread instance

        semaphoreThread.start(); // Start the semaphore thread

        // Wait for the semaphore thread to finish before starting the cars
        semaphoreThread.join();

        PlaySound sound = new PlaySound();
        sound.playSound(); // Play the sound when the cars begin racing

        timerThread.startTimer(); // Start the timer

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);

        car1.start();
        car2.start();
        car3.start();
        car4.start();

        car1.join();
        car2.join();
        car3.join();
        car4.join();

        timerThread.stopTimer(); // Stop the timer

        sound.stopSound(); // Stop the sound when all cars have finished

        long elapsedTime = timerThread.getElapsedTime();
        System.out.println("Race Duration: " + formatDuration(elapsedTime));
    }

    private static long formatDuration(long duration) {
        long milliseconds = duration % 1000;
        long seconds = (duration / 1000) % 60;
        long minutes = (duration / (1000 * 60)) % 60;
        long hours = (duration / (1000 * 60 * 60)) % 24;
        return duration;
    }
}


