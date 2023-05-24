package isp.lab10.raceapp;

import isp.lab10.racedemo.*;

import javax.swing.*;
import java.awt.*;
public class Main {
    public class RaceApp {
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

            semaphoreThread.start(); // Start the semaphore thread

            // Wait for the semaphore thread to finish before starting the cars
            semaphoreThread.join();

            PlaySound sound = new PlaySound();
            sound.playSound();

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

            sound.stopSound();
        }
    }

}
