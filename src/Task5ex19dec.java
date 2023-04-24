import java.util.Scanner;

public class Task5ex19dec {
    public static void main(String[] args) {
        //short r=4;
        System.out.println("введите радиус окружности");
        Scanner sc=new Scanner(System.in);
        short r= sc.nextShort();
        sc.close();
        double l= 2*r*Math.PI;
        System.out.println("длина окружности = "+l);


    }
}
