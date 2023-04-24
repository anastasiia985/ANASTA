package DemoZoo;

public class Human extends Animal{
    int age;

    @Override
    public void eat() {
        System.out.println("человек ест");
    }

    @Override
     public void sleep() {
        System.out.println("человек спит");

    }
}
