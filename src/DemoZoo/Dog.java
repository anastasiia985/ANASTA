package DemoZoo;

public class Dog extends Animal implements Behavior{
    public void bark(){
        System.out.println("собака лает");
    }

    @Override
    public void eat() {
        System.out.println("собака ест");
    }

    @Override
    public void sleep() {
        System.out.println("собака спит");
    }

    @Override
    public boolean clean() {
        System.out.println("Собака вымыта");
        return true;
    }
}
