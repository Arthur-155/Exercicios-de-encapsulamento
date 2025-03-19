////Criar uma classe "Livro" com os atributos titulo, autor e disponivel
///  (booleano, privado).
////o Criar um metodo emprestar(), que define disponivel = false.
////o Criar um metodo devolver(), que define disponivel = true.
////o Criar um metodo getDisponivel(), que informa se o livro está disponível ou não.

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public void emprestar(){
        disponivel=false;
    }

    public void devolver(){
        disponivel=true;
    }


    public boolean getDisponivel() {
        if(disponivel=true){
            System.out.println("Livro disponivel");
        }else{
            System.out.println("Produto indisponivel");
        }
        return disponivel;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
