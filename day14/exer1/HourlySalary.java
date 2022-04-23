package day14.exer1;

public class HourlySalary extends Employee{
    private int wage;
    private int hour;

    public HourlySalary(String name, int age, MyDate birthday) {
        super(name, age, birthday);
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlySalary{" +
                "wage=" + wage +
                ", hour=" + hour +
                '}';
    }
}
