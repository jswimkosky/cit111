/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Scanner;

/**
 *
 * @author joshua.swimkosky
 */
public class Donut {

    public String flavor;
    public int calories;
    public double radius;
    public int perRemaining;

    /**
     * Simulates eating of donut subtracting given bite size
     * @param biteSizePer
     * @return 
     */
    
    public int eatDonut(int biteSizePer) {
        perRemaining = biteSizePer - perRemaining;
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("What percent of donut was eaten?");
        // biteSizePer = scanner.nextInt();
        return perRemaining;
    } // close eatDonut

    public void displayDonutStatus() {
        System.out.println("**************DONUT STATS**************");
        System.out.println("Percent Remaining: " + this.perRemaining);
        System.out.println("Flavor: " + this.flavor);
        System.out.println("Calories: " + this.calories);
    } // close display donut status
    

} // close class
