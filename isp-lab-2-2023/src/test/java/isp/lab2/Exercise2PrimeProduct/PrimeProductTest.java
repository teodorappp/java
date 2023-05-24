package isp.lab2.Exercise2PrimeProduct;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeProductTest {

    @Test
    public void testPrimeProduct() {
        int n = 10;
        int m = 20;
        long expected = 46189L;
        Object args = null;
        long actual = Exercise2PrimeProduct.isPrime (n, m, args);
        assertEquals(expected, actual);
    }
}
