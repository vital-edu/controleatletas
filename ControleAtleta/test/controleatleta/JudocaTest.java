package controleatleta;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class JudocaTest {
    Judoca umJudoca;
    ArrayList<Premiacao> umaPremiacao;
    
    @Before
    public void setUp() throws Exception {
        umJudoca = new Judoca("Joao", 'a', 'o', 150.0, 80, 60, 2, 18, "2º Dan");
    }

    @Test
    public void testGetCategoria() {
        assertEquals("a", this.umJudoca.getCategoria());
    }

    @Test
    public void testSetCategoria() {
    }

    @Test
    public void testGetTotalDerrotas() {
        assertEquals(18, this.umJudoca.getTotalDerrotas());
    }

    @Test
    public void testSetTotalDerrotas() {
    }

    @Test
    public void testGetTotalEmpates() {
        assertEquals(2, this.umJudoca.getTotalEmpates());
    }

    @Test
    public void testSetTotalEmpates() {
        
    }

    @Test
    public void testGetEnvergadura() {
        assertEquals(150.0, this.umJudoca.getEnvergadura(), 0.01);
    }

    @Test
    public void testSetEnvergadura() {
    }

    @Test
    public void testGetEstilo() {
        assertEquals("o", this.umJudoca.getEstilo());
    }

    @Test
    public void testSetEstilo() {
    }

    @Test
    public void testGetTotalLutas() {
        assertEquals(80, this.umJudoca.getTotalLutas());
    }

    @Test
    public void testSetTotalLutas() {
        
    }

    @Test
    public void testGetTotalVitorias() {
        assertEquals(40, this.umJudoca.getTotalVitorias();
    }

    @Test
    public void testSetTotalVitorias() {
    }

    @Test
    public void testObterCategoriaPesoNome_0args() {
        
    }

    @Test
    public void testObterCategoriaPesoNome_char_double() {
        
    }

    @Test
    public void testGetGraduaçao() {
    }

    @Test
    public void testSetGraduaçao() {
    }
}
