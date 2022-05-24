
/*
2) Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o main. Você deve criar a classe do funcionário com o nome Funcionario, mas pode nomear como quiser a classe de testes, contudo, ela deve possuir o método main.
*/
public class App {

    public static void main(String[] args) {
        System.out.println("App - Started");
        Funcionario f1 = new Funcionario("Allan Gaiteiro", "CTO", 25000, "311.23423.323-23");

        System.out.println(f1.name);
    }
}