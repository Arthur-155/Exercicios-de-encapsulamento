//Criar uma classe "Produto" com os atributos nome e preco, ambos privados.
//o Criar getters e setters, garantindo que preco não pode ser negativo.

public class Produto {
    private String nome;
    private double preco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            System.out.println("Não é permitido preços negativos");
        }else{
            this.preco = preco;
        }
    }
}
