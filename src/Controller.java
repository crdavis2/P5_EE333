/*
 * File: Controller.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/20/2019 CRD - initial coding
 *
 */

import java.util.ArrayList;

/**
 * Controller Class for smart light system
 * @author Collin Davis crdavis2@uab.edu
 */
public class Controller {
    
    private int            numControllers      = 0;
    private int            numHubs             = 0;
    private int            numBulbs            = 0;
    private String         controllerName;
    private String         hubName;
    private ArrayList<Hub> hubList = new ArrayList<>();
    
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
     * @param name name of the hub to add to the system
     */
    public void addHub(String name) {
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
                hubList.get(j).addBulb(bulbName);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
///////////////////////////////Group Functionality//////////////////////////////
    /**
     * Add group to the system
     *
     * @param hubName   name of desired hub to be used
     * @param groupName name of group to be added
     */
    public void addGroup(String hubName, String groupName) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                hubList.get(j).addGroup(groupName);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Add group to the system
     *
     * @param hubName   name of desired hub to be used
     * @param groupName name of group to be added
     * @param bulbName  name of bulb to be added to group
     */
    public void addBulbToGroup(String hubName, String bulbName, 
                               String groupName) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                hubList.get(j).addBulbToGroup(bulbName, groupName);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Change the group of the bulb
     *
     * @param hubName   name of desired hub to be used
     * @param bulbName  name of bulb to be added
     * @param groupName group to which the bulb is added
     */
    public void setBulbGroup(String hubName, String bulbName, 
                                String groupName) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                hubList.get(j).setBulbGroup(bulbName, groupName);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Changes the status of all bulbs within a group
     *
     * @param hubName  name of desired hub to be used
     * @param groupName    group to which the bulb is added
     * @param state    state to which bulbs will be set
     */
    public void setGroupState(String hubName, String groupName,
                                 boolean state) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                hubList.get(j).setGroupState(groupName, state);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Changes the color of all bulbs within a group
     *
     * @param hubName  name of desired hub to be used
     * @param groupName    group to which the bulb is added
     * @param color    state to which bulbs will be set
     */
    public void setGroupColor(String hubName, String groupName,
                                 String color) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                hubList.get(j).setGroupColor(groupName, color);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Changes the brightness of all bulbs within a group
     *
     * @param hubName    name of desired hub to be used
     * @param groupName  group to which the bulb is added
     * @param brightness state to which bulbs will be set
     */
    public void setGroupBrightness(String hubName, String groupName,
                                      int brightness) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                hubList.get(j).setGroupBrightness(groupName, brightness);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
///////////////////////End of Group Functionalities/////////////////////////////
    
    /**
     * Change the state of the bulb
     *
     * @param hubName  name of desired hub to be used
     * @param bulbName name of bulb to be added
     * @param state    "on" or "off" state to be changed
     */
    public void setBulbState(String hubName, String bulbName, boolean state) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                hubList.get(j).setBulbState(bulbName, state);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Change the brightness of the bulb
     *
     * @param hubName    name of desired hub to be used
     * @param bulbName   name of bulb to be added
     * @param brightness level of brightness to be changed
     */
    public void setBulbBrightness(String hubName, String bulbName, 
                                     int brightness) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                hubList.get(j).setBulbBrightness(bulbName, brightness);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Change the color of the bulb
     *
     * @param hubName    name of desired hub to be used
     * @param bulbName   name of bulb to be added
     * @param color      color of bulb to be changed
     */
    public void setBulbColor(String hubName, String bulbName, 
                                     String color) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                hubList.get(j).setBulbColor(bulbName, color);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
}
