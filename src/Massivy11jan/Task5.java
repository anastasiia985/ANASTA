package Massivy11jan;

import java.util.Random;

public class Task5 {
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
        int sum=0;
        int sum1=0;
        for(int i=0;i<array2d[2].length; i++) {
            sum=sum+array2d[2][i];
        }
        System.out.println("сумма чисел третьей строки " +sum);
        for(int i=0;i<array2d.length; i++) {
            sum1=sum1+array2d[i][1];
        }
        System.out.println("сумма чисел второго столбца " +sum1);
    }}
