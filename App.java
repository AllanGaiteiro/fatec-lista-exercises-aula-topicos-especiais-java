
/*
3) Crie um método mostra(), que não recebe nem devolve parâmetro algum e simplesmente imprime todos os atributos do nosso funcionário. Dessa maneira, você não precisa ficar copiando e colando um monte de System.out.println() para cada mudança e teste que fizer com cada um de seus funcionários, você simplesmente vai fazer:
*/
public class App {

    public static void main(String[] args) {
        System.out.println("App - Started");

        // declare 
        Funcionario f1 = new Funcionario("Allan Gaiteiro", "CTO", 25000, "311.23423.323-23");
        Funcionario f2 = new Funcionario();

        // change value
        f2.name = "Hugo";
        f2.salary = 1000;
        f2.increaseSalary(50);

        // show
        f1.show();
        f2.show();
    }
}