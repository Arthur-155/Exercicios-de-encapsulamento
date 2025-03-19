//Criar uma classe "Carro" com os atributos privados marca, modelo e velocidadeAtual.
//Criar um metodo acelerar(int incremento), que aumenta a velocidade, mas não pode
//ultrapassar 180 km/h.
//Criar um metodo frear(int decremento), que reduz a velocidade, mas não pode ser menor que
//0 km/h.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;

        Carro novoCarro = new Carro();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a velocidade atual ?");
        int velocidadeAtual = scanner.nextInt();
        novoCarro.setVelocidadeAtual(velocidadeAtual);
        System.out.println("Deseja frear ou acelerar");
        System.out.println("Digite 1 para acelerar");
        System.out.println("Digite 2 para frear");
        escolha = scanner.nextInt();
        switch(escolha){
            case 1:
                novoCarro.acelerar();
                break;
            case 2:
                novoCarro.frear();
                break;
            default:
                System.out.println("Valor invalido");
        }


        scanner.close();

    }
}