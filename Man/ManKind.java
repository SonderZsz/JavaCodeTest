package Man;

public class ManKind {
//
    private int sex;
    private int salary;
//
    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }
//
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
//
    public void manOrWoman(){
        if(sex == 1){
            System.out.println("Man!");
        }else if(sex == 0){
            System.out.println("Woman!");
        }
    }

    public void employee(){
        if(salary == 0){
            System.out.println("No Job!");
        }else{
            System.out.println("Job!");
        }
    }


}
