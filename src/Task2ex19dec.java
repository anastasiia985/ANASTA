import java.util.Scanner;

public class Task2ex19dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        if (a>Math.abs(b)) {
            a=a/2;
            System.out.println(" a= "+a);
        }

    }
}
