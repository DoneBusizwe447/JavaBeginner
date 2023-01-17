/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro2javaprogram;

/**
 *
 * @author magni
 */
public class TestTV {
    public static void main(String[] args) {
      TV tv1 = new TV();
      tv1.turnOn();
      tv1.setChannel(30);
      tv1.setVolume(3);
      
      TV tv2 = new TV();
      tv2.turnOn();
      tv2.channelUp();
      tv2.volumeUp();
      
        System.out.println("TV1 's channel is " + tv1.channel
                + "and the volume level is " +tv1.volumeLevel
        );
      
         System.out.println("TV2 's channel is " + tv2.channel
                + "and the volume level is " +tv1.volumeLevel
        );
    }
    
}
