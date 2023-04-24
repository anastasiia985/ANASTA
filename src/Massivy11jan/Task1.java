package Massivy11jan;

import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Scanner sc= new Scanner(System.in);
        System.out.println(" Введите десять цифр в массив");
        for (int i = 0; i < 10; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(" Введите номер элемента массива для поиска квадратного корня");
        System.out.println("квадратный корень ="+sqrt(array[sc.nextInt()]));

        System.out.println(" Введите два номера элементов массива для поиска среднего арифметического");
        System.out.println("среднее арифметическое ="+avg(array[sc.nextInt()], array[sc.nextInt()]));

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+", ");
        }
       // System.out.println(deepToString(array));

    }
    public static double sqrt (int element) {
        return Math.sqrt(element);
    }
    public static double avg(int element1,int element2){
        return (element1+element2)/2.0;

    }

    }
