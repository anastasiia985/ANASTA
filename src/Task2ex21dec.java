import java.util.Scanner;

public class Task2ex21dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("введите число");
        int number= sc.nextInt();

        System.out.println("результат: " +  greaterThan5(number));
    }

    public static boolean greaterThan5(int number)
    { boolean result = true;

            if (number<5){
                result= false;
        }
            return result;
    }

}
