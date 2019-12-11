/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author joshua.swimkosky
 */
public class IntArray {
    public static void main(String[] args){
        
        int[] writingInstruments = new int[5];
        writingInstruments[0] = 17;
        writingInstruments[1] = 22;
        writingInstruments[2] = 5;
        writingInstruments[3] = 24;
        writingInstruments[4] = 14;
        
        printArrayContents(writingInstruments);
    } // closes main
    
    public static void printArrayContents(int[] arr){
        for(int counter = 0; counter < arr.length; counter++){
            System.out.println("value of writing instruments " + counter + " is " + arr[counter]);
        } // close for
        
    } // closes print
    
    public static void addArrayContents(int[] arr){
        
    
    
    
    } // close add
    
    
    
    
}
