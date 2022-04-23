package day14.exer1;

public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int age, MyDate birthday) {
        super(name, age, birthday);
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
