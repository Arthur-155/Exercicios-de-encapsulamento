//Criar uma classe "Carro" com os atributos privados marca, modelo e
//velocidadeAtual.
//Criar um metodo acelerar(int incremento), que aumenta a velocidade, mas não pode
//ultrapassar 180 km/h.
//Criar um metodo frear(int decremento), que reduz a velocidade, mas não pode ser menor que
//0 km/h.

import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;
    private int velocidadeReduzida;

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(){
        int velocidadeAumentada;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o quanto você deseja acelerar: ");
        int incremento;
        incremento = scanner.nextInt();
        velocidadeAumentada = velocidadeAtual + incremento;

        if(velocidadeAumentada > 180){
            System.out.println("Velocidade ultrapassou 180 km/h, diminua a velocidade!");
        }else{
            System.out.println("Nova velocidade : " + velocidadeAumentada + " km/h");
        }
    }

    public void frear(){
        int decremento;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o quanto você deseja frear");
        decremento = scanner.nextInt();
        velocidadeReduzida = velocidadeAtual-decremento;

        if(velocidadeReduzida < 0 ){
            System.out.println("Não é permitido a velocidade ser menor que 0!");
        }else{
            System.out.println("Nova velocidade : " + velocidadeReduzida + " km/h");
        }
    }
}
