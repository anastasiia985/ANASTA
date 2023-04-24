public class Task9ex26dec {
    //8.Гражданин 1 марта открыл счет в банке, вложив 1000 руб. Через каждый месяцразмер вклада
    // увеличивается на 2% от имеющейся суммы. Определить:1.за какой месяц величина ежемесячного
    // увеличения вклада превысит 30руб.;2.через сколько месяцев размер вклада превысит 1200 руб.
    public static void main(String[] args) {
        double vklad=1000;
        double vklad2=1200;
        double number1=0;
        double number2=0;
        int n=0;
       // do { number1=vklad+vklad*2/100;
       //     n++;
        //    number2=number1;
       // vklad=number2;}
       // while ((number1-1000)<30);
       // System.out.println(n);
        //System.out.println(number1);
        do {number1=vklad+vklad*2/100;
                n++;
               number2=number1;
             vklad=number2;}
             while (number1<vklad2);
            System.out.println(n);
        System.out.println(number1);
        // double sum = 1000;
        //        double percent = 0.02;
        //        int count = 0;
        //
        //        while(sum*percent < 30) {
        //            sum += sum*percent;
        //            count++;
        //        }
        //
        //        System.out.println(sum*percent + " " + count);
        //
        //
        //        sum = 1000;
        //        count = 0;
        //        do {
        //            sum += sum*percent;
        //            count++;
        //        } while (sum<1200);
        //
        //        System.out.println(sum+" "+count);
        //    }
        //}

    }
}
