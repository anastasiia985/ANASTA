package DemoZoo;

public interface Behavior {
    default void bite(){
        System.out.println("Кусать");
    }
    boolean clean();

    }

