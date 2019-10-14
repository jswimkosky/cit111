/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagecore;
import java.util.Scanner;
       
/**
 *
 * @author joshua.swimkosky
 */
public class GasCalculator {
    public static void main(String[] args){
        double mpg = 28;
        double milesToStation;
        double milesLeft;
        double gas;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("How much gas do you have remaining? ");
        gas = scanner.nextInt();
        milesLeft = gas * mpg;
        
        Scanner scanner2 = new Scanner (System.in);
        System.out.println("How many more miles to the station? ");
        milesToStation = scanner2.nextInt();
        
        System.out.println("You have " + milesLeft + "miles of gas left.");
        if(milesLeft < milesToStation){
            System.out.println("You will not make it to the station. ");
           
        } // closes if not enough gas
        if(milesLeft >= milesToStation){
            System.out.println("You will be able to make it to the station. ");
        } // closes if enough gas
        
    } // closes main
    
} // closes class
