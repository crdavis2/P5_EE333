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

    Controller c1;
    
    public ControllerNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        c1 = new Controller("TestController01");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }


    /**
     * Test of changeBulbState method, of class Controller.
     */
    @Test
    public void testChangeBulbState() {
        c1.addHub("TestHub01");
        c1.addBulb("TestHub01", "TestBulb01");
        c1.changeBulbBrightness("TestHub01", "TestBulb01", 10);
        // assertEquals(b1.getBrightness(), 10);
    }

    /**
     * Test of changeBulbBrightness method, of class Controller.
     */
    @Test
    public void testChangeBulbBrightness() {
        
    }

    /**
     * Test of changeBulbColor method, of class Controller.
     */
    @Test
    public void testChangeBulbColor() {
        
    }

}