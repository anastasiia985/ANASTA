import java.util.Scanner;

public class neobTask5ex19dec {
    public static void main(String[] args) {
        System.out.println("введите первое число");
        Scanner sc=new Scanner(System.in);
        double number1 = sc.nextDouble();
        System.out.println("введите второе число");
        double number2= sc.nextDouble();
        sc.close();
        if (Math.sqrt(number2)<number1) {
            number2=number2*5;
            System.out.println(number2);
        } else {
            System.out.println("условие задачи не выполняется");
        }

    }
}
