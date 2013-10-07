package controleatleta;

import java.util.ArrayList;

public class Judoca extends Atleta {

    private char categoria; // A=Amador P=Profissional
    private char estilo; // O=Ofensivo D=Defensivo
    private ArrayList<Premiacao> premiacoes;
    private Double envergadura; // Em cm
    private int totalLutas;
    private int totalVitorias;
    private int totalEmpates;
    private int totalDerrotas;
    private String graduacao; //Kyu(11-1) e Dan(1-10)
    private String faixa;

    public Judoca(String nome) {
        super(nome);
    }
    
    public Judoca(char categoria, char estilo, Double envergadura, int totalLutas, int totalVitorias, int totalEmpates, int totalDerrotas, String graduacao, String nome, char sexo, String faixa) {
        super(nome, sexo);
        this.categoria = categoria;
        this.estilo = estilo;
        this.envergadura = envergadura;
        this.totalLutas = totalLutas;
        this.totalVitorias = totalVitorias;
        this.totalEmpates = totalEmpates;
        this.totalDerrotas = totalDerrotas;
        this.graduacao = graduacao;
        this.faixa = faixa;
    }
   
    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
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

    public String obterCategoriaPesoNome() {
        return obterCategoriaPesoNome(this.getCategoria(), this.getPeso());
    }

    public static String obterCategoriaPesoNome(char sexo, Double peso) {
        if (sexo == 'F') {
            return obterCategoriaPesoNomeFeminino(peso);
        } else if (sexo == 'M') {
            return obterCategoriaPesoNomeMasculino(peso);
        } else {
            return "";
        }
    }

    private static String obterCategoriaPesoNomeFeminino(Double peso) {
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

    private static String obterCategoriaPesoNomeMasculino(Double peso) {
        if (peso <= 50) {
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

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
    
    public static String obterCorFaixa(int graduacao){
        if (graduacao == 0){
            return "Branca";
        }else if(graduacao == 1){
            return "Branca";   
        }else if(graduacao == 2){
            return "Cinza";
        }else if(graduacao == 3){
            return "Cinza";
        }else if(graduacao == 4){
            return "Azul";
        }else if(graduacao == 5){
            return "Azul";
        }else if(graduacao == 6){
            return "Amarela";
        }else if(graduacao == 7){
            return "Amarela";
        }else if(graduacao == 8){
            return "Laranja";
        }else if(graduacao == 9){
            return "Verde";
        }else if(graduacao == 10){
            return "Roxa";
        }else if(graduacao == 11){
            return "Marrom";
        }else if(graduacao == 12){
            return "Preta";
        }else if(graduacao == 13){
            return "Preta";
        }else if(graduacao == 14){
            return "Preta";
        }else if(graduacao == 15){
            return "Preta";
        }else if(graduacao == 16){
            return "Preta";
        }else if(graduacao == 17){
            return "Vermelha e Branca";
        }else if(graduacao == 18){
            return "Vermelha e Branca";
        }else if(graduacao == 19){
            return "Vermelha e Branca";
        }else if(graduacao == 20){
            return "Vermelha";
        }else if(graduacao == 21){
            return "Vermelha";
        }else
            return "Branca";
        }
    }
