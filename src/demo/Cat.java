package demo;

public class Cat {
    //поля
    private String name;
    int age;
    boolean hungry;
    static int count=0;
    //свойства

    public String getName() {
        return name;

    }

    public void setName(String NewName) {
        if (NewName != "") {
            name = NewName;
        }
    }
    //методы
    private void meow(){
        System.out.println("meow");
    }
    public void wantToOut() {
        System.out.println("скребет дверь и мяукает");
        meow();
    }
    public static void countCats (){
        count++;
        System.out.println("создана кошка № "+count);
    }
    //конструкторы
public Cat(String name, int age){
        this.name=name;
        this.age=age;
        countCats();
    }
    public Cat(){
        countCats();
    }
}
