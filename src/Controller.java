/*
 * File: Controller.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/20/2019 CRD - initial coding
 *
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Controller Class for smart light system
 * @author Collin Davis crdavis2@uab.edu
 */
public class Controller {
<<<<<<< HEAD

=======
    
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
    private int            numControllers      = 0;
    private int            numHubs             = 0;
    private int            numBulbs            = 0;
    private String         controllerName;
    private String         hubName;
<<<<<<< HEAD
    private List<Hub>      hubList             = new ArrayList<Hub>();
    private Hub            hub                 = new Hub("hub-1");


=======
    private ArrayList<Hub> hubList = new ArrayList<>();
    
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
    /**
     * Constructor for objects of class Controller with name
     *
     * @param name text for name. If null, the controller name will
     * be set to "New controller"
     *
     */
    public Controller(String name) {
        if (name == null) {
            controllerName = "New controller";
        } else {
            controllerName = name;
        }
    }

    /**
     * Add hub to the system
     *
     * @param hubName name of the hub to add to the system
     */
    public void addHub(String hubName) {
        Hub hub = new Hub(hubName);
        hubList.add(hub);
    }


    /**
     * Add bulb to the system
     *
     * @param bulbName name of the bulb to add to the system
     */
<<<<<<< HEAD
    public void addBulb(String bulbName) {
        this.hub.addBulb(bulbName);
    }

///////////////////////////////Group Functionality//////////////////////////////
    /**
     * Add group to the system
     *
     * @param groupName name of group to be added
     */
    public void addGroup(String groupName) {
        this.hub.addGroup(groupName);
    }

    /**
     * Add group to the system
     *
     * @param groupName name of group to be added
     * @param bulbName  name of bulb to be added to group
     */
    public void addBulbToGroup(String bulbName, String groupName) {
        this.hub.addBulbToGroup(bulbName, groupName);
    }

    /**
     * Change the group of the bulb
     *
     * @param bulbName  name of bulb to be added
     * @param groupName group to which the bulb is added
     */
    public void setBulbGroup(String bulbName, String groupName) {
        this.hub.setBulbGroup(bulbName, groupName);
    }

    /**
     * Changes the status of all bulbs within a group
     *
     * @param groupName    group to which the bulb is added
     * @param state    state to which bulbs will be set
     */
    public void setGroupState(String groupName, boolean state) {
        this.hub.setGroupState(groupName, state);
    }

    /**
     * Changes the color of all bulbs within a group
     *
     * @param groupName    group to which the bulb is added
     * @param color    state to which bulbs will be set
     */
    public void setGroupColor(String groupName, String color) {
        this.hub.setGroupColor(groupName, color);
    }

    /**
     * Changes the brightness of all bulbs within a group
     *
     * @param groupName  group to which the bulb is added
     * @param brightness state to which bulbs will be set
     */
    public void setGroupBrightness(String groupName, int brightness) {
        this.hub.setGroupBrightness(groupName, brightness);
    }
///////////////////////End of Group Functionalities/////////////////////////////

=======
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
    
    /**
     * Change the state of the system to Emergency
     *
     * @param hubName  name of desired hub to be used
     * @param state    "active" or "inactive" state of alert
     */
    public void setEmergency(String hubName, boolean state) {
        int i;
        int j = 0;
        
        for (i=0; i<= hubList.size(); i++) {
            if ( hubName.equals( hubList.get(j).getHubName() ) ) {
                hubList.get(j).setEmergency(state);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
///////////////////////End of Group Functionalities/////////////////////////////
    
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
    /**
     * Change the state of the bulb
     *
     * @param bulbName name of bulb to be added
     * @param state    "on" or "off" state to be changed
     */
<<<<<<< HEAD
    public void setBulbState(String bulbName, boolean state) {
        this.hub.setBulbState(bulbName, state);
=======
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
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
    }

    /**
     * Change the brightness of the bulb
     *
     * @param bulbName   name of bulb to be added
     * @param brightness level of brightness to be changed
     */
<<<<<<< HEAD
    public void setBulbBrightness(String bulbName, int brightness) {
        this.hub.setBulbBrightness(bulbName, brightness);
=======
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
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
    }

    /**
     * Change the color of the bulb
     *
     * @param bulbName   name of bulb to be added
     * @param color      color of bulb to be changed
     */
<<<<<<< HEAD
    public void setBulbColor(String bulbName, String color) {
        this.hub.setBulbColor(bulbName, color);
=======
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
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
    }
    

    /**
     * Return the Hub object
     *
     * @return returns Hub object
     */
    public Hub getHub() {
        return this.hub;
    }


    /**
     * Return the Bulb object
     *
     * @param index index of object to be pulled
     * @return returns bulb object
     */
    public Bulb getBulb(int index) {
        return this.hub.getBulb(index);
    }

}
