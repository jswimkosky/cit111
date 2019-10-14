/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagecore;

import java.util.Random;

/**
 *
 * @author joshua.swimkosky
 */
public class QualityControl {
    final static int QUALITY_THRESHOLD = 65;
    final static int MAX_QUALITY = 100;
    final static int UNITS_TO_MAKE = 10000;
    
    static int unitQuality = 0;
    static int totalFailures = 0;
    static int totalUnitsMade = 0;
    
    public static void main (String[] args) {
        //make a random number generator
        Random randomGenerator = new Random ();
        while (totalUnitsMade < UNITS_TO_MAKE) {
            
            //generate a random number between 0 and 100
            unitQuality = randomGenerator .nextInt(MAX_QUALITY + 1) ;
            System.out.println("Unit Quality: " + unitQuality);
            // increment our total unit counter
            totalUnitsMade = totalUnitsMade + 1;
            
            if(unitQuality < QUALITY_THRESHOLD) {
                System.out.println ("Unity below quality standards!");
                totalFailures = totalFailures + 1;
            } else {
                System.out.println("Unit passes quality test");
            } // close if/else
            
            System.out.println("Total failures: " + totalFailures +
                    " out of " + totalUnitsMade + " units made");
            
        } // closes while
        
        // calculate summary statistics with division
        double productionRatio = (double) totalFailures /
                (double)totalUnitsMade;
        //print out summary statistics with division
        System.out.println("***PRODUCTION SUMMARY***");
        System.out.println("Tested " + totalUnitsMade + " Units.");
        System.out.println("Failure Ratio: " + productionRatio);
        
    } // closes main
} // close class
        
              
            
        
    

    

