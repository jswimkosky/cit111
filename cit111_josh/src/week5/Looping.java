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
public class Looping {
    public static void main(String []args){
        Scanner inputScanner = new Scanner(System.in);
        int rowCount;
        int rowPosition = 0;
        int heightCount;
        int heightPosition = 0;
        String symbol = "|";
        
        System.out.println("How long should the lines of text be?");
        rowCount = inputScanner.nextInt();
        if(rowCount < 0){
            System.out.println("Negative number; error.");
            System.out.println("How long should the lines of text be?");
        rowCount = inputScanner.nextInt();
        } // close if
        
        System.out.println("How many rows of text should I print?");
        heightCount = inputScanner.nextInt();
        if(heightCount < 0){
            System.out.println("Negative number; error.");
            System.out.println("How many rows of text should I print?");
        heightCount = inputScanner.nextInt();
        } // close if
        
        
        while(heightPosition < heightCount){
            while (rowPosition < rowCount){
                System.out.print(symbol);
                rowPosition = rowPosition + 1;
            } // closes inside while
            System.out.println(symbol);
            heightPosition = heightPosition +1;
            
            rowPosition = 0;
            rowCount = rowCount - 1;
        } // closes while
        
        
        
    } // closes main
    
} // closes class
