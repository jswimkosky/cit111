/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials;

/**
 *
 * @author joshua.swimkosky
 */
public class Sandbox {
     public static void main(String[] args){
         int rhinos = 0;
         int snakes = 4;
         while(rhinos <= snakes){
             System.out.println("Rhino: " + rhinos);
             rhinos = rhinos +1;
         } // closes while
         System.out.println("Rhinos: " + rhinos);
         System.out.println("snakes: " + snakes);
         if(rhinos == snakes){
             System.out.println("Equal!");
             
         } // closes if
         
     } // closes main

} // closes class
