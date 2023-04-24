package Massivy11jan;

import java.util.Random;

import static java.util.Arrays.deepToString;

public class Task3 {
    public static void main(String[] args) {
        Random r= new Random();
        Integer[] array=new Integer[r.nextInt(4,10)];
        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextInt(-100,100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        int max=array[0];
        int min=array[0];
        int maxIndex=0;
        int minIndex=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max=array[i];
                maxIndex=i;
            }
            if (array[i]<min) {
                min=array[i];
                minIndex=i;
            }}
        System.out.println();
            System.out.print(max+" максимальный элемент\n");
        System.out.println("индекс максимального элемента "+maxIndex);
        System.out.print(min+" минимальный элемент\n");
        System.out.println("индекс минимального элемента "+minIndex);
        int element=max;
        array[maxIndex]=min;
        array[minIndex]=element;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        }


    }

