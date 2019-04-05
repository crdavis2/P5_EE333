/*
 * File: Group.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 04/04/2019 CRD - initial coding
 *
 */


/**
 * Class to define Group behavior for the smart light system
 * @author Collin Davis crdavis2@uab.edu
 */
public class Group {
    
    private String groupName;
    
    /**
     * Constructor for objects of class Group with name
     * 
     * @param name text for group name. If null, the group name will
     * be set to "New group"
     *
     */
    public Group (String name) {
        if (name == null) {
            groupName = "New group";
        } else {
            groupName = name;
        }
    }
    
    

}
