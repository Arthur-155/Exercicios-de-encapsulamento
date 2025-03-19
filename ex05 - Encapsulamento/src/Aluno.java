
//o Criar métodos getNota1() e setNota1(double nota).
//o Criar métodos getNota2() e setNota2(double nota).
//o O metodo setNotaX() deve garantir que as notas sejam de 0 a 10.

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota) {
        if (nota >= 0 && nota<= 10){
            this.nota1=nota;
        }else{
            System.out.println("Valor inserido é invalido");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota) {
        if (nota >= 0 && nota<= 10){
            this.nota2=nota;
        }else{
            System.out.println("Valor inserido é invalido");
        }
    }
}
