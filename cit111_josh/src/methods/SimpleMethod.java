/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author joshua.swimkosky
 */
public class SimpleMethod {
    public static void printStatement(){
        System.out.println("****INSIDE printStatement*****");
        System.out.println("Statement: Where There's a Will, There's a Way");
        System.out.println("********************");
        
    } // close printStatement method
    public static void main(String[] args){
        System.out.println("This code is inside method: main");
        // call the method printStatement, transferring execution to that block
        printStatement();
        generateBigNumber();
        System.out.println("after calls"); 
    } // closes main method
    
    public static void generateBigNumber(){
        
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100, r);
        System.out.println("In method 'generateBigNumber' ");
        System.out.println(bigInt);
        
    } // close generateBigNumber
    
} // closes class
