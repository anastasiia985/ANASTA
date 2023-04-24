import java.util.Scanner;

public class Task3ex26dec {
    //найти 1 Сумму всех целых чисел от 100 до 500. 2 Сумму всех целых чисел от а до b, b>=a
    public static void main(String[] args) {
        int sum=0;
        for (int i=100; i<500; i++){
sum+=i;//sum=sum+1
        }
        System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a= sc.nextInt();
        System.out.println("Введите второе число. Оно должно быть больше или равным первому");
        int b= sc.nextInt();
        if (b>=a) {
            int sum1=0;
            for (int i=a; i<b; i++){
                sum1+=i;//sum1=sum1+1
            }
            System.out.println(sum1);
        }else {
            System.out.println("Введено некорректное число. введите второе число больше первого");
        }


    }
}
