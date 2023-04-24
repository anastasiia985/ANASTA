import java.util.Scanner;

public class neobTask3ex21dec {
    //Даныстороныдвухтреугольников.Найтисуммуихпериметровисуммуихплощадей.
    // (Определитьпроцедурудлярасчетапериметраиплощадитреугольникапоегосторонам.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите стороны треугольника 1");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("введите стороны треугольника 2");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        sc.close();
        //Условие существования треугольника:
        // Каждая сторона треугольника должна быть меньше суммы двух других сторон.
        if (a1>(b1+c1)){
            System.out.println("треугольника1 не существует");
        }
        if (b1>(a1+c1)){
            System.out.println("треугольника1 не существует");
        }
        if (c1>(b1+a1)){
            System.out.println("треугольника1 не существует");
        }
        if (a2>(b2+c2)){
            System.out.println("треугольника2 не существует");
        }
        if (b2>(a2+c2)){
            System.out.println("треугольника2 не существует");
        }
        if (c2>(b2+a2)){
            System.out.println("треугольника2 не существует");
        }



    int p1=perimetr(a1, b1, c1);
    int p2=perimetr(a2, b2,c2);
    System.out.println("Периметр первого треугольника = "+ p1);
        System.out.println("Периметр второго треугольника = "+ p2);
    double sq1=square(p1, a1, b1, c1);
        System.out.println("площадь первого треугольника ="+ sq1);
        System.out.println("площадь второго тругольника = "+square(p2, a2, b2, c2));
        System.out.println("сумма периметров = "+ (p1+p2));
        System.out.println(" сумма площадей = "+ (sq1+square(p2, a2,b2,c2)));
}
    public static int perimetr(int a, int b, int c){
        return a+b+c;
    }
    public static double square(int p, int a, int b, int c) {
        int pp=p/2;
        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));

    }
}
