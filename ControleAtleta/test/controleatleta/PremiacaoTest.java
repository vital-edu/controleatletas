package controleatleta;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PremiacaoTest {
    
    Premiacao umaPremiacao;
    
    @Before
    public void setUp() throws Exception {
        umaPremiacao = new Premiacao("Campeonato Mundial", 2012,2);
    }

    @Test
    public void testGetTitulo() {
        assertEquals("Campeonato Mundial",umaPremiacao.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        umaPremiacao.setTitulo("Olimpiadas");
        assertEquals(umaPremiacao.getTitulo(),"Olimpiadas");
    }

    @Test
    public void testGetAno() {
        assertEquals(2012,umaPremiacao.getAno());
    }

    @Test
    public void testSetAno() {
        umaPremiacao.setAno(2013);
        assertEquals(umaPremiacao.getAno(), 2013);
    }

    @Test
    public void testGetColocacao() {
        assertEquals(2, umaPremiacao.getColocacao());
    }

    @Test
    public void testSetColocacao() {
        umaPremiacao.setColocacao(1);
        assertEquals(umaPremiacao.getColocacao(), 1);
    }

    @Test
    public void testToString() {
        assertEquals("2º lugar - 2012 - Campeonato Mundial", umaPremiacao.toString());
    }
}