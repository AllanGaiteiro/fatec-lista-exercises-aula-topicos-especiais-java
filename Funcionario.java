// Exercicie 2
import java.util.Date;
public class Funcionario {
    public String name;
    public String department;
    public double salary;
    private String createdDate;
    public String rg;

    public Funcionario() {
    }

    public Funcionario(String name, String department, double salary, String rg) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.setCreatedDate(new Date().toString());
        this.rg = rg;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    private void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void increaseSalary(double increase){
        this.salary += increase;
    }

    public double annualSalary() {
        return this.salary * 12;
    }

    public void show() {
        System.out.println("//////////// Funcionario //////////////");
        System.out.println("Name: " + this.name);
        System.out.println("Rg: " + this.rg);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: $" + this.salary);
        System.out.println("Annual Salary: " + this.annualSalary());
        System.out.println("Created Date: " + this.createdDate);
        System.out.println("////////////////////////////////////////");
    }
}
