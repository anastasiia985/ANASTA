import java.util.Scanner;

public class Task6ex26dec {
    //дана непустая последовательность чисел не оканч 0. найти 1сумму всех чисел 2 количество чисел
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите несколько чисел, ввод 0 заканчивает последовательность чисел");
       // while (sc.nextInt() != 0) {
       // }
        int number = 0;
        int sum=0;
        int count=0;

        do {
            number = sc.nextInt();
        sum=sum+number;// sum+=number
            count++;
        }
            while (number != 0) ;
            System.out.println("сумма всех чисел ="+sum);
        System.out.println("количество чисел в последовательности ="+count);


        }
    }

