package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        Random random= new Random();
        for(int i=0;i<array.length;i++) {
            array[i] =new Random().nextInt(100);
        }

        return array;

    }

    public static int[] findMaxAndMin(int[] array) {
        int[] maxmin=new int[2];
        maxmin[0]=maxmin[1] =array[0];
        for(int i=0;i< array.length;i++) {
            if (array[i] > maxmin[0])
                maxmin[0] = array[i];
            if (array[i] < maxmin[1])
                maxmin[1] = array[i];
        }
        return maxmin;
    }

    public static void main(String[] args) {

        Random random = new Random();

        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);
       System.out.print("The array is:");
       for(int i=0;i<a.length;i++) {
           System.out.print(""+a[i]);
       }
       System.out.println();
       System.out.println("Min is:"+mm[1]+" Max is:"+mm[0]);

    }
}
