import java.util.Scanner;

public class neob1ex26dec {
    //Составить программу вывода любого числа любое заданное число раз.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число n");
        int n= sc.nextInt();
        System.out.println("введите сколько раз нужно напечатать число n");
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            System.out.print(n + " ");


        }
    }
}
