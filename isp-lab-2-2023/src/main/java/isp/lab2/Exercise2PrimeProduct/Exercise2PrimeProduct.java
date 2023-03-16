package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     *
     * @param n
     * @param m
     * @param args
     * @return
     */
    public static long getPrimeProduct(int n, int m, Object args) {
        int[] array = new int[n];

    for(int i=0;i< array.length;i++)
        {
            boolean isPrime = true;

            for (int j=2; j<i; j++){

                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }

    }


    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10, args));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt(), args));
    }

}

