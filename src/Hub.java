/*
 * File: Hub.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/20/2019 CRD - initial coding
 *
 */


/**
 * Hub class used to control bulbs and inputs from controllers
 * @author Collin Davis crdavis2@uab.edu
 */
public class Hub {
    
    private static final int MAX_CONTROLLERS = 5;
    private static final int MAX_BULBS       = 20;
    
    private String       hubName;
    private Controller[] controllers;
    private Bulb[]       bulbs;
    private int          numControllers      = 0;
    private int          numBulbs            = 0;
    
    /**
     * Constructor for objects of class Hub with name
     * 
     * @param name text for name. If null, the hub name will
     * be set to "New hub"
     *
     */
    public Hub (String name) {
        if (name == null) {
            hubName = "New hub";
        } else {
            hubName = name;
        }
        controllers = new Controller[MAX_CONTROLLERS];
        bulbs = new Bulb[MAX_BULBS];
    }
    
    /**
     * Add bulb to the system
     *
     * @param bulb the bulb to add to the system
     */
    public void addBulb(Bulb bulb) {
        if (numBulbs < MAX_BULBS) {
            bulbs[numBulbs] = bulb;
            numBulbs++;
        } else {
            // error handling
        }
        
    }
    
    /**
     * Add controller to the system
     *
     * @param controller the controller to add to the system
     */
    public void addController(Controller controller) {
        if (numControllers < MAX_CONTROLLERS) {
            controllers[numControllers] = controller;
            numBulbs++;
        }
    }

}
