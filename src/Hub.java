/*
 * File: Hub.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/20/2019 CRD - initial coding
 *
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Hub class used to control bulbs and inputs from controllers
 * @author Collin Davis crdavis2@uab.edu
 */
public class Hub {

<<<<<<< HEAD
    private String      hubName;
    private List<Bulb>  bulbList       = new ArrayList<Bulb>();
    private List<Group> groupList      = new ArrayList<Group>();
    private int         bulbCount      = 0;


=======
    private String           hubName;
    private ArrayList<Bulb>  bulbList       = new ArrayList<>();
    private ArrayList<Group> groupList      = new ArrayList<>();
    private boolean          emergencyState = false;

    
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
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

    /**
     * Get name of hub
     *
     * @return name of hub
     */
    public String getHubName() {
        return hubName;
    }

   /**
     * Add bulb to the system
     *
     * @param bulbName name of the bulb to add to the system
     */
    public void addBulb(String bulbName) {
<<<<<<< HEAD
        Bulb bulb = new Bulb(bulbName, ++bulbCount);
=======
        Bulb bulb = new Bulb(bulbName);
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
        bulbList.add(bulb);
    }


    public List<Bulb> getBulbList() {
        return this.bulbList;
    }

    /**
     * Add group to the system
     *
     * @param groupName name of the group to add to the system
     */
    public void addGroup(String groupName) {
        Group group = new Group(groupName);
        groupList.add(group);
    }

