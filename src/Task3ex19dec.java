import java.util.Scanner;

public class Task3ex19dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ввести вес");
        int weight = sc.nextInt();
        sc.close();
        if (weight>=91) {
            System.out.println(" супертяжелый вес");
        } else if (weight>=75) {
            System.out.println(" тяжелый вес");
        }else if (weight>=60) {
            System.out.println(" средний вес");
        } else {
            System.out.println(" легкий вес");

        }
    }
    }

