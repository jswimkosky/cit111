/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingpractice;

/**
 * demo of while loop
 * @author joshua.swimkosky
 */
public class SimpleLoop {
    public static void main(String[] whateverNameWeWant){
        int count = 0;
        int numLoops = 300000;
        long startTime = System.currentTimeMillis();
        long endTime;
        long timerunning = 0;
        System.out.println("Start looping at:" + startTime);
         
        // as long as count < numLoops execute block
        while(count < numLoops){
            System.out.println("Val of count:" + count);
            count = count + 1;
        } // close while
        endTime = System.currentTimeMillis();
        System.out.println("Stopped looping at " + endTime);
        // compute endtime - startTime and display
        timerunning = endTime - startTime;
        long seconds = timerunning / 1000;
        long milliseconds = timerunning % 1000;
        long minutes = timerunning / 60;
        long hours = timerunning / 60;
        System.out.println("Time running in seconds: " + seconds + "." + milliseconds);
        
        
        
        
        
        
        
    } // close main
    
} // close class
