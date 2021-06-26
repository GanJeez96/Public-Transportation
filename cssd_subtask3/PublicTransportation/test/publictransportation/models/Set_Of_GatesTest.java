/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gangesh
 */
public class Set_Of_GatesTest {
    
    public Set_Of_GatesTest() {
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
     * Test of getGatesID method, of class Set_Of_Gates.
     */
    @Test
    public void testGetGatesID() {
        System.out.println("getGatesID");
        Set_Of_Gates instance = new Set_Of_Gates();
        String expResult = "";
        String result = instance.getGatesID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStopID method, of class Set_Of_Gates.
     */
    @Test
    public void testGetStopID() {
        System.out.println("getStopID");
        Set_Of_Gates instance = new Set_Of_Gates();
        String expResult = "";
        String result = instance.getStopID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGate method, of class Set_Of_Gates.
     */
    @Test
    public void testAddGate() {
        System.out.println("addGate");
        Gate g = null;
        Set_Of_Gates instance = new Set_Of_Gates();
        instance.addGate(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGate method, of class Set_Of_Gates.
     */
    @Test
    public void testRemoveGate() {
        System.out.println("removeGate");
        String gateid = "";
        Set_Of_Gates instance = new Set_Of_Gates();
        instance.removeGate(gateid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGates method, of class Set_Of_Gates.
     */
    @Test
    public void testGetGates() {
        System.out.println("getGates");
        Set_Of_Gates instance = new Set_Of_Gates();
        ArrayList<Gate> expResult = null;
        ArrayList<Gate> result = instance.getGates();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
