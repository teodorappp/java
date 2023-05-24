package aut.isp.lab4.exercise6;

public class pHController {
    private double currentpH;
    private double desiredpH;
    private Actuator actuator;

    public void setCurrentpH(double currentpH) {
        this.currentpH = currentpH;
    }

    public void setDesiredpH(double desiredpH) {
        this.desiredpH = desiredpH;
    }

    public void setActuator(Actuator actuator) {
        this.actuator = actuator;
    }

    public void checkpH() {
        if (Math.abs(currentpH - desiredpH) <= 0.2) {
            System.out.println("pH is within the acceptable range.");
            // Code to handle other pH conditions if needed
        } else {
            System.out.println("pH is not within the acceptable range. Raising an alarm.");
            actuator.turnOn();
        }
    }
}