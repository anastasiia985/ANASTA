package Massivy11jan;

import java.util.Random;

import static java.util.Arrays.deepToString;

public class Task2 {
    public static void main(String[] args) {
        Double[] array=new Double[20];
        Random r=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextDouble(-200,200);
        }
        System.out.println(deepToString(array));
        for(int i=0; i<array.length; i++){
            if (array[i]>0) {
                System.out.print(array[i]+" ");

            }

        }
        System.out.println();
        for(int i=0; i<array.length; i++){
            if (array[i]<=100) {
                System.out.print(array[i]+" ");

            }

        }


    }
}
