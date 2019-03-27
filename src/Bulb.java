/*
 * File: Bulb.java
 * Author: Collin Davis crdavis2@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/20/2019 CRD - initial coding
 *
 */



/**
 *
 * @author Collin Davis crdavis2@uab.edu
 */
public class Bulb {
    
    enum Color {
        WHITE, RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
    }
    
    private boolean state;
    private int     brightness;
    private Color   color;
    private String  id;
    private int     bulbCount = 1;
    
    /**
     * Constructor for objects of class Bulb
     */
    public Bulb() {
        state = true;
        brightness = 100;
        color = Color.WHITE;
        id = "Bulb-" + bulbCount;
        bulbCount++;
    }
    
    /**
    * Set (change) the state of the bulb
    * 
    * @param state on" or "off" value of bulb (true is on, false is off)
    */
    public void setState(boolean state) {
        this.state = state;
    }
    
    
    /**
    * Get state (bulb on or off, true of false respectively)
    * 
    * @return state text of state value
    */
    public boolean getState() {
        return state;
    }
    
    /**
    * Set (change) the brightness of the bulb. Bounding between 0 
    * and 100 enforced so that, as examples, -1 would be saved as 0 and 220 
    * would be saved as 100.
    * 
    * @param brightness new brightness value 0-100 with 100 the brightest
    */
    public void setBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = 0;
        } else if (brightness > 100) {
            this.brightness = 100;
        } else {
            this.brightness = brightness;
        }
    }
    
    /**
    * Get brightness of bulb
    * 
    * @return brightness text of brightness value
    */
    public int getBrightness() {
        return brightness;
    }
    
    /**
    * Set (change) the color of the bulb. Color enum is used for
    * easy storage of the color name.
    * 
    * @param color new color to be set
    */
    public void setColor(String color) {
        String testStr = color.toUpperCase();
        
        switch (testStr) {
            case "WHITE":
                this.color = Color.WHITE;
                break;
            case "RED":
                this.color = Color.RED;
                break;
            case "ORANGE":
                this.color = Color.ORANGE;
                break;
            case "YELLOW":
                this.color = Color.YELLOW;
                break;
            case "GREEN":
                this.color = Color.GREEN;
                break;
            case "BLUE":
                this.color = Color.BLUE;
                break;
            case "INDIGO":
                this.color = Color.INDIGO;
                break;
            case "VIOLET":
                this.color = Color.VIOLET;
                break;
        // ERROR handling should go in a different class (hub probably)
            default:
                break;
        }
    }
    
    /**
    * Get color of the bulb
    * 
    * @return returnString text of color
    */
    public String getColor() {
        Color c = color;
        String returnString = c.toString();
        
        return returnString;
    }

}
