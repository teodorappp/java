package isp.lab2.Exercise3SumOfIntegersRecursive;

import java.util.Scanner;

public class Exercise3SumOfIntegersRecursive {
    /**
     * This method will return the sum of the first n integers
     * @param args
     * @return
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = scanner.nextInt();
            int sum = sumFrom1ToN(n);
            System.out.println("Sum of integers from 1 to " + n + " is " + sum);
        }

        private static int sumFrom1ToN(int n) {
            if (n <= 0) {
                return 0;
            }
            return n + sumFrom1ToN(n-1);
        }

    public static int sumOfIntegers(int n) {
        return 0;
    }
}


