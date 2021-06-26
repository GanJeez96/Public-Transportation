/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import publictransportation.models.PayPalPayment;
import publictransportation.models.Set_Of_Costs;

/**
 *
 * @author Kavindu Gayashan
 */
public class Payment_ManagerTest {
    
    
    public Payment_ManagerTest() {
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
     * Test of refreshPaymentManager method, of class Payment_Manager.
     */
    @Test
    public void testRefreshPaymentManager() {
        System.out.println("refreshPaymentManager");
        Payment_Manager instance = new Payment_Manager();
        instance.refreshPaymentManager();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class Payment_Manager.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Payment_Manager expResult = new Payment_Manager();
        Payment_Manager result = Payment_Manager.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookupCost method, of class Payment_Manager.
     */
    @Test
    public void testLookupCost() {
        System.out.println("lookupCost");
        String source = "Stop A1";
        String destination = "Stop A3";
        Payment_Manager instance = new Payment_Manager().getInstance();
        Float expResult =  13.5f;
        Float result = instance.lookupCost(source, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketPrice method, of class Payment_Manager.
     */
    @Test
    public void testGetTicketPrice() {
        System.out.println("getTicketPrice");
        String source = "Stop A1";
        String destination = "Stop A3";
        Payment_Manager instance = new Payment_Manager().getInstance();
        Float expResult = 15.0f;
        Float result = instance.getTicketPrice(source, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppliedDiscount method, of class Payment_Manager.
     */
    @Test
    public void testGetAppliedDiscount() {
        System.out.println("getAppliedDiscount");
        Payment_Manager instance = new Payment_Manager().getInstance();
        Float expResult = 10.0f;
        Float result = instance.getAppliedDiscount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validatePayment method, of class Payment_Manager.
     */
    @Test
    public void testValidatePayment() {
        System.out.println("validatePayment");
        PayPalPayment payment = null;
        Payment_Manager instance = new Payment_Manager();
        Boolean expResult = null;
        Boolean result = instance.validatePayment(payment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
