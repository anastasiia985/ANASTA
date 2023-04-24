import java.util.Scanner;

public class neobTask3ex19dec {
    public static void main(String[] args) {
        System.out.println("введите двузначное число");
        Scanner sc=new Scanner(System.in);
        double number = sc.nextDouble();
        sc.close();

        double ed=number%10;
        int des=(int)number/10;
        System.out.println(ed);
        System.out.println(des);
        double a=des%ed;
        double b=ed/des;
        if ((des>=ed)&&(ed!=0)) {
            System.out.println("остаток от деления десятков на единицы = " + a);
        } else {
            System.out.println("остатка от деления нет");
        }
        System.out.println("результат деления единиц на десятки = "+b);
    }
}
