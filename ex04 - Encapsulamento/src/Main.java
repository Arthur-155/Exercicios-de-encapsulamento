//Criar uma classe "Funcionario" com os atributos privados nome, cargo e salario.
//o Criar métodos getSalario() e setSalario(double salario).
//o Impedir que setSalario(double salario) aceite valores negativos.

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(-200);

        System.out.println("Salario é: " +funcionario.getSalario());
    }
}