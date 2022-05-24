// Exercicie 2
import java.util.Date;
public class Funcionario {
    public String name;
    public String department;
    public double salary;
    private String createdDate;
    public String rg;

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

}
