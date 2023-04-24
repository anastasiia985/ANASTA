public class Task5ex21dec {
    // даны стороны двух треугольников. Рассчитать сумму их периметров и сумму их площадей.
    // процедура для этого
    public static void main(String[] args) {
int a=3;
int b=4;
int c=5;
        int a1=3;
        int b1=4;
        int c1=5;
        int p=perimetr(a, b, c);
        int p1=perimetr(a1, b1,c1);

System.out.println("Периметр первого треугольника = "+ p);
        System.out.println("Периметр второго треугольника = "+ p1);
    double sq=square(p, a, b, c);
        System.out.println("площадь первого треугольника ="+ sq);
        System.out.println("площадь второго тругольника = "+square(p1, a1, b1, c1));
        System.out.println("сумма периметров = "+ (p+p1));
        System.out.println(" сумма площадей = "+ (sq+square(p1, a1,b1,c1)));
}
    public static int perimetr(int a, int b, int c){
        return a+b+c;
    }
    public static double square(int p, int a, int b, int c) {
        int pp=p/2;
        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));

    }
}
