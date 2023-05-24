package isp.lab10.racedemo;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class CarPanel1 extends JPanel {
    private int[] carPositions;
    private String[] carNames;
    private Color[] carColors;
    private Map<String, Long> raceDurations;
    private boolean raceFinished;

    public CarPanel1() {
        carPositions = new int[4];
        carNames = new String[]{"Red car", "Blue car", "Green car", "Yellow car"};
        carColors = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
        raceDurations = new HashMap<>();
        raceFinished = false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 4; i++) {
            int yPos = 50 + i * 50; // Vertical position of the car
            int xPos = carPositions[i]; // Horizontal position of the car
            int carSize = 30; // Size of the car

            g.setColor(carColors[i]);
            g.fillOval(xPos, yPos, carSize, carSize);
            g.setColor(Color.BLACK);
            g.drawString(carNames[i], xPos, yPos - 5);
        }

        if (raceFinished) {
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.setColor(Color.BLACK);
            g.drawString("Race Standings:", 20, 200);

            // Sort cars based on race durations
            List<String> sortedCars = new ArrayList<>(raceDurations.keySet());
            sortedCars.sort(Comparator.comparingLong(raceDurations::get));

            // Display standings and race durations
            int position = 1;
            int yPosition = 230;
            for (String car : sortedCars) {
                String standings = position + ". " + car + " - " + formatDuration(raceDurations.get(car));
                g.drawString(standings, 20, yPosition);
                position++;
                yPosition += 30;
            }
        }
    }

    public void updateCarPosition(String carName, int distance) {
        int carIndex = getCarIndex(carName);
        if (carIndex != -1) {
            carPositions[carIndex] = distance;
            repaint();
        }
    }

    public void carFinished(String carName) {
        if (!raceFinished) {
            raceDurations.put(carName, System.currentTimeMillis());
            if (raceDurations.size() == 4) {
                raceFinished = true;
                repaint();
            }
        }
    }

    private int getCarIndex(String carName) {
        for (int i = 0; i < 4; i++) {
            if (carNames[i].equals(carName)) {
                return i;
            }
        }
        return -1;
    }

    private String formatDuration(long duration) {
        long milliseconds = duration % 1000;
        long seconds = (duration / 1000) % 60;
        long minutes = (duration / (1000 * 60)) % 60;
        long hours = (duration / (1000 * 60 * 60)) % 24;

        return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds);
    }
}

