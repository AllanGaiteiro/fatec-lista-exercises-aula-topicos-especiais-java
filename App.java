
/*
3) Construa dois funcionários com o new e compare-os com o ==. E se eles tiverem os mesmos atributos? Para isso você vai precisar criar outra referência:
*/
public class App {

    public static void main(String[] args) {
        System.out.println("App - Started");

        // declare 
        Funcionario f1 = new Funcionario("Allan Gaiteiro", "CTO", 25000, "311.23423.323-23");
        Funcionario f2 = new Funcionario("Allan Gaiteiro", "CTO", 25000, "311.23423.323-23");
        //Funcionario f3 = new Funcionario();

        // change value
        //f2.name = "Hugo";
        //f2.salary = 1000;
        //f2.increaseSalary(50);

        // show
        f1.show();
        f2.show();
        System.out.println("Funcionario f1 "+(f1 == f2?"":"não")+ " é igual a funcionario f2.");
        // eles não são iguais pois esta comparando a referencia e não os valores
    }
}