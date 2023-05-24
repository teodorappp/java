package aut.isp.lab4.exercise2;

import org.junit.Test;
import static org.junit.Assert.*;

public class FishFeederTest {
    @Test
    public void testFillUp() {
        FishFeeder fishFeeder = new FishFeeder();
        fishFeeder.fillUp();
        assertEquals(14, fishFeeder.getMeals());
    }

    @Test
    public void testFeedWithMeals() {
        FishFeeder fishFeeder = new FishFeeder();
        fishFeeder.fillUp();
        fishFeeder.feed();
        assertEquals(13, fishFeeder.getMeals());
    }

    @Test
    public void testFeedWithoutMeals() {
        FishFeeder fishFeeder = new FishFeeder();
        fishFeeder.feed();
        assertEquals(0, fishFeeder.getMeals());
    }
}
