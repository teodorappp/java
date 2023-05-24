package isp.lab2.Exercise6WordGuess.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {

        return null;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        System.out.println("Odd Numbers:");
        for(int i=0;i< result.length;i++){
            if( result[i]%2!=0){
                System.out.println( result[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(int i=0;i< result.length;i++){
            if( result[i]%2==0){
                System.out.println( result[i]);
            }
        }
    }
    }
