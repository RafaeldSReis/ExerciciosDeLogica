package entities;

public class CalculateSalary {
    private String name;
    private double salary;
    private int tax;

    public CalculateSalary(String name, double salary, int tax){
        this.name = name;
        this.salary = salary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double totalSalary(){
        return salary - (salary * tax) / 100;
    }

    public double salaryIncrease(int addValor){
        return  salary + (salary * addValor) / 100;
    }
}
