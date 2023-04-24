import java.util.Scanner;

public class neobTask2ex19dec {
    public static void main(String[] args) {
        System.out.println("введите радиус круга");
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("введите сторону квадрата");
        int l= sc.nextInt();
        sc.close();
        double plkrug= Math.PI*Math.pow(r,2);
        double plkv= Math.pow(l,2);
        if (plkrug>plkv) {
            System.out.println("площадь круга больше площади квадрата");
        } else if (plkrug<plkv) {
            System.out.println("площадь круга меньше площади квадрата");
        }
            else System.out.println("площади фигур равны");


    }
}

