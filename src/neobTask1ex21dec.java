import java.util.Scanner;

public class neobTask1ex21dec {
    //Составитьпроцедуру,"рисующую"наэкранегоризонтальнуюлиниюиз10символов"*".
    public static void main(String[] args) {
        printNumberToLine('*');
    }

    public static void printNumberToLine(char a) {

        System.out.printf("%s %s %s %s %s %s %s %s %s %s\n", a, a, a, a, a, a, a, a, a, a);
    }
}

