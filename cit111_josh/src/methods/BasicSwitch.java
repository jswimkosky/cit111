/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author joshua.swimkosky
 */
public class BasicSwitch {
    public static void main(String[] args) {
        int SELECTOR = 27;
        
        if (SELECTOR == 1){
                System.out.println("First case selected");
        } // close if 1
        
        else if (SELECTOR == 2){
                System.out.println("Second case selected");
        }  // close if 2
        else if (SELECTOR == 27){
                System.out.println("Cases can match any int value");
            } // close if 27
                
        else{
                System.out.println("Default case");
                    } // close final else
    } // close main        
} // close class
