
/*
5) Crie duas referências para o mesmo funcionário, compare-os com o ==. Tire suas conclusões. Para criar duas referências pro mesmo funcionário:
*/
public class App {

    public static void main(String[] args) {
        System.out.println("App - Started");

        // declare 
        Funcionario f1 = new Funcionario("Allan Gaiteiro", "CTO", 25000, "311.23423.323-23");
        Funcionario f2 = f1;
        //Funcionario f3 = new Funcionario();

        // change value
        //f2.name = "Hugo";
        //f2.salary = 1000;
        //f2.increaseSalary(50);

        // show
        f1.show();
        f2.show();
        System.out.println("Funcionario f1"+(f1 == f2?"":" não")+ " é igual a funcionario f2.");
        // eles são iguais pois esta passando a mesma referencia para ambos
    }
}