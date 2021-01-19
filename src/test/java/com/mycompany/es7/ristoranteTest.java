/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author stefa
 */
public class ristoranteTest {
    
    public ristoranteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * 
     * Test of addMenù method, of class ristorante.
     */
    @Test
    public void testAddMenù() {
        System.out.println("addMen\u00f9");
        piatto P = null;
        ristorante instance = new ristorante();
        instance.addMenù(P);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of rmMenù method, of class ristorante.
     */
    @Test
    public void testRmMenù() {
        System.out.println("rmMen\u00f9");
        piatto P = null;
        ristorante instance = new ristorante();
        instance.rmMenù(P);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of addOrdine method, of class ristorante.
     */
    @Test
    public void testAddOrdine() {
        System.out.println("addOrdine");
        ordine O = null;
        ristorante instance = new ristorante();
        instance.addOrdine(O);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of rmOrdine method, of class ristorante.
     */
    @Test
    public void testRmOrdine() {
        System.out.println("rmOrdine");
        ordine O = null;
        ristorante instance = new ristorante();
        instance.rmOrdine(O);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Incasso method, of class ristorante.
     */
    @Test
    public void testIncasso() {
        System.out.println("Incasso");
        ristorante instance = new ristorante();
        double expResult = 0.0;
        double result = instance.Incasso();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ImpMax method, of class ristorante.
     */
    @Test
    public void testImpMax() {
        System.out.println("ImpMax");
        ristorante instance = new ristorante();
        ordine expResult = null;
        ordine result = instance.ImpMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of printls method, of class ristorante.
     */
    @Test
    public void testPrintls() {
        System.out.println("printls");
        String tipo = "";
        ristorante instance = new ristorante();
        instance.printls(tipo);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
