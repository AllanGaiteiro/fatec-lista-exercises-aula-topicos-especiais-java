import java.util.Date;
/*
1) Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário (double), a data de entrada no banco (String) e seu RG (String).

Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método recebeAumento que aumenta o salario do funcionário de acordo com o parâmetro passado como ar- gumento. Crie também um método calculaGanhoAnual, que não recebe parâmetro algum, devolvendo o valor do salário multiplicado por 12..

A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes e o que um funci- onário faz. Desenhe no papel tudo o que um Funcionario tem e tudo que ele faz.
*/
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
