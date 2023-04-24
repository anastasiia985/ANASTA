package Massivy11jan;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random r= new Random();
        int[][] array2d=new int[r.nextInt(2,5)][r.nextInt(2,5)] ;
        for (int i=0;i<array2d.length; i++) {
            for (int j=0;j<array2d[i].length; j++) {
                array2d[i][j]= r.nextInt(20);
                System.out.print( array2d[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" правый верхний угол " + array2d[0][array2d[0].length-1]);
        System.out.println(" левый нижний угол " + array2d[array2d.length-1][0]);


    }
}
