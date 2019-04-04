/*
 * File: Controller.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/20/2019 CRD - initial coding
 *
 */


/**
 *
 * @author Collin Davis crdavis2@uab.edu
 */
public class Controller {
    
    private Hub[]        hubs;
    private Bulb[]       bulbs;
    private int          numControllers      = 0;
    private int          numBulbs            = 0;
    private String       controllerName;
    
    /**
     * Constructor for objects of class Controller with name
     * 
     * @param name text for name. If null, the controller name will
     * be set to "New controller"
     *
     */
    public Controller (String name) {
        if (name == null) {
            controllerName = "New controller";
        } else {
            controllerName = name;
        }

    }
    
/**
     * Add bulb to the system
     *
     * @param bulb the bulb to add to the system
     */
    public void addBulb(Bulb bulb) {
        bulbs[numBulbs] = bulb;
        numBulbs++;
    }
    
}
