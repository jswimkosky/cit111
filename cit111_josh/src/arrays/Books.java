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
public class Books {
    public static void main(String[] args){
        String book1 = "Perl Cookbook";
        String book2 = "PHP Cookbook";
        String book3 = "Python in a nutshell";
        String book4 = "Javascript";
        String book5 = "Java in a nutshell";
        
        // array --->
        String[] books = new String[5];
        books [0] = "Perl Cookbook";
        books [1] = "PHP Cookbook";
        books [2] = "Python in a nutshell";
        books [3] = "Javascript";
        books [4] = "Java in a nutshell";
        
       // loopPrintArrayContents(books);
        forLoopPrintArrayContents(books);
        
        
        
        
        
    } //a close main
    public static void printArrayContents(String[]arr){
    
        System.out.println("Value of book 1: " + arr[0]);
        System.out.println("Value of book 2: " + arr[1]);
        System.out.println("Value of book 3: " + arr[2]);
        System.out.println("Value of book 4: " + arr[3]);
        System.out.println("Value of book 5: " + arr[4]);
        
        
        
        
        
        
        
        
    } // close printAC
    public static void loopPrintArrayContents(String[] arr){
        int arraySize = arr.length;
        System.out.println("Array size passed in:" + arraySize);
        int counter = 0;
        while(counter < arraySize){
            System.out.println("value of array index " + counter + " is " + arr[counter]);
            counter = counter + 1;
        } // close while
         
    } // close loop
    
    
    public static void forLoopPrintArrayContents(String[] arr){
        for(int counter = 0; counter < arr.length; counter++){
            System.out.println("value of array index " + counter + " is " + arr[counter]);
            
        } // close for loop
        
        
    } // close method
    
    
    
    
    
} // close class
