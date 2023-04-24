import java.util.Scanner;

public class Task7ex26dec {
    // дано нат число. опр 1 его максим цифру 2 его минимальную цифру
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        int min=9;
        int max=0;
        while (number!=0){
            int digit=number%10;
            number=number/10;
            if (digit>max) {
                max=digit;
            }
            if (digit<min){
                min=digit;
            }

        }

System.out.println("максимальная цифра = "+max  );
        System.out.println("минимальная  цифра = "+min  );

    }
}
