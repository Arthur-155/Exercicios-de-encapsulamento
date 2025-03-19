//Criar uma classe "Termostato" com os atributos temperaturaAtual e
//temperaturaDesejada, ambos privados.
//Criar getters e setters, garantindo que temperaturaDesejada não pode ser menor que 15°C
//nem maior que 30°C.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Termostato termostato = new Termostato();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a temperatura atual ?");
        int temperaturaAtual = scanner.nextInt();
        termostato.setTemperaturaAtual(temperaturaAtual);
        System.out.println("Qual é a temperatura que você deseja ?");
        int temperaturaDesejada = scanner.nextInt();
        termostato.setTemperaturaDesejada(temperaturaDesejada);



    }
}