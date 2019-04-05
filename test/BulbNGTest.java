/*
 * File: BulbNGTest.java
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
public class BulbNGTest {

    private Bulb b1;
    private Bulb b2;
    private Bulb b3;
    
    public BulbNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        b1 = new Bulb("TestBulb01");
        b2 = new Bulb("TestBulb02");
        b3 = new Bulb("TestBulb03");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getState method, of class Bulb.
     * Indirect test of setState method, of class Bulb
     */
    @Test
    public void testGetState() {
        b1.setState(true);
        b2.setState(false);
        
        assertTrue(b1.getState() == true);
        assertTrue(b2.getState() == false);
        // default setting is "off" (false)
        assertTrue(b3.getState() == false);
    }

    /**
     * Test of getBrightness method, of class Bulb.
     * Indirect test of setBrightness method, of class Bulb
     */
    @Test
    public void testGetBrightness() {
        b1.setBrightness(90);
        b2.setBrightness(-6);
        
        assertEquals(b1.getBrightness(), 90);
        assertEquals(b2.getBrightness(), 0);
        // default setting is 100 (max brightness)
        assertEquals(b3.getBrightness(), 100);
    }

    /**
     * Test of getColor method, of class Bulb.
     */
    @Test
    public void testGetColor() {
        b1.setColor("red");
        b2.setColor("BluE");
        
        assertEquals(b1.getColor(), "RED");
        assertEquals(b2.getColor(), "BLUE");
        // default setting is white 
        assertEquals(b3.getColor(), "WHITE");
    }

    /**
     * Test of getBulbName method, of class Bulb.
     */
    @Test
    public void testGetBulbName() {
        assertEquals(b1.getBulbName(), "TestBulb01");
        assertEquals(b2.getBulbName(), "TestBulb02");
        
        String newBulbName = "ChangedNameTestBulb03";
        b2.setBulbName(newBulbName);
        assertEquals(b2.getBulbName(), "ChangedNameTestBulb03");
    }

    /**
     * Test of getBulbID method, of class Bulb.
     */
    @Test
    public void testGetBulbID() {
        assertEquals(b1.getBulbID(), "Bulb-01");
        assertEquals(b2.getBulbID(), "Bulb-02");
        assertEquals(b3.getBulbID(), "Bulb-03");
    }

}