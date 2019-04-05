/*
 * File: Controller.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/20/2019 CRD - initial coding
 *
 */

import java.util.ArrayList;

/**
 *
 * @author Collin Davis crdavis2@uab.edu
 */
public class Controller {
    
    private Hub[]        hubs;
    private Bulb[]       bulbs;
    private int          numControllers      = 0;
    private int          numHubs             = 0;
    private int          numBulbs            = 0;
    private String       controllerName;
    private String       hubName;
    ArrayList<Hub> hubList = new ArrayList<Hub>();
    
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
     * Add hub to the system
     *
     * @param hub the hub to add to the system
     */
    public void addhub(String name) {
        Hub hub = new Hub(name);
        hubList.add(hub);
    }
    
    /**
     * Add bulb to the system
     *
     * @param hubName name of desired hub to be used
     * @param bulbName name of bulb to be added
     */
    public void addBulb(String hubName, String bulbName) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                Hub.addBulb(bulbName);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
}
