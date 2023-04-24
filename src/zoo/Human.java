package zoo;
// может быть голодным и покусанным
//обедает
// следит за белками
//накладывает повязку
public abstract class Human {
    boolean hungry;// false
    boolean hurt;//false
    String profession;
    abstract void lunch();
    void watch(Sqrls sqrls) {
        if (sqrls.cage == "вне вольера"){
            System.out.println("белка поймана");
            sqrls.cage = "в вольере";
        } else
        {
            System.out.println("белка на месте");
        }

    }
    abstract void makeBand();


}
