/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
/**
 *
 * @author joshua.swimkosky
 */
public class WhileWithScanner {
    public static void main (String [] args){
        int numLoops = 0;
        int loopControl;
        // build scanner object
        Scanner scanner = new Scanner(System.in);
        // prompt user to get an int from them
        System.out.println("How many loops shall I print?");
        loopControl = scanner.nextInt();
        // loop as long as numLoops is less than or equal to loopControl
        while (numLoops <= loopControl){
            System.out.println("The value of numLoops: " + numLoops);
            // add one to numLoops is less than or equal to loopControl
            // loop the number of times use imputed
            numLoops = numLoops + 1;
            
        } // close while
        
        System.out.println("...After the while loop");
        
                                                                                                                                                                                                                                                  
        
    } // closes main
    
} // close class
