public class neobTask4ex21dec {
    public static void main(String[] args) {


        //Напечататьчиславвидеследующейтаблицы:
        // 12...10
        // 12...10
        // 12...10
        // 12...10

        printTable(1, 1);
        System.out.println();
        printTable(1, 1);
        System.out.println();
        printTable(1, 1);
        System.out.println();
        printTable(1, 1);
        System.out.println();

    }
    public static void printTable(int a, int b) {
        if (b <= 10) {
            System.out.printf("%d"+" ", a++);
            b++;
            printTable(a, b);
        }
    }
}
