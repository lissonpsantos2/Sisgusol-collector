/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgusol.Xtras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lisso
 */
public class PreferenciasTest {
    
    public PreferenciasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPortName method, of class Preferencias.
     */
    @Test
    public void testGetPortName() {
        System.out.println("getPortName");
        Preferencias instance = new Preferencias();
        String expResult = null;
        String result = instance.getPortName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBaudRate method, of class Preferencias.
     */
    @Test
    public void testGetBaudRate() {
        System.out.println("getBaudRate");
        Preferencias instance = new Preferencias();
        Integer expResult = null;
        Integer result = instance.getBaudRate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIpDoBD method, of class Preferencias.
     */
    @Test
    public void testGetIpDoBD() {
        System.out.println("getIpDoBD");
        Preferencias instance = new Preferencias();
        String expResult = null;
        String result = instance.getIpDoBD();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNomeDoBD method, of class Preferencias.
     */
    @Test
    public void testGetNomeDoBD() {
        System.out.println("getNomeDoBD");
        Preferencias instance = new Preferencias();
        String expResult = null;
        String result = instance.getNomeDoBD();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsuario method, of class Preferencias.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Preferencias instance = new Preferencias();
        String expResult = null;
        String result = instance.getUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSenha method, of class Preferencias.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Preferencias instance = new Preferencias();
        String expResult = null;
        String result = instance.getSenha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPortName method, of class Preferencias.
     */
    @Test
    public void testSetPortName() {
        System.out.println("setPortName");
        String aPortName = "";
        Preferencias instance = new Preferencias();
        instance.setPortName(aPortName);
    }

    /**
     * Test of setBaudRate method, of class Preferencias.
     */
    @Test
    public void testSetBaudRate() {
        System.out.println("setBaudRate");
        Integer aBaudRate = null;
        Preferencias instance = new Preferencias();
        instance.setBaudRate(aBaudRate);
    }

    /**
     * Test of setIpDoBD method, of class Preferencias.
     */
    @Test
    public void testSetIpDoBD() {
        System.out.println("setIpDoBD");
        String aIpDoBD = "";
        Preferencias instance = new Preferencias();
        instance.setIpDoBD(aIpDoBD);
    }

    /**
     * Test of setNomeDoBD method, of class Preferencias.
     */
    @Test
    public void testSetNomeDoBD() {
        System.out.println("setNomeDoBD");
        String aNomeDoBD = "";
        Preferencias instance = new Preferencias();
        instance.setNomeDoBD(aNomeDoBD);
    }

    /**
     * Test of setUsuario method, of class Preferencias.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String aUsuario = "";
        Preferencias instance = new Preferencias();
        instance.setUsuario(aUsuario);
    }

    /**
     * Test of setSenha method, of class Preferencias.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String aSenha = "";
        Preferencias instance = new Preferencias();
        instance.setSenha(aSenha);
    }
    
}
