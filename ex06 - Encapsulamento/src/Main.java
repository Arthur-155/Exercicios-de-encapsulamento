//Criar uma classe "Produto" com os atributos nome e preco, ambos privados.
//o Criar getters e setters, garantindo que preco não pode ser negativo.

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Arthur");
        produto.setPreco(-20);

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }
}