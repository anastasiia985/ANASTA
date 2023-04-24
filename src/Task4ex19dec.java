import java.util.Scanner;

public class Task4ex19dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите порядковый номер дня недели");
        int day = sc.nextInt();
        sc.close();
        switch (day) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("введено неверное число");

        }
    }
}
