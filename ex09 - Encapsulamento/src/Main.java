//Criar uma classe "Usuario" com os atributos nome e senha, ambos privados.
//Criar um metodo setSenha(String senha), garantindo que a senha tenha pelo menos 8
//caracteres.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Usuario novoUsuario = new Usuario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome de usuário: ");
        String nome = scanner.nextLine();
        novoUsuario.setNome(nome);
        System.out.println("Crie a senha desejada: ");
        String senha = scanner.nextLine();
        novoUsuario.setSenha(senha);

        scanner.close();
    }
}