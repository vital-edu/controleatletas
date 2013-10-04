package controleatleta;

import java.util.ArrayList;

public class ControleJudoca {

    private ArrayList<Judoca> listaJudocas;

    public ControleJudoca() {
        this.listaJudocas = new ArrayList<Judoca>();
    }
    
    public ArrayList<Judoca> getListaJudocas() {
        return listaJudocas;
    }
    
    public void adicionar(Judoca umJudoca) {
        listaJudocas.add(umJudoca);
    }
    
    public void remover(Judoca umJudoca) {
        listaJudocas.remove(umJudoca);
    }
    
    public Judoca pesquisar(String nome) {
        for (Judoca b: listaJudocas) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
}
