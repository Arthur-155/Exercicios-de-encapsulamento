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
        if(disponivel==true){
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
        System.out.println(autor);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        System.out.println(titulo);
    }
}
