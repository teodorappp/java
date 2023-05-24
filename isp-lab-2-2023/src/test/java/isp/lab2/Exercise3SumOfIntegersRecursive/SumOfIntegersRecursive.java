package isp.lab2.Exercise3SumOfIntegersRecursive;

import org.junit.Test;

import static isp.lab2.Exercise3SumOfIntegersRecursive.Exercise3SumOfIntegersRecursive.sumOfIntegers;
import static org.junit.Assert.assertEquals;

public class SumOfIntegersRecursive {

    @Test
    public void testSumOfIntegers() {
        int n = 5;
        int expected = 15;
        int actual = sumOfIntegers(n);
        assertEquals(expected, actual);
    }
}
