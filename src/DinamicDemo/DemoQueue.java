package DinamicDemo;

import java.util.ArrayDeque;

public class DemoQueue {
    public static void main(String[] args) {
        ArrayDeque<Double> myQueue= new ArrayDeque<>();
        //poll, выдает null если пусто pop, выдает ошибку если пусто
        //peek push
        myQueue.push(0.12);
        myQueue.push(0.122);
        myQueue.push(3.14);
        myQueue.add(3.14);
        myQueue.add(0.122);
        myQueue.add(0.12);
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
        System.out.println(myQueue.pop());
        System.out.println(myQueue);
    }
}
