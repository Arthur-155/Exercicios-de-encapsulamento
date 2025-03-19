//Criar uma classe "Usuario" com os atributos nome e senha, ambos privados.
//Criar um metodo setSenha(String senha), garantindo que a senha tenha pelo menos 8
//caracteres.

import java.util.Scanner;

public class Usuario {
    private String nome;
    private String senha;

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome: " + nome);
    }

    public void setSenha(String senha) {

        Scanner scanner = new Scanner(System.in);

        while(senha.length() < 8){
            System.out.println("A senha deve ter no minimo 8 caracteres");
            senha = scanner.nextLine();
        }
            this.senha = senha;
            System.out.println("Nova senha criada");
            System.out.println("Senha: " + senha);
        }

    }

