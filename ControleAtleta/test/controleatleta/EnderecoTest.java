/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatleta;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnderecoTest {

    Endereco umEndereco;
    
    @Before
    public void setUp() throws Exception {
        umEndereco = new Endereco("Quadra XYZ", "999", "Alvorada dos Anjos", "Rio de Janeiro", "RJ", "Brasil", "-", "72000-666");  
    }

    @Test
    public void testGetBairro() {
        assertEquals("Alvorada dos Anjos", umEndereco.getBairro());
    }

    @Test
    public void testSetBairro() {
        umEndereco.setBairro("Macieira");
        assertEquals(umEndereco.getBairro(), "Macieira");
    }

    @Test
    public void testGetCep() {
        assertEquals("72000-666", umEndereco.getCep());
    }

    @Test
    public void testSetCep() {
        umEndereco.setCep("798521-999");
        assertEquals(umEndereco.getCep(), "798521-999");
    }   

    @Test
    public void testGetCidade() {
        assertEquals("Rio de Janeiro", umEndereco.getCidade());
    }

    @Test
    public void testSetCidade() {
        umEndereco.setCidade("Salvador");
        assertEquals(umEndereco.getCidade(), "Salvador");
    }

    @Test
    public void testGetComplemento() {
        assertEquals("-", umEndereco.getComplemento());
    }

    @Test
    public void testSetComplemento() {
        umEndereco.setComplemento("Loja 13");
        assertEquals(umEndereco.getComplemento(), "Loja 13");
    }

    @Test
    public void testGetEstado() {
        assertEquals("RJ",umEndereco.getEstado());
    }

    @Test
    public void testSetEstado() {
        umEndereco.setEstado("BA");
        assertEquals(umEndereco.getEstado(), "BA");
    }

    @Test
    public void testGetLogradouro() {
        assertEquals("Quadra XYZ", umEndereco.getLogradouro());
    }

    @Test
    public void testSetLogradouro() {
        umEndereco.setLogradouro("Bairro Norte");
        assertEquals(umEndereco.getLogradouro(), "Bairro Norte");
    }

    @Test
    public void testGetNumero() {
        assertEquals("999", umEndereco.getNumero());
    }

    @Test
    public void testSetNumero() {
        umEndereco.setNumero("123");
        assertEquals(umEndereco.getNumero(), "123");
    }

    @Test
    public void testGetPais() {
        assertEquals("Brasil", umEndereco.getPais());
    }

    @Test
    public void testSetPais() {
        umEndereco.setPais("França");
        assertEquals(umEndereco.getPais(), "França");
    }
}
