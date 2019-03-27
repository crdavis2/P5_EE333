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
    private int    brightness;
    private Color color;
    
    
    public Bulb(boolean state) {
        this.state = state;
        brightness = 100;
        color = Color.WHITE;
    }
    
    public void setState(boolean state) {
        this.state = state;
    }
    
    public boolean getState() {
        return state;
    }
    
    public void setBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = 0;
        } else if (brightness > 100) {
            this.brightness = 100;
        } else {
            this.brightness = brightness;
        }
    }
    
    public int getBrightness() {
        return brightness;
    }
    
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
    
    public String getColor() {
        Color c = color;
        return c.toString();
    }

}
