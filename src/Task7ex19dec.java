import java.util.Scanner;

public class Task7ex19dec {
    public static void main(String[] args) {
        System.out.println("введите трехзначное число");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int ed=number%10;
        int des=(number/10)%10;
        int sot=(number/10)/10;

System.out.println("число единиц"+ed);
        System.out.println("число десятков"+des);
        System.out.println("сумма цифр = "+ (ed+des+sot));
        System.out.println("произведение цифр = "+ (ed*des*sot));

    }
}
