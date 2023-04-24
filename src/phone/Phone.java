package phone;

public class Phone {
    //Создайте класс Phone, который содержит переменные number, model и weight.
    private String number;
    private String model;
    private double weight;
    public void setNumber(String number){
        this.number=number;
    }
    public String getNumber(){
        return number;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    public void receiveCall(){
        System.out.println("Звонит {Name}");
    }
    public void GetNumber(){
        System.out.println(number);
    }
}
