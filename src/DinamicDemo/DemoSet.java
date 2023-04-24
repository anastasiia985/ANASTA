package DinamicDemo;

import java.util.HashSet;

public class DemoSet {
    public static void main(String[] args) {
        HashSet<String> mySet= new HashSet<>();
        mySet.add("Window");
        mySet.add("Door");
        mySet.add("House");

        System.out.println(mySet);
        mySet.remove("Door");
        System.out.println(mySet);
        mySet.add("Door");
        System.out.println(mySet);
    }}