package DinamicDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Task {
    public static void main(String[] args) {
        //Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
        //Избавиться от повторяющихся элементов в строке.
        //Вывести результат на экран.
        //String example = "1, 2, 3, 4, 4, 5";
        //char[] array = example.toCharArray();
        //for (int i=0; i<array.length; i++) {
          //  System.out.print(array[i]);
        //}
        System.out.println(" введите числа 1 2 3 4 4 5 и любую букву");
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set =new HashSet<>();

        while (sc.hasNextInt()) {
        set.add(sc.nextInt());}
        System.out.println(set);
    }
}
