package car;

public class Car {
    private String color;
    private String type;
    private int year;
    public void start(){
        System.out.println("Автомобиль заведен");
    }
    public void stop(){
        System.out.println("Автомобиль заглушен");
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public Car(){ //все поля под null

    }
    public Car(String color, String type,int year){
        this.color=color;
        this.type=type;
        this.year=year;
    }



}
