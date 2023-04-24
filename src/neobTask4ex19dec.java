import java.util.Scanner;

public class neobTask4ex19dec {
    public static void main(String[] args) {
        System.out.println("введите первое число");
        Scanner sc=new Scanner(System.in);
        double number1 = sc.nextDouble();
        System.out.println("введите второе число");
        double number2= sc.nextDouble();
        System.out.println("введите третье число");
        double number3= sc.nextDouble();
        sc.close();
        if ((number1<number2)&&(number2<number3)) {
            System.out.println("условие первое число меньше второго и второе меньше третьего выполняется");

        } else{
            System.out.println("условие что первое число меньше второго и второе меньше первого не выполняется");
            if ((number2>number1)&&(number1>number3)){
                System.out.println("условие второе число больше первого и первое больше третьего выполняется");

            } else{
                System.out.println("условие что второе число больше первого и первое больше третьего не выполняется");
            }
        }
    }
}
