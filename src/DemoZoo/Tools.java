package DemoZoo;

public class Tools implements Behavior{
    @Override
    public boolean clean() {
        System.out.println("Инструмент вымыт");
        return true;
    }
}
