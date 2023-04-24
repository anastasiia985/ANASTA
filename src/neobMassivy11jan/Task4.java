package neobMassivy11jan;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] array2d = new int[r.nextInt(4, 6)][r.nextInt(2, 6)];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = r.nextInt(20);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
        Scanner sc= new Scanner(System.in);
        System.out.println("введите номер строки");
        int stroka = sc.nextInt();
        System.out.println("введите номер столбца");
        int stolbec=sc.nextInt();
        int max=array2d[stroka-1][0];
        int min=array2d[0][stolbec-1];
        for(int i=0;i<array2d[stroka-1].length; i++) {
            if (array2d[stroka-1][i]<min) {
                min=array2d[stroka-1][i];
            }
        }
        System.out.println("минимум в заданной строке " + min);
        for(int i=0;i<array2d.length; i++) {
            if (array2d[i][stolbec-1]>max) {
                max=array2d[i][stolbec-1];
            }
        }
        System.out.println("максимум в заданном столбце " + max);


    }}


