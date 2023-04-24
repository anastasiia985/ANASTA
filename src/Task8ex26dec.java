public class Task8ex26dec {
    //Найти максимальное из натуральных чисел, не превышающих 5000, котороенацело делится на 39.

    public static void main(String[] args) {
        int sum=0;
        int sum1=0;
        for (int i=0; i<=5000;i++){
            if (i%39==0) { sum1 =sum+i;
            sum=0;};
        }
        System.out.println("Максимальное натуральное не превышающее 5000 число " +
                "делящееся на 39 без остатка"+sum1);
        // for (int i = 5000; i>0; i--){
        //            if (i % 39 == 0){
        //                System.out.println(i);
        //                break;
    }
}
