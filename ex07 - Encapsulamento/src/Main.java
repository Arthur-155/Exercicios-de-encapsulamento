import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int verificacao;


        Livro livro = new Livro();
        System.out.println("======INFORMAÇÕES DO LIVRO======");
        livro.setAutor("Ryan Holliday");
        livro.setTitulo("O ego é seu inimigo");
        System.out.println("======FIM DAS INFORMAÇÕES DO LIVRO======");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVocê deseja emprestar ou devolver o livro ?");
        System.out.println("Digite 1 - Para emprestar");
        System.out.println("Digite 2 - Para devolver");
        verificacao = scanner.nextInt();

        switch (verificacao){
            case 1:
                livro.emprestar();
                livro.getDisponivel();
                break;
            case 2:
                livro.devolver();
                livro.getDisponivel();
        }

    }
}