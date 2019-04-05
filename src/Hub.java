/*
 * File: Hub.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/20/2019 CRD - initial coding
 *
 */

import java.util.ArrayList;

/**
 * Hub class used to control bulbs and inputs from controllers
 * @author Collin Davis crdavis2@uab.edu
 */
public class Hub {

    private String hubName;
    ArrayList<Hub> hubList = new ArrayList<Hub>();
    
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
    }
    
    public String getHubName() {
        return hubName;
    }
    
   /**
     * Add bulb to the system
     *
     * @param bulb the bulb to add to the system
     */
    public static void addBulb(String bulbName) {
        
    }
    
    

}
