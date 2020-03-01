/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author joker
 */
public class Radio {
    private double fmFrequency;
    private int amFrequency;
    private char band;
    
    public double getFmFrequency() {
        return this.fmFrequency;
    }
    
    public int getAmFrequency() {
        return this.amFrequency;
    }
    
    public char getBandIs() {
        return this.band;
    }
    
    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }
    
    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }
    
    public void setBand(char band) {
        this.band = band;
    }
    
    public void info() {
        System.out.println("FM frekvencija: " + this.fmFrequency);
        System.out.println("AM frekvencija: " + this.amFrequency);
        System.out.println("Trenutni talas: " + this.band);
    }
    
    
    
}
