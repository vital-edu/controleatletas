package controleatleta;

import java.util.ArrayList;

public class Judoca extends Atleta {

    private String modalidade;
    private String tecnica;
    private double forca;
    private double reflexo;
    private double resistencia;
    private double agilidade;
    private int dan;
    private String estilo;
    
    private int totalVitorias;
    private int totalDerrotas;
    private int totalLutas;
    
    public Judoca(String nome) {
        super(nome);
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
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

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
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
    
}
