package controleatleta;

import javax.swing.JOptionPane;

public class ControleAtleta {

    public static void main(String[] args) {
        String opcao;
        
        Menu menuPrincipal = new Menu();
        menuPrincipal.setVisible(true);
        
        opcao = menuPrincipal.getOpcao();
     
        if ("Boxeador".equals(opcao)){    
            CadastroBoxeador cadastro1 = new CadastroBoxeador();
            cadastro1.setVisible(true);
        }else if("Judoca".equals(opcao)){
            CadastroJudoca cadastro2 = new CadastroJudoca();
            cadastro2.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Opçao Invalida");        
        }       
    }
}
