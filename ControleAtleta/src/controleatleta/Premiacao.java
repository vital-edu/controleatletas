package controleatleta;

public class Premiacao {

    private String titulo;
    private int ano;
    private int colocacao;

    public Premiacao(String titulo, int ano, int colocacao) {
        this.titulo = titulo;
        this.ano = ano;
        this.colocacao = colocacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
      public int getColocacao() {
        return colocacao;
    }

    public void setColocacao(int colocacao) {
        this.colocacao = colocacao;
    }
    
    @Override
    public String toString() {
        return this.colocacao + "º lugar - " + this.ano + " - " + this.titulo;
    }
}
