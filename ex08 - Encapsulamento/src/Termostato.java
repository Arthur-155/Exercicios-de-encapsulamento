//Criar uma classe "Termostato" com os atributos temperaturaAtual e
//temperaturaDesejada, ambos privados.
//Criar getters e setters, garantindo que temperaturaDesejada não pode ser menor que 15°C
//nem maior que 30°C.

public class Termostato {
    private int temperaturaAtual;
    private int temperaturaDesejada;

    public void setTemperaturaAtual(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
        System.out.println("Temperatura Atual " + temperaturaAtual + "°C");
    }

    public void setTemperaturaDesejada(int temperaturaDesejada) {
        if (temperaturaDesejada < 15 || temperaturaDesejada>30) {
            System.out.println("É permitido apenas temperaturas de 15°C à 30°C");
        }else{
            this.temperaturaDesejada = temperaturaDesejada;
            System.out.println("Temperatura alterada para: " + temperaturaDesejada + "°C");
        }
    }
}
