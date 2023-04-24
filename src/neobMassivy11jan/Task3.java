package neobMassivy11jan;

import java.util.Random;

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
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max=array[i];
            }
            if (array[i]<min) {
                min=array[i];
            }}
        System.out.println();
        System.out.print(max+" максимальный элемент\n");

        System.out.print(min+" минимальный элемент\n");
        int count=0;
        for (int i=0; i<array.length; i++) {
            if (array[i]==max) {
                count++;
            }
        } System.out.println("количество максимальных элементов " +count);
        int count1=0;
        for (int i=0; i<array.length; i++) {
            if (array[i]==min) {
                count1++;
            }
        } System.out.println("количество максимальных элементов " +count1);


    }
}
