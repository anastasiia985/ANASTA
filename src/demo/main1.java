package demo;

import demo.Cat;

import static demo.Cat.count;

public class main1 {
    public static void main(String[] args) {
        Cat cat1= new Cat();
        //count++;
         cat1.age=2;
         cat1.setName("Murka");
        cat1.setName("");
        System.out.println("имя кошки " + cat1.getName());
        System.out.println("возраст кошки "+ cat1.age);
        System.out.println(cat1.hungry);
        System.out.println();
        cat1.wantToOut();
        System.out.println();
        Cat cat2=new Cat("Мурзик",3);
        //count++;
        cat2.age=5;
        System.out.println("имя кошки " + cat2.getName());
        System.out.println("возраст кошки "+ cat2.age);
        System.out.println(cat2.hungry);
        System.out.println("\nколичество кошек: "+count);



    }
}
