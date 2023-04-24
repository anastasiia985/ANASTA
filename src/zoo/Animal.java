package zoo;

public class Animal {
    //животные кусаются
    //могут болеть
    boolean healthy;
    String animalName;
    String cage="в вольере";
    public void bite(Human human){
        human.hurt=true;//кусает человека
        System.out.println("животное покусало"+human.profession);


    }


}
