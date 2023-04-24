package zoo;
// может быть голодным и покусанным
// обходит каждое животное и проверяет его здоровье
// помещает его в карантин, изолируя от других животных
// возвращает животное в обычный вольер
//обедает
// следит за белками
//накладывает повязку
public class Veterinarian extends Human{

    @Override
    void lunch() {
if (hungry){//hungry==true
    System.out.println("ветеринар обедает");
    hungry=false;
} else {
    System.out.println(" ветеринар еще не голоден");
}
    }



    @Override
    void makeBand() {
        if (hurt){//hurt==true
            System.out.println("ветеринар накладывает себе повязку");
            hurt=false;
        } else {
            System.out.println(" ветеринар не покусан");
        }

    }
    public Veterinarian(){
        profession="ветеринар";
    }
    public void checkHealth(Animal animal){
        if ((!animal.healthy)){
        animal.cage="в карантине";
        System.out.println("животное помещено в карантин");
    }
        if ((animal.cage=="в карантине")&&animal.healthy){
            animal.cage="в вольере";
            System.out.println("животное вернулось из карантина");
        }
    }


    }



