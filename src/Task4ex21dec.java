public class Task4ex21dec {
    public static void main(String[] args) {
        // таблица сложения полностью

        printTable(1,1);
        System.out.println();
        printTable(2,1);
        System.out.println();
        printTable(3,1);
        System.out.println();
        printTable(4,1);
        System.out.println();
        printTable(5,1);
        System.out.println();
        printTable(6,1);
        System.out.println();
        printTable(7,1);
        System.out.println();
        printTable(8,1);
        System.out.println();
        printTable(9,1);
        System.out.println();


    }
    public static void printTable(int a, int b){
        if (b<10){
            System.out.printf( "%d+%d=%d ",a,b,a+b);
            b++;
            printTable(a, b);
        }



    }
}
