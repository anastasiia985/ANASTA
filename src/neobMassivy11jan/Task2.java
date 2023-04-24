package neobMassivy11jan;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random r= new Random();
        Integer[] array=new Integer[r.nextInt(4,10)];
        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextInt(-100,100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=0; i<array.length; i++){
            if (array[i]>=0) {
                System.out.print(array[i]+" ");
            }}
            for(int i=0; i<array.length; i++){
                if (array[i]<0) {
                    System.out.print(array[i]+" ");
                }
    }
        System.out.println();
}}
