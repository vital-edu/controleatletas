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
        umJudoca = new Judoca('a', 'o', 150.0, 80, 60, 2, 18, "2º Dan", "Joao", 'm',"Preta");
    }

    @Test
    public void testGetCategoria() {
        assertEquals('a', this.umJudoca.getCategoria());
    }

    @Test
    public void testSetCategoria() {
        umJudoca.setCategoria('A');
        assertEquals(umJudoca.getCategoria(), 'A');


    }

    @Test
    public void testGetTotalDerrotas() {
        assertEquals(18, this.umJudoca.getTotalDerrotas());
    }

    @Test
    public void testSetTotalDerrotas() {
        umJudoca.setTotalDerrotas(80);
        assertEquals(umJudoca.getTotalDerrotas(), 80);
    }

    @Test
    public void testGetTotalEmpates() {
        assertEquals(2, this.umJudoca.getTotalEmpates());
    }

    @Test
    public void testSetTotalEmpates() {
        umJudoca.setTotalEmpates(0);
        assertEquals(umJudoca.getTotalEmpates(), 0);

    }

    @Test
    public void testGetEnvergadura() {
        assertEquals(150.0, this.umJudoca.getEnvergadura(), 0.01);
    }

    @Test
    public void testSetEnvergadura() {
        umJudoca.setEnvergadura(100.0);
        assertEquals(umJudoca.getEnvergadura(), 100.0, 0.01);
    }

    @Test
    public void testGetEstilo() {
        assertEquals('o', this.umJudoca.getEstilo());
    }

    @Test
    public void testSetEstilo() {
        umJudoca.setEstilo('d');
        assertEquals(umJudoca.getEstilo(), 'd');
    }

    @Test
    public void testGetTotalLutas() {
        assertEquals(80, this.umJudoca.getTotalLutas());
    }

    @Test
    public void testSetTotalLutas() {
        umJudoca.setTotalLutas(100);
        assertEquals(umJudoca.getTotalLutas(), 100);
    }

    @Test
    public void testGetTotalVitorias() {
        assertEquals(60, this.umJudoca.getTotalVitorias());
    }

    @Test
    public void testSetTotalVitorias() {
        umJudoca.setTotalVitorias(13);
        assertEquals(umJudoca.getTotalVitorias(), 13);
    }

    @Test
    public void testObterCategoriaPesoNome_0args() {
        assertEquals("Ligeiro", Judoca.obterCategoriaPesoNome('M', 60.0));
    }

    @Test
    public void testObterCategoriaPesoNome_char_double() {
        assertEquals("Meio Medio", Judoca.obterCategoriaPesoNome('F', 60.0));

    }

    @Test
    public void testGetGraduaçao() {
        assertEquals("2º Dan", umJudoca.getGraduacao());
    }

    @Test
    public void testSetGraduaçao() {
        umJudoca.setGraduacao("10º Dan");
        assertEquals(umJudoca.getGraduacao(), "10º Dan");
    }
}
