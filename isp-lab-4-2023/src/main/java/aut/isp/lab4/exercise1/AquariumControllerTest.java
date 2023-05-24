package aut.isp.lab4.exercise1;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class AquariumControllerTest {
    @Test
    public void testSetCurrentTime() {
        AquariumController aquariumController = new AquariumController();
        aquariumController.setCurrentTime(10.5f);
        assertEquals(10.5f, aquariumController.getCurrentTime(), 0.01); // Adjust the delta value according to your precision requirements
    }
}


