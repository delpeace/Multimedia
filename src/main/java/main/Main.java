
package main;
import media.Radio;
import media.Television;

/**
 *
 * @author joker
 */
public class Main {
    
    public static void main(String[] args) {
        
        Television Samsung = new Television();
        
        Samsung.setTurnOn(true);
        Samsung.setVolume(13);
        Samsung.setCurrentProgram(6);
        
        
        Samsung.info();
        
        Radio radio = new Radio();
        
        radio.setFmFrequency(91.8);
        radio.setAmFrequency(102);
        radio.setBand('A');
        
        radio.info();
        
        
    }
    
}
