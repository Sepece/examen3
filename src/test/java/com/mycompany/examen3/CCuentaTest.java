/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.examen3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author persona
 */
public class CCuentaTest {
    
    public CCuentaTest() {
    }
    
    /**
     * Test of ingresar method, of class CCuenta.
     */
    @Test
    public void testIngresar_1() {
        System.out.println("Camino 1, evaluación a true");
        double cantidad = -100.0d;
        CCuenta instance = new CCuenta();
        int expResult = 1;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    @Test
    public void testIngresar_2() {
        System.out.println("Camino 1, evaluación a false");
        double cantidad = 100.0d;
        CCuenta instance = new CCuenta();
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testIngresar_3() {
        System.out.println("Camino 2, evaluación a true");
        double cantidad = 3000.0d;
        CCuenta instance = new CCuenta();
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testIngresar_4() {
        System.out.println("Camino 2, evaluación a false");
        double cantidad = 2000.0d;
        CCuenta instance = new CCuenta();
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testIngresar_5() {
        System.out.println("Camino 3, evaluación a true");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    
}
