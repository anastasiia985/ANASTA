public class Task2 {
    public static void main(String[] args) {
        int number=39;
        int desytki=number/10;
        int edinic= number%10;
        int sum= desytki+edinic;
        int proizv=desytki*edinic;
        System.out.printf(
                "количество десятков - %d, количество единиц - %d\n сумма цифр - %d, произведение цифр - %d",
                desytki,
                edinic,
                sum,
                proizv
        );





    }
}
