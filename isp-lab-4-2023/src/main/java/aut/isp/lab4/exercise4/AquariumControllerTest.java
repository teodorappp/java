package aut.isp.lab4.exercise4;

import org.junit.Test;
import static org.junit.Assert.*;

public class AquariumControllerTest {
    @Test
    public void testCheckLightsOn() {
        AquariumController aquariumController = new AquariumController();
        aquariumController.setLightOnTime(8);
        aquariumController.setLightOffTime(16);

        aquariumController.setCurrentTime(10.5f);
        assertEquals("Lights are ON.", getConsoleOutput());

        aquariumController.setCurrentTime(12.0f);
        assertEquals("Lights are ON.", getConsoleOutput());
    }

    private String getConsoleOutput() {

        return null;
    }

    @Test
    public void testCheckLightsOff() {
        AquariumController aquariumController = new AquariumController();
        aquariumController.setLightOnTime(8);
        aquariumController.setLightOffTime(16);

        aquariumController.setCurrentTime(7.0f);
        assertEquals("Lights are OFF.", getConsoleOutput());

        aquariumController.setCurrentTime(17.5f);
        assertEquals("Lights are OFF.", getConsoleOutput());
    }

}
