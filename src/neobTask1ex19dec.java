import java.util.Scanner;

public class neobTask1ex19dec {
    public static void main(String[] args) {
        System.out.println("введите количество очков,полученных командой за игру");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if (number==3) {
            System.out.println(" Выигрыш");
        } else if (number==0) {
            System.out.println(" Проигрыш");
        }else if (number==1) {
            System.out.println("Ничья ");
        } else {
            System.out.println(" введите количество очков за игру, их может быть 3 или 0 или 1");
    }
}
}
