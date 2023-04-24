package neobMassivy11jan;

public class Task1 {
    public static void main(String[] args) {
        int [] array=new int[12];
        for (int i=0;i< array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i< array.length; i++) {
            array[i]= array.length-i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i< array.length; i++) {
            sum=sum+array[i];}
        System.out.println(" сумма всех чисел массива = "+sum);
        System.out.println();
        int proizv=1;
        for (int i=0;i< array.length; i++) {
            proizv=proizv*array[i];
        }
        System.out.println(" произведение всех чисел массива = "+ proizv);
        System.out.println();
        double sum1=0;
        for (int i=0;i< array.length; i++) {
            sum1=sum1+Math.pow(array[i],2);
        }
        System.out.println(" сумма квадратов всех элементов = " +sum1);
        int sum2=0;
        for (int i=0; i<6; i++) {
            sum2=sum2+array[i];
        }
        System.out.println("сумма шести первых элементов = " + sum2);

        }
    }

