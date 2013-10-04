package controleatleta;

import java.util.ArrayList;

public class Judoca extends Atleta {

    private String tecnica;
    private double forca;
    private double reflexo;
    private double resistencia;
    private double agilidade;
    private String graduaçao;
    private String estilo;
    private String divisao;
    private String classe;
    private String categoria;
    private int totalVitorias;
    private int totalDerrotas;
    private int totalEmpates;
    private int totalLutas;
    
    public Judoca(String nome) {
        super(nome);
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getReflexo() {
        return reflexo;
    }

    public void setReflexo(double reflexo) {
        this.reflexo = reflexo;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(double agilidade) {
        this.agilidade = agilidade;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int totalVitorias) {
        this.totalVitorias = totalVitorias;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int totalDerrotas) {
        this.totalDerrotas = totalDerrotas;
    }

    public int getTotalLutas() {
        return totalLutas;
    }

    public void setTotalLutas(int totalLutas) {
        this.totalLutas = totalLutas;
    }

    public int getTotalEmpates() {
        return totalEmpates;
    }

    public void setTotalEmpates(int totalEmpates) {
        this.totalEmpates = totalEmpates;
    }

    public String getGraduaçao() {
        return graduaçao;
    }

    public void setGraduaçao(String graduaçao) {
        this.graduaçao = graduaçao;
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
