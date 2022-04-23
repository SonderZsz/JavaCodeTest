package Project03.domain;

import Project03.service.Status;

public class Programmer extends Employee{
    private int memberId;
    private Project03.service.Status Status = Project03.service.Status.FREE;
    private Equipment equipment;

    public Programmer(){

    }

    public Programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Project03.service.Status getStatus() {
        return Status;
    }

    public void setStatus(Project03.service.Status status) {
        Status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + getStatus()+ "\t\t\t" + equipment.getDescription() ;
    }

    public String getDetailsForTeam(){
        return memberId +"\t"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t程序员";
    }
}
