package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = scanner.nextInt();
            System.out.print("Enter m: ");
            int m = scanner.nextInt();

            long product = 1;
            for (int i = n; i <= m; i++) {
                if (isPrime(i)) {
                    product *= i;
                }
            }
            System.out.println("Product of primes between " + n + " and " + m + " is " + product);
        }

        private static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

    public static long isPrime(int n, int m, Object args) {
        return 0;
    }
}


