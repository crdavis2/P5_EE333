/*
 * File: BulbNGTest.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 04/04/2019 CRD - initial coding
 *
 * Credits:  (if any for sections of code)
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Collin Davis crdavis2@uab.edu
 */
public class BulbNGTest {

    public BulbNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of setState method, of class Bulb.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        boolean state = false;
        Bulb.setState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class Bulb.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Bulb instance = null;
        boolean expResult = false;
        boolean result = instance.getState();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBrightness method, of class Bulb.
     */
    @Test
    public void testSetBrightness() {
        System.out.println("setBrightness");
        int brightness = 0;
        Bulb.setBrightness(brightness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrightness method, of class Bulb.
     */
    @Test
    public void testGetBrightness() {
        System.out.println("getBrightness");
        Bulb instance = null;
        int expResult = 0;
        int result = instance.getBrightness();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Bulb.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        Bulb.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Bulb.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Bulb instance = null;
        String expResult = "";
        String result = instance.getColor();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBulbName method, of class Bulb.
     */
    @Test
    public void testGetBulbName() {
        System.out.println("getBulbName");
        Bulb instance = null;
        String expResult = "";
        String result = instance.getBulbName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBulbID method, of class Bulb.
     */
    @Test
    public void testGetBulbID() {
        System.out.println("getBulbID");
        Bulb instance = null;
        String expResult = "";
        String result = instance.getBulbID();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}