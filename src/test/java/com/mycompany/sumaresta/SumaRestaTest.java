/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.sumaresta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumne
 */
public class SumaRestaTest {
    
    public SumaRestaTest() {
    }

    @org.junit.jupiter.api.Test
    public void testMain() {
    }

    @org.junit.jupiter.api.Test
    public void testSuma() {
    }

    @org.junit.jupiter.api.Test
    public void testResta() {
    }

    @Test
    public void testMultiplicacion() {
        int resultado = SumaResta.multiplicacion(4, 7);
        assertEquals(24, resultado);
    }

    @org.junit.jupiter.api.Test
    public void testDivision() {
        int resultado = SumaResta.division(10, 5);
        assertEquals(2, resultado);
    }
    
    
}
