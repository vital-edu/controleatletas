package controleatleta;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AtletaTest {
    
    Atleta umAtleta;
    Endereco umEndereco;
    Date nascimento;
    ArrayList <String> umTelefone;
    
    @Before
    public void setUp() throws Exception {
        umEndereco = new Endereco("Quadra X", "666", "Alvorada", "Sao Paulo", "SP", "Brasil", "-", "72000-000");
        nascimento = new Date(1964, 04, 10);
        umTelefone = new ArrayList <String>();
        umTelefone.add("1000-0001");
        umTelefone.add("6666-6666");
         
        umAtleta = new Atleta(umTelefone, "Aurelio", nascimento, umEndereco, 1.75, 95.5, "Joao", "Maria", 'M', "3.000.300", "001.000.110-10");
    }

    @Test
    public void testGetAltura() {
        assertEquals(1.75, umAtleta.getAltura(),0.01);
    }

    @Test
    public void testSetAltura() {
        umAtleta.setAltura(1.50);
        assertEquals(umAtleta.getAltura(), 1.50, 0.1);
    }

    @Test
    public void testGetCpf() {
        assertEquals("001.000.110-10",umAtleta.getCpf());
    }

    @Test
    public void testSetCpf() {
        umAtleta.setCpf("123.456.789-89");
        assertEquals(umAtleta.getCpf(),"123.456.789-89");
    }

    @Test
    public void testGetDataNascimento() {
        Date mesmaData = new Date(1964, 04, 10);
        assertEquals(mesmaData, umAtleta.getDataNascimento());
    }

    @Test
    public void testSetDataNascimento() {
        Date novaDataNascimento = new Date(1989, 01,31);
        umAtleta.setDataNascimento(novaDataNascimento);       
        assertEquals(umAtleta.getDataNascimento(),novaDataNascimento);
    }

    @Test
    public void testGetEndereco() {
        Endereco mesmoEndereco;
        mesmoEndereco = new Endereco("Quadra X", "666", "Alvorada", "Sao Paulo", "SP", "Brasil", "-", "72000-000");
        mesmoEndereco = umEndereco;   //???
        //System.out.println(umAtleta + "<><><><><>"+ umAtleta.getEndereco());
        assertEquals(mesmoEndereco, umAtleta.getEndereco());
        
    }

    @Test
    public void testSetEndereco() {
        Endereco novoEndereco = new Endereco("Quadra X", "666", "Alvorada", "Sao Paulo", "SP", "Brasil", "-", "72000-000");
        umAtleta.setEndereco(novoEndereco);
     
        assertEquals(novoEndereco, umAtleta.getEndereco());
    }

    @Test
    public void testGetNome() {
        assertEquals("Aurelio",umAtleta.getNome());
    }

    @Test
    public void testSetNome() {
        umAtleta.setNome("Gilberto");
        assertEquals(umAtleta.getNome(),"Gilberto");
    }

    @Test
    public void testGetNomeMae() {
        assertEquals("Maria", umAtleta.getNomeMae());
    }

    @Test
    public void testSetNomeMae() {
        umAtleta.setNomeMae("Sara");
        assertEquals(umAtleta.getNomeMae(),"Sara");
    }

    @Test
    public void testGetNomePai() {
        assertEquals("Joao", umAtleta.getNomePai());
    }

    @Test
    public void testSetNomePai() {
        umAtleta.setNomePai("Rodrigo");
        assertEquals(umAtleta.getNomePai(),"Rodrigo");
    }

    @Test
    public void testGetPeso() {
        assertEquals(95.5, umAtleta.getPeso(),0.5);
    }

    @Test
    public void testSetPeso() {
        umAtleta.setPeso(78.5);
        assertEquals(umAtleta.getPeso(),78.5,0.1);
    }

    @Test
    public void testGetRg() {
        assertEquals("3.000.300", umAtleta.getRg());
    }

    @Test
    public void testSetRg() {
        umAtleta.setRg("950.120.100");
        assertEquals(umAtleta.getRg(),"950.120.100");
    }

    @Test
    public void testGetSexo() {
        assertEquals('M',umAtleta.getSexo());
    }

    @Test
    public void testSetSexo() {
        umAtleta.setSexo('f');
        assertEquals(umAtleta.getSexo(),'f');
    }

    @Test
    public void testGetTelefones() {
        ArrayList <String> mesmosTelefones = new ArrayList<String>();
        mesmosTelefones.add("1000-0001");
        mesmosTelefones.add("6666-6666");
        assertEquals(mesmosTelefones, umAtleta.getTelefones());
    }

    @Test
    public void testSetTelefones() {
        ArrayList <String> novosTelefones = new ArrayList <String>();
        novosTelefones.add("9644-2875");
        novosTelefones.add("8597-2101");
        umAtleta.setTelefones(novosTelefones);
        assertEquals(umAtleta.getTelefones(),novosTelefones);
    }
}