import java.util.Scanner;

public class Task4ex26dec {
    //даны нат число n и вещ числа a1 ... an
    //найти ср ариф вещ чисел
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число n");
        int n= sc.nextInt();
        double sum=0;

        for (int i=1; i<=n;i++){
            System.out.println("Введите число");// вводить в консоли через запятую!
            double number=sc.nextDouble();
            sum=sum+number;//sum+=number

        }
        System.out.println("среднее арифметическое " + sum/n);
    }
}
