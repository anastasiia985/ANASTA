import java.util.Scanner;

public class neobTask2ex21dec {
    public static void main(String[] args) {
        // Составитьпроцедуру,"рисующую" на экране горизонтальную линию из любого числа символов"*".
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число звездочек в строке");
        int count = sc.nextInt();
        sc.close();
        printToLine ('*', count);




    }

    private static void printToLine(char a, int count) {
        if (count > 0) {
            count--;
            System.out.print(a + " ");
            printToLine(a, count);}
    }
    }