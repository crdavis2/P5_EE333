/*
 * File: ControllerNGTest.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 04/04/2019 CRD - initial coding
 *
 */


import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Collin Davis crdavis2@uab.edu
 */
public class ControllerNGTest {

    public ControllerNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of addhub method, of class Controller.
     */
    @Test
    public void testAddhub() {
        System.out.println("addhub");
        String name = "";
        Controller instance = null;
        instance.addhub(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBulb method, of class Controller.
     */
    @Test
    public void testAddBulb() {
        System.out.println("addBulb");
        String hubName = "";
        String bulbName = "";
        Controller instance = null;
        instance.addBulb(hubName, bulbName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeBulbState method, of class Controller.
     */
    @Test
    public void testChangeBulbState() {
        System.out.println("changeBulbState");
        String hubName = "";
        String bulbName = "";
        boolean state = false;
        Controller instance = null;
        instance.changeBulbState(hubName, bulbName, state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeBulbBrightness method, of class Controller.
     */
    @Test
    public void testChangeBulbBrightness() {
        System.out.println("changeBulbBrightness");
        String hubName = "";
        String bulbName = "";
        int brightness = 0;
        Controller instance = null;
        instance.changeBulbBrightness(hubName, bulbName, brightness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeBulbColor method, of class Controller.
     */
    @Test
    public void testChangeBulbColor() {
        System.out.println("changeBulbColor");
        String hubName = "";
        String bulbName = "";
        String color = "";
        Controller instance = null;
        instance.changeBulbColor(hubName, bulbName, color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}