//Criar uma classe "Aluno" com os atributos nome, nota1 e nota2, todos privados.
//o Criar métodos getNota1() e setNota1(double nota).
//o Criar métodos getNota2() e setNota2(double nota).
//o O metodo setNotaX() deve garantir que as notas sejam de 0 a 10.

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Arthur");
        aluno.setNota1(10);
        aluno.setNota2(2);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
    }
}