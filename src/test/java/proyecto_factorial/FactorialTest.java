/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proyecto_factorial;

import java.util.InputMismatchException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author skril
 */
public class FactorialTest {
    
    public FactorialTest() {
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
     * Test of factorial method, of class Factorial.
     */
    @Test
    public void testFactorialHappyPath0() throws Exception {
        System.out.println("testFactorialHappyPath0");
        byte n = 5;
        Factorial instance = new Factorial();
        float expResult = 120.0F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testFactorialNumeroNegativo() throws Exception {
        System.out.println("testFactorialNumeroNegativo");
        byte n = -4;
        Factorial instance = new Factorial();
        float expResult = 1.0F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testFactorialInputMissmatchException() throws InputMismatchException, Exception {
        System.out.println("testFactorialNumeroNegativo");
        byte n = 20;
        Factorial instance = new Factorial();
        float expResult = 2432902023163674600.000000F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