    /**
     * Add bulb to the specified group
     *
     * @param bulbName  name of the bulb to add to the system
     * @param groupName name of the group to which the bulb is added
     */
    public void addBulbToGroup(String bulbName, String groupName) {
        int i;

        for (i=0; i< bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(i).getBulbName() ) ) {
                bulbList.get(i).setGroup(groupName);
            } else {
                // desired hub not found yet
            }
        }
    }

    /**
     * Change group of bulb
     *
     * @param bulbName     name of the bulb to add to the system
     * @param newGroupName new group to which the bulb is added
     */
    public void setBulbGroup(String bulbName, String newGroupName) {
        int i;

        for (i=0; i< bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(i).getBulbName() ) ) {
                bulbList.get(i).setGroup(newGroupName);
            } else {
                // desired hub not found yet
            }
        }
    }

    /**
     * Add group to the system
     *
     * @param groupName name of the group to add to the system
     */
    public void addGroup(String groupName) {
        Group group = new Group(groupName);
        groupList.add(group);
    }
    
    /**
     * Add bulb to the specified group
     *
     * @param bulbName  name of the bulb to add to the system
     * @param groupName name of the group to which the bulb is added
     */
    public void addBulbToGroup(String bulbName, String groupName) {
        int i;
        int j = 0;
        
        for (i=0; i<= bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(j).getBulbName() ) ) {
                bulbList.get(j).setGroup(groupName);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Change group of bulb
     *
     * @param bulbName     name of the bulb to add to the system
     * @param newGroupName new group to which the bulb is added
     */
    public void setBulbGroup(String bulbName, String newGroupName) {
        int i;
        int j = 0;
        
        for (i=0; i<= bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(j).getBulbName() ) ) {
                bulbList.get(j).setGroup(newGroupName);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Change state of bulb
     *
     * @param bulbName name of the bulb to add to the system
     * @param state    "on" or "off" state to be changed
     */
    public void setBulbState(String bulbName, boolean state) {
<<<<<<< HEAD
        int i;

        for (i=0; i< bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(i).getBulbName() ) ) {
                bulbList.get(i).setState(state);
            } else {
                // desired bulb not found yet
            }
        }
    }

    /**
     * Change state of all bulbs within a group
     *
     * @param groupName name of the group to edit
     * @param state     "on" or "off" state to be changed
     */
    public void setGroupState(String groupName, boolean state) {
=======
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
        int i;

        for (i=0; i< bulbList.size(); i++) {
            if ( groupName.equals( bulbList.get(i).getGroup() ) ) {
                bulbList.get(i).setState(state);
            } else {
                // desired hub not found yet
            }
        }
    }

    /**
<<<<<<< HEAD
=======
     * Change state of all bulbs within a group
     *
     * @param groupName name of the group to edit
     * @param state     "on" or "off" state to be changed
     */
    public void setGroupState(String groupName, boolean state) {
        int i;
        int j = 0;
        
        for (i=0; i<= bulbList.size(); i++) {
            if ( groupName.equals( bulbList.get(j).getGroup() ) ) {
                bulbList.get(j).setState(state);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
     * Change color of all bulbs within a group
     *
     * @param groupName name of the group to edit
     * @param color     color of bulb
     */
    public void setGroupColor(String groupName, String color) {
        int i;
<<<<<<< HEAD

        for (i=0; i< bulbList.size(); i++) {
            if ( groupName.equals( bulbList.get(i).getGroup() ) ) {
                bulbList.get(i).setColor(color);
                
            } else {
                // desired bulb not found yet
                
            }
            
        }
    }

    /**
     * Change brightness of all bulbs within a group
=======
        int j = 0;
        
        for (i=0; i<= bulbList.size(); i++) {
            if ( groupName.equals( bulbList.get(j).getGroup() ) ) {
                bulbList.get(j).setColor(color);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Change brightness of all bulbs within a group
     *
     * @param groupName  name of the group to edit
     * @param brightness brightness of bulb
     */
    public void setGroupBrightness(String groupName, int brightness) {
        int i;
        int j = 0;
        
        for (i=0; i<= bulbList.size(); i++) {
            if ( groupName.equals( bulbList.get(j).getGroup() ) ) {
                bulbList.get(j).setBrightness(brightness);
            } else {
                // desired hub not found yet
                j++;
            }
        }
    }
    
    /**
     * Change name of bulb
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a
     *
     * @param groupName  name of the group to edit
     * @param brightness brightness of bulb
     */
    public void setGroupBrightness(String groupName, int brightness) {
        int i;

        for (i=0; i< bulbList.size(); i++) {
            if ( groupName.equals( bulbList.get(i).getGroup() ) ) {
                bulbList.get(i).setBrightness(brightness);
            } else {
                // desired bulb not found yet
            }
        }
    }

    /**
     * Change name of bulb
     *
     * @param bulbName   current name of the bulb
     * @param newName    new name for the bulb
     */
    public void setBulbName(String bulbName, String newName) {
        int i;

        for (i=0; i< bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(i).getBulbName() ) ) {
                bulbList.get(i).setBulbName(newName);
            } else {
                // desired bulb not found yet
            }
        }
    }

    /**
     * Change name of bulb
     *
     * @param bulbName    name of the bulb
     * @param brightness  brightness of the bulb
     */
    public void setBulbBrightness(String bulbName, int brightness) {
        int i;

        for (i=0; i< bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(i).getBulbName() ) ) {
                bulbList.get(i).setBrightness(brightness);
            } else {
                // desired bulb not found yet
            }
        }
    }

    /**
     * Change color of bulb
     *
     * @param bulbName   name of the bulb
     * @param color      color level of the bulb
     */
    public void setBulbColor(String bulbName, String color) {
        int i;

        for (i=0; i< bulbList.size(); i++) {
            if ( bulbName.equals( bulbList.get(i).getBulbName() ) ) {
                bulbList.get(i).setColor(color);
            } else {
                // desired bulb not found yet
            }
        }
    }
<<<<<<< HEAD

    /**
     * Return the Bulb object
     *
     * @param index index of object to be pulled
     * @return returns bulb object
     */
    public Bulb getBulb(int index) {
        return this.bulbList.get(index);
    }
=======
    
    
   /**
     * Change brightness of all bulbs within a group
     *
     * @param state "active" or "inactive" state of alert
     */
    public void setEmergency(boolean state) {
        int i;
        ArrayList<Bulb>  preEmergencyBulbList = new ArrayList<>();
        
        if ((emergencyState == false) && (state == true)) {
            preEmergencyBulbList = bulbList;
            for (i=0; i <= bulbList.size(); i++) {
                bulbList.get(i).setEmergency();
            }
        } else if ((emergencyState == true) && (state == false)) {
            for (i=0; i <= bulbList.size(); i++) {
                Bulb bulbCurrent = bulbList.get(i);
                Bulb bulbPrior   = preEmergencyBulbList.get(i);
                bulbCurrent = bulbPrior;
            }
        }
    } 
>>>>>>> 0d50d98844ba2d83789e823233da51ad8db9848a

}
