package DemoZoo;

public class Main {
    public static void main(String[] args) {
        Human human=new Human();
        human.age=23;
        human.name="Tom";
        System.out.println("Имя человека "+ human.name+"\n возраст "+ human.age);
        human.eat();
        human.sleep();

        Dog dog=new Dog();
        dog.name=" Шарик";
        System.out.println("\nКличка собаки "+ dog.name);
        dog.bark();
        dog.eat();
        dog.sleep();
        dog.bite();
        dog.clean();
        Doctors doctor=new Doctors();
        doctor.age=30;
        doctor.name="Дмитрий";
        System.out.println("\nИмя доктора "+ doctor.name+"\n возраст "+ doctor.age);
        doctor.eat();
        doctor.sleep();
        System.out.println();
        Tools tool=new Tools();
        tool.bite();
        tool.clean();





    }

}
