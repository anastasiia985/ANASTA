import java.util.Scanner;

public class neob4ex26dec {
    // 4.Вычислить сумму 1+1/2+1/3+...+1/n.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число n");
        int n= sc.nextInt();
        double sum=0;

        for (int i = 1; i <=n; i++) {
            sum =sum + (1.0/i);

        }
            System.out.println("сумма = " + sum);


        }
    }

