/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro2javaprogram;

/**
 *
 * @author magni
 */
public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    
    public TV(){}
    
    public void turnOn(){on = true;}
    
    public void turnOff() {on = false;}
    
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }
    
    public void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel >= 1 && newVolumeLevel <=7)
            volumeLevel = newVolumeLevel;
    }
    
    public void channelUp(){
        if(on &&  channel < 120)
            channel++;
    }
    
     public void channeldown(){
        if(on &&  channel < 1)
            channel++;
    }
     
      public void volumeUp(){
        if(on &&  channel < 7)
            channel++;
    }
      
       public void volumeDown(){
        if(on &&  channel < 1)
            channel++;
    }
    
    
    
    
    
}
