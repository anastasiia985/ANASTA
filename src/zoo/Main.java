package zoo;

public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian=new Veterinarian();
        Zookeeper zookeeper=new Zookeeper();
        veterinarian.lunch();
        zookeeper.lunch();
        veterinarian.hungry=true;
        veterinarian.lunch();
        zookeeper.hurt=true;
        zookeeper.makeBand();

        Cats lion=new Cats();
        Cats tiger=new Cats();
        Hypo hypo=new Hypo();
        Sqrls sqrlsS=new Sqrls();
        Sqrls sqrlsL=new Sqrls();
        lion.animalName="Кузя";
        tiger.animalName="Жора";
        sqrlsL.animalName="Ловкач";
        sqrlsS.animalName="Стрелка";
        System.out.println(" Бегемот кличка "+hypo.animalName);
        System.out.println(" Лев кличка "+lion.animalName);
        System.out.println(" Тигр кличка "+tiger.animalName);
        System.out.println(" Белка №1 кличка "+sqrlsL.animalName);
        System.out.println(" Белка №2 кличка "+sqrlsS.animalName);


        System.out.println(zookeeper.hurt);
         lion.bite(zookeeper);
        System.out.println(zookeeper.hurt);

        sqrlsL.run();
        veterinarian.watch(sqrlsL);

        sqrlsL.healthy=false;
        veterinarian.checkHealth(sqrlsL);
        sqrlsL.healthy=true;
        veterinarian.checkHealth(sqrlsL);

        lion.brush=true;
        zookeeper.doBrush(lion);

        hypo.cleanwater=true;
        zookeeper.doCleanWater(hypo);

        zookeeper.doCleanWater(hypo);

        zookeeper.doBrush(lion);
        tiger.brush=true;
        zookeeper.doBrush(tiger);




    }
}
