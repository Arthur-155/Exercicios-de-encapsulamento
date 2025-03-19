//Criar uma classe "Funcionario" com os atributos privados nome, cargo e salario.
//Criar métodos getSalario() e setSalario(double salario).
//Impedir que setSalario(double salario) aceite valores negativos.

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0){
            System.out.println("Digite apenas valores positivos");
        }
    }
}
