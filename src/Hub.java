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
    static ArrayList<Bulb> bulbList = new ArrayList<Bulb>();
    
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
     * @param bulbName name of the bulb to add to the system
     */
    public static void addBulb(String bulbName) {
        Bulb bulb = new Bulb(bulbName);
        bulbList.add(bulb);
    }
    
    /**
     * Change state of bulb
     *
     * @param bulbName name of the bulb to add to the system
     * @param state    "on" or "off" state to be changed
     */
    public static void changeState(String bulbName, boolean state) {
        int i;
        int j = 0;
        
        for (i=0; i<= bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(j).getBulbName() ) ) {
                bulbList.get(j).setState(state);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Change color of bulb
     *
     * @param bulbName   current name of the bulb 
     * @param newName    new name for the bulb
     */
    public static void changeBulbName(String bulbName, String newName) {
        int i;
        int j = 0;
        
        for (i=0; i<= bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(j).getBulbName() ) ) {
                bulbList.get(j).setBulbName(newName);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Change name of bulb
     *
     * @param bulbName    name of the bulb
     * @param brightness  brightness of the bulb
     */
    public static void changeBrightness(String bulbName, int brightness) {
        int i;
        int j = 0;
        
        for (i=0; i<= bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(j).getBulbName() ) ) {
                bulbList.get(j).setBrightness(brightness);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Change color of bulb
     *
     * @param bulbName   name of the bulb 
     * @param color      color level of the bulb
     */
    public static void changeColor(String bulbName, String color) {
        int i;
        int j = 0;
        
        for (i=0; i<= bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(j).getBulbName() ) ) {
                bulbList.get(j).setColor(color);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    

}
