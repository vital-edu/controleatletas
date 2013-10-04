package controleatleta;

import java.util.ArrayList;

public class Judoca extends Atleta {

    private char categoria; // A=Amador P=Profissional
    private char estilo; // O=Ofensivo D=Defensivo
    private ArrayList<Premiacao> premiacoes;
    private Double envergadura; // Em cm
    private int totalLutas;
    private int totalVitorias;
    private int totalVitoriasNocaute;
    private int totalEmpates;
    private int totalDerrotas;
    private String graduaçao; //Kyu(6-1) e Dan(1-10)
    
    public Judoca(String nome) {
        super(nome);
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int derrotas) {
        this.totalDerrotas = derrotas;
    }

    public int getTotalEmpates() {
        return totalEmpates;
    }

    public void setTotalEmpates(int empates) {
        this.totalEmpates = empates;
    }

    public Double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(Double envergadura) {
        this.envergadura = envergadura;
    }

    public char getEstilo() {
        return estilo;
    }

    public void setEstilo(char estilo) {
        this.estilo = estilo;
    }

    public int getTotalLutas() {
        return totalLutas;
    }

    public void setTotalLutas(int numLutas) {
        this.totalLutas = numLutas;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int vitorias) {
        this.totalVitorias = vitorias;
    }

    public int getTotalVitoriasNocaute() {
        return totalVitoriasNocaute;
    }

    public void setTotalVitoriasNocaute(int vitoriasNocaute) {
        this.totalVitoriasNocaute = vitoriasNocaute;
    }

    public String obterCategoriaPesoNome() {
        return obterCategoriaPesoNome(this.getCategoria(), this.getPeso());
    }

    public static String obterCategoriaPesoNome(char categoria, double peso) {
        if (categoria == 'M') {
            return obterCategoriaPesoNomeFeminino(peso);
        } else if (categoria == 'F') {
            return obterCategoriaPesoNomeMasculino(peso);
        } else {
            return "";
        }
    }

    private static String obterCategoriaPesoNomeFeminino(double peso) {
        if (peso <= 44) {
            return "Super Ligeiro";
        } else if (peso <= 48) {
            return "Ligeiro";
        } else if (peso <= 52) {
            return "M. Leve";
        } else if (peso <= 57) {
            return "Leve";
        } else if (peso <= 63) {
            return "Meio Medio";
        } else if (peso <= 70) {
            return "Medio";
        } else if (peso <= 78) {
            return "Meio Pesado";
        } else {
            return "Pesado";
        }
    }

    private static String obterCategoriaPesoNomeMasculino(double peso) {
        if (peso <= 60) {
            return "Super Ligeiro";
        } else if (peso <= 60) {
            return "Ligeiro";
        } else if (peso <= 66) {
            return "Muito Leve";
        } else if (peso <= 73) {
            return "Leve";
        } else if (peso <= 81) {
            return "Meio Medio";
        } else if (peso <= 90) {
            return "Medio";
        } else if (peso <= 100) {
            return "Meio Pesado";
        } else {
            return "Pesado";
        }
    }

    public String getGraduaçao() {
        return graduaçao;
    }

    public void setGraduaçao(String graduaçao) {
        this.graduaçao = graduaçao;
    }

}