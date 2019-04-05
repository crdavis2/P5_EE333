/*
 * File: HubNGTest.java
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
public class HubNGTest {

    public HubNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getHubName method, of class Hub.
     */
    @Test
    public void testGetHubName() {
        System.out.println("getHubName");
        Hub instance = null;
        String expResult = "";
        String result = instance.getHubName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBulb method, of class Hub.
     */
    @Test
    public void testAddBulb() {
        System.out.println("addBulb");
        String bulbName = "";
        Hub.addBulb(bulbName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeState method, of class Hub.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        String bulbName = "";
        boolean state = false;
        Hub.changeState(bulbName, state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeBrightness method, of class Hub.
     */
    @Test
    public void testChangeBrightness() {
        System.out.println("changeBrightness");
        String bulbName = "";
        int brightness = 0;
        Hub.changeBrightness(bulbName, brightness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeColor method, of class Hub.
     */
    @Test
    public void testChangeColor() {
        System.out.println("changeColor");
        String bulbName = "";
        String color = "";
        Hub.changeColor(bulbName, color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}