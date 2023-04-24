package zoo;
// может быть голодным и покусанным
// ежедневно два раза в день кормит всех животных
// по необходимости вычесывает кошачьих
// по необходимости меняет бегемоту воду
// обедает
// следит за белками
//накладывает повязку
public class Zookeeper extends Human {
    @Override
    void lunch() {
        if (hungry) {//hungry==true
            System.out.println("смотритель обедает");
            hungry = false;
        } else {
            System.out.println(" смотритель еще не голоден");
        }

    }


    @Override
    void makeBand() {
        if (hurt) {//hurt==true
            System.out.println("смотритель накладывает себе повязку");
            hurt = false;
        } else {
            System.out.println(" смотритель не покусан");
        }

    }

    public Zookeeper() {
        profession = "смотритель";
    }

    public void doBrush(Cats cats) {
        if ((cats.brush==true)) {
            System.out.println("кошачьи вычесаны " + profession);
            cats.brush=false;

        } else {
            System.out.println("кошачьих вычесывать не нужно");
        }
    }

    public void doCleanWater(Hypo hypo) {
        if (hypo.cleanwater==true) {
            System.out.println("воду в бассейне поменял " + profession);
            hypo.cleanwater=false;

        }else {
            System.out.println("воду в бассейне менять не нужно");
        }

    }
}
