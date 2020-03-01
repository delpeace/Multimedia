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
    private char frequencyType;
    
    public double getFmFrequency() {
        return this.fmFrequency;
    }
    
    public int getAmFrequency() {
        return this.amFrequency;
    }
    
    public char getFrequencyType() {
        return this.frequencyType;
    }
    
    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }
    
    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }
    
    public void setFrequencyType(char frequencyType) {
        this.frequencyType = frequencyType;
    }
    
}
