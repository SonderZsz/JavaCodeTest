package Man;

public class Kids extends ManKind{
    private int yearsOld;

    public Kids (){

    }

    public void employee(){

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
       System.out.println("i'm " + yearsOld + " years old.");
   }
}
