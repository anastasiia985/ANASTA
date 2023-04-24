package phone;

import car.Car;

public class Main {
    public static void main(String[] args) {
        Phone phone1=new Phone();
        Phone phone2=new Phone();
        Phone phone3=new Phone();
        phone1.setNumber("9271111111");
        phone2.setNumber("9272222222");
        phone3.setNumber("9273333333");
        phone1.setModel("Iphone");
        phone2.setModel("Samsung");
        phone3.setModel("Xiaomi");
        phone1.setWeight(70.5);
        phone2.setWeight(100.0);
        phone3.setWeight(85.4);
        System.out.println("телефон № 1");
        System.out.println("Номер телефона: "+phone1.getNumber());
        System.out.println("Модель: "+phone1.getModel());
        System.out.println("вес: "+phone1.getWeight());
        phone1.receiveCall();
        phone1.GetNumber();

        System.out.println("\nтелефон № 2");
        System.out.println("Номер телефона: "+phone2.getNumber());
        System.out.println("Модель: "+phone2.getModel());
        System.out.println("вес: "+phone2.getWeight());
        phone2.receiveCall();
        phone2.GetNumber();

        System.out.println("\nтелефон № 3");
        System.out.println("Номер телефона: "+phone3.getNumber());
        System.out.println("Модель: "+phone3.getModel());
        System.out.println("вес: "+phone3.getWeight());
        phone3.receiveCall();
        phone3.GetNumber();
    }
}
