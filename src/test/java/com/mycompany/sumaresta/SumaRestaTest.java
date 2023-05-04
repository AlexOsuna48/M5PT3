/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.sumaresta;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumne
 */
public class SumaRestaTest {
    
    public SumaRestaTest() {
    }

    @org.junit.Test
    public void testMain() {
    }

    @Test
    public void testSuma() {
        int resultado = SumaResta.suma(2, 3);
        assertEquals(5, resultado);
    }
    
    @Test
    public void testResta() {
        int resultado = SumaResta.resta(7, 4);
        assertEquals(3, resultado);
    }
}
