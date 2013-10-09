/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatleta;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stark
 */
public class ControleJudocaTest {
    
    ControleJudoca umControle;
    Judoca judoca1;
    Judoca judoca2;
    Judoca judoca3;
    
    @Before
    public void setUp() throws Exception{
        judoca1 = new Judoca("Carlos",'M');
        judoca2 = new Judoca("Maria", 'F');
        judoca3 = new Judoca("Carla", 'F');
        umControle = new ControleJudoca();
        
        umControle.adicionar(judoca1);
        umControle.adicionar(judoca2);
        umControle.adicionar(judoca3);
    }

    @Test
    public void testGetListaJudocas() {
        ArrayList<Judoca> listaTest = new ArrayList<Judoca>();

        listaTest.add(judoca1);
        listaTest.add(judoca2);
        listaTest.add(judoca3);
            
        assertEquals(listaTest, umControle.getListaJudocas());
    }

    @Test
    public void testAdicionar() {
        Judoca judocaNovo = new Judoca("Romeu", 'M');
        ArrayList<Judoca> listaTest = new ArrayList<Judoca>();
        
        listaTest.add(judoca1);
        listaTest.add(judoca2);
        listaTest.add(judoca3);
        listaTest.add(judocaNovo);
        
        umControle.adicionar(judocaNovo);
        
        assertEquals(listaTest, umControle.getListaJudocas());
    }

    @Test
    public void testRemover() {
        Judoca judocaNovo = new Judoca("Romeu", 'M');
        ArrayList<Judoca> listaTest = new ArrayList<Judoca>();
        
        listaTest.add(judoca1);
        listaTest.add(judoca2);
        
        umControle.remover(judoca3);
        
        assertEquals(listaTest, umControle.getListaJudocas());
    }

    @Test
    public void testPesquisar() {
        assertEquals(judoca2, umControle.pesquisar("Maria"));
    }
}