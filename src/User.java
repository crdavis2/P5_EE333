/*
 * File: User.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/26/2019 CRD - initial creation
 *
 */


/**
 *
 * @author Collin Davis crdavis2@uab.edu
 */
public class User {
    public static void main(String[] args) {
        // Add controller and sample bulbs
        Controller controller = new Controller("controller-1");
        controller.addBulb("bulb-1");
        controller.addBulb("bulb-2");
        controller.addBulb("bulb-3");
        controller.addBulb("bulb-4");

        Bulb bulb1 = controller.getBulb(0);
        Bulb bulb2 = controller.getBulb(1);
        Bulb bulb3 = controller.getBulb(2);
        Bulb bulb4 = controller.getBulb(3);

        System.out.println("Success if int of bulb name and id are same:");


        for (Bulb b : controller.getHub().getBulbList()) {
            System.out.println(b.getBulbName());
            System.out.println(b.getBulbID());
            System.out.println();

        }
                
        // State Test
        controller.setBulbState("bulb-1", false);
        System.out.print("bulb-1 state is: ");
        System.out.println(bulb1.getState());
        System.out.println();
        
        // Color Test
        controller.setBulbColor("bulb-1", "blue");
        controller.setBulbColor("bulb-2", "green");
        System.out.print("Color of bulb-1 is ");
        System.out.println(bulb1.getColor());
        System.out.print("Color of bulb-2 is ");
        System.out.println(bulb2.getColor());
        System.out.println();
        
        // Brightness Test
        controller.setBulbBrightness("bulb-1", 92);
        controller.setBulbBrightness("bulb-2", 10);
        System.out.print("Brightness of bulb-1 is ");
        System.out.println(bulb1.getBrightness());
        System.out.print("Brightness of bulb-2 is ");
        System.out.println(bulb2.getBrightness());
        System.out.println();
        
        // Group Test
        controller.addGroup("TestGroup-1");
        controller.addBulbToGroup("bulb-3", "TestGroup-1");
        controller.addBulbToGroup("bulb-4", "TestGroup-1");
        controller.setGroupColor("TestGroup-1", "yellow");
        System.out.println("bulb-3 and bulb-4 added to group.");
        System.out.println("Group color is set to yellow.");
        System.out.print("Color of bulb-3 is ");
        System.out.println(bulb3.getColor());
        System.out.print("Color of bulb-4 is ");
        System.out.println(bulb4.getColor());
    }
}
