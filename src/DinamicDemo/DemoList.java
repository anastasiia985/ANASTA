package DinamicDemo;

import java.util.ArrayList;

public class DemoList {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>();
        myList.add("Apple");
        myList.add("Peer");
        myList.add("Melon");
        myList.add("Peach");
        myList.add(1,"Pineapple");
        System.out.println(myList);
        //System.out.println(myList.get(0));
        System.out.println(myList.indexOf("Peer"));
        myList.remove(0);
        myList.remove("Peach");
        System.out.println(myList);


    }
}
