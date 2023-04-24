import java.util.Scanner;

public class Task1ex19dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        sc.close();
        if (number%2==0) {
            System.out.println( "число четное");

        } else {
            System.out.println("число нечетное");
        }
        if (number%10==7) {
            System.out.println("число оканчивается на 7");

        }else {
            System.out.println("число не оканчивается на 7");
        }
    }
}
